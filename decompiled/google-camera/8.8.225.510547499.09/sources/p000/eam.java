package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eam implements gad {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f13072a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f13073b;

    public /* synthetic */ eam(enj enjVar, int i) {
        this.f13073b = i;
        this.f13072a = enjVar;
    }

    public /* synthetic */ eam(jvb jvbVar, int i) {
        this.f13073b = i;
        this.f13072a = jvbVar;
    }

    public /* synthetic */ eam(jwl jwlVar, int i, byte[] bArr) {
        this.f13073b = i;
        this.f13072a = jwlVar;
    }

    public /* synthetic */ eam(oju ojuVar, int i) {
        this.f13073b = i;
        this.f13072a = ojuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [enj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kbz] */
    @Override // p000.gad, java.lang.Runnable
    public final void run() {
        boolean zM13628d;
        switch (this.f13073b) {
            case 0:
                this.f13072a.close();
                return;
            case 1:
                ((djm) this.f13072a.get()).m6233h();
                return;
            case 2:
                ((fky) this.f13072a.get()).m8536b();
                return;
            case 3:
                ((frx) this.f13072a.get()).m8737g();
                return;
            case 4:
                ((jvb) this.f13072a).close();
                return;
            default:
                Object obj = this.f13072a;
                jwl jwlVar = (jwl) obj;
                jwlVar.f34957d.mo13961e(TVkaNXnfP.TnpySMZ);
                synchronized (obj) {
                    ((jwl) obj).f34954a = true;
                    zM13628d = ((jwl) obj).m13628d();
                    break;
                }
                if (zM13628d) {
                    jwlVar.m13627c();
                }
                jwlVar.f34957d.mo13962f();
                return;
        }
    }
}
