package p000;

import com.lingq.core.domain.store.Web2WaveDeferredLoginStatus;

/* JADX INFO: renamed from: zt */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3845zt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f72115a;

    static {
        int[] iArr = new int[Web2WaveDeferredLoginStatus.values().length];
        try {
            iArr[Web2WaveDeferredLoginStatus.NOT_ATTEMPTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Web2WaveDeferredLoginStatus.IDENTIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Web2WaveDeferredLoginStatus.INVALID_PROPERTIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Web2WaveDeferredLoginStatus.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Web2WaveDeferredLoginStatus.NO_MATCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f72115a = iArr;
    }
}
