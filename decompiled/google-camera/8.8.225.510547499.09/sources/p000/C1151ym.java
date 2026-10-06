package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1151ym {

    /* JADX INFO: renamed from: b */
    public int f48177b;

    /* JADX INFO: renamed from: c */
    public boolean f48178c;

    /* JADX INFO: renamed from: d */
    public final C1152yn f48179d;

    /* JADX INFO: renamed from: e */
    public final EnumC1150yl f48180e;

    /* JADX INFO: renamed from: f */
    public C1151ym f48181f;

    /* JADX INFO: renamed from: i */
    public C1146yh f48184i;

    /* JADX INFO: renamed from: a */
    public HashSet f48176a = null;

    /* JADX INFO: renamed from: g */
    public int f48182g = 0;

    /* JADX INFO: renamed from: h */
    int f48183h = Integer.MIN_VALUE;

    public C1151ym(C1152yn c1152yn, EnumC1150yl enumC1150yl) {
        this.f48179d = c1152yn;
        this.f48180e = enumC1150yl;
    }

    /* JADX INFO: renamed from: a */
    public final int m19650a() {
        if (this.f48178c) {
            return this.f48177b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m19651b() {
        C1151ym c1151ym;
        if (this.f48179d.f48220ai == 8) {
            return 0;
        }
        int i = this.f48183h;
        return (i == Integer.MIN_VALUE || (c1151ym = this.f48181f) == null || c1151ym.f48179d.f48220ai != 8) ? this.f48182g : i;
    }

    /* JADX INFO: renamed from: c */
    public final void m19652c(int i, ArrayList arrayList, C1173zh c1173zh) {
        HashSet hashSet = this.f48176a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0993sq.m19413h(((C1151ym) it.next()).f48179d, i, arrayList, c1173zh);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19653d() {
        HashSet hashSet;
        C1151ym c1151ym = this.f48181f;
        if (c1151ym != null && (hashSet = c1151ym.f48176a) != null) {
            hashSet.remove(this);
            if (this.f48181f.f48176a.size() == 0) {
                this.f48181f.f48176a = null;
            }
        }
        this.f48176a = null;
        this.f48181f = null;
        this.f48182g = 0;
        this.f48183h = Integer.MIN_VALUE;
        this.f48178c = false;
        this.f48177b = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m19654e(int i) {
        this.f48177b = i;
        this.f48178c = true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19655f() {
        C1151ym c1151ym;
        HashSet<C1151ym> hashSet = this.f48176a;
        if (hashSet == null) {
            return false;
        }
        for (C1151ym c1151ym2 : hashSet) {
            EnumC1150yl enumC1150yl = EnumC1150yl.NONE;
            switch (c1151ym2.f48180e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    c1151ym = null;
                    break;
                case 1:
                    c1151ym = c1151ym2.f48179d.f48197M;
                    break;
                case 2:
                    c1151ym = c1151ym2.f48179d.f48198N;
                    break;
                case 3:
                    c1151ym = c1151ym2.f48179d.f48195K;
                    break;
                case 4:
                    c1151ym = c1151ym2.f48179d.f48196L;
                    break;
                default:
                    throw new AssertionError(c1151ym2.f48180e.name());
            }
            if (c1151ym.m19657h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m19656g() {
        HashSet hashSet = this.f48176a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19657h() {
        return this.f48181f != null;
    }

    /* JADX INFO: renamed from: i */
    public final void m19658i() {
        C1146yh c1146yh = this.f48184i;
        if (c1146yh == null) {
            this.f48184i = new C1146yh(1);
        } else {
            c1146yh.m19641c();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m19659j(C1151ym c1151ym, int i, int i2) {
        if (c1151ym == null) {
            m19653d();
            return;
        }
        this.f48181f = c1151ym;
        if (c1151ym.f48176a == null) {
            c1151ym.f48176a = new HashSet();
        }
        HashSet hashSet = this.f48181f.f48176a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f48182g = i;
        this.f48183h = i2;
    }

    public final String toString() {
        return this.f48179d.f48221aj + ":" + this.f48180e.toString();
    }
}
