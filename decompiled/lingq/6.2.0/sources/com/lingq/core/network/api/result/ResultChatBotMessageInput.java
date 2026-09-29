package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatBotMessageInput {
    public static final C1655g0 Companion = new C1655g0();

    /* JADX INFO: renamed from: a */
    public final String f20702a;

    public /* synthetic */ ResultChatBotMessageInput(int i, String str) {
        if ((i & 1) == 0) {
            this.f20702a = "";
        } else {
            this.f20702a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultChatBotMessageInput) && fa4.m11650l(this.f20702a, ((ResultChatBotMessageInput) obj).f20702a);
    }

    public final int hashCode() {
        return this.f20702a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultChatBotMessageInput(placeholder=", this.f20702a, ")");
    }

    public ResultChatBotMessageInput() {
        this.f20702a = "";
    }
}
