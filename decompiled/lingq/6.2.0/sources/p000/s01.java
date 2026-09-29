package p000;

import androidx.compose.foundation.gestures.Orientation;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class s01 implements yr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60109a;

    /* JADX INFO: renamed from: b */
    public long f60110b;

    /* JADX INFO: renamed from: c */
    public Object f60111c;

    public s01(int i) {
        this.f60109a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f60110b = 0L;
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m20989e(s01 s01Var, long j, float f) {
        long jM12825f = gq6.m12825f(s01Var.f60110b, j);
        s01Var.f60110b = jM12825f;
        if ((((Orientation) s01Var.f60111c) == null ? gq6.m12822c(jM12825f) : Math.abs(s01Var.m20995g(jM12825f))) < f) {
            return 9205357640488583168L;
        }
        Orientation orientation = (Orientation) s01Var.f60111c;
        long j2 = s01Var.f60110b;
        if (orientation == null) {
            float fM12822c = gq6.m12822c(j2);
            return gq6.m12824e(s01Var.f60110b, gq6.m12826g(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / fM12822c)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / fM12822c)) & 4294967295L)));
        }
        float fM20995g = s01Var.m20995g(j2) - (Math.signum(s01Var.m20995g(s01Var.f60110b)) * f);
        long j3 = s01Var.f60110b;
        Orientation orientation2 = (Orientation) s01Var.f60111c;
        Orientation orientation3 = Orientation.Horizontal;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation2 == orientation3 ? j3 & 4294967295L : j3 >> 32));
        if (((Orientation) s01Var.f60111c) == orientation3) {
            return (((long) Float.floatToRawIntBits(fM20995g)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fM20995g)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    /* JADX INFO: renamed from: a */
    public void m20990a(int i) {
        if (i < 64) {
            this.f60110b &= ~(1 << i);
            return;
        }
        s01 s01Var = (s01) this.f60111c;
        if (s01Var != null) {
            s01Var.m20990a(i - 64);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m20991b(int i) {
        s01 s01Var = (s01) this.f60111c;
        if (s01Var == null) {
            long j = this.f60110b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.f60110b);
        }
        return Long.bitCount(this.f60110b) + s01Var.m20991b(i - 64);
    }

    /* JADX INFO: renamed from: c */
    public void m20992c() {
        if (((s01) this.f60111c) == null) {
            this.f60111c = new s01(0);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m20993d(int i) {
        if (i < 64) {
            return ((1 << i) & this.f60110b) != 0;
        }
        m20992c();
        return ((s01) this.f60111c).m20993d(i - 64);
    }

    /* JADX INFO: renamed from: f */
    public void m20994f(int i, boolean z) {
        if (i >= 64) {
            m20992c();
            ((s01) this.f60111c).m20994f(i - 64, z);
            return;
        }
        long j = this.f60110b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f60110b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m20998j(i);
        } else {
            m20990a(i);
        }
        if (z2 || ((s01) this.f60111c) != null) {
            m20992c();
            ((s01) this.f60111c).m20994f(0, z2);
        }
    }

    /* JADX INFO: renamed from: g */
    public float m20995g(long j) {
        return Float.intBitsToFloat((int) (((Orientation) this.f60111c) == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public boolean m20996h(int i) {
        if (i >= 64) {
            m20992c();
            return ((s01) this.f60111c).m20996h(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f60110b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f60110b = j3;
        long j4 = j - 1;
        this.f60110b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        s01 s01Var = (s01) this.f60111c;
        if (s01Var != null) {
            if (s01Var.m20993d(0)) {
                m20998j(63);
            }
            ((s01) this.f60111c).m20996h(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public void m20997i() {
        this.f60110b = 0L;
        s01 s01Var = (s01) this.f60111c;
        if (s01Var != null) {
            s01Var.m20997i();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m20998j(int i) {
        if (i < 64) {
            this.f60110b |= 1 << i;
        } else {
            m20992c();
            ((s01) this.f60111c).m20998j(i - 64);
        }
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void mo321m(Exception exc) {
        sq5 sq5Var = (sq5) this.f60111c;
        ((AtomicLong) sq5Var.f61250d).set(this.f60110b);
    }

    public String toString() {
        switch (this.f60109a) {
            case 0:
                if (((s01) this.f60111c) == null) {
                    return Long.toBinaryString(this.f60110b);
                }
                return ((s01) this.f60111c).toString() + "xx" + Long.toBinaryString(this.f60110b);
            default:
                return super.toString();
        }
    }

    public s01(gr7 gr7Var) {
        this.f60109a = 4;
        lda.m16130p(gr7Var);
        this.f60111c = gr7Var;
    }

    public /* synthetic */ s01(Object obj, long j, int i) {
        this.f60109a = i;
        this.f60111c = obj;
        this.f60110b = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s01(Orientation orientation) {
        this(orientation, 0L, 2);
        this.f60109a = 2;
    }
}
