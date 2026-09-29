package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0956i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0977s0 f6305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f6306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Rect f6307c;

    public RunnableC0956i(AbstractC0977s0 abstractC0977s0, View view, Rect rect) {
        this.f6305a = abstractC0977s0;
        this.f6306b = view;
        this.f6307c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6305a.getClass();
        AbstractC0977s0.m3797g(this.f6306b, this.f6307c);
    }
}
