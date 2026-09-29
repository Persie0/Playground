package p000;

import com.lingq.feature.lessoninfo.SharedByRole;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f45 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f38413a;

    static {
        int[] iArr = new int[SharedByRole.values().length];
        try {
            iArr[SharedByRole.Librarian.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedByRole.ChiefLibrarian.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharedByRole.Editor.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f38413a = iArr;
    }
}
