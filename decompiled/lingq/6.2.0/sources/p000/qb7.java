package p000;

import com.lingq.core.player.data.PlayingSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class qb7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57546a;

    static {
        int[] iArr = new int[PlayingSource.values().length];
        try {
            iArr[PlayingSource.Reader.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayingSource.Playlist.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57546a = iArr;
    }
}
