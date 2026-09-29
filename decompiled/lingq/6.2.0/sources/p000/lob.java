package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f49952a = new C0282a(1917218223, false, new z70(23));

    /* JADX INFO: renamed from: a */
    public static final void m16417a(final e16 e16Var, final vx9 vx9Var, final ks9 ks9Var, long j, long j2, final String str, final String str2, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        final long j3;
        final long j4;
        long jM4215h;
        int i2;
        long j5;
        long j6;
        boolean z;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1260373666);
        int i3 = i | (tj3Var2.m22120g(e16Var) ? 4 : 2) | (tj3Var2.m22120g(vx9Var) ? 32 : 16) | (tj3Var2.m22120g(ks9Var) ? 256 : 128) | 9216 | (tj3Var2.m22120g(str) ? 131072 : 65536) | (tj3Var2.m22120g(str2) ? 1048576 : 524288);
        if (tj3Var2.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                long j7 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s;
                jM4215h = ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4215h();
                i2 = i3 & (-64513);
                j5 = j7;
            } else {
                tj3Var2.m22102U();
                i2 = i3 & (-64513);
                j5 = j;
                jM4215h = j2;
            }
            tj3Var2.m22140r();
            C3341mn c3341mn = new C3341mn();
            List listM23365A0 = vk9.m23365A0(str, new String[]{" "}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM23365A0) {
                if (!vk9.m23391n0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            boolean z2 = true;
            List listM23365A1 = vk9.m23365A0(str2, new String[]{" "}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listM23365A1) {
                if (!vk9.m23391n0((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            int i4 = 0;
            for (Object obj3 : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                String str3 = (String) obj3;
                tj3 tj3Var3 = tj3Var2;
                if (i4 <= arrayList2.size() + (-1) ? cl9.m4834Q(str3, (String) arrayList2.get(i4), z2) : false) {
                    int iM16932g = c3341mn.m16932g(new he9(j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        c3341mn.m16929d(str3);
                        if (i4 != arrayList.size() - 1) {
                            c3341mn.m16929d(" ");
                        }
                        c3341mn.m16931f(iM16932g);
                        j6 = jM4215h;
                        z = true;
                    } catch (Throwable th) {
                        c3341mn.m16931f(iM16932g);
                        throw th;
                    }
                } else {
                    long j8 = jM4215h;
                    j6 = j8;
                    int iM16932g2 = c3341mn.m16932g(new he9(j8, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        c3341mn.m16929d(str3);
                        z = true;
                        if (i4 != arrayList.size() - 1) {
                            c3341mn.m16929d(" ");
                        }
                        c3341mn.m16931f(iM16932g2);
                    } catch (Throwable th2) {
                        c3341mn.m16931f(iM16932g2);
                        throw th2;
                    }
                }
                j5 = j5;
                z2 = z;
                i4 = i5;
                jM4215h = j6;
                tj3Var2 = tj3Var3;
                i2 = i2;
            }
            tj3Var = tj3Var2;
            int i6 = i2;
            lw9.m16555c(c3341mn.m16933h(), e16Var, 0L, null, 0L, null, null, 0L, ks9Var, 0L, 0, false, 0, 0, null, null, vx9Var, tj3Var, (i6 << 3) & 112, ((i6 >> 6) & 14) | ((i6 << 21) & 234881024), 261116);
            j3 = j5;
            j4 = jM4215h;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            j3 = j;
            j4 = j2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(vx9Var, ks9Var, j3, j4, str, str2, i) { // from class: er5

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vx9 f37746b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ks9 f37747c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f37748d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f37749e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ String f37750f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ String f37751g;

                @Override // p000.zi3
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iM19383z = pk9.m19383z(1);
                    lob.m16417a(this.f37745a, this.f37746b, this.f37747c, this.f37748d, this.f37749e, this.f37750f, this.f37751g, (ye1) obj4, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
