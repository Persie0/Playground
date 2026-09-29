package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0154a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.e28;
import p000.ju9;
import p000.mq6;
import p000.rw9;
import p000.sw9;
import p000.un1;
import p000.ut9;
import p000.vv9;
import p000.xfa;
import p000.yw4;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", m4291f = "CoreTextField.kt", m4292l = {347}, m4293m = "invokeSuspend", m4294v = 1)
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0154a f2781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vv9 f2782c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yw4 f2783d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ sw9 f2784e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mq6 f2785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(C0154a c0154a, vv9 vv9Var, yw4 yw4Var, sw9 sw9Var, mq6 mq6Var, Continuation continuation) {
        super(2, continuation);
        this.f2781b = c0154a;
        this.f2782c = vv9Var;
        this.f2783d = yw4Var;
        this.f2784e = sw9Var;
        this.f2785f = mq6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.f2781b, this.f2782c, this.f2783d, this.f2784e, this.f2785f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e28 e28VarM20955b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2780a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        ut9 ut9Var = this.f2783d.f70569a;
        rw9 rw9Var = this.f2784e.f61519a;
        this.f2780a = 1;
        int iMo13411t = this.f2785f.mo13411t(cx9.m9923e(this.f2782c.f65991b));
        if (iMo13411t < rw9Var.f59975a.f58295a.f54604b.length()) {
            e28VarM20955b = rw9Var.m20955b(iMo13411t);
        } else {
            e28VarM20955b = iMo13411t != 0 ? rw9Var.m20955b(iMo13411t - 1) : new e28(0.0f, 0.0f, 1.0f, (int) (ju9.m14657a(ut9Var.f64341b, ut9Var.f64346g, ut9Var.f64347h) & 4294967295L));
        }
        Object objM1046a = this.f2781b.m1046a(e28VarM20955b, this);
        if (objM1046a != coroutineSingletons) {
            objM1046a = xfaVar;
        }
        return objM1046a == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
