package com.lingq.core.player.tts;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.i84;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.yz0;
import p000.z91;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$startTimer$2", m4291f = "TtsController.kt", m4292l = {664}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$startTimer$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22143b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f22145d;

    /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$startTimer$2$1 */
    @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$startTimer$2$1", m4291f = "TtsController.kt", m4292l = {663}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18151 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22146a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18151(2, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18151) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f22146a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f22146a = 1;
                if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$startTimer$2$2 */
    @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$startTimer$2$2", m4291f = "TtsController.kt", m4292l = {666}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18162 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22147a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ int f22148b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1819c f22149c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f22150d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f22151e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18162(C1819c c1819c, String str, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f22149c = c1819c;
            this.f22150d = str;
            this.f22151e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18162 c18162 = new C18162(this.f22149c, this.f22150d, this.f22151e, continuation);
            c18162.f22148b = ((Number) obj).intValue();
            return c18162;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18162) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f22148b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f22147a;
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (i == 2) {
                    this.f22148b = i;
                    this.f22147a = 1;
                    if (this.f22149c.m8489j(this.f22150d, 1.0f, this.f22151e, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public TtsControllerImpl$startTimer$2(C1819c c1819c, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22143b = c1819c;
        this.f22144c = str;
        this.f22145d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$startTimer$2(this.f22143b, this.f22144c, this.f22145d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$startTimer$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22142a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            m83 m83Var = new m83(new yz0(new z91(new i84(0, 2, 1), 0), 3), new C18151(2, null), 2);
            C18162 c18162 = new C18162(this.f22143b, this.f22144c, this.f22145d, null);
            this.f22142a = 1;
            if (AbstractC3224d.m15529h(m83Var, c18162, this) == coroutineSingletons) {
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
