package com.lingq.p055ui.token.dictionaries;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.language.C3700a;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/language/a$a;", "", "Lcom/lingq/shared/uimodel/language/LanguageToLearn;", "allLanguages", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesLocaleViewModel$languageSelectList$1", m19206f = "DictionariesLocaleViewModel.kt", m19207l = {58}, m19208m = "invokeSuspend")
final class DictionariesLocaleViewModel$languageSelectList$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<C3700a.a>>, List<? extends LanguageToLearn>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31758e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31759f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f31760g;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesLocaleViewModel$languageSelectList$1$a */
    public static final class C4872a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(((LanguageToLearn) t10).f21683c, ((LanguageToLearn) t11).f21683c);
        }
    }

    public DictionariesLocaleViewModel$languageSelectList$1(InterfaceC9968c<? super DictionariesLocaleViewModel$languageSelectList$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<C3700a.a>> interfaceC7117d, List<? extends LanguageToLearn> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        DictionariesLocaleViewModel$languageSelectList$1 dictionariesLocaleViewModel$languageSelectList$1 = new DictionariesLocaleViewModel$languageSelectList$1(interfaceC9968c);
        dictionariesLocaleViewModel$languageSelectList$1.f31759f = interfaceC7117d;
        dictionariesLocaleViewModel$languageSelectList$1.f31760g = list;
        return dictionariesLocaleViewModel$languageSelectList$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31758e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31759f;
            List list = this.f31760g;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                List<LanguageToLearn> listM13447o0 = C6752c.m13447o0(list, new C4872a());
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM13447o0, 10));
                for (LanguageToLearn languageToLearn : listM13447o0) {
                    arrayList2.add(new C3700a.a.C10621a(new LanguageToLearn(languageToLearn.f21681a, languageToLearn.f21682b, languageToLearn.f21683c, languageToLearn.f21684d, languageToLearn.f21685e, languageToLearn.f21686f), false));
                }
                arrayList.addAll(arrayList2);
            }
            this.f31759f = null;
            this.f31758e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
