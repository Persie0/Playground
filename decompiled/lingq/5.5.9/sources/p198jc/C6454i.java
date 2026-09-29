package p198jc;

import android.view.View;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: jc.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6454i {

    /* JADX INFO: renamed from: a */
    public final View f37021a;

    /* JADX INFO: renamed from: b */
    public int f37022b;

    /* JADX INFO: renamed from: c */
    public int f37023c;

    /* JADX INFO: renamed from: d */
    public int f37024d;

    public C6454i(View view) {
        this.f37021a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m13072a() {
        int i10 = this.f37024d;
        View view = this.f37021a;
        int top = i10 - (view.getTop() - this.f37022b);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f37023c));
    }
}
