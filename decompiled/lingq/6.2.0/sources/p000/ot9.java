package p000;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class ot9 extends bt9 {

    /* JADX INFO: renamed from: b */
    public final TextClassification f54976b;

    /* JADX INFO: renamed from: c */
    public final int f54977c;

    /* JADX INFO: renamed from: d */
    public final Drawable f54978d;

    public ot9(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.f54976b = textClassification;
        this.f54977c = i;
        this.f54978d = drawable;
    }

    public final String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.f8993a + ", textClassification=" + this.f54976b + ", index=" + this.f54977c + ", icon=" + this.f54978d + ')';
    }
}
