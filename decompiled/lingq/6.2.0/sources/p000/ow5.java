package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ow5 extends FrameLayout implements b51 {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f55069a;

    /* JADX WARN: Multi-variable type inference failed */
    public ow5(View view) {
        super(view.getContext());
        this.f55069a = (CollapsibleActionView) view;
        addView(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m18534a() {
        this.f55069a.onActionViewCollapsed();
    }

    /* JADX INFO: renamed from: b */
    public final void m18535b() {
        this.f55069a.onActionViewExpanded();
    }
}
