package p000;

import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iju extends jvh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ cmo f31250a;

    public iju(cmo cmoVar, byte[] bArr) {
        this.f31250a = cmoVar;
    }

    @Override // p000.jvh
    /* JADX INFO: renamed from: a */
    public final boolean mo11402a(ihk ihkVar) {
        iak iakVar = ((ijv) this.f31250a.f6236a).f31252b;
        if (iakVar.f30150c.mo6184l(dib.f11361co)) {
            idu iduVar = iakVar.f30160m;
            if (iduVar == null || !iduVar.isShowing()) {
                return false;
            }
        } else {
            PopupMenuView popupMenuView = iakVar.f30159l;
            if (popupMenuView == null || popupMenuView.getVisibility() != 0) {
                return false;
            }
        }
        if (jvh.m13571s(ihkVar.m11339d(), ((ijv) this.f31250a.f6236a).f31260j.f7048a.f7093a)) {
            return false;
        }
        ((ijv) this.f31250a.f6236a).f31252b.m10987d();
        return true;
    }
}
