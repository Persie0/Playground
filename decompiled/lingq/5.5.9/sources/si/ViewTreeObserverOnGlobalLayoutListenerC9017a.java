package si;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingq.util.C4924a;
import dm.C5207g;
import ph.C8352r2;

/* JADX INFO: renamed from: si.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC9017a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f47244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8352r2 f47245b;

    public ViewTreeObserverOnGlobalLayoutListenerC9017a(TextView textView, C8352r2 c8352r2) {
        this.f47244a = textView;
        this.f47245b = c8352r2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f47244a;
        if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C8352r2 c8352r2 = this.f47245b;
            int lineCount = c8352r2.f45197f.getLineCount();
            MaterialButton materialButton = c8352r2.f45193b;
            if (lineCount > 3 && c8352r2.f45197f.getMaxLines() == 3) {
                C5207g.m11110e(materialButton, "btnShowAll");
                C4924a.m10457e0(materialButton);
            } else {
                C5207g.m11110e(materialButton, "btnShowAll");
                C4924a.m10442U(materialButton);
            }
        }
    }
}
