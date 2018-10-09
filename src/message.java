public class message {
    private String recipient;
    private String sender;
    private String text;

    public message(String recipient, String sender, String text)
    {
        setRecipient(recipient);
        setSender(sender);
        setText(text);
    }

    private void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    private void setSender(String sender)
    {
        this.sender = sender;
    }

    private void setText(String text)
    {
        this.text = text;
    }

    public String toString()
    {
        return "From: " + sender + "\nTo: " + recipient + "\n" + text;
    }
}
