package p000;

import com.lingq.core.p012ui.challenges.ChallengeType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class os0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f54928a;

    static {
        int[] iArr = new int[ChallengeType.values().length];
        try {
            iArr[ChallengeType.Hardcore90days.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChallengeType.Monthly90days.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChallengeType.MonthlyLingqing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChallengeType.ThousandWords.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f54928a = iArr;
    }
}
