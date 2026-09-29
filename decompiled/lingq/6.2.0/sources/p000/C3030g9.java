package p000;

import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: renamed from: g9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3030g9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40406a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f40407b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40408c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40409d;

    public C3030g9(b32 b32Var, vi3 vi3Var, LessonWord lessonWord) {
        this.f40406a = 1;
        this.f40408c = b32Var;
        this.f40407b = vi3Var;
        this.f40409d = lessonWord;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f40406a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f40409d;
        Object obj2 = this.f40408c;
        vi3 vi3Var = this.f40407b;
        switch (i) {
            case 0:
                vi3Var.invoke(((DictionaryLocale) obj2).f19021a);
                ((ui3) obj).mo0a();
                break;
            case 1:
                if (!((b32) obj2).f7837b) {
                    vi3Var.invoke(sja.f60942a);
                } else {
                    vi3Var.invoke(new tja((LessonWord) obj));
                }
                break;
            default:
                vi3Var.invoke(new wka(((hla) obj2).f42587a.f39761d));
                ((vi3) obj).invoke(kla.f47497a);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3030g9(vi3 vi3Var, Object obj, xi3 xi3Var, int i) {
        this.f40406a = i;
        this.f40407b = vi3Var;
        this.f40408c = obj;
        this.f40409d = xi3Var;
    }
}
