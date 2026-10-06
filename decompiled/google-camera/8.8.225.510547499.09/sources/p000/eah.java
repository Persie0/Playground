package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eah {

    /* JADX INFO: renamed from: a */
    public static final nbh f13050a = nbh.m17259h("com/google/android/apps/camera/gl/GLGuardFactory");

    /* JADX INFO: renamed from: b */
    public static Executor f13051b;

    /* JADX INFO: renamed from: c */
    public final lby f13052c;

    /* JADX INFO: renamed from: d */
    public final Executor f13053d;

    public eah(lby lbyVar, Executor executor) {
        this.f13052c = lbyVar;
        this.f13053d = executor;
    }

    /* JADX INFO: renamed from: a */
    public final eag m6997a(AutoCloseable autoCloseable) {
        return new eag(this, autoCloseable);
    }
}
