package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsg {

    /* JADX INFO: renamed from: a */
    public final bys f4326a;

    /* JADX INFO: renamed from: b */
    public final aed f4327b;

    /* JADX INFO: renamed from: c */
    private final Class f4328c;

    /* JADX INFO: renamed from: d */
    private final List f4329d;

    /* JADX INFO: renamed from: e */
    private final String f4330e;

    public bsg(Class cls, Class cls2, Class cls3, List list, bys bysVar, aed aedVar) {
        this.f4328c = cls;
        this.f4329d = list;
        this.f4326a = bysVar;
        this.f4327b = aedVar;
        this.f4330e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final bsz m2993a(brc brcVar, int i, int i2, bqr bqrVar, List list) throws bsv {
        int size = this.f4329d.size();
        bsz bszVarMo2930a = null;
        for (int i3 = 0; i3 < size; i3++) {
            bqt bqtVar = (bqt) this.f4329d.get(i3);
            try {
                if (bqtVar.mo2931b(brcVar.mo2949a(), bqrVar)) {
                    bszVarMo2930a = bqtVar.mo2930a(brcVar.mo2949a(), i, i2, bqrVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (bszVarMo2930a != null) {
                break;
            }
        }
        if (bszVarMo2930a != null) {
            return bszVarMo2930a;
        }
        throw new bsv(this.f4330e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + String.valueOf(this.f4328c) + ", decoders=" + String.valueOf(this.f4329d) + ", transcoder=" + String.valueOf(this.f4326a) + "}";
    }
}
