package p000;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdh implements gdm, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f24293a = nbh.m17259h("com/google/android/apps/camera/one/smartmetering/PckSmartMeteringController");

    /* JADX INFO: renamed from: d */
    public final fwo f24296d;

    /* JADX INFO: renamed from: e */
    public final Executor f24297e;

    /* JADX INFO: renamed from: f */
    public final gom f24298f;

    /* JADX INFO: renamed from: g */
    public final kbz f24299g;

    /* JADX INFO: renamed from: i */
    public int f24301i;

    /* JADX INFO: renamed from: j */
    public boolean f24302j;

    /* JADX INFO: renamed from: k */
    public final gde f24303k;

    /* JADX INFO: renamed from: l */
    public final gdw f24304l;

    /* JADX INFO: renamed from: m */
    public final gva f24305m;

    /* JADX INFO: renamed from: n */
    private final kfc f24306n;

    /* JADX INFO: renamed from: o */
    private final gdf f24307o;

    /* JADX INFO: renamed from: q */
    private kba f24309q;

    /* JADX INFO: renamed from: r */
    private mrn f24310r;

    /* JADX INFO: renamed from: b */
    public final Object f24294b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f24295c = new Object();

    /* JADX INFO: renamed from: h */
    public boolean f24300h = false;

    /* JADX INFO: renamed from: p */
    private final ExecutorService f24308p = jzn.m13824l("waitForFrame");

    public gdh(kfc kfcVar, msi msiVar, gde gdeVar, fwo fwoVar, gdw gdwVar, gva gvaVar, Executor executor, Set set, kbz kbzVar, byte[] bArr) {
        this.f24306n = kfcVar;
        this.f24303k = gdeVar;
        this.f24296d = fwoVar;
        this.f24304l = gdwVar;
        this.f24305m = gvaVar;
        this.f24307o = new gdf(this, msiVar);
        this.f24297e = executor;
        this.f24298f = new gom(set);
        this.f24299g = kbzVar;
    }

    /* JADX INFO: renamed from: d */
    private final void m9072d() {
        synchronized (this.f24294b) {
            if (this.f24309q != null) {
                this.f24299g.mo13961e("close");
                kba kbaVar = this.f24309q;
                kbaVar.getClass();
                kbaVar.close();
                this.f24299g.mo13962f();
                this.f24309q = null;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m9073e(long j) {
        eqd eqdVar = new eqd(this, j, 7);
        try {
            try {
                this.f24299g.mo13961e("waitFuture");
                this.f24308p.submit(eqdVar).get();
                this.f24299g.mo13962f();
            } catch (RejectedExecutionException e) {
                ((nbe) ((nbe) ((nbe) f24293a.m17251b()).mo17283h(e)).mo17276G(2570)).mo17292q("Error trying to wait for frame %d", j);
                throw new ExecutionException(e);
            }
        } catch (Throwable th) {
            this.f24299g.mo13962f();
            throw th;
        }
    }

    @Override // p000.gdm
    /* JADX INFO: renamed from: a */
    public final mrm mo9074a() {
        mrm mrmVarM9069a;
        synchronized (this.f24295c) {
            mrmVarM9069a = this.f24303k.m9069a();
        }
        return mrmVarM9069a;
    }

    /* JADX INFO: renamed from: b */
    public final void m9075b() {
        eip eipVar;
        synchronized (this.f24294b) {
            if (this.f24300h) {
                return;
            }
            if (this.f24301i <= 0 && this.f24309q == null) {
                gdf gdfVar = this.f24307o;
                kfc kfcVar = this.f24306n;
                synchronized (gdfVar.f24285a) {
                    kfcVar.mo9411k(gdfVar);
                    gdfVar.f24286b = true;
                    eipVar = new eip(gdfVar, kfcVar, 17);
                }
                this.f24309q = eipVar;
            }
        }
    }

    @Override // p000.gdm
    /* JADX INFO: renamed from: c */
    public final gdg mo9076c(long j) {
        mrn mrnVar;
        kbz kbzVar;
        gdg gdgVar;
        kbz kbzVar2;
        synchronized (this.f24294b) {
            if (this.f24300h) {
                throw new kec("SmartMeteringController already closed");
            }
            this.f24296d.m8902i();
            this.f24299g.mo13961e("pauseLoop");
            m9072d();
            this.f24299g.mo13962f();
            int i = this.f24301i;
            if (i > 0) {
                this.f24301i = i + 1;
                return new gdg(this, this.f24310r);
            }
            synchronized (this.f24295c) {
                mrnVar = null;
                try {
                    try {
                        this.f24299g.mo13961e("waitForMeteringFrame");
                        long jMin = Math.min(j, this.f24296d.m8902i());
                        int i2 = 0;
                        while (i2 < 10) {
                            m9073e(((long) i2) + jMin);
                            i2++;
                            this.f24299g.mo13961e("attempt-" + i2);
                            try {
                                try {
                                    key keyVarMo9407g = this.f24306n.mo9407g();
                                    if (keyVarMo9407g == null) {
                                        kbzVar2 = this.f24299g;
                                    } else {
                                        try {
                                            kfd kfdVarMo7041b = keyVarMo9407g.mo7041b();
                                            kfdVarMo7041b.getClass();
                                            if (kfdVarMo7041b.f35812c >= j) {
                                                this.f24299g.mo13961e("awaitMetadata");
                                                kfv.m14173v(keyVarMo9407g);
                                                this.f24299g.mo13962f();
                                                if (keyVarMo9407g.mo7048i()) {
                                                    kmg kmgVarMo14193c = this.f24305m.m9784a(keyVarMo9407g).m9492a().mo14193c();
                                                    kpp kppVarMo7042c = keyVarMo9407g.mo7042c();
                                                    if (kppVarMo7042c != null) {
                                                        mrn mrnVarM16830a = mrn.m16830a(kmgVarMo14193c, kppVarMo7042c);
                                                        keyVarMo9407g.close();
                                                        this.f24299g.mo13962f();
                                                        mrnVar = mrnVarM16830a;
                                                        break;
                                                    }
                                                }
                                            }
                                            keyVarMo9407g.close();
                                            kbzVar2 = this.f24299g;
                                        } catch (Throwable th) {
                                            try {
                                                keyVarMo9407g.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                } catch (Exception e) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (InterruptedException e2) {
                                    this.f24299g.mo13962f();
                                    Thread.currentThread().interrupt();
                                    ((nbe) ((nbe) f24293a.m17251b()).mo17276G(2563)).mo17290o("Error retrieving metadata from frame.");
                                    kbzVar2 = this.f24299g;
                                }
                                kbzVar2.mo13962f();
                            } catch (Throwable th3) {
                                this.f24299g.mo13962f();
                                throw th3;
                            }
                        }
                        kbzVar = this.f24299g;
                    } catch (Throwable th4) {
                        this.f24299g.mo13962f();
                        throw th4;
                    }
                } catch (InterruptedException | ExecutionException e3) {
                    ((nbe) ((nbe) ((nbe) f24293a.m17252c()).mo17283h(e3)).mo17276G(2560)).mo17290o("SmartMetering failed");
                    kbzVar = this.f24299g;
                }
                kbzVar.mo13962f();
            }
            synchronized (this.f24294b) {
                try {
                    if (mrnVar != null) {
                        this.f24301i++;
                        this.f24310r = mrnVar;
                    } else {
                        ((nbe) ((nbe) f24293a.m17252c()).mo17276G(2559)).mo17290o("No valid metadata was found, returning an invalid lock.");
                    }
                    gdgVar = new gdg(this, mrnVar);
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            return gdgVar;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24294b) {
            if (this.f24300h) {
                return;
            }
            this.f24300h = true;
            synchronized (this.f24294b) {
                this.f24302j = false;
                m9072d();
            }
            this.f24308p.shutdownNow();
            this.f24307o.close();
            this.f24306n.close();
        }
    }
}
