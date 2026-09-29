package p000;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u33 implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final rg4 f63345a;

    static {
        rg4 rg4Var;
        try {
            Class.forName("java.nio.file.Files");
            rg4Var = new kl6();
        } catch (ClassNotFoundException unused) {
            rg4Var = new rg4();
        }
        f63345a = rg4Var;
        String str = d57.f35013b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        gz8.m12976h(property, false);
        ClassLoader classLoader = w78.class.getClassLoader();
        classLoader.getClass();
        new w78(classLoader);
    }

    /* JADX INFO: renamed from: A */
    public abstract qg4 mo259A(d57 d57Var);

    /* JADX INFO: renamed from: J */
    public abstract t89 mo260J(d57 d57Var);

    /* JADX INFO: renamed from: N */
    public abstract yd9 mo261N(d57 d57Var);

    /* JADX INFO: renamed from: a */
    public abstract t89 mo262a(d57 d57Var);

    /* JADX INFO: renamed from: b */
    public abstract void mo263b(d57 d57Var, d57 d57Var2);

    /* JADX INFO: renamed from: c */
    public final void m22432c(d57 d57Var) {
        C0825bv c0825bv = new C0825bv();
        while (d57Var != null && !m22434q(d57Var)) {
            c0825bv.addFirst(d57Var);
            d57Var = d57Var.m10105c();
        }
        Iterator<E> it = c0825bv.iterator();
        while (it.hasNext()) {
            mo264e((d57) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo264e(d57 d57Var);

    /* JADX INFO: renamed from: n */
    public abstract void mo265n(d57 d57Var);

    /* JADX INFO: renamed from: p */
    public final void m22433p(d57 d57Var) {
        d57Var.getClass();
        mo265n(d57Var);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22434q(d57 d57Var) {
        d57Var.getClass();
        return mo267x(d57Var) != null;
    }

    /* JADX INFO: renamed from: r */
    public abstract List mo266r(d57 d57Var);

    /* JADX INFO: renamed from: u */
    public final sb2 m22435u(d57 d57Var) throws FileNotFoundException {
        d57Var.getClass();
        sb2 sb2VarMo267x = mo267x(d57Var);
        if (sb2VarMo267x != null) {
            return sb2VarMo267x;
        }
        ho2.m13387h(d57Var, "no such file: ");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public abstract sb2 mo267x(d57 d57Var);

    /* JADX INFO: renamed from: z */
    public abstract qg4 mo268z(d57 d57Var);
}
