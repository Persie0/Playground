package com.lingq.p055ui.home.language;

import android.content.Context;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p096ei.C5408a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/language/a$a;", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguages", "Lcom/lingq/shared/uimodel/language/LanguageToLearn;", "allLanguages", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.LanguageSelectorViewModel$languageSelectList$1", m19206f = "LanguageSelectorViewModel.kt", m19207l = {120}, m19208m = "invokeSuspend")
public final class LanguageSelectorViewModel$languageSelectList$1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super List<? extends C3700a.a>>, List<? extends UserLanguage>, List<? extends LanguageToLearn>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24205e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24206f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f24207g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f24208h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f24209i;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorViewModel$languageSelectList$1$a */
    public static final class C3697a<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f24210a;

        public C3697a(Context context) {
            this.f24210a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            String str = ((UserLanguage) t10).f21726a;
            Context context = this.f24210a;
            return C7499b.m14951m(C4924a.m10439R(context, str), C4924a.m10439R(context, ((UserLanguage) t11).f21726a));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorViewModel$languageSelectList$1$b */
    public static final class C3698b<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f24211a;

        public C3698b(Context context) {
            this.f24211a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            String str = ((LanguageToLearn) t10).f21681a;
            Context context = this.f24211a;
            return C7499b.m14951m(C4924a.m10439R(context, str), C4924a.m10439R(context, ((LanguageToLearn) t11).f21681a));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorViewModel$languageSelectList$1$c */
    public static final class C3699c<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f24212a;

        public C3699c(Context context) {
            this.f24212a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            String str = ((LanguageToLearn) t10).f21681a;
            Context context = this.f24212a;
            return C7499b.m14951m(C4924a.m10439R(context, str), C4924a.m10439R(context, ((LanguageToLearn) t11).f21681a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorViewModel$languageSelectList$1(Context context, InterfaceC9968c<? super LanguageSelectorViewModel$languageSelectList$1> interfaceC9968c) {
        super(4, interfaceC9968c);
        this.f24209i = context;
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(InterfaceC7117d<? super List<? extends C3700a.a>> interfaceC7117d, List<? extends UserLanguage> list, List<? extends LanguageToLearn> list2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LanguageSelectorViewModel$languageSelectList$1 languageSelectorViewModel$languageSelectList$1 = new LanguageSelectorViewModel$languageSelectList$1(this.f24209i, interfaceC9968c);
        languageSelectorViewModel$languageSelectList$1.f24206f = interfaceC7117d;
        languageSelectorViewModel$languageSelectList$1.f24207g = list;
        languageSelectorViewModel$languageSelectList$1.f24208h = list2;
        return languageSelectorViewModel$languageSelectList$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons;
        Object next;
        Object next2;
        boolean z10;
        Object next3;
        Object next4;
        Object next5;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24205e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24206f;
            List list = this.f24207g;
            List list2 = this.f24208h;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new C3700a.a.b(R.string.lingq_languages));
            if ((!list.isEmpty()) && (!list2.isEmpty())) {
                Context context = this.f24209i;
                List listM13447o0 = C6752c.m13447o0(list, new C3697a(context));
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13447o0, 10));
                Iterator it = listM13447o0.iterator();
                while (it.hasNext()) {
                    UserLanguage userLanguage = (UserLanguage) it.next();
                    arrayList.add(new C3700a.a.C10621a(new LanguageToLearn(userLanguage.f21726a, userLanguage.f21730e, userLanguage.f21731f, userLanguage.f21733h, userLanguage.f21734i, userLanguage.f21732g), true));
                    it = it;
                    coroutineSingletons2 = coroutineSingletons2;
                }
                coroutineSingletons = coroutineSingletons2;
                for (LanguageLearn languageLearn : C5408a.f33824a) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it2.next();
                    } while (!C5207g.m11106a(((C3700a.a.C10621a) next5).f24214a.f21681a, C5408a.m11569b(languageLearn)));
                    C3700a.a.C10621a c10621a = (C3700a.a.C10621a) next5;
                    if (c10621a != null) {
                        linkedHashSet.add(c10621a);
                    }
                }
                linkedHashSet.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (true) {
                    boolean z11 = false;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next6 = it3.next();
                    LanguageToLearn languageToLearn = (LanguageToLearn) next6;
                    if (languageToLearn.f21682b) {
                        String str = languageToLearn.f21686f;
                        if (str == null || str.length() == 0) {
                            Iterator it4 = list.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it4.next();
                            } while (!C5207g.m11106a(((UserLanguage) next4).f21726a, languageToLearn.f21681a));
                            if (next4 == null) {
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        arrayList2.add(next6);
                    }
                }
                List listM13447o1 = C6752c.m13447o0(arrayList2, new C3698b(context));
                ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listM13447o1, 10));
                Iterator it5 = listM13447o1.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(new C3700a.a.C10621a((LanguageToLearn) it5.next(), false));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    LanguageToLearn languageToLearn2 = (LanguageToLearn) obj2;
                    if (languageToLearn2.f21682b) {
                        z10 = false;
                    } else {
                        String str2 = languageToLearn2.f21686f;
                        if (str2 == null || str2.length() == 0) {
                            Iterator it6 = list.iterator();
                            do {
                                if (!it6.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it6.next();
                            } while (!C5207g.m11106a(((UserLanguage) next3).f21726a, languageToLearn2.f21681a));
                            if (next3 == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        arrayList4.add(obj2);
                    }
                }
                List listM13447o2 = C6752c.m13447o0(arrayList4, new C3699c(context));
                ArrayList arrayList5 = new ArrayList(C9325m.m17681z(listM13447o2, 10));
                Iterator it7 = listM13447o2.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(new C3700a.a.C10621a((LanguageToLearn) it7.next(), false));
                }
                if (!arrayList3.isEmpty()) {
                    linkedHashSet.add(new C3700a.a.b(R.string.lingq_all_languages));
                    for (LanguageLearn languageLearn2 : C5408a.f33824a) {
                        Iterator it8 = arrayList3.iterator();
                        do {
                            if (!it8.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it8.next();
                        } while (!C5207g.m11106a(((C3700a.a.C10621a) next2).f24214a.f21681a, C5408a.m11569b(languageLearn2)));
                        C3700a.a.C10621a c10621a2 = (C3700a.a.C10621a) next2;
                        if (c10621a2 != null) {
                            linkedHashSet.add(c10621a2);
                        }
                    }
                    linkedHashSet.addAll(arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    linkedHashSet.add(new C3700a.a.b(R.string.ui_even_more));
                    for (LanguageLearn languageLearn3 : C5408a.f33824a) {
                        Iterator it9 = arrayList5.iterator();
                        do {
                            if (!it9.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it9.next();
                        } while (!C5207g.m11106a(((C3700a.a.C10621a) next).f24214a.f21681a, C5408a.m11569b(languageLearn3)));
                        C3700a.a.C10621a c10621a3 = (C3700a.a.C10621a) next;
                        if (c10621a3 != null) {
                            linkedHashSet.add(c10621a3);
                        }
                    }
                    linkedHashSet.addAll(arrayList5);
                }
            } else {
                coroutineSingletons = coroutineSingletons2;
            }
            List listM13453u0 = C6752c.m13453u0(linkedHashSet);
            this.f24206f = null;
            this.f24207g = null;
            this.f24205e = 1;
            Object objMo1339r = interfaceC7117d.mo1339r(listM13453u0, this);
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
            if (objMo1339r == coroutineSingletons3) {
                return coroutineSingletons3;
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
