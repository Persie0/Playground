package com.google.android.libraries.performance.primes.metrics.crash;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import p000.ljw;
import p000.lkb;
import p000.lkf;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nww;
import p000.nwx;
import p000.nxf;
import p000.nxl;
import p000.nxq;
import p000.nyb;
import p000.nzf;
import p000.nzm;
import p000.nzx;
import p000.ocg;
import p000.oju;
import p000.paf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NativeCrashHandlerImpl implements lkf {

    /* JADX INFO: renamed from: c */
    private static final nbh f7955c = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");

    /* JADX INFO: renamed from: a */
    final CountDownLatch f7956a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b */
    final CountDownLatch f7957b = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    private boolean f7958d;

    /* JADX INFO: renamed from: e */
    private final mrm f7959e;

    public NativeCrashHandlerImpl(mrm mrmVar) {
        this.f7959e = mrmVar;
    }

    private static native ByteBuffer awaitSignal();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    @Override // p000.lkf
    /* JADX INFO: renamed from: a */
    public final synchronized void mo4715a(final ljw ljwVar) {
        if (this.f7958d) {
            return;
        }
        this.f7958d = true;
        Thread thread = new Thread(new Runnable() { // from class: lkg
            @Override // java.lang.Runnable
            public final void run() throws nyb {
                this.f38482a.m4716b(ljwVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m4716b(ljw ljwVar) throws nyb {
        mrm mrmVar = this.f7959e;
        if (mrmVar.mo16813g() && !((Boolean) ((oju) mrmVar.mo16809c()).get()).booleanValue()) {
            this.f7957b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler()) {
                ((nbe) ((nbe) f7955c.m17252c()).mo17276G((char) 4522)).mo17290o("unable to initialize signal handler");
                return;
            }
            try {
                this.f7956a.countDown();
                ByteBuffer byteBufferAwaitSignal = awaitSignal();
                ocg ocgVar = null;
                if (byteBufferAwaitSignal != null) {
                    try {
                        nxf nxfVar = nxf.f44904a;
                        ocg ocgVar2 = ocg.f45460a;
                        nww nwwVarM17877J = nww.m17877J(byteBufferAwaitSignal);
                        nxq nxqVarM18138P = ocgVar2.m18138P();
                        try {
                            try {
                                try {
                                    try {
                                        nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                                        nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17877J), nxfVar);
                                        nzmVarM18260b.mo18250f(nxqVarM18138P);
                                        nxq.m18132ae(nxqVarM18138P);
                                        nxq.m18132ae(nxqVarM18138P);
                                        ocgVar = (ocg) nxqVarM18138P;
                                    } catch (nyb e) {
                                        if (!e.f44994a) {
                                            throw e;
                                        }
                                        throw new nyb(e);
                                    }
                                } catch (nzx e2) {
                                    throw e2.m18328a();
                                }
                            } catch (IOException e3) {
                                if (!(e3.getCause() instanceof nyb)) {
                                    throw new nyb(e3);
                                }
                                throw ((nyb) e3.getCause());
                            }
                        } catch (RuntimeException e4) {
                            if (!(e4.getCause() instanceof nyb)) {
                                throw e4;
                            }
                            throw ((nyb) e4.getCause());
                        }
                    } catch (Throwable th) {
                    }
                }
                nxl nxlVarM15555i = ((lkb) ljwVar).m15555i();
                if (!nxlVarM15555i.f44974b.m18142ac()) {
                    nxlVarM15555i.mo18106p();
                }
                paf pafVar = (paf) nxlVarM15555i.f44974b;
                paf pafVar2 = paf.f47175l;
                pafVar.f47182f = 5;
                pafVar.f47177a |= 16;
                if (ocgVar != null) {
                    if (!nxlVarM15555i.f44974b.m18142ac()) {
                        nxlVarM15555i.mo18106p();
                    }
                    paf pafVar3 = (paf) nxlVarM15555i.f44974b;
                    pafVar3.f47185i = ocgVar;
                    pafVar3.f47177a |= 512;
                }
                ((lkb) ljwVar).m15552f((paf) nxlVarM15555i.mo18103l());
                unblockSignalHandler();
            } catch (Throwable th2) {
                unblockSignalHandler();
                throw th2;
            }
        } catch (UnsatisfiedLinkError e5) {
            ((nbe) ((nbe) ((nbe) f7955c.m17252c()).mo17283h(e5)).mo17276G((char) 4523)).mo17290o("unable to load native_crash_handler_jni");
        }
    }
}
