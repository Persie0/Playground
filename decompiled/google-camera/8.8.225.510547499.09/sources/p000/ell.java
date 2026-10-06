package p000;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ell {

    /* JADX INFO: renamed from: a */
    public static final nbh f14600a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/video/VideoRecorder");

    /* JADX INFO: renamed from: b */
    public final eli f14601b;

    /* JADX INFO: renamed from: c */
    public final elf f14602c;

    /* JADX INFO: renamed from: d */
    public final Looper f14603d;

    /* JADX INFO: renamed from: e */
    public final elk f14604e;

    /* JADX INFO: renamed from: f */
    public boolean f14605f = false;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f14606g = new AtomicInteger(0);

    public ell(eli eliVar, elf elfVar) {
        this.f14601b = eliVar;
        this.f14602c = elfVar;
        HandlerThread handlerThread = new HandlerThread("VideoRecorderThread");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.f14603d = looper;
        this.f14604e = new elk(this, looper);
    }

    /* JADX INFO: renamed from: a */
    public final int m7457a() {
        return this.f14606g.get();
    }
}
