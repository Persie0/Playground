package p000;

import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0176fa extends ContentFrameLayout {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f21098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176fa(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, Context context) {
        super(context);
        this.f21098a = layoutInflaterFactory2C0179fd;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f21098a.m8239F(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f21098a;
                layoutInflaterFactory2C0179fd.m8258y(layoutInflaterFactory2C0179fd.m8246M(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0194fs.m8752a(getContext(), i));
    }
}
