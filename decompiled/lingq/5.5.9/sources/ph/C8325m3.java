package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8325m3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45033a = 1;

    /* JADX INFO: renamed from: b */
    public final View f45034b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f45035c;

    /* JADX INFO: renamed from: d */
    public final View f45036d;

    /* JADX INFO: renamed from: e */
    public final View f45037e;

    public C8325m3(LinearLayout linearLayout, ImageView imageView, View view, View view2) {
        this.f45035c = linearLayout;
        this.f45034b = imageView;
        this.f45036d = view;
        this.f45037e = view2;
    }

    public C8325m3(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2) {
        this.f45035c = constraintLayout;
        this.f45034b = imageView;
        this.f45037e = textView;
        this.f45036d = constraintLayout2;
    }

    public C8325m3(ConstraintLayout constraintLayout, SwitchMaterial switchMaterial, TextView textView, TextView textView2) {
        this.f45035c = constraintLayout;
        this.f45036d = switchMaterial;
        this.f45037e = textView;
        this.f45034b = textView2;
    }
}
