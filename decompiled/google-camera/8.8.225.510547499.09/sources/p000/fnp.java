package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fnp extends igg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hwu f22797a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ foc f22798b;

    public fnp(foc focVar, hwu hwuVar) {
        this.f22798b = focVar;
        this.f22797a = hwuVar;
    }

    @Override // p000.igg, p000.igf
    public final void onShutterButtonClick() {
        foc focVar = this.f22798b;
        if (focVar.f22880k && focVar.f22879j) {
            if (focVar.f22881l) {
                focVar.m8611B();
                return;
            }
            this.f22797a.mo10786d();
            exm exmVar = this.f22798b.f22887r;
            fno fnoVar = new fno(this, 0);
            if (exmVar.f20760b == null || exmVar.f20762d || exmVar.f20772n != 0 || exmVar.f20779u) {
                return;
            }
            exmVar.f20761c.f20688b.mo2725j(exmVar.f20751H, new exl(exmVar, fnoVar, 0));
        }
    }
}
