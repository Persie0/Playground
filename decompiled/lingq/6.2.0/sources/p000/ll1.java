package p000;

import com.lingq.core.domain.model.ContentType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ll1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f49793a;

    static {
        int[] iArr = new int[ContentType.values().length];
        try {
            iArr[ContentType.External.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentType.Native.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f49793a = iArr;
    }
}
