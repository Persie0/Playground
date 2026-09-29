package p000;

import com.google.android.gms.internal.measurement.C0959c;
import com.google.android.gms.internal.measurement.C0960d;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeh;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class ghb {

    /* JADX INFO: renamed from: a */
    public int f40835a;

    /* JADX INFO: renamed from: b */
    public int f40836b;

    /* JADX INFO: renamed from: c */
    public k80 f40837c;

    /* JADX INFO: renamed from: h */
    public static ghb m12663h(InputStream inputStream, int i) {
        if (i <= 0) {
            C3386nv.m17626m("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new C0960d(inputStream, i);
        }
        C0959c c0959c = new C0959c(kib.f47356a);
        try {
            c0959c.mo5373a(0);
            return c0959c;
        } catch (zzaeh e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m12664j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* JADX INFO: renamed from: k */
    public static long m12665k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo5360A();

    /* JADX INFO: renamed from: B */
    public abstract int mo5361B();

    /* JADX INFO: renamed from: C */
    public abstract int mo5362C();

    /* JADX INFO: renamed from: D */
    public abstract long mo5363D();

    /* JADX INFO: renamed from: E */
    public abstract int mo5364E();

    /* JADX INFO: renamed from: F */
    public abstract long mo5365F();

    /* JADX INFO: renamed from: G */
    public abstract int mo5366G();

    /* JADX INFO: renamed from: H */
    public abstract long mo5367H();

    /* JADX INFO: renamed from: a */
    public abstract int mo5373a(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo5374b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo5375c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo5376d();

    /* JADX INFO: renamed from: e */
    public abstract int mo5377e();

    /* JADX INFO: renamed from: f */
    public abstract int mo5378f(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: g */
    public abstract void mo5379g(int i);

    /* JADX INFO: renamed from: i */
    public final void m12666i() throws zzaeh {
        boolean zMo5382n;
        do {
            int iMo5380l = mo5380l();
            if (iMo5380l == 0) {
                return;
            }
            int i = this.f40835a;
            int i2 = this.f40836b;
            if (i + i2 >= 100) {
                uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.f40836b = i2 + 1;
                zMo5382n = mo5382n(iMo5380l);
                this.f40836b--;
            }
        } while (zMo5382n);
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo5380l();

    /* JADX INFO: renamed from: m */
    public abstract void mo5381m(int i);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo5382n(int i);

    /* JADX INFO: renamed from: o */
    public abstract double mo5383o();

    /* JADX INFO: renamed from: p */
    public abstract float mo5384p();

    /* JADX INFO: renamed from: q */
    public abstract long mo5385q();

    /* JADX INFO: renamed from: r */
    public abstract long mo5386r();

    /* JADX INFO: renamed from: s */
    public abstract int mo5387s();

    /* JADX INFO: renamed from: t */
    public abstract long mo5388t();

    /* JADX INFO: renamed from: u */
    public abstract int mo5389u();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo5390v();

    /* JADX INFO: renamed from: w */
    public abstract String mo5391w();

    /* JADX INFO: renamed from: x */
    public abstract String mo5392x();

    /* JADX INFO: renamed from: y */
    public abstract zzacr mo5393y();

    /* JADX INFO: renamed from: z */
    public abstract byte[] mo5394z();
}
