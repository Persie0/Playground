package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52079a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f52080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f52081c;

    public /* synthetic */ mz5(long j, boolean z) {
        this.f52081c = j;
        this.f52080b = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f52079a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f52080b;
        switch (i) {
            case 0:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                if (z) {
                    c3500qjM22757a.m19989f(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) / 2.0f, 0.0f);
                    c3500qjM22757a.m19988e(0.0f, Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                    c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)), Float.intBitsToFloat((int) (4294967295L & interfaceC0310a.mo1422h())));
                } else {
                    c3500qjM22757a.m19989f(0.0f, 0.0f);
                    c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)), 0.0f);
                    c3500qjM22757a.m19988e(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) / 2.0f, Float.intBitsToFloat((int) (4294967295L & interfaceC0310a.mo1422h())));
                }
                c3500qjM22757a.f57839a.close();
                InterfaceC0310a.m1408A0(interfaceC0310a, c3500qjM22757a, this.f52081c, 0.0f, null, 60);
                break;
            default:
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                interfaceC0310a2.getClass();
                long j = this.f52081c;
                if (!z) {
                    InterfaceC0310a.m1417c0(interfaceC0310a2, j, 0.0f, 0L, 0.0f, new el9(interfaceC0310a2.mo912g0(2.0f), 0.0f, 0, 0, 30), 110);
                } else {
                    InterfaceC0310a.m1417c0(interfaceC0310a2, j, 0.0f, 0L, 0.0f, null, 126);
                    C3500qj c3500qjM22757a2 = AbstractC3650uj.m22757a();
                    c3500qjM22757a2.m19989f(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) * 0.25f, Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) * 0.5f);
                    c3500qjM22757a2.m19988e(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) * 0.45f, Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) * 0.7f);
                    c3500qjM22757a2.m19988e(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) * 0.75f, Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)) * 0.35f);
                    InterfaceC0310a.m1408A0(interfaceC0310a2, c3500qjM22757a2, aa1.f406e, 0.0f, new el9(interfaceC0310a2.mo912g0(2.0f), 0.0f, 1, 0, 26), 52);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ mz5(boolean z, long j) {
        this.f52080b = z;
        this.f52081c = j;
    }
}
