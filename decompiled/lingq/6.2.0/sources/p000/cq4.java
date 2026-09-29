package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class cq4 implements nsa {

    /* JADX INFO: renamed from: a */
    public final TextView f34377a;

    /* JADX INFO: renamed from: b */
    public final TextView f34378b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f34379c;

    /* JADX INFO: renamed from: d */
    public final View f34380d;

    /* JADX INFO: renamed from: e */
    public final ImageView f34381e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f34382f;

    public cq4(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, TextView textView2, LinearLayout linearLayout) {
        this.f34379c = relativeLayout;
        this.f34381e = imageView;
        this.f34380d = relativeLayout2;
        this.f34377a = textView;
        this.f34378b = textView2;
        this.f34382f = linearLayout;
    }

    /* JADX INFO: renamed from: a */
    public static cq4 m9848a(View view) {
        int i = R$id.iv_lesson;
        ImageView imageView = (ImageView) lfa.m16159c(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R$id.tv_course_title;
            TextView textView = (TextView) lfa.m16159c(view, i);
            if (textView != null) {
                i = R$id.tv_lesson_title;
                TextView textView2 = (TextView) lfa.m16159c(view, i);
                if (textView2 != null) {
                    i = R$id.view_content;
                    LinearLayout linearLayout = (LinearLayout) lfa.m16159c(view, i);
                    if (linearLayout != null) {
                        return new cq4(relativeLayout, imageView, relativeLayout, textView, textView2, linearLayout);
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public cq4(ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.f34379c = constraintLayout;
        this.f34380d = imageButton;
        this.f34381e = imageButton2;
        this.f34377a = textView;
        this.f34378b = textView2;
        this.f34382f = constraintLayout2;
    }
}
