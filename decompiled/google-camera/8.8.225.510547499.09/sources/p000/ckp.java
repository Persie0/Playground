package p000;

import android.os.Process;
import com.google.android.apps.camera.async.p005tt.CpuSets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckp {

    /* JADX INFO: renamed from: a */
    public static final nbh f5993a = nbh.m17259h("com/google/android/apps/camera/async/tt/ThreadThrottler");

    /* JADX INFO: renamed from: b */
    private final ohb f5994b;

    /* JADX INFO: renamed from: c */
    private Boolean f5995c;

    public ckp(ohb ohbVar) {
        this.f5994b = ohbVar;
    }

    /* JADX INFO: renamed from: a */
    public final Runnable m3841a(Runnable runnable) {
        return new cgl(this, runnable, 9);
    }

    /* JADX INFO: renamed from: b */
    public final void m3842b() {
        if (m3843c()) {
            if (CpuSets.m4035a(Process.myTid()) != null) {
                Thread.currentThread().getName();
            } else {
                ((nbe) ((nbe) f5993a.m17252c()).mo17276G((char) 210)).mo17293r("Failed to cpuset-limit thread %s.", Thread.currentThread().getName());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3843c() {
        boolean zBooleanValue;
        kbi.m13938a(CpuSets.class);
        synchronized (this) {
            if (this.f5995c == null) {
                this.f5995c = Boolean.valueOf(((dhv) this.f5994b.get()).mo6184l(dib.f11298bE));
            }
            zBooleanValue = this.f5995c.booleanValue();
        }
        return zBooleanValue;
    }
}
