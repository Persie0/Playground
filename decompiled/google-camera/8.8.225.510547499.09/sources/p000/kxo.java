package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;
import com.google.android.libraries.memorymonitor.MemoryMonitorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxo extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f37661d = 0;

    /* JADX INFO: renamed from: a */
    public float f37662a;

    /* JADX INFO: renamed from: b */
    public float f37663b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MemoryMonitorView f37664c;

    /* JADX INFO: renamed from: e */
    private Toast f37665e;

    /* JADX INFO: renamed from: f */
    private float f37666f;

    public kxo(MemoryMonitorView memoryMonitorView) {
        this.f37664c = memoryMonitorView;
    }

    /* JADX INFO: renamed from: a */
    public final void m15035a(String str, Object... objArr) {
        Toast toast = this.f37665e;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(this.f37664c.getContext(), String.format(str, objArr), 1);
        this.f37665e = toastMakeText;
        toastMakeText.show();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        float fM15034a = kxm.m15034a();
        this.f37662a = fM15034a;
        this.f37663b = fM15034a;
        this.f37666f = fM15034a - (MemoryMonitorView.m4700b(this.f37664c.f7934f.f37657c) / MemoryMonitorView.f7928a);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3 = this.f37663b + (f2 / this.f37664c.f7933e);
        this.f37663b = f3;
        float fMax = Math.max(this.f37666f, Math.min(f3, 1.0f));
        this.f37663b = fMax;
        m15035a("Target heap usage: %.2f%% (%.2f MB)", Float.valueOf(fMax * 100.0f), Float.valueOf(this.f37663b * MemoryMonitorView.f7928a));
        return true;
    }
}
