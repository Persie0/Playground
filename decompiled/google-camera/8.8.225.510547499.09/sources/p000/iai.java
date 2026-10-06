package p000;

import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iai implements hte {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iak f30146a;

    public iai(iak iakVar) {
        this.f30146a = iakVar;
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3802a() {
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: b */
    public final void mo3803b() {
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: c */
    public final boolean mo3804c() {
        if (this.f30146a.f30150c.mo6184l(dib.f11361co)) {
            iak iakVar = this.f30146a;
            if (iakVar.f30160m == null) {
                return false;
            }
            iakVar.f30153f.mo10033e(gzy.f27037au, true);
            idu iduVar = this.f30146a.f30160m;
            iduVar.getClass();
            if (iduVar.isShowing()) {
                idu iduVar2 = this.f30146a.f30160m;
                iduVar2.getClass();
                iduVar2.dismiss();
            } else {
                idu iduVar3 = this.f30146a.f30160m;
                iduVar3.getClass();
                iduVar3.m11140f();
            }
        } else {
            iak iakVar2 = this.f30146a;
            if (iakVar2.f30159l == null) {
                return false;
            }
            iakVar2.f30153f.mo10033e(gzy.f27037au, true);
            PopupMenuView popupMenuView = this.f30146a.f30159l;
            popupMenuView.getClass();
            if (popupMenuView.getVisibility() == 0) {
                PopupMenuView popupMenuView2 = this.f30146a.f30159l;
                popupMenuView2.getClass();
                popupMenuView2.m4406b();
            } else {
                PopupMenuView popupMenuView3 = this.f30146a.f30159l;
                popupMenuView3.getClass();
                popupMenuView3.m4407c();
            }
        }
        return true;
    }
}
