package androidx.compose.animation.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", m4291f = "InfiniteTransition.kt", m4292l = {172, 193}, m4293m = "invokeSuspend", m4294v = 1)
final class InfiniteTransition$run$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f1514a;

    /* JADX INFO: renamed from: b */
    public int f1515b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1516c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f1517d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0061c f1518e;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3 */
    @c32(m4290c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", m4291f = "InfiniteTransition.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00583 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ float f1519a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00583 c00583 = new C00583(2, continuation);
            c00583.f1519a = ((Number) obj).floatValue();
            return c00583;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00583) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return Boolean.valueOf(this.f1519a > 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(t66 t66Var, C0061c c0061c, Continuation continuation) {
        super(2, continuation);
        this.f1517d = t66Var;
        this.f1518e = c0061c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.f1517d, this.f1518e, continuation);
        infiniteTransition$run$1$1.f1516c = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d A[PHI: r9 r10
      0x003d: PHI (r9v2 kotlin.jvm.internal.Ref$FloatRef) = 
      (r9v0 kotlin.jvm.internal.Ref$FloatRef)
      (r9v1 kotlin.jvm.internal.Ref$FloatRef)
      (r9v1 kotlin.jvm.internal.Ref$FloatRef)
      (r9v4 kotlin.jvm.internal.Ref$FloatRef)
     binds: [B:10:0x002b, B:15:0x0059, B:17:0x0075, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r10v2 un1) = (r10v0 un1), (r10v1 un1), (r10v1 un1), (r10v4 un1) binds: [B:10:0x002b, B:15:0x0059, B:17:0x0075, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0054 A[PHI: r9 r10
      0x0054: PHI (r9v1 kotlin.jvm.internal.Ref$FloatRef) = (r9v2 kotlin.jvm.internal.Ref$FloatRef), (r9v3 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0051, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r10v1 un1) = (r10v2 un1), (r10v3 un1) binds: [B:12:0x0051, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.f1515b
            r2 = 0
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1f
            if (r1 != r4) goto L19
            kotlin.jvm.internal.Ref$FloatRef r1 = r12.f1514a
            java.lang.Object r5 = r12.f1516c
            un1 r5 = (p000.un1) r5
            kotlin.AbstractC3193b.m15359b(r13)
            r9 = r1
            r10 = r5
            goto L3d
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r12)
            return r2
        L1f:
            kotlin.jvm.internal.Ref$FloatRef r1 = r12.f1514a
            java.lang.Object r5 = r12.f1516c
            un1 r5 = (p000.un1) r5
            kotlin.AbstractC3193b.m15359b(r13)
            r9 = r1
            r10 = r5
            goto L54
        L2b:
            kotlin.AbstractC3193b.m15359b(r13)
            java.lang.Object r13 = r12.f1516c
            un1 r13 = (p000.un1) r13
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.f47715a = r5
            r10 = r13
            r9 = r1
        L3d:
            tl r6 = new tl
            r11 = 3
            t66 r7 = r12.f1517d
            androidx.compose.animation.core.c r8 = r12.f1518e
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f1516c = r10
            r12.f1514a = r9
            r12.f1515b = r3
            java.lang.Object r13 = p000.fa4.m11637K(r6, r12)
            if (r13 != r0) goto L54
            goto L77
        L54:
            float r13 = r9.f47715a
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 != 0) goto L3d
            xf r13 = new xf
            r1 = 16
            r13.<init>(r10, r1)
            kk8 r13 = androidx.compose.runtime.AbstractC0278f.m1264n(r13)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r1.<init>(r4, r2)
            r12.f1516c = r10
            r12.f1514a = r9
            r12.f1515b = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.AbstractC3224d.m15540s(r13, r1, r12)
            if (r13 != r0) goto L3d
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
