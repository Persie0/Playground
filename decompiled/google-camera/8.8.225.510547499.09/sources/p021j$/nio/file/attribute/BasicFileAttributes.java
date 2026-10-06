package p021j$.nio.file.attribute;

/* JADX INFO: loaded from: classes3.dex */
public interface BasicFileAttributes {
    C0340E creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    C0340E lastAccessTime();

    C0340E lastModifiedTime();

    long size();
}
