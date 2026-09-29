package com.lingq.core.p012ui.challenges;

import com.lingq.core.p012ui.R$string;
import kotlin.enums.AbstractC3201a;
import p000.ow4;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LeaderboardMetric {
    AllMembers(R$string.challenge_all_members, "all_members"),
    Following(R$string.challenge_following, "following"),
    Country(R$string.lingq_country, "country");

    private final String key;
    private final int value;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final ow4 Companion = new ow4();

    LeaderboardMetric(int i, String str) {
        this.value = i;
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getValue() {
        return this.value;
    }
}
