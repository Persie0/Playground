package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dxt implements ciw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f12848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f12849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f12850d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f12851e;

    public /* synthetic */ dxt(csn csnVar, oju ojuVar, jvb jvbVar, oju ojuVar2, int i) {
        this.f12851e = i;
        this.f12848b = csnVar;
        this.f12847a = ojuVar;
        this.f12849c = jvbVar;
        this.f12850d = ojuVar2;
    }

    public /* synthetic */ dxt(nps npsVar, mrm mrmVar, mrm mrmVar2, jvd jvdVar, int i) {
        this.f12851e = i;
        this.f12850d = npsVar;
        this.f12849c = mrmVar;
        this.f12847a = mrmVar2;
        this.f12848b = jvdVar;
    }

    public /* synthetic */ dxt(oju ojuVar, ckp ckpVar, kbz kbzVar, oju ojuVar2, int i) {
        this.f12851e = i;
        this.f12847a = ojuVar;
        this.f12848b = ckpVar;
        this.f12849c = kbzVar;
        this.f12850d = ojuVar2;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        switch (this.f12851e) {
            case 0:
                break;
            case 1:
                break;
        }
        return dez.m6039i(this);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, oju] */
    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        switch (this.f12851e) {
            case 0:
                Object obj = this.f12847a;
                Object obj2 = this.f12848b;
                ?? r3 = this.f12849c;
                ?? r4 = this.f12850d;
                dxw dxwVar = (dxw) obj;
                Handler handler = dxwVar.get();
                obj2.getClass();
                handler.post(new drs((ckp) obj2, 9));
                dxwVar.get().post(new dgq((kbz) r3, (oju) r4, 9));
                return kxk.m14965K(true);
            case 1:
                Object obj3 = this.f12848b;
                ?? r2 = this.f12847a;
                Object obj4 = this.f12849c;
                ?? r5 = this.f12850d;
                if (((csn) obj3).f9330B) {
                    czp czpVar = (czp) r2.get();
                    synchronized (czpVar.f10125b) {
                        czpVar.f10126c = jzn.m13824l("cc-frame-qual-scorer");
                        break;
                    }
                    czpVar.f10124a.m13537d(new cft(czpVar, 17));
                    ((jvb) obj4).m13537d(((czr) r5.get()).m5743a((czp) r2.get()));
                }
                return kxk.m14965K(true);
            default:
                ?? r0 = this.f12850d;
                Object obj5 = this.f12849c;
                Object obj6 = this.f12847a;
                return nnj.m17524j(nod.m17553i(r0, new dvz((mrm) obj5, (mrm) obj6, 5), this.f12848b), Throwable.class, etv.f19879d, not.INSTANCE);
        }
    }
}
