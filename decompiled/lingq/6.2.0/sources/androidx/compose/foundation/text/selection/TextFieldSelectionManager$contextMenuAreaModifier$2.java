package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", m4291f = "TextFieldSelectionManager.kt", m4292l = {241, 243}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f3035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f3036b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(C0205f c0205f, Continuation continuation) {
        super(1, continuation);
        this.f3036b = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.f3036b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r13 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM23905G;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3035a;
        xfa xfaVar = xfa.f68157a;
        C0205f c0205f = this.f3036b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3035a = 1;
            if (c0205f.m1119t(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c0205f.f3075B = true;
        return xfaVar;
        Pair pairM1100a = C0205f.m1100a(c0205f);
        if (pairM1100a != null) {
            String str = (String) pairM1100a.f47623a;
            long j = ((cx9) pairM1100a.f47624b).f34694a;
            C0200a c0200a = c0205f.f3085j;
            if (c0200a != null) {
                this.f3035a = 2;
                if (str.length() == 0 || cx9.m9921c(j)) {
                    objM23905G = xfaVar;
                } else {
                    C0191x101d3cd6 c0191x101d3cd6 = new C0191x101d3cd6(j, c0200a, str, null);
                    objM23905G = wfb.m23905G(new C0192xa7a7d588(c0200a, c0191x101d3cd6, null), c0200a.f3061a, this);
                }
                if (objM23905G != coroutineSingletons) {
                    objM23905G = xfaVar;
                }
            }
        }
        c0205f.f3075B = true;
        return xfaVar;
    }
}
