package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1174y extends AbstractC1175z {
    public C1174y(RecyclerView.AbstractC1120m abstractC1120m) {
        super(abstractC1120m);
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: b */
    public final int mo4530b(View view) {
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        this.f7474a.getClass();
        return RecyclerView.AbstractC1120m.m4293w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: c */
    public final int mo4531c(View view) {
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        this.f7474a.getClass();
        Rect rect = ((RecyclerView.C1121n) view.getLayoutParams()).f7106b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1121n).topMargin + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: d */
    public final int mo4532d(View view) {
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        this.f7474a.getClass();
        Rect rect = ((RecyclerView.C1121n) view.getLayoutParams()).f7106b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1121n).leftMargin + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: e */
    public final int mo4533e(View view) {
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        this.f7474a.getClass();
        return (view.getTop() - RecyclerView.AbstractC1120m.m4289N(view)) - ((ViewGroup.MarginLayoutParams) c1121n).topMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: f */
    public final int mo4534f() {
        return this.f7474a.f7098o;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: g */
    public final int mo4535g() {
        RecyclerView.AbstractC1120m abstractC1120m = this.f7474a;
        return abstractC1120m.f7098o - abstractC1120m.m4301F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: h */
    public final int mo4536h() {
        return this.f7474a.m4301F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: i */
    public final int mo4537i() {
        return this.f7474a.f7096m;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: j */
    public final int mo4538j() {
        return this.f7474a.f7095l;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: k */
    public final int mo4539k() {
        return this.f7474a.m4305I();
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: l */
    public final int mo4540l() {
        RecyclerView.AbstractC1120m abstractC1120m = this.f7474a;
        return (abstractC1120m.f7098o - abstractC1120m.m4305I()) - abstractC1120m.m4301F();
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: m */
    public final int mo4541m(View view) {
        RecyclerView.AbstractC1120m abstractC1120m = this.f7474a;
        Rect rect = this.f7476c;
        abstractC1120m.m4306O(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: n */
    public final int mo4542n(View view) {
        RecyclerView.AbstractC1120m abstractC1120m = this.f7474a;
        Rect rect = this.f7476c;
        abstractC1120m.m4306O(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.AbstractC1175z
    /* JADX INFO: renamed from: o */
    public final void mo4543o(int i10) {
        this.f7474a.mo4308T(i10);
    }
}
