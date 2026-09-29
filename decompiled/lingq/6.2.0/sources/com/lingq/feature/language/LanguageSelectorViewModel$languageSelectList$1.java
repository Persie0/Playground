package com.lingq.feature.language;

import android.content.Context;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2993f9;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.u91;
import p000.v91;
import p000.wm4;
import p000.xfa;
import p000.xm4;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.language.LanguageSelectorViewModel$languageSelectList$1", m4291f = "LanguageSelectorViewModel.kt", m4292l = {113}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageSelectorViewModel$languageSelectList$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f26324a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26325b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f26326c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ List f26327d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f26328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorViewModel$languageSelectList$1(Context context, Continuation continuation) {
        super(4, continuation);
        this.f26328e = context;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        LanguageSelectorViewModel$languageSelectList$1 languageSelectorViewModel$languageSelectList$1 = new LanguageSelectorViewModel$languageSelectList$1(this.f26328e, (Continuation) obj4);
        languageSelectorViewModel$languageSelectList$1.f26325b = (e83) obj;
        languageSelectorViewModel$languageSelectList$1.f26326c = (List) obj2;
        languageSelectorViewModel$languageSelectList$1.f26327d = (List) obj3;
        return languageSelectorViewModel$languageSelectList$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object next;
        String str2;
        Object next2;
        e83 e83Var = this.f26325b;
        List list = this.f26326c;
        List list2 = this.f26327d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26324a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!fa4.m11650l(((Language) obj2).f19043t, Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new xm4(R$string.lingq_languages));
            if (!arrayList.isEmpty() && !list2.isEmpty()) {
                Context context = this.f26328e;
                List<Language> listM22614f1 = u91.m22614f1(arrayList, new C2993f9(context, 3));
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22614f1, 10));
                for (Language language : listM22614f1) {
                    String str3 = language.f19024a;
                    boolean z = language.f19028e;
                    String str4 = language.f19029f;
                    int i2 = language.f19031h;
                    List list3 = list2;
                    String str5 = language.f19032i;
                    String str6 = language.f19030g;
                    Boolean bool = language.f19043t;
                    arrayList2.add(new wm4(new LanguageToLearn(str3, z, str4, i2, str5, str6, bool != null ? bool.booleanValue() : false, 16)));
                    list2 = list3;
                }
                linkedHashSet.addAll(arrayList2);
                List list4 = list2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list4) {
                    LanguageToLearn languageToLearn = (LanguageToLearn) obj3;
                    if (languageToLearn.f19114b && ((str2 = languageToLearn.f19119g) == null || str2.length() == 0)) {
                        Iterator it = arrayList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (!fa4.m11650l(((Language) next2).f19024a, languageToLearn.f19113a));
                        if (next2 == null) {
                            arrayList3.add(obj3);
                        }
                    }
                }
                List listM22614f2 = u91.m22614f1(arrayList3, new C2993f9(context, 4));
                ArrayList arrayList4 = new ArrayList(v91.m23189q0(listM22614f2, 10));
                Iterator it2 = listM22614f2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new wm4((LanguageToLearn) it2.next()));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list4) {
                    LanguageToLearn languageToLearn2 = (LanguageToLearn) obj4;
                    if (!languageToLearn2.f19114b && ((str = languageToLearn2.f19119g) == null || str.length() == 0)) {
                        Iterator it3 = arrayList.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!fa4.m11650l(((Language) next).f19024a, languageToLearn2.f19113a));
                        if (next == null) {
                            arrayList5.add(obj4);
                        }
                    }
                }
                List listM22614f3 = u91.m22614f1(arrayList5, new C2993f9(context, 5));
                ArrayList arrayList6 = new ArrayList(v91.m23189q0(listM22614f3, 10));
                Iterator it4 = listM22614f3.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new wm4((LanguageToLearn) it4.next()));
                }
                if (!arrayList4.isEmpty()) {
                    linkedHashSet.add(new xm4(com.lingq.feature.languages.R$string.lingq_all_languages));
                    linkedHashSet.addAll(arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    linkedHashSet.add(new xm4(com.lingq.feature.languages.R$string.ui_even_more));
                    linkedHashSet.addAll(arrayList6);
                }
            }
            List listM22622n1 = u91.m22622n1(linkedHashSet);
            this.f26325b = null;
            this.f26326c = null;
            this.f26327d = null;
            this.f26324a = 1;
            if (e83Var.emit(listM22622n1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
