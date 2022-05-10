import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Cat(
        @JsonProperty("id") String id,
        @JsonProperty("text") String text,
        @JsonProperty("type") String type,
        @JsonProperty("user") String user,
        @JsonProperty("upvote") Integer upvotes
        ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getUser() {
        return user;
    }

    public void setUpvotes(Integer upvotes) {
        this.upvotes = upvotes;
    }
    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Cat {\n  id = '").append(id)
                .append("'\n  text = '").append(text)
                .append("'\n  type = '").append(type)
                .append("'\n  user = '").append(user)
                .append("'\n  upvotes = '").append(upvotes)
                .append("'\n}");
        return  result.toString();
    }
}
