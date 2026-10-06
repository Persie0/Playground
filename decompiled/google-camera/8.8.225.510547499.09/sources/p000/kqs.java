package p000;

import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqs implements kqq {

    /* JADX INFO: renamed from: a */
    public final kbo f36914a;

    /* JADX INFO: renamed from: b */
    public final kbz f36915b;

    /* JADX INFO: renamed from: c */
    public final ljf f36916c;

    /* JADX INFO: renamed from: d */
    private final ScheduledExecutorService f36917d;

    /* JADX INFO: renamed from: e */
    private final kqv f36918e;

    /* JADX INFO: renamed from: f */
    private final List f36919f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f36920g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private Set f36921h;

    /* JADX INFO: renamed from: i */
    private Set f36922i;

    /* JADX INFO: renamed from: j */
    private Set f36923j;

    /* JADX INFO: renamed from: k */
    private kqc f36924k;

    /* JADX INFO: renamed from: l */
    private kql f36925l;

    /* JADX INFO: renamed from: m */
    private ScheduledFuture f36926m;

    /* JADX INFO: renamed from: n */
    private mws f36927n;

    /* JADX INFO: renamed from: o */
    private boolean f36928o;

    /* JADX INFO: renamed from: p */
    private boolean f36929p;

    /* JADX INFO: renamed from: q */
    private int f36930q;

    public kqs(ScheduledExecutorService scheduledExecutorService, ljf ljfVar, kqv kqvVar, kbz kbzVar, kbo kboVar, byte[] bArr) {
        int i = mws.f41739d;
        this.f36927n = mzr.f41857a;
        this.f36928o = false;
        this.f36929p = false;
        this.f36930q = 1;
        this.f36917d = scheduledExecutorService;
        this.f36916c = ljfVar;
        this.f36918e = kqvVar;
        this.f36915b = kbzVar;
        this.f36914a = kboVar.mo6314a("MediaGroup");
    }

    /* JADX INFO: renamed from: g */
    private final synchronized void m14717g() {
        if (this.f36926m == null && !this.f36928o) {
            this.f36926m = this.f36917d.schedule(new jzq(this, 19), this.f36918e.f36973r, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m14718h() {
        if (!this.f36929p && this.f36925l != null && this.f36921h != null && this.f36922i != null && this.f36923j != null && (this.f36928o || this.f36919f.size() + this.f36920g.size() == this.f36921h.size() + this.f36922i.size() + this.f36923j.size())) {
            this.f36929p = true;
            ScheduledFuture scheduledFuture = this.f36926m;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f36926m = null;
            }
            final kqm kqmVarM14719c = m14719c();
            this.f36917d.execute(new Runnable() { // from class: kqr
                /* JADX WARN: Code duplicated, block: B:31:0x0132 A[Catch: all -> 0x031d, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:34:0x0145 A[Catch: all -> 0x031d, LOOP:5: B:32:0x013f->B:34:0x0145, LOOP_END, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:42:0x016d A[Catch: all -> 0x031d, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:46:0x0182 A[Catch: all -> 0x031d, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:48:0x018a A[Catch: all -> 0x031d, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:65:0x0210 A[Catch: all -> 0x031d, TryCatch #4 {all -> 0x031d, blocks: (B:3:0x000d, B:5:0x0051, B:69:0x0229, B:70:0x023e, B:72:0x0245, B:75:0x024d, B:76:0x0271, B:77:0x0277, B:79:0x027d, B:80:0x02a1, B:81:0x02a7, B:83:0x02ad, B:90:0x0300, B:89:0x02d3, B:6:0x005b, B:7:0x0071, B:10:0x0079, B:13:0x00b6, B:17:0x00c3, B:19:0x00cd, B:21:0x00d7, B:23:0x00e3, B:24:0x00f0, B:26:0x00f6, B:28:0x011e, B:30:0x0128, B:31:0x0132, B:32:0x013f, B:34:0x0145, B:35:0x0153, B:37:0x015f, B:39:0x0163, B:43:0x0176, B:44:0x017c, B:46:0x0182, B:48:0x018a, B:50:0x0194, B:52:0x019e, B:55:0x01b6, B:57:0x01c0, B:59:0x01d2, B:61:0x01e8, B:63:0x01fa, B:67:0x0215, B:65:0x0210, B:68:0x0221, B:42:0x016d), top: B:118:0x000d }] */
                /* JADX WARN: Code duplicated, block: B:66:0x0213  */
                /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kbz] */
                /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kbz] */
                /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kbo] */
                /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kbz] */
                /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.concurrent.Executor] */
                /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kbo] */
                /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kbo] */
                /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, kbo] */
                @Override // java.lang.Runnable
                public final void run() {
                    kbz kbzVar;
                    ArraySet arraySet;
                    naz nazVarListIterator;
                    kqb kqbVar;
                    mxt mxtVarM17154P;
                    naz nazVarListIterator2;
                    kqe kqeVar;
                    int i;
                    long j;
                    lhz lhzVar;
                    kqe kqeVar2;
                    long j2;
                    krl krlVar;
                    kqs kqsVar = this.f36912a;
                    kqm kqmVar = kqmVarM14719c;
                    kqsVar.f36915b.mo13961e("Publish");
                    try {
                        ljf ljfVar = kqsVar.f36916c;
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        ljfVar.f38371c.mo13961e("names-".concat(String.valueOf(String.valueOf(kqmVar.f36885a))));
                        Object obj = ljfVar.f38372d;
                        boolean z = ((kqv) obj).f36963h;
                        mxk mxkVar = ((kqv) obj).f36965j;
                        ArrayMap arrayMap = new ArrayMap();
                        mxi mxiVarM17132D = mxk.m17132D();
                        mxiVarM17132D.m17129h(kqmVar.f36889e);
                        mxiVarM17132D.m17129h(kqmVar.f36890f);
                        mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
                        if (mxkVarMo17127f.size() == 1) {
                            lhzVar = new lhz(arrayMap);
                            j = jElapsedRealtimeNanos;
                        } else {
                            ArraySet arraySet2 = new ArraySet(mxkVarMo17127f.size());
                            ArraySet arraySet3 = new ArraySet(mxkVarMo17127f.size());
                            naz nazVarListIterator3 = mxkVarMo17127f.listIterator();
                            while (nazVarListIterator3.hasNext()) {
                                kqe kqeVar3 = (kqe) nazVarListIterator3.next();
                                String str = kqeVar3.f36838e.mo14768i().f37088d;
                                naz nazVar = nazVarListIterator3;
                                String str2 = kqeVar3.f36838e.mo14768i().f37085a.toString() + "|" + kqeVar3.f36838e.mo14768i().f37086b;
                                if (!arraySet2.add(str) || !arraySet3.add(str2)) {
                                    break;
                                    break;
                                }
                                nazVarListIterator3 = nazVar;
                            }
                            if (arraySet2.size() == mxkVarMo17127f.size() && arraySet3.size() == mxkVarMo17127f.size()) {
                                lhzVar = new lhz(arrayMap);
                                j = jElapsedRealtimeNanos;
                            } else if (z) {
                                arraySet = new ArraySet(mxkVar.size());
                                nazVarListIterator = mxkVar.listIterator();
                                while (nazVarListIterator.hasNext()) {
                                    arraySet.add(mpw.m16769h((String) nazVarListIterator.next()));
                                }
                                kqbVar = new kqb(arraySet, 0);
                                if (mpw.m16786y(kqbVar, mxkVarMo17127f)) {
                                    Object[] objArrM16519aa = mkv.m16519aa(mxkVarMo17127f);
                                    mxtVarM17154P = mxt.m17154P(kqbVar, objArrM16519aa.length, objArrM16519aa);
                                } else {
                                    Object[] objArrM16519aa2 = mkv.m16519aa(mxkVarMo17127f);
                                    mxtVarM17154P = mxt.m17154P(kqbVar, objArrM16519aa2.length, objArrM16519aa2);
                                }
                                nazVarListIterator2 = mxtVarM17154P.listIterator();
                                kqeVar = null;
                                i = 1;
                                while (nazVarListIterator2.hasNext()) {
                                    kqeVar2 = (kqe) nazVarListIterator2.next();
                                    if (kqeVar != null) {
                                        j2 = jElapsedRealtimeNanos;
                                        if (kqeVar.f36835b == kqeVar2.f36835b) {
                                            i++;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        j2 = jElapsedRealtimeNanos;
                                    }
                                    arrayMap.put(kqeVar2, Integer.valueOf(i));
                                    kqeVar = kqeVar2;
                                    jElapsedRealtimeNanos = j2;
                                }
                                j = jElapsedRealtimeNanos;
                                lhzVar = new lhz(arrayMap);
                            } else {
                                ArraySet arraySet4 = new ArraySet(mxkVarMo17127f.size());
                                naz nazVarListIterator4 = mxkVarMo17127f.listIterator();
                                while (nazVarListIterator4.hasNext()) {
                                    kqe kqeVar4 = (kqe) nazVarListIterator4.next();
                                    if (!arraySet4.add(kqeVar4.f36836c + "|" + kqeVar4.f36838e.mo14768i().f37088d)) {
                                        break;
                                    }
                                }
                                if (arraySet4.size() == mxkVarMo17127f.size()) {
                                    lhzVar = new lhz(arrayMap);
                                    j = jElapsedRealtimeNanos;
                                } else {
                                    arraySet = new ArraySet(mxkVar.size());
                                    nazVarListIterator = mxkVar.listIterator();
                                    while (nazVarListIterator.hasNext()) {
                                        arraySet.add(mpw.m16769h((String) nazVarListIterator.next()));
                                    }
                                    kqbVar = new kqb(arraySet, 0);
                                    if (mpw.m16786y(kqbVar, mxkVarMo17127f) || !(mxkVarMo17127f instanceof mxt)) {
                                        Object[] objArrM16519aa3 = mkv.m16519aa(mxkVarMo17127f);
                                        mxtVarM17154P = mxt.m17154P(kqbVar, objArrM16519aa3.length, objArrM16519aa3);
                                    } else {
                                        mxtVarM17154P = (mxt) mxkVarMo17127f;
                                        if (mxtVarM17154P.mo17014cs()) {
                                            Object[] objArrM16519aa4 = mkv.m16519aa(mxkVarMo17127f);
                                            mxtVarM17154P = mxt.m17154P(kqbVar, objArrM16519aa4.length, objArrM16519aa4);
                                        }
                                    }
                                    nazVarListIterator2 = mxtVarM17154P.listIterator();
                                    kqeVar = null;
                                    i = 1;
                                    while (nazVarListIterator2.hasNext()) {
                                        kqeVar2 = (kqe) nazVarListIterator2.next();
                                        if (kqeVar != null) {
                                            j2 = jElapsedRealtimeNanos;
                                            if (kqeVar.f36835b == kqeVar2.f36835b || ((mpw.m16770i(kqeVar.f36836c, kqeVar2.f36836c) && mpw.m16770i(kqeVar.f36838e.mo14768i().f37088d, kqeVar2.f36838e.mo14768i().f37088d)) || ((z && !mpw.m16770i(kqeVar.f36836c, kqeVar2.f36836c)) || ((arraySet.contains(mpw.m16769h(kqeVar2.f36838e.mo14768i().f37088d)) && !mpw.m16770i(kqeVar.f36838e.mo14768i().f37088d, kqeVar2.f36838e.mo14768i().f37088d)) || (arraySet.contains(mpw.m16769h(kqeVar.f36838e.mo14768i().f37088d)) && !mpw.m16770i(kqeVar.f36838e.mo14768i().f37088d, kqeVar2.f36838e.mo14768i().f37088d)))))) {
                                                i++;
                                            }
                                        } else {
                                            j2 = jElapsedRealtimeNanos;
                                        }
                                        arrayMap.put(kqeVar2, Integer.valueOf(i));
                                        kqeVar = kqeVar2;
                                        jElapsedRealtimeNanos = j2;
                                    }
                                    j = jElapsedRealtimeNanos;
                                    lhzVar = new lhz(arrayMap);
                                }
                            }
                        }
                        ljfVar.f38371c.mo13963g("await-".concat(String.valueOf(String.valueOf(kqmVar.f36885a))));
                        try {
                            naz nazVarListIterator5 = kqmVar.f36889e.listIterator();
                            krlVar = null;
                            while (nazVarListIterator5.hasNext()) {
                                try {
                                    krlVar = ((kqe) nazVarListIterator5.next()).f36838e;
                                    ljfVar.f38375g.mo13944f("Awaiting " + String.valueOf(krlVar));
                                    krlVar.mo14769j();
                                } catch (InterruptedException e) {
                                    ljfVar.f38375g.mo13947i("Interrupted while publishing " + String.valueOf(kqmVar.f36885a) + ", waiting for " + String.valueOf(krlVar) + " to complete!");
                                }
                            }
                            naz nazVarListIterator6 = kqmVar.f36890f.listIterator();
                            while (nazVarListIterator6.hasNext()) {
                                krlVar = ((kqe) nazVarListIterator6.next()).f36838e;
                                ljfVar.f38375g.mo13944f("Awaiting " + String.valueOf(krlVar));
                                krlVar.mo14769j();
                            }
                            naz nazVarListIterator7 = kqmVar.f36891g.listIterator();
                            while (nazVarListIterator7.hasNext()) {
                                krl krlVar2 = (krl) nazVarListIterator7.next();
                                ljfVar.f38375g.mo13944f("Awaiting " + String.valueOf(krlVar2));
                                krlVar2.mo14769j();
                            }
                        } catch (InterruptedException e2) {
                            krlVar = null;
                        }
                        ljfVar.f38371c.mo13962f();
                        ljfVar.f38373e.execute(new Runnable(j, kqmVar, lhzVar, null, null, null, null) { // from class: kqn

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ long f36896a;

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ kqm f36897b;

                            /* JADX INFO: renamed from: d */
                            public final /* synthetic */ lhz f36899d;

                            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kbz] */
                            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kbz] */
                            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kbz] */
                            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.Map] */
                            /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kbz] */
                            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kro] */
                            /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kbo] */
                            /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kbo] */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ljf ljfVar2 = this.f36898c;
                                long j3 = this.f36896a;
                                kqm kqmVar2 = this.f36897b;
                                lhz lhzVar2 = this.f36899d;
                                ljfVar2.f38375g.mo13944f("Publishing ".concat(String.valueOf(String.valueOf(kqmVar2.f36885a))));
                                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                                try {
                                    ljfVar2.f38371c.mo13961e("publish-" + String.valueOf(kqmVar2.f36885a));
                                    krn krnVarMo14749b = ljfVar2.f38374f.mo14749b(kqmVar2.f36893i);
                                    try {
                                        naz nazVarListIterator8 = kqmVar2.f36890f.listIterator();
                                        while (nazVarListIterator8.hasNext()) {
                                            ljfVar2.m15527c(krnVarMo14749b, lhzVar2, kqmVar2, (kqe) nazVarListIterator8.next());
                                        }
                                        naz nazVarListIterator9 = kqmVar2.f36889e.listIterator();
                                        while (nazVarListIterator9.hasNext()) {
                                            ljfVar2.m15527c(krnVarMo14749b, lhzVar2, kqmVar2, (kqe) nazVarListIterator9.next());
                                        }
                                        naz nazVarListIterator10 = kqmVar2.f36891g.listIterator();
                                        while (nazVarListIterator10.hasNext()) {
                                            krl krlVar3 = (krl) nazVarListIterator10.next();
                                            ljfVar2.f38375g.mo13940b("Deleting cached file: " + String.valueOf(krlVar3));
                                            krnVarMo14749b.mo14746a(krlVar3);
                                        }
                                        krnVarMo14749b.close();
                                        ljfVar2.f38375g.mo13940b("Publishing transactions for " + String.valueOf(kqmVar2.f36885a) + " completed.");
                                        Object obj2 = ljfVar2.f38370b;
                                        synchronized (((kqj) obj2).f36864e) {
                                            if (((kqv) ((kqj) obj2).f36861b).f36972q) {
                                                ((kqj) obj2).m14699a(kqmVar2);
                                            } else {
                                                Boolean.TRUE.equals(((kqj) obj2).f36860a.get(kqmVar2.f36885a));
                                                Object obj3 = ((kqj) obj2).f36861b;
                                                ((kqj) obj2).m14699a(kqmVar2);
                                            }
                                        }
                                        ljfVar2.f38371c.mo13962f();
                                        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                                        long j4 = jElapsedRealtimeNanos3 - jElapsedRealtimeNanos2;
                                        long j5 = jElapsedRealtimeNanos3 - j3;
                                        ljfVar2.f38375g.mo13944f("Published " + String.valueOf(kqmVar2.f36885a) + " (" + kqmVar2.f36889e.size() + HRLmc.rKTDrZdVmuC + (j4 / 1000000) + "ms (" + (j5 / 1000000) + "ms total)");
                                        int i2 = kqmVar2.f36894j;
                                        int i3 = i2 + (-1);
                                        if (i2 == 0) {
                                            throw null;
                                        }
                                        switch (i3) {
                                            case 1:
                                                mws mwsVar = kqmVar2.f36892h;
                                                int i4 = ((mzr) mwsVar).f41859c;
                                                for (int i5 = 0; i5 < i4; i5++) {
                                                    try {
                                                        ((kqf) mwsVar.get(i5)).mo5616c();
                                                    } catch (Throwable th) {
                                                        ljfVar2.f38375g.mo13943e("Error notifying a listener of onPublished", th);
                                                    }
                                                }
                                                return;
                                            case 2:
                                                mws mwsVar2 = kqmVar2.f36892h;
                                                int i6 = ((mzr) mwsVar2).f41859c;
                                                for (int i7 = 0; i7 < i6; i7++) {
                                                    try {
                                                        ((kqf) mwsVar2.get(i7)).mo5614a();
                                                    } catch (Throwable th2) {
                                                        ljfVar2.f38375g.mo13943e("Error notifying a listener of onAbandoned", th2);
                                                    }
                                                }
                                                return;
                                            default:
                                                return;
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            krnVarMo14749b.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            try {
                                                String str3 = xRFdVyfdeve.mVDumgzGm;
                                                Class[] clsArr = new Class[1];
                                                try {
                                                    try {
                                                        clsArr[0] = Throwable.class;
                                                        Throwable.class.getDeclaredMethod(str3, clsArr).invoke(th3, th4);
                                                        throw th3;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        try {
                                                            ljfVar2.f38375g.mo13943e("Error publishing " + String.valueOf(kqmVar2.f36885a) + " (" + kqmVar2.f36889e.size() + " file(s))", th);
                                                            mrm mrmVarM16829i = mrm.m16829i(th);
                                                            ljfVar2.f38371c.mo13962f();
                                                            long jElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos();
                                                            long j6 = jElapsedRealtimeNanos4 - jElapsedRealtimeNanos2;
                                                            long j7 = jElapsedRealtimeNanos4 - j3;
                                                            ljfVar2.f38375g.mo13944f("Published " + String.valueOf(kqmVar2.f36885a) + " (" + kqmVar2.f36889e.size() + " file(s)) in " + (j6 / 1000000) + "ms (" + (j7 / 1000000) + "ms total)");
                                                            mws mwsVar3 = kqmVar2.f36892h;
                                                            int i8 = ((mzr) mwsVar3).f41859c;
                                                            for (int i9 = 0; i9 < i8; i9++) {
                                                                try {
                                                                    ((kqf) mwsVar3.get(i9)).mo5615b((Throwable) ((mrq) mrmVarM16829i).f41482a);
                                                                } catch (Throwable th6) {
                                                                    ljfVar2.f38375g.mo13943e("Error notifying a listener of onError", th6);
                                                                }
                                                            }
                                                        } catch (Throwable th7) {
                                                            ljfVar2.f38371c.mo13962f();
                                                            long jElapsedRealtimeNanos5 = SystemClock.elapsedRealtimeNanos();
                                                            long j8 = jElapsedRealtimeNanos5 - jElapsedRealtimeNanos2;
                                                            long j9 = jElapsedRealtimeNanos5 - j3;
                                                            ljfVar2.f38375g.mo13944f("Published " + String.valueOf(kqmVar2.f36885a) + " (" + kqmVar2.f36889e.size() + " file(s)) in " + (j8 / 1000000) + "ms (" + (j9 / 1000000) + "ms total)");
                                                            int i10 = kqmVar2.f36894j;
                                                            int i11 = i10 + (-1);
                                                            if (i10 == 0) {
                                                                throw null;
                                                            }
                                                            switch (i11) {
                                                                case 1:
                                                                    mws mwsVar4 = kqmVar2.f36892h;
                                                                    int i12 = ((mzr) mwsVar4).f41859c;
                                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                                        try {
                                                                            ((kqf) mwsVar4.get(i13)).mo5616c();
                                                                        } catch (Throwable th8) {
                                                                            ljfVar2.f38375g.mo13943e(zuAgeeF.BIhOJClXXQ, th8);
                                                                        }
                                                                    }
                                                                    throw th7;
                                                                case 2:
                                                                    mws mwsVar5 = kqmVar2.f36892h;
                                                                    int i14 = ((mzr) mwsVar5).f41859c;
                                                                    for (int i15 = 0; i15 < i14; i15++) {
                                                                        try {
                                                                            ((kqf) mwsVar5.get(i15)).mo5614a();
                                                                        } catch (Throwable th9) {
                                                                            ljfVar2.f38375g.mo13943e("Error notifying a listener of onAbandoned", th9);
                                                                        }
                                                                    }
                                                                    throw th7;
                                                                default:
                                                                    throw th7;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    throw th3;
                                                }
                                            } catch (Exception e4) {
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            }
                        });
                        kbzVar = kqsVar.f36915b;
                    } catch (Throwable th) {
                        try {
                            kqsVar.f36914a.mo13943e("Error publishing media group!", th);
                            nba it = kqmVar.f36892h.iterator();
                            while (it.hasNext()) {
                                try {
                                    ((kqf) it.next()).mo5615b(th);
                                } catch (Throwable th2) {
                                    kqsVar.f36914a.mo13943e("Error notifying a listener of onError", th);
                                }
                            }
                            kbzVar = kqsVar.f36915b;
                        } catch (Throwable th3) {
                            kqsVar.f36915b.mo13962f();
                            throw th3;
                        }
                    }
                    kbzVar.mo13962f();
                }
            });
        }
    }

    @Override // p000.kqq
    /* JADX INFO: renamed from: a */
    public final synchronized void mo14715a(kqp kqpVar) {
        lku.m15613H(this.f36925l == null);
        this.f36925l = kqpVar.f36910e;
        mzx mzxVar = mzx.f41874a;
        this.f36921h = mzxVar;
        this.f36922i = mzxVar;
        this.f36927n = kqpVar.f36911f;
        this.f36930q = 3;
        HashSet hashSet = new HashSet(kqpVar.f36909d);
        hashSet.addAll(kqpVar.f36907b);
        hashSet.addAll(kqpVar.f36908c);
        this.f36923j = hashSet;
        m14717g();
        m14718h();
    }

    @Override // p000.kqq
    /* JADX INFO: renamed from: b */
    public final synchronized void mo14716b(kqp kqpVar) {
        lku.m15613H(this.f36925l == null);
        this.f36925l = kqpVar.f36910e;
        this.f36924k = kqpVar.f36906a;
        this.f36921h = kqpVar.f36907b;
        this.f36922i = kqpVar.f36908c;
        this.f36923j = mxk.m17134F(kqpVar.f36909d);
        this.f36927n = kqpVar.f36911f;
        this.f36930q = 2;
        m14717g();
        m14718h();
    }

    /* JADX INFO: renamed from: c */
    final synchronized kqm m14719c() {
        kql kqlVar;
        kqh kqhVar;
        String str;
        mxk mxkVar;
        mxk mxkVar2;
        mxk mxkVar3;
        int i;
        mws mwsVar;
        krj krjVar;
        Set set = this.f36921h;
        set.getClass();
        Set set2 = this.f36922i;
        set2.getClass();
        kqlVar = this.f36925l;
        kqlVar.getClass();
        mxi mxiVarM17132D = mxk.m17132D();
        mxi mxiVarM17132D2 = mxk.m17132D();
        mxi mxiVarM17132D3 = mxk.m17132D();
        for (krc krcVar : this.f36919f) {
            if (set.contains(krcVar)) {
                if (krcVar.mo14681a() <= 0) {
                    this.f36914a.mo13942d("Refusing to publish " + String.valueOf(krcVar) + " because the file is empty.");
                    krl krlVarM14741k = krcVar.m14741k();
                    if (krlVarM14741k != null) {
                        mxiVarM17132D3.mo17072d(krlVarM14741k);
                    }
                } else {
                    kqe kqeVarM14740j = krcVar.m14740j();
                    if (krcVar == this.f36924k) {
                        kqlVar.f36877e = kqeVarM14740j;
                    }
                    mxiVarM17132D.mo17072d(kqeVarM14740j);
                }
            } else if (!set2.contains(krcVar)) {
                krl krlVarM14741k2 = krcVar.m14741k();
                if (krlVarM14741k2 != null) {
                    mxiVarM17132D3.mo17072d(krlVarM14741k2);
                }
            } else if (krcVar.mo14681a() <= 0) {
                this.f36914a.mo13942d("Refusing to publish " + String.valueOf(krcVar) + YmzeHXaMYOLk.CzBkHGtxEMZXAF);
                krl krlVarM14741k3 = krcVar.m14741k();
                if (krlVarM14741k3 != null) {
                    mxiVarM17132D3.mo17072d(krlVarM14741k3);
                }
            } else {
                kqe kqeVarM14740j2 = krcVar.m14740j();
                if (krcVar == this.f36924k) {
                    kqlVar.f36877e = kqeVarM14740j2;
                }
                mxiVarM17132D2.mo17072d(kqeVarM14740j2);
            }
        }
        Iterator it = this.f36920g.iterator();
        while (it.hasNext()) {
            krl krlVarM14741k4 = ((krc) it.next()).m14741k();
            if (krlVarM14741k4 != null) {
                mxiVarM17132D3.mo17072d(krlVarM14741k4);
            }
        }
        mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
        if (mxkVarMo17127f == null) {
            throw new NullPointerException("Null mediaFiles");
        }
        kqlVar.f36878f = mxkVarMo17127f;
        mxk mxkVarMo17127f2 = mxiVarM17132D2.mo17127f();
        if (mxkVarMo17127f2 == null) {
            throw new NullPointerException("Null privateMediaFiles");
        }
        kqlVar.f36879g = mxkVarMo17127f2;
        mxk mxkVarMo17127f3 = mxiVarM17132D3.mo17127f();
        if (mxkVarMo17127f3 == null) {
            throw new NullPointerException("Null cachedFiles");
        }
        kqlVar.f36880h = mxkVarMo17127f3;
        kqlVar.m14710a(this.f36927n);
        kqlVar.m14711b(this.f36930q);
        if (kqlVar.f36883k == 3 && (kqhVar = kqlVar.f36873a) != null && (str = kqlVar.f36876d) != null && (mxkVar = kqlVar.f36878f) != null && (mxkVar2 = kqlVar.f36879g) != null && (mxkVar3 = kqlVar.f36880h) != null && (i = kqlVar.f36884l) != 0 && (mwsVar = kqlVar.f36881i) != null && (krjVar = kqlVar.f36882j) != null) {
        }
        StringBuilder sb = new StringBuilder();
        if (kqlVar.f36873a == null) {
            sb.append(" mediaGroupId");
        }
        if ((kqlVar.f36883k & 1) == 0) {
            sb.append(" timestampNs");
        }
        if ((kqlVar.f36883k & 2) == 0) {
            sb.append(" utcTimestampMs");
        }
        if (kqlVar.f36876d == null) {
            sb.append(" tag");
        }
        if (kqlVar.f36878f == null) {
            sb.append(" mediaFiles");
        }
        if (kqlVar.f36879g == null) {
            sb.append(" privateMediaFiles");
        }
        if (kqlVar.f36880h == null) {
            sb.append(" cachedFiles");
        }
        if (kqlVar.f36884l == 0) {
            sb.append(" publishIntent");
        }
        if (kqlVar.f36881i == null) {
            sb.append(gBCSQzBeB.nKvFwOZ);
        }
        if (kqlVar.f36882j == null) {
            sb.append(" contentResolverApi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        return new kqm(kqhVar, kqlVar.f36874b, kqlVar.f36875c, str, kqlVar.f36877e, mxkVar, mxkVar2, mxkVar3, i, mwsVar, krjVar);
    }

    @Override // p000.krb
    /* JADX INFO: renamed from: d */
    public final synchronized void mo14720d(krc krcVar) {
        this.f36920g.add(krcVar);
        m14718h();
    }

    @Override // p000.krb
    /* JADX INFO: renamed from: e */
    public final synchronized void mo14721e(krc krcVar) {
        this.f36919f.add(krcVar);
        m14718h();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m14722f() {
        HashSet hashSetM16749A = mpw.m16749A();
        Set set = this.f36921h;
        set.getClass();
        hashSetM16749A.addAll(set);
        Set set2 = this.f36922i;
        set2.getClass();
        hashSetM16749A.addAll(set2);
        Set set3 = this.f36923j;
        set3.getClass();
        hashSetM16749A.addAll(set3);
        hashSetM16749A.removeAll(this.f36919f);
        hashSetM16749A.removeAll(this.f36920g);
        kbo kboVar = this.f36914a;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        kql kqlVar = this.f36925l;
        kqlVar.getClass();
        kqh kqhVar = kqlVar.f36873a;
        if (kqhVar == null) {
            throw new IllegalStateException("Property \"mediaGroupId\" has not been set");
        }
        objArr[0] = kqhVar;
        objArr[1] = Long.valueOf(this.f36918e.f36973r);
        objArr[2] = Integer.valueOf(hashSetM16749A.size());
        objArr[3] = hashSetM16749A;
        kboVar.mo13947i(String.format(locale, "Failed to publish MediaGroup-%s after %s ms. Forcibly publishing, and ignoring %s files that are neither published nor abandoned: %s.", objArr));
        mws mwsVar = this.f36927n;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            ((kqf) mwsVar.get(i2)).mo5617d();
        }
        this.f36928o = true;
        m14718h();
    }
}
