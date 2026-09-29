package p453w9;

import com.google.android.exoplayer2.C2416m;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10130a0;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C9868s implements InterfaceC9873x {

    /* JADX INFO: renamed from: a */
    public C2416m f50365a;

    /* JADX INFO: renamed from: b */
    public C10130a0 f50366b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7522w f50367c;

    public C9868s(String str) {
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = str;
        this.f50365a = new C2416m(aVar);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p453w9.InterfaceC9873x
    /* JADX INFO: renamed from: a */
    public final void mo18342a(C10151t c10151t) {
        long jM19005c;
        long j10;
        C10129a.m18993e(this.f50366b);
        int i10 = C10134c0.f51354a;
        C10130a0 c10130a0 = this.f50366b;
        synchronized (c10130a0) {
            long j11 = c10130a0.f51351c;
            jM19005c = j11 != -9223372036854775807L ? j11 + c10130a0.f51350b : c10130a0.m19005c();
        }
        C10130a0 c10130a1 = this.f50366b;
        synchronized (c10130a1) {
            try {
                j10 = c10130a1.f51350b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jM19005c != -9223372036854775807L && j10 != -9223372036854775807L) {
            C2416m c2416m = this.f50365a;
            if (j10 != c2416m.f12454K) {
                C2416m.a aVar = new C2416m.a(c2416m);
                aVar.f12505o = j10;
                C2416m c2416m2 = new C2416m(aVar);
                this.f50365a = c2416m2;
                this.f50367c.mo7388f(c2416m2);
            }
            int i11 = c10151t.f51440c - c10151t.f51439b;
            this.f50367c.m15021c(i11, c10151t);
            this.f50367c.mo7387e(jM19005c, 1, i11, 0, null);
        }
    }

    @Override // p453w9.InterfaceC9873x
    /* JADX INFO: renamed from: c */
    public final void mo18343c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        this.f50366b = c10130a0;
        dVar.m18348a();
        dVar.m18349b();
        InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 5);
        this.f50367c = interfaceC7522wMo7366q;
        interfaceC7522wMo7366q.mo7388f(this.f50365a);
    }
}
