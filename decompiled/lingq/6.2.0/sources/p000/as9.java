package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class as9 {

    /* JADX INFO: renamed from: k */
    public static final Logger f7431k;

    /* JADX INFO: renamed from: l */
    public static final as9 f7432l;

    /* JADX INFO: renamed from: a */
    public final cc4 f7433a;

    /* JADX INFO: renamed from: b */
    public final Logger f7434b;

    /* JADX INFO: renamed from: c */
    public int f7435c;

    /* JADX INFO: renamed from: d */
    public boolean f7436d;

    /* JADX INFO: renamed from: e */
    public long f7437e;

    /* JADX INFO: renamed from: f */
    public int f7438f;

    /* JADX INFO: renamed from: g */
    public int f7439g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f7440h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7441i;

    /* JADX INFO: renamed from: j */
    public final RunnableC3795yg f7442j;

    static {
        Logger logger = Logger.getLogger(as9.class.getName());
        logger.getClass();
        f7431k = logger;
        jcb jcbVar = new jcb(AbstractC3393o1.m17738m(new StringBuilder(), kcb.f47052b, " TaskRunner"), true);
        cc4 cc4Var = new cc4();
        cc4Var.f9881a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), jcbVar);
        f7432l = new as9(cc4Var);
    }

    public as9(cc4 cc4Var) {
        Logger logger = f7431k;
        logger.getClass();
        this.f7433a = cc4Var;
        this.f7434b = logger;
        this.f7435c = 10000;
        this.f7440h = new ArrayList();
        this.f7441i = new ArrayList();
        this.f7442j = new RunnableC3795yg(this, 8);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3020a(as9 as9Var, sr9 sr9Var, long j, boolean z) {
        TimeZone timeZone = kcb.f47051a;
        zr9 zr9Var = sr9Var.f61322c;
        zr9Var.getClass();
        if (zr9Var.f72012d != sr9Var) {
            C3386nv.m17633t("Check failed.");
            return;
        }
        boolean z2 = zr9Var.f72014f;
        zr9Var.f72014f = false;
        zr9Var.f72012d = null;
        as9Var.f7440h.remove(zr9Var);
        if (j != -1 && !z2 && !zr9Var.f72011c) {
            zr9Var.m25754e(sr9Var, j, true);
        }
        if (zr9Var.f72013e.isEmpty()) {
            return;
        }
        as9Var.f7441i.add(zr9Var);
        if (z) {
            return;
        }
        as9Var.m3024e();
    }

    /* JADX INFO: renamed from: b */
    public final sr9 m3021b() {
        boolean z;
        TimeZone timeZone = kcb.f47051a;
        while (true) {
            ArrayList arrayList = this.f7441i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            sr9 sr9Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                sr9 sr9Var2 = (sr9) ((zr9) it.next()).f72013e.get(0);
                long jMax = Math.max(0L, sr9Var2.f61323d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (sr9Var != null) {
                        z = true;
                        break;
                    }
                    sr9Var = sr9Var2;
                }
            }
            ArrayList arrayList2 = this.f7440h;
            if (sr9Var != null) {
                TimeZone timeZone2 = kcb.f47051a;
                sr9Var.f61323d = -1L;
                zr9 zr9Var = sr9Var.f61322c;
                zr9Var.getClass();
                zr9Var.f72013e.remove(sr9Var);
                arrayList.remove(zr9Var);
                zr9Var.f72012d = sr9Var;
                arrayList2.add(zr9Var);
                if (z || (!this.f7436d && !arrayList.isEmpty())) {
                    m3024e();
                }
                return sr9Var;
            }
            if (this.f7436d) {
                if (jMin >= this.f7437e - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.f7436d = true;
            this.f7437e = jNanoTime + jMin;
            try {
                try {
                    TimeZone timeZone3 = kcb.f47051a;
                    if (jMin > 0) {
                        long j = jMin / 1000000;
                        long j2 = jMin - (1000000 * j);
                        if (j > 0 || jMin > 0) {
                            wait(j, (int) j2);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = kcb.f47051a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((zr9) arrayList2.get(size)).m25752a();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        zr9 zr9Var2 = (zr9) arrayList.get(size2);
                        zr9Var2.m25752a();
                        if (zr9Var2.f72013e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f7436d = false;
            } catch (Throwable th) {
                this.f7436d = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3022c(zr9 zr9Var) {
        zr9Var.getClass();
        TimeZone timeZone = kcb.f47051a;
        if (zr9Var.f72012d == null) {
            boolean zIsEmpty = zr9Var.f72013e.isEmpty();
            ArrayList arrayList = this.f7441i;
            if (zIsEmpty) {
                arrayList.remove(zr9Var);
            } else {
                byte[] bArr = icb.f43946a;
                arrayList.getClass();
                if (!arrayList.contains(zr9Var)) {
                    arrayList.add(zr9Var);
                }
            }
        }
        if (this.f7436d) {
            notify();
        } else {
            m3024e();
        }
    }

    /* JADX INFO: renamed from: d */
    public final zr9 m3023d() {
        int i;
        synchronized (this) {
            i = this.f7435c;
            this.f7435c = i + 1;
        }
        return new zr9(this, ux5.m22988k(i, "Q"));
    }

    /* JADX INFO: renamed from: e */
    public final void m3024e() {
        TimeZone timeZone = kcb.f47051a;
        int i = this.f7438f;
        if (i > this.f7439g) {
            return;
        }
        this.f7438f = i + 1;
        RunnableC3795yg runnableC3795yg = this.f7442j;
        runnableC3795yg.getClass();
        ((ThreadPoolExecutor) this.f7433a.f9881a).execute(runnableC3795yg);
    }
}
