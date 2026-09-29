package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ff5 implements nsa {

    /* JADX INFO: renamed from: a */
    public final View f38995a;

    /* JADX INFO: renamed from: b */
    public final View f38996b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f38997c;

    /* JADX INFO: renamed from: d */
    public final View f38998d;

    public /* synthetic */ ff5(ViewGroup viewGroup, View view, View view2, View view3) {
        this.f38997c = viewGroup;
        this.f38995a = view;
        this.f38998d = view2;
        this.f38996b = view3;
    }

    public ff5(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, TextView textView2) {
        this.f38997c = constraintLayout;
        this.f38995a = imageButton;
        this.f38996b = textView;
        this.f38998d = textView2;
    }
}
