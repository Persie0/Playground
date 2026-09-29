package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ResultChatSuggestion {
    public static final C1751w0 Companion = new C1751w0();

    /* JADX INFO: renamed from: a */
    public final String f20775a;

    /* JADX INFO: renamed from: b */
    public final String f20776b;

    public /* synthetic */ ResultChatSuggestion(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20775a = "";
        } else {
            this.f20775a = str;
        }
        if ((i & 2) == 0) {
            this.f20776b = "";
        } else {
            this.f20776b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatSuggestion)) {
            return false;
        }
        ResultChatSuggestion resultChatSuggestion = (ResultChatSuggestion) obj;
        return fa4.m11650l(this.f20775a, resultChatSuggestion.f20775a) && fa4.m11650l(this.f20776b, resultChatSuggestion.f20776b);
    }

    public final int hashCode() {
        return this.f20776b.hashCode() + (this.f20775a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ResultChatSuggestion(source=", this.f20775a, ", target=", this.f20776b, ")");
    }
}
