package com.amplitude.core;

import com.amplitude.android.C0882d;
import com.amplitude.core.platform.plugins.C0910a;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.y92;
import p000.yv5;
import p000.zf7;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.Amplitude$flush$1", m4291f = "Amplitude.kt", m4292l = {545}, m4293m = "invokeSuspend")
final class Amplitude$flush$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0903a f11009b;

    /* JADX INFO: renamed from: com.amplitude.core.Amplitude$flush$1$1 */
    final class C09021 extends Lambda implements vi3 {

        /* JADX INFO: renamed from: b */
        public static final C09021 f11010b = new C09021(1);

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            zf7 zf7Var = (zf7) obj;
            zf7Var.getClass();
            C0910a c0910a = zf7Var instanceof C0910a ? (C0910a) zf7Var : null;
            if (c0910a != null) {
                c0910a.m5145d();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Amplitude$flush$1(AbstractC0903a abstractC0903a, Continuation continuation) {
        super(2, continuation);
        this.f11009b = abstractC0903a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Amplitude$flush$1(this.f11009b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((Amplitude$flush$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11008a;
        AbstractC0903a abstractC0903a = this.f11009b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            y92 y92Var = abstractC0903a.f11027l;
            this.f11008a = 1;
            if (y92Var.m15517w(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C0882d c0882d = abstractC0903a.f11022g;
        c0882d.getClass();
        Iterator it = ((Map) c0882d.f39590b).entrySet().iterator();
        while (it.hasNext()) {
            yv5 yv5Var = (yv5) ((Map.Entry) it.next()).getValue();
            yv5Var.getClass();
            for (zf7 zf7Var : yv5Var.f70552a) {
                zf7Var.getClass();
                C09021.f11010b.invoke(zf7Var);
            }
        }
        return xfa.f68157a;
    }
}
