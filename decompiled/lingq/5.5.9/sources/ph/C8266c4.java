package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lingq.commons.p053ui.views.LineGraph;
import com.lingq.p055ui.review.views.speaking.MatchTextView;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8266c4 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f44649a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f44650b;

    /* JADX INFO: renamed from: c */
    public final View f44651c;

    /* JADX INFO: renamed from: d */
    public final View f44652d;

    /* JADX INFO: renamed from: e */
    public final View f44653e;

    /* JADX INFO: renamed from: f */
    public final View f44654f;

    public C8266c4(LinearLayout linearLayout, MaterialButton materialButton, ImageButton imageButton, MatchTextView matchTextView, TextView textView, TextView textView2) {
        this.f44650b = linearLayout;
        this.f44651c = materialButton;
        this.f44652d = imageButton;
        this.f44653e = matchTextView;
        this.f44649a = textView;
        this.f44654f = textView2;
    }

    public C8266c4(MaterialCardView materialCardView, LineGraph lineGraph, ShimmerFrameLayout shimmerFrameLayout, LineGraph lineGraph2, ShimmerFrameLayout shimmerFrameLayout2, TextView textView) {
        this.f44650b = materialCardView;
        this.f44651c = lineGraph;
        this.f44653e = shimmerFrameLayout;
        this.f44652d = lineGraph2;
        this.f44654f = shimmerFrameLayout2;
        this.f44649a = textView;
    }
}
