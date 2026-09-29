package p293o9;

import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: o9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8023e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7522w f43639a;

    /* JADX INFO: renamed from: b */
    public final int f43640b;

    /* JADX INFO: renamed from: c */
    public final int f43641c;

    /* JADX INFO: renamed from: d */
    public final long f43642d;

    /* JADX INFO: renamed from: e */
    public final int f43643e;

    /* JADX INFO: renamed from: f */
    public int f43644f;

    /* JADX INFO: renamed from: g */
    public int f43645g;

    /* JADX INFO: renamed from: h */
    public int f43646h;

    /* JADX INFO: renamed from: i */
    public int f43647i;

    /* JADX INFO: renamed from: j */
    public int f43648j;

    /* JADX INFO: renamed from: k */
    public long[] f43649k;

    /* JADX INFO: renamed from: l */
    public int[] f43650l;

    public C8023e(int i10, int i11, long j10, int i12, InterfaceC7522w interfaceC7522w) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        C10129a.m18990b(z10);
        this.f43642d = j10;
        this.f43643e = i12;
        this.f43639a = interfaceC7522w;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f43640b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f43641c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f43649k = new long[512];
        this.f43650l = new int[512];
    }

    /* JADX INFO: renamed from: a */
    public final C7521v m15895a(int i10) {
        return new C7521v(((this.f43642d * ((long) 1)) / ((long) this.f43643e)) * ((long) this.f43650l[i10]), this.f43649k[i10]);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7520u.a m15896b(long j10) {
        int i10 = (int) (j10 / ((this.f43642d * ((long) 1)) / ((long) this.f43643e)));
        int iM19038e = C10134c0.m19038e(this.f43650l, i10, true, true);
        if (this.f43650l[iM19038e] == i10) {
            C7521v c7521vM15895a = m15895a(iM19038e);
            return new InterfaceC7520u.a(c7521vM15895a, c7521vM15895a);
        }
        C7521v c7521vM15895a2 = m15895a(iM19038e);
        int i11 = iM19038e + 1;
        return i11 < this.f43649k.length ? new InterfaceC7520u.a(c7521vM15895a2, m15895a(i11)) : new InterfaceC7520u.a(c7521vM15895a2, c7521vM15895a2);
    }
}
