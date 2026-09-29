package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class o97 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f54084a;

    static {
        int[] iArr = new int[PlayerConstants$PlayerState.values().length];
        try {
            iArr[PlayerConstants$PlayerState.ENDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f54084a = iArr;
    }
}
