package com.lingq.core.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.fa4;
import p000.gh1;
import p000.jw2;
import p000.nn1;
import p000.tb7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$2", m4291f = "PlayerController.kt", m4292l = {1114}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21898b;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$2$1 */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$2$1", m4291f = "PlayerController.kt", m4292l = {241}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18011 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f21899a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f21900b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1808b f21901c;

        /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$2$1$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$2$1$1", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List f21902a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1808b f21903b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List list, C1808b c1808b, Continuation continuation) {
                super(2, continuation);
                this.f21902a = list;
                this.f21903b = c1808b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f21902a, this.f21903b, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
                xfa xfaVar = xfa.f68157a;
                anonymousClass1.invokeSuspend(xfaVar);
                return xfaVar;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x005c A[EDGE_INSN: B:23:0x005c->B:24:0x005d BREAK  A[LOOP:0: B:18:0x0044->B:41:?]] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                AbstractC3193b.m15359b(obj);
                List list = this.f21902a;
                boolean zIsEmpty = list.isEmpty();
                C1808b c1808b = this.f21903b;
                gh1 gh1Var = c1808b.f21961n;
                if (zIsEmpty) {
                    gh1Var.getClass();
                    list.getClass();
                    ArrayList arrayList = (ArrayList) gh1Var.f40792d;
                    arrayList.clear();
                    arrayList.addAll(list);
                } else {
                    tb7 tb7VarM12625d = gh1Var.m12625d();
                    Integer num = tb7VarM12625d != null ? new Integer(tb7VarM12625d.m21939g()) : null;
                    if (num != null && c1808b.m8444G()) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (((tb7) it.next()).m21939g() == num.intValue()) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (!z) {
                        jw2 jw2Var = c1808b.f21960m;
                        if (jw2Var == null) {
                            fa4.m11636J("player");
                            throw null;
                        }
                        jw2Var.m14696B(false);
                    }
                    gh1Var.getClass();
                    list.getClass();
                    ArrayList arrayList2 = (ArrayList) gh1Var.f40792d;
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    tb7 tb7VarM12625d2 = gh1Var.m12625d();
                    if (tb7VarM12625d2 != null && !c1808b.m8445H(tb7VarM12625d2.m21939g())) {
                        c1808b.m8460Z(tb7VarM12625d2, z);
                    }
                    c1808b.f21953f.mo9212j1();
                }
                return xfa.f68157a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18011(C1808b c1808b, Continuation continuation) {
            super(2, continuation);
            this.f21901c = c1808b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18011 c18011 = new C18011(this.f21901c, continuation);
            c18011.f21900b = obj;
            return c18011;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18011) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f21900b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f21899a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1808b c1808b = this.f21901c;
                nn1 nn1Var = c1808b.f21950c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(list, c1808b, null);
                this.f21900b = null;
                this.f21899a = 1;
                if (wfb.m23905G(anonymousClass1, nn1Var, this) == coroutineSingletons) {
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
    public PlayerControllerImpl$2(C1808b c1808b, Continuation continuation) {
        super(2, continuation);
        this.f21898b = c1808b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$2(this.f21898b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21897a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21898b;
            c18 c18Var = c1808b.f21944B;
            C18011 c18011 = new C18011(c1808b, null);
            c18Var.getClass();
            this.f21897a = 1;
            if (AbstractC3224d.m15529h(c18Var, c18011, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
