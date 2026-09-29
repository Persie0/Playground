package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.m83;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xo1;
import p000.xza;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {219, 221}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$loadCourseItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33715b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseItems$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseItems$1$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {216}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28531 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f33716a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2860b f33717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28531(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33717b = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28531(this.f33717b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28531) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f33716a;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    C2860b c2860b = this.f33717b;
                    xo1 xo1Var = c2860b.f33773b;
                    String strMo4589b2 = c2860b.f33777f.mo4589b2();
                    this.f33716a = 1;
                    if (((C1290f) xo1Var).m7180d(strMo4589b2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseItems$1$2 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$loadCourseItems$1$2", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28542 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2860b f33718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28542(C2860b c2860b, Continuation continuation) {
            super(2, continuation);
            this.f33718a = c2860b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C28542(this.f33718a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28542 c28542 = (C28542) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28542.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2860b.m9763b(this.f33718a, true);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$loadCourseItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33715b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$loadCourseItems$1(this.f33715b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$loadCourseItems$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r2.collect(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33714a;
        int i2 = 2;
        C2860b c2860b = this.f33715b;
        if (i != 0) {
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
        }
        AbstractC3193b.m15359b(obj);
        wfb.m23926u(c2860b.f33779h, c2860b.f33778g, null, new C28531(c2860b, null), 2);
        xo1 xo1Var = c2860b.f33773b;
        String strMo4589b2 = c2860b.f33777f.mo4589b2();
        this.f33714a = 1;
        obj = ((C1290f) xo1Var).m7184h(strMo4589b2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        m83 m83Var = new m83((c83) obj, new C28542(c2860b, null));
        xza xzaVar = new xza(c2860b, i2);
        this.f33714a = 2;
    }
}
