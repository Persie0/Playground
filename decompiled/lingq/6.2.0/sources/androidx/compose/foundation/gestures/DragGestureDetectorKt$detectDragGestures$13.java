package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3288l7;
import p000.C3305lo;
import p000.C3386nv;
import p000.c32;
import p000.rm0;
import p000.ui3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13", m4291f = "DragGestureDetector.kt", m4292l = {246, 247}, m4293m = "invokeSuspend", m4294v = 1)
final class DragGestureDetectorKt$detectDragGestures$13 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f1897b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f1898c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3288l7 f1899d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rm0 f1900e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zi3 f1901f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ui3 f1902g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3305lo f1903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$13(C3288l7 c3288l7, rm0 rm0Var, zi3 zi3Var, ui3 ui3Var, C3305lo c3305lo, Continuation continuation) {
        super(2, continuation);
        this.f1899d = c3288l7;
        this.f1900e = rm0Var;
        this.f1901f = zi3Var;
        this.f1902g = ui3Var;
        this.f1903h = c3305lo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$detectDragGestures$13 dragGestureDetectorKt$detectDragGestures$13 = new DragGestureDetectorKt$detectDragGestures$13(this.f1899d, this.f1900e, this.f1901f, this.f1902g, this.f1903h, continuation);
        dragGestureDetectorKt$detectDragGestures$13.f1898c = obj;
        return dragGestureDetectorKt$detectDragGestures$13;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$13) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0102j.m875j(r4, (p000.kg7) r13, r12.f1899d, r12.f1900e, r12.f1901f, r12.f1902g, r12.f1903h, r12) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1897b;
        if (i != 0) {
            if (i == 1) {
                c0332f = (C0332f) this.f1898c;
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
        c0332f = (C0332f) this.f1898c;
        PointerEventPass pointerEventPass = PointerEventPass.Initial;
        this.f1898c = c0332f;
        this.f1897b = 1;
        obj = AbstractC0117w.m938a(c0332f, false, pointerEventPass, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        C0332f c0332f2 = c0332f;
        this.f1898c = null;
        this.f1897b = 2;
    }
}
