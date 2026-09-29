package androidx.compose.p002ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import p000.C3185ki;
import p000.C3459pg;
import p000.aa1;
import p000.an0;
import p000.fa1;
import p000.fb2;
import p000.i54;
import p000.kl2;
import p000.l70;
import p000.omd;
import p000.ona;
import p000.qd0;
import p000.soa;
import p000.t66;
import p000.te1;
import p000.ui3;
import p000.vi3;
import p000.x89;
import p000.xc9;
import p000.xfa;
import p000.ym0;
import p000.zm0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0315c extends ona {

    /* JADX INFO: renamed from: b */
    public final C0313a f4047b;

    /* JADX INFO: renamed from: c */
    public String f4048c;

    /* JADX INFO: renamed from: d */
    public boolean f4049d;

    /* JADX INFO: renamed from: e */
    public final kl2 f4050e;

    /* JADX INFO: renamed from: f */
    public ui3 f4051f;

    /* JADX INFO: renamed from: g */
    public final t66 f4052g;

    /* JADX INFO: renamed from: h */
    public qd0 f4053h;

    /* JADX INFO: renamed from: i */
    public final t66 f4054i;

    /* JADX INFO: renamed from: j */
    public long f4055j;

    /* JADX INFO: renamed from: k */
    public float f4056k;

    /* JADX INFO: renamed from: l */
    public float f4057l;

    /* JADX INFO: renamed from: m */
    public final vi3 f4058m;

    public C0315c(C0313a c0313a) {
        this.f4047b = c0313a;
        c0313a.f4016i = new vi3() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                C0315c c0315c = this.f4005b;
                c0315c.f4049d = true;
                c0315c.f4051f.mo0a();
                return xfa.f68157a;
            }
        };
        this.f4048c = "";
        this.f4049d = true;
        this.f4050e = new kl2();
        this.f4051f = VectorComponent$invalidateCallback$1.f4007b;
        this.f4052g = AbstractC0278f.m1260j(null);
        this.f4054i = AbstractC0278f.m1260j(new x89(0L));
        this.f4055j = 9205357640488583168L;
        this.f4056k = 1.0f;
        this.f4057l = 1.0f;
        this.f4058m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // p000.ona
    /* JADX INFO: renamed from: a */
    public final void mo1435a(InterfaceC0310a interfaceC0310a) {
        m1442e(interfaceC0310a, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX INFO: renamed from: e */
    public final void m1442e(InterfaceC0310a interfaceC0310a, float f, fa1 fa1Var) {
        int i;
        qd0 qd0Var;
        C3185ki c3185kiM21987a;
        char c;
        long j;
        long jM198b;
        fa1 fa1Var2;
        int i2;
        int i3;
        C0313a c0313a = this.f4047b;
        boolean z = c0313a.f4011d;
        t66 t66Var = this.f4052g;
        if (!z || c0313a.f4012e == 16) {
            i = 0;
        } else {
            fa1 fa1Var3 = (fa1) ((xc9) t66Var).getValue();
            int i4 = soa.f61116a;
            if (!(fa1Var3 instanceof qd0) ? fa1Var3 == null : (i3 = ((qd0) fa1Var3).f57604c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(fa1Var instanceof qd0) ? fa1Var == null : (i2 = ((qd0) fa1Var).f57604c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.f4049d;
        kl2 kl2Var = this.f4050e;
        if (z2 || !x89.m24404a(this.f4055j, interfaceC0310a.mo1422h())) {
            if (i == 1) {
                jM198b = c0313a.f4012e;
                int i5 = soa.f61116a;
                if (aa1.m200d(jM198b) != 1.0f) {
                    jM198b = aa1.m198b(1.0f, jM198b);
                }
                qd0Var = new qd0(5, jM198b);
            } else {
                qd0Var = null;
            }
            this.f4053h = qd0Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
            t66 t66Var2 = this.f4054i;
            this.f4056k = fIntBitsToFloat / Float.intBitsToFloat((int) (((x89) ((xc9) t66Var2).getValue()).f67935a >> 32));
            this.f4057l = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / Float.intBitsToFloat((int) (((x89) ((xc9) t66Var2).getValue()).f67935a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L))))) & 4294967295L);
            LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
            c3185kiM21987a = (C3185ki) kl2Var.f47483c;
            C3459pg c3459pgM15936a = (C3459pg) kl2Var.f47484d;
            if (c3185kiM21987a != null || c3459pgM15936a == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = c3185kiM21987a.f47311a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || kl2Var.f47481a != i) {
                }
                kl2Var.f47482b = jCeil;
                an0 an0Var = (an0) kl2Var.f47485e;
                long jM18152h0 = omd.m18152h0(jCeil);
                zm0 zm0Var = an0Var.f852a;
                fb2 fb2Var = zm0Var.f71734a;
                LayoutDirection layoutDirection2 = zm0Var.f71735b;
                ym0 ym0Var = zm0Var.f71736c;
                C3459pg c3459pg = c3459pgM15936a;
                long j2 = zm0Var.f71737d;
                zm0Var.f71734a = interfaceC0310a;
                zm0Var.f71735b = layoutDirection;
                zm0Var.f71736c = c3459pg;
                zm0Var.f71737d = jM18152h0;
                c3459pg.mo17016h();
                InterfaceC0310a.m1414L0(an0Var, aa1.f403b, 0L, 0L, 0.0f, null, 0, 62);
                ((VectorComponent$drawVectorBlock$1) this.f4058m).invoke(an0Var);
                c3459pg.mo17024p();
                zm0 zm0Var2 = an0Var.f852a;
                zm0Var2.f71734a = fb2Var;
                zm0Var2.f71735b = layoutDirection2;
                zm0Var2.f71736c = ym0Var;
                zm0Var2.f71737d = j2;
                c3185kiM21987a.f47311a.prepareToDraw();
                this.f4049d = false;
                this.f4055j = interfaceC0310a.mo1422h();
            }
            c3185kiM21987a = te1.m21987a((int) (jCeil >> c), (int) (jCeil & j), i);
            c3459pgM15936a = l70.m15936a(c3185kiM21987a);
            kl2Var.f47483c = c3185kiM21987a;
            kl2Var.f47484d = c3459pgM15936a;
            kl2Var.f47481a = i;
            kl2Var.f47482b = jCeil;
            an0 an0Var2 = (an0) kl2Var.f47485e;
            long jM18152h1 = omd.m18152h0(jCeil);
            zm0 zm0Var3 = an0Var2.f852a;
            fb2 fb2Var2 = zm0Var3.f71734a;
            LayoutDirection layoutDirection3 = zm0Var3.f71735b;
            ym0 ym0Var2 = zm0Var3.f71736c;
            C3459pg c3459pg2 = c3459pgM15936a;
            long j3 = zm0Var3.f71737d;
            zm0Var3.f71734a = interfaceC0310a;
            zm0Var3.f71735b = layoutDirection;
            zm0Var3.f71736c = c3459pg2;
            zm0Var3.f71737d = jM18152h1;
            c3459pg2.mo17016h();
            InterfaceC0310a.m1414L0(an0Var2, aa1.f403b, 0L, 0L, 0.0f, null, 0, 62);
            ((VectorComponent$drawVectorBlock$1) this.f4058m).invoke(an0Var2);
            c3459pg2.mo17024p();
            zm0 zm0Var4 = an0Var2.f852a;
            zm0Var4.f71734a = fb2Var2;
            zm0Var4.f71735b = layoutDirection3;
            zm0Var4.f71736c = ym0Var2;
            zm0Var4.f71737d = j3;
            c3185kiM21987a.f47311a.prepareToDraw();
            this.f4049d = false;
            this.f4055j = interfaceC0310a.mo1422h();
        } else {
            C3185ki c3185ki = (C3185ki) kl2Var.f47483c;
            if (i != (c3185ki != null ? c3185ki.m15259a() : 0)) {
                if (i == 1) {
                    jM198b = c0313a.f4012e;
                    int i7 = soa.f61116a;
                    if (aa1.m200d(jM198b) != 1.0f) {
                        jM198b = aa1.m198b(1.0f, jM198b);
                    }
                    qd0Var = new qd0(5, jM198b);
                } else {
                    qd0Var = null;
                }
                this.f4053h = qd0Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                t66 t66Var3 = this.f4054i;
                this.f4056k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((x89) ((xc9) t66Var3).getValue()).f67935a >> 32));
                this.f4057l = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / Float.intBitsToFloat((int) (((x89) ((xc9) t66Var3).getValue()).f67935a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L))))) & 4294967295L);
                LayoutDirection layoutDirection4 = interfaceC0310a.getLayoutDirection();
                c3185kiM21987a = (C3185ki) kl2Var.f47483c;
                C3459pg c3459pgM15936a2 = (C3459pg) kl2Var.f47484d;
                if (c3185kiM21987a != null) {
                    c = ' ';
                    j = 4294967295L;
                    c3185kiM21987a = te1.m21987a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    c3459pgM15936a2 = l70.m15936a(c3185kiM21987a);
                    kl2Var.f47483c = c3185kiM21987a;
                    kl2Var.f47484d = c3459pgM15936a2;
                    kl2Var.f47481a = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    c3185kiM21987a = te1.m21987a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    c3459pgM15936a2 = l70.m15936a(c3185kiM21987a);
                    kl2Var.f47483c = c3185kiM21987a;
                    kl2Var.f47484d = c3459pgM15936a2;
                    kl2Var.f47481a = i;
                }
                kl2Var.f47482b = jCeil2;
                an0 an0Var3 = (an0) kl2Var.f47485e;
                long jM18152h2 = omd.m18152h0(jCeil2);
                zm0 zm0Var5 = an0Var3.f852a;
                fb2 fb2Var3 = zm0Var5.f71734a;
                LayoutDirection layoutDirection5 = zm0Var5.f71735b;
                ym0 ym0Var3 = zm0Var5.f71736c;
                C3459pg c3459pg3 = c3459pgM15936a2;
                long j4 = zm0Var5.f71737d;
                zm0Var5.f71734a = interfaceC0310a;
                zm0Var5.f71735b = layoutDirection4;
                zm0Var5.f71736c = c3459pg3;
                zm0Var5.f71737d = jM18152h2;
                c3459pg3.mo17016h();
                InterfaceC0310a.m1414L0(an0Var3, aa1.f403b, 0L, 0L, 0.0f, null, 0, 62);
                ((VectorComponent$drawVectorBlock$1) this.f4058m).invoke(an0Var3);
                c3459pg3.mo17024p();
                zm0 zm0Var6 = an0Var3.f852a;
                zm0Var6.f71734a = fb2Var3;
                zm0Var6.f71735b = layoutDirection5;
                zm0Var6.f71736c = ym0Var3;
                zm0Var6.f71737d = j4;
                c3185kiM21987a.f47311a.prepareToDraw();
                this.f4049d = false;
                this.f4055j = interfaceC0310a.mo1422h();
            }
        }
        if (fa1Var != null) {
            fa1Var2 = fa1Var;
        } else {
            fa1Var2 = ((fa1) ((xc9) t66Var).getValue()) != null ? (fa1) ((xc9) t66Var).getValue() : this.f4053h;
        }
        C3185ki c3185ki2 = (C3185ki) kl2Var.f47483c;
        if (c3185ki2 == null) {
            i54.m13663b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC0310a.m1416Z(interfaceC0310a, c3185ki2, kl2Var.f47482b, 0L, f, fa1Var2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4048c);
        sb.append("\n\tviewportWidth: ");
        t66 t66Var = this.f4054i;
        sb.append(Float.intBitsToFloat((int) (((x89) ((xc9) t66Var).getValue()).f67935a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((x89) ((xc9) t66Var).getValue()).f67935a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
