package com.lingq.core.network.api.result;

import p000.ey8;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatDataUsage {
    public static final C1673j0 Companion = new C1673j0();

    /* JADX INFO: renamed from: a */
    public final boolean f20705a;

    public /* synthetic */ ResultChatDataUsage(int i, boolean z) {
        if ((i & 1) == 0) {
            this.f20705a = true;
        } else {
            this.f20705a = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8337a() {
        return this.f20705a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultChatDataUsage) && this.f20705a == ((ResultChatDataUsage) obj).f20705a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20705a);
    }

    public final String toString() {
        return hn1.m13355e("ResultChatDataUsage(improvementOptIn=", ")", this.f20705a);
    }
}
