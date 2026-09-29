package gf;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p073df.C5168j;
import p338qd.C8573r0;

/* JADX INFO: renamed from: gf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5790a {

    /* JADX INFO: renamed from: d */
    public static final long f34991d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f34992e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final C5168j f34993a;

    /* JADX INFO: renamed from: b */
    public long f34994b;

    /* JADX INFO: renamed from: c */
    public int f34995c;

    public C5790a() {
        if (C8573r0.f45972i == null) {
            Pattern pattern = C5168j.f33168c;
            C8573r0.f45972i = new C8573r0();
        }
        C8573r0 c8573r0 = C8573r0.f45972i;
        if (C5168j.f33169d == null) {
            C5168j.f33169d = new C5168j(c8573r0);
        }
        this.f34993a = C5168j.f33169d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m12178a(int i10) {
        long jMin;
        boolean z10 = false;
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                synchronized (this) {
                    try {
                        this.f34995c = 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            }
            this.f34995c++;
            synchronized (this) {
                if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                    z10 = true;
                }
                try {
                    if (z10) {
                        double dPow = Math.pow(2.0d, this.f34995c);
                        this.f34993a.getClass();
                        jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f34992e);
                    } else {
                        jMin = f34991d;
                    }
                    this.f34993a.f33170a.getClass();
                    this.f34994b = System.currentTimeMillis() + jMin;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        } catch (Throwable th4) {
            throw th4;
        }
        throw th4;
    }
}
