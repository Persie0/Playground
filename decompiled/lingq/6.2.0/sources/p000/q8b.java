package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q8b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f57399b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57400c;

    public /* synthetic */ q8b(String str, int i, long j) {
        this.f57398a = i;
        this.f57399b = j;
        this.f57400c = str;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f57398a;
        String str = this.f57400c;
        long j = this.f57399b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    ik8VarMo2873e0.mo2878j(1, j);
                    ik8VarMo2873e0.mo2874C(2, str);
                    ik8VarMo2873e0.mo2876a0();
                    return Integer.valueOf(AbstractC3489q9.m19787q(bk8Var));
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    ik8VarMo2873e1.mo2878j(1, j);
                    ik8VarMo2873e1.mo2874C(2, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfa.f68157a;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
