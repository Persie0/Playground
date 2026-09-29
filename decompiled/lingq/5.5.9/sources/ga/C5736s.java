package ga;

import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.common.collect.ImmutableList;
import ge.C5789m;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: ga.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5736s implements InterfaceC2409f {

    /* JADX INFO: renamed from: d */
    public static final C5736s f34805d = new C5736s(new C5735r[0]);

    /* JADX INFO: renamed from: e */
    public static final String f34806e = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: f */
    public static final C5789m f34807f = new C5789m(16);

    /* JADX INFO: renamed from: a */
    public final int f34808a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<C5735r> f34809b;

    /* JADX INFO: renamed from: c */
    public int f34810c;

    public C5736s(C5735r... c5735rArr) {
        this.f34809b = ImmutableList.m9061U(c5735rArr);
        this.f34808a = c5735rArr.length;
        int i10 = 0;
        while (true) {
            ImmutableList<C5735r> immutableList = this.f34809b;
            if (i10 >= immutableList.size()) {
                return;
            }
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < immutableList.size(); i12++) {
                if (immutableList.get(i10).equals(immutableList.get(i12))) {
                    C10145n.m19096d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C5735r m12091a(int i10) {
        return this.f34809b.get(i10);
    }

    /* JADX INFO: renamed from: b */
    public final int m12092b(C5735r c5735r) {
        int iIndexOf = this.f34809b.indexOf(c5735r);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5736s.class != obj.getClass()) {
            return false;
        }
        C5736s c5736s = (C5736s) obj;
        return this.f34808a == c5736s.f34808a && this.f34809b.equals(c5736s.f34809b);
    }

    public final int hashCode() {
        if (this.f34810c == 0) {
            this.f34810c = this.f34809b.hashCode();
        }
        return this.f34810c;
    }
}
