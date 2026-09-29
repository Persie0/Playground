package com.lingq.p020ui;

import com.lingq.core.datastore.C1369b;
import java.util.UUID;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.nm7;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$1", m4291f = "MainViewModel.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34105b;

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$1$1 */
    @c32(m4290c = "com.lingq.ui.MainViewModel$1$1", m4291f = "MainViewModel.kt", m4292l = {186}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28831 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f34106a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f34107b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2889e f34108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28831(C2889e c2889e, Continuation continuation) {
            super(2, continuation);
            this.f34108c = c2889e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28831 c28831 = new C28831(this.f34108c, continuation);
            c28831.f34107b = obj;
            return c28831;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28831) create((String) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f34107b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f34106a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (str.length() == 0) {
                    nm7 nm7Var = this.f34108c.f34215q;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    this.f34107b = null;
                    this.f34106a = 1;
                    if (((C1369b) nm7Var).m7917d(string, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public MainViewModel$1(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34105b = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$1(this.f34105b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34104a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2889e c2889e = this.f34105b;
            qm7 qm7Var = ((C1369b) c2889e.f34215q).f18484q;
            C28831 c28831 = new C28831(c2889e, null);
            this.f34104a = 1;
            if (AbstractC3224d.m15529h(qm7Var, c28831, this) == coroutineSingletons) {
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
