package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.sk9;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupClaimState {
    public static final C1760e Companion = new C1760e();

    /* JADX INFO: renamed from: a */
    public final boolean f21758a;

    /* JADX INFO: renamed from: b */
    public final String f21759b;

    public /* synthetic */ ResultCupClaimState(String str, int i, boolean z) {
        this.f21758a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.f21759b = null;
        } else {
            this.f21759b = str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m8413c(ResultCupClaimState resultCupClaimState, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        String str = resultCupClaimState.f21759b;
        boolean z = resultCupClaimState.f21758a;
        if (mk9Var.m16872B(serialDescriptor) || z) {
            mk9Var.m16873q(serialDescriptor, 0, z);
        }
        if (!mk9Var.m16872B(serialDescriptor) && str == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 1, sk9.f60959a, str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8414a() {
        return this.f21758a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8415b() {
        return this.f21759b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupClaimState)) {
            return false;
        }
        ResultCupClaimState resultCupClaimState = (ResultCupClaimState) obj;
        return this.f21758a == resultCupClaimState.f21758a && fa4.m11650l(this.f21759b, resultCupClaimState.f21759b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21758a) * 31;
        String str = this.f21759b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ResultCupClaimState(claimed=" + this.f21758a + ", claimedAt=" + this.f21759b + ")";
    }
}
