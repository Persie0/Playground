package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dcr implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f10518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10519b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10520c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f10521d;

    public /* synthetic */ dcr(cvr cvrVar, hqr hqrVar, long j, int i) {
        this.f10521d = i;
        this.f10519b = cvrVar;
        this.f10520c = hqrVar;
        this.f10518a = j;
    }

    public /* synthetic */ dcr(dct dctVar, kcl kclVar, long j, int i) {
        this.f10521d = i;
        this.f10519b = dctVar;
        this.f10520c = kclVar;
        this.f10518a = j;
    }

    public /* synthetic */ dcr(dlx dlxVar, long j, Instant instant, int i) {
        this.f10521d = i;
        this.f10519b = dlxVar;
        this.f10518a = j;
        this.f10520c = instant;
    }

    public /* synthetic */ dcr(frp frpVar, long j, frt frtVar, int i) {
        this.f10521d = i;
        this.f10519b = frpVar;
        this.f10518a = j;
        this.f10520c = frtVar;
    }

    public /* synthetic */ dcr(frx frxVar, gyu gyuVar, long j, int i) {
        this.f10521d = i;
        this.f10519b = frxVar;
        this.f10520c = gyuVar;
        this.f10518a = j;
    }

    public /* synthetic */ dcr(irg irgVar, String str, long j, int i) {
        this.f10521d = i;
        this.f10519b = irgVar;
        this.f10520c = str;
        this.f10518a = j;
    }

    public /* synthetic */ dcr(Set set, long j, Map map, int i) {
        this.f10521d = i;
        this.f10520c = set;
        this.f10518a = j;
        this.f10519b = map;
    }

    public /* synthetic */ dcr(kfk kfkVar, gyh gyhVar, long j, int i) {
        this.f10521d = i;
        this.f10520c = kfkVar;
        this.f10519b = gyhVar;
        this.f10518a = j;
    }

    public /* synthetic */ dcr(kgm kgmVar, long j, Set set, int i) {
        this.f10521d = i;
        this.f10519b = kgmVar;
        this.f10518a = j;
        this.f10520c = set;
    }

    public /* synthetic */ dcr(kiz kizVar, long j, Set set, int i) {
        this.f10521d = i;
        this.f10519b = kizVar;
        this.f10518a = j;
        this.f10520c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v44, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        dcv dcvVar = null;
        byte[] bArrMo17760J = null;
        switch (this.f10521d) {
            case 0:
                Object obj = this.f10519b;
                Object obj2 = this.f10520c;
                long j = this.f10518a;
                dct dctVar = (dct) obj;
                dctVar.f10531e.m6228b();
                dcw dcwVarMo4083w = dctVar.f10528b.mo4083w();
                kcl kclVar = (kcl) obj2;
                int i = kclVar.f35597u;
                ddb ddbVar = (ddb) dcwVarMo4083w;
                ddbVar.f10545a.m1825m();
                try {
                    dcv dcvVar2 = new dcv(i);
                    ((ddb) dcwVarMo4083w).f10545a.m1824l();
                    ((ddb) dcwVarMo4083w).f10545a.m1825m();
                    try {
                        ((ddb) dcwVarMo4083w).f10546b.m1808c(dcvVar2);
                        ((ddb) dcwVarMo4083w).f10545a.m1829q();
                        ((ddb) dcwVarMo4083w).f10545a.m1827o();
                        apy apyVarM1841a = apy.m1841a("SELECT * FROM EnumerationErrorCounts WHERE errorCode = ?", 1);
                        apyVarM1841a.mo1845e(1, i);
                        ((ddb) dcwVarMo4083w).f10545a.m1824l();
                        Cursor cursorM409e = aey.m409e(((ddb) dcwVarMo4083w).f10545a, apyVarM1841a, false);
                        try {
                            int iM379o = aeq.m379o(cursorM409e, "errorCode");
                            int iM379o2 = aeq.m379o(cursorM409e, "failuresBeforeReboot");
                            int iM379o3 = aeq.m379o(cursorM409e, "failuresAfterReboot");
                            int iM379o4 = aeq.m379o(cursorM409e, "rebootCount");
                            int iM379o5 = aeq.m379o(cursorM409e, "lastFailureTimestamp");
                            if (cursorM409e.moveToFirst()) {
                                dcv dcvVar3 = new dcv(cursorM409e.getInt(iM379o));
                                dcvVar3.f10540b = cursorM409e.getInt(iM379o2);
                                dcvVar3.f10541c = cursorM409e.getInt(iM379o3);
                                dcvVar3.f10542d = cursorM409e.getInt(iM379o4);
                                dcvVar3.f10543e = cursorM409e.getLong(iM379o5);
                                dcvVar = dcvVar3;
                            }
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            ((ddb) dcwVarMo4083w).f10545a.m1829q();
                            ddbVar.f10545a.m1827o();
                            if (dct.m5927a(j, dcvVar.f10543e) >= ((Integer) dctVar.f10530d.mo6051a()).intValue()) {
                                dctVar.f10528b.mo4083w().mo5937a();
                                dcvVar = new dcv(kclVar.f35597u);
                            }
                            if (dcvVar.f10542d == 0) {
                                dcvVar.f10540b++;
                            } else {
                                dcvVar.f10541c++;
                            }
                            dcvVar.f10543e = j;
                            dcw dcwVarMo4083w2 = dctVar.f10528b.mo4083w();
                            ddb ddbVar2 = (ddb) dcwVarMo4083w2;
                            ddbVar2.f10545a.m1824l();
                            ddbVar2.f10545a.m1825m();
                            try {
                                ((ddb) dcwVarMo4083w2).f10547c.m1806a(dcvVar);
                                ((ddb) dcwVarMo4083w2).f10545a.m1829q();
                                ddbVar2.f10545a.m1827o();
                                int i2 = dcvVar.f10539a;
                                int i3 = dcvVar.f10540b;
                                int i4 = dcvVar.f10541c;
                                long j2 = dcvVar.f10543e;
                                dctVar.f10529c.mo8184d(i2, i3, i4, dcvVar.f10542d);
                                dctVar.m5930d("Suspected camera device error", true);
                                return;
                            } catch (Throwable th) {
                                ddbVar2.f10545a.m1827o();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            cursorM409e.close();
                            apyVarM1841a.m1850j();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        ((ddb) dcwVarMo4083w).f10545a.m1827o();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    ddbVar.f10545a.m1827o();
                    throw th4;
                }
            case 1:
                Object obj3 = this.f10519b;
                hqr hqrVar = (hqr) this.f10520c;
                ((cvr) obj3).m5621e(gyw.TIMELAPSE, hqrVar.f29182d.mo5500d(), hqrVar.f29182d.mo5499c(), this.f10518a, hqrVar.f29190l, "", hqrVar.f29191m, hqrVar.f29192n);
                return;
            case 2:
                ?? r0 = this.f10520c;
                long j3 = this.f10518a;
                ?? r4 = this.f10519b;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((dgg) it.next()).mo3954g(j3, r4);
                }
                return;
            case 3:
                ?? r1 = this.f10520c;
                long j4 = this.f10518a;
                ?? r5 = this.f10519b;
                Iterator it2 = r1.iterator();
                while (it2.hasNext()) {
                    ((dgn) it2.next()).mo6081bq(j4, r5);
                }
                return;
            case 4:
                Object obj4 = this.f10519b;
                long j5 = this.f10518a;
                Object obj5 = this.f10520c;
                try {
                    dmh dmhVarMo6383b = ((dlx) obj4).f11999g.mo6383b(j5);
                    if (dmhVarMo6383b == null) {
                        ((dlx) obj4).f11996d.mo13947i(kfv.m14168E("Attempted to mark shot %s as failed, but couldn't find it", Long.valueOf(j5)));
                        return;
                    }
                    if (dmhVarMo6383b.f12030l) {
                        return;
                    }
                    dmhVarMo6383b.f12030l = true;
                    ((dlx) obj4).f11999g.mo6384c(dmhVarMo6383b);
                    ((dlx) obj4).f12000h.mo6398b(dlx.m6377j(j5, (Instant) obj5, "marked failed"));
                    ((dlx) obj4).f11996d.mo13942d(kfv.m14168E("Failed shot %s detected. Log contents:\n%s", Long.valueOf(j5), dlx.m6378k(((dlx) obj4).f12000h.mo6397a(j5))));
                    return;
                } catch (SQLiteException e) {
                    ((dlx) obj4).f11996d.mo13943e(kfv.m14168E("SQLite error in markShotFailedImpl for id=%d time=%s", Long.valueOf(j5), obj5), e);
                    return;
                }
            case 5:
                Object obj6 = this.f10519b;
                long j6 = this.f10518a;
                Object obj7 = this.f10520c;
                try {
                    dmh dmhVarMo6383b2 = ((dlx) obj6).f11999g.mo6383b(j6);
                    if (dmhVarMo6383b2 != null) {
                        long epochMilli = ((Instant) obj7).toEpochMilli();
                        dmhVarMo6383b2.f12023e = epochMilli;
                        dmhVarMo6383b2.f12025g = epochMilli;
                        ((dlx) obj6).f11999g.mo6384c(dmhVarMo6383b2);
                        return;
                    }
                    return;
                } catch (SQLiteException e2) {
                    ((dlx) obj6).f11996d.mo13943e(kfv.m14168E("SQLite error in canceledImpl for id=%d time=%s", Long.valueOf(j6), obj7), e2);
                    return;
                }
            case 6:
                Object obj8 = this.f10519b;
                long j7 = this.f10518a;
                Object obj9 = this.f10520c;
                try {
                    int iMo6382a = ((dlx) obj8).f11999g.mo6382a(j7, ((Instant) obj9).toEpochMilli());
                    if (iMo6382a != 1) {
                        ((dlx) obj8).f11996d.mo13942d(kfv.m14168E("makingProgress updated %d rows for id=%d with time=%s (expected 1)", Integer.valueOf(iMo6382a), Long.valueOf(j7), obj9));
                        return;
                    }
                    return;
                } catch (SQLiteException e3) {
                    ((dlx) obj8).f11996d.mo13943e(kfv.m14168E("SQLite error in makingProgressImpl for id=%d time=%s", Long.valueOf(j7), obj9), e3);
                    return;
                }
            case 7:
                Object obj10 = this.f10519b;
                long j8 = this.f10518a;
                Object obj11 = this.f10520c;
                try {
                    dmh dmhVarMo6383b3 = ((dlx) obj10).f11999g.mo6383b(j8);
                    if (dmhVarMo6383b3 == null) {
                        ((dlx) obj10).f11996d.mo13947i(kfv.m14168E("Attempted to mark shot %s as stuck, but couldn't find it", Long.valueOf(j8)));
                        return;
                    }
                    if (dmhVarMo6383b3.f12029k) {
                        return;
                    }
                    dmhVarMo6383b3.f12029k = true;
                    ((dlx) obj10).f11999g.mo6384c(dmhVarMo6383b3);
                    ((dlx) obj10).f12000h.mo6398b(dlx.m6377j(j8, (Instant) obj11, "marked stuck"));
                    ((dlx) obj10).f11996d.mo13942d(kfv.m14168E("Stuck shot %s detected. Log contents:\n%s", Long.valueOf(j8), dlx.m6378k(((dlx) obj10).f12000h.mo6397a(j8))));
                    return;
                } catch (SQLiteException e4) {
                    ((dlx) obj10).f11996d.mo13943e(kfv.m14168E("SQLite error in markShotStuckImpl for id=%d time=%s", Long.valueOf(j8), obj11), e4);
                    return;
                }
            case 8:
                Object obj12 = this.f10519b;
                long j9 = this.f10518a;
                Object obj13 = this.f10520c;
                try {
                    dmh dmhVarMo6383b4 = ((dlx) obj12).f11999g.mo6383b(j9);
                    if (dmhVarMo6383b4 != null) {
                        long epochMilli2 = ((Instant) obj13).toEpochMilli();
                        dmhVarMo6383b4.f12022d = epochMilli2;
                        dmhVarMo6383b4.f12025g = epochMilli2;
                        ((dlx) obj12).f11999g.mo6384c(dmhVarMo6383b4);
                        return;
                    }
                    return;
                } catch (SQLiteException e5) {
                    ((dlx) obj12).f11996d.mo13943e(kfv.m14168E("SQLite error in persistedImpl for id=%d time=%s", Long.valueOf(j9), obj13), e5);
                    return;
                }
            case 9:
                Object obj14 = this.f10519b;
                long j10 = this.f10518a;
                Object obj15 = this.f10520c;
                try {
                    dmh dmhVarMo6383b5 = ((dlx) obj14).f11999g.mo6383b(j10);
                    if (dmhVarMo6383b5 != null) {
                        long epochMilli3 = ((Instant) obj15).toEpochMilli();
                        dmhVarMo6383b5.f12024f = epochMilli3;
                        dmhVarMo6383b5.f12025g = epochMilli3;
                        ((dlx) obj14).f11999g.mo6384c(dmhVarMo6383b5);
                        return;
                    }
                    return;
                } catch (SQLiteException e6) {
                    ((dlx) obj14).f11996d.mo13943e(kfv.m14168E("SQLite error in deletedImpl for id=%d time=%s", Long.valueOf(j10), obj15), e6);
                    return;
                }
            case 10:
                ((frx) this.f10519b).m8739i((gyu) this.f10520c, this.f10518a);
                return;
            case 11:
                Object obj16 = this.f10519b;
                long j11 = this.f10518a;
                Object obj17 = this.f10520c;
                frp frpVar = (frp) obj16;
                frpVar.f23343b.f23378b.mo13940b("Microvideo ended at <" + j11 + ">");
                synchronized (frpVar.f23343b) {
                    ((frt) obj17).f23351c = mzj.m17175e((Long) ((frt) obj17).f23351c.m17180i(), Long.valueOf(TimeUnit.NANOSECONDS.convert(j11, TimeUnit.MICROSECONDS)));
                    ((frp) obj16).f23343b.m8741k();
                    break;
                }
                return;
            case 12:
                ?? r2 = this.f10520c;
                ?? r3 = this.f10519b;
                long j12 = this.f10518a;
                try {
                    kfo kfoVarMo14117d = r2.mo14117d();
                    try {
                        int i5 = r3.mo9902h().f26874a;
                        kfoVarMo14117d.mo14161j(mxk.m17137I(kgq.m14215e(ivt.f32353g, 2), kgq.m14215e(ivy.f32453a, Long.valueOf(j12))), new gng(r3));
                        kfoVarMo14117d.close();
                        return;
                    } catch (Throwable th5) {
                        try {
                            kfoVarMo14117d.close();
                            throw th5;
                        } catch (Throwable th6) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                throw th5;
                            } catch (Exception e7) {
                                throw th5;
                            }
                        }
                    }
                } catch (InterruptedException | kec e8) {
                    ((nbe) ((nbe) ((nbe) gnh.f25718a.m17251b()).mo17283h(e8)).mo17276G(3015)).mo17292q("3A_DEBUG request for frame=%d failed.", j12);
                    return;
                }
            case 13:
                Object obj18 = this.f10519b;
                Object obj19 = this.f10520c;
                long j13 = this.f10518a;
                iqu iquVar = ((irg) obj18).f31886j;
                if (j13 >= 0) {
                    nxl nxlVarM18137O = iql.f31798b.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ((iql) nxlVarM18137O.f44974b).f31800a = j13;
                    bArrMo17760J = ((iql) nxlVarM18137O.mo18103l()).mo17760J();
                }
                iquVar.m11615d((String) obj19, bArrMo17760J);
                return;
            case 14:
                ((kgm) this.f10519b).f35927a.mo9228bm(this.f10518a, this.f10520c);
                return;
            default:
                Object obj20 = this.f10519b;
                long j14 = this.f10518a;
                ?? r6 = this.f10520c;
                Iterator it3 = ((kiz) obj20).f36229d.iterator();
                while (it3.hasNext()) {
                    ((kfv) it3.next()).mo9228bm(j14, r6);
                }
                return;
        }
    }
}
