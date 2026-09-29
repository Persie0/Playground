package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class gc9 extends d38 {

    /* JADX INFO: renamed from: a */
    public boolean f40551a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r27 f40552b;

    public gc9(r27 r27Var) {
        this.f40552b = r27Var;
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: a */
    public final void mo6122a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f40551a) {
            this.f40551a = false;
            this.f40552b.m20260i();
        }
    }

    @Override // p000.d38
    /* JADX INFO: renamed from: b */
    public final void mo6123b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f40551a = true;
    }
}
