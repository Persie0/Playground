package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatMemory {
    public static final C1691m0 Companion = new C1691m0();

    /* JADX INFO: renamed from: a */
    public final boolean f20721a;

    /* JADX INFO: renamed from: b */
    public final String f20722b;

    public /* synthetic */ ResultChatMemory(String str, int i, boolean z) {
        this.f20721a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.f20722b = "";
        } else {
            this.f20722b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8344a() {
        return this.f20721a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatMemory)) {
            return false;
        }
        ResultChatMemory resultChatMemory = (ResultChatMemory) obj;
        return this.f20721a == resultChatMemory.f20721a && fa4.m11650l(this.f20722b, resultChatMemory.f20722b);
    }

    public final int hashCode() {
        return this.f20722b.hashCode() + (Boolean.hashCode(this.f20721a) * 31);
    }

    public final String toString() {
        return "ResultChatMemory(enabled=" + this.f20721a + ", text=" + this.f20722b + ")";
    }
}
