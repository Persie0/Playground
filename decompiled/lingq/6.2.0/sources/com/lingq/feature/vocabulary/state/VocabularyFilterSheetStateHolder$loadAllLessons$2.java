package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.library.LibrarySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadAllLessons$2", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {250}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadAllLessons$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33712b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadAllLessons$2(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33712b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadAllLessons$2(this.f33712b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadAllLessons$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33711a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2860b c2860b = this.f33712b;
                y95 y95Var = c2860b.f33776e;
                String strMo4589b2 = c2860b.f33777f.mo4589b2();
                LibrarySearchQuery librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, 8191);
                this.f33711a = 1;
                if (y95.m24995a(y95Var, strMo4589b2, "my_lessons_type=lessons_level=nullsearch", null, false, null, "my_lessons", null, librarySearchQuery, 0, this, 340) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
