package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes2.dex */
public final class cg5 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10016b;

    public /* synthetic */ cg5(Object obj, int i) {
        this.f10015a = i;
        this.f10016b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f10015a;
        Object obj = this.f10016b;
        switch (i) {
            case 0:
                dg5 dg5Var = (dg5) obj;
                zf5 zf5Var = dg5Var.f35599M;
                Handler handler = dg5Var.f35603Q;
                C3120iq c3120iq = dg5Var.f35607U;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c3120iq != null && c3120iq.isShowing() && x >= 0 && x < c3120iq.getWidth() && y >= 0 && y < c3120iq.getHeight()) {
                    handler.postDelayed(zf5Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(zf5Var);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
