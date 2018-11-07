package jmeansjustice.hackday_final;

public class Users {
    private String mName;
    private String mSurname;
    private String mGender;
    private String mAge;
    private String mPhone;

    Users(){

    }

    Users(String mName, String mSurname, String mGender, String mAge, String mPhone) {
        this.mName = mName;
        this.mSurname = mSurname;
        this.mGender = mGender;
        this.mAge = mAge;
        this.mPhone = mPhone;
    }

    public String getmAge() {
        return mAge;
    }

    public String getmGender() {
        return mGender;
    }

    public String getmName() {
        return mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public String getmPhone() {
        return mPhone;
    }
}