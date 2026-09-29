package p048cj;

import android.text.Editable;
import android.text.TextWatcher;
import com.lingq.p055ui.home.search.SearchAdapter;

/* JADX INFO: renamed from: cj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C2028b implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchAdapter f10463a;

    public C2028b(SearchAdapter searchAdapter) {
        this.f10463a = searchAdapter;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f10463a.f25941e.mo10005a(String.valueOf(charSequence));
    }
}
