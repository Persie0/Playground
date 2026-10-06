package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p021j$.nio.file.Files;
import p021j$.nio.file.LinkOption;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.p024io.FileRetargetClass;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmy extends lkm implements lhv, ljh {

    /* JADX INFO: renamed from: d */
    public static final long f38716d = TimeUnit.HOURS.toMillis(12);

    /* JADX INFO: renamed from: e */
    public final Application f38717e;

    /* JADX INFO: renamed from: f */
    public final ohb f38718f;

    /* JADX INFO: renamed from: g */
    public final mbl f38719g;

    /* JADX INFO: renamed from: h */
    public final C1058va f38720h;

    /* JADX INFO: renamed from: i */
    private final lhz f38721i;

    /* JADX INFO: renamed from: j */
    private final Executor f38722j;

    public lmy(ljf ljfVar, Context context, lhz lhzVar, Executor executor, ohb ohbVar, C1058va c1058va, oju ojuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super((byte[]) null);
        this.f38719g = ljfVar.m15526b(executor, ohbVar, ojuVar);
        this.f38722j = executor;
        this.f38717e = (Application) context;
        this.f38718f = ohbVar;
        this.f38720h = c1058va;
        this.f38721i = lhzVar;
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        this.f38721i.m15360a(this);
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public final void mo15356d(Activity activity) {
        this.f38721i.m15361b(this);
        kxk.m14970P(new nol() { // from class: lmx
            /* JADX WARN: Code duplicated, block: B:141:0x0359  */
            /* JADX WARN: Code duplicated, block: B:216:0x0331 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, ksi] */
            /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, oju] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, oju] */
            /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, ksi] */
            /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, oju] */
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() throws Throwable {
                mws mwsVarM17095j;
                ArrayList<lmo> arrayList;
                PriorityQueue priorityQueue;
                lmo lmoVar;
                lmo lmoVar2;
                DirectoryStream<Path> directoryStream;
                Throwable th;
                lmo lmoVar3;
                lmy lmyVar = this.f38715a;
                if (!kuh.m14889d(lmyVar.f38717e)) {
                    return npp.f44031a;
                }
                lij.m15452v();
                C1058va c1058va = lmyVar.f38720h;
                long j = lmy.f38716d;
                lij.m15452v();
                if (kuh.m14889d((Context) c1058va.f47802a)) {
                    long j2 = kuh.m14889d((Context) c1058va.f47802a) ? ((SharedPreferences) c1058va.f47804c.get()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long jMo14816b = c1058va.f47803b.mo14816b();
                    if (jMo14816b < j2) {
                        ((SharedPreferences) c1058va.f47804c.get()).edit().remove("primes.packageMetric.lastSendTime").commit();
                        j2 = -1;
                    }
                    if (j2 != -1 && jMo14816b <= j2 + j) {
                        return npp.f44031a;
                    }
                }
                File parentFile = null;
                if (!lmyVar.f38719g.m16299c(null)) {
                    return npp.f44031a;
                }
                Application application = lmyVar.f38717e;
                lij.m15452v();
                PackageStats packageStatsM15735a = lmt.m15735a(application);
                if (packageStatsM15735a == null) {
                    return kxk.m14964J(new IllegalStateException("PackageStats capture failed."));
                }
                nxl nxlVarM18137O = pat.f47274u.m18137O();
                nxl nxlVarM18137O2 = pao.f47241k.m18137O();
                long j3 = packageStatsM15735a.cacheSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar = (pao) nxlVarM18137O2.f44974b;
                int i = 1;
                paoVar.f47243a |= 1;
                paoVar.f47244b = j3;
                long j4 = packageStatsM15735a.codeSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar2 = (pao) nxlVarM18137O2.f44974b;
                paoVar2.f47243a |= 2;
                paoVar2.f47245c = j4;
                long j5 = packageStatsM15735a.dataSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar3 = (pao) nxlVarM18137O2.f44974b;
                paoVar3.f47243a |= 4;
                paoVar3.f47246d = j5;
                long j6 = packageStatsM15735a.externalCacheSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar4 = (pao) nxlVarM18137O2.f44974b;
                paoVar4.f47243a |= 8;
                paoVar4.f47247e = j6;
                long j7 = packageStatsM15735a.externalCodeSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar5 = (pao) nxlVarM18137O2.f44974b;
                paoVar5.f47243a |= 16;
                paoVar5.f47248f = j7;
                long j8 = packageStatsM15735a.externalDataSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar6 = (pao) nxlVarM18137O2.f44974b;
                paoVar6.f47243a |= 32;
                paoVar6.f47249g = j8;
                long j9 = packageStatsM15735a.externalMediaSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar7 = (pao) nxlVarM18137O2.f44974b;
                paoVar7.f47243a |= 64;
                paoVar7.f47250h = j9;
                long j10 = packageStatsM15735a.externalObbSize;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                pao paoVar8 = (pao) nxlVarM18137O2.f44974b;
                paoVar8.f47243a |= 128;
                paoVar8.f47251i = j10;
                pao paoVar9 = (pao) nxlVarM18137O2.mo18103l();
                nxl nxlVar = (nxl) paoVar9.m18143ad(5);
                nxlVar.m18108s(paoVar9);
                mrm mrmVar = ((lmw) lmyVar.f38718f.get()).f38713a;
                if (mrmVar.mo16813g() && ((lmr) mrmVar.mo16809c()).mo15379b()) {
                    lmr lmrVar = (lmr) mrmVar.mo16809c();
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    ((pao) nxlVar.f44974b).f47252j = nzg.f45063b;
                    Application application2 = lmyVar.f38717e;
                    int i2 = lmrVar.f38704a;
                    mws mwsVar = lmrVar.f38705b;
                    lij.m15452v();
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        EnumMap enumMap = new EnumMap(pam.class);
                        try {
                            parentFile = new File(application2.getPackageManager().getApplicationInfo(application2.getPackageName(), 0).dataDir);
                            while (true) {
                                lmo lmoVar4 = (lmo) priorityQueue.poll();
                                if (lmoVar4 == null) {
                                    break;
                                }
                                arrayList.add(lmoVar4);
                                if (lmoVar4.f38700e) {
                                    try {
                                        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(FileRetargetClass.toPath(lmoVar4.f38697b).resolve(lmoVar4.f38701f));
                                        try {
                                            for (Path path : directoryStreamNewDirectoryStream) {
                                                LinkOption[] linkOptionArr = new LinkOption[i];
                                                linkOptionArr[0] = LinkOption.NOFOLLOW_LINKS;
                                                BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, linkOptionArr);
                                                if (attributes.isSymbolicLink()) {
                                                    i = 1;
                                                } else {
                                                    if (attributes.isRegularFile()) {
                                                        lmo lmoVar5 = lmoVar4;
                                                        try {
                                                            long size = attributes.size();
                                                            lmoVar3 = lmoVar5;
                                                            directoryStream = directoryStreamNewDirectoryStream;
                                                            try {
                                                                lmoVar3.f38702g += size;
                                                                if (mwsVar.isEmpty()) {
                                                                    lmoVar4 = lmoVar3;
                                                                    directoryStreamNewDirectoryStream = directoryStream;
                                                                    i = 1;
                                                                } else if (priorityQueue.size() + arrayList.size() <= 512) {
                                                                    lmo lmoVar6 = new lmo(lmoVar3, false, path.getFileName().toString());
                                                                    nba it = mwsVar.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            lmoVar4 = lmoVar3;
                                                                            directoryStreamNewDirectoryStream = directoryStream;
                                                                            i = 1;
                                                                            break;
                                                                        }
                                                                        if (((lmq) it.next()).m15734a()) {
                                                                            lmoVar6.f38702g = size;
                                                                            priorityQueue.add(lmoVar6);
                                                                            lmoVar4 = lmoVar3;
                                                                            directoryStreamNewDirectoryStream = directoryStream;
                                                                            i = 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    lmoVar4 = lmoVar3;
                                                                    directoryStreamNewDirectoryStream = directoryStream;
                                                                    i = 1;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                lmoVar2 = lmoVar3;
                                                                th = th;
                                                                if (directoryStream != null) {
                                                                    try {
                                                                        directoryStream.close();
                                                                    } catch (Throwable th3) {
                                                                        try {
                                                                            Class[] clsArr = new Class[1];
                                                                            try {
                                                                                clsArr[0] = Throwable.class;
                                                                                Throwable.class.getDeclaredMethod("addSuppressed", clsArr).invoke(th, th3);
                                                                            } catch (Exception e) {
                                                                            }
                                                                        } catch (Exception e2) {
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    throw th;
                                                                } catch (IOException e3) {
                                                                    e = e3;
                                                                } catch (SecurityException e4) {
                                                                    e = e4;
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            lmoVar3 = lmoVar5;
                                                            directoryStream = directoryStreamNewDirectoryStream;
                                                        }
                                                    } else {
                                                        lmoVar2 = lmoVar4;
                                                        directoryStream = directoryStreamNewDirectoryStream;
                                                        try {
                                                            if (attributes.isDirectory()) {
                                                                priorityQueue.add(new lmo(lmoVar2, true, path.getFileName().toString()));
                                                                lmoVar4 = lmoVar2;
                                                                directoryStreamNewDirectoryStream = directoryStream;
                                                                i = 1;
                                                            } else {
                                                                lmoVar4 = lmoVar2;
                                                                directoryStreamNewDirectoryStream = directoryStream;
                                                                i = 1;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            th = th;
                                                            if (directoryStream != null) {
                                                                directoryStream.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    ((nbe) ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17283h(e)).mo17276G(4544)).mo17293r("exception while collecting DirStats for dir %s", lmoVar2.f38701f);
                                                    i = 1;
                                                }
                                            }
                                            lmoVar2 = lmoVar4;
                                            DirectoryStream<Path> directoryStream2 = directoryStreamNewDirectoryStream;
                                            if (directoryStream2 != null) {
                                                try {
                                                    directoryStream2.close();
                                                    i = 1;
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    ((nbe) ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17283h(e)).mo17276G(4544)).mo17293r("exception while collecting DirStats for dir %s", lmoVar2.f38701f);
                                                    i = 1;
                                                } catch (SecurityException e6) {
                                                    e = e6;
                                                    ((nbe) ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17283h(e)).mo17276G(4544)).mo17293r("exception while collecting DirStats for dir %s", lmoVar2.f38701f);
                                                    i = 1;
                                                }
                                            } else {
                                                i = 1;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            lmoVar2 = lmoVar4;
                                            directoryStream = directoryStreamNewDirectoryStream;
                                        }
                                    } catch (IOException | SecurityException e7) {
                                        e = e7;
                                        lmoVar2 = lmoVar4;
                                    }
                                } else {
                                    i = 1;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e8) {
                            ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17276G((char) 4547)).mo17290o("Failed to use package manager getting data directory from context instead.");
                            File filesDir = application2.getFilesDir();
                            if (filesDir != null) {
                                parentFile = filesDir.getParentFile();
                            }
                        }
                        if (parentFile != null) {
                            enumMap.put(pam.CREDENTIAL_ENCRYPTED, parentFile);
                        }
                        arrayList = new ArrayList();
                        priorityQueue = new PriorityQueue();
                        for (Map.Entry entry : enumMap.entrySet()) {
                            try {
                                priorityQueue.add(new lmo((pam) entry.getKey(), ((File) entry.getValue()).getCanonicalFile()));
                                i = 1;
                            } catch (Exception e9) {
                                ((nbe) ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17283h(e9)).mo17276G((char) 4545)).mo17293r("couldn't canonicalize %s, skipping", entry);
                                i = 1;
                            }
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            lmo lmoVar7 = (lmo) arrayList.get(size2);
                            if (lmoVar7.f38700e && (lmoVar = lmoVar7.f38698c) != null) {
                                lmoVar.f38702g += lmoVar7.f38702g;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (lmo lmoVar8 : arrayList) {
                            if (arrayList3.size() >= 512 || lmoVar8.f38699d > i2) {
                                break;
                                break;
                            }
                            nxl nxlVarM18137O3 = pan.f47234f.m18137O();
                            pam pamVar = lmoVar8.f38696a;
                            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            nxq nxqVar = nxlVarM18137O3.f44974b;
                            pan panVar = (pan) nxqVar;
                            panVar.f47240e = pamVar.f47233d;
                            panVar.f47236a |= 4;
                            String str = lmoVar8.f38701f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            nxq nxqVar2 = nxlVarM18137O3.f44974b;
                            pan panVar2 = (pan) nxqVar2;
                            str.getClass();
                            panVar2.f47236a |= 1;
                            panVar2.f47237b = str;
                            long j11 = lmoVar8.f38702g;
                            if (!nxqVar2.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            pan panVar3 = (pan) nxlVarM18137O3.f44974b;
                            panVar3.f47236a |= 2;
                            panVar3.f47239d = j11;
                            arrayList3.add((pan) nxlVarM18137O3.mo18103l());
                        }
                        arrayList2.addAll(arrayList3);
                        mwsVarM17095j = mws.m17095j(arrayList2);
                    } catch (Exception e10) {
                        ((nbe) ((nbe) ((nbe) lmp.f38703a.m17252c()).mo17283h(e10)).mo17276G((char) 4546)).mo17290o("Failed to retrieve DirStats.");
                        int i3 = mws.f41739d;
                        mwsVarM17095j = mzr.f41857a;
                    }
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    pao paoVar10 = (pao) nxlVar.f44974b;
                    paoVar10.m19257c();
                    nwb.m17749e(mwsVarM17095j, paoVar10.f47252j);
                }
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                pat patVar = (pat) nxlVarM18137O.f44974b;
                pao paoVar11 = (pao) nxlVar.mo18103l();
                paoVar11.getClass();
                patVar.f47283h = paoVar11;
                patVar.f47276a |= 128;
                C1058va c1058va2 = lmyVar.f38720h;
                if (kuh.m14889d((Context) c1058va2.f47802a)) {
                    ((SharedPreferences) c1058va2.f47804c.get()).edit().putLong("primes.packageMetric.lastSendTime", c1058va2.f47803b.mo14816b()).commit();
                }
                mbl mblVar = lmyVar.f38719g;
                lja ljaVarM15522a = ljb.m15522a();
                ljaVarM15522a.m15515e((pat) nxlVarM18137O.mo18103l());
                return mblVar.m16298b(ljaVarM15522a.m15511a());
            }
        }, this.f38722j);
    }
}
