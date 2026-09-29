package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dg3 implements caa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f35591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f35592b;

    public dg3(View view, ArrayList arrayList) {
        this.f35591a = view;
        this.f35592b = arrayList;
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: a */
    public final void mo4474a(daa daaVar) {
        daaVar.mo10189I(this);
        this.f35591a.setVisibility(8);
        ArrayList arrayList = this.f35592b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: b */
    public final void mo4475b() {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: c */
    public final void mo4476c(daa daaVar) {
        daaVar.mo10189I(this);
        daaVar.m10202a(this);
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: f */
    public final void mo4479f() {
    }

    @Override // p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
    }
}
