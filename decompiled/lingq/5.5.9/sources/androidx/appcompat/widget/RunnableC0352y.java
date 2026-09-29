package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.y */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0352y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f1390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Typeface f1391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1392c;

    public RunnableC0352y(TextView textView, Typeface typeface, int i10) {
        this.f1390a = textView;
        this.f1391b = typeface;
        this.f1392c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1390a.setTypeface(this.f1391b, this.f1392c);
    }
}
