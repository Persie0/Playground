package com.lingq.core.domain.model.milestones;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum BadgeType {
    KNOWN_WORDS("known_words"),
    LEVEL("level"),
    STREAK_DAYS("streak_days");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String slug;

    BadgeType(String str) {
        this.slug = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getSlug() {
        return this.slug;
    }
}
