package p453w9;

import com.google.android.exoplayer2.C2416m;
import java.util.List;
import p261m9.C7501b;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9854e0 {

    /* JADX INFO: renamed from: a */
    public final List<C2416m> f50154a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7522w[] f50155b;

    public C9854e0(List<C2416m> list) {
        this.f50154a = list;
        this.f50155b = new InterfaceC7522w[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m18351a(long j10, C10151t c10151t) {
        if (c10151t.f51440c - c10151t.f51439b < 9) {
            return;
        }
        int iM19129d = c10151t.m19129d();
        int iM19129d2 = c10151t.m19129d();
        int iM19145t = c10151t.m19145t();
        if (iM19129d == 434 && iM19129d2 == 1195456820 && iM19145t == 3) {
            C7501b.m14991b(j10, c10151t, this.f50155b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18352b(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        int i10 = 0;
        while (true) {
            InterfaceC7522w[] interfaceC7522wArr = this.f50155b;
            if (i10 >= interfaceC7522wArr.length) {
                return;
            }
            dVar.m18348a();
            dVar.m18349b();
            InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 3);
            C2416m c2416m = this.f50154a.get(i10);
            String str = c2416m.f12484l;
            C10129a.m18989a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C2416m.a aVar = new C2416m.a();
            dVar.m18349b();
            aVar.f12491a = dVar.f50141e;
            aVar.f12501k = str;
            aVar.f12494d = c2416m.f12476d;
            aVar.f12493c = c2416m.f12474c;
            aVar.f12487C = c2416m.f12468Y;
            aVar.f12503m = c2416m.f12452I;
            interfaceC7522wMo7366q.mo7388f(new C2416m(aVar));
            interfaceC7522wArr[i10] = interfaceC7522wMo7366q;
            i10++;
        }
    }
}
