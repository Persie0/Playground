package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxr {

    /* JADX INFO: renamed from: a */
    public static final oxz f46787a = new oxz("REMOVE_FROZEN");

    /* JADX INFO: renamed from: c */
    private final int f46789c;

    /* JADX INFO: renamed from: d */
    private final boolean f46790d;

    /* JADX INFO: renamed from: e */
    private final int f46791e;

    /* JADX INFO: renamed from: g */
    private final liv f46793g;

    /* JADX INFO: renamed from: f */
    private final opn f46792f = ook.m18796j(null);

    /* JADX INFO: renamed from: b */
    public final opm f46788b = ook.m18795i(0);

    public oxr(int i, boolean z) {
        this.f46789c = i;
        this.f46790d = z;
        int i2 = i - 1;
        this.f46791e = i2;
        this.f46793g = ooc.m18759y(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m19146a(Object obj) {
        opm opmVar = this.f46788b;
        while (true) {
            long j = opmVar.f46394b;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = this.f46791e;
            int i2 = (int) ((j & 1152921503533105152L) >> 30);
            int i3 = (int) (1073741823 & j);
            if (((i2 + 2) & i) == (i3 & i)) {
                return 1;
            }
            if (!this.f46790d && this.f46793g.m15486i(i2 & i).f46397a != null) {
                int i4 = this.f46789c;
                if (i4 < 1024 || ((i2 - i3) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (this.f46788b.m18852d(j, lku.m15642ak(j, 1152921503533105152L) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.f46793g.m15486i(i2 & i).m18855c(obj);
                oxr oxrVarM19148c = this;
                while ((oxrVarM19148c.f46788b.f46394b & 1152921504606846976L) != 0) {
                    oxrVarM19148c = oxrVarM19148c.m19148c();
                    Object obj2 = oxrVarM19148c.f46793g.m15486i(oxrVarM19148c.f46791e & i2).f46397a;
                    if ((obj2 instanceof oxq) && ((oxq) obj2).f46786a == i2) {
                        oxrVarM19148c.f46793g.m15486i(oxrVarM19148c.f46791e & i2).m18855c(obj);
                    } else {
                        oxrVarM19148c = null;
                    }
                    if (oxrVarM19148c == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m19147b() {
        Object obj;
        opm opmVar = this.f46788b;
        while (true) {
            long j = opmVar.f46394b;
            long j2 = 1152921504606846976L;
            if ((j & 1152921504606846976L) != 0) {
                return f46787a;
            }
            int i = this.f46791e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            Object obj2 = this.f46793g.m15486i(i3).f46397a;
            if (obj2 == null) {
                if (this.f46790d) {
                    return null;
                }
            } else {
                if (obj2 instanceof oxq) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (this.f46788b.m18852d(j, lku.m15643al(j, i4))) {
                    this.f46793g.m15486i(this.f46791e & i2).m18855c(null);
                    return obj2;
                }
                if (this.f46790d) {
                    oxr oxrVarM19148c = this;
                    while (true) {
                        opm opmVar2 = oxrVarM19148c.f46788b;
                        while (true) {
                            long j3 = opmVar2.f46394b;
                            long j4 = j3 & 1073741823;
                            boolean z = oqu.f46432a;
                            if ((j3 & j2) != 0) {
                                oxrVarM19148c = oxrVarM19148c.m19148c();
                                obj = null;
                                break;
                            }
                            if (oxrVarM19148c.f46788b.m18852d(j3, lku.m15643al(j3, i4))) {
                                obj = null;
                                oxrVarM19148c.f46793g.m15486i(((int) j4) & oxrVarM19148c.f46791e).m18855c(null);
                                oxrVarM19148c = null;
                                break;
                            }
                            j2 = 1152921504606846976L;
                        }
                        if (oxrVarM19148c == null) {
                            return obj2;
                        }
                        j2 = 1152921504606846976L;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19149d() {
        long j;
        opm opmVar = this.f46788b;
        do {
            j = opmVar.f46394b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!opmVar.m18852d(j, 2305843009213693952L | j));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19150e() {
        long j = this.f46788b.f46394b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: c */
    public final oxr m19148c() {
        long j;
        opm opmVar = this.f46788b;
        while (true) {
            j = opmVar.f46394b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (opmVar.m18852d(j, j2)) {
                j = j2;
                break;
            }
        }
        opn opnVar = this.f46792f;
        while (true) {
            oxr oxrVar = (oxr) opnVar.f46397a;
            if (oxrVar != null) {
                return oxrVar;
            }
            opn opnVar2 = this.f46792f;
            int i = this.f46789c;
            oxr oxrVar2 = new oxr(i + i, this.f46790d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.f46791e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object oxqVar = this.f46793g.m15486i(i4).f46397a;
                    if (oxqVar == null) {
                        oxqVar = new oxq(i2);
                    }
                    oxrVar2.f46793g.m15486i(oxrVar2.f46791e & i2).m18855c(oxqVar);
                    i2++;
                }
            }
            oxrVar2.f46788b.f46394b = lku.m15642ak(j, 1152921504606846976L);
            opnVar2.m18856d(null, oxrVar2);
        }
    }
}
