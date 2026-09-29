package androidx.compose.foundation;

import androidx.compose.p002ui.platform.AbstractC0402n;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.dr3;
import p000.hta;
import p000.pg9;
import p000.thb;
import p000.ui3;
import p000.un1;
import p000.x87;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$1", m4291f = "Clickable.kt", m4292l = {1224}, m4293m = "invokeSuspend", m4294v = 1)
final class CombinedClickableNode$handleDownEvent$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f1663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0081g f1664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$handleDownEvent$1(C0081g c0081g, Continuation continuation) {
        super(2, continuation);
        this.f1664b = c0081g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CombinedClickableNode$handleDownEvent$1(this.f1664b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CombinedClickableNode$handleDownEvent$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1663a;
        C0081g c0081g = this.f1664b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long jMo13456b = ((hta) thb.m22050i(c0081g, AbstractC0402n.f4829u)).mo13456b();
            this.f1663a = 1;
            if (AbstractC3208a.m15437d(jMo13456b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ui3 ui3Var = c0081g.f1756g0;
        if (ui3Var != null) {
            ui3Var.mo0a();
        }
        if (c0081g.f1757h0) {
            ((x87) ((dr3) thb.m22050i(c0081g, AbstractC0402n.f4820l))).m24403a(0);
        }
        c0081g.f1764o0 = true;
        pg9 pg9Var = c0081g.f1762m0;
        if (pg9Var != null) {
            pg9Var.mo4537a(null);
        }
        c0081g.f1762m0 = null;
        c0081g.f1761l0 = null;
        return xfa.f68157a;
    }
}
