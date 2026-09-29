package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatBotSuggestedPrompt {
    public static final C1661h0 Companion = new C1661h0();

    /* JADX INFO: renamed from: a */
    public final String f20703a;

    public /* synthetic */ ResultChatBotSuggestedPrompt(int i, String str) {
        if ((i & 1) == 0) {
            this.f20703a = "";
        } else {
            this.f20703a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultChatBotSuggestedPrompt) && fa4.m11650l(this.f20703a, ((ResultChatBotSuggestedPrompt) obj).f20703a);
    }

    public final int hashCode() {
        return this.f20703a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultChatBotSuggestedPrompt(lesson=", this.f20703a, ")");
    }

    public ResultChatBotSuggestedPrompt() {
        this.f20703a = "";
    }
}
