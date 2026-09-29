package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1142b implements InterfaceC1171v {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.Adapter f7218a;

    public C1142b(RecyclerView.Adapter adapter) {
        this.f7218a = adapter;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: a */
    public final void mo4426a(int i10, int i11) {
        this.f7218a.f7040a.m4260c(i10, i11);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: b */
    public final void mo4427b(int i10, int i11) {
        this.f7218a.f7040a.m4262e(i10, i11);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: c */
    public final void mo4428c(int i10, int i11) {
        this.f7218a.f7040a.m4263f(i10, i11);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public final void mo4429d(int i10, int i11, Object obj) {
        this.f7218a.f7040a.m4261d(i10, i11, obj);
    }
}
