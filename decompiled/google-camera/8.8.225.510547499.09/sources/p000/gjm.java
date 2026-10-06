package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gjm implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f25021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f25022d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f25023e;

    public /* synthetic */ gjm(Handler handler, kbo kboVar, khg khgVar, jvb jvbVar, int i) {
        this.f25023e = i;
        this.f25019a = handler;
        this.f25022d = kboVar;
        this.f25021c = khgVar;
        this.f25020b = jvbVar;
    }

    public /* synthetic */ gjm(epr eprVar, eqc eqcVar, jwf jwfVar, epy epyVar, int i) {
        this.f25023e = i;
        this.f25019a = eprVar;
        this.f25022d = eqcVar;
        this.f25021c = jwfVar;
        this.f25020b = epyVar;
    }

    public /* synthetic */ gjm(fuw fuwVar, gia giaVar, kfo kfoVar, kba kbaVar, int i) {
        this.f25023e = i;
        this.f25019a = fuwVar;
        this.f25020b = giaVar;
        this.f25021c = kfoVar;
        this.f25022d = kbaVar;
    }

    public /* synthetic */ gjm(hez hezVar, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, int i) {
        this.f25023e = i;
        this.f25019a = hezVar;
        this.f25020b = mrmVar;
        this.f25022d = mrmVar2;
        this.f25021c = mrmVar3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gia, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kba] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        switch (this.f25023e) {
            case 0:
                ?? r0 = this.f25019a;
                ?? r1 = this.f25020b;
                ?? r2 = this.f25021c;
                ?? r3 = this.f25022d;
                r0.close();
                r1.close();
                r2.close();
                r3.close();
                break;
            case 1:
                Object obj = this.f25019a;
                Object obj2 = this.f25022d;
                epr eprVar = (epr) obj;
                eqc eqcVar = (eqc) obj2;
                eqcVar.m7681f(new epm(eprVar, (jwf) this.f25021c, (epy) this.f25020b, i));
                break;
            case 2:
                Object obj3 = this.f25019a;
                Object obj4 = this.f25020b;
                mrm mrmVar = (mrm) obj4;
                hez hezVar = (hez) obj3;
                hezVar.m10169f(mrmVar, (mrm) this.f25022d, (mrm) this.f25021c);
                break;
            default:
                Object obj5 = this.f25019a;
                Handler handler = (Handler) obj5;
                handler.postDelayed(new kha((kbo) this.f25022d, (khg) this.f25021c, (jvb) this.f25020b, 0), 2000L);
                break;
        }
    }
}
