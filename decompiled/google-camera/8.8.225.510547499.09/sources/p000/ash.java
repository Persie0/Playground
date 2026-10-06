package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ash extends asg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1109wy f2247a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ asi f2248b;

    public ash(asi asiVar, C1109wy c1109wy) {
        this.f2248b = asiVar;
        this.f2247a = c1109wy;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        ((ArrayList) this.f2247a.get(this.f2248b.f2250b)).remove(asfVar);
        asfVar.m1955y(this);
    }
}
