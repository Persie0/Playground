package p000;

import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.feature.imports.data.UserImportSourceType;
import com.lingq.feature.search.filter.model.FilterType;

/* JADX INFO: loaded from: classes2.dex */
public final class we0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f66677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f66678c;

    public /* synthetic */ we0(vi3 vi3Var, Object obj, int i) {
        this.f66676a = i;
        this.f66677b = vi3Var;
        this.f66678c = obj;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f66676a;
        FilterType filterType = null;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f66678c;
        vi3 vi3Var = this.f66677b;
        switch (i) {
            case 0:
                vi3Var.invoke(new je0((pya) obj));
                break;
            case 1:
                vi3Var.invoke(((qr0) obj).f58098a);
                break;
            case 2:
                vi3Var.invoke(((DictionaryLocale) obj).f19021a);
                break;
            case 3:
                vi3Var.invoke((LessonTranslationSentence) obj);
                break;
            case 4:
                vi3Var.invoke(new sm4(((wm4) obj).f67053a));
                break;
            case 5:
                vi3Var.invoke((LessonCard) obj);
                break;
            case 6:
                vi3Var.invoke((LessonWord) obj);
                break;
            case 7:
                vi3Var.invoke(new go6(((in6) obj).f44308a));
                break;
            case 8:
                vi3Var.invoke(new gz7(((b29) obj).f7805b));
                break;
            case 9:
                vi3Var.invoke(new xa8((String) obj));
                break;
            case 10:
                int i2 = up8.f64192a[((y19) obj).f69100d.ordinal()];
                if (i2 == 1) {
                    filterType = FilterType.ProviderSharedBy;
                } else if (i2 == 2) {
                    filterType = FilterType.LessonTags;
                } else if (i2 == 3) {
                    filterType = FilterType.Accent;
                }
                if (filterType != null) {
                    vi3Var.invoke(new qp8(filterType));
                }
                break;
            case 11:
                int i3 = up8.f64192a[((s19) obj).f60162d.ordinal()];
                if (i3 == 1) {
                    filterType = FilterType.ProviderSharedBy;
                } else if (i3 == 2) {
                    filterType = FilterType.LessonTags;
                } else if (i3 == 3) {
                    filterType = FilterType.Accent;
                }
                if (filterType != null) {
                    vi3Var.invoke(new qp8(filterType));
                }
                break;
            case 12:
                vi3Var.invoke(new bq8(((xp8) obj).f68500a.f37942d));
                break;
            case 13:
                vi3Var.invoke(new bq8(((yp8) obj).f70262a.f44683d));
                break;
            case 14:
                vi3Var.invoke(new su8((y29) obj));
                break;
            case 15:
                vi3Var.invoke(new tu8((b39) obj));
                break;
            case 16:
                vi3Var.invoke(new k15(((dx8) obj).f36397a));
                break;
            case 17:
                if (((rc2) obj).f59062b) {
                    vi3Var.invoke(f19.f38253a);
                }
                break;
            case 18:
                vi3Var.invoke(new u09(((f29) obj).f38313b));
                break;
            case 19:
                n19 n19Var = (n19) obj;
                if (n19Var.f52190f) {
                    vi3Var.invoke(new u09(n19Var.f52185a));
                }
                break;
            case 20:
                t19 t19Var = (t19) obj;
                vi3Var.invoke(new v09(t19Var.f61752f, t19Var.f61753g));
                break;
            case 21:
                vi3Var.invoke((vs3) obj);
                break;
            case 22:
                vi3Var.invoke((TextHighlightStyle) obj);
                break;
            default:
                vi3Var.invoke((UserImportSourceType) obj);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ we0(Object obj, vi3 vi3Var, int i) {
        this.f66676a = i;
        this.f66678c = obj;
        this.f66677b = vi3Var;
    }
}
