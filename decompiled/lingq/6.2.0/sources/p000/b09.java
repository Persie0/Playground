package p000;

import com.lingq.core.domain.model.theme.LqTheme;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b09 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7734a;

    static {
        int[] iArr = new int[LqTheme.values().length];
        try {
            iArr[LqTheme.System.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LqTheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LqTheme.Light.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7734a = iArr;
    }
}
