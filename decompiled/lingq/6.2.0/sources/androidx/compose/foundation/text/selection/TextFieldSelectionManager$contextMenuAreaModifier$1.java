package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.gq6;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", m4291f = "TextFieldSelectionManager.kt", m4292l = {228, 230}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f3034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(C0205f c0205f, Continuation continuation) {
        super(2, continuation);
        this.f3034b = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.f3034b, continuation);
        long j = ((gq6) obj).f41189a;
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j = ((gq6) obj).f41189a;
        return new TextFieldSelectionManager$contextMenuAreaModifier$1(this.f3034b, (Continuation) obj2).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM23905G;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3033a;
        xfa xfaVar = xfa.f68157a;
        C0205f c0205f = this.f3034b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3033a = 1;
            if (c0205f.m1119t(this) != coroutineSingletons) {
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
        AbstractC3193b.m15359b(obj);
        Pair pairM1100a = C0205f.m1100a(c0205f);
        if (pairM1100a != null) {
            String str = (String) pairM1100a.f47623a;
            long j = ((cx9) pairM1100a.f47624b).f34694a;
            C0200a c0200a = c0205f.f3085j;
            if (c0200a != null) {
                this.f3033a = 2;
                if (str.length() == 0 || cx9.m9921c(j)) {
                    objM23905G = xfaVar;
                } else {
                    C0191x101d3cd6 c0191x101d3cd6 = new C0191x101d3cd6(j, c0200a, str, null);
                    objM23905G = wfb.m23905G(new C0192xa7a7d588(c0200a, c0191x101d3cd6, null), c0200a.f3061a, this);
                }
                if (objM23905G != coroutineSingletons) {
                    objM23905G = xfaVar;
                }
                if (objM23905G == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }
}
