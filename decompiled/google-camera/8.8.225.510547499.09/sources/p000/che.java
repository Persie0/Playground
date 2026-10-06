package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class che implements hjk {

    /* JADX INFO: renamed from: a */
    private final cdz f5725a;

    /* JADX INFO: renamed from: b */
    private final nqf f5726b;

    /* JADX INFO: renamed from: c */
    private final kbo f5727c;

    public che(cdz cdzVar, nqf nqfVar, kbo kboVar) {
        this.f5725a = cdzVar;
        this.f5726b = nqfVar;
        this.f5727c = kboVar.mo6314a("CameraDeviceVerifier");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((dnl) this.f5725a.m3535a().get()).f12100a) {
                this.f5726b.mo14894e(ckb.f5958a);
            } else {
                this.f5727c.mo13944f("Unable to retrieve camera devices.");
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("No Cameras are currently available.", e);
        }
    }
}
