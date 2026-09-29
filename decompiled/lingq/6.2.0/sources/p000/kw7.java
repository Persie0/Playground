package p000;

import com.lingq.core.player.data.PlayerViewState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class kw7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48508a;

    static {
        int[] iArr = new int[PlayerViewState.values().length];
        try {
            iArr[PlayerViewState.Closed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerViewState.Opened.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f48508a = iArr;
    }
}
