package p000;

import com.lingq.core.database.entity.TranslationsEntity;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s3a extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ v3a f60244A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f60245z;

    public /* synthetic */ s3a(v3a v3aVar, int i) {
        this.f60245z = i;
        this.f60244A = v3aVar;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        int i = this.f60245z;
        v3a v3aVar = this.f60244A;
        switch (i) {
            case 0:
                TranslationsEntity translationsEntity = (TranslationsEntity) obj;
                ik8Var.getClass();
                translationsEntity.getClass();
                ik8Var.mo2874C(1, translationsEntity.f17482a);
                qn3 qn3Var = v3aVar.f64798c;
                List list = translationsEntity.f17483b;
                qn3Var.getClass();
                list.getClass();
                yf4 yf4Var = (yf4) qn3Var.f57974a;
                yf4Var.getClass();
                ik8Var.mo2874C(2, yf4Var.m10322b(new C2978ev(TokenTranslationSimple.Companion.serializer()), list));
                break;
            case 1:
                f4a f4aVar = (f4a) obj;
                ik8Var.getClass();
                f4aVar.getClass();
                ik8Var.mo2874C(1, f4aVar.f38416a);
                ik8Var.mo2874C(2, f4aVar.f38417b);
                ik8Var.mo2874C(3, v3aVar.f64798c.m20080z(f4aVar.f38418c));
                break;
            default:
                b5a b5aVar = (b5a) obj;
                ik8Var.getClass();
                b5aVar.getClass();
                ik8Var.mo2874C(1, b5aVar.f7976a);
                qn3 qn3Var2 = v3aVar.f64798c;
                ArrayList arrayList = b5aVar.f7977b;
                yf4 yf4Var2 = (yf4) qn3Var2.f57974a;
                yf4Var2.getClass();
                ik8Var.mo2874C(2, yf4Var2.m10322b(new C2978ev(TokenRelatedPhrase.Companion.serializer()), arrayList));
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f60245z) {
            case 0:
                return "INSERT INTO `TranslationsEntity` (`termWithLanguageAndTarget`,`translations`) VALUES (?,?)";
            case 1:
                return "INSERT INTO `TokenPopularMeaningsEntity` (`termWithLanguage`,`locale`,`popularMeanings`) VALUES (?,?,?)";
            default:
                return "INSERT INTO `TokenRelatedPhrasesEntity` (`termWithLanguage`,`relatedPhrases`) VALUES (?,?)";
        }
    }
}
