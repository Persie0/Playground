package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyy implements grh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fyz f23948a;

    public fyy(fyz fyzVar) {
        this.f23948a = fyzVar;
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: a */
    public final void mo8956a(gru gruVar, gyu gyuVar) {
        grh grhVar = this.f23948a.f23951c;
        if (grhVar != null) {
            grhVar.mo8956a(gruVar, gyuVar);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: b */
    public final void mo8957b(gru gruVar) {
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: c */
    public final void mo8958c(gru gruVar, gsv gsvVar) {
        grh grhVar = this.f23948a.f23951c;
        if (grhVar != null) {
            grhVar.mo8958c(gruVar, gsvVar);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: d */
    public final void mo8959d(gru gruVar, bkn bknVar) {
        grh grhVar = this.f23948a.f23951c;
        if (grhVar != null) {
            grhVar.mo8959d(gruVar, bknVar);
        }
        int i = gruVar.f26184c;
        if (i == 1) {
            this.f23948a.f23949a = true;
        } else if (i == 2) {
            this.f23948a.f23950b = true;
        }
        fyz fyzVar = this.f23948a;
        if (fyzVar.f23949a && fyzVar.f23950b) {
            fyzVar.f23951c = null;
        }
    }
}
