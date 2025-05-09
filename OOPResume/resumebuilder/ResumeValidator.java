package resumebuilder;

public class ResumeValidator {
    public void validateName(String name) throws InvalidResumeException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidResumeException("Name cannot be empty");
        }
    }

    public void validateEmail(String email) throws InvalidResumeException {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidResumeException("Email cannot be empty");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new InvalidResumeException("Invalid email format");
        }
    }
}