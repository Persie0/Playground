package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.r01;
import p000.ul6;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.JobSupport$children$1", m4291f = "JobSupport.kt", m4292l = {1003, 1005}, m4293m = "invokeSuspend", m4294v = 1)
final class JobSupport$children$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public ul6 f47752b;

    /* JADX INFO: renamed from: c */
    public r01 f47753c;

    /* JADX INFO: renamed from: d */
    public int f47754d;

    /* JADX INFO: renamed from: e */
    public int f47755e;

    /* JADX INFO: renamed from: f */
    public int f47756f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f47757g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3213d f47758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(Continuation continuation, C3213d c3213d) {
        super(2, continuation);
        this.f47758h = c3213d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(continuation, this.f47758h);
        jobSupport$children$1.f47757g = obj;
        return jobSupport$children$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((JobSupport$children$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0064 -> B:27:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f47757g
            vx8 r0 = (p000.vx8) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.f47756f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L27
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            int r2 = r8.f47755e
            int r4 = r8.f47754d
            r01 r5 = r8.f47753c
            ul6 r6 = r8.f47752b
            kotlin.AbstractC3193b.m15359b(r9)
            goto L7e
        L1d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r8)
            return r5
        L23:
            kotlin.AbstractC3193b.m15359b(r9)
            goto L83
        L27:
            kotlin.AbstractC3193b.m15359b(r9)
            kotlinx.coroutines.d r9 = r8.f47758h
            java.lang.Object r9 = r9.m15500Q()
            boolean r2 = r9 instanceof p000.r01
            if (r2 == 0) goto L43
            r01 r9 = (p000.r01) r9
            kotlinx.coroutines.d r9 = r9.f58435h
            r8.f47757g = r5
            r8.f47756f = r4
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r0.m23582b(r9, r8)
            if (r8 != r1) goto L83
            goto L7d
        L43:
            boolean r2 = r9 instanceof p000.e34
            if (r2 == 0) goto L83
            e34 r9 = (p000.e34) r9
            ul6 r9 = r9.mo3667d()
            if (r9 == 0) goto L83
            java.lang.Object r2 = r9.m15579k()
            r2.getClass()
            kotlinx.coroutines.internal.a r2 = (kotlinx.coroutines.internal.C3245a) r2
            r4 = 0
            r6 = r9
            r5 = r2
            r2 = r4
        L5c:
            boolean r9 = r5.equals(r6)
            if (r9 != 0) goto L83
            boolean r9 = r5 instanceof p000.r01
            if (r9 == 0) goto L7e
            r9 = r5
            r01 r9 = (p000.r01) r9
            kotlinx.coroutines.d r7 = r9.f58435h
            r8.f47757g = r0
            r8.f47752b = r6
            r8.f47753c = r9
            r8.f47754d = r4
            r8.f47755e = r2
            r8.f47756f = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = r0.m23582b(r7, r8)
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlinx.coroutines.internal.a r5 = r5.m15580l()
            goto L5c
        L83:
            xfa r8 = p000.xfa.f68157a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
