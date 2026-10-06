package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbd {

    /* JADX INFO: renamed from: a */
    public final byte[] f47314a;

    /* JADX INFO: renamed from: b */
    public int f47315b;

    /* JADX INFO: renamed from: c */
    public int f47316c;

    /* JADX INFO: renamed from: d */
    public boolean f47317d;

    /* JADX INFO: renamed from: e */
    public final boolean f47318e;

    /* JADX INFO: renamed from: f */
    public pbd f47319f;

    /* JADX INFO: renamed from: g */
    public pbd f47320g;

    public pbd() {
        this.f47314a = new byte[8192];
        this.f47318e = true;
        this.f47317d = false;
    }

    public pbd(byte[] bArr, int i, int i2, boolean z) {
        this.f47314a = bArr;
        this.f47315b = i;
        this.f47316c = i2;
        this.f47317d = z;
        this.f47318e = false;
    }

    /* JADX INFO: renamed from: a */
    public final pbd m19287a() {
        pbd pbdVar = this.f47319f;
        pbd pbdVar2 = pbdVar != this ? pbdVar : null;
        pbd pbdVar3 = this.f47320g;
        pbdVar3.getClass();
        pbdVar3.f47319f = pbdVar;
        pbd pbdVar4 = this.f47319f;
        pbdVar4.getClass();
        pbdVar4.f47320g = pbdVar3;
        this.f47319f = null;
        this.f47320g = null;
        return pbdVar2;
    }

    /* JADX INFO: renamed from: b */
    public final pbd m19288b() {
        this.f47317d = true;
        return new pbd(this.f47314a, this.f47315b, this.f47316c, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m19289c(pbd pbdVar, int i) {
        if (!pbdVar.f47318e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = pbdVar.f47316c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (pbdVar.f47317d) {
                throw new IllegalArgumentException();
            }
            int i4 = pbdVar.f47315b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = pbdVar.f47314a;
            omn.m18691ae(bArr, bArr, 0, i4, i2);
            i2 = pbdVar.f47316c - pbdVar.f47315b;
            pbdVar.f47316c = i2;
            pbdVar.f47315b = 0;
        }
        byte[] bArr2 = this.f47314a;
        byte[] bArr3 = pbdVar.f47314a;
        int i5 = this.f47315b;
        omn.m18691ae(bArr2, bArr3, i2, i5, i5 + i);
        pbdVar.f47316c += i;
        this.f47315b += i;
    }

    /* JADX INFO: renamed from: d */
    public final void m19290d(pbd pbdVar) {
        pbdVar.f47320g = this;
        pbdVar.f47319f = this.f47319f;
        pbd pbdVar2 = this.f47319f;
        pbdVar2.getClass();
        pbdVar2.f47320g = pbdVar;
        this.f47319f = pbdVar;
    }
}
