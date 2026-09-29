package ph;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import p473x4.InterfaceC10075a;

/* JADX INFO: renamed from: ph.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C8362t2 implements InterfaceC10075a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45284a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f45285b;

    /* JADX INFO: renamed from: c */
    public final View f45286c;

    /* JADX INFO: renamed from: d */
    public final View f45287d;

    public /* synthetic */ C8362t2(ViewGroup viewGroup, View view, View view2, int i10) {
        this.f45284a = i10;
        this.f45285b = viewGroup;
        this.f45286c = view;
        this.f45287d = view2;
    }

    public C8362t2(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.f45284a = 5;
        this.f45286c = constraintLayout;
        this.f45287d = textInputEditText;
        this.f45285b = textInputLayout;
    }

    public C8362t2(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2) {
        this.f45284a = 0;
        this.f45285b = textInputLayout;
        this.f45287d = textInputEditText;
        this.f45286c = textInputLayout2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static C8362t2 m16411d(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_sentence_edit, (ViewGroup) recyclerView, false);
        int i10 = R.id.etSentence;
        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewInflate, R.id.etSentence);
        if (textInputEditText != null) {
            i10 = R.id.textInput;
            TextInputLayout textInputLayout = (TextInputLayout) C0062b.m298P0(viewInflate, R.id.textInput);
            if (textInputLayout != null) {
                return new C8362t2((ConstraintLayout) viewInflate, textInputEditText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX INFO: renamed from: a */
    public final LinearLayout m16412a() {
        int i10 = this.f45284a;
        ViewGroup viewGroup = this.f45285b;
        switch (i10) {
            case 3:
                break;
            default:
                break;
        }
        return (LinearLayout) viewGroup;
    }

    /* JADX INFO: renamed from: b */
    public final RelativeLayout m16413b() {
        int i10 = this.f45284a;
        ViewGroup viewGroup = this.f45285b;
        switch (i10) {
            case 2:
                break;
            default:
                break;
        }
        return (RelativeLayout) viewGroup;
    }

    /* JADX INFO: renamed from: c */
    public final ConstraintLayout m16414c() {
        switch (this.f45284a) {
            case 1:
                return (ConstraintLayout) this.f45285b;
            default:
                return (ConstraintLayout) this.f45286c;
        }
    }
}
