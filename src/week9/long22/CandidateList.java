package week9.long22;

import week4.Short105.model.Person;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CandidateList extends ArrayList<Candidate> {
    Validation validation = new Validation();
    public CandidateList() {
        super();
    }

    public void addCandidate(int flag) {
        String candidateID = Validation.getString("Enter candidate id: ");
        String fName = Validation.getString("Enter first Name: ");
        String lName = Validation.getString("Enter last name: ");
        int birthD = Validation.getInt("Enter birtdate (Year): ");
        String address = Validation.getString("Enter address: ");
        String phone = null;
        while (phone == null){
            phone = validation.checkPhone(validation.getString("Enter phone number: "));
        }
        String email = null;
        while (email == null){
            email = validation.checkEmail(validation.getString("Enter email number: "));
        }
        if(flag == 1){
            int yearOfExp = validation.getInt("Enter year of exp: ");
            String pS = validation.getString("Enter proskill: ");
            this.add(new ExpCandidate(candidateID, fName, lName, birthD, address, phone, email, 0, yearOfExp, pS));
        }
        if (flag == 2){
            int graduateTime = validation.getInt("Enter graduate year: ");
            String rankOfG = validation.getString("Enter rank of graduation: ");
            String uni = validation.getString("Enter uni name: ");
            this.add(new Fresher(candidateID, fName, lName, birthD, address, phone, email, 1, uni, graduateTime, rankOfG));
        }
        if(flag == 3){
            String major = validation.getString("Enter major: ");
            int sem = validation.getInt("Enter sem: ");
            String uniName = validation.getString("Enter uniName: ");
            this.add(new Intern(candidateID, fName, lName, birthD, address, phone, email, 2, major, sem, uniName));
        }
    }

    private ArrayList<Candidate> search(Predicate<Candidate> predicate){
        ArrayList<Candidate> rs = new ArrayList<>();
        this.forEach(candidate -> {
            if (predicate.test(candidate)){
                rs.add(candidate);
            }
        });
        if (rs.isEmpty()){
            System.out.println("No candidate found");
        }
        return rs;
    }

    public void search(){
        ArrayList<Candidate> rs = null;
        System.out.println("Experience Candidate: ");
        rs = search(candidate -> candidate instanceof ExpCandidate);
        if(!rs.isEmpty()){
            rs.forEach(System.out::println);
        }
        System.out.println("Fresher Candidate: ");
        rs = search(candidate -> candidate instanceof Fresher);
        if(!rs.isEmpty()){
            rs.forEach(System.out::println);
        }
        System.out.println("Intern Candidate: ");
        rs = search(candidate -> candidate instanceof Intern);
        if(!rs.isEmpty()){
            rs.forEach(System.out::println);
        }
        String find = validation.getString("Enter last name or first name: ");
        rs = search(candidate -> candidate.getFirstName().contains(find) || candidate.getLastName().contains(find));

        if(!rs.isEmpty()){
            rs.forEach(System.out::println);
        }
    }

}

