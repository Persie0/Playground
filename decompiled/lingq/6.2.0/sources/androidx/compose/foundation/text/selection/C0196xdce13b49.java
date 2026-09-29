package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1", m4291f = "TextFieldSelectionManager.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0196xdce13b49 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f3056a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0196xdce13b49(C0205f c0205f, Continuation continuation) {
        super(1, continuation);
        this.f3056a = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0196xdce13b49(this.f3056a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        C0196xdce13b49 c0196xdce13b49 = (C0196xdce13b49) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        c0196xdce13b49.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f3056a.m1105f();
        return xfa.f68157a;
    }
}
