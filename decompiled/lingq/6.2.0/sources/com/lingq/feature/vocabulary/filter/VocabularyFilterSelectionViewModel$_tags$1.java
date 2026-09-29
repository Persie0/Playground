package com.lingq.feature.vocabulary.filter;

import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.fv8;
import p000.v91;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$_tags$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$_tags$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f33608a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f33609b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f33610c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        VocabularyFilterSelectionViewModel$_tags$1 vocabularyFilterSelectionViewModel$_tags$1 = new VocabularyFilterSelectionViewModel$_tags$1(4, (Continuation) obj4);
        vocabularyFilterSelectionViewModel$_tags$1.f33608a = (List) obj;
        vocabularyFilterSelectionViewModel$_tags$1.f33609b = (List) obj2;
        vocabularyFilterSelectionViewModel$_tags$1.f33610c = (String) obj3;
        return vocabularyFilterSelectionViewModel$_tags$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f33608a;
        List list2 = this.f33609b;
        String str = this.f33610c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            String str2 = (String) obj2;
            if (!vk9.m23391n0(str2) && vk9.m23380c0(str2, str, false)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
        for (String str3 : arrayList2) {
            arrayList3.add(new fv8(1, null, str3, str3, list2.contains(str3)));
        }
        arrayList.addAll(arrayList3);
        if (vk9.m23391n0(str)) {
            arrayList.add(0, new fv8(2, new Integer(R$string.search_all), null, "key_all", list2.isEmpty()));
        }
        return arrayList;
    }
}
