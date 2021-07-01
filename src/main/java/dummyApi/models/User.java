package dummyApi.models;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class User implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("registerDate")
    @Expose
    private String registerDate;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;
    private final static long serialVersionUID = -5126659358418354738L;

    public User(String id, String phone, String lastName, String firstName, Location location, String email, String gender, String title, String registerDate, String picture, String dateOfBirth) {
        this.id = id;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
        this.location = location;
        this.email = email;
        this.gender = gender;
        this.title = title;
        this.registerDate = registerDate;
        this.picture = picture;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(Users.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("id");
//        sb.append('=');
//        sb.append(((this.id == null)?"<null>":this.id));
//        sb.append(',');
//        sb.append("phone");
//        sb.append('=');
//        sb.append(((this.phone == null)?"<null>":this.phone));
//        sb.append(',');
//        sb.append("lastName");
//        sb.append('=');
//        sb.append(((this.lastName == null)?"<null>":this.lastName));
//        sb.append(',');
//        sb.append("firstName");
//        sb.append('=');
//        sb.append(((this.firstName == null)?"<null>":this.firstName));
//        sb.append(',');
//        sb.append("location");
//        sb.append('=');
//        sb.append(((this.location == null)?"<null>":this.location));
//        sb.append(',');
//        sb.append("email");
//        sb.append('=');
//        sb.append(((this.email == null)?"<null>":this.email));
//        sb.append(',');
//        sb.append("gender");
//        sb.append('=');
//        sb.append(((this.gender == null)?"<null>":this.gender));
//        sb.append(',');
//        sb.append("title");
//        sb.append('=');
//        sb.append(((this.title == null)?"<null>":this.title));
//        sb.append(',');
//        sb.append("registerDate");
//        sb.append('=');
//        sb.append(((this.registerDate == null)?"<null>":this.registerDate));
//        sb.append(',');
//        sb.append("picture");
//        sb.append('=');
//        sb.append(((this.picture == null)?"<null>":this.picture));
//        sb.append(',');
//        sb.append("dateOfBirth");
//        sb.append('=');
//        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.lastName == null) ? 0 : this.lastName.hashCode()));
        result = ((result * 31) + ((this.firstName == null) ? 0 : this.firstName.hashCode()));
        result = ((result * 31) + ((this.gender == null) ? 0 : this.gender.hashCode()));
        result = ((result * 31) + ((this.phone == null) ? 0 : this.phone.hashCode()));
        result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
        result = ((result * 31) + ((this.dateOfBirth == null) ? 0 : this.dateOfBirth.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.title == null) ? 0 : this.title.hashCode()));
        result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
        result = ((result * 31) + ((this.picture == null) ? 0 : this.picture.hashCode()));
        result = ((result * 31) + ((this.registerDate == null) ? 0 : this.registerDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return ((((((((((((this.lastName == rhs.lastName) || ((this.lastName != null) && this.lastName.equals(rhs.lastName))) && ((this.firstName == rhs.firstName) || ((this.firstName != null) && this.firstName.equals(rhs.firstName)))) && ((this.gender == rhs.gender) || ((this.gender != null) && this.gender.equals(rhs.gender)))) && ((this.phone == rhs.phone) || ((this.phone != null) && this.phone.equals(rhs.phone)))) && ((this.location == rhs.location) || ((this.location != null) && this.location.equals(rhs.location)))) && ((this.dateOfBirth == rhs.dateOfBirth) || ((this.dateOfBirth != null) && this.dateOfBirth.equals(rhs.dateOfBirth)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.title == rhs.title) || ((this.title != null) && this.title.equals(rhs.title)))) && ((this.email == rhs.email) || ((this.email != null) && this.email.equals(rhs.email)))) && ((this.picture == rhs.picture) || ((this.picture != null) && this.picture.equals(rhs.picture)))) && ((this.registerDate == rhs.registerDate) || ((this.registerDate != null) && this.registerDate.equals(rhs.registerDate))));
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", title='" + title + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", picture='" + picture + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
