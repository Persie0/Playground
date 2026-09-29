package p453w9;

import com.kochava.tracker.BuildConfig;
import p261m9.InterfaceC7509j;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C9874y implements InterfaceC9852d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9873x f50408a;

    /* JADX INFO: renamed from: b */
    public final C10151t f50409b = new C10151t(32);

    /* JADX INFO: renamed from: c */
    public int f50410c;

    /* JADX INFO: renamed from: d */
    public int f50411d;

    /* JADX INFO: renamed from: e */
    public boolean f50412e;

    /* JADX INFO: renamed from: f */
    public boolean f50413f;

    public C9874y(InterfaceC9873x interfaceC9873x) {
        this.f50408a = interfaceC9873x;
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: a */
    public final void mo18344a(int i10, C10151t c10151t) {
        boolean z10 = (i10 & 1) != 0;
        int iM19145t = z10 ? c10151t.f51439b + c10151t.m19145t() : -1;
        if (this.f50413f) {
            if (!z10) {
                return;
            }
            this.f50413f = false;
            c10151t.m19124E(iM19145t);
            this.f50411d = 0;
        }
        while (true) {
            while (true) {
                int i11 = c10151t.f51440c;
                int i12 = c10151t.f51439b;
                if (i11 - i12 <= 0) {
                    return;
                }
                int i13 = this.f50411d;
                C10151t c10151t2 = this.f50409b;
                if (i13 >= 3) {
                    int iMin = Math.min(i11 - i12, this.f50410c - i13);
                    c10151t.m19127b(c10151t2.f51438a, this.f50411d, iMin);
                    int i14 = this.f50411d + iMin;
                    this.f50411d = i14;
                    int i15 = this.f50410c;
                    if (i14 != i15) {
                        break;
                    }
                    if (this.f50412e) {
                        byte[] bArr = c10151t2.f51438a;
                        int i16 = C10134c0.f51354a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i15; i18++) {
                            i17 = C10134c0.f51365l[((i17 >>> 24) ^ (bArr[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        if (i17 != 0) {
                            this.f50413f = true;
                            return;
                        }
                        c10151t2.m19123D(this.f50410c - 4);
                    } else {
                        c10151t2.m19123D(i15);
                    }
                    c10151t2.m19124E(0);
                    this.f50408a.mo18342a(c10151t2);
                    this.f50411d = 0;
                } else {
                    if (i13 == 0) {
                        int iM19145t2 = c10151t.m19145t();
                        c10151t.m19124E(c10151t.f51439b - 1);
                        if (iM19145t2 == 255) {
                            this.f50413f = true;
                            return;
                        }
                    }
                    int iMin2 = Math.min(c10151t.f51440c - c10151t.f51439b, 3 - this.f50411d);
                    c10151t.m19127b(c10151t2.f51438a, this.f50411d, iMin2);
                    int i19 = this.f50411d + iMin2;
                    this.f50411d = i19;
                    if (i19 != 3) {
                        break;
                    }
                    c10151t2.m19124E(0);
                    c10151t2.m19123D(3);
                    c10151t2.m19125F(1);
                    int iM19145t3 = c10151t2.m19145t();
                    int iM19145t4 = c10151t2.m19145t();
                    this.f50412e = (iM19145t3 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                    int i20 = (((iM19145t3 & 15) << 8) | iM19145t4) + 3;
                    this.f50410c = i20;
                    byte[] bArr2 = c10151t2.f51438a;
                    if (bArr2.length >= i20) {
                        break;
                    } else {
                        c10151t2.m19126a(Math.min(4098, Math.max(i20, bArr2.length * 2)));
                    }
                }
            }
        }
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: b */
    public final void mo18345b() {
        this.f50413f = true;
    }

    @Override // p453w9.InterfaceC9852d0
    /* JADX INFO: renamed from: c */
    public final void mo18346c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        this.f50408a.mo18343c(c10130a0, interfaceC7509j, dVar);
        this.f50413f = true;
    }
}
