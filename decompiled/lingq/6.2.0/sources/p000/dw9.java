package p000;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class dw9 extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f36335d;

    public dw9(TextInputLayout textInputLayout) {
        this.f36335d = textInputLayout;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        this.f44987a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f36335d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f13264Q0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            y34 y34Var = textInputLayout.f13298k;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (y34Var.f69228o == 2 && y34Var.f69238y != null && !TextUtils.isEmpty(y34Var.f69236w)) {
                if (TextUtils.isEmpty(string)) {
                    string = helperText.toString();
                } else {
                    string = string + ", " + ((Object) helperText);
                }
            }
        }
        ug9 ug9Var = textInputLayout.f13280b;
        C3048gr c3048gr = ug9Var.f63899b;
        if (c3048gr.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c3048gr);
            accessibilityNodeInfo.setTraversalAfter(c3048gr);
        } else {
            accessibilityNodeInfo.setTraversalAfter(ug9Var.f63901d);
        }
        if (!zIsEmpty) {
            c0797b4.m3284o(text);
        } else if (!TextUtils.isEmpty(string)) {
            c0797b4.m3284o(string);
            if (!z && placeholderText != null) {
                c0797b4.m3284o(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c0797b4.m3284o(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            accessibilityNodeInfo.setError(!zIsEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.f13282c.m14114b().mo14635m(c0797b4);
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: e */
    public final void mo10704e(View view, AccessibilityEvent accessibilityEvent) {
        super.mo10704e(view, accessibilityEvent);
        this.f36335d.f13282c.m14114b().mo14636n(accessibilityEvent);
    }
}
