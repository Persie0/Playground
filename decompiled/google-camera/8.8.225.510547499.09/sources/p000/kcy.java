package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kcy implements kct {

    /* JADX INFO: renamed from: a */
    private final nqf f35604a = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    private final kbz f35605b;

    /* JADX INFO: renamed from: c */
    private final boolean f35606c;

    public kcy(kbz kbzVar, boolean z) {
        this.f35605b = kbzVar;
        this.f35606c = z;
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        this.f35604a.mo14894e(new lqq(2, kcl.CAMERA_CLOSED_ERROR_CODE, kcl.CAMERA_CLOSED_ERROR_CODE.m13983c()));
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: b */
    public final void mo13972b() {
        this.f35604a.mo14894e(new lqq(2, kcl.CAMERA_DISCONNECTED_ERROR_CODE, kcl.CAMERA_DISCONNECTED_ERROR_CODE.m13983c()));
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        if (kclVar == kcl.CAMERA_DEVICE_ERROR_CAMERA_DISABLED) {
            this.f35604a.mo14894e(new lqq(true != this.f35606c ? 2 : 3, kclVar, kcl.CAMERA_DEVICE_ERROR_CAMERA_DISABLED.m13983c()));
        }
        this.f35604a.mo14894e(new lqq(2, kclVar, kclVar.m13983c()));
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: d */
    public final void mo13974d(kpj kpjVar) {
        this.f35604a.mo14894e(new lqq(1));
    }

    /* JADX INFO: renamed from: e */
    public final lqq m13988e(long j) {
        lqq lqqVar;
        kbz kbzVar;
        this.f35605b.mo13961e("awaitResult");
        try {
            try {
                lqqVar = (lqq) this.f35604a.get(j, TimeUnit.MILLISECONDS);
                kbzVar = this.f35605b;
            } catch (Throwable th) {
                this.f35605b.mo13962f();
                throw th;
            }
        } catch (ExecutionException | TimeoutException e) {
            lqqVar = new lqq(5);
            kbzVar = this.f35605b;
        }
        kbzVar.mo13962f();
        return lqqVar;
    }
}
