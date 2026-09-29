package p483xe;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: xe.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10181d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10182e f51498a;

    public C10181d(C10182e c10182e) {
        this.f51498a = c10182e;
    }

    /* JADX INFO: renamed from: a */
    public final void m19192a(Object obj, Writer writer) throws IOException {
        C10182e c10182e = this.f51498a;
        C10183f c10183f = new C10183f(writer, c10182e.f51503a, c10182e.f51504b, c10182e.f51505c, c10182e.f51506d);
        c10183f.m19194g(obj);
        c10183f.m19196i();
        c10183f.f51509b.flush();
    }
}
