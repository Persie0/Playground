package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: zf */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1171zf {

    /* JADX INFO: renamed from: a */
    public static int f48330a;

    /* JADX INFO: renamed from: b */
    AbstractC1174zi f48331b;

    /* JADX INFO: renamed from: c */
    final ArrayList f48332c = new ArrayList();

    public C1171zf(AbstractC1174zi abstractC1174zi) {
        this.f48331b = null;
        f48330a++;
        this.f48331b = abstractC1174zi;
    }

    /* JADX INFO: renamed from: a */
    public final long m19775a(C1164yz c1164yz, long j) {
        AbstractC1174zi abstractC1174zi = c1164yz.f48308d;
        if (abstractC1174zi instanceof C1169zd) {
            return j;
        }
        int size = c1164yz.f48314j.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1162yx interfaceC1162yx = (InterfaceC1162yx) c1164yz.f48314j.get(i);
            if (interfaceC1162yx instanceof C1164yz) {
                C1164yz c1164yz2 = (C1164yz) interfaceC1162yx;
                if (c1164yz2.f48308d != abstractC1174zi) {
                    jMin = Math.min(jMin, m19775a(c1164yz2, ((long) c1164yz2.f48309e) + j));
                }
            }
        }
        if (c1164yz != abstractC1174zi.f48348j) {
            return jMin;
        }
        long jMo19725a = j - abstractC1174zi.mo19725a();
        return Math.min(Math.min(jMin, m19775a(abstractC1174zi.f48347i, jMo19725a)), jMo19725a - ((long) abstractC1174zi.f48347i.f48309e));
    }

    /* JADX INFO: renamed from: b */
    public final long m19776b(C1164yz c1164yz, long j) {
        AbstractC1174zi abstractC1174zi = c1164yz.f48308d;
        if (abstractC1174zi instanceof C1169zd) {
            return j;
        }
        int size = c1164yz.f48314j.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1162yx interfaceC1162yx = (InterfaceC1162yx) c1164yz.f48314j.get(i);
            if (interfaceC1162yx instanceof C1164yz) {
                C1164yz c1164yz2 = (C1164yz) interfaceC1162yx;
                if (c1164yz2.f48308d != abstractC1174zi) {
                    jMax = Math.max(jMax, m19776b(c1164yz2, ((long) c1164yz2.f48309e) + j));
                }
            }
        }
        if (c1164yz != abstractC1174zi.f48347i) {
            return jMax;
        }
        long jMo19725a = j + abstractC1174zi.mo19725a();
        return Math.max(Math.max(jMax, m19776b(abstractC1174zi.f48348j, jMo19725a)), jMo19725a - ((long) abstractC1174zi.f48348j.f48309e));
    }
}
