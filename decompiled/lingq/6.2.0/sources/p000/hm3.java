package p000;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.phrases.GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.feature.reader.content.domain.GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class hm3 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f42607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Locale f42608c;

    public /* synthetic */ hm3(e83 e83Var, Locale locale, int i) {
        this.f42606a = i;
        this.f42607b = e83Var;
        this.f42608c = locale;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1 getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1;
        GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1 getPhraseCardsUseCase$invoke$$inlined$map$1$2$1;
        int i = this.f42606a;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f42607b;
        Locale locale = this.f42608c;
        switch (i) {
            case 0:
                if (continuation instanceof GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1) {
                    getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1 = (GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i2 = getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1.f27959b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1.f27959b = i2 - Integer.MIN_VALUE;
                    } else {
                        getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1 = new GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1 = new GetLessonPhrasesUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1.f27958a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1.f27959b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                List list = (List) obj;
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P >= 16 ? iM15363P : 16);
                for (Object obj3 : list) {
                    String str = ((LessonCard) obj3).f19178a;
                    locale.getClass();
                    linkedHashMap.put(bq1.m4063n0(str, locale), obj3);
                }
                getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1.f27959b = 1;
                return e83Var.emit(linkedHashMap, getLessonPhrasesUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1) {
                    getPhraseCardsUseCase$invoke$$inlined$map$1$2$1 = (GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i4 = getPhraseCardsUseCase$invoke$$inlined$map$1$2$1.f19880b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        getPhraseCardsUseCase$invoke$$inlined$map$1$2$1.f19880b = i4 - Integer.MIN_VALUE;
                    } else {
                        getPhraseCardsUseCase$invoke$$inlined$map$1$2$1 = new GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getPhraseCardsUseCase$invoke$$inlined$map$1$2$1 = new GetPhraseCardsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj4 = getPhraseCardsUseCase$invoke$$inlined$map$1$2$1.f19879a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = getPhraseCardsUseCase$invoke$$inlined$map$1$2$1.f19880b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                List list2 = (List) obj;
                int iM15363P2 = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM15363P2 >= 16 ? iM15363P2 : 16);
                for (Object obj5 : list2) {
                    String str2 = ((LessonCard) obj5).f19178a;
                    locale.getClass();
                    linkedHashMap2.put(bq1.m4063n0(str2, locale), obj5);
                }
                getPhraseCardsUseCase$invoke$$inlined$map$1$2$1.f19880b = 1;
                return e83Var.emit(linkedHashMap2, getPhraseCardsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}
