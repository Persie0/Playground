package coil;

import android.graphics.Bitmap;
import coil.intercept.C0863b;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e04;
import p000.un1;
import p000.w89;
import p000.wt2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "coil.RealImageLoader$executeMain$result$1", m4291f = "RealImageLoader.kt", m4292l = {196}, m4293m = "invokeSuspend")
final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e04 f10399b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0855a f10400c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w89 f10401d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wt2 f10402e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bitmap f10403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$result$1(e04 e04Var, C0855a c0855a, w89 w89Var, wt2 wt2Var, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f10399b = e04Var;
        this.f10400c = c0855a;
        this.f10401d = w89Var;
        this.f10402e = wt2Var;
        this.f10403f = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealImageLoader$executeMain$result$1(this.f10399b, this.f10400c, this.f10401d, this.f10402e, this.f10403f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RealImageLoader$executeMain$result$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10398a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = this.f10400c.f10411h;
        boolean z = this.f10403f != null;
        e04 e04Var = this.f10399b;
        C0863b c0863b = new C0863b(e04Var, arrayList, 0, e04Var, this.f10401d, this.f10402e, z);
        this.f10398a = 1;
        Object objM4980b = c0863b.m4980b(e04Var, this);
        return objM4980b == coroutineSingletons ? coroutineSingletons : objM4980b;
    }
}
