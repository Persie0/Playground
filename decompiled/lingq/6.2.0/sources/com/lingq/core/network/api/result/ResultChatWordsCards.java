package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatWordsCards {
    public static final C1778x0 Companion = new C1778x0();

    /* JADX INFO: renamed from: a */
    public final ResultCardsChat f20777a;

    /* JADX INFO: renamed from: b */
    public final ResultWords f20778b;

    public /* synthetic */ ResultChatWordsCards(int i, ResultCardsChat resultCardsChat, ResultWords resultWords) {
        if ((i & 1) == 0) {
            this.f20777a = null;
        } else {
            this.f20777a = resultCardsChat;
        }
        if ((i & 2) == 0) {
            this.f20778b = null;
        } else {
            this.f20778b = resultWords;
        }
    }

    /* JADX INFO: renamed from: a */
    public final ResultCardsChat m8353a() {
        return this.f20777a;
    }

    /* JADX INFO: renamed from: b */
    public final ResultWords m8354b() {
        return this.f20778b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatWordsCards)) {
            return false;
        }
        ResultChatWordsCards resultChatWordsCards = (ResultChatWordsCards) obj;
        return fa4.m11650l(this.f20777a, resultChatWordsCards.f20777a) && fa4.m11650l(this.f20778b, resultChatWordsCards.f20778b);
    }

    public final int hashCode() {
        ResultCardsChat resultCardsChat = this.f20777a;
        int iHashCode = (resultCardsChat == null ? 0 : resultCardsChat.f20657a.hashCode()) * 31;
        ResultWords resultWords = this.f20778b;
        return iHashCode + (resultWords != null ? resultWords.f21735a.hashCode() : 0);
    }

    public final String toString() {
        return "ResultChatWordsCards(cardsList=" + this.f20777a + ", listWords=" + this.f20778b + ")";
    }
}
