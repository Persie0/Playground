package androidx.compose.animation.core;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.bg9;
import p000.c32;
import p000.cu0;
import p000.ej0;
import p000.fa4;
import p000.t66;
import p000.un1;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", m4291f = "AnimateAsState.kt", m4292l = {430}, m4293m = "invokeSuspend", m4294v = 1)
final class AnimateAsStateKt$animateValueAsState$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ej0 f1502a;

    /* JADX INFO: renamed from: b */
    public int f1503b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1504c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cu0 f1505d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0059a f1506e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f1507f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f1508g;

    /* JADX INFO: renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 */
    @c32(m4290c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", m4291f = "AnimateAsState.kt", m4292l = {439}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00571 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f1509a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f1510b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0059a f1511c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ t66 f1512d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ t66 f1513e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00571(Object obj, C0059a c0059a, t66 t66Var, t66 t66Var2, Continuation continuation) {
            super(2, continuation);
            this.f1510b = obj;
            this.f1511c = c0059a;
            this.f1512d = t66Var;
            this.f1513e = t66Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C00571(this.f1510b, this.f1511c, this.f1512d, this.f1513e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00571) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C00571 c00571;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1509a;
            C0059a c0059a = this.f1511c;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (!fa4.m11650l(this.f1510b, ((xc9) c0059a.f1542e).getValue())) {
                    bg9 bg9Var = AbstractC0060b.f1549a;
                    InterfaceC0025an interfaceC0025an = (InterfaceC0025an) this.f1512d.getValue();
                    this.f1509a = 1;
                    c00571 = this;
                    if (C0059a.m744c(this.f1511c, this.f1510b, interfaceC0025an, null, c00571, 12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            c00571 = this;
            bg9 bg9Var2 = AbstractC0060b.f1549a;
            vi3 vi3Var = (vi3) c00571.f1513e.getValue();
            if (vi3Var != null) {
                vi3Var.invoke(c0059a.m745d());
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$3$1(cu0 cu0Var, C0059a c0059a, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f1505d = cu0Var;
        this.f1506e = c0059a;
        this.f1507f = t66Var;
        this.f1508g = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.f1505d, this.f1506e, this.f1507f, this.f1508g, continuation);
        animateAsStateKt$animateValueAsState$3$1.f1504c = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f1503b
            r2 = 0
            cu0 r3 = r13.f1505d
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 != r4) goto L16
            ej0 r1 = r13.f1502a
            java.lang.Object r5 = r13.f1504c
            un1 r5 = (p000.un1) r5
            kotlin.AbstractC3193b.m15359b(r14)
            goto L35
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r13)
            return r2
        L1c:
            kotlin.AbstractC3193b.m15359b(r14)
            java.lang.Object r14 = r13.f1504c
            un1 r14 = (p000.un1) r14
            ej0 r1 = r3.iterator()
            r5 = r14
        L28:
            r13.f1504c = r5
            r13.f1502a = r1
            r13.f1503b = r4
            java.lang.Object r14 = r1.m11164b(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L5f
            java.lang.Object r14 = r1.m11165c()
            java.lang.Object r6 = r3.mo9890g()
            java.lang.Object r6 = p000.ju0.m14648a(r6)
            if (r6 != 0) goto L4d
            r8 = r14
            goto L4e
        L4d:
            r8 = r6
        L4e:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1 r7 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1
            t66 r11 = r13.f1508g
            r12 = 0
            androidx.compose.animation.core.a r9 = r13.f1506e
            t66 r10 = r13.f1507f
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = 3
            p000.wfb.m23926u(r5, r2, r2, r7, r14)
            goto L28
        L5f:
            xfa r13 = p000.xfa.f68157a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
