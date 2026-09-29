package so;

import dm.C5206f;
import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import p124fp.C5616m;
import p124fp.C5618o;
import p124fp.C5628y;
import p124fp.InterfaceC5609f;

/* JADX INFO: renamed from: so.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C9102t extends AbstractC9105w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9098p f47553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f47554b;

    public C9102t(File file, C9098p c9098p) {
        this.f47553a = c9098p;
        this.f47554b = file;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: a */
    public final long mo13145a() {
        return this.f47554b.length();
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: b */
    public final C9098p mo13146b() {
        return this.f47553a;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: c */
    public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
        Logger logger = C5618o.f34451a;
        File file = this.f47554b;
        C5207g.m11111f(file, "<this>");
        C5616m c5616m = new C5616m(new FileInputStream(file), C5628y.f34474d);
        try {
            interfaceC5609f.mo11940O0(c5616m);
            C5206f.m11032z0(c5616m, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(c5616m, th2);
                throw th3;
            }
        }
    }
}
