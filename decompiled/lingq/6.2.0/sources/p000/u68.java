package p000;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class u68 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qn2 f63495a;

    public u68(qn2 qn2Var) {
        this.f63495a = qn2Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        qn2 qn2Var = this.f63495a;
        DialogInterfaceC0016ae dialogInterfaceC0016ae = (DialogInterfaceC0016ae) qn2Var.f57965d;
        if (dialogInterfaceC0016ae == null) {
            fa4.m11636J("alertDialog");
            throw null;
        }
        dialogInterfaceC0016ae.f530g.f69654i.setEnabled(!vk9.m23391n0(String.valueOf(charSequence)));
        qn2Var.f57968g = charSequence != null ? charSequence.toString() : null;
    }
}
