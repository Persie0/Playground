package p000;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v80 implements j02 {

    /* JADX INFO: renamed from: a */
    public final boolean f65000a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f65001b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f65002c;

    /* JADX INFO: renamed from: d */
    public k02 f65003d;

    public v80(boolean z) {
        this.f65000a = z;
    }

    /* JADX INFO: renamed from: j */
    public final void m23164j(int i) {
        k02 k02Var = this.f65003d;
        String str = uma.f64080a;
        for (int i2 = 0; i2 < this.f65002c; i2++) {
            u52 u52Var = (u52) this.f65001b.get(i2);
            boolean z = this.f65000a;
            synchronized (u52Var) {
                ImmutableList immutableList = u52.f63412p;
                if (z && !k02Var.m14757a(8)) {
                    u52Var.f63427i += (long) i;
                }
            }
        }
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: l */
    public final void mo10002l(u52 u52Var) {
        u52Var.getClass();
        ArrayList arrayList = this.f65001b;
        if (arrayList.contains(u52Var)) {
            return;
        }
        arrayList.add(u52Var);
        this.f65002c++;
    }

    /* JADX INFO: renamed from: m */
    public final void m23165m() {
        k02 k02Var = this.f65003d;
        String str = uma.f64080a;
        for (int i = 0; i < this.f65002c; i++) {
            u52 u52Var = (u52) this.f65001b.get(i);
            boolean z = this.f65000a;
            synchronized (u52Var) {
                try {
                    ImmutableList immutableList = u52.f63412p;
                    if (z && !k02Var.m14757a(8)) {
                        bna.m3987z(u52Var.f63425g > 0);
                        u52Var.f63422d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (jElapsedRealtime - u52Var.f63426h);
                        u52Var.f63428j += (long) i2;
                        long j = u52Var.f63429k;
                        long j2 = u52Var.f63427i;
                        u52Var.f63429k = j + j2;
                        if (i2 > 0) {
                            u52Var.f63424f.m235a((int) Math.sqrt(j2), (j2 * 8000.0f) / i2);
                            if (u52Var.f63428j >= 2000 || u52Var.f63429k >= 524288) {
                                u52Var.f63430l = (long) u52Var.f63424f.m239e();
                            }
                            u52Var.m22473c(i2, u52Var.f63427i, u52Var.f63430l);
                            u52Var.f63426h = jElapsedRealtime;
                            u52Var.f63427i = 0L;
                        }
                        u52Var.f63425g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f65003d = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m23166n() {
        for (int i = 0; i < this.f65002c; i++) {
            ((u52) this.f65001b.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m23167q(k02 k02Var) {
        this.f65003d = k02Var;
        for (int i = 0; i < this.f65002c; i++) {
            u52 u52Var = (u52) this.f65001b.get(i);
            boolean z = this.f65000a;
            synchronized (u52Var) {
                try {
                    ImmutableList immutableList = u52.f63412p;
                    if (z && !k02Var.m14757a(8)) {
                        if (u52Var.f63425g == 0) {
                            u52Var.f63422d.getClass();
                            u52Var.f63426h = SystemClock.elapsedRealtime();
                        }
                        u52Var.f63425g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
