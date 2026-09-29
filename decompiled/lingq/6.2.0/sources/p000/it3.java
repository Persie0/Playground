package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class it3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44529a;

    static {
        int[] iArr = new int[AudioUnderlineMode.values().length];
        try {
            iArr[AudioUnderlineMode.Wave.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioUnderlineMode.Static.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudioUnderlineMode.Off.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f44529a = iArr;
    }
}
