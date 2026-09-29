package retrofit2;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.cc4;
import p000.kj3;
import p000.ph2;
import p000.ri0;
import p000.sm0;
import p000.uk4;
import p000.ul0;
import p000.vqb;

/* JADX INFO: renamed from: retrofit2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3533a {
    /* JADX INFO: renamed from: a */
    public static final Object m20599a(ul0 ul0Var, Continuation continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        sm0Var.m21470w(new ri0(ul0Var, 1));
        ul0Var.mo4152r(new cc4(sm0Var));
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m20600b(ul0 ul0Var, Continuation continuation) {
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        sm0Var.m21470w(new uk4(ul0Var, 0));
        ul0Var.mo4152r(new vqb(sm0Var, 18));
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final CoroutineSingletons m20601c(Throwable th, Continuation continuation) throws Throwable {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        if (continuation instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) continuation;
            int i = kotlinExtensions$suspendAndThrow$1.f59172b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.f59172b = i - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
            }
        } else {
            kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.f59171a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = kotlinExtensions$suspendAndThrow$1.f59172b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            kotlinExtensions$suspendAndThrow$1.f59172b = 1;
            ph2.f56212a.mo385T(kotlinExtensions$suspendAndThrow$1.getContext(), new kj3(5, kotlinExtensions$suspendAndThrow$1, th));
            return coroutineSingletons;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C3386nv.m17631r();
        return null;
    }
}
