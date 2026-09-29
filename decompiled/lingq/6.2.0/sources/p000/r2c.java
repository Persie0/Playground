package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f58538a;

    /* JADX INFO: renamed from: b */
    public final long f58539b;

    /* JADX INFO: renamed from: c */
    public final boolean f58540c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v3c f58541d;

    public r2c(v3c v3cVar, boolean z) {
        Objects.requireNonNull(v3cVar);
        this.f58541d = v3cVar;
        this.f58538a = System.currentTimeMillis();
        this.f58539b = SystemClock.elapsedRealtime();
        this.f58540c = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo40a();

    /* JADX INFO: renamed from: b */
    public void mo41b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        v3c v3cVar = this.f58541d;
        if (v3cVar.f64810e) {
            mo41b();
            return;
        }
        try {
            mo40a();
        } catch (Exception e) {
            v3cVar.m23088d(e, false, this.f58540c);
            mo41b();
        }
    }
}
