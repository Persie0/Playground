package p518yo;

import java.io.IOException;
import p124fp.InterfaceC5610g;
import so.C9095m;

/* JADX INFO: renamed from: yo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10420a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5610g f52233a;

    /* JADX INFO: renamed from: b */
    public long f52234b = 262144;

    public C10420a(InterfaceC5610g interfaceC5610g) {
        this.f52233a = interfaceC5610g;
    }

    /* JADX INFO: renamed from: a */
    public final C9095m m19396a() throws IOException {
        C9095m.a aVar = new C9095m.a();
        while (true) {
            String strMo11946V = this.f52233a.mo11946V(this.f52234b);
            this.f52234b -= (long) strMo11946V.length();
            if (strMo11946V.length() == 0) {
                return aVar.m17314d();
            }
            aVar.m17312b(strMo11946V);
        }
    }
}
