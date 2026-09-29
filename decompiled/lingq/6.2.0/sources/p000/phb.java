package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class phb {

    /* JADX INFO: renamed from: a */
    public static volatile phb f56224a;

    /* JADX INFO: renamed from: b */
    public static final phb f56225b;

    static {
        phb phbVar = new phb();
        Map map = Collections.EMPTY_MAP;
        f56225b = phbVar;
    }

    /* JADX INFO: renamed from: a */
    public static phb m19145a() {
        phb phbVar = f56224a;
        if (phbVar != null) {
            return phbVar;
        }
        synchronized (phb.class) {
            try {
                phb phbVar2 = f56224a;
                if (phbVar2 != null) {
                    return phbVar2;
                }
                int i = dhb.f35664a;
                phb phbVarM22041F = thb.m22041F();
                f56224a = phbVarM22041F;
                return phbVarM22041F;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
