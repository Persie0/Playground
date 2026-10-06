package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class naw {

    /* JADX INFO: renamed from: a */
    public final Object f41910a;

    /* JADX INFO: renamed from: b */
    public int f41911b;

    /* JADX INFO: renamed from: c */
    public int f41912c;

    /* JADX INFO: renamed from: d */
    public long f41913d;

    /* JADX INFO: renamed from: e */
    public naw f41914e;

    /* JADX INFO: renamed from: f */
    public naw f41915f;

    /* JADX INFO: renamed from: g */
    public naw f41916g;

    /* JADX INFO: renamed from: h */
    public naw f41917h;

    /* JADX INFO: renamed from: i */
    private int f41918i;

    public naw() {
        this.f41910a = null;
        this.f41911b = 1;
    }

    public naw(Object obj, int i) {
        lku.m15669w(i > 0);
        this.f41910a = obj;
        this.f41911b = i;
        this.f41913d = i;
        this.f41912c = 1;
        this.f41918i = 1;
        this.f41914e = null;
        this.f41915f = null;
    }

    /* JADX INFO: renamed from: j */
    private final int m17210j() {
        return m17211k(this.f41914e) - m17211k(this.f41915f);
    }

    /* JADX INFO: renamed from: k */
    private static int m17211k(naw nawVar) {
        if (nawVar == null) {
            return 0;
        }
        return nawVar.f41918i;
    }

    /* JADX INFO: renamed from: l */
    private static long m17212l(naw nawVar) {
        if (nawVar == null) {
            return 0L;
        }
        return nawVar.f41913d;
    }

    /* JADX INFO: renamed from: m */
    private final naw m17213m() {
        int i = this.f41911b;
        this.f41911b = 0;
        nay.m17241v(m17225e(), m17227g());
        naw nawVar = this.f41914e;
        if (nawVar == null) {
            return this.f41915f;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            return nawVar;
        }
        if (nawVar.f41918i >= nawVar2.f41918i) {
            naw nawVarM17225e = m17225e();
            nawVarM17225e.f41914e = this.f41914e.m17215o(nawVarM17225e);
            nawVarM17225e.f41915f = this.f41915f;
            nawVarM17225e.f41912c = this.f41912c - 1;
            nawVarM17225e.f41913d = this.f41913d - ((long) i);
            return nawVarM17225e.m17214n();
        }
        naw nawVarM17227g = m17227g();
        nawVarM17227g.f41915f = this.f41915f.m17216p(nawVarM17227g);
        nawVarM17227g.f41914e = this.f41914e;
        nawVarM17227g.f41912c = this.f41912c - 1;
        nawVarM17227g.f41913d = this.f41913d - ((long) i);
        return nawVarM17227g.m17214n();
    }

    /* JADX INFO: renamed from: o */
    private final naw m17215o(naw nawVar) {
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            return this.f41914e;
        }
        this.f41915f = nawVar2.m17215o(nawVar);
        this.f41912c--;
        this.f41913d -= (long) nawVar.f41911b;
        return m17214n();
    }

    /* JADX INFO: renamed from: p */
    private final naw m17216p(naw nawVar) {
        naw nawVar2 = this.f41914e;
        if (nawVar2 == null) {
            return this.f41915f;
        }
        this.f41914e = nawVar2.m17216p(nawVar);
        this.f41912c--;
        this.f41913d -= (long) nawVar.f41911b;
        return m17214n();
    }

    /* JADX INFO: renamed from: q */
    private final naw m17217q() {
        lku.m15613H(this.f41915f != null);
        naw nawVar = this.f41915f;
        this.f41915f = nawVar.f41914e;
        nawVar.f41914e = this;
        nawVar.f41913d = this.f41913d;
        nawVar.f41912c = this.f41912c;
        m17219s();
        nawVar.m17220t();
        return nawVar;
    }

    /* JADX INFO: renamed from: r */
    private final naw m17218r() {
        lku.m15613H(this.f41914e != null);
        naw nawVar = this.f41914e;
        this.f41914e = nawVar.f41915f;
        nawVar.f41915f = this;
        nawVar.f41913d = this.f41913d;
        nawVar.f41912c = this.f41912c;
        m17219s();
        nawVar.m17220t();
        return nawVar;
    }

    /* JADX INFO: renamed from: s */
    private final void m17219s() {
        naw nawVar = this.f41914e;
        int iM17240t = nay.m17240t(nawVar) + 1;
        naw nawVar2 = this.f41915f;
        this.f41912c = iM17240t + nay.m17240t(nawVar2);
        this.f41913d = ((long) this.f41911b) + m17212l(nawVar) + m17212l(nawVar2);
        m17220t();
    }

    /* JADX INFO: renamed from: t */
    private final void m17220t() {
        this.f41918i = Math.max(m17211k(this.f41914e), m17211k(this.f41915f)) + 1;
    }

    /* JADX INFO: renamed from: a */
    final int m17221a(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            if (nawVar == null) {
                return 0;
            }
            return nawVar.m17221a(comparator, obj);
        }
        if (iCompare <= 0) {
            return this.f41911b;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            return 0;
        }
        return nawVar2.m17221a(comparator, obj);
    }

    /* JADX INFO: renamed from: b */
    final naw m17222b(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            if (nawVar == null) {
                iArr[0] = 0;
                this.f41914e = new naw(obj, i);
                nay.m17242w(m17225e(), this.f41914e, this);
                this.f41918i = Math.max(2, this.f41918i);
                this.f41912c++;
                this.f41913d += (long) i;
                return this;
            }
            int i2 = nawVar.f41918i;
            naw nawVarM17222b = nawVar.m17222b(comparator, obj, i, iArr);
            this.f41914e = nawVarM17222b;
            if (iArr[0] == 0) {
                this.f41912c++;
            }
            this.f41913d += (long) i;
            return nawVarM17222b.f41918i == i2 ? this : m17214n();
        }
        if (iCompare <= 0) {
            int i3 = this.f41911b;
            iArr[0] = i3;
            long j = i;
            lku.m15669w(((long) i3) + j <= 2147483647L);
            this.f41911b += i;
            this.f41913d += j;
            return this;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 != null) {
            int i4 = nawVar2.f41918i;
            naw nawVarM17222b2 = nawVar2.m17222b(comparator, obj, i, iArr);
            this.f41915f = nawVarM17222b2;
            if (iArr[0] == 0) {
                this.f41912c++;
            }
            this.f41913d += (long) i;
            return nawVarM17222b2.f41918i == i4 ? this : m17214n();
        }
        iArr[0] = 0;
        naw nawVar3 = new naw(obj, i);
        this.f41915f = nawVar3;
        nay.m17242w(this, nawVar3, m17227g());
        this.f41918i = Math.max(2, this.f41918i);
        this.f41912c++;
        this.f41913d += (long) i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final naw m17223c(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            return nawVar == null ? this : (naw) mpw.m16767f(nawVar.m17223c(comparator, obj), this);
        }
        if (iCompare == 0) {
            return this;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            return null;
        }
        return nawVar2.m17223c(comparator, obj);
    }

    /* JADX INFO: renamed from: d */
    public final naw m17224d(Comparator comparator, Object obj) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare > 0) {
            naw nawVar = this.f41915f;
            return nawVar == null ? this : (naw) mpw.m16767f(nawVar.m17224d(comparator, obj), this);
        }
        if (iCompare == 0) {
            return this;
        }
        naw nawVar2 = this.f41914e;
        if (nawVar2 == null) {
            return null;
        }
        return nawVar2.m17224d(comparator, obj);
    }

    /* JADX INFO: renamed from: e */
    public final naw m17225e() {
        naw nawVar = this.f41916g;
        nawVar.getClass();
        return nawVar;
    }

    /* JADX INFO: renamed from: f */
    final naw m17226f(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            if (nawVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f41914e = nawVar.m17226f(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 > 0) {
                if (i >= i2) {
                    this.f41912c--;
                    this.f41913d -= (long) i2;
                } else {
                    this.f41913d -= (long) i;
                }
            }
            return i2 == 0 ? this : m17214n();
        }
        if (iCompare <= 0) {
            int i3 = this.f41911b;
            iArr[0] = i3;
            if (i >= i3) {
                return m17213m();
            }
            this.f41911b = i3 - i;
            this.f41913d -= (long) i;
            return this;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f41915f = nawVar2.m17226f(comparator, obj, i, iArr);
        int i4 = iArr[0];
        if (i4 > 0) {
            if (i >= i4) {
                this.f41912c--;
                this.f41913d -= (long) i4;
            } else {
                this.f41913d -= (long) i;
            }
        }
        return m17214n();
    }

    /* JADX INFO: renamed from: g */
    public final naw m17227g() {
        naw nawVar = this.f41917h;
        nawVar.getClass();
        return nawVar;
    }

    /* JADX INFO: renamed from: h */
    final naw m17228h(Comparator comparator, Object obj, int i, int[] iArr) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            if (nawVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f41914e = nawVar.m17228h(comparator, obj, i, iArr);
            int i2 = iArr[0];
            if (i2 == i) {
                if (i2 != 0) {
                    this.f41912c--;
                }
                this.f41913d += (long) (-i2);
            }
            return m17214n();
        }
        if (iCompare <= 0) {
            int i3 = this.f41911b;
            iArr[0] = i3;
            return i == i3 ? m17213m() : this;
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f41915f = nawVar2.m17228h(comparator, obj, i, iArr);
        int i4 = iArr[0];
        if (i4 == i) {
            if (i4 != 0) {
                this.f41912c--;
            }
            this.f41913d += (long) (-i4);
        }
        return m17214n();
    }

    /* JADX INFO: renamed from: i */
    final naw m17229i(Comparator comparator, Object obj, int[] iArr) {
        int iCompare = comparator.compare(obj, this.f41910a);
        if (iCompare < 0) {
            naw nawVar = this.f41914e;
            if (nawVar == null) {
                iArr[0] = 0;
                return this;
            }
            this.f41914e = nawVar.m17229i(comparator, obj, iArr);
            int i = iArr[0];
            if (i != 0) {
                this.f41912c--;
            }
            this.f41913d += (long) (-i);
            return m17214n();
        }
        if (iCompare <= 0) {
            iArr[0] = this.f41911b;
            return m17213m();
        }
        naw nawVar2 = this.f41915f;
        if (nawVar2 == null) {
            iArr[0] = 0;
            return this;
        }
        this.f41915f = nawVar2.m17229i(comparator, obj, iArr);
        int i2 = iArr[0];
        if (i2 != 0) {
            this.f41912c--;
        }
        this.f41913d += (long) (-i2);
        return m17214n();
    }

    public final String toString() {
        return mkv.m16554s(this.f41910a, this.f41911b).toString();
    }

    /* JADX INFO: renamed from: n */
    private final naw m17214n() {
        switch (m17210j()) {
            case -2:
                naw nawVar = this.f41915f;
                nawVar.getClass();
                if (nawVar.m17210j() > 0) {
                    this.f41915f = this.f41915f.m17218r();
                }
                return m17217q();
            case 2:
                naw nawVar2 = this.f41914e;
                nawVar2.getClass();
                if (nawVar2.m17210j() < 0) {
                    this.f41914e = this.f41914e.m17217q();
                }
                return m17218r();
            default:
                m17220t();
                return this;
        }
    }
}
