package com.lingq.core.network.api.result;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatBot {
    public static final C1636d0 Companion = new C1636d0();

    /* JADX INFO: renamed from: a */
    public final String f20691a;

    /* JADX INFO: renamed from: b */
    public final String f20692b;

    /* JADX INFO: renamed from: c */
    public final String f20693c;

    /* JADX INFO: renamed from: d */
    public final String f20694d;

    /* JADX INFO: renamed from: e */
    public final ResultChatBotMessage f20695e;

    /* JADX INFO: renamed from: f */
    public final ResultChatBotMessageInput f20696f;

    /* JADX INFO: renamed from: g */
    public final ResultChatBotSuggestedPrompt f20697g;

    public /* synthetic */ ResultChatBot(int i, String str, String str2, String str3, String str4, ResultChatBotMessage resultChatBotMessage, ResultChatBotMessageInput resultChatBotMessageInput, ResultChatBotSuggestedPrompt resultChatBotSuggestedPrompt) {
        if ((i & 1) == 0) {
            this.f20691a = "";
        } else {
            this.f20691a = str;
        }
        if ((i & 2) == 0) {
            this.f20692b = "";
        } else {
            this.f20692b = str2;
        }
        if ((i & 4) == 0) {
            this.f20693c = "";
        } else {
            this.f20693c = str3;
        }
        if ((i & 8) == 0) {
            this.f20694d = "";
        } else {
            this.f20694d = str4;
        }
        if ((i & 16) == 0) {
            this.f20695e = new ResultChatBotMessage();
        } else {
            this.f20695e = resultChatBotMessage;
        }
        if ((i & 32) == 0) {
            this.f20696f = new ResultChatBotMessageInput();
        } else {
            this.f20696f = resultChatBotMessageInput;
        }
        if ((i & 64) == 0) {
            this.f20697g = new ResultChatBotSuggestedPrompt();
        } else {
            this.f20697g = resultChatBotSuggestedPrompt;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatBot)) {
            return false;
        }
        ResultChatBot resultChatBot = (ResultChatBot) obj;
        return fa4.m11650l(this.f20691a, resultChatBot.f20691a) && fa4.m11650l(this.f20692b, resultChatBot.f20692b) && fa4.m11650l(this.f20693c, resultChatBot.f20693c) && fa4.m11650l(this.f20694d, resultChatBot.f20694d) && fa4.m11650l(this.f20695e, resultChatBot.f20695e) && fa4.m11650l(this.f20696f, resultChatBot.f20696f) && fa4.m11650l(this.f20697g, resultChatBot.f20697g);
    }

    public final int hashCode() {
        return this.f20697g.f20703a.hashCode() + ux5.m22980c((this.f20695e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f20691a.hashCode() * 31, this.f20692b, 31), this.f20693c, 31), this.f20694d, 31)) * 31, this.f20696f.f20702a, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultChatBot(id=", this.f20691a, ", name=", this.f20692b, ", greeting=");
        AbstractC3393o1.m17725C(sbM23000w, this.f20693c, ", language=", this.f20694d, ", message=");
        sbM23000w.append(this.f20695e);
        sbM23000w.append(", messageInput=");
        sbM23000w.append(this.f20696f);
        sbM23000w.append(", suggestedPrompt=");
        sbM23000w.append(this.f20697g);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
