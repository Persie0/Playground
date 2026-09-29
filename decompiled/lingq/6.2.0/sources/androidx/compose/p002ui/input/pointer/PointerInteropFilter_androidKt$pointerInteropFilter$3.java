package androidx.compose.p002ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import kotlin.jvm.internal.Lambda;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0442b f4102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AbstractC0442b abstractC0442b) {
        super(1);
        this.f4102b = abstractC0442b;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        int actionMasked = motionEvent.getActionMasked();
        AbstractC0442b abstractC0442b = this.f4102b;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = abstractC0442b.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = abstractC0442b.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
