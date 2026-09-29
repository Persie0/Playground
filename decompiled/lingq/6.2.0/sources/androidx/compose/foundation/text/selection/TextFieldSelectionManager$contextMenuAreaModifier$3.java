package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$3", m4291f = "TextFieldSelectionManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$contextMenuAreaModifier$3 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f3037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$3(C0205f c0205f, Continuation continuation) {
        super(1, continuation);
        this.f3037a = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$3(this.f3037a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        TextFieldSelectionManager$contextMenuAreaModifier$3 textFieldSelectionManager$contextMenuAreaModifier$3 = (TextFieldSelectionManager$contextMenuAreaModifier$3) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        textFieldSelectionManager$contextMenuAreaModifier$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f3037a.f3075B = false;
        return xfa.f68157a;
    }
}
