package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.ui3;
import p000.xfa;
import p000.ye0;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.BottomSheetKt$BottomSheet$4$1", m4291f = "BottomSheet.kt", m4292l = {159, 164}, m4293m = "invokeSuspend", m4294v = 1)
final class BottomSheetKt$BottomSheet$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3112a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3113b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f3114c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f3115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetKt$BottomSheet$4$1(ui3 ui3Var, C0059a c0059a, Continuation continuation) {
        super(2, continuation);
        this.f3114c = ui3Var;
        this.f3115d = c0059a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BottomSheetKt$BottomSheet$4$1 bottomSheetKt$BottomSheet$4$1 = new BottomSheetKt$BottomSheet$4$1(this.f3114c, this.f3115d, continuation);
        bottomSheetKt$BottomSheet$4$1.f3113b = obj;
        return bottomSheetKt$BottomSheet$4$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetKt$BottomSheet$4$1) create((c83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r9.f3115d, r4, null, null, r9, 14) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3112a;
        try {
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            c83 c83Var = (c83) this.f3113b;
            ye0 ye0Var = new ye0(this.f3115d, 1);
            this.f3112a = 1;
            if (c83Var.collect(ye0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f3114c.mo0a();
        } catch (CancellationException unused) {
            Float f = new Float(0.0f);
            this.f3112a = 2;
        }
        return xfa.f68157a;
    }
}
