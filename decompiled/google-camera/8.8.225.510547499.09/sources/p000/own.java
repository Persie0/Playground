package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class own extends omf implements ous, omg {

    /* JADX INFO: renamed from: a */
    public final ous f46724a;

    /* JADX INFO: renamed from: b */
    public final oly f46725b;

    /* JADX INFO: renamed from: c */
    public final int f46726c;

    /* JADX INFO: renamed from: d */
    private oly f46727d;

    /* JADX INFO: renamed from: e */
    private omf f46728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public own(ous ousVar, oly olyVar) {
        super(owk.f46720a, olz.f46282a);
        ousVar.getClass();
        this.f46724a = ousVar;
        this.f46725b = olyVar;
        this.f46726c = ((Number) olyVar.fold(0, olx.f46277f)).intValue();
    }

    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        try {
            oly olyVarMo18639d = olsVar.mo18639d();
            ooc.m18755u(olyVarMo18639d);
            oly olyVar = this.f46727d;
            if (olyVar != olyVarMo18639d) {
                if (olyVar instanceof owj) {
                    throw new IllegalStateException(ook.m18798l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((owj) olyVar).f46718a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                olyVarMo18639d.getClass();
                if (((Number) olyVarMo18639d.fold(0, new owq(this, 0))).intValue() != this.f46726c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.f46725b + ",\n\t\tbut emission happened in " + olyVarMo18639d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.f46727d = olyVarMo18639d;
            }
            this.f46728e = (omf) olsVar;
            Object objMo16102a = owp.f46730a.mo16102a(this.f46724a, obj, this);
            if (!ooc.m18737c(objMo16102a, oma.COROUTINE_SUSPENDED)) {
                this.f46728e = null;
            }
            return objMo16102a == oma.COROUTINE_SUSPENDED ? objMo16102a : oki.f46196a;
        } catch (Throwable th) {
            this.f46727d = new owj(th, olsVar.mo18639d());
            throw th;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        Throwable thM18589a = okd.m18589a(obj);
        if (thM18589a != null) {
            this.f46727d = new owj(thM18589a, mo18639d());
        }
        omf omfVar = this.f46728e;
        if (omfVar != null) {
            omfVar.mo18640e(obj);
        }
        return oma.COROUTINE_SUSPENDED;
    }

    @Override // p000.omd, p000.omg
    /* JADX INFO: renamed from: cM */
    public final StackTraceElement mo18652cM() {
        return null;
    }

    @Override // p000.omf, p000.ols
    /* JADX INFO: renamed from: d */
    public final oly mo18639d() {
        oly olyVar = this.f46727d;
        return olyVar == null ? olz.f46282a : olyVar;
    }

    @Override // p000.omd, p000.omg
    /* JADX INFO: renamed from: g */
    public final omg mo18653g() {
        omf omfVar = this.f46728e;
        if (omfVar instanceof omg) {
            return omfVar;
        }
        return null;
    }

    @Override // p000.omf, p000.omd
    /* JADX INFO: renamed from: h */
    public final void mo18654h() {
        super.mo18654h();
    }
}
