package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xe5 extends ze5 {
    @Override // p000.ze5
    /* JADX INFO: renamed from: a */
    public final void mo23245a(Object obj, long j) {
        AbstractC3319m1 abstractC3319m1 = (AbstractC3319m1) ((m94) zga.f71556c.m23938i(obj, j));
        if (abstractC3319m1.f50407a) {
            abstractC3319m1.f50407a = false;
        }
    }

    @Override // p000.ze5
    /* JADX INFO: renamed from: b */
    public final void mo23246b(Object obj, Object obj2, long j) {
        wga wgaVar = zga.f71556c;
        m94 m94VarMutableCopyWithCapacity = (m94) wgaVar.m23938i(obj, j);
        m94 m94Var = (m94) wgaVar.m23938i(obj2, j);
        int size = m94VarMutableCopyWithCapacity.size();
        int size2 = m94Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC3319m1) m94VarMutableCopyWithCapacity).f50407a) {
                m94VarMutableCopyWithCapacity = m94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            m94VarMutableCopyWithCapacity.addAll(m94Var);
        }
        if (size > 0) {
            m94Var = m94VarMutableCopyWithCapacity;
        }
        zga.m25615o(obj, j, m94Var);
    }
}
