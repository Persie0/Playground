package com.lingq.core.p012ui.challenges;

import java.util.List;
import kotlin.enums.AbstractC3201a;
import p000.ms0;
import p000.ns0;
import p000.vz1;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ChallengeType {
    MonthlyLingqing("monthlyLingQing"),
    ThousandWords("thousandWords"),
    Hardcore90days("hardcore90days"),
    Monthly90days("monthly90Days"),
    BookChallenge("bookJourney"),
    StreakDays("streakDays"),
    Undefined("undefined");

    private final String value;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final ms0 Companion = new ms0();

    ChallengeType(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getMetric() {
        int i = ns0.f53178a[ordinal()];
        if (i == 1) {
            return "cardsCreated";
        }
        if (i == 2) {
            return "score";
        }
        if (i != 3) {
            return i != 4 ? "" : "readProgress";
        }
        return "earnedCoins";
    }

    public final List<LeaderboardMetric> getSorts() {
        return vz1.m23605K(LeaderboardMetric.AllMembers, LeaderboardMetric.Following, LeaderboardMetric.Country);
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean hasRank() {
        int i = ns0.f53178a[ordinal()];
        return (i == 5 || i == 6) ? false : true;
    }
}
