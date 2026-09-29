package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ynd extends rfb {

    /* JADX INFO: renamed from: b */
    public final afa f70131b;

    /* JADX INFO: renamed from: c */
    public final afa f70132c;

    /* JADX INFO: renamed from: d */
    public final int[] f70133d;

    /* JADX INFO: renamed from: e */
    public final int f70134e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public ynd(afa afaVar, afa afaVar2) {
        this.f70131b = afaVar;
        this.f70132c = afaVar2;
        int iMo357g = afaVar2.mo357g();
        if (!(iMo357g <= 28)) {
            C3386nv.m17626m("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iMo357g];
        this.f70133d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iMo357g) {
            end endVarM25218d = m25218d(i);
            long j2 = endVarM25218d.f37588e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (endVarM25218d.equals(m25218d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = endVarM25218d.f37586c ? iArr[i3] | (1 << (i + 4)) : i;
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
        this.f70134e = i2;
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: a */
    public final void mo20648a(vnd vndVar, qnd qndVar) {
        for (int i = 0; i < this.f70134e; i++) {
            int i2 = this.f70133d[i];
            end endVarM25218d = m25218d(i2 & 31);
            if (endVarM25218d.f37586c) {
                vndVar.m23452b(endVarM25218d, new xnd(this, endVarM25218d, i2), qndVar);
            } else {
                afa afaVar = this.f70131b;
                int iMo357g = afaVar.mo357g();
                if (i2 >= iMo357g) {
                    afaVar = this.f70132c;
                    i2 -= iMo357g;
                }
                vndVar.m23451a(endVarM25218d, endVarM25218d.f37585b.cast(afaVar.mo359i(i2)), qndVar);
            }
        }
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: b */
    public final int mo20649b() {
        return this.f70134e;
    }

    @Override // p000.rfb
    /* JADX INFO: renamed from: c */
    public final Set mo20650c() {
        return new pb9(this, 2);
    }

    /* JADX INFO: renamed from: d */
    public final end m25218d(int i) {
        afa afaVar = this.f70131b;
        int iMo357g = afaVar.mo357g();
        return i >= iMo357g ? this.f70132c.mo358h(i - iMo357g) : afaVar.mo358h(i);
    }
}
