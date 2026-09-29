package p000;

import com.lingq.core.analytics.embedded.PlacementImage;
import com.lingq.core.p012ui.library.CourseContextMenuItem;
import com.lingq.core.p012ui.library.LessonContextMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class db5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35356a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f35357b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f35358c;

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
        f35356a = iArr;
        int[] iArr2 = new int[CourseContextMenuItem.values().length];
        try {
            iArr2[CourseContextMenuItem.Like.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[CourseContextMenuItem.Subscribe.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[CourseContextMenuItem.AddToPlaylist.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[CourseContextMenuItem.Archive.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[CourseContextMenuItem.Report.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[CourseContextMenuItem.BlacklistCourse.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[CourseContextMenuItem.ViewCourse.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        f35357b = iArr2;
        int[] iArr3 = new int[PlacementImage.values().length];
        try {
            iArr3[PlacementImage.Top.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[PlacementImage.Right.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[PlacementImage.No.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[PlacementImage.Background.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        f35358c = iArr3;
    }
}
