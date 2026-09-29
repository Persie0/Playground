package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8324m2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45027a = 0;

    /* JADX INFO: renamed from: b */
    public final View f45028b;

    /* JADX INFO: renamed from: c */
    public final View f45029c;

    /* JADX INFO: renamed from: d */
    public final View f45030d;

    /* JADX INFO: renamed from: e */
    public final View f45031e;

    /* JADX INFO: renamed from: f */
    public final View f45032f;

    public C8324m2(LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f45029c = linearLayout;
        this.f45028b = imageView;
        this.f45032f = relativeLayout;
        this.f45030d = linearLayout2;
        this.f45031e = linearLayout3;
    }

    public C8324m2(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, ImageView imageView, TextView textView) {
        this.f45032f = relativeLayout;
        this.f45029c = imageButton;
        this.f45030d = imageButton2;
        this.f45028b = imageView;
        this.f45031e = textView;
    }

    public C8324m2(RelativeLayout relativeLayout, ImageButton imageButton, ImageView imageView, TextView textView, RelativeLayout relativeLayout2) {
        this.f45032f = relativeLayout;
        this.f45029c = imageButton;
        this.f45028b = imageView;
        this.f45030d = textView;
        this.f45031e = relativeLayout2;
    }

    public C8324m2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.f45029c = constraintLayout;
        this.f45028b = imageView;
        this.f45030d = imageView2;
        this.f45031e = imageView3;
        this.f45032f = textView;
    }

    public C8324m2(ConstraintLayout constraintLayout, Guideline guideline, AppCompatSpinner appCompatSpinner, TextView textView, LinearLayout linearLayout) {
        this.f45030d = constraintLayout;
        this.f45031e = guideline;
        this.f45028b = appCompatSpinner;
        this.f45032f = textView;
        this.f45029c = linearLayout;
    }

    public C8324m2(ConstraintLayout constraintLayout, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, ConstraintLayout constraintLayout2) {
        this.f45029c = constraintLayout;
        this.f45030d = shimmerFrameLayout;
        this.f45031e = shimmerFrameLayout2;
        this.f45028b = shimmerFrameLayout3;
        this.f45032f = constraintLayout2;
    }

    /* JADX INFO: renamed from: c */
    public static C8324m2 m16403c(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_overview_loading, (ViewGroup) recyclerView, false);
        int i10 = R.id.ivLesson;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewInflate, R.id.ivLesson);
        if (shimmerFrameLayout != null) {
            i10 = R.id.tvLessonDescription;
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate, R.id.tvLessonDescription);
            if (shimmerFrameLayout2 != null) {
                i10 = R.id.tvLessonTitle;
                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate, R.id.tvLessonTitle);
                if (shimmerFrameLayout3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    return new C8324m2(constraintLayout, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: a */
    public final RelativeLayout m16404a() {
        int i10 = this.f45027a;
        View view = this.f45032f;
        switch (i10) {
            case 3:
                break;
            default:
                break;
        }
        return (RelativeLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout m16405b() {
        int i10 = this.f45027a;
        View view = this.f45029c;
        switch (i10) {
            case 1:
                return (ConstraintLayout) view;
            case 2:
                return (ConstraintLayout) this.f45030d;
            default:
                return (ConstraintLayout) view;
        }
    }
}
