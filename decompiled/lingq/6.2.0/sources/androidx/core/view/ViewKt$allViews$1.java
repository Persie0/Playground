package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3386nv;
import p000.C3705w0;
import p000.c32;
import p000.tba;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.core.view.ViewKt$allViews$1", m4291f = "View.kt", m4292l = {410, 412}, m4293m = "invokeSuspend", m4294v = 1)
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f5515b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f5516c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f5517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, Continuation continuation) {
        super(2, continuation);
        this.f5517d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f5517d, continuation);
        viewKt$allViews$1.f5516c = obj;
        return viewKt$allViews$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        vx8 vx8Var;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f5515b;
        xfa xfaVar = xfa.f68157a;
        View view = this.f5517d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx8Var = (vx8) this.f5516c;
            this.f5516c = vx8Var;
            this.f5515b = 1;
            if (vx8Var.m23582b(view, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vx8Var = (vx8) this.f5516c;
        AbstractC3193b.m15359b(obj);
        if (view instanceof ViewGroup) {
            this.f5516c = null;
            this.f5515b = 2;
            vx8Var.getClass();
            tba tbaVar = new tba(new C3705w0((ViewGroup) view, 4));
            if (tbaVar.f62118b.hasNext()) {
                vx8Var.f66062c = tbaVar;
                vx8Var.f66060a = 2;
                vx8Var.f66063d = this;
                obj2 = coroutineSingletons;
            } else {
                obj2 = xfaVar;
            }
            if (obj2 != coroutineSingletons) {
                obj2 = xfaVar;
            }
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
