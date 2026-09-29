package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1310z;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$2", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonDealWithWordsViewModel$setupWords$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2457b f29546b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonDealWithWordsViewModel$setupWords$2$1", m4291f = "LessonDealWithWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29547a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2457b f29548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24371(C2457b c2457b, Continuation continuation) {
            super(2, continuation);
            this.f29548b = c2457b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24371 c24371 = new C24371(this.f29548b, continuation);
            c24371.f29547a = obj;
            return c24371;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24371 c24371 = (C24371) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29547a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f29548b.f29655k.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$setupWords$2(C2457b c2457b, Continuation continuation) {
        super(2, continuation);
        this.f29546b = c2457b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonDealWithWordsViewModel$setupWords$2(this.f29546b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonDealWithWordsViewModel$setupWords$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29545a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2457b c2457b = this.f29546b;
            c83 c83VarM7426e = ((C1310z) c2457b.f29650f).m7426e(c2457b.f29647c.mo4589b2(), AbstractC3550rv.m20852t0(c2457b.f29653i));
            C24371 c24371 = new C24371(c2457b, null);
            this.f29545a = 1;
            if (AbstractC3224d.m15529h(c83VarM7426e, c24371, this) == coroutineSingletons) {
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
