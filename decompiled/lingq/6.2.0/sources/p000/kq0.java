package p000;

import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.challenges.LeaderboardMetric;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class kq0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48312a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f48313b;

    static {
        int[] iArr = new int[ChallengeType.values().length];
        try {
            iArr[ChallengeType.MonthlyLingqing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChallengeType.ThousandWords.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChallengeType.Hardcore90days.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChallengeType.Monthly90days.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChallengeType.BookChallenge.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f48312a = iArr;
        int[] iArr2 = new int[LeaderboardMetric.values().length];
        try {
            iArr2[LeaderboardMetric.Following.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[LeaderboardMetric.Country.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f48313b = iArr2;
    }
}
