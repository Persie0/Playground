package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatConfig {
    public static final C1667i0 Companion = new C1667i0();

    /* JADX INFO: renamed from: a */
    public final String f20704a;

    public /* synthetic */ ResultChatConfig(int i, String str) {
        if ((i & 1) == 0) {
            this.f20704a = "";
        } else {
            this.f20704a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultChatConfig) && fa4.m11650l(this.f20704a, ((ResultChatConfig) obj).f20704a);
    }

    public final int hashCode() {
        return this.f20704a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("ResultChatConfig(mode=", this.f20704a, ")");
    }
}
