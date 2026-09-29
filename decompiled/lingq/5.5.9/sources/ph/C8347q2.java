package ph;

import ae.C0062b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8347q2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ImageView f45169a;

    /* JADX INFO: renamed from: b */
    public final TextView f45170b;

    /* JADX INFO: renamed from: c */
    public final TextView f45171c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f45172d;

    /* JADX INFO: renamed from: e */
    public final View f45173e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f45174f;

    public /* synthetic */ C8347q2(ViewGroup viewGroup, ImageView imageView, View view, TextView textView, TextView textView2, ViewGroup viewGroup2) {
        this.f45172d = viewGroup;
        this.f45169a = imageView;
        this.f45173e = view;
        this.f45170b = textView;
        this.f45171c = textView2;
        this.f45174f = viewGroup2;
    }

    /* JADX INFO: renamed from: a */
    public static C8347q2 m16410a(View view) {
        int i10 = R.id.iv_lesson;
        ImageView imageView = (ImageView) C0062b.m298P0(view, R.id.iv_lesson);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i10 = R.id.tv_course_title;
            TextView textView = (TextView) C0062b.m298P0(view, R.id.tv_course_title);
            if (textView != null) {
                i10 = R.id.tv_lesson_title;
                TextView textView2 = (TextView) C0062b.m298P0(view, R.id.tv_lesson_title);
                if (textView2 != null) {
                    i10 = R.id.view_content;
                    LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(view, R.id.view_content);
                    if (linearLayout != null) {
                        return new C8347q2(relativeLayout, imageView, relativeLayout, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
