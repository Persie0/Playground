package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class noo extends nog {

    /* JADX INFO: renamed from: c */
    private List f43985c;

    public noo(mwj mwjVar, boolean z) {
        super(mwjVar, z, true);
        List listEmptyList = mwjVar.isEmpty() ? Collections.emptyList() : mkv.m16502J(mwjVar.size());
        for (int i = 0; i < mwjVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.f43985c = listEmptyList;
        m17563r();
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: h */
    public final void mo17559h(int i, Object obj) {
        List list = this.f43985c;
        if (list != null) {
            list.set(i, new mav(obj));
        }
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: q */
    public final void mo17562q() {
        List<mav> list = this.f43985c;
        if (list != null) {
            ArrayList arrayListM16502J = mkv.m16502J(list.size());
            for (mav mavVar : list) {
                arrayListM16502J.add(mavVar != null ? mavVar.f39742a : null);
            }
            mo14894e(Collections.unmodifiableList(arrayListM16502J));
        }
    }

    @Override // p000.nog
    /* JADX INFO: renamed from: s */
    public final void mo17564s(int i) {
        super.mo17564s(i);
        this.f43985c = null;
    }
}
