package com.lingq.core.domain.model.cup;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.mk9;
import p000.n3c;
import p000.sk9;
import p000.ux5;
import p000.wf1;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CupPrize {
    public static final C1417i Companion = new C1417i();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f18986g;

    /* JADX INFO: renamed from: a */
    public final String f18987a;

    /* JADX INFO: renamed from: b */
    public final CupPrizeKind f18988b;

    /* JADX INFO: renamed from: c */
    public final CupPrizeSource f18989c;

    /* JADX INFO: renamed from: d */
    public final int f18990d;

    /* JADX INFO: renamed from: e */
    public final String f18991e;

    /* JADX INFO: renamed from: f */
    public final CupClaim f18992f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f18986g = new cs4[]{null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(3)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new wf1(4)), null, null, null};
    }

    public /* synthetic */ CupPrize(int i, String str, CupPrizeKind cupPrizeKind, CupPrizeSource cupPrizeSource, int i2, String str2, CupClaim cupClaim) {
        if (63 != (i & 63)) {
            n3c.m17204b(i, 63, CupPrize$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18987a = str;
        this.f18988b = cupPrizeKind;
        this.f18989c = cupPrizeSource;
        this.f18990d = i2;
        this.f18991e = str2;
        this.f18992f = cupClaim;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8018b(CupPrize cupPrize, mk9 mk9Var, SerialDescriptor serialDescriptor) {
        mk9Var.m16880x(serialDescriptor, 0, sk9.f60959a, cupPrize.f18987a);
        cs4[] cs4VarArr = f18986g;
        mk9Var.m16881y(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), cupPrize.f18988b);
        mk9Var.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), cupPrize.f18989c);
        mk9Var.m16878v(3, cupPrize.f18990d, serialDescriptor);
        mk9Var.m16882z(serialDescriptor, 4, cupPrize.f18991e);
        mk9Var.m16880x(serialDescriptor, 5, CupClaim$$serializer.INSTANCE, cupPrize.f18992f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CupPrize)) {
            return false;
        }
        CupPrize cupPrize = (CupPrize) obj;
        return fa4.m11650l(this.f18987a, cupPrize.f18987a) && this.f18988b == cupPrize.f18988b && this.f18989c == cupPrize.f18989c && this.f18990d == cupPrize.f18990d && fa4.m11650l(this.f18991e, cupPrize.f18991e) && fa4.m11650l(this.f18992f, cupPrize.f18992f);
    }

    public final int hashCode() {
        String str = this.f18987a;
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f18990d, (this.f18989c.hashCode() + ((this.f18988b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31), this.f18991e, 31);
        CupClaim cupClaim = this.f18992f;
        return iM22980c + (cupClaim != null ? cupClaim.hashCode() : 0);
    }

    public final String toString() {
        return "CupPrize(date=" + this.f18987a + ", kind=" + this.f18988b + ", source=" + this.f18989c + ", value=" + this.f18990d + ", label=" + this.f18991e + ", claim=" + this.f18992f + ")";
    }

    public CupPrize(String str, CupPrizeKind cupPrizeKind, CupPrizeSource cupPrizeSource, int i, String str2, CupClaim cupClaim) {
        cupPrizeKind.getClass();
        cupPrizeSource.getClass();
        str2.getClass();
        this.f18987a = str;
        this.f18988b = cupPrizeKind;
        this.f18989c = cupPrizeSource;
        this.f18990d = i;
        this.f18991e = str2;
        this.f18992f = cupClaim;
    }
}
