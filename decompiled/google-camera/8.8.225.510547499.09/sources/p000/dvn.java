package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvn implements dtp {

    /* JADX INFO: renamed from: b */
    private final long[] f12670b;

    /* JADX INFO: renamed from: a */
    public final Object f12669a = new Object();

    /* JADX INFO: renamed from: c */
    private int f12671c = 0;

    /* JADX INFO: renamed from: d */
    private int f12672d = 0;

    public dvn(int i) {
        this.f12670b = new long[i];
    }

    /* JADX INFO: renamed from: j */
    private final int m6780j(long j) {
        synchronized (this.f12669a) {
            int iM6784e = m6784e() - 1;
            int i = 0;
            while (i <= iM6784e) {
                int i2 = (i + iM6784e) >>> 1;
                long j2 = this.f12670b[m6785f(i2)];
                if (j2 < j) {
                    i = i2 + 1;
                } else {
                    if (j2 <= j) {
                        return i2;
                    }
                    iM6784e = i2 - 1;
                }
            }
            return i;
        }
    }

    @Override // p000.dtp
    /* JADX INFO: renamed from: a */
    public final dtu mo6744a(long j) {
        return new dvm(this, j);
    }

    /* JADX INFO: renamed from: b */
    public final int m6781b(long j) {
        boolean z;
        int i;
        long jM6787h;
        synchronized (this.f12669a) {
            if (m6788i()) {
                z = true;
            } else {
                synchronized (this.f12669a) {
                    lku.m15614I(!m6788i(), "Attempting to get latest timestamp on empty buffer!");
                    jM6787h = m6787h(m6784e() - 1);
                }
                z = j > jM6787h;
            }
            lku.m15670x(z, "Attempting to insert earlier timestamp into buffer!");
            i = this.f12671c;
            long[] jArr = this.f12670b;
            this.f12671c = (i + 1) % jArr.length;
            jArr[i] = j;
            this.f12672d++;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final int m6782c(long j) {
        synchronized (this.f12669a) {
            if (!m6788i()) {
                int iM6780j = m6780j(j);
                if (iM6780j >= 0 && iM6780j < m6784e() && m6787h(iM6780j) == j) {
                    return iM6780j;
                }
                if (iM6780j != 0) {
                    return iM6780j - 1;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m6783d(long j) {
        synchronized (this.f12669a) {
            int i = -1;
            if (m6788i()) {
                return -1;
            }
            int iM6780j = m6780j(j);
            if (iM6780j >= 0 && iM6780j < m6784e()) {
                i = iM6780j;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m6784e() {
        int iMin;
        synchronized (this.f12669a) {
            iMin = Math.min(this.f12672d, this.f12670b.length);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: f */
    public final int m6785f(int i) {
        int i2;
        synchronized (this.f12669a) {
            if (m6788i()) {
                i2 = -1;
            } else {
                i2 = this.f12672d >= this.f12670b.length ? this.f12671c : 0;
            }
        }
        return (i2 + i) % m6784e();
    }

    /* JADX INFO: renamed from: g */
    public final int m6786g(long j) {
        int iM6780j;
        synchronized (this.f12669a) {
            iM6780j = m6780j(j);
            if (iM6780j < 0 || iM6780j >= m6784e() || m6787h(iM6780j) != j) {
                iM6780j = -1;
            }
        }
        if (iM6780j >= 0) {
            return m6785f(iM6780j);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final long m6787h(int i) {
        long j;
        synchronized (this.f12669a) {
            if (i >= 0) {
                if (i < m6784e()) {
                    j = this.f12670b[m6785f(i)];
                }
            }
            throw new IndexOutOfBoundsException("Attempting to access illegal index " + i);
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6788i() {
        boolean z;
        synchronized (this.f12669a) {
            z = this.f12672d == 0;
        }
        return z;
    }
}
