package com.lingq.feature.vocabulary.filter;

import com.lingq.core.settings.FilterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fv8;
import p000.i1b;
import p000.j1b;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionViewModel$selectionItems$1", m4291f = "VocabularyFilterSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSelectionViewModel$selectionItems$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f33637a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f33638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2850b f33639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$selectionItems$1(C2850b c2850b, Continuation continuation) {
        super(3, continuation);
        this.f33639c = c2850b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VocabularyFilterSelectionViewModel$selectionItems$1 vocabularyFilterSelectionViewModel$selectionItems$1 = new VocabularyFilterSelectionViewModel$selectionItems$1(this.f33639c, (Continuation) obj3);
        vocabularyFilterSelectionViewModel$selectionItems$1.f33637a = (List) obj;
        vocabularyFilterSelectionViewModel$selectionItems$1.f33638b = (String) obj2;
        return vocabularyFilterSelectionViewModel$selectionItems$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f33637a;
        String str = this.f33638b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new i1b((fv8) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (this.f33639c.f33684i == FilterType.Tags) {
            arrayList.add(0, new j1b(str));
        }
        return arrayList;
    }
}
