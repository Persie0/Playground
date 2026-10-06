package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gon implements kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f25885a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/util/FrameRateFrameFilter");

    /* JADX INFO: renamed from: b */
    private static final long f25886b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c */
    private static final long f25887c = TimeUnit.MILLISECONDS.toNanos(5);

    /* JADX INFO: renamed from: d */
    private final long f25888d;

    /* JADX INFO: renamed from: e */
    private final long f25889e;

    /* JADX INFO: renamed from: f */
    private long f25890f;

    /* JADX INFO: renamed from: g */
    private final eqj f25891g;

    public gon(long j, float f, float f2, eqj eqjVar) {
        float f3 = f25886b;
        long j2 = (long) (f3 / f2);
        this.f25889e = j2;
        this.f25888d = f > -1.0f ? ((long) (f * f3)) + j + (j2 / 2) : -1L;
        this.f25890f = j > -1 ? j + j2 : -1L;
        this.f25891g = eqjVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9583a(key keyVar) {
        key keyVarMo7040a;
        if (keyVar != null) {
            if (keyVar.mo7041b() != null) {
                try {
                    kfd kfdVarMo7041b = keyVar.mo7041b();
                    kfdVarMo7041b.getClass();
                    long j = kfdVarMo7041b.f35811b;
                    long j2 = this.f25888d;
                    if (j2 > -1 && j > j2) {
                        eqj eqjVar = this.f25891g;
                        eqjVar.f15174a.mo14894e(true);
                        synchronized (eqjVar.f15176c) {
                            eqjVar.f15176c.f15179c = false;
                            eqt eqtVar = eqjVar.f15175b;
                            if (eqtVar != null) {
                                eqtVar.mo7613d(false);
                                eqjVar.f15175b = null;
                            }
                        }
                        keyVar.close();
                        return;
                    }
                    if (j > this.f25890f - f25887c && (keyVarMo7040a = keyVar.mo7040a()) != null) {
                        keyVar.mo7041b();
                        eqj eqjVar2 = this.f25891g;
                        synchronized (eqjVar2.f15176c) {
                            try {
                                eqk eqkVar = eqjVar2.f15176c;
                                if (eqkVar.f15179c) {
                                    ntv ntvVarM6628h = eqkVar.f15180d.m6628h(keyVarMo7040a);
                                    if (ntvVarM6628h == null) {
                                        kfd kfdVarMo7041b2 = keyVarMo7040a.mo7041b();
                                        ((nbe) ((nbe) eqk.f15177a.m17252c()).mo17276G(1845)).mo17292q("No valid RAW image found, ignoring frame %s.", kfdVarMo7041b2 != null ? kfdVarMo7041b2.f35812c : -1L);
                                    } else if (eqjVar2.f15175b != null) {
                                        String.format("Reporting selected frame %s.", Long.valueOf(ntvVarM6628h.f44591b.m4953c()));
                                        eqt eqtVar2 = eqjVar2.f15175b;
                                        eqtVar2.getClass();
                                        eqtVar2.mo7612b(ntvVarM6628h);
                                    } else {
                                        String.format("Caching filtered frame %s", Long.valueOf(ntvVarM6628h.f44591b.m4953c()));
                                        eqjVar2.f15176c.f15178b.add(ntvVarM6628h);
                                    }
                                }
                                keyVarMo7040a.close();
                            } catch (Throwable th) {
                                keyVarMo7040a.close();
                                throw th;
                            }
                        }
                        kfd kfdVarMo7041b3 = keyVar.mo7041b();
                        kfdVarMo7041b3.getClass();
                        this.f25890f = kfdVarMo7041b3.f35811b + this.f25889e;
                    }
                    keyVar.close();
                    return;
                } catch (Throwable th2) {
                    keyVar.close();
                    throw th2;
                }
            }
        }
        ((nbe) ((nbe) f25885a.m17252c()).mo17276G((char) 3127)).mo17290o("BufferFilter: Received invalid frame.");
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
