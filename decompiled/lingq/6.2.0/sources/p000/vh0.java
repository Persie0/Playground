package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vh0 implements vq6 {

    /* JADX INFO: renamed from: a */
    public long f65365a;

    /* JADX INFO: renamed from: b */
    public long f65366b;

    /* JADX INFO: renamed from: c */
    public Object f65367c;

    /* JADX INFO: renamed from: d */
    public Object f65368d;

    public vh0(int i, long j) {
        bna.m3987z(((C3830ze) this.f65367c) == null);
        this.f65365a = j;
        this.f65366b = j + ((long) i);
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: a */
    public long mo81a(iy2 iy2Var) {
        long j = this.f65366b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.f65366b = -1L;
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public C3830ze m23283b() {
        C3830ze c3830ze = (C3830ze) this.f65367c;
        c3830ze.getClass();
        return c3830ze;
    }

    /* JADX INFO: renamed from: c */
    public vh0 m23284c() {
        vh0 vh0Var = (vh0) this.f65368d;
        if (vh0Var == null || ((C3830ze) vh0Var.f65367c) == null) {
            return null;
        }
        return vh0Var;
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: d */
    public st8 mo84d() {
        bna.m3987z(this.f65365a != -1);
        return new h60((p63) this.f65367c, this.f65365a, 1);
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: f */
    public void mo86f(long j) {
        long[] jArr = (long[]) ((p33) this.f65368d).f55513b;
        this.f65366b = jArr[uma.m22809d(jArr, j, true)];
    }

    public vh0(String str, byte[] bArr, long j, long j2) {
        this.f65367c = str;
        this.f65368d = bArr;
        this.f65365a = j;
        this.f65366b = j2;
    }
}
