package androidx.wear.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import p000.avf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissFrameLayout extends avf {

    /* JADX INFO: renamed from: b */
    final ArrayList f1765b;

    public SwipeDismissFrameLayout(Context context) {
        this(context, null, 0);
    }

    @Override // p000.avf
    /* JADX INFO: renamed from: a */
    protected final void mo1689a() {
        super.mo1689a();
        for (int size = this.f1765b.size() - 1; size >= 0; size--) {
        }
    }

    @Override // p000.avf
    /* JADX INFO: renamed from: b */
    protected final void mo1690b() {
        super.mo1690b();
        int size = this.f1765b.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    @Override // p000.avf
    /* JADX INFO: renamed from: c */
    protected final void mo1691c() {
        super.mo1691c();
        for (int size = this.f1765b.size() - 1; size >= 0; size--) {
        }
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1765b = new ArrayList();
    }
}
