package Put;

public class Health_C extends Health_Insurance {
    private int social;
    private String name;
    public String treatment;
    Health_C(){

    }

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public int getSocial() {
        return social;
    }

    @Override
    public void setSocial(int social) {
        this.social=social;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getTreatment() {
        return treatment;
    }

    @Override
    public void setTreatment(String treatment) {
        this.treatment=treatment;
    }
    
    public String Doc_Sig(){
        return "Dr. DonkeyKong + R.N. Princess Peach ----- Verified Signature of Doctor and Nurse";
    }
    
    public String bed_size(){
        return "Large";
    }
}





