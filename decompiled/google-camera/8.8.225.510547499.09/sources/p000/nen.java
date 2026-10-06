package p000;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nen extends nel {

    /* JADX INFO: renamed from: c */
    public static final Map f42146c;

    /* JADX INFO: renamed from: d */
    private final nci f42147d;

    static {
        EnumMap enumMap = new EnumMap(nci.class);
        for (nci nciVar : nci.values()) {
            nen[] nenVarArr = new nen[10];
            for (int i = 0; i < 10; i++) {
                nenVarArr[i] = new nen(i, nciVar, ncj.f42004a);
            }
            enumMap.put(nciVar, nenVarArr);
        }
        f42146c = Collections.unmodifiableMap(enumMap);
    }

    public nen(int i, nci nciVar, ncj ncjVar) {
        super(ncjVar, i);
        nea.m17397k(nciVar, "format char");
        this.f42147d = nciVar;
        if (ncjVar.m17333c()) {
            String str = nciVar.f42003o;
            return;
        }
        int i2 = nciVar.f42000l;
        i2 = ncjVar.m17334d() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        ncjVar.m17336f(sb);
        sb.append((char) i2);
    }

    @Override // p000.nel
    /* JADX INFO: renamed from: a */
    public final void mo17417a(nem nemVar, Object obj) {
        nemVar.mo17418a(obj, this.f42147d, this.f42145b);
    }
}
