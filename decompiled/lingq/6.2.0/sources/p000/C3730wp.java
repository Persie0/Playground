package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: wp */
/* JADX INFO: loaded from: classes2.dex */
public final class C3730wp extends ContentFrameLayout {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C3804yp f67146i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3730wp(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp, wl1 wl1Var) {
        super(wl1Var);
        this.f67146i = layoutInflaterFactory2C3804yp;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f67146i.m25234t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f67146i;
                layoutInflaterFactory2C3804yp.m25233q(layoutInflaterFactory2C3804yp.m25238x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(bna.m3932U(getContext(), i));
    }
}
