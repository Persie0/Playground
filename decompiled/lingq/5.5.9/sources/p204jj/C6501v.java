package p204jj;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter;
import ph.C8362t2;

/* JADX INFO: renamed from: jj.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C6501v implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentenceEditPageAdapter.InterfaceC4293d f37113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8362t2 f37114b;

    public C6501v(SentenceEditPageAdapter.InterfaceC4293d interfaceC4293d, C8362t2 c8362t2) {
        this.f37113a = interfaceC4293d;
        this.f37114b = c8362t2;
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
        Editable text = ((TextInputEditText) this.f37114b.f45287d).getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        this.f37113a.mo10170e(string);
    }
}
