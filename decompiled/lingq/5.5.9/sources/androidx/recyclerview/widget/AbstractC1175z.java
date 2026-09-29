package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1175z {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC1120m f7474a;

    /* JADX INFO: renamed from: b */
    public int f7475b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Rect f7476c = new Rect();

    public AbstractC1175z(RecyclerView.AbstractC1120m abstractC1120m) {
        this.f7474a = abstractC1120m;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1175z m4544a(RecyclerView.AbstractC1120m abstractC1120m, int i10) {
        if (i10 == 0) {
            return new C1173x(abstractC1120m);
        }
        if (i10 == 1) {
            return new C1174y(abstractC1120m);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo4530b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo4531c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo4532d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo4533e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo4534f();

    /* JADX INFO: renamed from: g */
    public abstract int mo4535g();

    /* JADX INFO: renamed from: h */
    public abstract int mo4536h();

    /* JADX INFO: renamed from: i */
    public abstract int mo4537i();

    /* JADX INFO: renamed from: j */
    public abstract int mo4538j();

    /* JADX INFO: renamed from: k */
    public abstract int mo4539k();

    /* JADX INFO: renamed from: l */
    public abstract int mo4540l();

    /* JADX INFO: renamed from: m */
    public abstract int mo4541m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo4542n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo4543o(int i10);
}
