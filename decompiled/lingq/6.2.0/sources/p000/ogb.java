package p000;

import com.google.android.gms.internal.measurement.zzabf;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class ogb extends m80 {

    /* JADX INFO: renamed from: c */
    public final zzabf f54327c;

    public ogb(int i, zzabf zzabfVar, pnd pndVar) {
        super(pndVar, i);
        this.f54327c = zzabfVar;
        StringBuilder sb = new StringBuilder("%");
        pndVar.m19422d(sb);
        sb.append(true != pndVar.m19421c() ? 't' : 'T');
        sb.append(zzabfVar.zzb());
    }

    /* JADX INFO: renamed from: G */
    public static ogb m17991G(int i, zzabf zzabfVar, pnd pndVar) {
        return new ogb(i, zzabfVar, pndVar);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: F */
    public final void mo16675F(nnd nndVar, Object obj) {
        pnd pndVar = (pnd) this.f50744b;
        StringBuilder sb = nndVar.f53025e;
        boolean z = obj instanceof Date;
        zzabf zzabfVar = this.f54327c;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            pndVar.m19422d(sb2);
            sb2.append(true != pndVar.m19421c() ? 't' : 'T');
            sb2.append(zzabfVar.zzb());
            sb.append(String.format(rnd.f59602a, sb2.toString(), obj));
            return;
        }
        char cZzb = zzabfVar.zzb();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzb).length() + 2);
        sb3.append("%t");
        sb3.append(cZzb);
        nnd.m17565b(sb, obj, sb3.toString());
    }
}
