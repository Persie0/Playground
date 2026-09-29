package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.C3341mn;
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
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", m4291f = "TextFieldSelectionManager.kt", m4292l = {971}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$cut$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f3042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$cut$1(C0205f c0205f, Continuation continuation) {
        super(2, continuation);
        this.f3042b = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$cut$1(this.f3042b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$cut$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        t31 t31Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3041a;
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
        C0205f c0205f = this.f3042b;
        if (!cx9.m9921c(c0205f.m1114o().f65991b) && c0205f.m1110k() && !(c0205f.f3081f instanceof c57)) {
            c3419onM19784n = AbstractC3489q9.m19784n(c0205f.m1114o());
            C3419on c3419onM19786p = AbstractC3489q9.m19786p(c0205f.m1114o(), c0205f.m1114o().f65990a.f54604b.length());
            C3419on c3419onM19785o = AbstractC3489q9.m19785o(c0205f.m1114o(), c0205f.m1114o().f65990a.f54604b.length());
            C3341mn c3341mn = new C3341mn(c3419onM19786p);
            c3341mn.m16928c(c3419onM19785o);
            C3419on c3419onM16933h = c3341mn.m16933h();
            int iM9924f = cx9.m9924f(c0205f.m1114o().f65991b);
            c0205f.f3078c.invoke(C0205f.m1103e(c3419onM16933h, eh0.m11127g(iM9924f, iM9924f)));
            c0205f.m1117r(HandleState.None);
            c0205f.f3076a.f59213e = true;
        }
        if (c3419onM19784n != null && (t31Var = c0205f.f3083h) != null) {
            s31 s31VarM18263k0 = AbstractC3423or.m18263k0(c3419onM19784n);
            this.f3041a = 1;
            ((C3610tg) t31Var).f62240a.m3360m().setPrimaryClip(s31VarM18263k0.m21043a());
            if (xfaVar == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
