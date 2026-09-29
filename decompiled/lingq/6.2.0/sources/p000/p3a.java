package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p3a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f55533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f55534c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v3a f55535d;

    public /* synthetic */ p3a(String str, String str2, v3a v3aVar, int i) {
        this.f55532a = i;
        this.f55533b = str;
        this.f55534c = str2;
        this.f55535d = v3aVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f55532a;
        Object e4aVar = null;
        v3a v3aVar = this.f55535d;
        String str = this.f55534c;
        String str2 = this.f55533b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT popularMeanings FROM TokenPopularMeaningsEntity WHERE termWithLanguage = ? AND locale = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    ik8VarMo2873e0.mo2874C(2, str);
                    if (ik8VarMo2873e0.mo2876a0()) {
                        e4aVar = new e4a(v3aVar.f64798c.m20059N(ik8VarMo2873e0.mo2875L(0)));
                        break;
                    }
                    return e4aVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("SELECT * FROM TokenPopularMeaningsEntity WHERE termWithLanguage = ? AND locale = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    ik8VarMo2873e1.mo2874C(2, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "termWithLanguage");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "locale");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "popularMeanings");
                    if (ik8VarMo2873e1.mo2876a0()) {
                        e4aVar = new f4a(ik8VarMo2873e1.mo2875L(iM14108v), ik8VarMo2873e1.mo2875L(iM14108v2), v3aVar.f64798c.m20059N(ik8VarMo2873e1.mo2875L(iM14108v3)));
                    }
                    return e4aVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
