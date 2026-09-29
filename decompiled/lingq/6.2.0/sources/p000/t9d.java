package p000;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzti;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class t9d {

    /* JADX INFO: renamed from: i */
    public static final li1 f62026i = new li1(1);

    /* JADX INFO: renamed from: j */
    public static final u7d f62027j = new u7d(ujb.f63993c, false, ImmutableSet.m6310s());

    /* JADX INFO: renamed from: a */
    public volatile pc0 f62028a;

    /* JADX INFO: renamed from: b */
    public final C0962f f62029b;

    /* JADX INFO: renamed from: c */
    public final String f62030c;

    /* JADX INFO: renamed from: d */
    public final String f62031d;

    /* JADX INFO: renamed from: e */
    public final boolean f62032e;

    /* JADX INFO: renamed from: f */
    public final ImmutableSet f62033f;

    /* JADX INFO: renamed from: g */
    public final nr9 f62034g;

    /* JADX INFO: renamed from: h */
    public final sq5 f62035h;

    public t9d(C0962f c0962f, u7d u7dVar) {
        this.f62029b = c0962f;
        Context context = c0962f.f11845b;
        String str = u7dVar.f63532d;
        if (str == null) {
            str = (String) u7dVar.f63529a.apply(context);
            u7dVar.f63532d = str;
        }
        this.f62030c = str;
        this.f62031d = "";
        this.f62032e = u7dVar.f63530b;
        this.f62033f = u7dVar.f63531c;
        this.f62028a = null;
        nr9 nr9Var = new nr9();
        nr9Var.f53173a = new AtomicInteger();
        this.f62034g = nr9Var;
        this.f62035h = new sq5(c0962f, str);
    }

    /* JADX INFO: renamed from: a */
    public final pc0 m21918a() {
        pc0 pc0Var;
        pc0 pc0Var2 = this.f62028a;
        if (pc0Var2 != null) {
            return pc0Var2;
        }
        synchronized (this) {
            try {
                pc0Var = this.f62028a;
                if (pc0Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        pc0 pc0VarM21558G = this.f62035h.m21558G();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i = ((xp7) pc0VarM21558G.f55941e).f68499c - 2;
                        if (i == 15 || i == 16) {
                            pc0Var = pc0VarM21558G;
                        } else {
                            C0962f c0962f = this.f62029b;
                            c0962f.f11850g.m23256a();
                            if (this.f62032e || this.f62035h.m21561J() || !((String) pc0VarM21558G.f55938b).isEmpty()) {
                                c0962f.m5409a().execute(new RunnableC3795yg(this, 13));
                                c0962f.f11844a.m21559H((zzacr) pc0VarM21558G.f55939c, this.f62033f, this.f62030c);
                                if (!this.f62031d.equals("")) {
                                    final int i2 = 1;
                                    c0962f.m5409a().execute(new Runnable(this) { // from class: a8d

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ t9d f368b;

                                        {
                                            this.f368b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            njd njdVar;
                                            ListenableFuture listenableFuture;
                                            int i3 = i2;
                                            int i4 = 0;
                                            boolean z = true;
                                            t9d t9dVar = this.f368b;
                                            switch (i3) {
                                                case 0:
                                                    t9dVar.m21919b();
                                                    return;
                                                case 1:
                                                    C0962f c0962f2 = t9dVar.f62029b;
                                                    String str = t9dVar.f62030c;
                                                    hld hldVar = cbd.f9865a;
                                                    Object obj = j13.f44894k;
                                                    Context context = c0962f2.f11845b;
                                                    Pattern pattern = rgd.f59246a;
                                                    co7 co7Var = new co7(context);
                                                    co7Var.m4942x("phenotype");
                                                    co7Var.m4943y("all_accounts.pb");
                                                    Uri uriM4944z = co7Var.m4944z();
                                                    if (uriM4944z == null) {
                                                        C3386nv.m17635v("Null uri");
                                                        return;
                                                    }
                                                    w5d w5dVarM23768t = w5d.m23768t();
                                                    if (w5dVarM23768t == null) {
                                                        C3386nv.m17635v("Null schema");
                                                        return;
                                                    }
                                                    Optional optionalM6263d = Optional.m6263d(cbd.f9865a);
                                                    ImmutableList immutableListM6289v = ImmutableList.m6289v();
                                                    njd njdVar2 = new njd(uriM4944z, w5dVarM23768t, optionalM6263d, immutableListM6289v);
                                                    ca1 ca1Var = cbd.f9867c;
                                                    if (ca1Var == null) {
                                                        synchronized (cbd.f9866b) {
                                                            try {
                                                                ca1Var = cbd.f9867c;
                                                                if (ca1Var == null) {
                                                                    HashMap map = new HashMap();
                                                                    c26 c26VarM5409a = c0962f2.m5409a();
                                                                    dgd dgdVar = (dgd) c0962f2.f11849f.get();
                                                                    ikd ikdVar = ikd.f44249a;
                                                                    zzti.ALLOWED.getClass();
                                                                    bna.m3971r(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", ikdVar);
                                                                    ca1 ca1Var2 = new ca1();
                                                                    ca1Var2.f9781a = new ConcurrentHashMap();
                                                                    c26VarM5409a.getClass();
                                                                    ca1Var2.f9782b = c26VarM5409a;
                                                                    dgdVar.getClass();
                                                                    ca1Var2.f9783c = dgdVar;
                                                                    ca1Var2.f9785e = map;
                                                                    bna.m3969q(!map.isEmpty());
                                                                    ca1Var2.f9784d = akd.f787b;
                                                                    cbd.f9867c = ca1Var2;
                                                                    ca1Var = ca1Var2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        c0962f2 = c0962f2;
                                                        z = true;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ca1Var.f9781a;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriM4944z);
                                                    if (pairCreate == null) {
                                                        bna.m3971r(uriM4944z.isHierarchical(), "Uri must be hierarchical: %s", uriM4944z);
                                                        String lastPathSegment = uriM4944z.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        bna.m3971r((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM4944z);
                                                        ikd ikdVar2 = (ikd) ((HashMap) ca1Var.f9785e).get("singleproc");
                                                        bna.m3971r(ikdVar2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriM4944z.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        C3780y1 c3780y1M6403g = AbstractC1118h.m6403g(AbstractC1118h.m6399c(uriM4944z), (akd) ca1Var.f9784d, AbstractC1120j.m6404a());
                                                        Executor executor = (Executor) ca1Var.f9782b;
                                                        dgd dgdVar2 = (dgd) ca1Var.f9783c;
                                                        zzti zztiVar = zzti.ALLOWED;
                                                        ikdVar2.getClass();
                                                        zztiVar.getClass();
                                                        String str2 = strSubstring;
                                                        njdVar = njdVar2;
                                                        ckd ckdVar = new ckd(new rkd(str2, AbstractC1118h.m6399c(uriM4944z), new ild(w5dVarM23768t, phb.m19145a()), executor, dgdVar2, optionalM6263d, new to2()), c3780y1M6403g);
                                                        if (!immutableListM6289v.isEmpty()) {
                                                            ubd ubdVar = new ubd(z ? 1 : 0, immutableListM6289v, executor);
                                                            synchronized (ckdVar.f10206g) {
                                                                ckdVar.f10208i.add(ubdVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(ckdVar, njdVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM4944z, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        njdVar = njdVar2;
                                                    }
                                                    ckd ckdVar2 = (ckd) pairCreate.first;
                                                    njd njdVar3 = (njd) pairCreate.second;
                                                    if (njdVar.equals(njdVar3)) {
                                                        C3817z1 c3817z1M4825a = ckdVar2.m4825a(new q8d(str, 1), c0962f2.m5409a());
                                                        c3817z1M4825a.mo52a(new kj3(22, t9dVar, c3817z1M4825a), c0962f2.m5409a());
                                                        return;
                                                    }
                                                    String strM3207B = b34.m3207B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", w5d.class.getSimpleName(), uriM4944z);
                                                    bna.m3971r(uriM4944z.equals(njdVar3.f52863a), strM3207B, "uri");
                                                    bna.m3971r(w5dVarM23768t.equals(njdVar3.f52864b), strM3207B, "schema");
                                                    bna.m3971r(optionalM6263d.equals(njdVar3.f52865c), strM3207B, "handler");
                                                    bna.m3971r(immutableListM6289v.equals(njdVar3.f52866d), strM3207B, "migrations");
                                                    bna.m3971r(obj.equals(obj), strM3207B, "variantConfig");
                                                    C3386nv.m17626m(b34.m3207B(strM3207B, "unknown"));
                                                    return;
                                                default:
                                                    fcd fcdVar = t9dVar.f62029b.f11852i;
                                                    zzabz zzabzVar = zzabz.FILE;
                                                    boolean z2 = t9dVar.f62032e;
                                                    n8d n8dVar = n8d.f52499a;
                                                    zcd zcdVar = (zcd) fcdVar.f38873c.get();
                                                    if (zcdVar == null && !z2) {
                                                        y04 y04Var = y04.f69048b;
                                                        return;
                                                    }
                                                    int iZza = 1 << zzabzVar.zza();
                                                    if ((fcdVar.f38875e & iZza) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = fcdVar.f38876f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i5 = fcdVar.f38875e;
                                                                if ((i5 & iZza) == 0) {
                                                                    copyOnWriteArrayList.add(n8dVar);
                                                                    fcdVar.f38875e = iZza | i5;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (fcdVar.f38878h == null) {
                                                        synchronized (fcdVar.f38877g) {
                                                            try {
                                                                if (fcdVar.f38878h == null) {
                                                                    if (zcdVar == null) {
                                                                        zcdVar = xbd.f68048a;
                                                                    }
                                                                    Context context2 = fcdVar.f38871a;
                                                                    if (pvc.m19504L(context2)) {
                                                                        C3555s c3555sM9999a = ((d2d) fcdVar.f38874d.get()).m9999a(new ccd(fcdVar, zcdVar));
                                                                        fcdVar.f38878h = c3555sM9999a;
                                                                        listenableFuture = c3555sM9999a;
                                                                    } else {
                                                                        ddb ddbVar = ddb.f35478c;
                                                                        on9 on9Var = fcdVar.f38872b;
                                                                        C3780y1 c3780y1M6403g2 = AbstractC1118h.m6403g(pvc.m19503K(context2, Executors.callable(ddbVar, null), (Executor) on9Var.get()), new ubd(i4, fcdVar, zcdVar), (Executor) on9Var.get());
                                                                        fcdVar.f38878h = c3780y1M6403g2;
                                                                        listenableFuture = c3780y1M6403g2;
                                                                    }
                                                                    listenableFuture.mo52a(new s3d(listenableFuture, 4), (Executor) fcdVar.f38872b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.f62035h.m21561J()) {
                                    final int i3 = 2;
                                    c0962f.m5409a().execute(new Runnable(this) { // from class: a8d

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ t9d f368b;

                                        {
                                            this.f368b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            njd njdVar;
                                            ListenableFuture listenableFuture;
                                            int i4 = i3;
                                            int i5 = 0;
                                            boolean z = true;
                                            t9d t9dVar = this.f368b;
                                            switch (i4) {
                                                case 0:
                                                    t9dVar.m21919b();
                                                    return;
                                                case 1:
                                                    C0962f c0962f2 = t9dVar.f62029b;
                                                    String str = t9dVar.f62030c;
                                                    hld hldVar = cbd.f9865a;
                                                    Object obj = j13.f44894k;
                                                    Context context = c0962f2.f11845b;
                                                    Pattern pattern = rgd.f59246a;
                                                    co7 co7Var = new co7(context);
                                                    co7Var.m4942x("phenotype");
                                                    co7Var.m4943y("all_accounts.pb");
                                                    Uri uriM4944z = co7Var.m4944z();
                                                    if (uriM4944z == null) {
                                                        C3386nv.m17635v("Null uri");
                                                        return;
                                                    }
                                                    w5d w5dVarM23768t = w5d.m23768t();
                                                    if (w5dVarM23768t == null) {
                                                        C3386nv.m17635v("Null schema");
                                                        return;
                                                    }
                                                    Optional optionalM6263d = Optional.m6263d(cbd.f9865a);
                                                    ImmutableList immutableListM6289v = ImmutableList.m6289v();
                                                    njd njdVar2 = new njd(uriM4944z, w5dVarM23768t, optionalM6263d, immutableListM6289v);
                                                    ca1 ca1Var = cbd.f9867c;
                                                    if (ca1Var == null) {
                                                        synchronized (cbd.f9866b) {
                                                            try {
                                                                ca1Var = cbd.f9867c;
                                                                if (ca1Var == null) {
                                                                    HashMap map = new HashMap();
                                                                    c26 c26VarM5409a = c0962f2.m5409a();
                                                                    dgd dgdVar = (dgd) c0962f2.f11849f.get();
                                                                    ikd ikdVar = ikd.f44249a;
                                                                    zzti.ALLOWED.getClass();
                                                                    bna.m3971r(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", ikdVar);
                                                                    ca1 ca1Var2 = new ca1();
                                                                    ca1Var2.f9781a = new ConcurrentHashMap();
                                                                    c26VarM5409a.getClass();
                                                                    ca1Var2.f9782b = c26VarM5409a;
                                                                    dgdVar.getClass();
                                                                    ca1Var2.f9783c = dgdVar;
                                                                    ca1Var2.f9785e = map;
                                                                    bna.m3969q(!map.isEmpty());
                                                                    ca1Var2.f9784d = akd.f787b;
                                                                    cbd.f9867c = ca1Var2;
                                                                    ca1Var = ca1Var2;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        c0962f2 = c0962f2;
                                                        z = true;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ca1Var.f9781a;
                                                    Pair pairCreate = (Pair) concurrentHashMap.get(uriM4944z);
                                                    if (pairCreate == null) {
                                                        bna.m3971r(uriM4944z.isHierarchical(), "Uri must be hierarchical: %s", uriM4944z);
                                                        String lastPathSegment = uriM4944z.getLastPathSegment();
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = "";
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        bna.m3971r((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM4944z);
                                                        ikd ikdVar2 = (ikd) ((HashMap) ca1Var.f9785e).get("singleproc");
                                                        bna.m3971r(ikdVar2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriM4944z.getLastPathSegment();
                                                        String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                        int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                        }
                                                        C3780y1 c3780y1M6403g = AbstractC1118h.m6403g(AbstractC1118h.m6399c(uriM4944z), (akd) ca1Var.f9784d, AbstractC1120j.m6404a());
                                                        Executor executor = (Executor) ca1Var.f9782b;
                                                        dgd dgdVar2 = (dgd) ca1Var.f9783c;
                                                        zzti zztiVar = zzti.ALLOWED;
                                                        ikdVar2.getClass();
                                                        zztiVar.getClass();
                                                        String str2 = strSubstring;
                                                        njdVar = njdVar2;
                                                        ckd ckdVar = new ckd(new rkd(str2, AbstractC1118h.m6399c(uriM4944z), new ild(w5dVarM23768t, phb.m19145a()), executor, dgdVar2, optionalM6263d, new to2()), c3780y1M6403g);
                                                        if (!immutableListM6289v.isEmpty()) {
                                                            ubd ubdVar = new ubd(z ? 1 : 0, immutableListM6289v, executor);
                                                            synchronized (ckdVar.f10206g) {
                                                                ckdVar.f10208i.add(ubdVar);
                                                            }
                                                        }
                                                        pairCreate = Pair.create(ckdVar, njdVar);
                                                        Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM4944z, pairCreate);
                                                        if (pair != null) {
                                                            pairCreate = pair;
                                                        }
                                                        break;
                                                    } else {
                                                        njdVar = njdVar2;
                                                    }
                                                    ckd ckdVar2 = (ckd) pairCreate.first;
                                                    njd njdVar3 = (njd) pairCreate.second;
                                                    if (njdVar.equals(njdVar3)) {
                                                        C3817z1 c3817z1M4825a = ckdVar2.m4825a(new q8d(str, 1), c0962f2.m5409a());
                                                        c3817z1M4825a.mo52a(new kj3(22, t9dVar, c3817z1M4825a), c0962f2.m5409a());
                                                        return;
                                                    }
                                                    String strM3207B = b34.m3207B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", w5d.class.getSimpleName(), uriM4944z);
                                                    bna.m3971r(uriM4944z.equals(njdVar3.f52863a), strM3207B, "uri");
                                                    bna.m3971r(w5dVarM23768t.equals(njdVar3.f52864b), strM3207B, "schema");
                                                    bna.m3971r(optionalM6263d.equals(njdVar3.f52865c), strM3207B, "handler");
                                                    bna.m3971r(immutableListM6289v.equals(njdVar3.f52866d), strM3207B, "migrations");
                                                    bna.m3971r(obj.equals(obj), strM3207B, "variantConfig");
                                                    C3386nv.m17626m(b34.m3207B(strM3207B, "unknown"));
                                                    return;
                                                default:
                                                    fcd fcdVar = t9dVar.f62029b.f11852i;
                                                    zzabz zzabzVar = zzabz.FILE;
                                                    boolean z2 = t9dVar.f62032e;
                                                    n8d n8dVar = n8d.f52499a;
                                                    zcd zcdVar = (zcd) fcdVar.f38873c.get();
                                                    if (zcdVar == null && !z2) {
                                                        y04 y04Var = y04.f69048b;
                                                        return;
                                                    }
                                                    int iZza = 1 << zzabzVar.zza();
                                                    if ((fcdVar.f38875e & iZza) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = fcdVar.f38876f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i6 = fcdVar.f38875e;
                                                                if ((i6 & iZza) == 0) {
                                                                    copyOnWriteArrayList.add(n8dVar);
                                                                    fcdVar.f38875e = iZza | i6;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (fcdVar.f38878h == null) {
                                                        synchronized (fcdVar.f38877g) {
                                                            try {
                                                                if (fcdVar.f38878h == null) {
                                                                    if (zcdVar == null) {
                                                                        zcdVar = xbd.f68048a;
                                                                    }
                                                                    Context context2 = fcdVar.f38871a;
                                                                    if (pvc.m19504L(context2)) {
                                                                        C3555s c3555sM9999a = ((d2d) fcdVar.f38874d.get()).m9999a(new ccd(fcdVar, zcdVar));
                                                                        fcdVar.f38878h = c3555sM9999a;
                                                                        listenableFuture = c3555sM9999a;
                                                                    } else {
                                                                        ddb ddbVar = ddb.f35478c;
                                                                        on9 on9Var = fcdVar.f38872b;
                                                                        C3780y1 c3780y1M6403g2 = AbstractC1118h.m6403g(pvc.m19503K(context2, Executors.callable(ddbVar, null), (Executor) on9Var.get()), new ubd(i5, fcdVar, zcdVar), (Executor) on9Var.get());
                                                                        fcdVar.f38878h = c3780y1M6403g2;
                                                                        listenableFuture = c3780y1M6403g2;
                                                                    }
                                                                    listenableFuture.mo52a(new s3d(listenableFuture, 4), (Executor) fcdVar.f38872b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                                pc0Var = pc0VarM21558G;
                            } else {
                                final int i4 = 0;
                                c0962f.m5409a().execute(new Runnable(this) { // from class: a8d

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ t9d f368b;

                                    {
                                        this.f368b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        njd njdVar;
                                        ListenableFuture listenableFuture;
                                        int i5 = i4;
                                        int i6 = 0;
                                        boolean z = true;
                                        t9d t9dVar = this.f368b;
                                        switch (i5) {
                                            case 0:
                                                t9dVar.m21919b();
                                                return;
                                            case 1:
                                                C0962f c0962f2 = t9dVar.f62029b;
                                                String str = t9dVar.f62030c;
                                                hld hldVar = cbd.f9865a;
                                                Object obj = j13.f44894k;
                                                Context context = c0962f2.f11845b;
                                                Pattern pattern = rgd.f59246a;
                                                co7 co7Var = new co7(context);
                                                co7Var.m4942x("phenotype");
                                                co7Var.m4943y("all_accounts.pb");
                                                Uri uriM4944z = co7Var.m4944z();
                                                if (uriM4944z == null) {
                                                    C3386nv.m17635v("Null uri");
                                                    return;
                                                }
                                                w5d w5dVarM23768t = w5d.m23768t();
                                                if (w5dVarM23768t == null) {
                                                    C3386nv.m17635v("Null schema");
                                                    return;
                                                }
                                                Optional optionalM6263d = Optional.m6263d(cbd.f9865a);
                                                ImmutableList immutableListM6289v = ImmutableList.m6289v();
                                                njd njdVar2 = new njd(uriM4944z, w5dVarM23768t, optionalM6263d, immutableListM6289v);
                                                ca1 ca1Var = cbd.f9867c;
                                                if (ca1Var == null) {
                                                    synchronized (cbd.f9866b) {
                                                        try {
                                                            ca1Var = cbd.f9867c;
                                                            if (ca1Var == null) {
                                                                HashMap map = new HashMap();
                                                                c26 c26VarM5409a = c0962f2.m5409a();
                                                                dgd dgdVar = (dgd) c0962f2.f11849f.get();
                                                                ikd ikdVar = ikd.f44249a;
                                                                zzti.ALLOWED.getClass();
                                                                bna.m3971r(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", ikdVar);
                                                                ca1 ca1Var2 = new ca1();
                                                                ca1Var2.f9781a = new ConcurrentHashMap();
                                                                c26VarM5409a.getClass();
                                                                ca1Var2.f9782b = c26VarM5409a;
                                                                dgdVar.getClass();
                                                                ca1Var2.f9783c = dgdVar;
                                                                ca1Var2.f9785e = map;
                                                                bna.m3969q(!map.isEmpty());
                                                                ca1Var2.f9784d = akd.f787b;
                                                                cbd.f9867c = ca1Var2;
                                                                ca1Var = ca1Var2;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    c0962f2 = c0962f2;
                                                    z = true;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ca1Var.f9781a;
                                                Pair pairCreate = (Pair) concurrentHashMap.get(uriM4944z);
                                                if (pairCreate == null) {
                                                    bna.m3971r(uriM4944z.isHierarchical(), "Uri must be hierarchical: %s", uriM4944z);
                                                    String lastPathSegment = uriM4944z.getLastPathSegment();
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = "";
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    bna.m3971r((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriM4944z);
                                                    ikd ikdVar2 = (ikd) ((HashMap) ca1Var.f9785e).get("singleproc");
                                                    bna.m3971r(ikdVar2 != null ? z : false, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriM4944z.getLastPathSegment();
                                                    String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
                                                    int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                    }
                                                    C3780y1 c3780y1M6403g = AbstractC1118h.m6403g(AbstractC1118h.m6399c(uriM4944z), (akd) ca1Var.f9784d, AbstractC1120j.m6404a());
                                                    Executor executor = (Executor) ca1Var.f9782b;
                                                    dgd dgdVar2 = (dgd) ca1Var.f9783c;
                                                    zzti zztiVar = zzti.ALLOWED;
                                                    ikdVar2.getClass();
                                                    zztiVar.getClass();
                                                    String str2 = strSubstring;
                                                    njdVar = njdVar2;
                                                    ckd ckdVar = new ckd(new rkd(str2, AbstractC1118h.m6399c(uriM4944z), new ild(w5dVarM23768t, phb.m19145a()), executor, dgdVar2, optionalM6263d, new to2()), c3780y1M6403g);
                                                    if (!immutableListM6289v.isEmpty()) {
                                                        ubd ubdVar = new ubd(z ? 1 : 0, immutableListM6289v, executor);
                                                        synchronized (ckdVar.f10206g) {
                                                            ckdVar.f10208i.add(ubdVar);
                                                        }
                                                    }
                                                    pairCreate = Pair.create(ckdVar, njdVar);
                                                    Pair pair = (Pair) concurrentHashMap.putIfAbsent(uriM4944z, pairCreate);
                                                    if (pair != null) {
                                                        pairCreate = pair;
                                                    }
                                                    break;
                                                } else {
                                                    njdVar = njdVar2;
                                                }
                                                ckd ckdVar2 = (ckd) pairCreate.first;
                                                njd njdVar3 = (njd) pairCreate.second;
                                                if (njdVar.equals(njdVar3)) {
                                                    C3817z1 c3817z1M4825a = ckdVar2.m4825a(new q8d(str, 1), c0962f2.m5409a());
                                                    c3817z1M4825a.mo52a(new kj3(22, t9dVar, c3817z1M4825a), c0962f2.m5409a());
                                                    return;
                                                }
                                                String strM3207B = b34.m3207B("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", w5d.class.getSimpleName(), uriM4944z);
                                                bna.m3971r(uriM4944z.equals(njdVar3.f52863a), strM3207B, "uri");
                                                bna.m3971r(w5dVarM23768t.equals(njdVar3.f52864b), strM3207B, "schema");
                                                bna.m3971r(optionalM6263d.equals(njdVar3.f52865c), strM3207B, "handler");
                                                bna.m3971r(immutableListM6289v.equals(njdVar3.f52866d), strM3207B, "migrations");
                                                bna.m3971r(obj.equals(obj), strM3207B, "variantConfig");
                                                C3386nv.m17626m(b34.m3207B(strM3207B, "unknown"));
                                                return;
                                            default:
                                                fcd fcdVar = t9dVar.f62029b.f11852i;
                                                zzabz zzabzVar = zzabz.FILE;
                                                boolean z2 = t9dVar.f62032e;
                                                n8d n8dVar = n8d.f52499a;
                                                zcd zcdVar = (zcd) fcdVar.f38873c.get();
                                                if (zcdVar == null && !z2) {
                                                    y04 y04Var = y04.f69048b;
                                                    return;
                                                }
                                                int iZza = 1 << zzabzVar.zza();
                                                if ((fcdVar.f38875e & iZza) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = fcdVar.f38876f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i7 = fcdVar.f38875e;
                                                            if ((i7 & iZza) == 0) {
                                                                copyOnWriteArrayList.add(n8dVar);
                                                                fcdVar.f38875e = iZza | i7;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (fcdVar.f38878h == null) {
                                                    synchronized (fcdVar.f38877g) {
                                                        try {
                                                            if (fcdVar.f38878h == null) {
                                                                if (zcdVar == null) {
                                                                    zcdVar = xbd.f68048a;
                                                                }
                                                                Context context2 = fcdVar.f38871a;
                                                                if (pvc.m19504L(context2)) {
                                                                    C3555s c3555sM9999a = ((d2d) fcdVar.f38874d.get()).m9999a(new ccd(fcdVar, zcdVar));
                                                                    fcdVar.f38878h = c3555sM9999a;
                                                                    listenableFuture = c3555sM9999a;
                                                                } else {
                                                                    ddb ddbVar = ddb.f35478c;
                                                                    on9 on9Var = fcdVar.f38872b;
                                                                    C3780y1 c3780y1M6403g2 = AbstractC1118h.m6403g(pvc.m19503K(context2, Executors.callable(ddbVar, null), (Executor) on9Var.get()), new ubd(i6, fcdVar, zcdVar), (Executor) on9Var.get());
                                                                    fcdVar.f38878h = c3780y1M6403g2;
                                                                    listenableFuture = c3780y1M6403g2;
                                                                }
                                                                listenableFuture.mo52a(new s3d(listenableFuture, 4), (Executor) fcdVar.f38872b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                pc0Var = new pc0(udd.m22703z(), (xp7) pc0VarM21558G.f55941e);
                            }
                        }
                        if (!this.f62032e || ((xp7) pc0Var.f55941e).f68499c != 17) {
                            this.f62028a = pc0Var;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pc0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m21919b() {
        sq5 sq5Var = this.f62035h;
        C0962f c0962f = (C0962f) sq5Var.f61249c;
        d2d d2dVar = (d2d) c0962f.f11847d.get();
        String str = (String) sq5Var.f61248b;
        d2dVar.getClass();
        str.getClass();
        ltc ltcVar = d2dVar.f34881a;
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43482c = new gp0(str, 6);
        C3817z1 c3817z1M6402f = AbstractC1118h.m6402f(d2d.m9998b(ltcVar.m17569c(0, i44VarM13651b.m13652a()).mo5964f(AbstractC1120j.m6404a(), new wkd())), hdd.f42230a, c0962f.m5409a());
        i8d i8dVar = new i8d(sq5Var, 1);
        C0962f c0962f2 = this.f62029b;
        AbstractC1118h.m6403g(c3817z1M6402f, i8dVar, c0962f2.m5409a()).mo52a(new gvb(28, this, c3817z1M6402f), c0962f2.m5409a());
    }
}
