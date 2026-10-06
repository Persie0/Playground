package p000;

import android.os.Handler;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kjl implements kct, kba {

    /* JADX INFO: renamed from: b */
    private final kjn f36264b;

    /* JADX INFO: renamed from: c */
    private final kmg f36265c;

    /* JADX INFO: renamed from: d */
    private final Handler f36266d;

    /* JADX INFO: renamed from: e */
    private final kbz f36267e;

    /* JADX INFO: renamed from: f */
    private final kbo f36268f;

    /* JADX INFO: renamed from: g */
    private kjo f36269g;

    /* JADX INFO: renamed from: h */
    private kpj f36270h = null;

    /* JADX INFO: renamed from: i */
    private boolean f36271i = false;

    /* JADX INFO: renamed from: a */
    public final jvb f36263a = new jvb();

    public kjl(kmg kmgVar, kjo kjoVar, kjn kjnVar, Handler handler, kbz kbzVar, kbo kboVar) {
        this.f36265c = kmgVar;
        this.f36269g = kjoVar;
        this.f36264b = kjnVar;
        this.f36266d = handler;
        this.f36267e = kbzVar;
        this.f36268f = kboVar.mo6314a(wUzNh.DAukwaf);
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        synchronized (this) {
            if (this.f36271i) {
                return;
            }
            this.f36271i = true;
            this.f36268f.mo13940b("Camera device " + this.f36265c.f36540a + " closed for " + String.valueOf(this.f36269g));
            close();
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: b */
    public final void mo13972b() {
        boolean z;
        synchronized (this) {
            z = !this.f36271i;
            this.f36271i = true;
        }
        if (z) {
            this.f36268f.mo13940b("Camera device " + this.f36265c.f36540a + " disconnected for " + String.valueOf(this.f36269g));
            close();
        }
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        boolean z;
        synchronized (this) {
            z = !this.f36271i;
            this.f36271i = true;
        }
        if (z) {
            this.f36268f.mo13942d("Camera device " + this.f36265c.f36540a + " error " + kclVar.f35597u + "\n" + kfv.m14167D());
            close();
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f36271i = true;
        }
        this.f36267e.mo13961e("cameraDeviceState#close");
        this.f36269g.m14389h();
        this.f36263a.close();
        this.f36267e.mo13962f();
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: d */
    public final void mo13974d(kpj kpjVar) {
        boolean z;
        synchronized (this) {
            z = this.f36271i;
            if (!z) {
                this.f36267e.mo13961e("CameraDevice#onOpened");
                this.f36268f.mo13944f("Camera " + kpjVar.mo14492b() + " opened. Creating " + String.valueOf(this.f36269g));
                lku.m15659m(this.f36270h == null, "onOpened was invoked more than once!", new Object[0]);
                this.f36270h = kpjVar;
                try {
                    kjn kjnVar = this.f36264b;
                    kjo kjoVar = this.f36269g;
                    kjnVar.mo14373d(kpjVar, kjoVar, kjoVar.m14382a(), this.f36266d);
                    this.f36269g.m14388g();
                    this.f36267e.mo13962f();
                } catch (Throwable th) {
                    this.f36267e.mo13962f();
                    throw th;
                }
            }
        }
        if (z) {
            kpjVar.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m14376e(kjo kjoVar) {
        this.f36268f.mo13944f("Closing " + String.valueOf(this.f36269g) + " and configuring " + kjoVar.toString());
        this.f36269g.m14383b();
        this.f36269g = kjoVar;
        kpj kpjVar = this.f36270h;
        if (kpjVar == null) {
            this.f36268f.mo13944f("CameraDevice is not open yet. Waiting for onOpened.");
        } else {
            this.f36264b.mo14373d(kpjVar, kjoVar, kjoVar.m14382a(), this.f36266d);
            kjoVar.m14388g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m14377f() {
        return this.f36263a.mo8995b();
    }
}
