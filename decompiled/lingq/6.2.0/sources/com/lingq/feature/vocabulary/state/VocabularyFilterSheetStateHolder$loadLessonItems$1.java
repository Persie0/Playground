package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.m83;
import p000.nn1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xza;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadLessonItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {241, 243}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadLessonItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadLessonItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33724b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadLessonItems$1(this.f33724b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadLessonItems$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33723a;
        int i2 = 1;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2860b c2860b = this.f33724b;
        VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
        nn1 nn1Var = c2860b.f33778g;
        un1 un1Var = c2860b.f33779h;
        Integer num = (vocabularySearchQuery == null || (pair = vocabularySearchQuery.f19867i) == null) ? null : (Integer) pair.f47624b;
        if (num == null || num.intValue() == 0) {
            this.f33723a = 2;
            wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadAllLessons$2(c2860b, null), 2);
            Object objCollect = new m83(((C1295k) c2860b.f33774c).m7257O(c2860b.f33777f.mo4589b2()), new VocabularyFilterSheetStateHolder$loadAllLessons$3(c2860b, null)).collect(new xza(c2860b, i2), this);
            if (objCollect != coroutineSingletons) {
                objCollect = xfaVar;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        int iIntValue = num.intValue();
        this.f33723a = 1;
        wfb.m23926u(un1Var, nn1Var, null, new VocabularyFilterSheetStateHolder$loadCourseLessons$2(c2860b, iIntValue, null), 2);
        Object objCollect2 = new m83(((C1290f) c2860b.f33773b).m7182f(iIntValue), new VocabularyFilterSheetStateHolder$loadCourseLessons$3(c2860b, null)).collect(new xza(c2860b, 3), this);
        if (objCollect2 != coroutineSingletons) {
            objCollect2 = xfaVar;
        }
        if (objCollect2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
