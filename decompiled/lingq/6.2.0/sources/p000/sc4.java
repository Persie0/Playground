package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class sc4 extends WebView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60669a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60669a = 2;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f60669a) {
            case 2:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        switch (this.f60669a) {
            case 1:
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                    return;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.f60669a) {
            case 2:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc4(Context context, int i) {
        super(context);
        this.f60669a = i;
    }
}
