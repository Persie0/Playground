package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultLessonWordsCards {
    public static final C1687l2 Companion = new C1687l2();

    /* JADX INFO: renamed from: a */
    public final ResultCards f21211a;

    /* JADX INFO: renamed from: b */
    public final ResultWords f21212b;

    public /* synthetic */ ResultLessonWordsCards(int i, ResultCards resultCards, ResultWords resultWords) {
        if ((i & 1) == 0) {
            this.f21211a = null;
        } else {
            this.f21211a = resultCards;
        }
        if ((i & 2) == 0) {
            this.f21212b = null;
        } else {
            this.f21212b = resultWords;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonWordsCards)) {
            return false;
        }
        ResultLessonWordsCards resultLessonWordsCards = (ResultLessonWordsCards) obj;
        return fa4.m11650l(this.f21211a, resultLessonWordsCards.f21211a) && fa4.m11650l(this.f21212b, resultLessonWordsCards.f21212b);
    }

    public final int hashCode() {
        ResultCards resultCards = this.f21211a;
        int iHashCode = (resultCards == null ? 0 : resultCards.f20655a.hashCode()) * 31;
        ResultWords resultWords = this.f21212b;
        return iHashCode + (resultWords != null ? resultWords.f21735a.hashCode() : 0);
    }

    public final String toString() {
        return "ResultLessonWordsCards(cardsList=" + this.f21211a + ", wordsList=" + this.f21212b + ")";
    }
}
