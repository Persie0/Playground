package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ixx extends AbstractC0806ls implements View.OnGenericMotionListener, View.OnTouchListener {
    public ixx() {
        new C0167es();
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        motionEvent.getAxisValue(26);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
