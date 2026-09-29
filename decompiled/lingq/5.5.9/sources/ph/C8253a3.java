package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8253a3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f44569a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f44570b;

    /* JADX INFO: renamed from: c */
    public final View f44571c;

    /* JADX INFO: renamed from: d */
    public final View f44572d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f44573e;

    public C8253a3(LinearLayout linearLayout, AppCompatSpinner appCompatSpinner, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f44570b = linearLayout;
        this.f44573e = appCompatSpinner;
        this.f44569a = textView;
        this.f44571c = linearLayout2;
        this.f44572d = linearLayout3;
    }

    public C8253a3(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, FrameLayout frameLayout) {
        this.f44570b = relativeLayout;
        this.f44571c = imageView;
        this.f44569a = textView;
        this.f44572d = textView2;
        this.f44573e = frameLayout;
    }
}
