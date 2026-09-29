package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class acb extends u33 {

    /* JADX INFO: renamed from: e */
    public static final d57 f498e;

    /* JADX INFO: renamed from: b */
    public final d57 f499b;

    /* JADX INFO: renamed from: c */
    public final u33 f500c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f501d;

    static {
        String str = d57.f35013b;
        f498e = gz8.m12976h("/", false);
    }

    public acb(d57 d57Var, u33 u33Var, LinkedHashMap linkedHashMap) {
        this.f499b = d57Var;
        this.f500c = u33Var;
        this.f501d = linkedHashMap;
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: A */
    public final qg4 mo259A(d57 d57Var) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: J */
    public final t89 mo260J(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // p000.u33
    /* JADX INFO: renamed from: N */
    public final yd9 mo261N(d57 d57Var) throws FileNotFoundException {
        d57Var.getClass();
        d57 d57Var2 = f498e;
        d57Var2.getClass();
        zbb zbbVar = (zbb) this.f501d.get(AbstractC2909d.m9950b(d57Var2, d57Var, true));
        e18 th = null;
        if (zbbVar == null) {
            ho2.m13387h(d57Var, "no such file: ");
            return null;
        }
        long j = zbbVar.f71327f;
        qg4 qg4VarMo268z = this.f500c.mo268z(this.f499b);
        try {
            e18 e18Var = new e18(qg4VarMo268z.m19948b(zbbVar.f71329h));
            try {
                qg4VarMo268z.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = e18Var;
        } catch (Throwable th3) {
            th = th3;
            if (qg4VarMo268z != null) {
                try {
                    qg4VarMo268z.close();
                } catch (Throwable th4) {
                    lda.m16117c(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        icd.m13790k(th);
        if (zbbVar.f71328g == 0) {
            return new e63(th, j, true);
        }
        e63 e63Var = new e63(th, zbbVar.f71326e, true);
        return new e63(new n44(new e18(e63Var), new Inflater(true)), j, false);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: a */
    public final t89 mo262a(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: b */
    public final void mo263b(d57 d57Var, d57 d57Var2) throws IOException {
        d57Var.getClass();
        d57Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: e */
    public final void mo264e(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: n */
    public final void mo265n(d57 d57Var) throws IOException {
        d57Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: r */
    public final List mo266r(d57 d57Var) throws IOException {
        d57 d57Var2 = f498e;
        d57Var2.getClass();
        zbb zbbVar = (zbb) this.f501d.get(AbstractC2909d.m9950b(d57Var2, d57Var, true));
        if (zbbVar != null) {
            return u91.m22622n1(zbbVar.f71338q);
        }
        uk9.m22774h(d57Var, "not a directory: ");
        return null;
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: x */
    public final sb2 mo267x(d57 d57Var) throws Throwable {
        Long lValueOf;
        Long lM13781b;
        Throwable th;
        Throwable th2;
        d57Var.getClass();
        d57 d57Var2 = f498e;
        d57Var2.getClass();
        zbb zbbVarM13788i = (zbb) this.f501d.get(AbstractC2909d.m9950b(d57Var2, d57Var, true));
        Long lValueOf2 = null;
        if (zbbVarM13788i == null) {
            return null;
        }
        long j = zbbVarM13788i.f71329h;
        if (j != -1) {
            qg4 qg4VarMo268z = this.f500c.mo268z(this.f499b);
            try {
                e18 e18Var = new e18(qg4VarMo268z.m19948b(j));
                try {
                    zbbVarM13788i = icd.m13788i(e18Var, zbbVarM13788i);
                    try {
                        e18Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        e18Var.close();
                    } catch (Throwable th5) {
                        lda.m16117c(th4, th5);
                    }
                    th2 = th4;
                    zbbVarM13788i = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    qg4VarMo268z.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (qg4VarMo268z != null) {
                    try {
                        qg4VarMo268z.close();
                    } catch (Throwable th8) {
                        lda.m16117c(th7, th8);
                    }
                }
                th = th7;
                zbbVarM13788i = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = zbbVarM13788i.f71323b;
        boolean z2 = !z;
        Long lValueOf3 = z ? null : Long.valueOf(zbbVarM13788i.f71327f);
        Long l = zbbVarM13788i.f71334m;
        if (l != null) {
            lValueOf = Long.valueOf(icd.m13782c(l.longValue()));
        } else {
            Integer num = zbbVarM13788i.f71337p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l2 = zbbVarM13788i.f71332k;
        if (l2 != null) {
            lM13781b = Long.valueOf(icd.m13782c(l2.longValue()));
        } else {
            Integer num2 = zbbVarM13788i.f71335n;
            if (num2 != null) {
                lM13781b = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = zbbVarM13788i.f71331j;
                lM13781b = i != -1 ? icd.m13781b(zbbVarM13788i.f71330i, i) : null;
            }
        }
        Long l3 = zbbVarM13788i.f71333l;
        if (l3 != null) {
            lValueOf2 = Long.valueOf(icd.m13782c(l3.longValue()));
        } else {
            Integer num3 = zbbVarM13788i.f71336o;
            if (num3 != null) {
                lValueOf2 = Long.valueOf(((long) num3.intValue()) * 1000);
            }
        }
        return new sb2(z2, z, null, lValueOf3, lValueOf, lM13781b, lValueOf2);
    }

    @Override // p000.u33
    /* JADX INFO: renamed from: z */
    public final qg4 mo268z(d57 d57Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
