package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cub extends kfv {

    /* JADX INFO: renamed from: c */
    private static final nbh f9589c = nbh.m17259h("com/google/android/apps/camera/camcorder/frameserver/listener/AutoFrameListener");

    /* JADX INFO: renamed from: a */
    public int f9590a = 0;

    /* JADX INFO: renamed from: b */
    public int f9591b = 0;

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        m5516g(l.longValue());
    }

    /* JADX INFO: renamed from: g */
    final synchronized void m5516g(long j) {
        try {
            if (j >= 29979000 && j <= 36641000) {
                this.f9590a++;
            } else if (j >= 14999400 && j <= 18332600) {
                this.f9591b++;
            } else {
                ((nbe) ((nbe) f9589c.m17252c()).mo17276G((char) 651)).mo17293r("Auto FPS received a frame that was neither 30 or 60 fps. Frame was: %f", Float.valueOf(1.0E9f / j));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
