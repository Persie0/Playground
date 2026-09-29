package com.lingq.core.domain.util;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3236f;
import p000.C3386nv;
import p000.C3502ql;
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

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1", m4291f = "FlowExtensions.kt", m4292l = {134}, m4293m = "invokeSuspend", m4294v = 2)
final class FlowExtensionsKt$withDataFetch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20113b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c83 f20114c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ c83 f20115d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f20116e;

    /* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1 */
    @c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1", m4291f = "FlowExtensions.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
    final class C15401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f20117a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f20118b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ c83 f20119c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ c83 f20120d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vi3 f20121e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ e83 f20122f;

        /* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {137}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f20123a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ c83 f20124b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ vi3 f20125c;

            /* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1$1, reason: invalid class name and collision with other inner class name */
            @c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {138}, m4293m = "invokeSuspend", m4294v = 2)
            final class C38541 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public int f20126a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vi3 f20127b;

                /* JADX INFO: renamed from: com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                @c32(m4290c = "com.lingq.core.domain.util.FlowExtensionsKt$withDataFetch$1$1$1$1$1", m4291f = "FlowExtensions.kt", m4292l = {139}, m4293m = "invokeSuspend", m4294v = 2)
                final class C38551 extends SuspendLambda implements zi3 {

                    /* JADX INFO: renamed from: a */
                    public int f20128a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ vi3 f20129b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C38551(vi3 vi3Var, Continuation continuation) {
                        super(2, continuation);
                        this.f20129b = vi3Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C38551(this.f20129b, continuation);
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C38551) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.f20128a;
                        if (i == 0) {
                            AbstractC3193b.m15359b(obj);
                            this.f20128a = 1;
                            if (((FlowExtensionsKt$dataFlow$2) this.f20129b).invoke(this) == coroutineSingletons) {
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
                public C38541(vi3 vi3Var, Continuation continuation) {
                    super(2, continuation);
                    this.f20127b = vi3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C38541(this.f20127b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    return ((C38541) create((xfa) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.f20126a;
                    if (i == 0) {
                        AbstractC3193b.m15359b(obj);
                        v72 v72Var = ph2.f56212a;
                        t62 t62Var = t62.f61909c;
                        C38551 c38551 = new C38551(this.f20127b, null);
                        this.f20126a = 1;
                        if (wfb.m23905G(c38551, t62Var, this) == coroutineSingletons) {
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
                this.f20124b = c83Var;
                this.f20125c = vi3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f20124b, this.f20125c, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f20123a;
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
                C3236f c3236fM15547z = AbstractC3224d.m15547z(new i83(xfaVar, 1), this.f20124b);
                C38541 c38541 = new C38541(this.f20125c, null);
                this.f20123a = 1;
                return AbstractC3224d.m15529h(c3236fM15547z, c38541, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15401(c83 c83Var, c83 c83Var2, vi3 vi3Var, e83 e83Var, Continuation continuation) {
            super(2, continuation);
            this.f20119c = c83Var;
            this.f20120d = c83Var2;
            this.f20121e = vi3Var;
            this.f20122f = e83Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C15401 c15401 = new C15401(this.f20119c, this.f20120d, this.f20121e, this.f20122f, continuation);
            c15401.f20118b = obj;
            return c15401;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C15401) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f20118b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f20117a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                wfb.m23926u(un1Var, null, null, new AnonymousClass1(this.f20120d, this.f20121e, null), 3);
                C3502ql c3502ql = new C3502ql(this.f20122f, 4);
                this.f20118b = null;
                this.f20117a = 1;
                if (this.f20119c.collect(c3502ql, this) == coroutineSingletons) {
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
        this.f20114c = c83Var;
        this.f20115d = c83Var2;
        this.f20116e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtensionsKt$withDataFetch$1 flowExtensionsKt$withDataFetch$1 = new FlowExtensionsKt$withDataFetch$1(this.f20114c, this.f20115d, this.f20116e, continuation);
        flowExtensionsKt$withDataFetch$1.f20113b = obj;
        return flowExtensionsKt$withDataFetch$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$withDataFetch$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f20113b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20112a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C15401 c15401 = new C15401(this.f20114c, this.f20115d, this.f20116e, e83Var, null);
            this.f20113b = null;
            this.f20112a = 1;
            if (vz1.m23649s(c15401, this) == coroutineSingletons) {
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
