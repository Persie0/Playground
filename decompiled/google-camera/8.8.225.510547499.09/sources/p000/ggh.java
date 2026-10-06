package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggh extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ OptionsMenuView f24671a;

    /* JADX INFO: renamed from: b */
    private boolean f24672b;

    public ggh(OptionsMenuView optionsMenuView) {
        this.f24671a = optionsMenuView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        OptionsMenuView optionsMenuView = this.f24671a;
        this.f24672b = optionsMenuView.getChildAt(optionsMenuView.getChildCount() + (-1)).getBottom() - (optionsMenuView.getHeight() + optionsMenuView.getScrollY()) == 0;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r3.getHeight() < ((r3.findViewById(com.google.android.apps.camera.bottombar.C0100R.id.options_menu_internal_list).getHeight() + r3.getPaddingTop()) + r3.getPaddingBottom())) goto L24;
     */
    /* JADX WARN: Type inference failed for: r3v11, types: [gfa, java.lang.Object] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x;
        float fAbs;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        ilk ilkVar = ilk.PORTRAIT;
        switch (this.f24671a.f6845e.ordinal()) {
            case 1:
                x = motionEvent.getX() - motionEvent2.getX();
                fAbs = Math.abs(f);
                break;
            case 2:
                x = motionEvent2.getX() - motionEvent.getX();
                fAbs = Math.abs(f);
                break;
            default:
                x = motionEvent.getY() - motionEvent2.getY();
                fAbs = Math.abs(f2);
                break;
        }
        if (x > 80.0f && fAbs > 300.0f) {
            if (ilk.PORTRAIT.equals(this.f24671a.f6845e) && !this.f24672b) {
                OptionsMenuView optionsMenuView = this.f24671a;
            }
            this.f24672b = false;
            this.f24671a.f6848h.f1702a.mo9113M();
            return true;
        }
        return false;
    }
}
