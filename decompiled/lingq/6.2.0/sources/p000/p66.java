package p000;

import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p66 {

    /* JADX INFO: renamed from: b */
    public static final p66 f55658b = new p66();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f55659a = new AtomicReference(new hy8(new ny8(12)));

    /* JADX INFO: renamed from: a */
    public final lda m18922a(co7 co7Var) {
        AtomicReference atomicReference = this.f55659a;
        hy8 hy8Var = (hy8) atomicReference.get();
        hy8Var.getClass();
        yk0 yk0Var = (yk0) co7Var.f10360c;
        if (!hy8Var.f43217b.containsKey(new fy8(co7.class, yk0Var))) {
            try {
                ww4 ww4Var = new ww4();
                int i = vw4.f66022b[((KeyData$KeyMaterialType) co7Var.f10362e).ordinal()];
                return ww4Var;
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e);
            }
        }
        hy8 hy8Var2 = (hy8) atomicReference.get();
        hy8Var2.getClass();
        fy8 fy8Var = new fy8(co7.class, yk0Var);
        HashMap map = hy8Var2.f43217b;
        if (map.containsKey(fy8Var)) {
            return ((ki4) map.get(fy8Var)).f47344b.mo12755d(co7Var);
        }
        ij6.m13954l("No Key Parser for requested key type ", fy8Var, " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m18923b(ki4 ki4Var) {
        ny8 ny8Var = new ny8((hy8) this.f55659a.get());
        ki4Var.getClass();
        fy8 fy8Var = new fy8(co7.class, ki4Var.f47343a);
        HashMap map = (HashMap) ny8Var.f53415c;
        if (map.containsKey(fy8Var)) {
            ki4 ki4Var2 = (ki4) map.get(fy8Var);
            if (!ki4Var2.equals(ki4Var) || ki4Var != ki4Var2) {
                v63.m23146x(fy8Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(fy8Var, ki4Var);
        }
        this.f55659a.set(new hy8(ny8Var));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m18924c(ri4 ri4Var) {
        ny8 ny8Var = new ny8((hy8) this.f55659a.get());
        gy8 gy8Var = new gy8(ri4Var.f59362a, co7.class);
        HashMap map = (HashMap) ny8Var.f53414b;
        if (map.containsKey(gy8Var)) {
            ri4 ri4Var2 = (ri4) map.get(gy8Var);
            if (!ri4Var2.equals(ri4Var) || ri4Var != ri4Var2) {
                v63.m23146x(gy8Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(gy8Var, ri4Var);
        }
        this.f55659a.set(new hy8(ny8Var));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m18925d(a47 a47Var) {
        ny8 ny8Var = new ny8((hy8) this.f55659a.get());
        a47Var.getClass();
        fy8 fy8Var = new fy8(do7.class, a47Var.f242a);
        HashMap map = (HashMap) ny8Var.f53417e;
        if (map.containsKey(fy8Var)) {
            a47 a47Var2 = (a47) map.get(fy8Var);
            if (!a47Var2.equals(a47Var) || a47Var != a47Var2) {
                v63.m23146x(fy8Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(fy8Var, a47Var);
        }
        this.f55659a.set(new hy8(ny8Var));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m18926e(b47 b47Var) {
        ny8 ny8Var = new ny8((hy8) this.f55659a.get());
        gy8 gy8Var = new gy8(b47Var.f7928a, do7.class);
        HashMap map = (HashMap) ny8Var.f53416d;
        if (map.containsKey(gy8Var)) {
            b47 b47Var2 = (b47) map.get(gy8Var);
            if (!b47Var2.equals(b47Var) || b47Var != b47Var2) {
                v63.m23146x(gy8Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(gy8Var, b47Var);
        }
        this.f55659a.set(new hy8(ny8Var));
    }
}
