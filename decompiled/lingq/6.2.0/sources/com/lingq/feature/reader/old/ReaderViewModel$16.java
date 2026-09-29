package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.ox7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$16", m4291f = "ReaderViewModel.kt", m4292l = {2943}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$16 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28828b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$16$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$16$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23791 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28829a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23791(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28830b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23791 c23791 = new C23791(this.f28830b, continuation);
            c23791.f28829a = obj;
            return c23791;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23791 c23791 = (C23791) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23791.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f28829a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonEngagedDataType lessonEngagedDataType = LessonEngagedDataType.WordCount;
            Iterator it = list.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((ox7) it.next()).f55132e.size();
            }
            this.f28830b.mo49u1(lessonEngagedDataType, new Integer(size));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$16(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28828b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$16(this.f28828b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$16) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28827a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28828b;
            C3244l c3244l = c2412n.f29269D0;
            C23791 c23791 = new C23791(c2412n, null);
            c3244l.getClass();
            this.f28827a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23791, this) == coroutineSingletons) {
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
