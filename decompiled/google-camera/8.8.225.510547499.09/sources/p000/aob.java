package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aob extends C0166er {

    /* JADX INFO: renamed from: a */
    public Drawable f1875a;

    /* JADX INFO: renamed from: b */
    public int f1876b;

    /* JADX INFO: renamed from: c */
    public boolean f1877c = true;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ aof f1878d;

    public aob(aof aofVar) {
        this.f1878d = aofVar;
    }

    /* JADX INFO: renamed from: t */
    private final boolean m1748t(View view, RecyclerView recyclerView) {
        C0829mo c0829moM1255g = recyclerView.m1255g(view);
        if (!(c0829moM1255g instanceof aor) || !((aor) c0829moM1255g).f1919v) {
            return false;
        }
        boolean z = this.f1877c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C0829mo c0829moM1255g2 = recyclerView.m1255g(recyclerView.getChildAt(iIndexOfChild + 1));
        return (c0829moM1255g2 instanceof aor) && ((aor) c0829moM1255g2).f1918u;
    }

    @Override // p000.C0166er
    /* JADX INFO: renamed from: f */
    public final void mo1749f(Rect rect, View view, RecyclerView recyclerView) {
        if (m1748t(view, recyclerView)) {
            rect.bottom = this.f1876b;
        }
    }

    @Override // p000.C0166er
    /* JADX INFO: renamed from: g */
    public final void mo1750g(Canvas canvas, RecyclerView recyclerView) {
        if (this.f1875a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m1748t(childAt, recyclerView)) {
                int y = ((int) childAt.getY()) + childAt.getHeight();
                this.f1875a.setBounds(0, y, width, this.f1876b + y);
                this.f1875a.draw(canvas);
            }
        }
    }
}
