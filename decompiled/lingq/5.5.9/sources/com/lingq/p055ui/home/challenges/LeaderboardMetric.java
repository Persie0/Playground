package com.lingq.p055ui.home.challenges;

import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m13365d2 = {"Lcom/lingq/ui/home/challenges/LeaderboardMetric;", "", "", "value", "I", "getValue", "()I", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "EarnedCoins", "KnownWords", "Lingqs", "ActivityIndex", "StreakDays", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public enum LeaderboardMetric {
    EarnedCoins(R.string.lesson_coins, "earned_coins"),
    KnownWords(R.string.stats_known_words, "known_words"),
    Lingqs(R.string.lingq_lingqs, "lingqs"),
    ActivityIndex(R.string.stats_activity_score, "activity_index"),
    StreakDays(R.string.stats_streak, "streak_days");

    private final String key;
    private final int value;

    LeaderboardMetric(int i10, String str) {
        this.value = i10;
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }
}
