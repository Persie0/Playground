package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhr implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    private final Dialog f40539a;

    /* JADX INFO: renamed from: b */
    private final int f40540b;

    /* JADX INFO: renamed from: c */
    private final int f40541c;

    public mhr(Dialog dialog, Rect rect) {
        this.f40539a = dialog;
        this.f40540b = rect.left;
        this.f40541c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f40540b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f40541c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f40539a.onTouchEvent(motionEventObtain);
    }
}
