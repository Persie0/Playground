package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3", m4291f = "TextFieldSelectionManager.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0198xdce13b4b extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f3058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198xdce13b4b(C0205f c0205f, Continuation continuation) {
        super(1, continuation);
        this.f3058a = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0198xdce13b4b(this.f3058a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        C0198xdce13b4b c0198xdce13b4b = (C0198xdce13b4b) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        c0198xdce13b4b.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f3058a.m1116q();
        return xfa.f68157a;
    }
}
