package kotlinx.datetime.internal.format;

import p000.AbstractC3021g0;
import p000.C3386nv;
import p000.bha;
import p000.cg1;
import p000.d33;
import p000.pc3;
import p000.qzb;
import p000.t47;
import p000.ux5;
import p000.vn7;

/* JADX INFO: renamed from: kotlinx.datetime.internal.format.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3260e implements d33 {

    /* JADX INFO: renamed from: a */
    public final bha f48234a;

    /* JADX INFO: renamed from: b */
    public final int f48235b;

    /* JADX INFO: renamed from: c */
    public final Integer f48236c;

    /* JADX INFO: renamed from: d */
    public final int f48237d;

    public AbstractC3260e(bha bhaVar, int i, Integer num) {
        bhaVar.getClass();
        this.f48234a = bhaVar;
        this.f48235b = i;
        this.f48236c = num;
        int i2 = bhaVar.f8554e;
        this.f48237d = i2;
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: a */
    public final pc3 mo10071a() {
        vn7 vn7Var = this.f48234a.f8550a;
        cg1 cg1Var = new cg1();
        int i = this.f48235b;
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("The minimum number of digits (", i, ") is negative"));
            return null;
        }
        if (i <= 9) {
            return this.f48236c != null ? new cg1() : cg1Var;
        }
        C3386nv.m17624j(ux5.m22989l("The minimum number of digits (", i, ") exceeds the length of an Int"));
        return null;
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: b */
    public final t47 mo10072b() {
        Integer numValueOf = Integer.valueOf(this.f48235b);
        Integer numValueOf2 = Integer.valueOf(this.f48237d);
        bha bhaVar = this.f48234a;
        return qzb.m20222a(numValueOf, numValueOf2, this.f48236c, bhaVar.f8550a, bhaVar.f8551b, false);
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC3021g0 mo10073c() {
        return this.f48234a;
    }
}
