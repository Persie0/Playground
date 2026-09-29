package p000;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final gh2 f39240a;

    public fl0(File file) {
        rg4 rg4Var = u33.f63345a;
        String str = d57.f35013b;
        d57 d57VarM12977i = gz8.m12977i(file);
        rg4Var.getClass();
        as9 as9Var = as9.f7432l;
        as9Var.getClass();
        this.f39240a = new gh2(rg4Var, d57VarM12977i, as9Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m11929a(co7 co7Var) {
        co7Var.getClass();
        gh2 gh2Var = this.f39240a;
        String strM18218C = AbstractC3423or.m18218C((ex3) co7Var.f10360c);
        synchronized (gh2Var) {
            strM18218C.getClass();
            gh2Var.m12648n();
            gh2Var.m12644a();
            gh2.m12642J(strM18218C);
            zg2 zg2Var = (zg2) gh2Var.f40814i.get(strM18218C);
            if (zg2Var == null) {
                return;
            }
            gh2Var.m12654z(zg2Var);
            if (gh2Var.f40812g <= gh2Var.f40808c) {
                gh2Var.f40801J = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39240a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f39240a.flush();
    }
}
