import people.CreatingPersons;
import people.People;
import people.Students;
import people.Teachers;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.util.ArrayList;



    public class LibraryGui extends JFrame {
        private JTree tree;
        private DefaultMutableTreeNode rootNode;

        public LibraryGui() {
            setTitle("Library Viewer");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);

            rootNode = new DefaultMutableTreeNode("Library");
            tree = new JTree(rootNode);
            tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
            JScrollPane scrollPane = new JScrollPane(tree);
            getContentPane().add(scrollPane, BorderLayout.CENTER);

            createNodes();

            tree.addTreeSelectionListener(new TreeSelectionListener() {
                @Override
                public void valueChanged(TreeSelectionEvent e) {
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    if (node == null) return;
                    if (node.getUserObject() instanceof People) {
                        ArrayList<Book> books = ((People) node.getUserObject()).getBooks();
                        StringBuilder bookList = new StringBuilder("Books:\n");
                        for (Book book : books) {
                            bookList.append(book.getFullBookTitle()).append("\n");
                        }
                        JOptionPane.showMessageDialog(LibraryGui.this, bookList.toString(), "Books Borrowed", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            });

            setVisible(true);
        }

        private void createNodes() {
            DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Students");
            DefaultMutableTreeNode teachersNode = new DefaultMutableTreeNode("Teachers");
            rootNode.add(studentsNode);
            rootNode.add(teachersNode);

            ArrayList<Students> students = CreatingPersons.generateStudents(5);
            for (Students student : students) {
                DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode(student);
                studentsNode.add(studentNode);
            }

            ArrayList<Teachers> teachers = CreatingPersons.generateTeachers(6);
            for (Teachers teacher : teachers) {
                DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode(teacher);
                teachersNode.add(teacherNode);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new LibraryGui();
                }
            });
        }

}
