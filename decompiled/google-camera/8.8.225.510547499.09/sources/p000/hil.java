package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hil extends inr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hio f27913a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hil(hio hioVar) {
        super(null, null);
        this.f27913a = hioVar;
    }

    @Override // p000.inr
    /* JADX INFO: renamed from: a */
    public final void mo10341a(byte[] bArr) {
        if (bArr.length > 0) {
            nbh nbhVar = hio.f27922a;
        }
        Iterator it = this.f27913a.f27929g.iterator();
        while (it.hasNext()) {
            ((hiv) it.next()).mo10337a(bArr);
        }
    }

    @Override // p000.inr
    /* JADX INFO: renamed from: b */
    public final void mo10342b() {
        nbh nbhVar = hio.f27922a;
        Iterator it = this.f27913a.f27929g.iterator();
        while (it.hasNext()) {
            ((hiv) it.next()).mo10338b();
        }
    }

    @Override // p000.inr
    /* JADX INFO: renamed from: c */
    public final void mo10343c(int i) {
        int i2;
        nbh nbhVar = hio.f27922a;
        for (hiv hivVar : this.f27913a.f27929g) {
            switch (i) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown fallback reason");
            }
            hivVar.mo10339c(i2);
        }
    }
}
