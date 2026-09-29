package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingq.feature.review.views.speaking.MatchTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class if5 implements nsa {

    /* JADX INFO: renamed from: a */
    public final ImageButton f44045a;

    /* JADX INFO: renamed from: b */
    public final TextView f44046b;

    /* JADX INFO: renamed from: c */
    public final View f44047c;

    /* JADX INFO: renamed from: d */
    public final View f44048d;

    /* JADX INFO: renamed from: e */
    public final View f44049e;

    public if5(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, TextView textView) {
        this.f44047c = relativeLayout;
        this.f44045a = imageButton;
        this.f44048d = imageButton2;
        this.f44049e = imageView;
        this.f44046b = textView;
    }

    public if5(MaterialButton materialButton, ImageButton imageButton, MatchTextView matchTextView, TextView textView, TextView textView2) {
        this.f44047c = materialButton;
        this.f44045a = imageButton;
        this.f44048d = matchTextView;
        this.f44046b = textView;
        this.f44049e = textView2;
    }
}
