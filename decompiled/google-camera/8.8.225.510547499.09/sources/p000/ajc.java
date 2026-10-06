package p000;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajc extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    private final TextView f484a;

    public ajc(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f484a = textView;
        aix aixVar = aix.f474a;
    }

    /* JADX INFO: renamed from: a */
    private final Editable m802a() {
        return this.f484a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return abr.m149d(this, m802a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return abr.m149d(this, m802a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
