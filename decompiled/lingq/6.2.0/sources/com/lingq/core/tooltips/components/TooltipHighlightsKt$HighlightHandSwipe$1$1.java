package com.lingq.core.tooltips.components;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.ss5;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1", m4291f = "TooltipHighlights.kt", m4292l = {195, 198, 199, 200, 201, 207, 213, 219}, m4293m = "invokeSuspend", m4294v = 2)
final class TooltipHighlightsKt$HighlightHandSwipe$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0059a f23917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0059a f23918c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f23919d;

    /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1 */
    @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1", m4291f = "TooltipHighlights.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f23920a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0059a f23921b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0059a f23922c;

        /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1$1", m4291f = "TooltipHighlights.kt", m4292l = {208}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f23923a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0059a f23924b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0059a c0059a, Continuation continuation) {
                super(2, continuation);
                this.f23924b = c0059a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f23924b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f23923a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Float f = new Float(0.8f);
                    fda fdaVarM21703b0 = ss5.m21703b0(600, 0, io2.f44349a, 2);
                    this.f23923a = 1;
                    if (C0059a.m744c(this.f23924b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$1$2", m4291f = "TooltipHighlights.kt", m4292l = {209}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f23925a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0059a f23926b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0059a c0059a, Continuation continuation) {
                super(2, continuation);
                this.f23926b = c0059a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f23926b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f23925a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Float f = new Float(0.8f);
                    fda fdaVarM21703b0 = ss5.m21703b0(600, 0, io2.f44349a, 2);
                    this.f23925a = 1;
                    if (C0059a.m744c(this.f23926b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
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
        public C19121(C0059a c0059a, C0059a c0059a2, Continuation continuation) {
            super(2, continuation);
            this.f23921b = c0059a;
            this.f23922c = c0059a2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19121 c19121 = new C19121(this.f23921b, this.f23922c, continuation);
            c19121.f23920a = obj;
            return c19121;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19121) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f23920a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(un1Var, null, null, new AnonymousClass1(this.f23921b, null), 3);
            return wfb.m23926u(un1Var, null, null, new AnonymousClass2(this.f23922c, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2 */
    @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2", m4291f = "TooltipHighlights.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19132 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f23927a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0059a f23928b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0059a f23929c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0059a f23930d;

        /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$1", m4291f = "TooltipHighlights.kt", m4292l = {220}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f23931a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0059a f23932b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0059a c0059a, Continuation continuation) {
                super(2, continuation);
                this.f23932b = c0059a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f23932b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f23931a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Float f = new Float(1.1f);
                    fda fdaVarM21703b0 = ss5.m21703b0(600, 0, io2.f44352d, 2);
                    this.f23931a = 1;
                    if (C0059a.m744c(this.f23932b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$2", m4291f = "TooltipHighlights.kt", m4292l = {221}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f23933a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0059a f23934b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0059a c0059a, Continuation continuation) {
                super(2, continuation);
                this.f23934b = c0059a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f23934b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f23933a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Float f = new Float(-50.0f);
                    fda fdaVarM21703b0 = ss5.m21703b0(600, 0, io2.f44352d, 2);
                    this.f23933a = 1;
                    if (C0059a.m744c(this.f23934b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$3, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1$2$3", m4291f = "TooltipHighlights.kt", m4292l = {222}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass3 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f23935a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0059a f23936b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C0059a c0059a, Continuation continuation) {
                super(2, continuation);
                this.f23936b = c0059a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f23936b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f23935a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    Float f = new Float(0.0f);
                    fda fdaVarM21703b0 = ss5.m21703b0(600, 0, io2.f44352d, 2);
                    this.f23935a = 1;
                    if (C0059a.m744c(this.f23936b, f, fdaVarM21703b0, null, this, 12) == coroutineSingletons) {
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
        public C19132(C0059a c0059a, C0059a c0059a2, C0059a c0059a3, Continuation continuation) {
            super(2, continuation);
            this.f23928b = c0059a;
            this.f23929c = c0059a2;
            this.f23930d = c0059a3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19132 c19132 = new C19132(this.f23928b, this.f23929c, this.f23930d, continuation);
            c19132.f23927a = obj;
            return c19132;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C19132) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f23927a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(un1Var, null, null, new AnonymousClass1(this.f23928b, null), 3);
            wfb.m23926u(un1Var, null, null, new AnonymousClass2(this.f23929c, null), 3);
            return wfb.m23926u(un1Var, null, null, new AnonymousClass3(this.f23930d, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipHighlightsKt$HighlightHandSwipe$1$1(C0059a c0059a, C0059a c0059a2, C0059a c0059a3, Continuation continuation) {
        super(2, continuation);
        this.f23917b = c0059a;
        this.f23918c = c0059a2;
        this.f23919d = c0059a3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TooltipHighlightsKt$HighlightHandSwipe$1$1(this.f23917b, this.f23918c, this.f23919d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TooltipHighlightsKt$HighlightHandSwipe$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c1 -> B:34:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.tooltips.components.TooltipHighlightsKt$HighlightHandSwipe$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
