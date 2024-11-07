interface IVersionControl{
     void commit();
     void push();
     void pull();
}
class GitVersionControl implements IVersionControl {

    @Override
    public void commit() {
        System.out.println("Committing GitVersionControl");
    }

    @Override
    public void push() {
        System.out.println("Pushing GitVersionControl");
    }

    @Override
    public void pull() {
        System.out.println("Pulling GitVersionControl");
    }
}

class DevelopmentTeam {
    IVersionControl versionControl;


    DevelopmentTeam(IVersionControl vc){
        this.versionControl = vc;
    }

    void makeCommit() {
        versionControl.commit();
    }

    void performPush() {
        versionControl.push();
    }

    void performPull() {
        versionControl.pull();
    }
};

public class DependencyInversion {
    public static void main(String[] args) {
        /*
        The Dependency Inversion Principle (DIP) is a principle in object-oriented design that states that
        “High-level modules should not depend on low-level modules. Both should depend on abstractions“.

        - In simpler terms, the DIP suggests that classes should rely on abstractions
        (e.g., interfaces or abstract classes) rather than concrete implementations.
        - This allows for more flexible and decoupled code, making it easier to change implementations without
        affecting other parts of the codebase.

        In a software development team, developers depend on an abstract version control system (e.g., Git)
        to manage and track changes to the codebase. They don’t depend on specific details of how Git works internally.

        In example -?
        Developer team does not depend on the git version implementation it is abstracted and not visible not needed
         */
        GitVersionControl gitVersionControl = new GitVersionControl();
        DevelopmentTeam developmentTeam = new DevelopmentTeam(gitVersionControl);
        developmentTeam.makeCommit();

    }
}
