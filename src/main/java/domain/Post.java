package domain;

public class Post {
    private int id;
    private int ownerID;
    private String fromID;
    private String createdBy;
    private int date;
    private int replyOwnerID;
    private int replyPostID;
    private String communityName;
    private String text;
    private CopyrightInfo copyrightInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private CommentsInfo commentsInfo;
    private String postType;
    private String postSource;
    private int viewsCount;
    private int geo;
    private int signerID;
    private boolean canPin;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAd;
    private boolean isFavorite;
    private DonutInfo donutInfo;
    private int postponedID;
}
