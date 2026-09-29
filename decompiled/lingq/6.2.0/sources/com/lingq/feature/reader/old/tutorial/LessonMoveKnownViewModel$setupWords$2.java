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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$2", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {111}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$setupWords$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29637b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$setupWords$2$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24551 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2458c f29639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24551(C2458c c2458c, Continuation continuation) {
            super(2, continuation);
            this.f29639b = c2458c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24551 c24551 = new C24551(this.f29639b, continuation);
            c24551.f29638a = obj;
            return c24551;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24551 c24551 = (C24551) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24551.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29638a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f29639b.f29669l.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$setupWords$2(C2458c c2458c, Continuation continuation) {
        super(2, continuation);
        this.f29637b = c2458c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$setupWords$2(this.f29637b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$setupWords$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29636a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2458c c2458c = this.f29637b;
            c83 c83VarM7426e = ((C1310z) c2458c.f29663f).m7426e(c2458c.f29660c.mo4589b2(), c2458c.f29667j);
            C24551 c24551 = new C24551(c2458c, null);
            this.f29636a = 1;
            if (AbstractC3224d.m15529h(c83VarM7426e, c24551, this) == coroutineSingletons) {
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
