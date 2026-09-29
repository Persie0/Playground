package com.lingq.feature.vocabulary.data;

import com.lingq.core.domain.model.review.ReviewType;
import kotlin.enums.AbstractC3201a;
import p000.gm5;
import p000.txa;
import p000.uxa;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum VocabularyContentFilter {
    All,
    Phrases,
    SrsDue;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final txa Companion = new txa();

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final ReviewType toReviewType() {
        int i = uxa.f64493a[ordinal()];
        if (i == 1) {
            return ReviewType.VocabularyAll;
        }
        if (i == 2) {
            return ReviewType.VocabularyPhrases;
        }
        if (i == 3) {
            return ReviewType.VocabularySRS;
        }
        gm5.m12750e();
        return null;
    }
}
