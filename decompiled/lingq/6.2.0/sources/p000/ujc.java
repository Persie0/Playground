package p000;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class ujc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f63997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eoc f63998c;

    public /* synthetic */ ujc(eoc eocVar, zzr zzrVar, int i) {
        this.f63996a = i;
        this.f63997b = zzrVar;
        this.f63998c = eocVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f63996a;
        zzr zzrVar = this.f63997b;
        eoc eocVar = this.f63998c;
        switch (i) {
            case 0:
                eocVar.f37647f.m5902V();
                eocVar.f37647f.m5905Y(zzrVar);
                break;
            default:
                eocVar.f37647f.m5902V();
                C1045d c1045d = eocVar.f37647f;
                c1045d.mo5913d().mo12359D();
                c1045d.m5930l0();
                lda.m16130p(zzrVar);
                String str = zzrVar.f12432a;
                lda.m16127m(str);
                int i2 = 0;
                if (c1045d.m5916e0().m4869O(null, z8c.f71212y0)) {
                    c1045d.mo5911c().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM4867M = c1045d.m5916e0().m4867M(null, z8c.f71175h0);
                    c1045d.m5916e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) z8c.f71165e.m21901a(null)).longValue();
                    while (i2 < iM4867M && c1045d.m5892I(null, jLongValue)) {
                        i2++;
                    }
                } else {
                    c1045d.m5916e0();
                    long jIntValue = ((Integer) z8c.f71185l.m21901a(null)).intValue();
                    while (i2 < jIntValue && c1045d.m5892I(str, 0L)) {
                        i2++;
                    }
                }
                if (c1045d.m5916e0().m4869O(null, z8c.f71214z0)) {
                    c1045d.mo5913d().mo12359D();
                    c1045d.m5891H();
                }
                m8d m8dVar = c1045d.f12370j;
                zzin zzinVarZzb = zzin.zzb(zzrVar.f12431Z);
                m8dVar.mo12359D();
                if (zzinVarZzb == zzin.CLIENT_UPLOAD_ELIGIBLE && !m8d.m16684G(str)) {
                    shc shcVar = m8dVar.f55716b.f12356a;
                    C1045d.m5885T(shcVar);
                    kbc kbcVarM21380P = shcVar.m21380P(str);
                    if (kbcVarM21380P != null && kbcVarM21380P.m15067G() && !kbcVarM21380P.m15068H().m4567t().isEmpty()) {
                        c1045d.mo5909b().f68076I.m17924b(str, "[sgtm] Going background, trigger client side upload. appId");
                        c1045d.mo5911c().getClass();
                        c1045d.m5941r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
        }
    }
}
