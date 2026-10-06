package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asl extends asg {

    /* JADX INFO: renamed from: a */
    final asm f2254a;

    public asl(asm asmVar) {
        this.f2254a = asmVar;
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: a */
    public final void mo1893a(asf asfVar) {
        asm asmVar = this.f2254a;
        int i = asmVar.f2255n - 1;
        asmVar.f2255n = i;
        if (i == 0) {
            asmVar.f2256o = false;
            asmVar.m1946p();
        }
        asfVar.m1955y(this);
    }

    @Override // p000.asg, p000.ase
    /* JADX INFO: renamed from: e */
    public final void mo1907e(asf asfVar) {
        asm asmVar = this.f2254a;
        if (asmVar.f2256o) {
            return;
        }
        asmVar.m1950t();
        this.f2254a.f2256o = true;
    }
}
