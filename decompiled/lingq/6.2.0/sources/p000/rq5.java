package p000;

import androidx.security.crypto.MasterKey$KeyScheme;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class rq5 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59719a;

    static {
        int[] iArr = new int[MasterKey$KeyScheme.values().length];
        f59719a = iArr;
        try {
            iArr[MasterKey$KeyScheme.AES256_GCM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
