package p000;

import android.content.Context;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.settings.C1859b;
import com.lingq.feature.onboarding.dictionary.C2206a;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lt6 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f50114b;

    public /* synthetic */ lt6(Object obj, int i) {
        this.f50113a = i;
        this.f50114b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f50113a;
        Object obj3 = this.f50114b;
        switch (i) {
            case 0:
                Context context = ((C2206a) obj3).f27215c;
                return ss5.m21718o(AbstractC3352my.m17093L(context, ((DictionaryLocale) obj).f19021a), AbstractC3352my.m17093L(context, ((DictionaryLocale) obj2).f19021a));
            case 1:
                String str = ((DictionaryLocale) obj).f19021a;
                ((C1859b) obj3).getClass();
                return ss5.m21718o(C1859b.m8613Y2(str), C1859b.m8613Y2(((DictionaryLocale) obj2).f19021a));
            default:
                List list = (List) obj3;
                return ss5.m21718o(Integer.valueOf(list.indexOf(((aia) obj).f701a)), Integer.valueOf(list.indexOf(((aia) obj2).f701a)));
        }
    }
}
