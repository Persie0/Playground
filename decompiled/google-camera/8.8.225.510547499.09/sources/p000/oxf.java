package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxf extends orb implements omg, ols {

    /* JADX INFO: renamed from: a */
    public final oqo f46765a;

    /* JADX INFO: renamed from: b */
    public final ols f46766b;

    /* JADX INFO: renamed from: c */
    public Object f46767c;

    /* JADX INFO: renamed from: d */
    public final Object f46768d;

    /* JADX INFO: renamed from: e */
    public final opn f46769e;

    public oxf(oqo oqoVar, ols olsVar) {
        super(-1);
        this.f46765a = oqoVar;
        this.f46766b = olsVar;
        this.f46767c = oxg.f46770a;
        this.f46768d = oyb.m19164a(mo18639d());
        this.f46769e = ook.m18796j(null);
    }

    @Override // p000.omg
    /* JADX INFO: renamed from: cM */
    public final StackTraceElement mo18652cM() {
        return null;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        return this.f46766b.mo18639d();
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: e */
    public final void mo18640e(Object obj) {
        oly olyVarMo18639d = this.f46766b.mo18639d();
        Object objM18770H = ook.m18770H(obj);
        if (this.f46765a.mo18916e(olyVarMo18639d)) {
            this.f46767c = objM18770H;
            this.f46444f = 0;
            this.f46765a.mo18915d(olyVarMo18639d, this);
            return;
        }
        boolean z = oqu.f46432a;
        ThreadLocal threadLocal = oss.f46499a;
        orj orjVarM19021a = oss.m19021a();
        if (orjVarM19021a.m18957n()) {
            this.f46767c = objM18770H;
            this.f46444f = 0;
            orjVarM19021a.m18955l(this);
            return;
        }
        orjVarM19021a.m18956m(true);
        try {
            oly olyVarMo18639d2 = mo18639d();
            Object objM19165b = oyb.m19165b(olyVarMo18639d2, this.f46768d);
            try {
                this.f46766b.mo18640e(obj);
                oyb.m19166c(olyVarMo18639d2, objM19165b);
                while (orjVarM19021a.m18958o()) {
                }
            } catch (Throwable th) {
                oyb.m19166c(olyVarMo18639d2, objM19165b);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m18946B(th2, null);
            } finally {
                orjVarM19021a.m18954k(true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ols, omg] */
    @Override // p000.omg
    /* JADX INFO: renamed from: g */
    public final omg mo18653g() {
        return this.f46766b;
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: p */
    public final Object mo18890p() {
        Object obj = this.f46767c;
        boolean z = oqu.f46432a;
        this.f46767c = oxg.f46770a;
        return obj;
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: r */
    public final ols mo18892r() {
        return this;
    }

    public final String toString() {
        return NptsKnlVczSZ.xLGT + this.f46765a + ", " + oqv.m18922c(this.f46766b) + "]";
    }

    @Override // p000.orb
    /* JADX INFO: renamed from: u */
    public final void mo18895u(Object obj, Throwable th) {
        if (obj instanceof oqh) {
            oni oniVar = ((oqh) obj).f46423a;
            throw null;
        }
    }
}
