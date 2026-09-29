package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import kotlin.jvm.internal.Lambda;
import p000.fa4;
import p000.pg7;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pg7 f4100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(pg7 pg7Var) {
        super(1);
        this.f4100b = pg7Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        vi3 vi3Var = this.f4100b.f56185a;
        if (vi3Var != null) {
            ((PointerInteropFilter_androidKt$pointerInteropFilter$3) vi3Var).invoke(motionEvent);
            return xfa.f68157a;
        }
        fa4.m11636J("onTouchEvent");
        throw null;
    }
}
