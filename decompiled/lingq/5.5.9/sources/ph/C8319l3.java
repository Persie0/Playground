package ph;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.l3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8319l3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f45010a;

    /* JADX INFO: renamed from: b */
    public final ImageView f45011b;

    /* JADX INFO: renamed from: c */
    public final ImageView f45012c;

    /* JADX INFO: renamed from: d */
    public final TextView f45013d;

    /* JADX INFO: renamed from: e */
    public final View f45014e;

    public C8319l3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f45010a = constraintLayout;
        this.f45011b = imageView;
        this.f45012c = imageView2;
        this.f45013d = textView;
        this.f45014e = textView2;
    }

    public C8319l3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearProgressIndicator linearProgressIndicator, TextView textView) {
        this.f45010a = constraintLayout;
        this.f45011b = imageView;
        this.f45012c = imageView2;
        this.f45014e = linearProgressIndicator;
        this.f45013d = textView;
    }
}
