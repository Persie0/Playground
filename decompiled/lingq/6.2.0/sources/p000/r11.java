package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* JADX INFO: loaded from: classes2.dex */
public final class r11 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f58481b;

    public /* synthetic */ r11(ViewGroup viewGroup, int i) {
        this.f58480a = i;
        this.f58481b = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final void m20242a(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f58480a;
        ViewGroup viewGroup = this.f58481b;
        switch (i) {
            case 0:
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) viewGroup;
                if (!TextUtils.isEmpty(editable)) {
                    String strM6249a = ChipTextInputComboView.m6249a(chipTextInputComboView, editable);
                    if (TextUtils.isEmpty(strM6249a)) {
                        strM6249a = ChipTextInputComboView.m6249a(chipTextInputComboView, "00");
                    }
                    chipTextInputComboView.f13321d = strM6249a;
                } else {
                    chipTextInputComboView.f13321d = ChipTextInputComboView.m6249a(chipTextInputComboView, "00");
                }
                break;
            default:
                ((is2) viewGroup).m14114b().mo14630a();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f58480a) {
            case 1:
                ((is2) this.f58481b).m14114b().mo3301b();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
