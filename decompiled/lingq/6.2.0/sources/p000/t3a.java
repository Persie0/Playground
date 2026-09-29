package p000;

import com.lingq.core.database.entity.TranslationsEntity;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t3a extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f61812p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ v3a f61813q;

    public /* synthetic */ t3a(v3a v3aVar, int i) {
        this.f61812p = i;
        this.f61813q = v3aVar;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        int i = this.f61812p;
        v3a v3aVar = this.f61813q;
        switch (i) {
            case 0:
                TranslationsEntity translationsEntity = (TranslationsEntity) obj;
                ik8Var.getClass();
                translationsEntity.getClass();
                String str = translationsEntity.f17482a;
                ik8Var.mo2874C(1, str);
                qn3 qn3Var = v3aVar.f64798c;
                List list = translationsEntity.f17483b;
                qn3Var.getClass();
                list.getClass();
                yf4 yf4Var = (yf4) qn3Var.f57974a;
                yf4Var.getClass();
                ik8Var.mo2874C(2, yf4Var.m10322b(new C2978ev(TokenTranslationSimple.Companion.serializer()), list));
                ik8Var.mo2874C(3, str);
                break;
            case 1:
                f4a f4aVar = (f4a) obj;
                ik8Var.getClass();
                f4aVar.getClass();
                String str2 = f4aVar.f38416a;
                ik8Var.mo2874C(1, str2);
                String str3 = f4aVar.f38417b;
                ik8Var.mo2874C(2, str3);
                ik8Var.mo2874C(3, v3aVar.f64798c.m20080z(f4aVar.f38418c));
                ik8Var.mo2874C(4, str2);
                ik8Var.mo2874C(5, str3);
                break;
            default:
                b5a b5aVar = (b5a) obj;
                ik8Var.getClass();
                b5aVar.getClass();
                String str4 = b5aVar.f7976a;
                ik8Var.mo2874C(1, str4);
                qn3 qn3Var2 = v3aVar.f64798c;
                ArrayList arrayList = b5aVar.f7977b;
                yf4 yf4Var2 = (yf4) qn3Var2.f57974a;
                yf4Var2.getClass();
                ik8Var.mo2874C(2, yf4Var2.m10322b(new C2978ev(TokenRelatedPhrase.Companion.serializer()), arrayList));
                ik8Var.mo2874C(3, str4);
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f61812p) {
            case 0:
                return "UPDATE `TranslationsEntity` SET `termWithLanguageAndTarget` = ?,`translations` = ? WHERE `termWithLanguageAndTarget` = ?";
            case 1:
                return "UPDATE `TokenPopularMeaningsEntity` SET `termWithLanguage` = ?,`locale` = ?,`popularMeanings` = ? WHERE `termWithLanguage` = ? AND `locale` = ?";
            default:
                return "UPDATE `TokenRelatedPhrasesEntity` SET `termWithLanguage` = ?,`relatedPhrases` = ? WHERE `termWithLanguage` = ?";
        }
    }
}
