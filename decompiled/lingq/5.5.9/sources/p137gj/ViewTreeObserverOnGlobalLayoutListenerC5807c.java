package p137gj;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import dm.C5207g;
import ph.C8328n0;

/* JADX INFO: renamed from: gj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5807c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f35084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8328n0 f35085b;

    public ViewTreeObserverOnGlobalLayoutListenerC5807c(TextView textView, C8328n0 c8328n0) {
        this.f35084a = textView;
        this.f35085b = c8328n0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f35084a;
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C8328n0 c8328n0 = this.f35085b;
        TextView textView = c8328n0.f45066j;
        C5207g.m11110e(textView, "btnShowAll");
        int i10 = 0;
        if (!Boolean.valueOf(c8328n0.f45075s.getLineCount() > 4).booleanValue()) {
            i10 = 4;
        }
        textView.setVisibility(i10);
    }
}
