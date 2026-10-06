package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llq implements ljh {

    /* JADX INFO: renamed from: a */
    public final npv f38594a;

    /* JADX INFO: renamed from: b */
    public final lha f38595b;

    /* JADX INFO: renamed from: c */
    public final ohb f38596c;

    /* JADX INFO: renamed from: d */
    public final llu f38597d;

    /* JADX INFO: renamed from: e */
    public final mbl f38598e;

    /* JADX INFO: renamed from: f */
    private final boolean f38599f;

    /* JADX INFO: renamed from: g */
    private final llp f38600g;

    public llq() {
    }

    public llq(ljf ljfVar, Context context, llp llpVar, npv npvVar, ohb ohbVar, llu lluVar, lha lhaVar, oju ojuVar, Executor executor, mrm mrmVar) {
        this();
        new AtomicReference(llj.f38581a);
        new ConcurrentHashMap();
        this.f38600g = llpVar;
        this.f38595b = lhaVar;
        this.f38598e = ljfVar.m15526b(executor, ohbVar, ojuVar);
        this.f38594a = npvVar;
        this.f38596c = ohbVar;
        this.f38597d = lluVar;
        this.f38599f = ((Boolean) mrmVar.mo16811e(Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public final void m15710a() {
        this.f38600g.f38591a = new llo() { // from class: llr
            @Override // p000.llo
            /* JADX INFO: renamed from: a */
            public final void mo15708a(final int i, final String str) {
                final llq llqVar = this.f38601a;
                if (llqVar.f38595b.f38250a) {
                    kxk.m14963I();
                } else {
                    kxk.m14970P(new nol() { // from class: lls
                        @Override // p000.nol
                        /* JADX INFO: renamed from: a */
                        public final nps mo3988a() {
                            ActivityManager.MemoryInfo memoryInfo;
                            llt lltVar;
                            llq llqVar2 = llqVar;
                            int i2 = i;
                            String str2 = str;
                            lli lliVar = (lli) llqVar2.f38596c.get();
                            if ((true != lliVar.mo15379b() ? -1L : 1000L) == -1) {
                                return npp.f44031a;
                            }
                            mrm mrmVar = lliVar.f38577a;
                            nxl nxlVarM18137O = pat.f47274u.m18137O();
                            llu lluVar = llqVar2.f38597d;
                            Process.myPid();
                            boolean zM15377b = lib.m15377b(lluVar.f38617c);
                            lli lliVar2 = ((lgz) lluVar.f38616b).get();
                            lij.m15452v();
                            if (lliVar2.f38578b) {
                                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                                Context context = lluVar.f38617c;
                                if (lib.f38291a == null) {
                                    synchronized (lib.class) {
                                        if (lib.f38291a == null) {
                                            Object systemService = context.getSystemService("activity");
                                            systemService.getClass();
                                            lib.f38291a = (ActivityManager) systemService;
                                        }
                                    }
                                }
                                lib.f38291a.getMemoryInfo(memoryInfo2);
                                memoryInfo = memoryInfo2;
                            } else {
                                memoryInfo = null;
                            }
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                try {
                                    File file = new File("/proc/self/status");
                                    Charset charsetDefaultCharset = Charset.defaultCharset();
                                    charsetDefaultCharset.getClass();
                                    String str3 = new String(ngd.m17461a(file), charsetDefaultCharset);
                                    if (str3.isEmpty()) {
                                        ((nbe) ((nbe) llu.f38615a.m17251b()).mo17276G((char) 4536)).mo17290o("Null or empty proc status");
                                        lltVar = null;
                                    } else {
                                        lltVar = new llt();
                                        lltVar.f38610f = llu.m15712b(llt.f38605a, str3);
                                        lltVar.f38611g = llu.m15712b(llt.f38606b, str3);
                                        lltVar.f38612h = llu.m15712b(llt.f38607c, str3);
                                        lltVar.f38613i = llu.m15712b(llt.f38608d, str3);
                                        lltVar.f38614j = llu.m15712b(llt.f38609e, str3);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                } catch (IOException e) {
                                    ((nbe) ((nbe) ((nbe) llu.f38615a.m17251b()).mo17283h(e)).mo17276G(4535)).mo17290o("Error reading proc status");
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    lltVar = null;
                                }
                                nxn nxnVar = (nxn) ozp.f47049g.m18137O();
                                nxl nxlVarM18137O2 = ozo.f47045c.m18137O();
                                nxl nxlVarM18137O3 = ozm.f47031i.m18137O();
                                if (memoryInfo != null) {
                                    long j = memoryInfo.availMem >> 10;
                                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                        nxlVarM18137O3.mo18106p();
                                    }
                                    int i3 = (int) j;
                                    ozm ozmVar = (ozm) nxlVarM18137O3.f44974b;
                                    ozmVar.f47033a |= 131072;
                                    ozmVar.f47034b = i3;
                                    long j2 = memoryInfo.totalMem >> 20;
                                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                        nxlVarM18137O3.mo18106p();
                                    }
                                    int i4 = (int) j2;
                                    ozm ozmVar2 = (ozm) nxlVarM18137O3.f44974b;
                                    ozmVar2.f47033a |= 262144;
                                    ozmVar2.f47035c = i4;
                                }
                                if (lltVar != null) {
                                    Long l = lltVar.f38610f;
                                    if (l != null) {
                                        long jLongValue = l.longValue();
                                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                            nxlVarM18137O3.mo18106p();
                                        }
                                        ozm ozmVar3 = (ozm) nxlVarM18137O3.f44974b;
                                        ozmVar3.f47033a |= 524288;
                                        ozmVar3.f47036d = jLongValue;
                                    }
                                    Long l2 = lltVar.f38611g;
                                    if (l2 != null) {
                                        long jLongValue2 = l2.longValue();
                                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                            nxlVarM18137O3.mo18106p();
                                        }
                                        ozm ozmVar4 = (ozm) nxlVarM18137O3.f44974b;
                                        ozmVar4.f47033a |= 1048576;
                                        ozmVar4.f47037e = jLongValue2;
                                    }
                                    Long l3 = lltVar.f38612h;
                                    if (l3 != null) {
                                        long jLongValue3 = l3.longValue();
                                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                            nxlVarM18137O3.mo18106p();
                                        }
                                        ozm ozmVar5 = (ozm) nxlVarM18137O3.f44974b;
                                        ozmVar5.f47033a |= 2097152;
                                        ozmVar5.f47038f = jLongValue3;
                                    }
                                    Long l4 = lltVar.f38613i;
                                    if (l4 != null) {
                                        long jLongValue4 = l4.longValue();
                                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                            nxlVarM18137O3.mo18106p();
                                        }
                                        ozm ozmVar6 = (ozm) nxlVarM18137O3.f44974b;
                                        ozmVar6.f47033a |= 4194304;
                                        ozmVar6.f47039g = jLongValue4;
                                    }
                                    Long l5 = lltVar.f38614j;
                                    if (l5 != null) {
                                        long jLongValue5 = l5.longValue();
                                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                            nxlVarM18137O3.mo18106p();
                                        }
                                        ozm ozmVar7 = (ozm) nxlVarM18137O3.f44974b;
                                        ozmVar7.f47033a |= 8388608;
                                        ozmVar7.f47040h = jLongValue5;
                                    }
                                }
                                ozm ozmVar8 = (ozm) nxlVarM18137O3.mo18103l();
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                ozo ozoVar = (ozo) nxlVarM18137O2.f44974b;
                                ozmVar8.getClass();
                                ozoVar.f47048b = ozmVar8;
                                ozoVar.f47047a |= 1;
                                if (!nxnVar.f44974b.m18142ac()) {
                                    nxnVar.mo18106p();
                                }
                                ozp ozpVar = (ozp) nxnVar.f44974b;
                                ozo ozoVar2 = (ozo) nxlVarM18137O2.mo18103l();
                                ozoVar2.getClass();
                                ozpVar.f47052b = ozoVar2;
                                ozpVar.f47051a |= 1;
                                nxl nxlVarM18137O4 = ozz.f47128c.m18137O();
                                ozy ozyVarM14874m = kua.m14874m(zM15377b);
                                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                    nxlVarM18137O4.mo18106p();
                                }
                                ozz ozzVar = (ozz) nxlVarM18137O4.f44974b;
                                ozyVarM14874m.getClass();
                                ozzVar.f47131b = ozyVarM14874m;
                                ozzVar.f47130a |= 1;
                                if (!nxnVar.f44974b.m18142ac()) {
                                    nxnVar.mo18106p();
                                }
                                ozp ozpVar2 = (ozp) nxnVar.f44974b;
                                ozz ozzVar2 = (ozz) nxlVarM18137O4.mo18103l();
                                ozzVar2.getClass();
                                ozpVar2.f47053c = ozzVar2;
                                ozpVar2.f47051a |= 2;
                                nxl nxlVarM18137O5 = ozn.f47041c.m18137O();
                                Object systemService2 = lluVar.f38617c.getSystemService(pIeXJQLZLfgIN.Kla);
                                systemService2.getClass();
                                boolean zIsInteractive = ((PowerManager) systemService2).isInteractive();
                                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                                    nxlVarM18137O5.mo18106p();
                                }
                                ozn oznVar = (ozn) nxlVarM18137O5.f44974b;
                                oznVar.f47043a |= 1;
                                oznVar.f47044b = zIsInteractive;
                                if (!nxnVar.f44974b.m18142ac()) {
                                    nxnVar.mo18106p();
                                }
                                ozp ozpVar3 = (ozp) nxnVar.f44974b;
                                ozn oznVar2 = (ozn) nxlVarM18137O5.mo18103l();
                                oznVar2.getClass();
                                ozpVar3.f47055e = oznVar2;
                                ozpVar3.f47051a |= 8;
                                if (!nxnVar.f44974b.m18142ac()) {
                                    nxnVar.mo18106p();
                                }
                                ozp ozpVar4 = (ozp) nxnVar.f44974b;
                                ozpVar4.f47054d = i2 - 1;
                                ozpVar4.f47051a |= 4;
                                if (str2 != null) {
                                    if (!nxnVar.f44974b.m18142ac()) {
                                        nxnVar.mo18106p();
                                    }
                                    ozp ozpVar5 = (ozp) nxnVar.f44974b;
                                    ozpVar5.f47051a |= 16;
                                    ozpVar5.f47056f = str2;
                                }
                                ozp ozpVar6 = (ozp) nxnVar.mo18103l();
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                pat patVar = (pat) nxlVarM18137O.f44974b;
                                ozpVar6.getClass();
                                patVar.f47280e = ozpVar6;
                                patVar.f47276a |= 8;
                                pat patVar2 = (pat) nxlVarM18137O.mo18103l();
                                lja ljaVarM15522a = ljb.m15522a();
                                ljaVarM15522a.f38343b = null;
                                ljaVarM15522a.m15513c(true);
                                ljaVarM15522a.f38347f = 1000L;
                                ljaVarM15522a.m15515e(patVar2);
                                ljaVarM15522a.f38345d = null;
                                ljaVarM15522a.m15514d(true);
                                return llqVar2.f38598e.m16298b(ljaVarM15522a.m15511a());
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th;
                            }
                        }
                    }, llqVar.f38594a);
                }
            }
        };
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        if (this.f38599f) {
            m15710a();
        }
    }
}
