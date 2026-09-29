package p000;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: renamed from: dq */
/* JADX INFO: loaded from: classes2.dex */
public final class C2936dq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatEditText f36012a;

    public C2936dq(AppCompatEditText appCompatEditText) {
        this.f36012a = appCompatEditText;
    }

    /* JADX INFO: renamed from: a */
    public final TextClassifier m10578a() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    /* JADX INFO: renamed from: b */
    public final void m10579b(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }
}
