package p000;

import android.os.SystemClock;
import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class eqa {

    /* JADX INFO: renamed from: a */
    public final C3156jq f37726a;

    /* JADX INFO: renamed from: b */
    public final ypa f37727b;

    /* JADX INFO: renamed from: c */
    public final at2 f37728c = new at2();

    /* JADX INFO: renamed from: d */
    public final gh1 f37729d = new gh1(3);

    /* JADX INFO: renamed from: e */
    public final gh1 f37730e = new gh1(3);

    /* JADX INFO: renamed from: f */
    public final yh0 f37731f;

    /* JADX INFO: renamed from: g */
    public final zpa f37732g;

    /* JADX INFO: renamed from: h */
    public long f37733h;

    /* JADX INFO: renamed from: i */
    public long f37734i;

    /* JADX INFO: renamed from: j */
    public long f37735j;

    /* JADX INFO: renamed from: k */
    public lsa f37736k;

    /* JADX INFO: renamed from: l */
    public long f37737l;

    public eqa(C3156jq c3156jq, ypa ypaVar, zpa zpaVar) {
        this.f37726a = c3156jq;
        this.f37727b = ypaVar;
        this.f37732g = zpaVar;
        yh0 yh0Var = new yh0();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        yh0Var.f69834a = 0;
        yh0Var.f69835b = -1;
        yh0Var.f69836c = 0;
        yh0Var.f69838e = new long[iHighestOneBit];
        yh0Var.f69837d = iHighestOneBit - 1;
        this.f37731f = yh0Var;
        this.f37733h = -9223372036854775807L;
        this.f37736k = lsa.f50084d;
        this.f37734i = -9223372036854775807L;
        this.f37735j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m11321a(long j, long j2) {
        final C3156jq c3156jq = this.f37726a;
        r92 r92Var = (r92) c3156jq.f45991b;
        while (true) {
            yh0 yh0Var = this.f37731f;
            int i = yh0Var.f69836c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                uk9.m22784s();
                return;
            }
            long j3 = ((long[]) yh0Var.f69838e)[yh0Var.f69834a];
            Long l = (Long) this.f37730e.m12637p(j3);
            ypa ypaVar = this.f37727b;
            if (l != null && l.longValue() != this.f37737l) {
                this.f37737l = l.longValue();
                ypaVar.m25266e(2);
            }
            long j4 = this.f37737l;
            ypa ypaVar2 = this.f37727b;
            at2 at2Var = this.f37728c;
            int iM25262a = ypaVar2.m25262a(j3, j, j2, j4, false, false, at2Var);
            if (iM25262a != 5 && iM25262a != 4) {
                this.f37732g.m25736a(j3, at2Var.f7454a);
            }
            final int i2 = 0;
            final int i3 = 1;
            if (iM25262a == 0 || iM25262a == 1) {
                this.f37734i = j3;
                boolean z = iM25262a == 0;
                long jM25142d = yh0Var.m25142d();
                lsa lsaVar = (lsa) this.f37729d.m12637p(jM25142d);
                if (lsaVar != null && !lsaVar.equals(lsa.f50084d) && !lsaVar.equals(this.f37736k)) {
                    this.f37736k = lsaVar;
                    lc3 lc3Var = new lc3();
                    lc3Var.f49460u = lsaVar.f50085a;
                    lc3Var.f49461v = lsaVar.f50086b;
                    lc3Var.f49453n = ez5.m11402l("video/raw");
                    c3156jq.f45990a = new C0713b(lc3Var);
                    r92Var.f58938i.execute(new RunnableC0806bd(19, c3156jq, lsaVar));
                }
                long jNanoTime = z ? System.nanoTime() : at2Var.f7455b;
                i3 = ypaVar.f70267e == 3 ? 0 : 1;
                ypaVar.f70267e = 3;
                ypaVar.f70274l.getClass();
                ypaVar.f70269g = uma.m22797B(SystemClock.elapsedRealtime());
                if (i3 != 0 && r92Var.f58934e != null) {
                    r92Var.f58938i.execute(new Runnable() { // from class: q92
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            C3156jq c3156jq2 = c3156jq;
                            switch (i4) {
                                case 0:
                                    ((r92) c3156jq2.f45991b).f58937h.mo4179b();
                                    break;
                                default:
                                    ((r92) c3156jq2.f45991b).f58937h.mo4180c();
                                    break;
                            }
                        }
                    });
                }
                C0713b c0713b = (C0713b) c3156jq.f45990a;
                r92Var.f58939j.mo12219c(jM25142d, jNanoTime, c0713b == null ? new C0713b(new lc3()) : c0713b, null);
                cu5 cu5Var = (cu5) r92Var.f58933d.remove();
                cu5Var.f34546c.m12166N0(cu5Var.f34544a, cu5Var.f34545b, jNanoTime);
            } else if (iM25262a == 2 || iM25262a == 3) {
                this.f37734i = j3;
                yh0Var.m25142d();
                r92Var.f58938i.execute(new Runnable() { // from class: q92
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        C3156jq c3156jq2 = c3156jq;
                        switch (i4) {
                            case 0:
                                ((r92) c3156jq2.f45991b).f58937h.mo4179b();
                                break;
                            default:
                                ((r92) c3156jq2.f45991b).f58937h.mo4180c();
                                break;
                        }
                    }
                });
                cu5 cu5Var2 = (cu5) r92Var.f58933d.remove();
                fu5 fu5Var = cu5Var2.f34546c;
                st5 st5Var = cu5Var2.f34544a;
                int i4 = cu5Var2.f34545b;
                g8d.m12416a("dropVideoBuffer");
                st5Var.mo10720h(i4);
                g8d.m12417b();
                fu5Var.m12174S0(0, 1);
            } else {
                if (iM25262a != 4) {
                    if (iM25262a == 5) {
                        return;
                    }
                    C3386nv.m17633t(String.valueOf(iM25262a));
                    return;
                }
                this.f37734i = j3;
            }
        }
    }
}
