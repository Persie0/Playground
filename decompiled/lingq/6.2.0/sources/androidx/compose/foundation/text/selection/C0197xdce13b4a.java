package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", m4291f = "TextFieldSelectionManager.android.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0197xdce13b4a extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0205f f3057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0197xdce13b4a(C0205f c0205f, Continuation continuation) {
        super(1, continuation);
        this.f3057a = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0197xdce13b4a(this.f3057a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        C0197xdce13b4a c0197xdce13b4a = (C0197xdce13b4a) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        c0197xdce13b4a.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0205f c0205f = this.f3057a;
        c0205f.m1104d(c0205f.f3075B);
        return xfa.f68157a;
    }
}
