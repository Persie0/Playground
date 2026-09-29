package p000;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y82 implements f92, oba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f69457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f69459c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f69460d;

    public /* synthetic */ y82(Object obj, Object obj2, boolean z, Object obj3) {
        this.f69458b = obj;
        this.f69459c = obj2;
        this.f69457a = z;
        this.f69460d = obj3;
    }

    @Override // p000.oba
    /* JADX INFO: renamed from: b */
    public void mo17902b(Exception exc) throws Throwable {
        v68 v68Var = (v68) this.f69458b;
        wr9 wr9Var = (wr9) this.f69459c;
        y20 y20Var = (y20) this.f69460d;
        if (exc != null) {
            wr9Var.m24139c(exc);
            return;
        }
        if (this.f69457a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new mv5(6, v68Var, countDownLatch)).start();
            ExecutorService executorService = hna.f42670a;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jNanoTime = jNanoTime2 - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        wr9Var.m24140d(y20Var);
    }

    @Override // p000.f92
    /* JADX INFO: renamed from: i */
    public List mo394i(int i, j8a j8aVar, int[] iArr) {
        i92 i92Var = (i92) this.f69458b;
        d92 d92Var = (d92) this.f69459c;
        int[] iArr2 = (int[]) this.f69460d;
        i92Var.getClass();
        w82 w82Var = new w82(i92Var, d92Var);
        int i2 = iArr2[i];
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (int i3 = 0; i3 < j8aVar.f45214a; i3++) {
            c14VarM6284m.m3157b(new z82(i, j8aVar, i3, d92Var, iArr[i3], this.f69457a, w82Var, i2));
        }
        return c14VarM6284m.m4280g();
    }
}
