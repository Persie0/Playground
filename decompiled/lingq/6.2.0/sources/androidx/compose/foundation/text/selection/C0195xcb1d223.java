package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p000.C3386nv;
import p000.c32;
import p000.ci8;
import p000.ht6;
import p000.kg7;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m4291f = "SelectionGestures.kt", m4292l = {195}, m4293m = "invokeSuspend", m4294v = 1)
final class C0195xcb1d223 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f3019b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f3020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f3021d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Ref$LongRef f3022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195xcb1d223(long j, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.f3021d = j;
        this.f3022e = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0195xcb1d223 c0195xcb1d223 = new C0195xcb1d223(this.f3021d, this.f3022e, continuation);
        c0195xcb1d223.f3020c = obj;
        return c0195xcb1d223;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0195xcb1d223) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3019b;
        Ref$LongRef ref$LongRef = this.f3022e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0332f c0332f2 = (C0332f) this.f3020c;
            ht6 ht6Var = new ht6(ref$LongRef, 23);
            this.f3020c = c0332f2;
            this.f3019b = 1;
            Object objM868c = AbstractC0102j.m868c(c0332f2, this.f3021d, ht6Var, this);
            if (objM868c == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM868c;
            c0332f = c0332f2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0332f = (C0332f) this.f3020c;
            AbstractC3193b.m15359b(obj);
        }
        if (((kg7) obj) != null && (ref$LongRef.f47717a & 9223372034707292159L) != 9205357640488583168L) {
            return DownResolution.Drag;
        }
        kg7 kg7Var = (kg7) u91.m22589G0(c0332f.f4136f.f4142O.f39071a);
        if (!ci8.m4725j(kg7Var)) {
            return DownResolution.Cancel;
        }
        kg7Var.m15189a();
        return DownResolution.Up;
    }
}
