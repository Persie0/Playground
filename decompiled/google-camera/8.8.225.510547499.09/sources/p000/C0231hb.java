package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: hb */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0231hb extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final CollapsibleActionView f27115a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0231hb(View view) {
        super(view.getContext());
        this.f27115a = (CollapsibleActionView) view;
        addView(view);
    }
}
