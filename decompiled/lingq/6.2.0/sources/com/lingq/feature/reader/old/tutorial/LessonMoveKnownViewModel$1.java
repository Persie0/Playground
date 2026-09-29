package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29609b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$1$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24501 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29610a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2458c f29611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24501(C2458c c2458c, Continuation continuation) {
            super(2, continuation);
            this.f29611b = c2458c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24501 c24501 = new C24501(this.f29611b, continuation);
            c24501.f29610a = obj;
            return c24501;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24501 c24501 = (C24501) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24501.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29610a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((LessonWord) obj2).f19319f.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((LessonWord) it.next()).f19314a;
                C2458c c2458c = this.f29611b;
                wfb.m23926u(lda.m16103C(c2458c), null, null, new LessonMoveKnownViewModel$fetchTokenTranslation$1(c2458c, str, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$1(C2458c c2458c, Continuation continuation) {
        super(2, continuation);
        this.f29609b = c2458c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$1(this.f29609b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29608a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2458c c2458c = this.f29609b;
            C3540rl c3540rl = new C3540rl(c2458c.f29669l, 5);
            C24501 c24501 = new C24501(c2458c, null);
            this.f29608a = 1;
            if (AbstractC3224d.m15529h(c3540rl, c24501, this) == coroutineSingletons) {
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
