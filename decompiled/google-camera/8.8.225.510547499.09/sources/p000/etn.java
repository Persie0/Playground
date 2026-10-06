package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etn {

    /* JADX INFO: renamed from: a */
    public final Object f19836a;

    /* JADX INFO: renamed from: b */
    public final Object f19837b;

    /* JADX INFO: renamed from: c */
    public final Object f19838c;

    /* JADX INFO: renamed from: d */
    public Object f19839d;

    public etn(elx elxVar, hah hahVar, hai haiVar) {
        this.f19837b = elxVar;
        this.f19838c = hahVar;
        this.f19836a = haiVar;
    }

    public etn(esz eszVar, esr esrVar, esw eswVar) {
        this.f19836a = eszVar;
        this.f19837b = esrVar;
        this.f19838c = eswVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kba] */
    /* JADX INFO: renamed from: a */
    public final void m7868a() {
        ?? r0 = this.f19839d;
        if (r0 != 0) {
            r0.close();
            this.f19839d = null;
        }
    }
}
