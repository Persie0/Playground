package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class k64 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f46762a;

    /* JADX INFO: renamed from: b */
    public final int f46763b;

    /* JADX INFO: renamed from: c */
    public final int f46764c;

    public k64(Dialog dialog, Rect rect) {
        this.f46762a = dialog;
        this.f46763b = rect.left;
        this.f46764c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f46763b;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f46764c;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f46762a.onTouchEvent(motionEventObtain);
    }
}
