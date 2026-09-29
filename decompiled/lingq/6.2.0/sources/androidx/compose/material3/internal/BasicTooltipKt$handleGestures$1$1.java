package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.material3.C0252k0;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerEventTimeoutCancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c32;
import p000.kg7;
import p000.og7;
import p000.u66;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", m4291f = "BasicTooltip.kt", m4292l = {217}, m4293m = "invokeSuspend", m4294v = 1)
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3456a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ og7 f3458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0252k0 f3459d;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1 */
    @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", m4291f = "BasicTooltip.kt", m4292l = {224, 230, 252}, m4293m = "invokeSuspend", m4294v = 1)
    final class C02371 extends RestrictedSuspendLambda implements zi3 {

        /* JADX INFO: renamed from: b */
        public u66 f3460b;

        /* JADX INFO: renamed from: c */
        public PointerEventPass f3461c;

        /* JADX INFO: renamed from: d */
        public long f3462d;

        /* JADX INFO: renamed from: e */
        public int f3463e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f3464f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ un1 f3465g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C0252k0 f3466h;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name */
        @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", m4291f = "BasicTooltip.kt", m4292l = {231}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass1 extends RestrictedSuspendLambda implements zi3 {

            /* JADX INFO: renamed from: b */
            public int f3467b;

            /* JADX INFO: renamed from: c */
            public /* synthetic */ Object f3468c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ PointerEventPass f3469d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerEventPass pointerEventPass, Continuation continuation) {
                super(2, continuation);
                this.f3469d = pointerEventPass;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3469d, continuation);
                anonymousClass1.f3468c = obj;
                return anonymousClass1;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f3467b;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3193b.m15359b(obj);
                        return obj;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                C0332f c0332f = (C0332f) this.f3468c;
                this.f3467b = 1;
                Object objM947j = AbstractC0117w.m947j(c0332f, this.f3469d, this);
                return objM947j == coroutineSingletons ? coroutineSingletons : objM947j;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
        @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", m4291f = "BasicTooltip.kt", m4292l = {238, 241, 241}, m4293m = "invokeSuspend", m4294v = 1)
        final class AnonymousClass3 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public Throwable f3470a;

            /* JADX INFO: renamed from: b */
            public int f3471b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ u66 f3472c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ C0252k0 f3473d;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name */
            @c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", m4291f = "BasicTooltip.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
            final class AnonymousClass1 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ boolean f3474a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0252k0 f3475b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C0252k0 c0252k0, Continuation continuation) {
                    super(2, continuation);
                    this.f3475b = c0252k0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3475b, continuation);
                    anonymousClass1.f3474a = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
                    xfa xfaVar = xfa.f68157a;
                    anonymousClass1.invokeSuspend(xfaVar);
                    return xfaVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    AbstractC3193b.m15359b(obj);
                    if (!this.f3474a) {
                        this.f3475b.m1177a();
                    }
                    return xfa.f68157a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(u66 u66Var, C0252k0 c0252k0, Continuation continuation) {
                super(2, continuation);
                this.f3472c = u66Var;
                this.f3473d = c0252k0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f3472c, this.f3473d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
            
                if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r6, r9, r8) == r0) goto L30;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f3471b;
                u66 u66Var = this.f3472c;
                C0252k0 c0252k0 = this.f3473d;
                try {
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        Boolean bool = Boolean.TRUE;
                        C3244l c3244l = (C3244l) u66Var;
                        c3244l.getClass();
                        c3244l.m15572j(null, bool);
                        MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                        this.f3471b = 1;
                        if (c0252k0.m1179c(mutatePriority, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        AbstractC3193b.m15359b(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = this.f3470a;
                            AbstractC3193b.m15359b(obj);
                            throw th;
                        }
                        AbstractC3193b.m15359b(obj);
                    }
                    return xfa.f68157a;
                    if (c0252k0.m1178b()) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(c0252k0, null);
                        this.f3471b = 2;
                    }
                    return xfa.f68157a;
                } catch (Throwable th2) {
                    if (!c0252k0.m1178b()) {
                        throw th2;
                    }
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1(c0252k0, null);
                    this.f3470a = th2;
                    this.f3471b = 3;
                    if (AbstractC3224d.m15529h(u66Var, anonymousClass2, this) != coroutineSingletons) {
                        th = th2;
                    }
                    return coroutineSingletons;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02371(un1 un1Var, C0252k0 c0252k0, Continuation continuation) {
            super(2, continuation);
            this.f3465g = un1Var;
            this.f3466h = c0252k0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C02371 c02371 = new C02371(this.f3465g, this.f3466h, continuation);
            c02371.f3464f = obj;
            return c02371;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C02371) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c6 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c2, B:43:0x00c6), top: B:55:0x0014 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v16, types: [u66] */
        /* JADX WARN: Type inference failed for: r13v17 */
        /* JADX WARN: Type inference failed for: r13v2 */
        /* JADX WARN: Type inference failed for: r13v7 */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r13;
            long j;
            C0332f c0332f;
            PointerEventPass pointerEventPass;
            u66 u66Var;
            u66 u66Var2;
            Object obj2;
            ?? r1;
            kg7 kg7Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ?? r2 = this.f3463e;
            try {
                if (r2 == 0) {
                    AbstractC3193b.m15359b(obj);
                    C0332f c0332f2 = (C0332f) this.f3464f;
                    C3244l c3244lM17114d = AbstractC3352my.m17114d(Boolean.FALSE);
                    long jMo13456b = c0332f2.m1475f().mo13456b();
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.f3464f = c0332f2;
                    this.f3460b = c3244lM17114d;
                    this.f3461c = pointerEventPass2;
                    this.f3462d = jMo13456b;
                    this.f3463e = 1;
                    Object objM939b = AbstractC0117w.m939b(c0332f2, false, pointerEventPass2, this, 1);
                    if (objM939b != coroutineSingletons) {
                        j = jMo13456b;
                        c0332f = c0332f2;
                        obj = objM939b;
                        u66Var = c3244lM17114d;
                        pointerEventPass = pointerEventPass2;
                    }
                    return coroutineSingletons;
                }
                if (r2 != 1) {
                    if (r2 != 2) {
                        if (r2 != 3) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r13 = (u66) this.f3464f;
                        try {
                            AbstractC3193b.m15359b(obj);
                            r1 = r2;
                            r13 = r13;
                            kg7Var = (kg7) obj;
                            if (kg7Var != null) {
                                kg7Var.m15189a();
                            }
                            Boolean bool = Boolean.FALSE;
                            C3244l c3244l = (C3244l) r13;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool);
                            r2 = r1;
                            return xfa.f68157a;
                        } catch (Throwable th) {
                            th = th;
                            Boolean bool2 = Boolean.FALSE;
                            C3244l c3244l2 = (C3244l) r13;
                            c3244l2.getClass();
                            c3244l2.m15572j(null, bool2);
                            throw th;
                        }
                    }
                    PointerEventPass pointerEventPass3 = this.f3461c;
                    u66 u66Var3 = this.f3460b;
                    c0332f = (C0332f) this.f3464f;
                    try {
                        AbstractC3193b.m15359b(obj);
                        obj2 = pointerEventPass3;
                        u66Var2 = u66Var3;
                        Boolean bool3 = Boolean.FALSE;
                        C3244l c3244l3 = (C3244l) u66Var2;
                        c3244l3.getClass();
                        c3244l3.m15572j(null, bool3);
                        r2 = obj2;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        pointerEventPass = pointerEventPass3;
                        u66Var = u66Var3;
                        wfb.m23926u(this.f3465g, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(u66Var, this.f3466h, null), 1);
                        this.f3464f = u66Var;
                        this.f3460b = null;
                        this.f3461c = null;
                        this.f3463e = 3;
                        obj = AbstractC0117w.m947j(c0332f, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                            r13 = u66Var;
                            r1 = u66Var;
                            kg7Var = (kg7) obj;
                            if (kg7Var != null) {
                                kg7Var.m15189a();
                            }
                            Boolean bool4 = Boolean.FALSE;
                            C3244l c3244l4 = (C3244l) r13;
                            c3244l4.getClass();
                            c3244l4.m15572j(null, bool4);
                            r2 = r1;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = u66Var3;
                        Boolean bool5 = Boolean.FALSE;
                        C3244l c3244l5 = (C3244l) r13;
                        c3244l5.getClass();
                        c3244l5.m15572j(null, bool5);
                        throw th;
                    }
                    return xfa.f68157a;
                }
                long j2 = this.f3462d;
                PointerEventPass pointerEventPass4 = this.f3461c;
                u66 u66Var4 = this.f3460b;
                C0332f c0332f3 = (C0332f) this.f3464f;
                AbstractC3193b.m15359b(obj);
                pointerEventPass = pointerEventPass4;
                u66Var = u66Var4;
                j = j2;
                c0332f = c0332f3;
                long j3 = j;
                int i = ((kg7) obj).f47243i;
                if (i == 1 || i == 3) {
                    try {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerEventPass, null);
                        this.f3464f = c0332f;
                        this.f3460b = u66Var;
                        this.f3461c = pointerEventPass;
                        this.f3463e = 2;
                        if (c0332f.m1476g(j3, anonymousClass1, this) != coroutineSingletons) {
                            u66Var2 = u66Var;
                            obj2 = u66Var;
                            Boolean bool6 = Boolean.FALSE;
                            C3244l c3244l6 = (C3244l) u66Var2;
                            c3244l6.getClass();
                            c3244l6.m15572j(null, bool6);
                            r2 = obj2;
                        }
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        wfb.m23926u(this.f3465g, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(u66Var, this.f3466h, null), 1);
                        this.f3464f = u66Var;
                        this.f3460b = null;
                        this.f3461c = null;
                        this.f3463e = 3;
                        obj = AbstractC0117w.m947j(c0332f, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                            r13 = u66Var;
                            r1 = u66Var;
                            kg7Var = (kg7) obj;
                            if (kg7Var != null) {
                                kg7Var.m15189a();
                            }
                            Boolean bool7 = Boolean.FALSE;
                            C3244l c3244l7 = (C3244l) r13;
                            c3244l7.getClass();
                            c3244l7.m15572j(null, bool7);
                            r2 = r1;
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            } catch (Throwable th3) {
                th = th3;
                r13 = r2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(og7 og7Var, C0252k0 c0252k0, Continuation continuation) {
        super(2, continuation);
        this.f3458c = og7Var;
        this.f3459d = c0252k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.f3458c, this.f3459d, continuation);
        basicTooltipKt$handleGestures$1$1.f3457b = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3456a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C02371 c02371 = new C02371((un1) this.f3457b, this.f3459d, null);
            this.f3456a = 1;
            if (AbstractC0095c.m836k(this.f3458c, c02371, this) == coroutineSingletons) {
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
