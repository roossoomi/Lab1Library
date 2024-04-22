import people.People;
import people.Students;
import people.Teachers;
import bookPackage.Book;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

public class ArchiveGUI extends JFrame {
    private Archive archive;

    public ArchiveGUI() {
        archive = new Archive();
        setTitle("Список книг");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Университет");
        addCategories(rootNode, archive.getLibraryUsers());
        JTree tree = new JTree(rootNode);
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);

        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    private void addCategories(DefaultMutableTreeNode parent, ArrayList<People> libraryUsers) {
        DefaultMutableTreeNode professorsNode = new DefaultMutableTreeNode("Преподаватели");
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Студенты");
        parent.add(professorsNode);
        parent.add(studentsNode);


        for (People user : libraryUsers) {
            DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user.getFullName());
            if (user instanceof Students) {
                studentsNode.add(userNode);
            } else if (user instanceof Teachers) {
                professorsNode.add(userNode);
            }

            ArrayList<Book> userBooks = user.getUserListBook();
            for (Book book : userBooks) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(book.GetFullDiscription());
                userNode.add(bookNode);
            }
        }
    }
}