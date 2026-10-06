package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ait extends ais {

    /* JADX INFO: renamed from: q */
    public final fpr f460q;

    public ait(gtx gtxVar, byte[] bArr) {
        super(gtxVar, (byte[]) null);
        fpr fprVar = new fpr();
        this.f460q = fprVar;
        fprVar.f23132b = m778b() * 62.5f;
    }

    @Override // p000.ais
    /* JADX INFO: renamed from: e */
    public final boolean mo781e(long j) {
        fpr fprVar = this.f460q;
        float f = this.f449i;
        float f2 = this.f448h;
        Object obj = fprVar.f23133c;
        double d = f2;
        double dExp = Math.exp((j / 1000.0f) * fprVar.f23131a);
        Double.isNaN(d);
        ((aio) obj).f440b = (float) (d * dExp);
        aio aioVar = (aio) fprVar.f23133c;
        float f3 = aioVar.f440b;
        aioVar.f439a = f + ((f3 - f2) / fprVar.f23131a);
        if (fprVar.m8674a(f3)) {
            ((aio) fprVar.f23133c).f440b = 0.0f;
        }
        aio aioVar2 = (aio) fprVar.f23133c;
        float f4 = aioVar2.f439a;
        this.f449i = f4;
        float f5 = aioVar2.f440b;
        this.f448h = f5;
        float f6 = this.f455o;
        if (f4 < f6) {
            this.f449i = f6;
            return true;
        }
        float f7 = this.f454n;
        if (f4 <= f7) {
            return f4 >= f7 || f4 <= f6 || this.f460q.m8674a(f5);
        }
        this.f449i = f7;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m787k() {
        super.m784h();
    }
}
