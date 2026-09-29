package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.ux5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$8", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28891b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$8$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$8$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23921 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2412n f28892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23921(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28892a = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23921(this.f28892a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C23921 c23921 = (C23921) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23921.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28892a;
            Lesson lesson = (Lesson) c2412n.f29381l0.getValue();
            if (lesson != null) {
                String str = lesson.f19147f;
                if (str == null || str.length() <= 0) {
                    str = "";
                }
                int i = lesson.f19142a;
                AbstractC1263a.m7047b(lda.m16103C(c2412n), c2412n.f29301O, ux5.m22988k(i, "observe download "), new ReaderViewModel$observeLessonDownload$1(c2412n, i, null));
                wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$setupPlayerForLesson$1(c2412n, lesson, str, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$8(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28891b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$8(this.f28891b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28890a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28891b;
            C3244l c3244l = c2412n.f29417w1;
            C23921 c23921 = new C23921(c2412n, null);
            c3244l.getClass();
            this.f28890a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23921, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
