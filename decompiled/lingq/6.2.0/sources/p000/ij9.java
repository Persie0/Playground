package p000;

import com.lingq.core.achievements.StreakChallengeType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ij9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44195a;

    static {
        int[] iArr = new int[StreakChallengeType.values().length];
        try {
            iArr[StreakChallengeType.Day3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StreakChallengeType.Day7.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StreakChallengeType.Day14.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StreakChallengeType.Day30.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f44195a = iArr;
    }
}
