package p000;

import com.lingq.core.p012ui.library.LessonContextMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f81 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38607a;

    static {
        int[] iArr = new int[LessonContextMenuItem.values().length];
        try {
            iArr[LessonContextMenuItem.OpenLesson.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonContextMenuItem.LessonInfo.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonContextMenuItem.ViewCourse.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LessonContextMenuItem.Like.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[LessonContextMenuItem.AddToPlaylist.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[LessonContextMenuItem.Archive.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[LessonContextMenuItem.Report.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[LessonContextMenuItem.UpdateIsTaken.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[LessonContextMenuItem.BlacklistSource.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[LessonContextMenuItem.Subscribe.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f38607a = iArr;
    }
}
