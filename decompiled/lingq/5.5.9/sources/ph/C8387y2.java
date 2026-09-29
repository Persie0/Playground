package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.y2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8387y2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f45479a;

    /* JADX INFO: renamed from: b */
    public final View f45480b;

    public /* synthetic */ C8387y2(ViewGroup viewGroup, View view) {
        this.f45479a = viewGroup;
        this.f45480b = view;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C8387y2 m16419a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_library_list, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewInflate;
        return new C8387y2(recyclerView2, recyclerView2);
    }
}
