package p469x0;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p260m8.C7499b;
import p338qd.C8573r0;
import p387t0.C9151j;
import p424v0.C9617a;
import p424v0.C9618b;
import p424v0.InterfaceC9621e;
import sl.C9072e;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10001b extends AbstractC10005f {

    /* JADX INFO: renamed from: b */
    public float[] f50818b;

    /* JADX INFO: renamed from: f */
    public C9151j f50822f;

    /* JADX INFO: renamed from: g */
    public C10004e f50823g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2041a<C9072e> f50824h;

    /* JADX INFO: renamed from: j */
    public float f50826j;

    /* JADX INFO: renamed from: k */
    public float f50827k;

    /* JADX INFO: renamed from: l */
    public float f50828l;

    /* JADX INFO: renamed from: o */
    public float f50831o;

    /* JADX INFO: renamed from: p */
    public float f50832p;

    /* JADX INFO: renamed from: c */
    public final ArrayList f50819c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<? extends AbstractC10003d> f50820d = C10009j.f50944a;

    /* JADX INFO: renamed from: e */
    public boolean f50821e = true;

    /* JADX INFO: renamed from: i */
    public String f50825i = "";

    /* JADX INFO: renamed from: m */
    public float f50829m = 1.0f;

    /* JADX INFO: renamed from: n */
    public float f50830n = 1.0f;

    /* JADX INFO: renamed from: q */
    public boolean f50833q = true;

    @Override // p469x0.AbstractC10005f
    /* JADX INFO: renamed from: a */
    public final void mo2002a(InterfaceC9621e interfaceC9621e) {
        C5207g.m11111f(interfaceC9621e, "<this>");
        if (this.f50833q) {
            float[] fArrM14961r = this.f50818b;
            if (fArrM14961r == null) {
                fArrM14961r = C7499b.m14961r();
                this.f50818b = fArrM14961r;
            } else {
                C7499b.m14966t0(fArrM14961r);
            }
            C7499b.m14905G0(fArrM14961r, this.f50827k + this.f50831o, this.f50828l + this.f50832p);
            double d10 = (((double) this.f50826j) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d10);
            float fSin = (float) Math.sin(d10);
            float f3 = fArrM14961r[0];
            float f10 = fArrM14961r[4];
            float f11 = (fSin * f10) + (fCos * f3);
            float f12 = -fSin;
            float f13 = (f10 * fCos) + (f3 * f12);
            float f14 = fArrM14961r[1];
            float f15 = fArrM14961r[5];
            float f16 = (fSin * f15) + (fCos * f14);
            float f17 = (f15 * fCos) + (f14 * f12);
            float f18 = fArrM14961r[2];
            float f19 = fArrM14961r[6];
            float f20 = (fSin * f19) + (fCos * f18);
            float f21 = (f19 * fCos) + (f18 * f12);
            float f22 = fArrM14961r[3];
            float f23 = fArrM14961r[7];
            float f24 = (fSin * f23) + (fCos * f22);
            float f25 = (fCos * f23) + (f12 * f22);
            fArrM14961r[0] = f11;
            fArrM14961r[1] = f16;
            fArrM14961r[2] = f20;
            fArrM14961r[3] = f24;
            fArrM14961r[4] = f13;
            fArrM14961r[5] = f17;
            fArrM14961r[6] = f21;
            fArrM14961r[7] = f25;
            float f26 = this.f50829m;
            float f27 = this.f50830n;
            fArrM14961r[0] = f11 * f26;
            fArrM14961r[1] = f16 * f26;
            fArrM14961r[2] = f20 * f26;
            fArrM14961r[3] = f24 * f26;
            fArrM14961r[4] = f13 * f27;
            fArrM14961r[5] = f17 * f27;
            fArrM14961r[6] = f21 * f27;
            fArrM14961r[7] = f25 * f27;
            fArrM14961r[8] = fArrM14961r[8] * 1.0f;
            fArrM14961r[9] = fArrM14961r[9] * 1.0f;
            fArrM14961r[10] = fArrM14961r[10] * 1.0f;
            fArrM14961r[11] = fArrM14961r[11] * 1.0f;
            C7499b.m14905G0(fArrM14961r, -this.f50827k, -this.f50828l);
            this.f50833q = false;
        }
        if (this.f50821e) {
            if (!this.f50820d.isEmpty()) {
                C10004e c10004e = this.f50823g;
                if (c10004e == null) {
                    c10004e = new C10004e();
                    this.f50823g = c10004e;
                } else {
                    c10004e.f50925a.clear();
                }
                C9151j c9151jM16758t = this.f50822f;
                if (c9151jM16758t == null) {
                    c9151jM16758t = C8573r0.m16758t();
                    this.f50822f = c9151jM16758t;
                } else {
                    c9151jM16758t.mo17407c();
                }
                List<? extends AbstractC10003d> list = this.f50820d;
                C5207g.m11111f(list, "nodes");
                c10004e.f50925a.addAll(list);
                c10004e.m18591c(c9151jM16758t);
            }
            this.f50821e = false;
        }
        C9617a.b bVarMo12676l0 = interfaceC9621e.mo12676l0();
        long jMo18081d = bVarMo12676l0.mo18081d();
        bVarMo12676l0.mo18080b().mo17420d();
        float[] fArr = this.f50818b;
        C9618b c9618b = bVarMo12676l0.f49292a;
        if (fArr != null) {
            c9618b.m18086e(fArr);
        }
        C9151j c9151j = this.f50822f;
        if ((!this.f50820d.isEmpty()) && c9151j != null) {
            c9618b.m18082a(c9151j, 1);
        }
        ArrayList arrayList = this.f50819c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC10005f) arrayList.get(i10)).mo2002a(interfaceC9621e);
        }
        bVarMo12676l0.mo18080b().mo17428o();
        bVarMo12676l0.mo18079a(jMo18081d);
    }

    @Override // p469x0.AbstractC10005f
    /* JADX INFO: renamed from: b */
    public final InterfaceC2041a<C9072e> mo18583b() {
        return this.f50824h;
    }

    @Override // p469x0.AbstractC10005f
    /* JADX INFO: renamed from: d */
    public final void mo18584d(InterfaceC2041a<C9072e> interfaceC2041a) {
        this.f50824h = interfaceC2041a;
        ArrayList arrayList = this.f50819c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC10005f) arrayList.get(i10)).mo18584d(interfaceC2041a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18585e(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            ArrayList arrayList = this.f50819c;
            if (i10 < arrayList.size()) {
                ((AbstractC10005f) arrayList.get(i10)).mo18584d(null);
                arrayList.remove(i10);
            }
        }
        m18593c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f50825i);
        ArrayList arrayList = this.f50819c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC10005f abstractC10005f = (AbstractC10005f) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(abstractC10005f.toString());
            sb2.append("\n");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }
}
