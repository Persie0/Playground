package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.AbstractC3122is;
import p000.AbstractC3393o1;
import p000.AbstractC3650uj;
import p000.C3309ls;
import p000.C3500qj;
import p000.aa1;
import p000.ona;
import p000.pd9;
import p000.qn3;
import p000.soa;
import p000.ts5;
import p000.vi0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0313a extends ona {

    /* JADX INFO: renamed from: b */
    public float[] f4009b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4010c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f4011d = true;

    /* JADX INFO: renamed from: e */
    public long f4012e = aa1.f412k;

    /* JADX INFO: renamed from: f */
    public List f4013f;

    /* JADX INFO: renamed from: g */
    public boolean f4014g;

    /* JADX INFO: renamed from: h */
    public C3500qj f4015h;

    /* JADX INFO: renamed from: i */
    public vi3 f4016i;

    /* JADX INFO: renamed from: j */
    public final vi3 f4017j;

    /* JADX INFO: renamed from: k */
    public String f4018k;

    /* JADX INFO: renamed from: l */
    public float f4019l;

    /* JADX INFO: renamed from: m */
    public float f4020m;

    /* JADX INFO: renamed from: n */
    public float f4021n;

    /* JADX INFO: renamed from: o */
    public float f4022o;

    /* JADX INFO: renamed from: p */
    public float f4023p;

    /* JADX INFO: renamed from: q */
    public float f4024q;

    /* JADX INFO: renamed from: r */
    public float f4025r;

    /* JADX INFO: renamed from: s */
    public boolean f4026s;

    public C0313a() {
        int i = soa.f61116a;
        this.f4013f = EmptyList.f47638a;
        this.f4014g = true;
        this.f4017j = new vi3() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ona onaVar = (ona) obj;
                C0313a c0313a = this.f4003b;
                c0313a.m1440g(onaVar);
                vi3 vi3Var = c0313a.f4016i;
                if (vi3Var != null) {
                    vi3Var.invoke(onaVar);
                }
                return xfa.f68157a;
            }
        };
        this.f4018k = "";
        this.f4022o = 1.0f;
        this.f4023p = 1.0f;
        this.f4026s = true;
    }

    @Override // p000.ona
    /* JADX INFO: renamed from: a */
    public final void mo1435a(InterfaceC0310a interfaceC0310a) {
        if (this.f4026s) {
            float[] fArrM22286a = this.f4009b;
            if (fArrM22286a == null) {
                fArrM22286a = ts5.m22286a();
                this.f4009b = fArrM22286a;
            } else {
                ts5.m22289d(fArrM22286a);
            }
            ts5.m22293h(fArrM22286a, this.f4024q + this.f4020m, this.f4025r + this.f4021n);
            ts5.m22290e(this.f4019l, fArrM22286a);
            ts5.m22291f(fArrM22286a, this.f4022o, this.f4023p);
            ts5.m22293h(fArrM22286a, -this.f4020m, -this.f4021n);
            this.f4026s = false;
        }
        if (this.f4014g) {
            if (!this.f4013f.isEmpty()) {
                C3500qj c3500qjM22757a = this.f4015h;
                if (c3500qjM22757a == null) {
                    c3500qjM22757a = AbstractC3650uj.m22757a();
                    this.f4015h = c3500qjM22757a;
                }
                AbstractC3122is.m14086E(this.f4013f, c3500qjM22757a);
            }
            this.f4014g = false;
        }
        C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
        long jM16483A = c3309lsMo603o0.m16483A();
        c3309lsMo603o0.m16515r().mo17016h();
        try {
            C3309ls c3309ls = (C3309ls) ((qn3) c3309lsMo603o0.f50064b).f57974a;
            float[] fArr = this.f4009b;
            if (fArr != null) {
                c3309ls.m16515r().mo17018j(fArr);
            }
            C3500qj c3500qj = this.f4015h;
            if (!this.f4013f.isEmpty() && c3500qj != null) {
                c3309ls.m16515r().mo17020l(c3500qj);
            }
            ArrayList arrayList = this.f4010c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ona) arrayList.get(i)).mo1435a(interfaceC0310a);
            }
        } finally {
            AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
        }
    }

    @Override // p000.ona
    /* JADX INFO: renamed from: b */
    public final vi3 mo1436b() {
        return this.f4016i;
    }

    @Override // p000.ona
    /* JADX INFO: renamed from: d */
    public final void mo1437d(vi3 vi3Var) {
        this.f4016i = vi3Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m1438e(int i, ona onaVar) {
        ArrayList arrayList = this.f4010c;
        if (i < arrayList.size()) {
            arrayList.set(i, onaVar);
        } else {
            arrayList.add(onaVar);
        }
        m1440g(onaVar);
        onaVar.mo1437d(this.f4017j);
        m18175c();
    }

    /* JADX INFO: renamed from: f */
    public final void m1439f(long j) {
        if (this.f4011d && j != 16) {
            long j2 = this.f4012e;
            if (j2 == 16) {
                this.f4012e = j;
                return;
            }
            int i = soa.f61116a;
            if (aa1.m204h(j2) == aa1.m204h(j) && aa1.m203g(j2) == aa1.m203g(j) && aa1.m201e(j2) == aa1.m201e(j)) {
                return;
            }
            this.f4011d = false;
            this.f4012e = aa1.f412k;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1440g(ona onaVar) {
        if (!(onaVar instanceof C0314b)) {
            if (onaVar instanceof C0313a) {
                C0313a c0313a = (C0313a) onaVar;
                if (c0313a.f4011d && this.f4011d) {
                    m1439f(c0313a.f4012e);
                    return;
                } else {
                    this.f4011d = false;
                    this.f4012e = aa1.f412k;
                    return;
                }
            }
            return;
        }
        C0314b c0314b = (C0314b) onaVar;
        vi0 vi0Var = c0314b.f4027b;
        if (this.f4011d && vi0Var != null) {
            if (vi0Var instanceof pd9) {
                m1439f(((pd9) vi0Var).f55989a);
            } else {
                this.f4011d = false;
                this.f4012e = aa1.f412k;
            }
        }
        vi0 vi0Var2 = c0314b.f4032g;
        if (this.f4011d && vi0Var2 != null) {
            if (vi0Var2 instanceof pd9) {
                m1439f(((pd9) vi0Var2).f55989a);
            } else {
                this.f4011d = false;
                this.f4012e = aa1.f412k;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4018k);
        ArrayList arrayList = this.f4010c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ona onaVar = (ona) arrayList.get(i);
            sb.append("\t");
            sb.append(onaVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
