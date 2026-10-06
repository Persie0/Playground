package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class nxf {

    /* JADX INFO: renamed from: c */
    private static volatile nxf f44906c;

    /* JADX INFO: renamed from: d */
    private final Map f44907d;

    /* JADX INFO: renamed from: b */
    private static volatile boolean f44905b = false;

    /* JADX INFO: renamed from: a */
    public static final nxf f44904a = new nxf(null);

    public nxf() {
        this.f44907d = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static nxf m18012b() {
        return new nxf();
    }

    /* JADX INFO: renamed from: c */
    public ktz mo18013c(nyw nywVar, int i) {
        return (ktz) this.f44907d.get(new nxe(nywVar, i));
    }

    /* JADX INFO: renamed from: d */
    public final void m18014d(ktz ktzVar) {
        this.f44907d.put(new nxe(ktzVar.f37198a, ((nxp) ktzVar.f37201d).f44977a), ktzVar);
    }

    public nxf(byte[] bArr) {
        this.f44907d = Collections.emptyMap();
    }

    /* JADX INFO: renamed from: a */
    public static nxf m18011a() {
        nxf nxfVar = f44906c;
        if (nxfVar != null) {
            return nxfVar;
        }
        synchronized (nxf.class) {
            nxf nxfVar2 = f44906c;
            if (nxfVar2 != null) {
                return nxfVar2;
            }
            nxf nxfVarM18035b = nxk.m18035b(nxf.class);
            f44906c = nxfVarM18035b;
            return nxfVarM18035b;
        }
    }
}
