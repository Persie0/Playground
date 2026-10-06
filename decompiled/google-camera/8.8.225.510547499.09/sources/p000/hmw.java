package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hmw {

    /* JADX INFO: renamed from: a */
    public final jwf f28364a;

    /* JADX INFO: renamed from: b */
    public boolean f28365b;

    /* JADX INFO: renamed from: c */
    private final dhv f28366c;

    /* JADX INFO: renamed from: d */
    private final hai f28367d;

    /* JADX INFO: renamed from: e */
    private final jvd f28368e;

    /* JADX INFO: renamed from: f */
    private final jwn f28369f;

    /* JADX INFO: renamed from: g */
    private kba f28370g;

    /* JADX INFO: renamed from: h */
    private final chx f28371h;

    public hmw(dhv dhvVar, hai haiVar, jww jwwVar, hnv hnvVar, hnw hnwVar, chx chxVar, jvd jvdVar) {
        jwf jwfVar = new jwf(true);
        this.f28364a = jwfVar;
        this.f28365b = false;
        this.f28366c = dhvVar;
        this.f28367d = haiVar;
        this.f28371h = chxVar;
        this.f28368e = jvdVar;
        dhx dhxVar = diw.f11719a;
        dhvVar.mo6179g();
        jvb jvbVar = chxVar.f5767b;
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10525d("Swiss");
        hnyVarM10529a.m10524c(jvdVar);
        hnyVarM10529a.m10528g(hnvVar);
        hnyVarM10529a.m10527f(new hmm(this, 3));
        hnyVarM10529a.m10526e(new hmm(this, 4));
        jvbVar.m13537d(hnwVar.mo10519f(hnyVarM10529a.m10522a()));
        this.f28369f = jwr.m13640j(jwr.m13632b(jwwVar, jwfVar), new hgv(dhvVar, 2));
    }

    /* JADX INFO: renamed from: a */
    public final jwn m10476a() {
        return jwr.m13640j(jwr.m13632b(this.f28369f, m10477b()), fod.f22914s);
    }

    /* JADX INFO: renamed from: b */
    public final jww m10477b() {
        dhv dhvVar = this.f28366c;
        dhx dhxVar = diw.f11719a;
        dhvVar.mo6179g();
        return this.f28367d.mo10030b(gzy.f27032ap);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m10478c() {
        if (((Boolean) this.f28369f.mo3831be()).booleanValue()) {
            m10479d();
            return;
        }
        if (!this.f28365b) {
            this.f28365b = true;
            if (this.f28370g == null) {
                kba kbaVarMo3830a = this.f28369f.mo3830a(new hmv(this, 0), this.f28368e);
                this.f28370g = kbaVarMo3830a;
                this.f28371h.f5767b.m13537d(kbaVarMo3830a);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m10479d() {
        m10477b().mo3415bf(Integer.valueOf(jeu.m12985i(1)));
        this.f28365b = false;
        kba kbaVar = this.f28370g;
        if (kbaVar != null) {
            kbaVar.close();
            this.f28370g = null;
        }
    }
}
