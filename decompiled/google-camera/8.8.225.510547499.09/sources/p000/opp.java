package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class opp extends osg implements ory, ols, oqs {

    /* JADX INFO: renamed from: a */
    public final oly f46400a;

    public opp(oly olyVar) {
        m19003C((ory) olyVar.get(ory.f46473c));
        this.f46400a = olyVar.plus(this);
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: a */
    protected final String mo18857a() {
        return String.valueOf(oqv.m18920a(this)).concat(" was cancelled");
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: cR */
    public String mo18858cR() {
        oqq oqqVar;
        oly olyVar = this.f46400a;
        olyVar.getClass();
        String str = null;
        if (oqu.f46432a && (oqqVar = (oqq) olyVar.get(oqq.f46428b)) != null) {
            oqr oqrVar = (oqr) olyVar.get(oqr.f46430b);
            String str2 = oqrVar != null ? oqrVar.f46431a : "coroutine";
            str = str2 + "#" + oqqVar.f46429a;
        }
        if (str == null) {
            return oqv.m18920a(this);
        }
        return "\"" + str + "\":" + oqv.m18920a(this);
    }

    @Override // p000.oqs
    /* JADX INFO: renamed from: cS */
    public final oly mo18859cS() {
        return this.f46400a;
    }

    /* JADX INFO: renamed from: cT */
    protected void mo18860cT(Object obj) {
    }

    /* JADX INFO: renamed from: cU */
    public final void m18861cU(int i, Object obj, onm onmVar) {
        switch (i - 1) {
            case 0:
                lku.m15636ae(onmVar, obj, this);
                break;
            case 2:
                omn.m18701f(omn.m18700e(onmVar, obj, this)).mo18640e(oki.f46196a);
                break;
        }
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        return this.f46400a;
    }

    @Override // p000.ols
    /* JADX INFO: renamed from: e */
    public final void mo18640e(Object obj) {
        Object objM19011cW = m19011cW(ook.m18770H(obj));
        if (objM19011cW == osh.f46491b) {
            return;
        }
        mo18862h(objM19011cW);
    }

    /* JADX INFO: renamed from: h */
    protected void mo18862h(Object obj) {
        mo18867f(obj);
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: i */
    public final void mo18863i(Throwable th) {
        oqv.m18928i(this.f46400a, th);
    }

    /* JADX INFO: renamed from: j */
    protected void mo18864j(Throwable th, boolean z) {
    }

    @Override // p000.osg
    /* JADX INFO: renamed from: l */
    protected final void mo18865l(Object obj) {
        if (!(obj instanceof oqg)) {
            mo18860cT(obj);
        } else {
            oqg oqgVar = (oqg) obj;
            mo18864j(oqgVar.f46421b, oqgVar.f46422c.m18842a());
        }
    }
}
