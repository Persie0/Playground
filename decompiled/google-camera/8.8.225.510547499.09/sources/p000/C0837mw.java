package p000;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: renamed from: mw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0837mw extends C0167es {

    /* JADX INFO: renamed from: a */
    boolean f41703a = false;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC0815ma f41704b;

    public C0837mw(AbstractC0815ma abstractC0815ma) {
        this.f41704b = abstractC0815ma;
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: c */
    public final void mo2034c(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f41703a = true;
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: d */
    public final void mo2035d(int i) {
        if (i == 0 && this.f41703a) {
            this.f41703a = false;
            this.f41704b.m16269f();
        }
    }
}
