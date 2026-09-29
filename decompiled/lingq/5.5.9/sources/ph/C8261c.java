package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8261c implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f44629a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f44630b;

    /* JADX INFO: renamed from: c */
    public final View f44631c;

    /* JADX INFO: renamed from: d */
    public final View f44632d;

    /* JADX INFO: renamed from: e */
    public final View f44633e;

    public /* synthetic */ C8261c(ViewGroup viewGroup, View view, TextView textView, View view2, View view3) {
        this.f44630b = viewGroup;
        this.f44631c = view;
        this.f44629a = textView;
        this.f44632d = view2;
        this.f44633e = view3;
    }

    public C8261c(MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.f44631c = materialCardView;
        this.f44632d = materialCardView2;
        this.f44629a = textView;
        this.f44633e = textView2;
        this.f44630b = linearLayout;
    }
}
