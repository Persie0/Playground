package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.d4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8272d4 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f44675a;

    /* JADX INFO: renamed from: b */
    public final ImageButton f44676b;

    /* JADX INFO: renamed from: c */
    public final LinearProgressIndicator f44677c;

    /* JADX INFO: renamed from: d */
    public final TextView f44678d;

    /* JADX INFO: renamed from: e */
    public final TextView f44679e;

    /* JADX INFO: renamed from: f */
    public final TextView f44680f;

    /* JADX INFO: renamed from: g */
    public final TextView f44681g;

    public C8272d4(ConstraintLayout constraintLayout, ImageButton imageButton, LinearProgressIndicator linearProgressIndicator, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f44675a = constraintLayout;
        this.f44676b = imageButton;
        this.f44677c = linearProgressIndicator;
        this.f44678d = textView;
        this.f44679e = textView2;
        this.f44680f = textView3;
        this.f44681g = textView4;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C8272d4 m16402a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_stats_detail, (ViewGroup) recyclerView, false);
        int i10 = R.id.btnAddActivity;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnAddActivity);
        if (imageButton != null) {
            i10 = R.id.lpiActivityProgress;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C0062b.m298P0(viewInflate, R.id.lpiActivityProgress);
            if (linearProgressIndicator != null) {
                i10 = R.id.tvDivider;
                TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvDivider);
                if (textView != null) {
                    i10 = R.id.tvGoal;
                    TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvGoal);
                    if (textView2 != null) {
                        i10 = R.id.tvProgress;
                        TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvProgress);
                        if (textView3 != null) {
                            i10 = R.id.tvStat;
                            TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.tvStat);
                            if (textView4 != null) {
                                return new C8272d4((ConstraintLayout) viewInflate, imageButton, linearProgressIndicator, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
