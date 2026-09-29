package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class o28 implements hg2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f53654a;

    public /* synthetic */ o28(RecyclerView recyclerView) {
        this.f53654a = recyclerView;
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: e */
    public boolean mo13226e(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f53654a;
        if (recyclerView.f6613I.mo2680e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.f6613I.mo2679d()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.m2756q0();
        return recyclerView.m2716J(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: m */
    public float mo13227m() {
        float f;
        RecyclerView recyclerView = this.f53654a;
        if (recyclerView.f6613I.mo2680e()) {
            f = recyclerView.f6678x0;
        } else {
            if (!recyclerView.f6613I.mo2679d()) {
                return 0.0f;
            }
            f = recyclerView.f6677w0;
        }
        return -f;
    }

    @Override // p000.hg2
    /* JADX INFO: renamed from: n */
    public void mo13228n() {
        this.f53654a.m2756q0();
    }
}
