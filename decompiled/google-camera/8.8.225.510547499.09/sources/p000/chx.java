package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chx {

    /* JADX INFO: renamed from: a */
    public final Object f5766a;

    /* JADX INFO: renamed from: b */
    public final jvb f5767b;

    /* JADX INFO: renamed from: c */
    public jvb f5768c;

    /* JADX INFO: renamed from: d */
    private jut f5769d;

    /* JADX INFO: renamed from: e */
    private jvb f5770e;

    /* JADX INFO: renamed from: f */
    private jut f5771f;

    /* JADX INFO: renamed from: g */
    private cjp f5772g;

    /* JADX INFO: renamed from: h */
    private cjp f5773h;

    public chx() {
        jvb jvbVar = new jvb();
        this.f5767b = jvbVar;
        this.f5766a = new Object();
        jvb jvbVarM13536c = jvbVar.m13536c();
        this.f5770e = jvbVarM13536c;
        this.f5771f = m3788d(jvbVarM13536c);
        jvb jvbVarM13536c2 = this.f5770e.m13536c();
        this.f5768c = jvbVarM13536c2;
        this.f5769d = m3788d(jvbVarM13536c2);
        jvbVar.m13537d(new cjp());
        jvb jvbVar2 = this.f5770e;
        cjp cjpVar = new cjp();
        jvbVar2.m13537d(cjpVar);
        this.f5773h = cjpVar;
        jvb jvbVar3 = this.f5768c;
        cjp cjpVar2 = new cjp();
        jvbVar3.m13537d(cjpVar2);
        this.f5772g = cjpVar2;
    }

    /* JADX INFO: renamed from: d */
    private final jut m3788d(jvb jvbVar) {
        jut jutVar = new jut(new jus(this, jvbVar, 1));
        jvbVar.m13537d(jutVar);
        return jutVar;
    }

    /* JADX INFO: renamed from: a */
    public final jvb m3789a(jvb jvbVar) {
        jvb jvbVarM13536c = jvbVar.m13536c();
        synchronized (this.f5766a) {
            if (this.f5772g.m3826a()) {
                jvb jvbVarM13536c2 = this.f5770e.m13536c();
                this.f5768c = jvbVarM13536c2;
                jvbVarM13536c2.m13537d(cgw.f5692e);
                this.f5769d = m3788d(this.f5768c);
                jvb jvbVar2 = this.f5768c;
                cjp cjpVar = new cjp();
                jvbVar2.m13537d(cjpVar);
                this.f5772g = cjpVar;
            }
            kba kbaVarM13527a = this.f5769d.m13527a();
            if (kbaVarM13527a != null) {
                jvbVarM13536c.m13537d(kbaVarM13527a);
            }
        }
        return jvbVarM13536c;
    }

    /* JADX INFO: renamed from: b */
    public final jvb m3790b() {
        return this.f5767b.m13536c();
    }

    /* JADX INFO: renamed from: c */
    public final jvb m3791c(jvb jvbVar) {
        jvb jvbVarM13536c = jvbVar.m13536c();
        synchronized (this.f5766a) {
            if (this.f5773h.m3826a()) {
                jvb jvbVarM13536c2 = this.f5767b.m13536c();
                this.f5770e = jvbVarM13536c2;
                jvbVarM13536c2.m13537d(cgw.f5690c);
                this.f5771f = m3788d(this.f5770e);
                jvb jvbVar2 = this.f5770e;
                cjp cjpVar = new cjp();
                jvbVar2.m13537d(cjpVar);
                this.f5773h = cjpVar;
                jvb jvbVarM13536c3 = this.f5770e.m13536c();
                this.f5768c = jvbVarM13536c3;
                jvbVarM13536c3.m13537d(cgw.f5691d);
                this.f5769d = m3788d(this.f5768c);
                jvb jvbVar3 = this.f5768c;
                cjp cjpVar2 = new cjp();
                jvbVar3.m13537d(cjpVar2);
                this.f5772g = cjpVar2;
            }
            kba kbaVarM13527a = this.f5771f.m13527a();
            if (kbaVarM13527a != null) {
                jvbVarM13536c.m13537d(kbaVarM13527a);
            }
        }
        return jvbVarM13536c;
    }
}
