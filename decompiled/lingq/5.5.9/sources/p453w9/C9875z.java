package p453w9;

import com.google.android.exoplayer2.C2416m;
import java.util.List;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7522w;
import p479xa.C10129a;

/* JADX INFO: renamed from: w9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9875z {

    /* JADX INFO: renamed from: a */
    public final List<C2416m> f50414a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7522w[] f50415b;

    public C9875z(List<C2416m> list) {
        this.f50414a = list;
        this.f50415b = new InterfaceC7522w[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m18370a(InterfaceC7509j interfaceC7509j, InterfaceC9852d0.d dVar) {
        int i10 = 0;
        while (true) {
            InterfaceC7522w[] interfaceC7522wArr = this.f50415b;
            if (i10 >= interfaceC7522wArr.length) {
                return;
            }
            dVar.m18348a();
            dVar.m18349b();
            InterfaceC7522w interfaceC7522wMo7366q = interfaceC7509j.mo7366q(dVar.f50140d, 3);
            C2416m c2416m = this.f50414a.get(i10);
            String str = c2416m.f12484l;
            C10129a.m18989a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c2416m.f12470a;
            if (str2 == null) {
                dVar.m18349b();
                str2 = dVar.f50141e;
            }
            C2416m.a aVar = new C2416m.a();
            aVar.f12491a = str2;
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
