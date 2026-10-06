package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ikc extends jvh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mrm f31332a;

    public ikc(mrm mrmVar) {
        this.f31332a = mrmVar;
    }

    @Override // p000.jvh
    /* JADX INFO: renamed from: a */
    public final boolean mo11402a(ihk ihkVar) {
        mrm mrmVar = this.f31332a;
        if (!mrmVar.mo16813g()) {
            return false;
        }
        dbg dbgVarMo5846a = ((dax) mrmVar.mo16809c()).mo5846a();
        if (!dbgVarMo5846a.mo5872c()) {
            return false;
        }
        dbe dbeVar = (dbe) dbgVarMo5846a;
        if (jvh.m13571s(ihkVar.m11339d(), dbeVar.f10367b.mo6184l(dib.f11361co) ? dbeVar.f10371f.getContentView() : dbeVar.f10368c.f7093a)) {
            return false;
        }
        dbgVarMo5846a.mo5871b();
        return true;
    }
}
