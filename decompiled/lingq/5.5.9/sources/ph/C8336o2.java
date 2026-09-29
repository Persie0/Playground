package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8336o2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final View f45111a;

    public /* synthetic */ C8336o2(View view) {
        this.f45111a = view;
    }

    /* JADX INFO: renamed from: a */
    public static C8336o2 m16409a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_divider, (ViewGroup) recyclerView, false);
        if (viewInflate != null) {
            return new C8336o2(viewInflate);
        }
        throw new NullPointerException("rootView");
    }
}
