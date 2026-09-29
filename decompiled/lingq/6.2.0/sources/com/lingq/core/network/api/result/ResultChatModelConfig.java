package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatModelConfig {
    public static final C1709p0 Companion = new C1709p0();

    /* JADX INFO: renamed from: a */
    public final String f20736a;

    /* JADX INFO: renamed from: b */
    public final String f20737b;

    public /* synthetic */ ResultChatModelConfig(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f20736a = null;
        } else {
            this.f20736a = str;
        }
        if ((i & 2) == 0) {
            this.f20737b = null;
        } else {
            this.f20737b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8348a() {
        return this.f20736a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8349b() {
        return this.f20737b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatModelConfig)) {
            return false;
        }
        ResultChatModelConfig resultChatModelConfig = (ResultChatModelConfig) obj;
        return fa4.m11650l(this.f20736a, resultChatModelConfig.f20736a) && fa4.m11650l(this.f20737b, resultChatModelConfig.f20737b);
    }

    public final int hashCode() {
        String str = this.f20736a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20737b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("ResultChatModelConfig(model=", this.f20736a, ", reasoningEffort=", this.f20737b, ")");
    }
}
