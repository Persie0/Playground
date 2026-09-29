package p000;

import android.content.Context;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageToLearn;
import java.util.Comparator;

/* JADX INFO: renamed from: f9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2993f9 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f38638b;

    public /* synthetic */ C2993f9(Context context, int i) {
        this.f38637a = i;
        this.f38638b = context;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f38637a;
        Context context = this.f38638b;
        switch (i) {
            case 0:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((DictionaryLocale) obj).f19021a), AbstractC3352my.m17093L(context, ((DictionaryLocale) obj2).f19021a));
            case 1:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((DictionaryLocale) obj).f19021a), AbstractC3352my.m17093L(context, ((DictionaryLocale) obj2).f19021a));
            case 2:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((DictionaryLocale) obj).f19021a), AbstractC3352my.m17093L(context, ((DictionaryLocale) obj2).f19021a));
            case 3:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((Language) obj).f19024a), AbstractC3352my.m17093L(context, ((Language) obj2).f19024a));
            case 4:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((LanguageToLearn) obj).f19113a), AbstractC3352my.m17093L(context, ((LanguageToLearn) obj2).f19113a));
            default:
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((LanguageToLearn) obj).f19113a), AbstractC3352my.m17093L(context, ((LanguageToLearn) obj2).f19113a));
        }
    }
}
