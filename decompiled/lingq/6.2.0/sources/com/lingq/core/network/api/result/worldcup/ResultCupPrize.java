package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultCupPrize {
    public static final C1768m Companion = new C1768m();

    /* JADX INFO: renamed from: a */
    public final String f21791a;

    /* JADX INFO: renamed from: b */
    public final String f21792b;

    /* JADX INFO: renamed from: c */
    public final String f21793c;

    /* JADX INFO: renamed from: d */
    public final int f21794d;

    /* JADX INFO: renamed from: e */
    public final String f21795e;

    /* JADX INFO: renamed from: f */
    public final ResultCupClaimState f21796f;

    public /* synthetic */ ResultCupPrize(int i, String str, String str2, String str3, int i2, String str4, ResultCupClaimState resultCupClaimState) {
        if ((i & 1) == 0) {
            this.f21791a = null;
        } else {
            this.f21791a = str;
        }
        if ((i & 2) == 0) {
            this.f21792b = "";
        } else {
            this.f21792b = str2;
        }
        if ((i & 4) == 0) {
            this.f21793c = "";
        } else {
            this.f21793c = str3;
        }
        if ((i & 8) == 0) {
            this.f21794d = 0;
        } else {
            this.f21794d = i2;
        }
        if ((i & 16) == 0) {
            this.f21795e = "";
        } else {
            this.f21795e = str4;
        }
        if ((i & 32) == 0) {
            this.f21796f = null;
        } else {
            this.f21796f = resultCupClaimState;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ void m8429a(ResultCupPrize resultCupPrize, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        ResultCupClaimState resultCupClaimState = resultCupPrize.f21796f;
        String str = resultCupPrize.f21795e;
        int i = resultCupPrize.f21794d;
        String str2 = resultCupPrize.f21793c;
        String str3 = resultCupPrize.f21792b;
        String str4 = resultCupPrize.f21791a;
        if (mk9Var.m16872B(serialDescriptor) || str4 != null) {
            mk9Var.m16880x(serialDescriptor, 0, sk9.f60959a, str4);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9Var.m16882z(serialDescriptor, 1, str3);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9Var.m16882z(serialDescriptor, 2, str2);
        }
        if (mk9Var.m16872B(serialDescriptor) || i != 0) {
            mk9Var.m16878v(3, i, serialDescriptor);
        }
        if (mk9Var.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9Var.m16882z(serialDescriptor, 4, str);
        }
        if (!mk9Var.m16872B(serialDescriptor) && resultCupClaimState == null) {
            return;
        }
        mk9Var.m16880x(serialDescriptor, 5, ResultCupClaimState$$serializer.INSTANCE, resultCupClaimState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCupPrize)) {
            return false;
        }
        ResultCupPrize resultCupPrize = (ResultCupPrize) obj;
        return fa4.m11650l(this.f21791a, resultCupPrize.f21791a) && fa4.m11650l(this.f21792b, resultCupPrize.f21792b) && fa4.m11650l(this.f21793c, resultCupPrize.f21793c) && this.f21794d == resultCupPrize.f21794d && fa4.m11650l(this.f21795e, resultCupPrize.f21795e) && fa4.m11650l(this.f21796f, resultCupPrize.f21796f);
    }

    public final int hashCode() {
        String str = this.f21791a;
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f21794d, ux5.m22980c(ux5.m22980c((str == null ? 0 : str.hashCode()) * 31, this.f21792b, 31), this.f21793c, 31), 31), this.f21795e, 31);
        ResultCupClaimState resultCupClaimState = this.f21796f;
        return iM22980c + (resultCupClaimState != null ? resultCupClaimState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultCupPrize(date=", this.f21791a, ", kind=", this.f21792b, ", source=");
        AbstractC3393o1.m17748w(this.f21794d, this.f21793c, ", value=", ", label=", sbM23000w);
        sbM23000w.append(this.f21795e);
        sbM23000w.append(", myClaim=");
        sbM23000w.append(this.f21796f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
