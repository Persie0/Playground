package p263mf;

import nf.C7770a;

/* JADX INFO: renamed from: mf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7551a extends AbstractC7556f {

    /* JADX INFO: renamed from: c */
    public final short f41655c;

    /* JADX INFO: renamed from: d */
    public final short f41656d;

    public C7551a(AbstractC7556f abstractC7556f, int i10, int i11) {
        super(abstractC7556f);
        this.f41655c = (short) i10;
        this.f41656d = (short) i11;
    }

    @Override // p263mf.AbstractC7556f
    /* JADX INFO: renamed from: a */
    public final void mo15070a(C7770a c7770a, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f41656d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                c7770a.m15473c(31, 5);
                if (s10 > 62) {
                    c7770a.m15473c(s10 - 31, 16);
                } else if (i10 == 0) {
                    c7770a.m15473c(Math.min((int) s10, 31), 5);
                } else {
                    c7770a.m15473c(s10 - 31, 5);
                }
            }
            c7770a.m15473c(bArr[this.f41655c + i10], 8);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        short s10 = this.f41655c;
        sb2.append((int) s10);
        sb2.append("::");
        sb2.append((s10 + this.f41656d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
