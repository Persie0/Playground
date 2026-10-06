package p000;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ixb extends C0167es {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ixc f32528a;

    public ixb(ixc ixcVar) {
        this.f32528a = ixcVar;
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: c */
    public final void mo2034c(RecyclerView recyclerView, int i, int i2) {
        int i3;
        AbstractC0812ly abstractC0812ly;
        ixc ixcVar = this.f32528a;
        if (!ixcVar.f32531c || (i3 = ixcVar.f32532d) == 0 || (abstractC0812ly = recyclerView.f1124n) == null) {
            return;
        }
        int i4 = abstractC0812ly.mo1163W() ? i3 - i2 : i3 - i;
        ixcVar.f32532d = i4;
        if (i3 < 0 && i4 > 0) {
            ixcVar.f32532d = 0;
        } else {
            if (i3 <= 0 || i4 >= 0) {
                return;
            }
            ixcVar.f32532d = 0;
        }
    }

    @Override // p000.C0167es
    /* JADX INFO: renamed from: d */
    public final void mo2035d(int i) {
        if (i != 2) {
            this.f32528a.f32532d = 0;
        }
    }
}
