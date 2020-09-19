package weekend6.pd.course;

//klasa sluzy do przechowywnia informacji na temat fiszki oraz dobrych i zlych odpwoiedzi
public class Word {
    private String pol;
    private String ang;
    private int good;
    private int bad;

    public Word(String pol, String ang) {
        this.pol = pol;
        this.ang = ang;
    }

    public double submit() {
        return 100.0 * good / (good + bad);
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getAng() {
        return ang;
    }

    public void setAng(String ang) {
        this.ang = ang;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }
}
