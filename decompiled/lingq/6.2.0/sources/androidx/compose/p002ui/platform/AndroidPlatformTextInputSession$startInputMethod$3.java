package androidx.compose.p002ui.platform;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c28;
import p000.c32;
import p000.fw9;
import p000.h97;
import p000.hw9;
import p000.m2b;
import p000.sm0;
import p000.to6;
import p000.vi3;
import p000.x66;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m4291f = "AndroidPlatformTextInputSession.android.kt", m4292l = {184}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f4518a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f4519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0395g f4520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(C0395g c0395g, Continuation continuation) {
        super(2, continuation);
        this.f4520c = c0395g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.f4520c, continuation);
        androidPlatformTextInputSession$startInputMethod$3.f4519b = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create((C0405q) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f4518a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            final C0405q c0405q = (C0405q) this.f4519b;
            this.f4519b = c0405q;
            this.f4518a = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(this));
            sm0Var.m21468u();
            final C0395g c0395g = this.f4520c;
            fw9 fw9Var = c0395g.f4767b;
            h97 h97Var = fw9Var.f39814a;
            h97Var.mo1079a();
            fw9Var.f39815b.set(new hw9(fw9Var, h97Var));
            sm0Var.m21470w(new vi3() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    c28 c28Var;
                    C0405q c0405q2 = c0405q;
                    synchronized (c0405q2.f4858c) {
                        try {
                            c0405q2.f4860e = true;
                            x66 x66Var = c0405q2.f4859d;
                            Object[] objArr = x66Var.f67830a;
                            int i2 = x66Var.f67832c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                to6 to6Var = (to6) ((m2b) objArr[i3]).get();
                                if (to6Var != null && (c28Var = to6Var.f62644b) != null) {
                                    c28Var.closeConnection();
                                    to6Var.f62644b = null;
                                }
                            }
                            c0405q2.f4859d.m24310h();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    fw9 fw9Var2 = c0395g.f4767b;
                    fw9Var2.f39815b.set(null);
                    fw9Var2.f39814a.mo1081c();
                    return xfa.f68157a;
                }
            });
            if (sm0Var.m21466r() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
