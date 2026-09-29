package p204jj;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter;
import ph.C8383x3;

/* JADX INFO: renamed from: jj.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C6500u implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentenceEditPageAdapter.InterfaceC4293d f37111a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8383x3 f37112b;

    public C6500u(SentenceEditPageAdapter.InterfaceC4293d interfaceC4293d, C8383x3 c8383x3) {
        this.f37111a = interfaceC4293d;
        this.f37112b = c8383x3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String string;
        Editable text = ((TextInputEditText) this.f37112b.f45469b).getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        this.f37111a.mo10168c(string);
    }
}
