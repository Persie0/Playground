package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8392z2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final TextView f45505a;

    /* JADX INFO: renamed from: b */
    public final TextView f45506b;

    public /* synthetic */ C8392z2(TextView textView, TextView textView2, int i10) {
        this.f45505a = textView;
        this.f45506b = textView2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C8392z2 m16420a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        int i10 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.list_header_generic_title, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        return new C8392z2(textView, textView, i10);
    }
}
