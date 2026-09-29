package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0348w {

    /* JADX INFO: renamed from: a */
    public final TextView f1364a;

    /* JADX INFO: renamed from: b */
    public TextClassifier f1365b;

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static TextClassifier m1278a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C0348w(TextView textView) {
        textView.getClass();
        this.f1364a = textView;
    }
}
