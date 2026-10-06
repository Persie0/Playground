package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lla extends lle implements lhv, ljh {

    /* JADX INFO: renamed from: a */
    private static final nbh f38532a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");

    /* JADX INFO: renamed from: b */
    private final Application f38533b;

    /* JADX INFO: renamed from: c */
    private final lhz f38534c;

    /* JADX INFO: renamed from: d */
    private final lkv f38535d;

    /* JADX INFO: renamed from: e */
    private final lkt f38536e;

    /* JADX INFO: renamed from: f */
    private final ArrayMap f38537f;

    /* JADX INFO: renamed from: g */
    private final oju f38538g;

    /* JADX INFO: renamed from: h */
    private final ljk f38539h;

    /* JADX INFO: renamed from: i */
    private final msi f38540i;

    /* JADX INFO: renamed from: j */
    private final oju f38541j;

    /* JADX INFO: renamed from: k */
    private final mbl f38542k;

    public lla(ljf ljfVar, Context context, lhz lhzVar, ohb ohbVar, lkt lktVar, oju ojuVar, oju ojuVar2, Executor executor, ohb ohbVar2, ljk ljkVar, oju ojuVar3, oju ojuVar4, boolean z) {
        ArrayMap arrayMap = new ArrayMap();
        this.f38537f = arrayMap;
        lku.m15613H(true);
        this.f38542k = ljfVar.m15526b(executor, ohbVar, ojuVar2);
        this.f38533b = (Application) context;
        this.f38534c = lhzVar;
        this.f38538g = ojuVar;
        this.f38536e = lktVar;
        this.f38539h = ljkVar;
        this.f38540i = lku.m15663q(new dks(this, ojuVar3, 6));
        this.f38541j = ojuVar3;
        lkw lkwVar = new lkw(arrayMap);
        this.f38535d = z ? new lky(lkwVar, ohbVar2) : new lkz(lkwVar, ohbVar2);
    }

    /* JADX INFO: renamed from: a */
    public nps m15680a(Activity activity) {
        llb llbVar;
        pap papVar;
        int i;
        lkx lkxVarM15676a = lkx.m15676a(activity);
        lnt lntVar = (lnt) this.f38542k.f39823h;
        boolean z = lntVar.f38780c;
        lnx lnxVar = lntVar.f38779b;
        if (!z || !lnxVar.mo15776c()) {
            return npp.f44031a;
        }
        synchronized (this.f38537f) {
            llbVar = (llb) this.f38537f.remove(lkxVarM15676a);
            if (this.f38537f.isEmpty()) {
                this.f38535d.mo15675d();
            }
        }
        if (llbVar == null) {
            ((nbe) ((nbe) f38532a.m17252c()).mo17276G((char) 4528)).mo17293r("Measurement not found: %s", lkxVarM15676a);
            return npp.f44031a;
        }
        String strM15677b = lkxVarM15676a.m15677b();
        if (Trace.isEnabled()) {
            Trace.endAsyncSection(String.format("J<%s>", strM15677b), 352691800);
            for (llf llfVar : ((llg) this.f38541j.get()).f38569b) {
                int iM15574a = lkm.m15574a(llfVar.f38563a);
                if (iM15574a == 0) {
                    iM15574a = 1;
                }
                switch (iM15574a - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = llbVar.f38549g;
                        break;
                    case 3:
                        i = llbVar.f38551i;
                        break;
                    case 4:
                        i = llbVar.f38552j;
                        break;
                    case 5:
                        i = llbVar.f38553k;
                        break;
                    case 6:
                        i = llbVar.f38554l;
                        break;
                    case 7:
                        i = llbVar.f38556n;
                        break;
                    default:
                        String str = llfVar.f38564b;
                        continue;
                }
                Trace.setCounter(llfVar.f38564b.replace("%EVENT_NAME%", strM15677b), i);
            }
        }
        if (llbVar.f38551i == 0) {
            return npp.f44031a;
        }
        if (((llg) this.f38541j.get()).f38570c && llbVar.f38556n <= TimeUnit.SECONDS.toMillis(9L) && llbVar.f38549g != 0) {
            this.f38539h.m15540a((String) this.f38540i.mo6051a());
        }
        long jMo14816b = llbVar.f38545c.mo14816b() - llbVar.f38546d;
        nxl nxlVarM18137O = pal.f47214n.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        int i2 = (int) jMo14816b;
        nxq nxqVar = nxlVarM18137O.f44974b;
        pal palVar = (pal) nxqVar;
        palVar.f47216a |= 16;
        palVar.f47221f = i2 + 1;
        int i3 = llbVar.f38549g;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        pal palVar2 = (pal) nxqVar2;
        palVar2.f47216a |= 1;
        palVar2.f47217b = i3;
        int i4 = llbVar.f38551i;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        pal palVar3 = (pal) nxqVar3;
        palVar3.f47216a |= 2;
        palVar3.f47218c = i4;
        int i5 = llbVar.f38552j;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        pal palVar4 = (pal) nxqVar4;
        palVar4.f47216a |= 4;
        palVar4.f47219d = i5;
        int i6 = llbVar.f38554l;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        pal palVar5 = (pal) nxqVar5;
        palVar5.f47216a |= 32;
        palVar5.f47222g = i6;
        int i7 = llbVar.f38556n;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O.f44974b;
        pal palVar6 = (pal) nxqVar6;
        palVar6.f47216a |= 64;
        palVar6.f47223h = i7;
        int i8 = llbVar.f38553k;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        pal palVar7 = (pal) nxlVarM18137O.f44974b;
        palVar7.f47216a |= 8;
        palVar7.f47220e = i8;
        int i9 = llbVar.f38557o;
        if (i9 != Integer.MIN_VALUE) {
            int[] iArr = llb.f38544b;
            int[] iArr2 = llbVar.f38548f;
            nxl nxlVarM18137O2 = pap.f47253c.m18137O();
            int i10 = 0;
            while (true) {
                if (i10 >= 52) {
                    if (iArr2[51] > 0) {
                        nxlVarM18137O2.m18094ax(i9 + 1);
                        nxlVarM18137O2.m18095ay(0);
                    }
                    papVar = (pap) nxlVarM18137O2.mo18103l();
                } else if (iArr[i10] > i9) {
                    nxlVarM18137O2.m18095ay(0);
                    nxlVarM18137O2.m18094ax(i9 + 1);
                    papVar = (pap) nxlVarM18137O2.mo18103l();
                } else {
                    int i11 = iArr2[i10];
                    if (i11 > 0 || (i10 > 0 && iArr2[i10 - 1] > 0)) {
                        nxlVarM18137O2.m18095ay(i11);
                        nxlVarM18137O2.m18094ax(iArr[i10]);
                    }
                    i10++;
                }
            }
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar7 = nxlVarM18137O.f44974b;
            pal palVar8 = (pal) nxqVar7;
            papVar.getClass();
            palVar8.f47228m = papVar;
            palVar8.f47216a |= 2048;
            int i12 = llbVar.f38550h;
            if (!nxqVar7.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar8 = nxlVarM18137O.f44974b;
            pal palVar9 = (pal) nxqVar8;
            palVar9.f47216a |= 512;
            palVar9.f47226k = i12;
            int i13 = llbVar.f38555m;
            if (!nxqVar8.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            pal palVar10 = (pal) nxlVarM18137O.f44974b;
            palVar10.f47216a |= 1024;
            palVar10.f47227l = i13;
        }
        for (int i14 = 0; i14 < 28; i14++) {
            if (llbVar.f38547e[i14] > 0) {
                nxl nxlVarM18137O3 = pak.f47208e.m18137O();
                int i15 = llbVar.f38547e[i14];
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar9 = nxlVarM18137O3.f44974b;
                pak pakVar = (pak) nxqVar9;
                pakVar.f47210a |= 1;
                pakVar.f47211b = i15;
                int i16 = llb.f38543a[i14];
                if (!nxqVar9.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar10 = nxlVarM18137O3.f44974b;
                pak pakVar2 = (pak) nxqVar10;
                pakVar2.f47210a |= 2;
                pakVar2.f47212c = i16;
                int i17 = i14 + 1;
                if (i17 < 28) {
                    int i18 = llb.f38543a[i17] - 1;
                    if (!nxqVar10.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    pak pakVar3 = (pak) nxlVarM18137O3.f44974b;
                    pakVar3.f47210a |= 4;
                    pakVar3.f47213d = i18;
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                pal palVar11 = (pal) nxlVarM18137O.f44974b;
                pak pakVar4 = (pak) nxlVarM18137O3.mo18103l();
                pakVar4.getClass();
                nxy nxyVar = palVar11.f47225j;
                if (!nxyVar.mo17770c()) {
                    palVar11.f47225j = nxq.m18127U(nxyVar);
                }
                palVar11.f47225j.add(pakVar4);
            }
        }
        pal palVar12 = (pal) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O4 = pat.f47274u.m18137O();
        if (!nxlVarM18137O4.f44974b.m18142ac()) {
            nxlVarM18137O4.mo18106p();
        }
        pat patVar = (pat) nxlVarM18137O4.f44974b;
        palVar12.getClass();
        patVar.f47285j = palVar12;
        patVar.f47276a |= 1024;
        pat patVar2 = (pat) nxlVarM18137O4.mo18103l();
        mbl mblVar = this.f38542k;
        lja ljaVarM15522a = ljb.m15522a();
        ljaVarM15522a.m15515e(patVar2);
        ljaVarM15522a.f38345d = null;
        ljaVarM15522a.f38346e = "Activity";
        ljaVarM15522a.f38343b = lkxVarM15676a.m15677b();
        ljaVarM15522a.m15513c(true);
        return mblVar.m16298b(ljaVarM15522a.m15511a());
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public void mo15463ao() {
        this.f38534c.m15360a(this.f38535d);
        this.f38534c.m15360a(this.f38536e);
    }

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String m15681b(oju ojuVar) {
        return ((llg) ojuVar.get()).f38568a.replace("%PACKAGE_NAME%", this.f38533b.getPackageName());
    }

    /* JADX INFO: renamed from: c */
    public void m15682c(Activity activity) {
        lkx lkxVarM15676a = lkx.m15676a(activity);
        if (this.f38542k.m16299c(lkxVarM15676a.m15677b())) {
            synchronized (this.f38537f) {
                if (this.f38537f.size() >= 25) {
                    ((nbe) ((nbe) f38532a.m17252c()).mo17276G(4531)).mo17293r("Too many concurrent measurements, ignoring %s", lkxVarM15676a);
                    return;
                }
                llb llbVar = (llb) this.f38537f.put(lkxVarM15676a, ((llc) this.f38538g).get());
                if (llbVar != null) {
                    this.f38537f.put(lkxVarM15676a, llbVar);
                    ((nbe) ((nbe) f38532a.m17252c()).mo17276G(4530)).mo17293r("measurement already started: %s", lkxVarM15676a);
                } else {
                    if (this.f38537f.size() == 1) {
                        this.f38535d.mo15674c();
                    }
                    if (Trace.isEnabled()) {
                        Trace.beginAsyncSection(String.format("J<%s>", lkxVarM15676a.m15677b()), 352691800);
                    }
                }
            }
        }
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public void mo15356d(Activity activity) {
        synchronized (this.f38537f) {
            this.f38537f.clear();
        }
    }
}
