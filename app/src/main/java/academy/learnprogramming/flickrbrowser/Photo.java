package academy.learnprogramming.flickrbrowser;

import java.io.Serializable;

class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mTitle;
    private String mAuthor;
    private String mAuthorId;
    private String mLink;
    private String mTags;
    private String mImage;

    public Photo (String title, String author, String authorId, String link, String tags, String image) {
        mTitle = title;
        mAuthor = author;
        mAuthorId = authorId;
        mLink = link;
        mTags = tags;
        mImage = image;
    }

    String getTitle() {
        return mTitle;
    }

    void setTitle(String title) {
        mTitle = title;
    }

    String getAuthor() {
        return mAuthor;
    }

    void setAuthor(String author) {
        mAuthor = author;
    }

    String getAuthorId() {
        return mAuthorId;
    }

    void setAuthorId(String authorId) {
        mAuthorId = authorId;
    }

    String getLink() {
        return mLink;
    }

    void setLink(String link) {
        mLink = link;
    }

    String getTags() {
        return mTags;
    }

    void setTags(String tags) {
        mTags = tags;
    }

    public String getImage() {
        return mImage;
    }

    void setImage(String image) {
        mImage = image;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mAuthorId='" + mAuthorId + '\'' +
                ", mLink='" + mLink + '\'' +
                ", mTags='" + mTags + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }


}
