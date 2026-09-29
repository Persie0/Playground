package p204jj;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter;
import ph.C8362t2;

/* JADX INFO: renamed from: jj.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C6502w implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SentenceEditPageAdapter.InterfaceC4293d f37115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f37116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8362t2 f37117c;

    public C6502w(SentenceEditPageAdapter.InterfaceC4293d interfaceC4293d, String str, C8362t2 c8362t2) {
        this.f37115a = interfaceC4293d;
        this.f37116b = str;
        this.f37117c = c8362t2;
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
        Editable text = ((TextInputEditText) this.f37117c.f45287d).getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        this.f37115a.mo10174i(this.f37116b, string);
    }
}
