package p000;

import com.lingq.feature.imports.data.UserImportDetailType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class qla {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57917a;

    static {
        int[] iArr = new int[UserImportDetailType.values().length];
        try {
            iArr[UserImportDetailType.Level.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserImportDetailType.Course.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserImportDetailType.Languages.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserImportDetailType.Tags.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f57917a = iArr;
    }
}
