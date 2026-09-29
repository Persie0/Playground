package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8367u2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f45315a;

    /* JADX INFO: renamed from: b */
    public final TextView f45316b;

    public /* synthetic */ C8367u2(TextView textView, TextView textView2, int i10) {
        this.f45315a = textView;
        this.f45316b = textView2;
    }

    /* JADX INFO: renamed from: a */
    public static C8367u2 m16416a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_generic_label, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        return new C8367u2(textView, textView, 2);
    }
}
