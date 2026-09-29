package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ye5 extends af5 {
    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public final void mo340a(Object obj, long j) {
        ((AbstractC3282l1) ((l94) yga.f69826c.m23276i(obj, j))).f48878a = false;
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: b */
    public final void mo341b(Object obj, Object obj2, long j) {
        vga vgaVar = yga.f69826c;
        l94 l94VarMutableCopyWithCapacity = (l94) vgaVar.m23276i(obj, j);
        l94 l94Var = (l94) vgaVar.m23276i(obj2, j);
        int size = l94VarMutableCopyWithCapacity.size();
        int size2 = l94Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC3282l1) l94VarMutableCopyWithCapacity).f48878a) {
                l94VarMutableCopyWithCapacity = l94VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            l94VarMutableCopyWithCapacity.addAll(l94Var);
        }
        if (size > 0) {
            l94Var = l94VarMutableCopyWithCapacity;
        }
        yga.m25140p(obj, j, l94Var);
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: c */
    public final List mo342c(Object obj, long j) {
        l94 l94Var = (l94) yga.f69826c.m23276i(obj, j);
        if (((AbstractC3282l1) l94Var).f48878a) {
            return l94Var;
        }
        int size = l94Var.size();
        l94 l94VarMutableCopyWithCapacity = l94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        yga.m25140p(obj, j, l94VarMutableCopyWithCapacity);
        return l94VarMutableCopyWithCapacity;
    }
}
