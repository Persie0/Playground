package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlv {

    /* JADX INFO: renamed from: a */
    public static final nbh f28281a = nbh.m17259h("com/google/android/apps/camera/storage/cache/SingleKeyCache");

    /* JADX INFO: renamed from: b */
    public final nps f28282b;

    /* JADX INFO: renamed from: c */
    public final String f28283c;

    /* JADX INFO: renamed from: d */
    public final Executor f28284d;

    /* JADX INFO: renamed from: e */
    public Object f28285e;

    /* JADX INFO: renamed from: f */
    public final Object f28286f = new Object();

    public hlv(nps npsVar, Executor executor) {
        npsVar.getClass();
        this.f28282b = npsVar;
        this.f28283c = "indicatorThumbnail";
        this.f28284d = executor;
    }

    /* JADX INFO: renamed from: a */
    public final nps m10451a() {
        synchronized (this.f28286f) {
            Object obj = this.f28285e;
            if (obj == null) {
                return nod.m17554j(this.f28282b, new hls(this), this.f28284d);
            }
            return kxk.m14965K(obj);
        }
    }
}
