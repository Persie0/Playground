package p000;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arw implements ase {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ View f2211a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ArrayList f2212b;

    public arw(View view, ArrayList arrayList) {
        this.f2211a = view;
        this.f2212b = arrayList;
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        asfVar.m1955y(this);
        this.f2211a.setVisibility(8);
        int size = this.f2212b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f2212b.get(i)).setVisibility(0);
        }
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: b */
    public final void mo1894b() {
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: c */
    public final void mo1895c() {
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: d */
    public final void mo1896d() {
    }

    @Override // p000.ase
    /* JADX INFO: renamed from: e */
    public final void mo1907e(asf asfVar) {
        asfVar.m1955y(this);
        asfVar.m1953w(this);
    }
}
