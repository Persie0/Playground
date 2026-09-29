package com.lingq.core.player.tts;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$2", m4291f = "TtsController.kt", m4292l = {170}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsControllerImpl$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1819c f22026b;

    /* JADX INFO: renamed from: com.lingq.core.player.tts.TtsControllerImpl$2$1 */
    @c32(m4290c = "com.lingq.core.player.tts.TtsControllerImpl$2$1", m4291f = "TtsController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18121 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f22027a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1819c f22028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18121(C1819c c1819c, Continuation continuation) {
            super(2, continuation);
            this.f22028b = c1819c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18121 c18121 = new C18121(this.f22028b, continuation);
            c18121.f22027a = ((Boolean) obj).booleanValue();
            return c18121;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C18121 c18121 = (C18121) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18121.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f22027a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (z) {
                this.f22028b.f22180r = "";
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$2(C1819c c1819c, Continuation continuation) {
        super(2, continuation);
        this.f22026b = c1819c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TtsControllerImpl$2(this.f22026b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsControllerImpl$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22025a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1819c c1819c = this.f22026b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) c1819c.f22169g).f18371Q0);
            C18121 c18121 = new C18121(c1819c, null);
            this.f22025a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c18121, this) == coroutineSingletons) {
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
