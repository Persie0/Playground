package p387t0;

import android.graphics.Shader;
import dm.C5207g;
import p375s0.C8944f;

/* JADX INFO: renamed from: t0.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9150i0 extends AbstractC9161o {

    /* JADX INFO: renamed from: a */
    public Shader f47674a;

    /* JADX INFO: renamed from: b */
    public long f47675b;

    public AbstractC9150i0() {
        int i10 = C8944f.f46908d;
        this.f47675b = C8944f.f46907c;
    }

    @Override // p387t0.AbstractC9161o
    /* JADX INFO: renamed from: a */
    public final void mo17468a(float f3, long j10, C9147h c9147h) {
        C5207g.m11111f(c9147h, "p");
        Shader shaderMo17469b = this.f47674a;
        if (shaderMo17469b == null || !C8944f.m17174a(this.f47675b, j10)) {
            shaderMo17469b = mo17469b();
            this.f47674a = shaderMo17469b;
            this.f47675b = j10;
        }
        long jM17441c = c9147h.m17441c();
        long j11 = C9169u.f47699b;
        if (!C9169u.m17497c(jM17441c, j11)) {
            c9147h.m17444f(j11);
        }
        if (!C5207g.m11106a(c9147h.f47653c, shaderMo17469b)) {
            c9147h.m17446h(shaderMo17469b);
        }
        if (c9147h.m17440b() == f3) {
            return;
        }
        c9147h.m17442d(f3);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo17469b();
}
