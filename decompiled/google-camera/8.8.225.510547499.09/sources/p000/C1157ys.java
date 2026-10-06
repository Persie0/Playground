package p000;

/* JADX INFO: renamed from: ys */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1157ys {

    /* JADX INFO: renamed from: a */
    static final boolean[] f48283a = new boolean[3];

    /* JADX INFO: renamed from: a */
    static void m19720a(C1153yo c1153yo, C1141yc c1141yc, C1152yn c1152yn) {
        c1152yn.f48243q = -1;
        c1152yn.f48244r = -1;
        if (c1153yo.f48229ar[0] != 2 && c1152yn.f48229ar[0] == 4) {
            C1151ym c1151ym = c1152yn.f48195K;
            int i = c1151ym.f48182g;
            int iM19689j = c1153yo.m19689j() - c1152yn.f48197M.f48182g;
            c1151ym.f48184i = c1141yc.m19623b(c1151ym);
            C1151ym c1151ym2 = c1152yn.f48197M;
            c1151ym2.f48184i = c1141yc.m19623b(c1151ym2);
            c1141yc.m19627f(c1152yn.f48195K.f48184i, i);
            c1141yc.m19627f(c1152yn.f48197M.f48184i, iM19689j);
            c1152yn.f48243q = 2;
            c1152yn.f48212aa = i;
            int i2 = iM19689j - i;
            c1152yn.f48207W = i2;
            int i3 = c1152yn.f48215ad;
            if (i2 < i3) {
                c1152yn.f48207W = i3;
            }
        }
        if (c1153yo.f48229ar[1] == 2 || c1152yn.f48229ar[1] != 4) {
            return;
        }
        C1151ym c1151ym3 = c1152yn.f48196L;
        int i4 = c1151ym3.f48182g;
        int iM19687h = c1153yo.m19687h() - c1152yn.f48198N.f48182g;
        c1151ym3.f48184i = c1141yc.m19623b(c1151ym3);
        C1151ym c1151ym4 = c1152yn.f48198N;
        c1151ym4.f48184i = c1141yc.m19623b(c1151ym4);
        c1141yc.m19627f(c1152yn.f48196L.f48184i, i4);
        c1141yc.m19627f(c1152yn.f48198N.f48184i, iM19687h);
        if (c1152yn.f48214ac > 0 || c1152yn.f48220ai == 8) {
            C1151ym c1151ym5 = c1152yn.f48199O;
            c1151ym5.f48184i = c1141yc.m19623b(c1151ym5);
            c1141yc.m19627f(c1152yn.f48199O.f48184i, c1152yn.f48214ac + i4);
        }
        c1152yn.f48244r = 2;
        c1152yn.f48213ab = i4;
        int i5 = iM19687h - i4;
        c1152yn.f48208X = i5;
        int i6 = c1152yn.f48216ae;
        if (i5 < i6) {
            c1152yn.f48208X = i6;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19721b(int i, int i2) {
        return (i & i2) == i2;
    }
}
