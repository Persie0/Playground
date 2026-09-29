package ph;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8357s2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f45251a;

    /* JADX INFO: renamed from: b */
    public final TextView f45252b;

    /* JADX INFO: renamed from: c */
    public final TextView f45253c;

    /* JADX INFO: renamed from: d */
    public final ImageView f45254d;

    /* JADX INFO: renamed from: e */
    public final View f45255e;

    /* JADX INFO: renamed from: f */
    public final View f45256f;

    public C8357s2(ConstraintLayout constraintLayout, ImageButton imageButton, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.f45251a = constraintLayout;
        this.f45254d = imageButton;
        this.f45252b = textView;
        this.f45253c = textView2;
        this.f45255e = constraintLayout2;
        this.f45256f = constraintLayout3;
    }

    public C8357s2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f45251a = constraintLayout;
        this.f45254d = imageView;
        this.f45255e = imageView2;
        this.f45252b = textView;
        this.f45253c = textView2;
        this.f45256f = textView3;
    }
}
