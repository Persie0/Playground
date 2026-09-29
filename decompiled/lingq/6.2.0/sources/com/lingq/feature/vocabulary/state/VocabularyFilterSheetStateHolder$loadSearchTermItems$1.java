package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.vocabulary.VocabularySearch;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.c32;
import p000.fa4;
import p000.fv8;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadSearchTermItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadSearchTermItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2860b f33725a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadSearchTermItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33725a = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadSearchTermItems$1(this.f33725a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyFilterSheetStateHolder$loadSearchTermItems$1 vocabularyFilterSheetStateHolder$loadSearchTermItems$1 = (VocabularyFilterSheetStateHolder$loadSearchTermItems$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyFilterSheetStateHolder$loadSearchTermItems$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        VocabularySearch vocabularySearch;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        new VocabularySearchQuery();
        List listM23605K = vz1.m23605K(VocabularySearch.StartsWith, VocabularySearch.EndsWith, VocabularySearch.Contains, VocabularySearch.PhraseContaining, VocabularySearch.MeaningContaining);
        ArrayList arrayList = new ArrayList(v91.m23189q0(listM23605K, 10));
        Iterator it = listM23605K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C2860b c2860b = this.f33725a;
            if (!zHasNext) {
                c2860b.m9767f(arrayList);
                return xfa.f68157a;
            }
            VocabularySearch vocabularySearch2 = (VocabularySearch) it.next();
            Integer num = new Integer(AbstractC3423or.m18226K(vocabularySearch2));
            String columnName = vocabularySearch2.getColumnName();
            VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
            arrayList.add(new fv8(2, num, null, vocabularySearch2.getColumnName(), fa4.m11650l(columnName, (vocabularySearchQuery == null || (vocabularySearch = vocabularySearchQuery.f19861c) == null) ? null : vocabularySearch.getColumnName())));
        }
    }
}
