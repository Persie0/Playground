package p000;

import androidx.compose.foundation.gestures.AbstractC0103k;
import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.EnumC0087xecab5e0c;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class g44 implements fl2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0103k f40168a;

    /* JADX INFO: renamed from: b */
    public b44 f40169b;

    /* JADX INFO: renamed from: c */
    public e44 f40170c;

    /* JADX INFO: renamed from: d */
    public d44 f40171d;

    /* JADX INFO: renamed from: e */
    public c44 f40172e;

    /* JADX INFO: renamed from: f */
    public b34 f40173f;

    /* JADX INFO: renamed from: g */
    public gw9 f40174g;

    /* JADX INFO: renamed from: h */
    public s01 f40175h;

    /* JADX INFO: renamed from: i */
    public final C3126ix f40176i;

    /* JADX INFO: renamed from: j */
    public final C3126ix f40177j;

    public g44(AbstractC0103k abstractC0103k) {
        this.f40168a = abstractC0103k;
        C3126ix c3126ix = new C3126ix(4, (byte) 0);
        c3126ix.f44721c = new h66();
        this.f40176i = c3126ix;
        C3126ix c3126ix2 = new C3126ix(7, (byte) 0);
        c3126ix2.f44721c = new x56();
        this.f40177j = c3126ix2;
    }

    /* JADX INFO: renamed from: c */
    public static void m12350c(g44 g44Var, a44 a44Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC0103k abstractC0103k = g44Var.f40168a;
        d44 d44Var = g44Var.f40171d;
        if (d44Var == null) {
            d44Var = new d44();
            d44Var.f34989y = null;
            d44Var.f34990z = Long.MAX_VALUE;
            d44Var.f34988A = false;
            g44Var.f40171d = d44Var;
        }
        d44Var.f34989y = a44Var;
        d44Var.f34990z = j;
        s01 s01Var = g44Var.f40175h;
        Orientation orientation = abstractC0103k.f2267L;
        if (s01Var == null) {
            g44Var.f40175h = new s01(orientation);
        } else {
            s01Var.f60111c = orientation;
            s01Var.f60110b = j2;
        }
        d44Var.f34988A = false;
        g44Var.f40173f = d44Var;
    }

    @Override // p000.il3
    /* JADX INFO: renamed from: S */
    public final String mo790S() {
        b34 b34Var = this.f40173f;
        if (b34Var instanceof b44) {
            return ((b44) b34Var).f7915A ? "waiting" : "idle";
        }
        if ((b34Var instanceof d44) || (b34Var instanceof c44)) {
            return "waiting";
        }
        return b34Var instanceof e44 ? "recognized" : "idle";
    }

    /* JADX INFO: renamed from: a */
    public final void m12351a() {
        b44 b44Var = this.f40169b;
        if (b44Var == null) {
            EnumC0087xecab5e0c enumC0087xecab5e0c = EnumC0087xecab5e0c.NotInitialized;
            b44Var = new b44();
            b44Var.f7916y = enumC0087xecab5e0c;
            b44Var.f7917z = false;
            b44Var.f7915A = false;
            this.f40169b = b44Var;
        }
        b44Var.f7916y = EnumC0087xecab5e0c.NotInitialized;
        b44Var.f7917z = false;
        b44Var.f7915A = false;
        this.f40173f = b44Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m12352b(a44 a44Var, long j, s01 s01Var) {
        c44 c44Var = this.f40172e;
        if (c44Var == null) {
            c44Var = new c44();
            c44Var.f9474y = null;
            c44Var.f9475z = Long.MAX_VALUE;
            this.f40172e = c44Var;
        }
        c44Var.f9474y = a44Var;
        c44Var.f9475z = j;
        s01Var.f60110b = 0L;
        this.f40173f = c44Var;
    }

    @Override // p000.fl2
    /* JADX INFO: renamed from: b0 */
    public final Orientation mo880b0() {
        return this.f40168a.f2267L;
    }

    /* JADX INFO: renamed from: d */
    public final gw9 m12353d() {
        gw9 gw9Var = this.f40174g;
        if (gw9Var != null) {
            return gw9Var;
        }
        C3386nv.m17626m("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m12354e(a44 a44Var, z34 z34Var, long j) {
        long j2;
        float fIntBitsToFloat;
        AbstractC0103k abstractC0103k = this.f40168a;
        Orientation orientation = abstractC0103k.f2267L;
        orientation.getClass();
        aj3 aj3Var = AbstractC0104l.f2286a;
        long j3 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j & 4294967295L : j >> 32))) > 2.0f) {
            gw9 gw9VarM12353d = m12353d();
            Orientation orientation2 = abstractC0103k.f2267L;
            C3126ix c3126ix = this.f40176i;
            h66 h66Var = (h66) c3126ix.f44721c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a44Var.m103c() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (a44Var.m103c() & 4294967295L));
            if (x74.m24352i(a44Var)) {
                c3126ix.f44720b = 0;
                h66Var.m13093j();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (x74.m24345b(a44Var) || x74.m24352i(a44Var)) {
                j2 = 4294967295L;
            } else {
                if (h66Var.f1294b == 3) {
                    int i = c3126ix.f44720b;
                    c3126ix.f44720b = i + 1;
                    h66Var.m13098o(i, a44Var);
                } else {
                    h66Var.m13090g(a44Var);
                }
                if (c3126ix.f44720b == 3) {
                    c3126ix.f44720b = 0;
                }
                Object[] objArr = h66Var.f1293a;
                int i2 = h66Var.f1294b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((a44) objArr[i3]).m103c() >> 32));
                    i3++;
                    j3 = j3;
                }
                j2 = j3;
                int i4 = h66Var.f1294b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = h66Var.f1293a;
                int i5 = 0;
                float fIntBitsToFloat6 = 0.0f;
                while (i5 < i4) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((a44) objArr2[i5]).m103c() & j2));
                    i5++;
                    i4 = i4;
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / h66Var.f1294b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
            if (orientation2 != null) {
                int i6 = z34Var.f70830a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = orientation2 == Orientation.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            }
            ((cn5) gw9VarM12353d.f41432b).m4896a(a44Var.m107g(), jFloatToRawIntBits);
            C3126ix c3126ix2 = this.f40177j;
            x56 x56Var = (x56) c3126ix2.f44721c;
            int i7 = x56Var.f67781b;
            if (i7 == 3) {
                int i8 = c3126ix2.f44720b;
                c3126ix2.f44720b = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    v63.m23143u("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = x56Var.f67780a;
                    long j4 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                x56Var.m24287a(j);
            }
            if (c3126ix2.f44720b == 3) {
                c3126ix2.f44720b = 0;
            }
            long[] jArr2 = x56Var.f67780a;
            int i9 = x56Var.f67781b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = x56Var.f67781b;
            float f = fIntBitsToFloat7 / i11;
            long[] jArr3 = x56Var.f67780a;
            for (int i12 = 0; i12 < i11; i12++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + fIntBitsToFloat4;
            }
            abstractC0103k.m884k1(new pk2((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / x56Var.f67781b)) & j2), true));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12355f(a44 a44Var, a44 a44Var2, z34 z34Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.f40174g == null) {
            this.f40174g = new gw9(5);
        }
        gw9 gw9VarM12353d = m12353d();
        AbstractC0103k abstractC0103k = this.f40168a;
        Orientation orientation = abstractC0103k.f2267L;
        C3126ix c3126ix = this.f40176i;
        h66 h66Var = (h66) c3126ix.f44721c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a44Var.m103c() >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (a44Var.m103c() & 4294967295L));
        if (x74.m24352i(a44Var)) {
            c3126ix.f44720b = 0;
            h66Var.m13093j();
        }
        if (x74.m24345b(a44Var) || x74.m24352i(a44Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (h66Var.f1294b == 3) {
                int i = c3126ix.f44720b;
                c3126ix.f44720b = i + 1;
                h66Var.m13098o(i, a44Var);
            } else {
                h66Var.m13090g(a44Var);
            }
            if (c3126ix.f44720b == 3) {
                c3126ix.f44720b = 0;
            }
            Object[] objArr = h66Var.f1293a;
            int i2 = h66Var.f1294b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (((a44) objArr[i3]).m103c() >> c3)) + fIntBitsToFloat4;
                i3++;
                c2 = c3;
            }
            c = c2;
            int i4 = h66Var.f1294b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = h66Var.f1293a;
            int i5 = 0;
            float fIntBitsToFloat5 = 0.0f;
            while (i5 < i4) {
                long j4 = j3;
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((a44) objArr2[i5]).m103c() & j4));
                i5++;
                j3 = j4;
            }
            j2 = j3;
            fIntBitsToFloat3 = fIntBitsToFloat5 / h66Var.f1294b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (orientation != null) {
            int i6 = z34Var.f70830a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            if (orientation == Orientation.Horizontal) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2);
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            }
        }
        ((cn5) gw9VarM12353d.f41432b).m4896a(a44Var.m107g(), jFloatToRawIntBits);
        long jM12824e = gq6.m12824e(x74.m24336C(a44Var2, abstractC0103k.f2267L, z34Var), j);
        if (((Boolean) abstractC0103k.f2268M.invoke(new rg7(1))).booleanValue()) {
            abstractC0103k.m884k1(new qk2(jM12824e));
        }
        C3126ix c3126ix2 = this.f40177j;
        c3126ix2.f44720b = 0;
        ((x56) c3126ix2.f44721c).f67781b = 0;
    }
}
