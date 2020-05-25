package libraryView;

import javax.swing.*;

public class LibraryInterface extends JFrame {
    private AddBookPanel abp;
    private JTabbedPane jtb;
    private BrowseLibraryPanel blp;
    private Chat chp;
    private String filler;

    public LibraryInterface(String title){
        super(title);//konstruktori i jframe
        jtb = new JTabbedPane();
        abp = new AddBookPanel();
        chp = new Chat();
        blp= new BrowseLibraryPanel();
        jtb.addTab("ADD BOOK",abp);
        jtb.addTab("BROWSE BOOKS",blp);
        jtb.addTab("CHAT",chp);

        add(jtb); //e shton tabin ne frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // e mbyll frame kur preket x
        setLocationRelativeTo(null); //it doesnt have a parent so we dont give values
        setSize(500,550);
        //pack(); //it makes everything fit
        setResizable(true);
    }
    public AddBookPanel getAddBookPanel(){
        return abp;

    }
    public BrowseLibraryPanel getBrowseLibraryPanel(){
        return blp;
    }
    public Chat getChat(){
        return chp;
    }
    public JTabbedPane getTabbedPane(){
        return jtb;
    }
}
