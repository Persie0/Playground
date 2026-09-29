package com.lingq.p020ui;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.web2wave.C1544a;
import com.lingq.feature.onboarding.domain.C2207a;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3660ut;
import p000.InterfaceC3808yt;
import p000.c32;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$checkForLogin$1", m4291f = "MainViewModel.kt", m4292l = {210, 213, 215}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$checkForLogin$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34117a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f34118b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2889e f34119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$checkForLogin$1(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34119c = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainViewModel$checkForLogin$1 mainViewModel$checkForLogin$1 = new MainViewModel$checkForLogin$1(this.f34119c, continuation);
        mainViewModel$checkForLogin$1.f34118b = obj;
        return mainViewModel$checkForLogin$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$checkForLogin$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r8 == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        Object value;
        boolean z;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34117a;
        C2889e c2889e = this.f34119c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1544a c1544a = c2889e.f34217s;
                this.f34118b = null;
                this.f34117a = 1;
                obj = c1544a.m8228a(this);
                if (obj == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else if (i == 2) {
                AbstractC3193b.m15359b(obj);
                qm7 qm7Var = ((C1369b) c2889e.f34215q).f18482o;
                this.f34118b = null;
                this.f34117a = 3;
                obj = AbstractC3224d.m15541t(qm7Var, this);
            } else {
                if (i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            Login login = (Login) obj;
            C3244l c3244l = c2889e.f34195E;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
                String str = login.f19647b;
                z = false;
                if (str != null && str.length() > 0) {
                    z = true;
                }
            } while (!c3244l.m15570h(value, Boolean.valueOf(z)));
            C3244l c3244l2 = c2889e.f34224z;
            do {
                value2 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value2, login));
            return xfa.f68157a;
            failure = (InterfaceC3808yt) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        if (((InterfaceC3808yt) failure) instanceof C3660ut) {
            C2207a c2207a = c2889e.f34218t;
            this.f34118b = null;
            this.f34117a = 2;
            if (c2207a.m9136a(this) != coroutineSingletons) {
                qm7 qm7Var2 = ((C1369b) c2889e.f34215q).f18482o;
                this.f34118b = null;
                this.f34117a = 3;
                obj = AbstractC3224d.m15541t(qm7Var2, this);
            }
        } else {
            qm7 qm7Var3 = ((C1369b) c2889e.f34215q).f18482o;
            this.f34118b = null;
            this.f34117a = 3;
            obj = AbstractC3224d.m15541t(qm7Var3, this);
        }
        return coroutineSingletons;
    }
}
