package week9.long22;

public class CandidateManagement {

    public static void main(String[] args) {
        CandidateList cL = new CandidateList();
        while (true){
            System.out.println("1. Experience \n2. Fresher \n3. Internship \n 3. Search \n 4. Exit");
            int choice = Validation.getInt("Enter your choice: ", 1, 4);
            switch (choice){
                case 1 -> cL.addCandidate(1);
                case 2 -> cL.addCandidate(2);
                case 3 -> cL.addCandidate(3);
                case 4 -> cL.search();
                case 5 -> System.exit(0);
            }
        }
    }
}
