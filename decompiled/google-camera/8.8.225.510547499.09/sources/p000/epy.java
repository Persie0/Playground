package p000;

import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import com.google.googlex.gcam.lasagna.LasagnaNativeProcessorJni;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epy {

    /* JADX INFO: renamed from: a */
    public static final nbh f15064a = nbh.m17259h("com/google/android/apps/camera/lasagna/MotionBlurNativeProcessor");

    /* JADX INFO: renamed from: b */
    public final Object f15065b = new Object();

    /* JADX INFO: renamed from: c */
    public final LasagnaNativeProcessorJni f15066c = new LasagnaNativeProcessorJni();

    /* JADX INFO: renamed from: d */
    public long f15067d = 0;

    /* JADX INFO: renamed from: a */
    public final synchronized void m7659a(int i) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.abortShot(j, i);
        } else {
            ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1754)).mo17290o("abortShot(): processor hasn't been initialized.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7660b() {
        synchronized (this.f15065b) {
            long j = this.f15067d;
            if (j != 0) {
                this.f15066c.delete(j);
                this.f15067d = 0L;
            } else {
                ((nbe) ((nbe) f15064a.m17252c()).mo17276G(1755)).mo17290o("Calling close() on an already closed processor.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7661c(int i) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.endShot(j, i);
        } else {
            ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1757)).mo17290o("endShot(): processor hasn't been initialized.");
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7662d(int i, int i2, nri nriVar, String str, long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator, LasagnaCallbacks lasagnaCallbacks, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        synchronized (this.f15065b) {
            long jCreate = this.f15066c.create(i, i2, nriVar.f44219f, str, j, interleavedU8ClientAllocator, lasagnaCallbacks, z, bArr, bArr2, bArr3);
            this.f15067d = jCreate;
            lku.m15613H(jCreate != 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7663e() {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.printDiagnosticsToLog(j);
        } else {
            ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1758)).mo17290o("printDiagnostics(): processor hasn't been initialized.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m7664f(int i) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.beginShot(j, i);
            return true;
        }
        ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1761)).mo17290o("beginShot(): processor hasn't been initialized.");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m7665g(int i, ntx ntxVar, DebugParams debugParams) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.processZslBurst(j, i, ntxVar.mo5161a(), debugParams != null ? DebugParams.m4917a(debugParams) : 0L);
            return true;
        }
        ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1763)).mo17290o("processZslBurst(): processor hasn't been initialized.");
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m7666h(int i, ntv ntvVar) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.processPslFrame(j, i, RawWriteView.m5092c(ntvVar.f44590a), FrameMetadata.m4951b(ntvVar.f44591b), ntvVar.f44592c.f8362a, ntvVar.f44593d);
        } else {
            ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1762)).mo17290o("processZslBurst(): processor hasn't been initialized.");
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m7667i(StaticMetadata staticMetadata, int i, float f, int i2, boolean z) {
        long j = this.f15067d;
        if (j != 0) {
            this.f15066c.setOptions(j, StaticMetadata.m5118a(staticMetadata), i, false, false, f, i2, z, false, false);
            return true;
        }
        ((nbe) ((nbe) f15064a.m17252c()).mo17276G((char) 1764)).mo17290o("setOptions(): processor hasn't been initialized.");
        return false;
    }
}
