package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class mu6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51857a;

    static {
        int[] iArr = new int[NetworkErrorType.values().length];
        try {
            iArr[NetworkErrorType.NO_INTERNET_CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f51857a = iArr;
    }
}
