package com.lingq.feature.vocabulary.filter;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterViewModel$updateQueryWith$1", m4291f = "VocabularyFilterViewModel.kt", m4292l = {132, 138}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterViewModel$updateQueryWith$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2851c f33650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f33651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterViewModel$updateQueryWith$1(C2851c c2851c, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.f33650b = c2851c;
        this.f33651c = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterViewModel$updateQueryWith$1(this.f33650b, this.f33651c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterViewModel$updateQueryWith$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r1).m7974n(r7, r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33649a;
        C2851c c2851c = this.f33650b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83Var = ((C1371d) c2851c.f33703c).f18580q;
            this.f33649a = 1;
            obj = AbstractC3224d.m15541t(c83Var, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) linkedHashMapM15372Y.get(c2851c.f33702b.mo4589b2());
        if (vocabularySearchQuery != null) {
            Pair pair = this.f33651c;
            vocabularySearchQuery.f19859a = ((Number) pair.f47623a).intValue();
            vocabularySearchQuery.f19860b = ((Number) pair.f47624b).intValue();
        }
        vma vmaVar = c2851c.f33703c;
        this.f33649a = 2;
    }
}
