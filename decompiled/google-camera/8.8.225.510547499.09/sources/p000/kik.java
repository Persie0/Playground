package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kik implements kba {

    /* JADX INFO: renamed from: b */
    private final kil f36167b;

    /* JADX INFO: renamed from: f */
    private final boolean f36171f;

    /* JADX INFO: renamed from: g */
    private final kbo f36172g;

    /* JADX INFO: renamed from: h */
    private final kxt f36173h;

    /* JADX INFO: renamed from: i */
    private final AmbientDelegate f36174i;

    /* JADX INFO: renamed from: j */
    private final ktz f36175j;

    /* JADX INFO: renamed from: c */
    private nps f36168c = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    private final nps f36169d = nqf.m17621g();

    /* JADX INFO: renamed from: e */
    private nps f36170e = nqf.m17621g();

    /* JADX INFO: renamed from: a */
    public final ExecutorService f36166a = jzn.m13824l("Sess3AEx");

    public kik(ktz ktzVar, kmd kmdVar, kbo kboVar, kfn kfnVar, kil kilVar, AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36174i = ambientDelegate;
        this.f36167b = kilVar;
        this.f36175j = ktzVar;
        this.f36171f = kmdVar.mo14538G();
        this.f36172g = kboVar.mo6314a("SessCtrl3A");
        this.f36173h = new kxt(kfnVar.f35847k, kfnVar.f35848l);
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m14330i(Integer num) {
        return num.intValue() == 4 || num.intValue() == 3;
    }

    /* JADX INFO: renamed from: j */
    private static final boolean m14331j(kis kisVar, kex kexVar) {
        return !kisVar.mo14092b().equals(kexVar.mo14092b());
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m14332k(kis kisVar, kex kexVar) {
        return kisVar.f36207b.booleanValue() && kisVar.mo14091a().equals(kexVar.mo14091a()) && Arrays.equals(kisVar.f36210e, ((kis) kexVar).f36210e);
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m14333l(kis kisVar, kex kexVar) {
        return kisVar.f36208c.booleanValue() && kisVar.mo14093c().equals(kexVar.mo14093c()) && Arrays.equals(kisVar.f36211f, ((kis) kexVar).f36211f);
    }

    /* JADX INFO: renamed from: a */
    final synchronized kir m14334a() {
        return this.f36174i.m1577F();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01a3 A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:49:0x00eb, B:52:0x0140, B:55:0x0153, B:59:0x0163, B:60:0x0181, B:62:0x019d, B:74:0x01f7, B:76:0x01fb, B:82:0x020e, B:88:0x021d, B:93:0x022a, B:68:0x01c4, B:70:0x01ca, B:72:0x01d6, B:73:0x01e0, B:65:0x01a3), top: B:122:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4 A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:49:0x00eb, B:52:0x0140, B:55:0x0153, B:59:0x0163, B:60:0x0181, B:62:0x019d, B:74:0x01f7, B:76:0x01fb, B:82:0x020e, B:88:0x021d, B:93:0x022a, B:68:0x01c4, B:70:0x01ca, B:72:0x01d6, B:73:0x01e0, B:65:0x01a3), top: B:122:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ca A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:49:0x00eb, B:52:0x0140, B:55:0x0153, B:59:0x0163, B:60:0x0181, B:62:0x019d, B:74:0x01f7, B:76:0x01fb, B:82:0x020e, B:88:0x021d, B:93:0x022a, B:68:0x01c4, B:70:0x01ca, B:72:0x01d6, B:73:0x01e0, B:65:0x01a3), top: B:122:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6 A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:49:0x00eb, B:52:0x0140, B:55:0x0153, B:59:0x0163, B:60:0x0181, B:62:0x019d, B:74:0x01f7, B:76:0x01fb, B:82:0x020e, B:88:0x021d, B:93:0x022a, B:68:0x01c4, B:70:0x01ca, B:72:0x01d6, B:73:0x01e0, B:65:0x01a3), top: B:122:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb A[Catch: all -> 0x015e, TryCatch #6 {all -> 0x015e, blocks: (B:49:0x00eb, B:52:0x0140, B:55:0x0153, B:59:0x0163, B:60:0x0181, B:62:0x019d, B:74:0x01f7, B:76:0x01fb, B:82:0x020e, B:88:0x021d, B:93:0x022a, B:68:0x01c4, B:70:0x01ca, B:72:0x01d6, B:73:0x01e0, B:65:0x01a3), top: B:122:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x0207  */
    /* JADX WARN: Code duplicated, block: B:80:0x0209  */
    /* JADX INFO: renamed from: b */
    final synchronized nps m14335b(kge kgeVar, boolean z) {
        kba kbaVar;
        boolean z2;
        kgw kgwVarM14226g;
        kis kisVar;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f36172g.mo13940b("Call to trigger 3A with Spec : ".concat(kgeVar.toString()));
        try {
            kba kbaVarM1576E = this.f36174i.m1576E();
            try {
                this.f36169d.cancel(true);
                boolean z6 = kgeVar.m14190d() && this.f36171f;
                int i = kgeVar.f35879b;
                boolean z7 = i == 4 || i == 3;
                int i2 = kgeVar.f35881d;
                boolean z8 = i2 == 4 || i2 == 3;
                boolean z9 = kgeVar.f35878a;
                if (z7 || z8 || z9) {
                    this.f36172g.mo13940b("Unlocking 3a, deciding params aeRescan = " + z7 + ", awbRescan = " + z8 + ", usePreCaptureMeteringSequence = " + z9);
                    boolean z10 = z7 || z9;
                    m14336c(false, z10, z8, false);
                }
                boolean zM14188b = kgeVar.m14188b();
                boolean zM14189c = kgeVar.m14189c();
                kis kisVarM1578G = this.f36174i.m1578G();
                kgw kgwVarM14226g2 = kgw.m14226g(this.f36167b.m14348a());
                if (z7 || z9) {
                    kgwVarM14226g2.mo14112d(CaptureRequest.CONTROL_AE_LOCK, false);
                }
                if (z8) {
                    kgwVarM14226g2.mo14112d(CaptureRequest.CONTROL_AWB_LOCK, false);
                }
                kih kihVarM15042d = this.f36173h.m15042d(kisVarM1578G, z6, zM14188b, zM14189c);
                kih kihVarM15041c = this.f36173h.m15041c(kisVarM1578G, false, z7, z8);
                kgw kgwVarM14226g3 = kgw.m14226g(kgwVarM14226g2);
                if (z6) {
                    if (kgeVar.f35880c == 2 || !m14330i(kisVarM1578G.mo14092b())) {
                        kbaVar = kbaVarM1576E;
                    } else {
                        this.f36172g.mo13940b("For continuous AF mode, unlocking AF and waiting to converge.");
                        kil kilVar = this.f36167b;
                        kih kihVarM15041c2 = this.f36173h.m15041c(kisVarM1578G, true, false, false);
                        kgw kgwVarM14226g4 = kgw.m14226g(kgwVarM14226g2);
                        kbaVar = kbaVarM1576E;
                        try {
                            kgwVarM14226g4.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            kgwVarM14226g4.mo14114f(kfi.m14108c(kihVarM15041c2));
                            kilVar.m14355h(kgwVarM14226g4.mo14109a());
                            kgw kgwVarM14226g5 = kgw.m14226g(kgwVarM14226g2);
                            kgwVarM14226g5.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            kgwVarM14226g5.mo14114f(kfi.m14108c(kihVarM15041c2));
                            kilVar.m14353f(kgwVarM14226g5.mo14109a());
                            this.f36166a.submit(new kij(kihVarM15041c2.f36161a, 0)).get();
                            this.f36172g.mo13940b("AF converged");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                kbaVar.close();
                                throw th2;
                            } catch (Throwable th3) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                throw th2;
                            }
                        }
                    }
                    kgwVarM14226g3.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    z2 = true;
                } else {
                    kbaVar = kbaVarM1576E;
                    kisVarM1578G = kisVarM1578G;
                    z2 = false;
                }
                if (!z9) {
                    if (z2) {
                    }
                    kgwVarM14226g2.mo14114f(kfi.m14108c(kihVarM15041c));
                    kgwVarM14226g2.mo14114f(kfi.m14108c(kihVarM15042d));
                    this.f36167b.m14353f(kgwVarM14226g2.mo14109a());
                    if (kgeVar.f35879b != 4 || kgeVar.f35881d == 4 || z9) {
                        this.f36172g.mo13940b("Wait for for AE/AWB to converge.");
                        this.f36166a.submit(new kij(kihVarM15041c, 2)).get();
                        this.f36172g.mo13940b("AE/AWB converged.");
                    }
                    if (zM14188b || zM14189c) {
                        kgwVarM14226g = kgw.m14226g(kgwVarM14226g2);
                        if (zM14188b) {
                            kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AE_LOCK, true);
                        }
                        if (zM14189c) {
                            kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AWB_LOCK, true);
                        }
                        kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15042d));
                        this.f36172g.mo13940b("Sending the request to lock AE/AWB.");
                        this.f36167b.m14353f(kgwVarM14226g.mo14109a());
                    }
                    AmbientDelegate ambientDelegate = this.f36174i;
                    if (z6) {
                        kisVar = kisVarM1578G;
                        z3 = true;
                    } else {
                        kisVar = kisVarM1578G;
                        if (kisVar.f36206a.booleanValue()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    z4 = zM14188b || kisVar.f36207b.booleanValue();
                    z5 = zM14189c || kisVar.f36208c.booleanValue();
                    ambientDelegate.m1580I(z3, z4, z5, z);
                    nps npsVarM17554j = nod.m17554j(kxk.m14962H(kihVarM15041c.f36161a, kihVarM15042d.f36161a), etv.f19881f, not.INSTANCE);
                    kbaVar.close();
                    return npsVarM17554j;
                }
                kgwVarM14226g3.mo14112d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                kgwVarM14226g3.mo14114f(kfi.m14108c(kihVarM15041c));
                kgwVarM14226g3.mo14114f(kfi.m14108c(kihVarM15042d));
                this.f36167b.m14355h(kgwVarM14226g3.mo14109a());
                this.f36172g.mo13940b("Trigger request sent.");
                kgwVarM14226g2.mo14114f(kfi.m14108c(kihVarM15041c));
                kgwVarM14226g2.mo14114f(kfi.m14108c(kihVarM15042d));
                this.f36167b.m14353f(kgwVarM14226g2.mo14109a());
                if (kgeVar.f35879b != 4) {
                    this.f36172g.mo13940b("Wait for for AE/AWB to converge.");
                    this.f36166a.submit(new kij(kihVarM15041c, 2)).get();
                    this.f36172g.mo13940b("AE/AWB converged.");
                } else {
                    this.f36172g.mo13940b("Wait for for AE/AWB to converge.");
                    this.f36166a.submit(new kij(kihVarM15041c, 2)).get();
                    this.f36172g.mo13940b("AE/AWB converged.");
                }
                if (zM14188b) {
                    kgwVarM14226g = kgw.m14226g(kgwVarM14226g2);
                    if (zM14188b) {
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AE_LOCK, true);
                    }
                    if (zM14189c) {
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AWB_LOCK, true);
                    }
                    kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15042d));
                    this.f36172g.mo13940b("Sending the request to lock AE/AWB.");
                    this.f36167b.m14353f(kgwVarM14226g.mo14109a());
                } else {
                    kgwVarM14226g = kgw.m14226g(kgwVarM14226g2);
                    if (zM14188b) {
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AE_LOCK, true);
                    }
                    if (zM14189c) {
                        kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AWB_LOCK, true);
                    }
                    kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15042d));
                    this.f36172g.mo13940b("Sending the request to lock AE/AWB.");
                    this.f36167b.m14353f(kgwVarM14226g.mo14109a());
                }
                AmbientDelegate ambientDelegate2 = this.f36174i;
                if (z6) {
                    kisVar = kisVarM1578G;
                    if (kisVar.f36206a.booleanValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    kisVar = kisVarM1578G;
                    z3 = true;
                }
                if (zM14188b) {
                    z4 = true;
                }
                if (zM14189c) {
                    z5 = true;
                }
                ambientDelegate2.m1580I(z3, z4, z5, z);
                nps npsVarM17554j2 = nod.m17554j(kxk.m14962H(kihVarM15041c.f36161a, kihVarM15042d.f36161a), etv.f19881f, not.INSTANCE);
                kbaVar.close();
                return npsVarM17554j2;
            } catch (Throwable th4) {
                th = th4;
                kbaVar = kbaVarM1576E;
            }
        } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
            return kxk.m14964J(e);
        }
    }

    /* JADX INFO: renamed from: c */
    final synchronized nps m14336c(boolean z, boolean z2, boolean z3, boolean z4) {
        nps npsVar;
        kba kbaVarM1576E = this.f36174i.m1576E();
        try {
            boolean z5 = true;
            this.f36170e.cancel(true);
            if (!z || !this.f36171f) {
                z5 = false;
            }
            kir kirVarM14364c = kir.m14364c(this.f36174i.m1577F().m14365d());
            if (z2) {
                kirVarM14364c.f36201g = false;
            }
            if (z3) {
                kirVarM14364c.f36202h = false;
            }
            if (z5) {
                kirVarM14364c.f36200f = false;
            }
            kis kisVarM14365d = kirVarM14364c.m14365d();
            kgw kgwVarM14226g = kgw.m14226g(this.f36167b.m14348a());
            AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d);
            kih kihVarM15040b = this.f36173h.m15040b(kisVarM14365d, z5, z2, z3);
            kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15040b));
            if (z5) {
                kgw kgwVarM14226g2 = kgw.m14226g(kgwVarM14226g);
                kgwVarM14226g2.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.f36167b.m14355h(kgwVarM14226g2.mo14109a());
            }
            this.f36167b.m14353f(kgwVarM14226g.mo14109a());
            this.f36174i.m1580I(kisVarM14365d.f36206a.booleanValue(), kisVarM14365d.f36207b.booleanValue(), kisVarM14365d.f36208c.booleanValue(), z4);
            npsVar = kihVarM15040b.f36161a;
            this.f36170e = npsVar;
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
        return npsVar;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36168c.cancel(true);
        this.f36169d.cancel(true);
        this.f36170e.cancel(true);
    }

    /* JADX INFO: renamed from: d */
    final synchronized nps m14337d(kex kexVar, boolean z) {
        nps npsVar;
        kba kbaVarM1576E = this.f36174i.m1576E();
        try {
            this.f36168c.cancel(true);
            kex kexVarM14856h = this.f36175j.m14856h(kexVar, this.f36174i.m1578G());
            kis kisVarM14365d = this.f36174i.m1577F().m14365d();
            boolean zM14332k = m14332k(kisVarM14365d, kexVarM14856h);
            boolean zM14333l = m14333l(kisVarM14365d, kexVarM14856h);
            boolean zM14331j = m14331j(kisVarM14365d, kexVarM14856h);
            kir kirVarM14363b = kir.m14363b(kexVarM14856h);
            boolean z2 = false;
            if (kisVarM14365d.f36206a.booleanValue() && !zM14331j) {
                z2 = true;
            }
            kirVarM14363b.f36200f = Boolean.valueOf(z2);
            kirVarM14363b.f36201g = Boolean.valueOf(zM14332k);
            kirVarM14363b.f36202h = Boolean.valueOf(zM14333l);
            kis kisVarM14365d2 = kirVarM14363b.m14365d();
            kgw kgwVarM14226g = kgw.m14226g(this.f36167b.m14348a());
            AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d2);
            kih kihVarM15040b = this.f36173h.m15040b(kisVarM14365d2, zM14331j, !zM14332k, true ^ zM14333l);
            kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15040b));
            this.f36167b.m14353f(kgwVarM14226g.mo14109a());
            if (zM14331j) {
                kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d2);
                this.f36167b.m14355h(kgwVarM14226g.mo14109a());
            }
            this.f36174i.m1579H(kisVarM14365d2, z);
            npsVar = kihVarM15040b.f36161a;
            this.f36168c = npsVar;
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
        return npsVar;
    }

    /* JADX INFO: renamed from: e */
    final synchronized nps m14338e(kex kexVar) {
        boolean z;
        nps npsVar;
        kba kbaVarM1576E = this.f36174i.m1576E();
        try {
            boolean z2 = this.f36171f;
            kex kexVarM14856h = this.f36175j.m14856h(kexVar, this.f36174i.m1578G());
            kis kisVarM14365d = this.f36174i.m1577F().m14365d();
            if (z2) {
                z = true;
            } else {
                z = kisVarM14365d.f36206a.booleanValue() && !m14331j(kisVarM14365d, kexVarM14856h);
            }
            boolean zM14332k = m14332k(kisVarM14365d, kexVarM14856h);
            boolean zM14333l = m14333l(kisVarM14365d, kexVarM14856h);
            kir kirVarM14363b = kir.m14363b(kexVarM14856h);
            kirVarM14363b.f36200f = Boolean.valueOf(z);
            kirVarM14363b.f36201g = Boolean.valueOf(zM14332k);
            kirVarM14363b.f36202h = Boolean.valueOf(zM14333l);
            kis kisVarM14365d2 = kirVarM14363b.m14365d();
            kgw kgwVarM14226g = kgw.m14226g(this.f36167b.m14348a());
            kih kihVarM15042d = this.f36173h.m15042d(kexVarM14856h, z2, false, false);
            kgwVarM14226g.mo14114f(kfi.m14108c(kihVarM15042d));
            AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d2);
            if (z2) {
                kgw kgwVarM14226g2 = kgw.m14226g(kgwVarM14226g);
                kgwVarM14226g2.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.f36167b.m14355h(kgwVarM14226g2.mo14109a());
            }
            this.f36167b.m14353f(kgwVarM14226g.mo14109a());
            this.f36174i.m1579H(kisVarM14365d2, false);
            npsVar = kihVarM15042d.f36161a;
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
        return npsVar;
    }

    /* JADX INFO: renamed from: f */
    final synchronized void m14339f(kex kexVar) {
        m14341h(kexVar);
    }

    /* JADX INFO: renamed from: g */
    final synchronized void m14340g(kex kexVar) {
        kba kbaVarM1576E = this.f36174i.m1576E();
        try {
            kex kexVarM14856h = this.f36175j.m14856h(kexVar, this.f36174i.m1578G());
            kis kisVarM1578G = this.f36174i.m1578G();
            kir kirVarM14363b = kir.m14363b(kexVarM14856h);
            kirVarM14363b.f36200f = kisVarM1578G.f36206a;
            kirVarM14363b.f36201g = kisVarM1578G.f36207b;
            kirVarM14363b.f36202h = kisVarM1578G.f36208c;
            kis kisVarM14365d = kirVarM14363b.m14365d();
            kgw kgwVarM14226g = kgw.m14226g(this.f36167b.m14348a());
            AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d);
            kgwVarM14226g.mo14114f(kfi.m14108c(this.f36173h.m15040b(kisVarM14365d, false, false, false)));
            this.f36167b.m14355h(kgwVarM14226g.mo14109a());
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    final synchronized void m14341h(kex kexVar) {
        kba kbaVarM1576E = this.f36174i.m1576E();
        try {
            this.f36168c.cancel(true);
            kex kexVarM14856h = this.f36175j.m14856h(kexVar, this.f36174i.m1578G());
            kis kisVarM14365d = this.f36174i.m1577F().m14365d();
            kir kirVarM14363b = kir.m14363b(kexVarM14856h);
            kirVarM14363b.f36200f = kisVarM14365d.f36206a;
            kirVarM14363b.f36201g = kisVarM14365d.f36207b;
            kirVarM14363b.f36202h = kisVarM14365d.f36208c;
            kis kisVarM14365d2 = kirVarM14363b.m14365d();
            kgw kgwVarM14226g = kgw.m14226g(this.f36167b.m14348a());
            AmbientDelegate.m1570K(kgwVarM14226g, kisVarM14365d2);
            boolean zBooleanValue = kisVarM14365d2.f36206a.booleanValue();
            int i = 0;
            if (kisVarM14365d.f36206a.booleanValue() && kexVarM14856h.mo14092b().equals(kisVarM14365d.mo14092b())) {
                zBooleanValue = false;
            }
            if (zBooleanValue && m14330i(kisVarM14365d2.mo14092b())) {
                i = 1;
            }
            kgwVarM14226g.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(i));
            kxt kxtVar = this.f36173h;
            boolean zBooleanValue2 = kisVarM14365d.f36206a.booleanValue();
            boolean zBooleanValue3 = kisVarM14365d.f36207b.booleanValue();
            boolean zBooleanValue4 = kisVarM14365d.f36208c.booleanValue();
            HashSet hashSet = new HashSet();
            hashSet.add(kxtVar.m15039a(CaptureResult.CONTROL_AF_MODE, mxk.m17136H(kisVarM14365d2.mo14092b())));
            hashSet.add(kxtVar.m15039a(CaptureResult.CONTROL_AE_MODE, mxk.m17136H(kisVarM14365d2.mo14091a())));
            hashSet.add(kxtVar.m15039a(CaptureResult.CONTROL_AWB_MODE, mxk.m17136H(kisVarM14365d2.mo14093c())));
            hashSet.addAll(kxtVar.m15043e(kisVarM14365d2, zBooleanValue2, zBooleanValue3, zBooleanValue4));
            kfv kfvVarM14108c = kfi.m14108c(new kih(mxk.m17134F(hashSet)));
            kgwVarM14226g.mo14114f(kfvVarM14108c);
            kxt kxtVar2 = this.f36173h;
            kih kihVar = new kih(mxk.m17137I(kxtVar2.m15039a(CaptureResult.CONTROL_AF_MODE, mxk.m17136H(kisVarM14365d2.mo14092b())), kxtVar2.m15039a(CaptureResult.CONTROL_AF_TRIGGER, mxk.m17136H(1))));
            if (i != 0) {
                kgwVarM14226g.mo14114f(kfi.m14108c(kihVar));
            }
            this.f36167b.m14353f(kgwVarM14226g.mo14109a());
            if (i != 0) {
                try {
                    this.f36166a.submit(new kij(kihVar, 3)).get();
                } catch (InterruptedException | ExecutionException | RejectedExecutionException e) {
                    kxk.m14964J(e);
                }
            }
            if (zBooleanValue && !m14330i(kexVarM14856h.mo14092b())) {
                kgw kgwVarM14226g2 = kgw.m14226g(kgwVarM14226g);
                kgwVarM14226g2.mo14112d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                kgwVarM14226g2.mo14114f(kfvVarM14108c);
                this.f36167b.m14355h(kgwVarM14226g2.mo14109a());
            }
            this.f36174i.m1579H(kisVarM14365d2, true);
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
