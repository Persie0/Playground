package p263mf;

import nf.C7770a;

/* JADX INFO: renamed from: mf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7554d extends AbstractC7556f {

    /* JADX INFO: renamed from: c */
    public final short f41662c;

    /* JADX INFO: renamed from: d */
    public final short f41663d;

    public C7554d(AbstractC7556f abstractC7556f, int i10, int i11) {
        super(abstractC7556f);
        this.f41662c = (short) i10;
        this.f41663d = (short) i11;
    }

    @Override // p263mf.AbstractC7556f
    /* JADX INFO: renamed from: a */
    public final void mo15070a(C7770a c7770a, byte[] bArr) {
        c7770a.m15473c(this.f41662c, this.f41663d);
    }

    public final String toString() {
        short s10 = this.f41663d;
        return "<" + Integer.toBinaryString((1 << s10) | (((1 << s10) - 1) & this.f41662c) | (1 << s10)).substring(1) + '>';
    }
}
