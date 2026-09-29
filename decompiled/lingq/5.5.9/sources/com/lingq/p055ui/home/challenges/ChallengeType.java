package com.lingq.p055ui.home.challenges;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/ChallengeType;", "", "Lcom/lingq/ui/home/challenges/LeaderboardMetric;", "getDefaultFilter", "", "getSorts", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "MonthlyLingqing", "ThousandWords", "NinetyDays", "Hardcore90days", "Monthly90days", "StreakDays", "Undefined", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum ChallengeType {
    MonthlyLingqing("monthly_lingqing"),
    ThousandWords("thousand_words"),
    NinetyDays("ninety_days"),
    Hardcore90days("hardcore90days"),
    Monthly90days("monthly90days"),
    StreakDays("streak_days"),
    Undefined("undefined");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final String value;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeType$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeType$b */
    public /* synthetic */ class C3513b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23042a;

        static {
            int[] iArr = new int[ChallengeType.values().length];
            try {
                iArr[ChallengeType.ThousandWords.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChallengeType.MonthlyLingqing.ordinal()] = 2;
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
                iArr[ChallengeType.Undefined.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChallengeType.StreakDays.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChallengeType.NinetyDays.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23042a = iArr;
        }
    }

    ChallengeType(String str) {
        this.value = str;
    }

    public final LeaderboardMetric getDefaultFilter() {
        switch (C3513b.f23042a[ordinal()]) {
            case 1:
                return LeaderboardMetric.KnownWords;
            case 2:
                return LeaderboardMetric.Lingqs;
            case 3:
            case 4:
            case 5:
                return LeaderboardMetric.EarnedCoins;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return LeaderboardMetric.StreakDays;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return LeaderboardMetric.ActivityIndex;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final List<LeaderboardMetric> getSorts() {
        int i10 = C3513b.f23042a[ordinal()];
        if (i10 == 1) {
            return C9000b.m17251q(LeaderboardMetric.KnownWords);
        }
        if (i10 == 2) {
            return C9000b.m17251q(LeaderboardMetric.Lingqs);
        }
        if (i10 != 6) {
            return i10 != 7 ? C9000b.m17252r(LeaderboardMetric.EarnedCoins, LeaderboardMetric.KnownWords, LeaderboardMetric.Lingqs) : C9000b.m17252r(LeaderboardMetric.ActivityIndex, LeaderboardMetric.Lingqs, LeaderboardMetric.KnownWords);
        }
        return C9000b.m17251q(LeaderboardMetric.StreakDays);
    }

    public final String getValue() {
        return this.value;
    }
}
