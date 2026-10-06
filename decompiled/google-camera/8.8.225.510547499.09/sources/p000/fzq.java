package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fzq implements fzu {

    /* JADX INFO: renamed from: a */
    public final Object f23986a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23987b;

    /* JADX INFO: renamed from: c */
    private final Object f23988c;

    public fzq(fzu fzuVar, Set set, int i) {
        this.f23987b = i;
        this.f23988c = fzuVar;
        this.f23986a = set;
    }

    public fzq(fzu fzuVar, C1058va c1058va, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23987b = i;
        this.f23988c = c1058va;
        this.f23986a = fzuVar;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    private final fzt m8983c(fzt fztVar, glk glkVar) {
        ?? r13 = glkVar.f25502c;
        return new fzp(fztVar, r13.mo9910p(), ((C1058va) this.f23988c).m19491s(r13.mo9913s()), (C1058va) this.f23988c, null, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fzu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [fzu, java.lang.Object] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: a */
    public final fzt mo3603a(glk glkVar) {
        switch (this.f23987b) {
            case 0:
                return m8983c(this.f23986a.mo3603a(glkVar), glkVar);
            default:
                return new fxw(this, this.f23988c.mo3603a(glkVar), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fzu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [fzu, java.lang.Object] */
    @Override // p000.fzu
    /* JADX INFO: renamed from: b */
    public final fzt mo3604b(glk glkVar) {
        switch (this.f23987b) {
            case 0:
                fzt fztVarMo3604b = this.f23986a.mo3604b(glkVar);
                if (fztVarMo3604b == null) {
                    return null;
                }
                return m8983c(fztVarMo3604b, glkVar);
            default:
                fzt fztVarMo3604b2 = this.f23988c.mo3604b(glkVar);
                if (fztVarMo3604b2 == null) {
                    return null;
                }
                return new fxw(this, fztVarMo3604b2, null);
        }
    }
}
