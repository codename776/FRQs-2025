public class SignedText {
    private String firstName;
    private lastName;

    public SignedText(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        public String getSignature() {
            if(firstName.length == 0) {
                return lastName;

            }
            return firstName.charAt(0) + "-" + lastName;
        }
        public String addSignature(){
            String s = getSignature();
            String sLength = signature.length();
            String msLength = message.length();

            if (mLength >= sLength && message.substring(mLength - sLength).equals(signature)){
                return message + signature;
            }
        }
    }
}
