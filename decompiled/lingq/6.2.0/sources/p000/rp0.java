package p000;

import com.lingq.core.domain.model.language.LanguageProgressChartEntry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rp0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f59671b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f59672c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f59673d;

    public /* synthetic */ rp0(String str, int i, String str2, String str3) {
        this.f59670a = i;
        this.f59671b = str;
        this.f59672c = str2;
        this.f59673d = str3;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f59670a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f59673d;
        String str2 = this.f59672c;
        String str3 = this.f59671b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM ChallengeStatsEntity WHERE language = ? AND code = ? AND challengeCode = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str3);
                    ik8VarMo2873e0.mo2874C(2, str2);
                    ik8VarMo2873e0.mo2874C(3, str);
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("DELETE FROM ChallengeRankingEntity WHERE language = ? AND metric = ? AND challengeCode = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str3);
                    ik8VarMo2873e1.mo2874C(2, str2);
                    ik8VarMo2873e1.mo2874C(3, str);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8Var.getClass();
                ik8 ik8VarMo2873e2 = bk8Var.mo2873e0("SELECT `metric`, `languageCode`, `name`, `daily`, `cumulative` FROM (SELECT * FROM LanguageProgressChartEntryEntity WHERE languageCode = ? AND metric = ? AND period = ? ORDER BY position)");
                try {
                    ik8VarMo2873e2.mo2874C(1, str3);
                    ik8VarMo2873e2.mo2874C(2, str2);
                    ik8VarMo2873e2.mo2874C(3, str);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        arrayList.add(new LanguageProgressChartEntry(ik8VarMo2873e2.mo2875L(0), ik8VarMo2873e2.mo2875L(1), ik8VarMo2873e2.mo2875L(2), ik8VarMo2873e2.getDouble(3), ik8VarMo2873e2.getDouble(4)));
                    }
                    ik8VarMo2873e2.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e2.close();
                    throw th;
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e3 = bk8Var.mo2873e0("UPDATE OR REPLACE PlaylistEntity SET nameWithLanguage = ?, name = ? WHERE nameWithLanguage = ?");
                try {
                    ik8VarMo2873e3.mo2874C(1, str3);
                    ik8VarMo2873e3.mo2874C(2, str2);
                    ik8VarMo2873e3.mo2874C(3, str);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
        }
    }
}
