package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.C3419on;
import p000.C3610tg;
import p000.c32;
import p000.c57;
import p000.cx9;
import p000.eh0;
import p000.s31;
import p000.t31;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", m4291f = "TextFieldSelectionManager.kt", m4292l = {891}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f3039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f3040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$copy$1(C0205f c0205f, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f3039b = c0205f;
        this.f3040c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$copy$1(this.f3039b, this.f3040c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$copy$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        t31 t31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3038a;
        C3419on c3419onM19784n = null;
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
        C0205f c0205f = this.f3039b;
        if (!cx9.m9921c(c0205f.m1114o().f65991b) && !(c0205f.f3081f instanceof c57)) {
            c3419onM19784n = AbstractC3489q9.m19784n(c0205f.m1114o());
            if (this.f3040c) {
                int iM9923e = cx9.m9923e(c0205f.m1114o().f65991b);
                c0205f.f3078c.invoke(C0205f.m1103e(c0205f.m1114o().f65990a, eh0.m11127g(iM9923e, iM9923e)));
                c0205f.m1117r(HandleState.None);
            }
        }
        if (c3419onM19784n != null && (t31Var = c0205f.f3083h) != null) {
            s31 s31VarM18263k0 = AbstractC3423or.m18263k0(c3419onM19784n);
            this.f3038a = 1;
            ((C3610tg) t31Var).f62240a.m3360m().setPrimaryClip(s31VarM18263k0.m21043a());
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
