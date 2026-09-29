package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8353r3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f45206a;

    /* JADX INFO: renamed from: b */
    public final TextView f45207b;

    /* JADX INFO: renamed from: c */
    public final TextView f45208c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f45209d;

    /* JADX INFO: renamed from: e */
    public final View f45210e;

    public C8353r3(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, TextView textView2, TextView textView3) {
        this.f45209d = relativeLayout;
        this.f45206a = textView;
        this.f45210e = relativeLayout2;
        this.f45207b = textView2;
        this.f45208c = textView3;
    }

    public C8353r3(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, TextView textView2, TextView textView3) {
        this.f45209d = constraintLayout;
        this.f45210e = imageButton;
        this.f45206a = textView;
        this.f45207b = textView2;
        this.f45208c = textView3;
    }
}
