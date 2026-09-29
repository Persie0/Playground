package com.lingq.core.player.tts;

import com.lingq.core.common.util.AbstractC1263a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ada;
import p000.aj3;
import p000.bna;
import p000.c32;
import p000.fa4;
import p000.i84;
import p000.jw2;
import p000.l83;
import p000.m83;
import p000.mn7;
import p000.n97;
import p000.nn1;
import p000.pu5;
import p000.un1;
import p000.wfb;
import p000.x31;
import p000.xfa;
import p000.yz0;
import p000.z0a;
import p000.z31;
import p000.z91;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$playClippedSentence$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1819c f22093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mn7 f22094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f22095c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f22096d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f22097e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pu5 f22098f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Double f22099g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f22100h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f22101i;

    /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3 */
    @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3", m4291f = "TtsController.kt", m4292l = {561}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18143 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22102a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f22103b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1819c f22104c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ double f22105d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Double f22106e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f22107f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f22108g;

        /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$1", m4291f = "TtsController.kt", m4292l = {554}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f22109a;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(2, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f22109a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    this.f22109a = 1;
                    if (AbstractC3208a.m15437d(100L, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$2", m4291f = "TtsController.kt", m4292l = {557}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements aj3 {

            /* JADX INFO: renamed from: a */
            public int f22110a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1819c f22111b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ double f22112c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Double f22113d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ int f22114e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ float f22115f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1819c c1819c, double d, Double d2, int i, float f, Continuation continuation) {
                super(3, continuation);
                this.f22111b = c1819c;
                this.f22112c = d;
                this.f22113d = d2;
                this.f22114e = i;
                this.f22115f = f;
            }

            @Override // p000.aj3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i = this.f22114e;
                float f = this.f22115f;
                return new AnonymousClass2(this.f22111b, this.f22112c, this.f22113d, i, f, (Continuation) obj3).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f22110a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    this.f22110a = 1;
                    if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                C1819c c1819c = this.f22111b;
                c1819c.f22176n.mo4677k(new Long(0L));
                c1819c.mo8493n(this.f22112c, this.f22113d, this.f22114e, this.f22115f, null);
                return xfa.f68157a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$3, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$3", m4291f = "TtsController.kt", m4292l = {562}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass3 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f22116a;

            /* JADX INFO: renamed from: b */
            public /* synthetic */ int f22117b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C1819c f22118c;

            /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$3$1, reason: invalid class name */
            @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$playClippedSentence$2$3$3$1", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
            final class AnonymousClass1 extends SuspendLambda implements zi3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1819c f22119a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f22120b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C1819c c1819c, int i, Continuation continuation) {
                    super(2, continuation);
                    this.f22119a = c1819c;
                    this.f22120b = i;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f22119a, this.f22120b, continuation);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
                    xfa xfaVar = xfa.f68157a;
                    anonymousClass1.invokeSuspend(xfaVar);
                    return xfaVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    AbstractC3193b.m15359b(obj);
                    this.f22119a.f22176n.mo4677k(new Long(((long) this.f22120b) * 100));
                    return xfa.f68157a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C1819c c1819c, Continuation continuation) {
                super(2, continuation);
                this.f22118c = c1819c;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f22118c, continuation);
                anonymousClass3.f22117b = ((Number) obj).intValue();
                return anonymousClass3;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.f22117b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.f22116a;
                if (i2 == 0) {
                    AbstractC3193b.m15359b(obj);
                    C1819c c1819c = this.f22118c;
                    nn1 nn1Var = c1819c.f22165c;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(c1819c, i, null);
                    this.f22117b = i;
                    this.f22116a = 1;
                    if (wfb.m23905G(anonymousClass1, nn1Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18143(double d, C1819c c1819c, double d2, Double d3, int i, float f, Continuation continuation) {
            super(2, continuation);
            this.f22103b = d;
            this.f22104c = c1819c;
            this.f22105d = d2;
            this.f22106e = d3;
            this.f22107f = i;
            this.f22108g = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18143(this.f22103b, this.f22104c, this.f22105d, this.f22106e, this.f22107f, this.f22108g, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18143) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f22102a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                m83 m83Var = new m83(new yz0(new z91(new i84(0, (int) this.f22103b, 1), 0), 3), new AnonymousClass1(2, null), 2);
                float f = this.f22108g;
                C1819c c1819c = this.f22104c;
                l83 l83Var = new l83(m83Var, new AnonymousClass2(c1819c, this.f22105d, this.f22106e, this.f22107f, f, null), 0);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(c1819c, null);
                this.f22102a = 1;
                if (AbstractC3224d.m15529h(l83Var, anonymousClass3, this) == coroutineSingletons) {
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
    public TtsControllerImpl$playClippedSentence$2(C1819c c1819c, mn7 mn7Var, double d, long j, float f, pu5 pu5Var, Double d2, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f22093a = c1819c;
        this.f22094b = mn7Var;
        this.f22095c = d;
        this.f22096d = j;
        this.f22097e = f;
        this.f22098f = pu5Var;
        this.f22099g = d2;
        this.f22100h = str;
        this.f22101i = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$playClippedSentence$2(this.f22093a, this.f22094b, this.f22095c, this.f22096d, this.f22097e, this.f22098f, this.f22099g, this.f22100h, this.f22101i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TtsControllerImpl$playClippedSentence$2 ttsControllerImpl$playClippedSentence$2 = (TtsControllerImpl$playClippedSentence$2) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        ttsControllerImpl$playClippedSentence$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1819c c1819c = this.f22093a;
        C3244l c3244l = c1819c.f22174l;
        jw2 jw2Var = c1819c.f22172j;
        AbstractC1263a.m7046a(c1819c.f22179q);
        x31 x31Var = new x31(this.f22094b);
        double d = this.f22095c;
        long j = (long) (1000000.0d * d);
        bna.m3969q(j >= 0);
        bna.m3987z(!x31Var.f67697d);
        x31Var.f67695b = j;
        bna.m3987z(!x31Var.f67697d);
        x31Var.f67696c = this.f22096d;
        x31Var.f67697d = true;
        z31 z31Var = new z31(x31Var);
        jw2Var.m14697C(new n97(this.f22097e, 1.0f));
        z0a z0aVarM14716l = jw2Var.m14716l();
        boolean zM11650l = fa4.m11650l(z0aVarM14716l.m25398p() ? null : z0aVarM14716l.mo39m(jw2Var.m14712h(), jw2Var.f46280a, 0L).f69065b, this.f22098f);
        String str = this.f22100h;
        if (zM11650l && jw2Var.m14722s()) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, new ada(str, false, true, false)));
            jw2Var.m14699E();
            jw2Var.m14707c();
            jw2Var.m14726x();
        } else {
            jw2Var.m14699E();
            jw2Var.m14707c();
            jw2Var.m14695A(z31Var);
            jw2Var.m14726x();
            jw2Var.m14696B(true);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, new ada(str, true, true, false)));
            Double d2 = this.f22099g;
            c1819c.f22179q = wfb.m23926u(c1819c.f22164b, null, null, new C18143(10.0d * (d2 != null ? d2.doubleValue() - d : 0.0d), c1819c, this.f22095c, this.f22099g, this.f22101i, this.f22097e, null), 3);
        }
        return xfa.f68157a;
    }
}
