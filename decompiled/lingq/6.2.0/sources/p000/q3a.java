package p000;

import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q3a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v3a f57210c;

    public /* synthetic */ q3a(String str, v3a v3aVar, int i) {
        this.f57208a = i;
        this.f57209b = str;
        this.f57210c = v3aVar;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f57208a;
        Object tokenTranslations = null;
        v3a v3aVar = this.f57210c;
        String str = this.f57209b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM TranslationsEntity WHERE termWithLanguageAndTarget = ?");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "termWithLanguageAndTarget");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translations");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(iM14108v2);
                        qn3 qn3Var = v3aVar.f64798c;
                        qn3Var.getClass();
                        strMo2875L2.getClass();
                        yf4 yf4Var = (yf4) qn3Var.f57974a;
                        yf4Var.getClass();
                        tokenTranslations = new TokenTranslations(strMo2875L, (List) yf4Var.m10321a(strMo2875L2, new C2978ev(TokenTranslationSimple.Companion.serializer())));
                        break;
                    }
                    return tokenTranslations;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                bk8Var.getClass();
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("SELECT relatedPhrases FROM TokenRelatedPhrasesEntity WHERE termWithLanguage = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str);
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L3 = ik8VarMo2873e1.mo2875L(0);
                        qn3 qn3Var2 = v3aVar.f64798c;
                        qn3Var2.getClass();
                        strMo2875L3.getClass();
                        yf4 yf4Var2 = (yf4) qn3Var2.f57974a;
                        yf4Var2.getClass();
                        tokenTranslations = new a5a((List) yf4Var2.m10321a(strMo2875L3, new C2978ev(TokenRelatedPhrase.Companion.serializer())));
                        break;
                    }
                    return tokenTranslations;
                } finally {
                    ik8VarMo2873e1.close();
                }
        }
    }
}
