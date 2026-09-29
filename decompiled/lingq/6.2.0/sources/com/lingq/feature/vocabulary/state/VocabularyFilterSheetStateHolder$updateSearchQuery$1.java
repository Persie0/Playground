package com.lingq.feature.vocabulary.state;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.vi3;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$updateSearchQuery$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {459, 462}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$updateSearchQuery$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33739a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33740b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f33741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$updateSearchQuery$1(C2860b c2860b, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f33740b = c2860b;
        this.f33741c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$updateSearchQuery$1(this.f33740b, this.f33741c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$updateSearchQuery$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r1).m7974n(r7, r6) == r2) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2860b c2860b = this.f33740b;
        vma vmaVar = c2860b.f33772a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33739a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83Var = ((C1371d) vmaVar).f18580q;
            this.f33739a = 1;
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
        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) linkedHashMapM15372Y.get(c2860b.f33777f.mo4589b2());
        if (vocabularySearchQuery != null) {
            this.f33741c.invoke(vocabularySearchQuery);
            this.f33739a = 2;
        }
        return xfa.f68157a;
    }
}
