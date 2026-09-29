package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;

/* JADX INFO: loaded from: classes.dex */
public final class rl6 implements sl6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // p000.sl6
    /* JADX INFO: renamed from: a */
    public final boolean mo18966a(d16 d16Var) {
        ?? x66Var = 0;
        while (true) {
            int i = 0;
            if (d16Var == 0) {
                return false;
            }
            if (d16Var instanceof ng7) {
                ((ng7) d16Var).mo17411R();
            } else if ((d16Var.f34839c & 16) != 0 && (d16Var instanceof fa2)) {
                d16 d16Var2 = ((fa2) d16Var).f38701K;
                x66Var = x66Var;
                d16Var = d16Var;
                while (d16Var2 != null) {
                    if ((d16Var2.f34839c & 16) != 0) {
                        i++;
                        if (i == 1) {
                            x66Var = x66Var;
                            d16Var = d16Var2;
                        } else {
                            if (x66Var == 0) {
                                x66Var = new x66(new d16[16]);
                            }
                            if (d16Var != 0) {
                                x66Var.m24305c(d16Var);
                                d16Var = 0;
                            }
                            x66Var.m24305c(d16Var2);
                        }
                    }
                    d16Var2 = d16Var2.f34842f;
                    x66Var = x66Var;
                    d16Var = d16Var;
                }
                if (i == 1) {
                }
            }
            d16Var = te1.m21992f(x66Var);
        }
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: b */
    public final int mo18967b() {
        return 16;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: d */
    public final void mo18969d(C0357g c0357g, long j, cu3 cu3Var, int i, boolean z) {
        c0357g.m1560C(j, cu3Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [d16] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p000.sl6
    /* JADX INFO: renamed from: e */
    public final boolean mo18970e(cu3 cu3Var, C0357g c0357g) {
        AbstractC0362l abstractC0362l = (AbstractC0362l) c0357g.f4335a0.f46677e;
        abstractC0362l.getClass();
        d16 d16VarM1684h1 = abstractC0362l.m1684h1(tl6.m22199g(16));
        if (d16VarM1684h1 != null && d16VarM1684h1.f34836I) {
            if (!d16VarM1684h1.f34837a.f34836I) {
                i54.m13663b("visitLocalDescendants called on an unattached node");
            }
            d16 d16Var = d16VarM1684h1.f34837a;
            if ((d16Var.f34840d & 16) != 0) {
                while (d16Var != null) {
                    if ((d16Var.f34839c & 16) != 0) {
                        ?? M21992f = d16Var;
                        ?? x66Var = 0;
                        while (M21992f != 0) {
                            if (M21992f instanceof ng7) {
                                if (((ng7) M21992f).mo17410B0()) {
                                    cu3Var.f34539c = cu3Var.f34537a.f1294b - 1;
                                    return true;
                                }
                            } else if ((M21992f.f34839c & 16) != 0 && (M21992f instanceof fa2)) {
                                d16 d16Var2 = ((fa2) M21992f).f38701K;
                                int i = 0;
                                while (d16Var2 != null) {
                                    if ((d16Var2.f34839c & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M21992f = M21992f;
                                            x66Var = x66Var;
                                            x66Var = x66Var;
                                            M21992f = d16Var2;
                                        } else {
                                            if (x66Var == 0) {
                                                x66Var = new x66(new d16[16]);
                                            }
                                            if (M21992f != 0) {
                                                x66Var.m24305c(M21992f);
                                                M21992f = 0;
                                            }
                                            x66Var.m24305c(d16Var2);
                                        }
                                    } else {
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    d16Var2 = d16Var2.f34842f;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                                if (i == 1) {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                } else {
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                }
                            }
                            M21992f = te1.m21992f(x66Var);
                        }
                    }
                    d16Var = d16Var.f34842f;
                }
            }
        }
        return false;
    }

    @Override // p000.sl6
    /* JADX INFO: renamed from: f */
    public final boolean mo18971f(C0357g c0357g) {
        return true;
    }
}
