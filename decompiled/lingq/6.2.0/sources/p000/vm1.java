package p000;

import androidx.compose.foundation.text.selection.C0205f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vm1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f65580b;

    public /* synthetic */ vm1(C0205f c0205f, int i) {
        this.f65579a = i;
        this.f65580b = c0205f;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        e28 e28Var;
        aq4 aq4VarM25362c;
        char c;
        float fIntBitsToFloat;
        aq4 aq4VarM25362c2;
        aq4 aq4VarM25362c3;
        aq4 aq4VarM25362c4;
        aq4 aq4VarM25362c5;
        int i = this.f65579a;
        C0205f c0205f = this.f65580b;
        switch (i) {
            case 0:
                return new C3525r7(c0205f, 3);
            case 1:
                c0205f.m1118s();
                return xfa.f68157a;
            default:
                aq4 aq4Var = (aq4) obj;
                yw4 yw4Var = c0205f.f3079d;
                e28 e28Var2 = e28.f36619e;
                if (yw4Var == null) {
                    e28Var = e28Var2;
                } else {
                    if (yw4Var.f70584p) {
                        yw4Var = null;
                    }
                    if (yw4Var != null) {
                        mq6 mq6Var = c0205f.f3077b;
                        long j = c0205f.m1114o().f65991b;
                        int i2 = cx9.f34693c;
                        int iMo13411t = mq6Var.mo13411t((int) (j >> 32));
                        int iMo13411t2 = c0205f.f3077b.mo13411t((int) (c0205f.m1114o().f65991b & 4294967295L));
                        yw4 yw4Var2 = c0205f.f3079d;
                        long jMo1671R = 0;
                        long jMo1671R2 = (yw4Var2 == null || (aq4VarM25362c5 = yw4Var2.m25362c()) == null) ? 0L : aq4VarM25362c5.mo1671R(c0205f.m1112m(true));
                        yw4 yw4Var3 = c0205f.f3079d;
                        if (yw4Var3 != null && (aq4VarM25362c4 = yw4Var3.m25362c()) != null) {
                            jMo1671R = aq4VarM25362c4.mo1671R(c0205f.m1112m(false));
                        }
                        yw4 yw4Var4 = c0205f.f3079d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (yw4Var4 == null || (aq4VarM25362c3 = yw4Var4.m25362c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            sw9 sw9VarM25363d = yw4Var.m25363d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (aq4VarM25362c3.mo1671R((((long) Float.floatToRawIntBits(sw9VarM25363d != null ? sw9VarM25363d.f61519a.m20956c(iMo13411t).f36621b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        yw4 yw4Var5 = c0205f.f3079d;
                        if (yw4Var5 != null && (aq4VarM25362c2 = yw4Var5.m25362c()) != null) {
                            sw9 sw9VarM25363d2 = yw4Var.m25363d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (aq4VarM25362c2.mo1671R((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(sw9VarM25363d2 != null ? sw9VarM25363d2.f61519a.m20956c(iMo13411t2).f36621b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jMo1671R2 >> c);
                        int i4 = (int) (jMo1671R >> c);
                        e28Var = new e28(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (yw4Var.f70569a.f64346g.mo594a() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo1671R2 & 4294967295L)), Float.intBitsToFloat((int) (jMo1671R & 4294967295L))));
                    } else {
                        e28Var = e28Var2;
                    }
                }
                yw4 yw4Var6 = c0205f.f3079d;
                if (yw4Var6 == null || (aq4VarM25362c = yw4Var6.m25362c()) == null) {
                    return null;
                }
                return (aq4VarM25362c.mo1691n() && aq4Var.mo1691n()) ? wfb.m23907b(aq4Var.mo1668L(bq1.m4054e0(aq4VarM25362c).mo1695q(e28Var.m10805f())), e28Var.m10804e()) : e28Var2;
        }
    }
}
