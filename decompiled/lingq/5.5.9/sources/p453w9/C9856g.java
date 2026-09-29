package p453w9;

import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9856g implements InterfaceC9852d0.c {

    /* JADX INFO: renamed from: a */
    public final int f50178a;

    /* JADX INFO: renamed from: b */
    public final List<C2416m> f50179b;

    public C9856g(int i10, List<C2416m> list) {
        this.f50178a = i10;
        this.f50179b = list;
    }

    @Override // p453w9.InterfaceC9852d0.c
    /* JADX INFO: renamed from: a */
    public final InterfaceC9852d0 mo18347a(int i10, InterfaceC9852d0.b bVar) {
        if (i10 != 2) {
            String str = bVar.f50134a;
            if (i10 == 3 || i10 == 4) {
                return new C9869t(new C9866q(str));
            }
            if (i10 == 21) {
                return new C9869t(new C9864o());
            }
            if (i10 == 27) {
                if (m18355c(4)) {
                    return null;
                }
                return new C9869t(new C9862m(new C9875z(m18354b(bVar)), m18355c(1), m18355c(8)));
            }
            if (i10 == 36) {
                return new C9869t(new C9863n(new C9875z(m18354b(bVar))));
            }
            if (i10 == 89) {
                return new C9869t(new C9858i(bVar.f50135b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new C9869t(new C9851d(str));
                }
                if (i10 == 257) {
                    return new C9874y(new C9868s("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (m18355c(16)) {
                        return null;
                    }
                    return new C9874y(new C9868s("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (m18355c(2)) {
                                return null;
                            }
                            return new C9869t(new C9855f(str, false));
                        case 16:
                            return new C9869t(new C9861l(new C9854e0(m18354b(bVar))));
                        case 17:
                            if (m18355c(2)) {
                                return null;
                            }
                            return new C9869t(new C9865p(str));
                        default:
                            switch (i10) {
                                case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!m18355c(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new C9869t(new C9847b(str));
            }
            return new C9869t(new C9857h(str));
        }
        return new C9869t(new C9860k(new C9854e0(m18354b(bVar))));
    }

    /* JADX INFO: renamed from: b */
    public final List<C2416m> m18354b(InterfaceC9852d0.b bVar) {
        String str;
        int i10;
        boolean zM18355c = m18355c(32);
        List<C2416m> list = this.f50179b;
        if (zM18355c) {
            return list;
        }
        C10151t c10151t = new C10151t(bVar.f50136c);
        while (c10151t.f51440c - c10151t.f51439b > 0) {
            int iM19145t = c10151t.m19145t();
            int iM19145t2 = c10151t.f51439b + c10151t.m19145t();
            if (iM19145t == 134) {
                ArrayList arrayList = new ArrayList();
                int iM19145t3 = c10151t.m19145t() & 31;
                for (int i11 = 0; i11 < iM19145t3; i11++) {
                    String strM19142q = c10151t.m19142q(3);
                    int iM19145t4 = c10151t.m19145t();
                    boolean z10 = (iM19145t4 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                    if (z10) {
                        i10 = iM19145t4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bM19145t = (byte) c10151t.m19145t();
                    c10151t.m19125F(1);
                    List<byte[]> listSingletonList = z10 ? Collections.singletonList((bM19145t & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C2416m.a aVar = new C2416m.a();
                    aVar.f12501k = str;
                    aVar.f12493c = strM19142q;
                    aVar.f12487C = i10;
                    aVar.f12503m = listSingletonList;
                    arrayList.add(new C2416m(aVar));
                }
                list = arrayList;
            }
            c10151t.m19124E(iM19145t2);
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18355c(int i10) {
        return (i10 & this.f50178a) != 0;
    }
}
