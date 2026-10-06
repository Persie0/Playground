package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ndf extends ndh {

    /* JADX INFO: renamed from: a */
    public final int[] f42039a;

    /* JADX INFO: renamed from: b */
    public final int f42040b;

    /* JADX INFO: renamed from: d */
    private final ncr f42041d;

    /* JADX INFO: renamed from: e */
    private final ncr f42042e;

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    public ndf(ncr ncrVar, ncr ncrVar2) {
        this.f42041d = ncrVar;
        this.f42042e = ncrVar2;
        int iMo17264b = ncrVar2.mo17264b();
        nea.m17395i(iMo17264b <= 28, "metadata size too large");
        int[] iArr = new int[iMo17264b];
        this.f42039a = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            nbz nbzVarM17354d = m17354d(i);
            long j2 = nbzVarM17354d.f41967c | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (nbzVarM17354d.equals(m17354d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = nbzVarM17354d.f41966b ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.f42040b = i2;
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: a */
    public final int mo17351a() {
        return this.f42040b;
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: b */
    public final Set mo17352b() {
        return new ndd(this);
    }

    @Override // p000.ndh
    /* JADX INFO: renamed from: c */
    public final void mo17353c(ncy ncyVar, Object obj) {
        for (int i = 0; i < this.f42040b; i++) {
            int i2 = this.f42039a[i];
            nbz nbzVarM17354d = m17354d(i2 & 31);
            if (nbzVarM17354d.f41966b) {
                ncyVar.mo17349b(nbzVarM17354d, new nde(this, nbzVarM17354d, i2), obj);
            } else {
                ncyVar.mo17348a(nbzVarM17354d, nbzVarM17354d.m17310d(m17355e(i2)), obj);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final nbz m17354d(int i) {
        return (i >= 0 ? this.f42042e : this.f42041d).mo17265c(i);
    }

    /* JADX INFO: renamed from: e */
    public final Object m17355e(int i) {
        return (i >= 0 ? this.f42042e : this.f42041d).mo17267e(i);
    }
}
