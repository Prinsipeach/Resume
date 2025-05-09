package resumebuilder;

public class Resume {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String education;
    private String experience;
    private String skills;
    private String awards;
    private String references;

    public Resume(String name, String email, String phone, String address,
                  String education, String experience, String skills,
                  String awards, String references) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
        this.awards = awards;
        this.references = references;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getEducation() { return education; }
    public String getExperience() { return experience; }
    public String getSkills() { return skills; }
    public String getAwards() { return awards; }
    public String getReferences() { return references; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setEducation(String education) { this.education = education; }
    public void setExperience(String experience) { this.experience = experience; }
    public void setSkills(String skills) { this.skills = skills; }
    public void setAwards(String awards) { this.awards = awards; }
    public void setReferences(String references) { this.references = references; }

    // Format resume as a string
    public String toFormattedString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== RESUME =====\n\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Phone: ").append(phone).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Education:\n").append(education).append("\n");
        sb.append("Experience:\n").append(experience).append("\n");
        sb.append("Skills:\n").append(skills).append("\n");
        sb.append("Awards and Honors: ").append(awards).append("\n");
        sb.append("References: ").append(references).append("\n");
        return sb.toString();
    }
}