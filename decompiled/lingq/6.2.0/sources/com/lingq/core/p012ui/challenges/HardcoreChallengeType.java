package com.lingq.core.p012ui.challenges;

import com.lingq.core.designsystem.R$attr;
import com.lingq.core.p012ui.R$string;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum HardcoreChallengeType {
    ReadWords("readWords", R$string.stats_reading_words, R$attr.greenTint),
    HoursListening("hoursListening", R$string.stats_listening_hours, R$attr.yellowTint),
    LingQsCreated("lingqsCreated", R$string.complete_lingqs_created, R$attr.blueStrongColor),
    LingQsLearned("lingqsLearned", R$string.stats_lingqs_learned, R$attr.redTint),
    KnownWords("knownWords", R$string.stats_known_words, R$attr.greenSelectedTint);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int color;
    private final int title;
    private final String value;

    HardcoreChallengeType(String str, int i, int i2) {
        this.value = str;
        this.title = i;
        this.color = i2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
