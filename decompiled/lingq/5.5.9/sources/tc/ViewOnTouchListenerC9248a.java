package tc;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: tc.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC9248a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f47936a;

    /* JADX INFO: renamed from: b */
    public final int f47937b;

    /* JADX INFO: renamed from: c */
    public final int f47938c;

    /* JADX INFO: renamed from: d */
    public final int f47939d;

    public ViewOnTouchListenerC9248a(Dialog dialog, Rect rect) {
        this.f47936a = dialog;
        this.f47937b = rect.left;
        this.f47938c = rect.top;
        this.f47939d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f47937b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f47938c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f47939d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f47936a.onTouchEvent(motionEventObtain);
    }
}
