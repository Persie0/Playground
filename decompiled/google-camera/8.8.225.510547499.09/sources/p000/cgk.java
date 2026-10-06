package p000;

import android.content.Context;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgk implements ipm {

    /* JADX INFO: renamed from: a */
    private final Context f5617a;

    /* JADX INFO: renamed from: b */
    private cgr f5618b;

    public cgk(Context context) {
        this.f5617a = context;
    }

    @Override // p000.ipm
    /* JADX INFO: renamed from: a */
    public final synchronized ipk mo3626a(ipo ipoVar) {
        cgr cgrVar;
        cgr cgrVar2 = this.f5618b;
        if (cgrVar2 != null) {
            cgrVar2.close();
        }
        nbz nbzVar = nch.f41987a;
        cgrVar = new cgr(ipoVar.mo11583b(), this.f5617a);
        this.f5618b = cgrVar;
        return cgrVar;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3627b() {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3656e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3628c() {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3657f();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3629d() {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3658g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3630e(kpw kpwVar, RectF rectF, boolean z) {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3659h(kpwVar, rectF, z);
        } else {
            nbz nbzVar = nch.f41987a;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m3631f(cgq cgqVar) {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3660i(cgqVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m3632g(cgt cgtVar) {
        cgr cgrVar = this.f5618b;
        if (cgrVar != null) {
            cgrVar.m3661j(cgtVar);
        }
    }
}
