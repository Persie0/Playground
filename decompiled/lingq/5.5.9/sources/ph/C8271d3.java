package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8271d3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44670a;

    /* JADX INFO: renamed from: b */
    public final View f44671b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f44672c;

    /* JADX INFO: renamed from: d */
    public final View f44673d;

    /* JADX INFO: renamed from: e */
    public final View f44674e;

    public /* synthetic */ C8271d3(ViewGroup viewGroup, View view, View view2, View view3, int i10) {
        this.f44670a = i10;
        this.f44672c = viewGroup;
        this.f44673d = view;
        this.f44674e = view2;
        this.f44671b = view3;
    }

    public /* synthetic */ C8271d3(ConstraintLayout constraintLayout, ViewGroup viewGroup, TextView textView, TextView textView2, int i10) {
        this.f44670a = i10;
        this.f44672c = constraintLayout;
        this.f44673d = viewGroup;
        this.f44671b = textView;
        this.f44674e = textView2;
    }

    public C8271d3(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f44670a = 4;
        this.f44672c = constraintLayout;
        this.f44674e = imageView;
        this.f44673d = imageView2;
        this.f44671b = textView;
    }

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout m16401a() {
        int i10 = this.f44670a;
        ViewGroup viewGroup = this.f44672c;
        switch (i10) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        return (ConstraintLayout) viewGroup;
    }
}
