package p000;

import com.google.android.gms.internal.measurement.zzyz;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pgb extends m80 {

    /* JADX INFO: renamed from: d */
    public static final Map f56190d;

    /* JADX INFO: renamed from: c */
    public final zzyz f56191c;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            pgb[] pgbVarArr = new pgb[10];
            for (int i = 0; i < 10; i++) {
                pgbVarArr[i] = new pgb(i, zzyzVar, pnd.f56539e);
            }
            enumMap.put(zzyzVar, pgbVarArr);
        }
        f56190d = Collections.unmodifiableMap(enumMap);
    }

    public pgb(int i, zzyz zzyzVar, pnd pndVar) {
        super(pndVar, i);
        dja.m10418b(zzyzVar, "format char");
        this.f56191c = zzyzVar;
        if (pndVar.m19419a()) {
            zzyzVar.zze();
            return;
        }
        int iZzb = zzyzVar.zzb();
        iZzb = pndVar.m19421c() ? iZzb & 65503 : iZzb;
        StringBuilder sb = new StringBuilder("%");
        pndVar.m19422d(sb);
        sb.append((char) iZzb);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: F */
    public final void mo16675F(nnd nndVar, Object obj) {
        nndVar.m17566a(obj, this.f56191c, (pnd) this.f50744b);
    }
}
