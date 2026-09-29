package p453w9;

import com.google.android.exoplayer2.C2416m;
import java.util.Collections;
import java.util.List;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9858i implements InterfaceC9859j {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC9852d0.a> f50191a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7522w[] f50192b;

    /* JADX INFO: renamed from: c */
    public boolean f50193c;

    /* JADX INFO: renamed from: d */
    public int f50194d;

    /* JADX INFO: renamed from: e */
    public int f50195e;

    /* JADX INFO: renamed from: f */
    public long f50196f = -9223372036854775807L;

    public C9858i(List<InterfaceC9852d0.a> list) {
        this.f50191a = list;
        this.f50192b = new InterfaceC7522w[list.size()];
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: a */
    public final void mo18336a(C10151t c10151t) {
        boolean z10;
        boolean z11;
        if (this.f50193c) {
            if (this.f50194d == 2) {
                if (c10151t.f51440c - c10151t.f51439b == 0) {
                    z11 = false;
                } else {
                    if (c10151t.m19145t() != 32) {
                        this.f50193c = false;
                    }
                    this.f50194d--;
                    z11 = this.f50193c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f50194d == 1) {
                if (c10151t.f51440c - c10151t.f51439b == 0) {
                    z10 = false;
                } else {
                    if (c10151t.m19145t() != 0) {
                        this.f50193c = false;
                    }
                    this.f50194d--;
                    z10 = this.f50193c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = c10151t.f51439b;
            int i11 = c10151t.f51440c - i10;
            for (InterfaceC7522w interfaceC7522w : this.f50192b) {
                c10151t.m19124E(i10);
                interfaceC7522w.m15021c(i11, c10151t);
            }
            this.f50195e += i11;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: b */
    public final void mo18337b() {
        this.f50193c = false;
        this.f50196f = -9223372036854775807L;
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: c */
    public final void mo18338c() {
        if (this.f50193c) {
            if (this.f50196f != -9223372036854775807L) {
                for (InterfaceC7522w interfaceC7522w : this.f50192b) {
                    interfaceC7522w.mo7387e(this.f50196f, 1, this.f50195e, 0, null);
                }
            }
            this.f50193c = false;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: d */
    public final void mo18339d(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        int i10 = 0;
        while (true) {
            InterfaceC7522w[] interfaceC7522wArr = this.f50192b;
            if (i10 >= interfaceC7522wArr.length) {
                return;
            }
            InterfaceC9852d0.a aVar = this.f50191a.get(i10);
            dVar.m18348a();
            dVar.m18349b();
            InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 3);
            C2416m.a aVar2 = new C2416m.a();
            dVar.m18349b();
            aVar2.f12491a = dVar.f50141e;
            aVar2.f12501k = "application/dvbsubs";
            aVar2.f12503m = Collections.singletonList(aVar.f50133b);
            aVar2.f12493c = aVar.f50132a;
            interfaceC7522wMo7366q.mo7388f(new C2416m(aVar2));
            interfaceC7522wArr[i10] = interfaceC7522wMo7366q;
            i10++;
        }
    }

    @Override // p453w9.InterfaceC9859j
    /* JADX INFO: renamed from: e */
    public final void mo18340e(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f50193c = true;
        if (j10 != -9223372036854775807L) {
            this.f50196f = j10;
        }
        this.f50195e = 0;
        this.f50194d = 2;
    }
}
