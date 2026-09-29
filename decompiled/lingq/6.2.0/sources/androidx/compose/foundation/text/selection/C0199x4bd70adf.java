package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1", m4291f = "TextFieldSelectionManager.android.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 1)
final class C0199x4bd70adf extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3059a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f3060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199x4bd70adf(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f3060b = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0199x4bd70adf(this.f3060b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0199x4bd70adf) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3059a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3059a = 1;
            if (this.f3060b.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
