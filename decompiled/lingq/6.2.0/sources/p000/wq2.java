package p000;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class wq2 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f67171a;

    /* JADX INFO: renamed from: b */
    public final x24 f67172b;

    public wq2(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        x24 x24Var = new x24();
        super(inputConnection, false);
        this.f67171a = textView;
        this.f67172b = x24Var;
        if (pq2.m19449d()) {
            pq2.m19448a().m19456i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f67171a.getEditableText();
        this.f67172b.getClass();
        return gv5.m12868E(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f67171a.getEditableText();
        this.f67172b.getClass();
        return gv5.m12868E(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
