package p000;

import com.lingq.feature.playlist.MenuPlaylistItem;
import com.lingq.feature.playlist.PlaylistActionMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class re7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59162a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f59163b;

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
        f59162a = iArr;
        int[] iArr2 = new int[PlaylistActionMenuItem.values().length];
        try {
            iArr2[PlaylistActionMenuItem.DownloadAll.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PlaylistActionMenuItem.Archive.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PlaylistActionMenuItem.RemoveFiles.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PlaylistActionMenuItem.DisableDownloads.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f59163b = iArr2;
    }
}
