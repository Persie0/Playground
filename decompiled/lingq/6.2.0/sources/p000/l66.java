package p000;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class l66 {

    /* JADX INFO: renamed from: b */
    public static final l66 f49184b = new l66();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f49185a = new AtomicReference(new fk7(new fs6(9)));

    /* JADX INFO: renamed from: a */
    public final synchronized void m15897a(xj7 xj7Var) {
        fs6 fs6Var = new fs6((fk7) this.f49185a.get());
        HashMap map = (HashMap) fs6Var.f39590b;
        ek7 ek7Var = new ek7(xj7Var.f68292a, z11.class);
        if (map.containsKey(ek7Var)) {
            xj7 xj7Var2 = (xj7) map.get(ek7Var);
            if (!xj7Var2.equals(xj7Var) || xj7Var != xj7Var2) {
                v63.m23146x(ek7Var, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            map.put(ek7Var, xj7Var);
        }
        this.f49185a.set(new fk7(fs6Var));
    }
}
