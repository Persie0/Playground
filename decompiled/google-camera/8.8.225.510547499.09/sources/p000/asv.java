package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asv extends asg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewGroup f2265a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ View f2266b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f2267c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ asy f2268d;

    public asv(asy asyVar, ViewGroup viewGroup, View view, View view2) {
        this.f2268d = asyVar;
        this.f2265a = viewGroup;
        this.f2266b = view;
        this.f2267c = view2;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        this.f2267c.setTag(C0100R.id.save_overlay_view, null);
        this.f2265a.getOverlay().remove(this.f2266b);
        asfVar.m1955y(this);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: c */
    public final void mo1895c() {
        this.f2265a.getOverlay().remove(this.f2266b);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: d */
    public final void mo1896d() {
        if (this.f2266b.getParent() == null) {
            this.f2265a.getOverlay().add(this.f2266b);
        } else {
            this.f2268d.mo1942l();
        }
    }
}
