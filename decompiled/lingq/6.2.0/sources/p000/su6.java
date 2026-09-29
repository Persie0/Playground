package p000;

import com.lingq.feature.onboarding.p014v2.LevelBranch;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class su6 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61444a;

    static {
        int[] iArr = new int[LevelBranch.values().length];
        try {
            iArr[LevelBranch.Any.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LevelBranch.Beginner.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LevelBranch.Intermediate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LevelBranch.Advanced.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f61444a = iArr;
    }
}
