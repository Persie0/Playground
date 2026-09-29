package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sn4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f61059b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f61060c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f61061d;

    public /* synthetic */ sn4(double d, int i, String str, String str2) {
        this.f61058a = i;
        this.f61059b = d;
        this.f61060c = str;
        this.f61061d = str2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f61058a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f61061d;
        String str2 = this.f61060c;
        double d = this.f61059b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("UPDATE LanguageProgressEntity SET speakingTime = speakingTime + ? WHERE languageCode = ? AND interval = ?");
                try {
                    ik8VarMo2873e0.mo2877g(1, d);
                    ik8VarMo2873e0.mo2874C(2, str2);
                    ik8VarMo2873e0.mo2874C(3, str);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("UPDATE LanguageStatsEntity SET listening_change = listening_change + ?, listening_overall = listening_overall + ? WHERE language = ? AND period = ?");
                try {
                    ik8VarMo2873e1.mo2877g(1, d);
                    ik8VarMo2873e1.mo2877g(2, d);
                    ik8VarMo2873e1.mo2874C(3, str2);
                    ik8VarMo2873e1.mo2874C(4, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0("UPDATE LanguageProgressEntity SET listeningTime = listeningTime + ? WHERE languageCode = ? AND interval = ?");
                try {
                    ik8VarMo2873e2.mo2877g(1, d);
                    ik8VarMo2873e2.mo2874C(2, str2);
                    ik8VarMo2873e2.mo2874C(3, str);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
        }
    }
}
