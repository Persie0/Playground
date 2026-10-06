package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffe implements fgy {

    /* JADX INFO: renamed from: a */
    public static final nbh f21606a = nbh.m17259h("com/google/android/apps/camera/microvideo/FrameBufferMicrovideoFrameStore");

    /* JADX INFO: renamed from: c */
    private final kgg f21608c;

    /* JADX INFO: renamed from: d */
    private final kfc f21609d;

    /* JADX INFO: renamed from: e */
    private final List f21610e = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final List f21611f = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f21607b = new AtomicBoolean();

    public ffe(kgg kggVar, kfc kfcVar) {
        this.f21608c = kggVar;
        this.f21609d = kfcVar;
    }

    /* JADX INFO: renamed from: j */
    private static final mrp m8325j(long j) {
        return new ffa(j, 0);
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: a */
    public final synchronized long mo8326a() {
        if (this.f21607b.get()) {
            if (this.f21610e.isEmpty()) {
                return -1L;
            }
            kfd kfdVarMo7041b = ((key) mkv.m16515W(this.f21610e)).mo7041b();
            if (kfdVarMo7041b != null) {
                return kfdVarMo7041b.f35811b;
            }
            return -1L;
        }
        key keyVarMo9405e = this.f21609d.mo9405e();
        if (keyVarMo9405e == null) {
            return -1L;
        }
        try {
            kfd kfdVarMo7041b2 = keyVarMo9405e.mo7041b();
            long j = kfdVarMo7041b2 != null ? kfdVarMo7041b2.f35811b : -1L;
            keyVarMo9405e.close();
            return j;
        } catch (Throwable th) {
            try {
                keyVarMo9405e.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: b */
    public final synchronized kpw mo8327b(long j) {
        kpw kpwVarMo7043d = null;
        if (this.f21607b.get()) {
            for (key keyVar : this.f21610e) {
                kfd kfdVarMo7041b = keyVar.mo7041b();
                if (kfdVarMo7041b != null && kfdVarMo7041b.f35811b > j) {
                    return keyVar.mo7043d(this.f21608c);
                }
            }
            return null;
        }
        key keyVarMo9404d = this.f21609d.mo9404d(m8325j(j));
        if (keyVarMo9404d != null) {
            try {
                kpwVarMo7043d = keyVarMo9404d.mo7043d(this.f21608c);
            } catch (Throwable th) {
                try {
                    keyVarMo9404d.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        if (keyVarMo9404d != null) {
            keyVarMo9404d.close();
        }
        return kpwVarMo7043d;
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: c */
    public final synchronized kpw mo8328c(long j) {
        try {
            kpw kpwVarMo7043d = null;
            if (this.f21607b.get()) {
                for (key keyVar : this.f21610e) {
                    kfd kfdVarMo7041b = keyVar.mo7041b();
                    if (kfdVarMo7041b != null && kfdVarMo7041b.f35811b == j) {
                        return keyVar.mo7043d(this.f21608c);
                    }
                }
                return null;
            }
            key keyVarMo9404d = this.f21609d.mo9404d(new ffa(j, 1));
            if (keyVarMo9404d != null) {
                try {
                    kpwVarMo7043d = keyVarMo9404d.mo7043d(this.f21608c);
                } catch (Throwable th) {
                    try {
                        keyVarMo9404d.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            }
            if (keyVarMo9404d != null) {
                keyVarMo9404d.close();
            }
            return kpwVarMo7043d;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: d */
    public final synchronized kpw mo8329d() {
        kpw kpwVarMo7043d = null;
        if (this.f21607b.get()) {
            if (this.f21610e.isEmpty()) {
                return null;
            }
            return ((key) mkv.m16515W(this.f21610e)).mo7043d(this.f21608c);
        }
        key keyVarMo9406f = this.f21609d.mo9406f(jmb.f34347b);
        if (keyVarMo9406f != null) {
            try {
                kpwVarMo7043d = keyVarMo9406f.mo7043d(this.f21608c);
            } catch (Throwable th) {
                try {
                    keyVarMo9406f.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        if (keyVarMo9406f != null) {
            keyVarMo9406f.close();
        }
        return kpwVarMo7043d;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:18:0x0040, B:20:0x0046, B:24:0x0055), top: B:43:0x0040, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x000f, B:8:0x0015, B:10:0x0021, B:12:0x0027, B:15:0x0031, B:16:0x0034, B:21:0x0050, B:26:0x0059, B:34:0x0068, B:33:0x0065, B:30:0x0060, B:18:0x0040, B:20:0x0046, B:24:0x0055), top: B:42:0x0001, inners: #0, #2 }] */
    @Override // p000.fgy
    /* JADX INFO: renamed from: e */
    public final synchronized mrm mo8330e(long j) {
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        if (this.f21607b.get()) {
            Iterator it = this.f21610e.iterator();
            while (it.hasNext()) {
                kfd kfdVarMo7041b = ((key) it.next()).mo7041b();
                if (kfdVarMo7041b != null) {
                    long j2 = kfdVarMo7041b.f35811b;
                    if (j2 > j) {
                        mrmVarM16829i2 = mrm.m16829i(Long.valueOf(j2));
                        return mrmVarM16829i2;
                    }
                }
            }
            mrmVarM16829i2 = mqu.f41450a;
            return mrmVarM16829i2;
        }
        key keyVarMo9404d = this.f21609d.mo9404d(m8325j(j));
        if (keyVarMo9404d == null) {
            mrmVarM16829i = mqu.f41450a;
            if (keyVarMo9404d != null) {
                keyVarMo9404d.close();
            }
            return mrmVarM16829i;
        }
        try {
            kfd kfdVarMo7041b2 = keyVarMo9404d.mo7041b();
            if (kfdVarMo7041b2 != null) {
                mrmVarM16829i = mrm.m16829i(Long.valueOf(kfdVarMo7041b2.f35811b));
                keyVarMo9404d.close();
            } else {
                mrmVarM16829i = mqu.f41450a;
                if (keyVarMo9404d != null) {
                    keyVarMo9404d.close();
                }
            }
            return mrmVarM16829i;
        } catch (Throwable th) {
            if (keyVarMo9404d != null) {
                try {
                    keyVarMo9404d.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: f */
    public final synchronized List mo8331f(long j) {
        ArrayList arrayList;
        this.f21607b.set(true);
        arrayList = new ArrayList();
        nba it = ((mws) this.f21609d.mo9409i()).iterator();
        while (it.hasNext()) {
            key keyVar = (key) it.next();
            kfd kfdVarMo7041b = keyVar.mo7041b();
            if (kfdVarMo7041b != null) {
                long j2 = kfdVarMo7041b.f35811b;
                if (j2 > j) {
                    arrayList.add(Long.valueOf(j2));
                    this.f21610e.add(keyVar);
                }
            }
            keyVar.close();
        }
        return arrayList;
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: g */
    public final synchronized void mo8332g(fgx fgxVar, Executor executor) {
        this.f21611f.add(fgxVar);
        this.f21609d.mo9411k(new ffc(this, fgxVar, executor, 0));
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: h */
    public final synchronized void mo8333h() {
        Iterator it = this.f21610e.iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
        this.f21610e.clear();
        this.f21607b.set(false);
    }

    @Override // p000.fgy
    /* JADX INFO: renamed from: i */
    public final void mo8334i() {
    }
}
