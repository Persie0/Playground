package com.lingq.core.common;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3236f;
import p000.C3386nv;
import p000.C3475pw;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.ph2;
import p000.t62;
import p000.un1;
import p000.v72;
import p000.vi3;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetch$1", m4291f = "FlowExtensions.kt", m4292l = {ModuleDescriptor.MODULE_VERSION}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14348a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83 f14350c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c83 f14351d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f14352e;

    /* JADX INFO: renamed from: com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1 */
    @c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1", m4291f = "FlowExtensions.kt", m4292l = {195}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12581 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f14353a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f14354b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ c83 f14355c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ c83 f14356d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vi3 f14357e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ e83 f14358f;

        /* JADX INFO: renamed from: com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {188}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f14359a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c83 f14360b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ vi3 f14361c;

            /* JADX INFO: renamed from: com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1$1, reason: invalid class name and collision with other inner class name */
            @c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
            final class C38521 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f14362a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vi3 f14363b;

                /* JADX INFO: renamed from: com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.core.common.FlowExtensionsKt$withDataFetch$1$1$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {190}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38531 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public int f14364a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ vi3 f14365b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38531(vi3 vi3Var, Continuation continuation) {
                        super(2, continuation);
                        this.f14365b = vi3Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38531(this.f14365b, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C38531) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.f14364a;
                        if (i == 0) {
                            AbstractC3193b.m15359b(obj);
                            this.f14364a = 1;
                            if (((FlowExtensionsKt$dataFlow$2) this.f14365b).invoke(this) == coroutineSingletons) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C38521(vi3 vi3Var, Continuation continuation) {
                    super(2, continuation);
                    this.f14363b = vi3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C38521(this.f14363b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((C38521) create((xfa) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f14362a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        v72 v72Var = ph2.f56212a;
                        t62 t62Var = t62.f61909c;
                        C38531 c38531 = new C38531(this.f14363b, null);
                        this.f14362a = 1;
                        if (wfb.m23905G(c38531, t62Var, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(c83 c83Var, vi3 vi3Var, Continuation continuation) {
                super(2, continuation);
                this.f14360b = c83Var;
                this.f14361c = vi3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f14360b, this.f14361c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f14359a;
                xfa xfaVar = xfa.f68157a;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3193b.m15359b(obj);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                C3236f c3236fM15547z = AbstractC3224d.m15547z(new i83(xfaVar, 1), this.f14360b);
                C38521 c38521 = new C38521(this.f14361c, null);
                this.f14359a = 1;
                return AbstractC3224d.m15529h(c3236fM15547z, c38521, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12581(c83 c83Var, c83 c83Var2, vi3 vi3Var, e83 e83Var, Continuation continuation) {
            super(2, continuation);
            this.f14355c = c83Var;
            this.f14356d = c83Var2;
            this.f14357e = vi3Var;
            this.f14358f = e83Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C12581 c12581 = new C12581(this.f14355c, this.f14356d, this.f14357e, this.f14358f, continuation);
            c12581.f14354b = obj;
            return c12581;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C12581) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f14354b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f14353a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                wfb.m23926u(un1Var, null, null, new AnonymousClass1(this.f14356d, this.f14357e, null), 3);
                C3475pw c3475pw = new C3475pw(this.f14358f, 15);
                this.f14354b = null;
                this.f14353a = 1;
                if (this.f14355c.collect(c3475pw, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$withDataFetch$1(c83 c83Var, c83 c83Var2, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f14350c = c83Var;
        this.f14351d = c83Var2;
        this.f14352e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$withDataFetch$1 flowExtensionsKt$withDataFetch$1 = new FlowExtensionsKt$withDataFetch$1(this.f14350c, this.f14351d, this.f14352e, continuation);
        flowExtensionsKt$withDataFetch$1.f14349b = obj;
        return flowExtensionsKt$withDataFetch$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$withDataFetch$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f14349b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14348a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C12581 c12581 = new C12581(this.f14350c, this.f14351d, this.f14352e, e83Var, null);
            this.f14349b = null;
            this.f14348a = 1;
            if (vz1.m23649s(c12581, this) == coroutineSingletons) {
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
