package androidx.compose.foundation.text.contextmenu.provider;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.vi3;
import p000.xc9;
import p000.xfa;
import p000.za0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", m4291f = "BasicTextContextMenuProvider.kt", m4292l = {130}, m4293m = "invokeSuspend", m4294v = 1)
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f2884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0175a f2885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ za0 f2886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(C0175a c0175a, za0 za0Var, Continuation continuation) {
        super(1, continuation);
        this.f2885b = c0175a;
        this.f2886c = za0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.f2885b, this.f2886c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        za0 za0Var = this.f2886c;
        t66 t66Var = this.f2885b.f2889c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2884a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                ((xc9) t66Var).setValue(za0Var);
                this.f2884a = 1;
                C3211a c3211a = za0Var.f71249b;
                c3211a.getClass();
                Object objM15448I = C3211a.m15448I(c3211a, this);
                if (objM15448I != coroutineSingletons) {
                    objM15448I = xfaVar;
                }
                if (objM15448I == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            t66Var = (xc9) t66Var;
            t66Var.setValue(null);
            return xfaVar;
        } catch (Throwable th) {
            ((xc9) t66Var).setValue(null);
            throw th;
        }
    }
}
