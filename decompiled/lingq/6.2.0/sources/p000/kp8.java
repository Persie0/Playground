package p000;

import com.lingq.core.p012ui.library.CourseContextMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class kp8 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48296a;

    static {
        int[] iArr = new int[CourseContextMenuItem.values().length];
        try {
            iArr[CourseContextMenuItem.ViewCourse.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CourseContextMenuItem.AddToPlaylist.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CourseContextMenuItem.Archive.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CourseContextMenuItem.Report.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CourseContextMenuItem.Like.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CourseContextMenuItem.Subscribe.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CourseContextMenuItem.BlacklistCourse.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f48296a = iArr;
    }
}
