package p000;

import com.lingq.feature.lessoninfo.PlaylistButtonState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t25 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61765a;

    static {
        int[] iArr = new int[PlaylistButtonState.values().length];
        try {
            iArr[PlaylistButtonState.Add.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaylistButtonState.Remove.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f61765a = iArr;
    }
}
