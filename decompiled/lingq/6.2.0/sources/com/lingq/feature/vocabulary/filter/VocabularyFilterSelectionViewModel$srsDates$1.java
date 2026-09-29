package com.lingq.feature.vocabulary.filter;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fv8;
import p000.u91;
import p000.v91;
import p000.vk9;
import p000.xfa;
import p000.y02;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$srsDates$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$srsDates$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f33640a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f33641b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VocabularyFilterSelectionViewModel$srsDates$1 vocabularyFilterSelectionViewModel$srsDates$1 = new VocabularyFilterSelectionViewModel$srsDates$1(3, (Continuation) obj3);
        vocabularyFilterSelectionViewModel$srsDates$1.f33640a = (String) obj;
        vocabularyFilterSelectionViewModel$srsDates$1.f33641b = (List) obj2;
        return vocabularyFilterSelectionViewModel$srsDates$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.f33640a;
        List list = this.f33641b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (String str2 : list2) {
            String strM24807e = y02.m24807e(str2, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy");
            String str3 = (String) u91.m22591I0(vk9.m23365A0(str2, new String[]{"T"}, 0, 6));
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new fv8(1, null, strM24807e, str2, str3.equals(str)));
        }
        return arrayList;
    }
}
