package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gqa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41202a;

    static {
        int[] iArr = new int[PlayerConstants$PlayerState.values().length];
        try {
            iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f41202a = iArr;
    }
}
