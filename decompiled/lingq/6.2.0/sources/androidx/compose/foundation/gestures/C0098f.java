package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineStart;
import p000.co8;
import p000.d16;
import p000.e28;
import p000.fa4;
import p000.gm5;
import p000.ii0;
import p000.l54;
import p000.mi0;
import p000.mt5;
import p000.n84;
import p000.ni0;
import p000.omd;
import p000.pi0;
import p000.tf1;
import p000.thb;
import p000.vk1;
import p000.wfb;
import p000.wk1;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0098f extends d16 implements tf1, mt5 {

    /* JADX INFO: renamed from: J */
    public Orientation f2246J;

    /* JADX INFO: renamed from: K */
    public final C0116v f2247K;

    /* JADX INFO: renamed from: L */
    public boolean f2248L;

    /* JADX INFO: renamed from: M */
    public ni0 f2249M;

    /* JADX INFO: renamed from: N */
    public final co8 f2250N;

    /* JADX INFO: renamed from: P */
    public boolean f2252P;

    /* JADX INFO: renamed from: R */
    public boolean f2254R;

    /* JADX INFO: renamed from: O */
    public final ii0 f2251O = new ii0(0);

    /* JADX INFO: renamed from: Q */
    public long f2253Q = -1;

    public C0098f(Orientation orientation, C0116v c0116v, boolean z, ni0 ni0Var, co8 co8Var) {
        this.f2246J = orientation;
        this.f2247K = c0116v;
        this.f2248L = z;
        this.f2249M = ni0Var;
        this.f2250N = co8Var;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final float m855Z0(C0098f c0098f, ni0 ni0Var, long j) {
        char c;
        float f;
        long j2;
        e28 e28Var;
        int iCompare;
        long j3 = c0098f.f2253Q;
        x66 x66Var = c0098f.f2251O.f44131a;
        int i = x66Var.f67832c - 1;
        Object[] objArr = x66Var.f67830a;
        if (i < objArr.length) {
            e28Var = null;
            while (true) {
                if (i < 0) {
                    c = ' ';
                    f = 0.0f;
                    j2 = 4294967295L;
                    break;
                }
                e28 e28Var2 = (e28) ((vk1) objArr[i]).f65528a.mo0a();
                if (e28Var2 != null) {
                    long jM10804e = e28Var2.m10804e();
                    long jM18152h0 = omd.m18152h0(c0098f.m857a1());
                    f = 0.0f;
                    int i2 = wk1.f66960a[c0098f.f2246J.ordinal()];
                    if (i2 == 1) {
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM10804e & 4294967295L)), Float.intBitsToFloat((int) (jM18152h0 & 4294967295L)));
                    } else {
                        if (i2 != 2) {
                            gm5.m12750e();
                            return 0.0f;
                        }
                        c = ' ';
                        j2 = 4294967295L;
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM10804e >> 32)), Float.intBitsToFloat((int) (jM18152h0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (e28Var != null) {
                            break;
                        }
                        e28Var = e28Var2;
                        break;
                    }
                    e28Var = e28Var2;
                }
                i--;
            }
        } else {
            c = ' ';
            f = 0.0f;
            j2 = 4294967295L;
            e28Var = null;
        }
        if (e28Var == null) {
            e28 e28Var3 = c0098f.f2252P ? (e28) c0098f.f2250N.mo0a() : null;
            if (e28Var3 == null) {
                return f;
            }
            e28Var = e28Var3;
        }
        long jM18152h1 = omd.m18152h0(j3);
        int i3 = wk1.f66960a[c0098f.f2246J.ordinal()];
        if (i3 == 1) {
            float f2 = e28Var.f36621b;
            return ni0Var.mo12303a(f2 - ((int) (j & j2)), e28Var.f36623d - f2, Float.intBitsToFloat((int) (jM18152h1 & j2)));
        }
        if (i3 == 2) {
            float f3 = e28Var.f36620a;
            return ni0Var.mo12303a(f3 - ((int) (j >> c)), e28Var.f36622c - f3, Float.intBitsToFloat((int) (jM18152h1 >> c)));
        }
        gm5.m12750e();
        return f;
    }

    /* JADX INFO: renamed from: b1 */
    public static boolean m856b1(C0098f c0098f, e28 e28Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c0098f.m857a1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM860d1 = c0098f.m860d1(e28Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM860d1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM860d1 & 4294967295L))) <= 0.5f;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public final long m857a1() {
        long j = this.f2253Q;
        if (n84.m17279a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    @Override // p000.mt5
    /* JADX INFO: renamed from: c */
    public final void mo858c(long j) {
        int iM11651m;
        long j2;
        long jM857a1 = m857a1();
        this.f2253Q = j;
        int i = wk1.f66960a[this.f2246J.ordinal()];
        if (i == 1) {
            iM11651m = fa4.m11651m((int) (j & 4294967295L), (int) (jM857a1 & 4294967295L));
        } else {
            if (i != 2) {
                gm5.m12750e();
                return;
            }
            iM11651m = fa4.m11651m((int) (j >> 32), (int) (jM857a1 >> 32));
        }
        if (iM11651m >= 0) {
            return;
        }
        if (this.f2248L) {
            j2 = 0;
        } else {
            j2 = this.f2246J == Orientation.Vertical ? ((long) (((int) (jM857a1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM857a1 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        e28 e28Var = (e28) this.f2250N.mo0a();
        if (e28Var == null || this.f2254R || this.f2252P || !m856b1(this, e28Var, jM857a1, 0L, 2) || m856b1(this, e28Var, 0L, j3, 1)) {
            return;
        }
        this.f2252P = true;
        m859c1(j3);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m859c1(long j) {
        ni0 ni0Var = this.f2249M;
        if (ni0Var == null) {
            ni0Var = (ni0) thb.m22050i(this, pi0.f56227a);
        }
        ni0 ni0Var2 = ni0Var;
        if (this.f2254R) {
            l54.m15816c("launchAnimation called when previous animation was running");
        }
        ni0 ni0Var3 = this.f2249M;
        if (ni0Var3 == null) {
            ni0Var3 = (ni0) thb.m22050i(this, pi0.f56227a);
        }
        ni0Var3.getClass();
        ni0.f52748a.getClass();
        wfb.m23926u(m9971N0(), null, CoroutineStart.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, new C0119y(mi0.f51346b), ni0Var2, j, null), 1);
    }

    /* JADX INFO: renamed from: d1 */
    public final long m860d1(e28 e28Var, long j, long j2) {
        long jM18152h0 = omd.m18152h0(j);
        int i = wk1.f66960a[this.f2246J.ordinal()];
        if (i == 1) {
            ni0 ni0Var = this.f2249M;
            if (ni0Var == null) {
                ni0Var = (ni0) thb.m22050i(this, pi0.f56227a);
            }
            float f = e28Var.f36621b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ni0Var.mo12303a(f - ((int) (j2 & 4294967295L)), e28Var.f36623d - f, Float.intBitsToFloat((int) (jM18152h0 & 4294967295L))))) & 4294967295L);
        }
        if (i != 2) {
            gm5.m12750e();
            return 0L;
        }
        ni0 ni0Var2 = this.f2249M;
        if (ni0Var2 == null) {
            ni0Var2 = (ni0) thb.m22050i(this, pi0.f56227a);
        }
        float f2 = e28Var.f36620a;
        return (((long) Float.floatToRawIntBits(ni0Var2.mo12303a(f2 - ((int) (j2 >> 32)), e28Var.f36622c - f2, Float.intBitsToFloat((int) (jM18152h0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
