package p000;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ggc implements View.OnTouchListener {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f24646d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ggc f24645c = new ggc(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ggc f24644b = new ggc(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ggc f24643a = new ggc(0);

    public /* synthetic */ ggc(int i) {
        this.f24646d = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f24646d) {
            case 0:
                if (motionEvent.getAction() == 0) {
                    view.animate().scaleX(1.1f).scaleY(1.1f);
                } else if (motionEvent.getAction() == 1) {
                    view.animate().scaleX(1.0f).scaleY(1.0f);
                }
                return false;
            case 1:
                return view.getVisibility() == 0;
            case 2:
                return false;
            default:
                return true;
        }
    }
}
