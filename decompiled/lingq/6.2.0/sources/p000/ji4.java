package p000;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ji4 {

    /* JADX INFO: renamed from: b */
    public static final Logger f45577b = Logger.getLogger(ji4.class.getName());

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f45578a;

    public ji4(ji4 ji4Var) {
        this.f45578a = new ConcurrentHashMap(ji4Var.f45578a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ii4 m14488a(String str) {
        if (!this.f45578a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (ii4) this.f45578a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m14489b(AbstractC3517r abstractC3517r) {
        if (!abstractC3517r.mo4441d().isCompatible()) {
            throw new GeneralSecurityException("failed to register key manager " + abstractC3517r.getClass() + " as it is not FIPS compatible.");
        }
        m14490c(new ii4(abstractC3517r));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14490c(ii4 ii4Var) {
        AbstractC3517r abstractC3517r = ii4Var.f44144a;
        Class cls = (Class) abstractC3517r.f58434c;
        if (!((Map) abstractC3517r.f58433b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + abstractC3517r.toString() + " does not support primitive class " + cls.getName());
        }
        String strMo225i = abstractC3517r.mo225i();
        ii4 ii4Var2 = (ii4) this.f45578a.get(strMo225i);
        if (ii4Var2 != null && !ii4Var2.f44144a.getClass().equals(ii4Var.f44144a.getClass())) {
            f45577b.warning("Attempted overwrite of a registered key manager for key type ".concat(strMo225i));
            throw new GeneralSecurityException("typeUrl (" + strMo225i + ") is already registered with " + ii4Var2.f44144a.getClass().getName() + ", cannot be re-registered with " + ii4Var.f44144a.getClass().getName());
        }
        this.f45578a.putIfAbsent(strMo225i, ii4Var);
    }

    public ji4() {
        this.f45578a = new ConcurrentHashMap();
    }
}
