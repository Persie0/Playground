package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fw9;
import p000.kb0;
import p000.kk8;
import p000.t66;
import p000.un1;
import p000.w04;
import p000.wm1;
import p000.xfa;
import p000.yw4;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", m4291f = "CoreTextField.kt", m4292l = {364}, m4293m = "invokeSuspend", m4294v = 1)
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw4 f2772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f2773c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fw9 f2774d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0205f f2775e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ w04 f2776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(yw4 yw4Var, t66 t66Var, fw9 fw9Var, C0205f c0205f, w04 w04Var, Continuation continuation) {
        super(2, continuation);
        this.f2772b = yw4Var;
        this.f2773c = t66Var;
        this.f2774d = fw9Var;
        this.f2775e = c0205f;
        this.f2776f = w04Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.f2772b, this.f2773c, this.f2774d, this.f2775e, this.f2776f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2771a;
        yw4 yw4Var = this.f2772b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                kk8 kk8VarM1264n = AbstractC0278f.m1264n(new kb0(1, this.f2773c));
                wm1 wm1Var = new wm1(yw4Var, this.f2774d, this.f2775e, this.f2776f, 0);
                this.f2771a = 1;
                if (kk8VarM1264n.collect(wm1Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            AbstractC0176d.m1073f(yw4Var);
            return xfa.f68157a;
        } catch (Throwable th) {
            AbstractC0176d.m1073f(yw4Var);
            throw th;
        }
    }
}
