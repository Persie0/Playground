package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdt implements kct {

    /* JADX INFO: renamed from: a */
    public final kmg f35672a;

    /* JADX INFO: renamed from: b */
    public final kdl f35673b;

    /* JADX INFO: renamed from: c */
    public final kcv f35674c;

    /* JADX INFO: renamed from: d */
    public final kbo f35675d;

    /* JADX INFO: renamed from: h */
    private final Executor f35679h;

    /* JADX INFO: renamed from: i */
    private final kdw f35680i;

    /* JADX INFO: renamed from: j */
    private final kea f35681j;

    /* JADX INFO: renamed from: k */
    private final kbz f35682k;

    /* JADX INFO: renamed from: l */
    private final kdq f35683l;

    /* JADX INFO: renamed from: m */
    private final jvb f35684m;

    /* JADX INFO: renamed from: n */
    private kdv f35685n;

    /* JADX INFO: renamed from: p */
    private kdr f35687p;

    /* JADX INFO: renamed from: q */
    private final kcj f35688q;

    /* JADX INFO: renamed from: e */
    public boolean f35676e = false;

    /* JADX INFO: renamed from: f */
    public boolean f35677f = false;

    /* JADX INFO: renamed from: g */
    public boolean f35678g = false;

    /* JADX INFO: renamed from: o */
    private boolean f35686o = false;

    public kdt(kmg kmgVar, kdw kdwVar, kcv kcvVar, kea keaVar, Executor executor, kcj kcjVar, kbo kboVar, kbz kbzVar, kdq kdqVar, jvb jvbVar) {
        this.f35679h = kxk.m14956B(executor);
        this.f35672a = kmgVar;
        this.f35680i = kdwVar;
        this.f35674c = kcvVar;
        this.f35681j = keaVar;
        this.f35688q = kcjVar;
        this.f35675d = kboVar;
        this.f35682k = kbzVar;
        this.f35673b = ((kcz) kcvVar).f35615i;
        this.f35683l = kdqVar;
        this.f35684m = jvbVar;
        jvbVar.m13537d(new kap(this, 2));
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: a */
    public final void mo13971a() {
        this.f35683l.mo5934h(this.f35672a);
        m14006g(kcl.CAMERA_CLOSED_ERROR_CODE);
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: b */
    public final void mo13972b() {
        m14006g(kcl.CAMERA_DISCONNECTED_ERROR_CODE);
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: c */
    public final void mo13973c(kcl kclVar) {
        kcr kcoVar;
        m14006g(kclVar);
        synchronized (this) {
            kmg kmgVar = this.f35672a;
            boolean z = this.f35686o;
            kcl kclVar2 = kcl.CAMERA_OPEN_TIMEOUT;
            switch (kclVar.ordinal()) {
                case 13:
                    kcoVar = new kco(kmgVar, kclVar, z);
                    break;
                case 14:
                    kcoVar = new kcq(kmgVar, kclVar, z);
                    break;
                case 15:
                    kcoVar = new kcn(kmgVar, kclVar, z);
                    break;
                case 16:
                    kcoVar = new kcm(kmgVar, kclVar, z);
                    break;
                case 17:
                    kcoVar = new kcp(kmgVar, kclVar, z);
                    break;
                default:
                    kcoVar = new kcr(kmgVar, kclVar, z);
                    break;
            }
            this.f35683l.mo5932f(this.f35672a, kclVar, this.f35686o);
        }
        this.f35675d.mo13947i(mro.m16831a(kcoVar.getMessage()));
        this.f35681j.mo6458f(kcoVar);
    }

    @Override // p000.kct
    /* JADX INFO: renamed from: d */
    public final synchronized void mo13974d(kpj kpjVar) {
        this.f35686o = true;
        this.f35675d.mo13944f(toString().concat(" Opened"));
        kdr kdrVar = new kdr(kpjVar, this.f35675d);
        this.f35687p = kdrVar;
        this.f35688q.m13976b(kdrVar);
        this.f35683l.mo5933g(this.f35672a);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m14004e(kct kctVar) {
        if (!this.f35676e && !this.f35677f) {
            kdv kdvVar = this.f35685n;
            if (kdvVar != null) {
                this.f35675d.mo13940b(toString().concat(" passed to a new listener."));
                this.f35679h.execute(new kds(this, (kct) kdvVar, 1));
            }
            kdv kdvVar2 = new kdv();
            kdvVar2.m13998e(kctVar);
            this.f35685n = kdvVar2;
            this.f35679h.execute(new kds(this, kdvVar2, 0));
            return;
        }
        this.f35679h.execute(new jzq(kctVar, 4));
    }

    /* JADX INFO: renamed from: f */
    public final void m14005f() {
        synchronized (this) {
            if (!this.f35676e && !this.f35677f) {
                this.f35675d.mo13940b(toString() + yTyWiTtGtnBhy.riSmiA);
                this.f35676e = true;
                this.f35680i.m14008e(this);
                this.f35679h.execute(new jzq(this, 5));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14006g(kcl kclVar) {
        synchronized (this) {
            if (this.f35677f) {
                return;
            }
            this.f35676e = false;
            this.f35677f = true;
            kdr kdrVar = this.f35687p;
            if (kdrVar != null) {
                this.f35688q.m13977c(kdrVar);
                this.f35687p = null;
            }
            this.f35680i.m14008e(this);
            this.f35682k.mo13961e(toString() + hIAHJKEnGsNbz.IhGVBLoRhiY + String.valueOf(kclVar) + ")");
            this.f35675d.mo13940b(toString().concat(" Closing"));
            this.f35674c.close();
            this.f35673b.mo13971a();
            kdw kdwVar = this.f35680i;
            synchronized (kdwVar.f35691a) {
                if (kdwVar.f35692b == this) {
                    kdwVar.f35692b = null;
                }
                kdwVar.f35693c.remove(this);
            }
            this.f35684m.close();
            this.f35675d.mo13944f(toString() + " Closed (" + kclVar.m13983c() + ")");
            this.f35682k.mo13962f();
        }
    }

    public final String toString() {
        return "Camera ".concat(String.valueOf(this.f35672a.f36540a));
    }
}
