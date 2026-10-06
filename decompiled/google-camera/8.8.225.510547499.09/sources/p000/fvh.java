package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvh {

    /* JADX INFO: renamed from: a */
    public final Map f23627a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final nqf f23628b = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public nqf f23629c = nqf.m17621g();

    public fvh(mxk mxkVar) {
        Collection$EL.forEach(mxkVar, new dco(this, 20));
    }

    /* JADX INFO: renamed from: c */
    private final void m8827c() {
        if (Collections.frequency(this.f23627a.values(), true) == 1) {
            this.f23629c.mo14894e(true);
        } else {
            this.f23629c.cancel(false);
            this.f23629c = nqf.m17621g();
        }
    }

    /* JADX INFO: renamed from: a */
    final void m8828a(String str) {
        if (this.f23627a.containsKey(str)) {
            this.f23627a.put(str, true);
            m8827c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8829b(String str) {
        if (this.f23627a.containsKey(str)) {
            this.f23627a.put(str, false);
            m8827c();
        }
    }
}
