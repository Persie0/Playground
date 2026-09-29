package ph;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8295h3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44851a = 0;

    /* JADX INFO: renamed from: b */
    public final TextView f44852b;

    /* JADX INFO: renamed from: c */
    public final TextView f44853c;

    /* JADX INFO: renamed from: d */
    public final TextView f44854d;

    /* JADX INFO: renamed from: e */
    public final View f44855e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f44856f;

    /* JADX INFO: renamed from: g */
    public final View f44857g;

    /* JADX INFO: renamed from: h */
    public final View f44858h;

    /* JADX INFO: renamed from: i */
    public final View f44859i;

    /* JADX INFO: renamed from: j */
    public final View f44860j;

    /* JADX INFO: renamed from: k */
    public final View f44861k;

    /* JADX INFO: renamed from: l */
    public final View f44862l;

    /* JADX INFO: renamed from: m */
    public final View f44863m;

    /* JADX INFO: renamed from: n */
    public final View f44864n;

    /* JADX INFO: renamed from: o */
    public final View f44865o;

    public C8295h3(FrameLayout frameLayout, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, MaterialCardView materialCardView2, MaterialCardView materialCardView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, RelativeLayout relativeLayout, FrameLayout frameLayout2, MaterialButton materialButton, MaterialButton materialButton2) {
        this.f44856f = frameLayout;
        this.f44858h = materialCardView;
        this.f44861k = imageView;
        this.f44862l = imageView2;
        this.f44859i = materialCardView2;
        this.f44860j = materialCardView3;
        this.f44852b = textView;
        this.f44853c = textView2;
        this.f44854d = textView3;
        this.f44855e = textView4;
        this.f44863m = relativeLayout;
        this.f44857g = frameLayout2;
        this.f44864n = materialButton;
        this.f44865o = materialButton2;
    }

    public C8295h3(ConstraintLayout constraintLayout, TextView textView, ImageButton imageButton, ImageButton imageButton2, TextView textView2, TextView textView3, TextView textView4, Guideline guideline, ImageButton imageButton3, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView5, TextView textView6, TextView textView7) {
        this.f44856f = constraintLayout;
        this.f44852b = textView;
        this.f44857g = imageButton;
        this.f44858h = imageButton2;
        this.f44853c = textView2;
        this.f44854d = textView3;
        this.f44855e = textView4;
        this.f44859i = guideline;
        this.f44860j = imageButton3;
        this.f44861k = linearLayout;
        this.f44862l = recyclerView;
        this.f44863m = textView5;
        this.f44864n = textView6;
        this.f44865o = textView7;
    }
}
