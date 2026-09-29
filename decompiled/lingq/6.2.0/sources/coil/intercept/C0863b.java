package coil.intercept;

import android.content.Context;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.e04;
import p000.f04;
import p000.p84;
import p000.w89;
import p000.wt2;
import p000.y84;

/* JADX INFO: renamed from: coil.intercept.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0863b {

    /* JADX INFO: renamed from: a */
    public final e04 f10557a;

    /* JADX INFO: renamed from: b */
    public final List f10558b;

    /* JADX INFO: renamed from: c */
    public final int f10559c;

    /* JADX INFO: renamed from: d */
    public final e04 f10560d;

    /* JADX INFO: renamed from: e */
    public final w89 f10561e;

    /* JADX INFO: renamed from: f */
    public final wt2 f10562f;

    /* JADX INFO: renamed from: g */
    public final boolean f10563g;

    public C0863b(e04 e04Var, List list, int i, e04 e04Var2, w89 w89Var, wt2 wt2Var, boolean z) {
        this.f10557a = e04Var;
        this.f10558b = list;
        this.f10559c = i;
        this.f10560d = e04Var2;
        this.f10561e = w89Var;
        this.f10562f = wt2Var;
        this.f10563g = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m4979a(e04 e04Var, y84 y84Var) {
        Context context = e04Var.f36502a;
        e04 e04Var2 = this.f10557a;
        if (context != e04Var2.f36502a) {
            C3386nv.m17634u("Interceptor '", y84Var, "' cannot modify the request's context.");
            return;
        }
        if (e04Var.f36503b == p84.f55746h) {
            C3386nv.m17634u("Interceptor '", y84Var, "' cannot set the request's data to null.");
            return;
        }
        if (e04Var.f36504c != e04Var2.f36504c) {
            C3386nv.m17634u("Interceptor '", y84Var, "' cannot modify the request's target.");
        } else if (e04Var.f36522u != e04Var2.f36522u) {
            C3386nv.m17634u("Interceptor '", y84Var, "' cannot modify the request's lifecycle.");
        } else {
            if (e04Var.f36523v == e04Var2.f36523v) {
                return;
            }
            C3386nv.m17634u("Interceptor '", y84Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m4980b(e04 e04Var, ContinuationImpl continuationImpl) throws Throwable {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        y84 y84Var;
        Object objMo4977a;
        if (continuationImpl instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuationImpl;
            int i = realInterceptorChain$proceed$1.f10552e;
            if ((i & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.f10552e = i - Integer.MIN_VALUE;
            } else {
                realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
            }
        } else {
            realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
        }
        Object obj = realInterceptorChain$proceed$1.f10550c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = realInterceptorChain$proceed$1.f10552e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            List list = this.f10558b;
            int i3 = this.f10559c;
            if (i3 > 0) {
                m4979a(e04Var, (y84) list.get(i3 - 1));
            }
            y84Var = (y84) list.get(i3);
            C0863b c0863b = new C0863b(this.f10557a, this.f10558b, i3 + 1, e04Var, this.f10561e, this.f10562f, this.f10563g);
            realInterceptorChain$proceed$1.f10548a = this;
            realInterceptorChain$proceed$1.f10549b = y84Var;
            realInterceptorChain$proceed$1.f10552e = 1;
            objMo4977a = y84Var.mo4977a(c0863b, realInterceptorChain$proceed$1);
            if (objMo4977a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y84 y84Var2 = realInterceptorChain$proceed$1.f10549b;
            C0863b c0863b2 = realInterceptorChain$proceed$1.f10548a;
            AbstractC3193b.m15359b(obj);
            y84Var = y84Var2;
            this = c0863b2;
            objMo4977a = obj;
        }
        f04 f04Var = (f04) objMo4977a;
        this.m4979a(f04Var.mo11419b(), y84Var);
        return f04Var;
    }
}
