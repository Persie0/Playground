package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fig implements kyq {

    /* JADX INFO: renamed from: a */
    public static final nbh f22107a = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/SanitizerMuxer");

    /* JADX INFO: renamed from: b */
    public final kyq f22108b;

    /* JADX INFO: renamed from: c */
    public final Set f22109c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f22110d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e */
    public final Object f22111e = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f22112f = false;

    public fig(kyq kyqVar) {
        this.f22108b = kyqVar;
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: a */
    public final kyt mo8410a() {
        fif fifVar;
        lku.m15613H(!this.f22112f);
        synchronized (this.f22111e) {
            fifVar = new fif(this, this.f22108b.mo8410a());
            this.f22109c.add(fifVar);
            this.f22110d.getAndIncrement();
        }
        return fifVar;
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: b */
    public final nps mo8411b() {
        return this.f22108b.mo8411b();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: c */
    public final void mo8412c() {
        this.f22108b.mo8412c();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: d */
    public final void mo8413d() {
        this.f22108b.mo8413d();
        this.f22112f = true;
    }
}
