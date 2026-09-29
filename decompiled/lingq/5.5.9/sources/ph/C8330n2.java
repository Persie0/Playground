package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8330n2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final View f45085a;

    /* JADX INFO: renamed from: b */
    public final View f45086b;

    public /* synthetic */ C8330n2(View view, View view2) {
        this.f45085a = view;
        this.f45086b = view2;
    }

    /* JADX INFO: renamed from: a */
    public static C8330n2 m16406a(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_header_home_search, (ViewGroup) recyclerView, false);
        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewInflate, R.id.et_search);
        if (textInputEditText != null) {
            return new C8330n2((TextInputLayout) viewInflate, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.et_search)));
    }

    /* JADX INFO: renamed from: b */
    public static C8330n2 m16407b(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_header_generic_small_title, (ViewGroup) recyclerView, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        return new C8330n2(textView, textView);
    }
}
