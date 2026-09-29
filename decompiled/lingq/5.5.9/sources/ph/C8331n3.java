package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.n3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8331n3 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f45087a;

    /* JADX INFO: renamed from: b */
    public final View f45088b;

    /* JADX INFO: renamed from: c */
    public final View f45089c;

    /* JADX INFO: renamed from: d */
    public final View f45090d;

    public /* synthetic */ C8331n3(ViewGroup viewGroup, View view, View view2, View view3) {
        this.f45087a = viewGroup;
        this.f45088b = view;
        this.f45089c = view2;
        this.f45090d = view3;
    }

    public C8331n3(LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2) {
        this.f45087a = linearLayout;
        this.f45090d = textView;
        this.f45088b = textView2;
        this.f45089c = linearLayout2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C8331n3 m16408a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_filter_selection, (ViewGroup) recyclerView, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i10 = R.id.isSelected;
        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.isSelected);
        if (imageView != null) {
            i10 = R.id.tvFilter;
            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvFilter);
            if (textView != null) {
                return new C8331n3(constraintLayout, constraintLayout, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
