package androidx.compose.p002ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.C0423c;
import java.util.function.Consumer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3298lh;
import p000.C3386nv;
import p000.b34;
import p000.bna;
import p000.j84;
import p000.sg2;
import p000.ss5;
import p000.vl1;
import p000.wfb;
import p000.wl6;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.a */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC0417a implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a */
    public final C0423c f4907a;

    /* JADX INFO: renamed from: b */
    public final j84 f4908b;

    /* JADX INFO: renamed from: c */
    public final C0420d f4909c;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f4910d;

    /* JADX INFO: renamed from: e */
    public final vl1 f4911e;

    /* JADX INFO: renamed from: f */
    public final C0419c f4912f;

    public ScrollCaptureCallbackC0417a(C0423c c0423c, j84 j84Var, vl1 vl1Var, C0420d c0420d, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f4907a = c0423c;
        this.f4908b = j84Var;
        this.f4909c = c0420d;
        this.f4910d = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f4911e = new vl1(vl1Var.f65559a.plus(sg2.f60812a));
        this.f4912f = new C0419c(j84Var.m14322b(), new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m1828a(ScrollCaptureCallbackC0417a scrollCaptureCallbackC0417a, ScrollCaptureSession scrollCaptureSession, j84 j84Var, ContinuationImpl continuationImpl) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM16198h;
        j84 j84Var2;
        int i3;
        int i4;
        int iM1833b;
        int iM1833b2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (continuationImpl instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuationImpl;
            int i7 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4895g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4895g = i7 - Integer.MIN_VALUE;
            } else {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(scrollCaptureCallbackC0417a, continuationImpl);
            }
        } else {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(scrollCaptureCallbackC0417a, continuationImpl);
        }
        Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4893e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4895g;
        if (i8 == 0) {
            AbstractC3193b.m15359b(obj);
            i = j84Var.f45186b;
            i2 = j84Var.f45188d;
            C0419c c0419c = scrollCaptureCallbackC0417a.f4912f;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4889a = scrollCaptureSession;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4890b = j84Var;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4891c = i;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4892d = i2;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4895g = 1;
            if (c0419c.m1836e(i, i2, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            int i9 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4892d;
            int i10 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4891c;
            j84 j84Var3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4890b;
            ScrollCaptureSession scrollCaptureSessionM16198h2 = AbstractC3298lh.m16198h(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4889a);
            AbstractC3193b.m15359b(obj);
            i = i10;
            j84Var = j84Var3;
            i2 = i9;
            scrollCaptureSession = scrollCaptureSessionM16198h2;
        } else {
            if (i8 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4892d;
            i3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4891c;
            j84Var2 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4890b;
            scrollCaptureSessionM16198h = AbstractC3298lh.m16198h(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4889a);
            AbstractC3193b.m15359b(obj);
        }
        iM1833b = scrollCaptureCallbackC0417a.f4912f.m1833b(i3);
        iM1833b2 = scrollCaptureCallbackC0417a.f4912f.m1833b(i4);
        i5 = j84Var2.f45185a;
        i6 = j84Var2.f45187c;
        if (iM1833b == iM1833b2) {
            return j84.f45184e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionM16198h.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM1833b);
            j84 j84Var4 = scrollCaptureCallbackC0417a.f4908b;
            canvasLockHardwareCanvas.translate(-j84Var4.f45185a, -j84Var4.f45186b);
            scrollCaptureCallbackC0417a.f4910d.getRootView().draw(canvasLockHardwareCanvas);
            int iM21693T = ss5.m21693T(scrollCaptureCallbackC0417a.f4912f.m1832a());
            return new j84(i5, iM1833b + iM21693T, i6, iM1833b2 + iM21693T);
        } finally {
            scrollCaptureSessionM16198h.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4889a = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4890b = j84Var;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4891c = i;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4892d = i2;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.f4895g = 2;
        if (b34.m3250q(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getContext()).mo1250e(ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.f4896b, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutineSingletons) {
            scrollCaptureSessionM16198h = scrollCaptureSession;
            j84Var2 = j84Var;
            i3 = i;
            i4 = i2;
            iM1833b = scrollCaptureCallbackC0417a.f4912f.m1833b(i3);
            iM1833b2 = scrollCaptureCallbackC0417a.f4912f.m1833b(i4);
            i5 = j84Var2.f45185a;
            i6 = j84Var2.f45187c;
            if (iM1833b == iM1833b2) {
                return j84.f45184e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionM16198h.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iM1833b);
            j84 j84Var5 = scrollCaptureCallbackC0417a.f4908b;
            canvasLockHardwareCanvas.translate(-j84Var5.f45185a, -j84Var5.f45186b);
            scrollCaptureCallbackC0417a.f4910d.getRootView().draw(canvasLockHardwareCanvas);
            int iM21693T2 = ss5.m21693T(scrollCaptureCallbackC0417a.f4912f.m1832a());
            return new j84(i5, iM1833b + iM21693T2, i6, iM1833b2 + iM21693T2);
        }
        return coroutineSingletons;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        wfb.m23926u(this.f4911e, wl6.f67013b, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        AbstractC0418b.m1829a(this.f4911e, cancellationSignal, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(bna.m3980v0(this.f4908b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f4912f.m1834c();
        ((xc9) this.f4909c.f4916a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
