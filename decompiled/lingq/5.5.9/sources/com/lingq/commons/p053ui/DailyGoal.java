package com.lingq.commons.p053ui;

import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m13365d2 = {"Lcom/lingq/commons/ui/DailyGoal;", "", "coins", "", "desc", "descExtra", "mins", "(Ljava/lang/String;IIIII)V", "getCoins", "()I", "getDesc", "getDescExtra", "getMins", "Casual", "Steady", "Intense", "Insane", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public enum DailyGoal {
    Casual(50, R.string.stats_streak_casual, R.string.onboarding_daily_goal_min_desc, 10),
    Steady(100, R.string.stats_streak_steady, R.string.onboarding_daily_goal_min_desc, 20),
    Intense(200, R.string.stats_streak_intense, R.string.onboarding_daily_goal_min_desc, 40),
    Insane(400, R.string.stats_streak_insane, R.string.onboarding_daily_goal_hour_desc, 60);

    private final int coins;
    private final int desc;
    private final int descExtra;
    private final int mins;

    DailyGoal(int i10, int i11, int i12, int i13) {
        this.coins = i10;
        this.desc = i11;
        this.descExtra = i12;
        this.mins = i13;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final int getDescExtra() {
        return this.descExtra;
    }

    public final int getMins() {
        return this.mins;
    }
}
