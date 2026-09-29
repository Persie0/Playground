package com.lingq.core.domain.model.milestones;

import kotlin.enums.AbstractC3201a;
import p000.mx4;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LessonAchievementType {
    DailyGoal("daily_goal"),
    StreakMilestone("streak_milestone"),
    KnownWords("known_words"),
    Level("level");

    private final String key;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final mx4 Companion = new mx4();

    LessonAchievementType(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
