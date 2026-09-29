package p000;

import com.lingq.feature.playlist.MenuPlaylistItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class so1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61087a;

    static {
        int[] iArr = new int[MenuPlaylistItem.values().length];
        try {
            iArr[MenuPlaylistItem.RemovePlaylist.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MenuPlaylistItem.OpenLesson.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MenuPlaylistItem.OpenCourse.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MenuPlaylistItem.LessonInfo.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MenuPlaylistItem.Download.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f61087a = iArr;
    }
}
