package p000;

import com.lingq.core.player.data.PlayerType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vb7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65167a;

    static {
        int[] iArr = new int[PlayerType.values().length];
        try {
            iArr[PlayerType.Audio.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerType.Video.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f65167a = iArr;
    }
}
