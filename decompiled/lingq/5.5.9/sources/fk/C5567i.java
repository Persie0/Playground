package fk;

import android.text.Editable;
import android.text.TextWatcher;
import com.lingq.p055ui.token.TokenFragment;
import dm.C5207g;
import km.InterfaceC6727j;

/* JADX INFO: renamed from: fk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5567i implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TokenFragment f34365a;

    public C5567i(TokenFragment tokenFragment) {
        this.f34365a = tokenFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C5207g.m11111f(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C5207g.m11111f(charSequence, "charSequence");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C5207g.m11111f(charSequence, "charSequence");
        InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
        this.f34365a.m10363o0().m10378r2(charSequence.toString());
    }
}
