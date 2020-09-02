public class Magic8 {

    static String[] answers = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes - definitely.",
            "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
            "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
            "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.",
            "Outlook not so good.", "Very doubtful."};


    /* randomNumber method : picks a Random number between 0 and 20
    * parameter: no parameter
    * return: random number between 0 and 20.
    */
    public static int randomNumber() {
        return (int)(Math.random() * 20 + 1);
    }

    /* type method : takes the random number and print if the answer is Positive, Negative or Non-Committal.
    * parameter: no parameter.
    * return: the type of the answer.
    */
    public static String typeAndAnswer() {
        int i = randomNumber();
        String msg = "Error";

        if(i >= 15) {
            msg = "This is Negative";
        } else if (i >= 10) {
            msg = "This is Non-Committal";
        } else{
            msg = "This is Positive";
        }

        System.out.println(answers[i]);
        return msg;
    }

    public static void main(String[] args) {

        System.out.println(typeAndAnswer());

    }
}
