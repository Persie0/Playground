package com.lingq.core.player;

import com.lingq.core.datastore.C1371d;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$1", m4291f = "PlayerController.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21894b;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$1$1 */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$1$1", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18001 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f21895a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1808b f21896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18001(C1808b c1808b, Continuation continuation) {
            super(2, continuation);
            this.f21896b = c1808b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18001 c18001 = new C18001(this.f21896b, continuation);
            c18001.f21895a = obj;
            return c18001;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18001 c18001 = (C18001) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18001.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Map map = (Map) this.f21895a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f21896b.f21947E;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, map));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$1(C1808b c1808b, Continuation continuation) {
        super(2, continuation);
        this.f21894b = c1808b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$1(this.f21894b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21893a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21894b;
            c83 c83Var = ((C1371d) c1808b.f21951d).f18581r;
            C18001 c18001 = new C18001(c1808b, null);
            this.f21893a = 1;
            if (AbstractC3224d.m15529h(c83Var, c18001, this) == coroutineSingletons) {
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
