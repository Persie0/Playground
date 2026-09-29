package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1310z;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {105}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$setupWords$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29632b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f29633c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$1$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24541 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29634a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2458c f29635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24541(C2458c c2458c, Continuation continuation) {
            super(2, continuation);
            this.f29635b = c2458c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24541 c24541 = new C24541(this.f29635b, continuation);
            c24541.f29634a = obj;
            return c24541;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24541 c24541 = (C24541) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24541.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29634a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f29635b.f29669l.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$setupWords$1(C2458c c2458c, List list, Continuation continuation) {
        super(2, continuation);
        this.f29632b = c2458c;
        this.f29633c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$setupWords$1(this.f29632b, this.f29633c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$setupWords$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29631a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2458c c2458c = this.f29632b;
            c83 c83VarM7426e = ((C1310z) c2458c.f29663f).m7426e(c2458c.f29660c.mo4589b2(), this.f29633c);
            C24541 c24541 = new C24541(c2458c, null);
            this.f29631a = 1;
            if (AbstractC3224d.m15529h(c83VarM7426e, c24541, this) == coroutineSingletons) {
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
