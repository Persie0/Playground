package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8382x2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45463a;

    /* JADX INFO: renamed from: b */
    public final View f45464b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f45465c;

    /* JADX INFO: renamed from: d */
    public final View f45466d;

    /* JADX INFO: renamed from: e */
    public final View f45467e;

    public /* synthetic */ C8382x2(ViewGroup viewGroup, View view, View view2, View view3, int i10) {
        this.f45463a = i10;
        this.f45465c = viewGroup;
        this.f45466d = view;
        this.f45464b = view2;
        this.f45467e = view3;
    }

    public C8382x2(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView) {
        this.f45463a = 1;
        this.f45465c = relativeLayout;
        this.f45466d = imageView;
        this.f45467e = relativeLayout2;
        this.f45464b = textView;
    }

    public C8382x2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.f45463a = 0;
        this.f45465c = constraintLayout;
        this.f45464b = textView;
        this.f45467e = textView2;
        this.f45466d = constraintLayout2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final RelativeLayout m16418a() {
        int i10 = this.f45463a;
        ViewGroup viewGroup = this.f45465c;
        switch (i10) {
            case 1:
                break;
            case 2:
            default:
                break;
            case 3:
                break;
        }
        return (RelativeLayout) viewGroup;
    }
}
