package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatBotMessage {
    public static final C1649f0 Companion = new C1649f0();

    /* JADX INFO: renamed from: a */
    public final ResultChatBotLabel f20699a;

    /* JADX INFO: renamed from: b */
    public final ResultChatBotLabel f20700b;

    /* JADX INFO: renamed from: c */
    public final ResultChatBotLabel f20701c;

    public /* synthetic */ ResultChatBotMessage(int i, ResultChatBotLabel resultChatBotLabel, ResultChatBotLabel resultChatBotLabel2, ResultChatBotLabel resultChatBotLabel3) {
        this.f20699a = (i & 1) == 0 ? new ResultChatBotLabel() : resultChatBotLabel;
        if ((i & 2) == 0) {
            this.f20700b = new ResultChatBotLabel();
        } else {
            this.f20700b = resultChatBotLabel2;
        }
        if ((i & 4) == 0) {
            this.f20701c = new ResultChatBotLabel();
        } else {
            this.f20701c = resultChatBotLabel3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatBotMessage)) {
            return false;
        }
        ResultChatBotMessage resultChatBotMessage = (ResultChatBotMessage) obj;
        return fa4.m11650l(this.f20699a, resultChatBotMessage.f20699a) && fa4.m11650l(this.f20700b, resultChatBotMessage.f20700b) && fa4.m11650l(this.f20701c, resultChatBotMessage.f20701c);
    }

    public final int hashCode() {
        return this.f20701c.f20698a.hashCode() + ux5.m22980c(this.f20699a.f20698a.hashCode() * 31, this.f20700b.f20698a, 31);
    }

    public final String toString() {
        return "ResultChatBotMessage(translation=" + this.f20699a + ", suggestedTerms=" + this.f20700b + ", correction=" + this.f20701c + ")";
    }

    public ResultChatBotMessage() {
        ResultChatBotLabel resultChatBotLabel = new ResultChatBotLabel();
        ResultChatBotLabel resultChatBotLabel2 = new ResultChatBotLabel();
        ResultChatBotLabel resultChatBotLabel3 = new ResultChatBotLabel();
        this.f20699a = resultChatBotLabel;
        this.f20700b = resultChatBotLabel2;
        this.f20701c = resultChatBotLabel3;
    }
}
