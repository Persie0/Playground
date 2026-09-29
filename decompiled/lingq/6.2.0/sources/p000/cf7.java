package p000;

import com.lingq.core.player.data.PlayerType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class cf7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f10004a;

    static {
        int[] iArr = new int[PlayerType.values().length];
        try {
            iArr[PlayerType.Audio.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f10004a = iArr;
    }
}
