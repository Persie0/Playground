package com.lingq.p020ui;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$2", m4291f = "MainViewModel.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2889e f34109a;

    /* JADX INFO: renamed from: b */
    public int f34110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2889e f34111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$2(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34111c = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$2(this.f34111c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2889e c2889e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34110b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2889e c2889e2 = this.f34111c;
            vi7 vi7Var = ((C1368a) c2889e2.f34214p).f18356L0;
            this.f34109a = c2889e2;
            this.f34110b = 1;
            Object objM15541t = AbstractC3224d.m15541t(vi7Var, this);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM15541t;
            c2889e = c2889e2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2889e = this.f34109a;
            AbstractC3193b.m15359b(obj);
        }
        c2889e.f34222x = (String) obj;
        return xfa.f68157a;
    }
}
