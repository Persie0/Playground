package p000;

import android.hardware.HardwareBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knf {

    /* JADX INFO: renamed from: a */
    private final int f36593a;

    /* JADX INFO: renamed from: b */
    private final byte[] f36594b;

    /* JADX INFO: renamed from: c */
    private final kbf f36595c;

    /* JADX INFO: renamed from: d */
    private long f36596d;

    /* JADX INFO: renamed from: e */
    private long f36597e;

    /* JADX INFO: renamed from: f */
    private int f36598f;

    /* JADX INFO: renamed from: g */
    private long f36599g;

    /* JADX INFO: renamed from: h */
    private long f36600h;

    /* JADX INFO: renamed from: i */
    private int f36601i;

    /* JADX INFO: renamed from: j */
    private final khb f36602j;

    public knf(khb khbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36602j = khbVar;
        int width = (((((HardwareBuffer) khbVar.f36008a).getWidth() * ((HardwareBuffer) khbVar.f36008a).getHeight()) * ((HardwareBuffer) khbVar.f36008a).getLayers()) / 104) * 104;
        this.f36593a = width;
        this.f36594b = new byte[width];
        this.f36595c = new kbf(knk.f36612b, width / 104);
    }

    /* JADX INFO: renamed from: c */
    private final synchronized void m14593c() {
        this.f36602j.m14251q(this.f36594b, 0, 0, this.f36593a);
        this.f36596d = 0L;
        this.f36597e = 0L;
        this.f36598f = 0;
        this.f36599g = 0L;
        this.f36600h = 0L;
        this.f36601i = 0;
        for (int i = 0; i < this.f36593a; i += 104) {
            long jM14641f = kot.m14641f(this.f36594b, i);
            if (jM14641f > this.f36597e) {
                this.f36597e = jM14641f;
                this.f36598f = i;
            }
            if (jM14641f != 0) {
                long j = this.f36600h;
                if (j == 0 || jM14641f < j) {
                    this.f36600h = jM14641f;
                    this.f36601i = i;
                }
            }
        }
        if (this.f36597e > 0) {
            this.f36596d = kot.m14642g(this.f36594b, this.f36598f);
        }
        if (this.f36600h > 0) {
            this.f36599g = kot.m14642g(this.f36594b, this.f36601i);
        }
    }

    /* JADX INFO: renamed from: d */
    private final synchronized void m14594d() {
        long jM14641f;
        if (this.f36597e != 0 && this.f36600h != 0) {
            m14595e(this.f36598f);
            long jM14641f2 = kot.m14641f(this.f36594b, this.f36598f);
            long j = this.f36597e;
            if (jM14641f2 != j) {
                m14593c();
                return;
            }
            int i = (this.f36598f + 104) % this.f36593a;
            long j2 = j + 1;
            while (true) {
                m14595e(i);
                jM14641f = kot.m14641f(this.f36594b, i);
                if (jM14641f != j2) {
                    break;
                }
                this.f36598f = i;
                this.f36597e = j2;
                this.f36596d = kot.m14642g(this.f36594b, i);
                i = (i + 104) % this.f36593a;
                j2++;
            }
            if (jM14641f != 0 && jM14641f > this.f36600h) {
                this.f36601i = i;
                this.f36600h = jM14641f;
                this.f36599g = kot.m14642g(this.f36594b, i);
            }
            return;
        }
        m14593c();
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m14595e(int i) {
        this.f36602j.m14251q(this.f36594b, i, i, 104);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m14596a(long j, long j2, List list) {
        list.clear();
        m14594d();
        if (j <= this.f36596d) {
            long j3 = this.f36599g;
            if (j2 >= j3) {
                long j4 = this.f36600h;
                int i = this.f36601i;
                while (true) {
                    if (j3 >= j && j3 <= j2) {
                        knj knjVar = (knj) this.f36595c.m13931a();
                        byte[] bArr = this.f36594b;
                        knjVar.f36603a = kot.m14640e(bArr, i);
                        knjVar.f36604b = kot.m14640e(bArr, i + 4);
                        knjVar.f36605c = kot.m14640e(bArr, i + 8);
                        knjVar.f36606d = kot.m14641f(bArr, i);
                        knjVar.f36607e = kot.m14642g(bArr, i);
                        knjVar.f36608f = kot.m14639d(bArr, i + 24);
                        knjVar.f36609g = kot.m14639d(bArr, i + 28);
                        knjVar.f36610h = kot.m14639d(bArr, i + 32);
                        list.add(knjVar);
                    }
                    i += 104;
                    if (i >= this.f36593a) {
                        i = 0;
                    }
                    long jM14641f = kot.m14641f(this.f36594b, i);
                    if (jM14641f == 0 || jM14641f < j4) {
                        break;
                        break;
                    }
                    long jM14642g = kot.m14642g(this.f36594b, i);
                    if (jM14642g > j2) {
                        break;
                    }
                    j3 = jM14642g;
                    j4 = jM14641f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m14597b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f36595c.m13932b((knj) it.next());
        }
        list.clear();
    }
}
