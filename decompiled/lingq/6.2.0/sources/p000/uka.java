package p000;

import com.lingq.feature.imports.data.UserImportSourceType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class uka {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64033a;

    static {
        int[] iArr = new int[UserImportSourceType.values().length];
        try {
            iArr[UserImportSourceType.URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserImportSourceType.Text.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserImportSourceType.File.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserImportSourceType.Scan.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f64033a = iArr;
    }
}
