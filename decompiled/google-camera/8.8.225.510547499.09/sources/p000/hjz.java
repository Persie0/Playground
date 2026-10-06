package p000;

import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjz implements hjy {

    /* JADX INFO: renamed from: A */
    private static final nbh f28072A = nbh.m17259h("com/google/android/apps/camera/stats/CaptureSessionStatsCollectorImpl");

    /* JADX INFO: renamed from: C */
    private Long f28074C;

    /* JADX INFO: renamed from: b */
    protected final fcp f28076b;

    /* JADX INFO: renamed from: g */
    public ExifInterface f28081g;

    /* JADX INFO: renamed from: h */
    protected List f28082h;

    /* JADX INFO: renamed from: i */
    public fct f28083i;

    /* JADX INFO: renamed from: k */
    public Long f28085k;

    /* JADX INFO: renamed from: l */
    public nkm f28086l;

    /* JADX INFO: renamed from: m */
    public niw f28087m;

    /* JADX INFO: renamed from: n */
    public nhd f28088n;

    /* JADX INFO: renamed from: o */
    public nhg f28089o;

    /* JADX INFO: renamed from: p */
    public niz f28090p;

    /* JADX INFO: renamed from: q */
    public niv f28091q;

    /* JADX INFO: renamed from: r */
    public nil f28092r;

    /* JADX INFO: renamed from: s */
    public nmo f28093s;

    /* JADX INFO: renamed from: u */
    public nkr f28095u;

    /* JADX INFO: renamed from: w */
    boolean f28097w;

    /* JADX INFO: renamed from: x */
    public nku f28098x;

    /* JADX INFO: renamed from: y */
    public fcw f28099y;

    /* JADX INFO: renamed from: z */
    public nxl f28100z;

    /* JADX INFO: renamed from: a */
    public long f28075a = 0;

    /* JADX INFO: renamed from: B */
    private final nqf f28073B = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public boolean f28077c = false;

    /* JADX INFO: renamed from: d */
    protected boolean f28078d = false;

    /* JADX INFO: renamed from: e */
    public boolean f28079e = false;

    /* JADX INFO: renamed from: f */
    protected boolean f28080f = false;

    /* JADX INFO: renamed from: j */
    public hkb f28084j = null;

    /* JADX INFO: renamed from: t */
    public boolean f28094t = false;

    /* JADX INFO: renamed from: v */
    public final nqf f28096v = nqf.m17621g();

    public hjz(fcp fcpVar) {
        this.f28076b = fcpVar;
    }

    /* JADX INFO: renamed from: j */
    private final nhe m10406j(long j) {
        if (!this.f28094t) {
            return null;
        }
        try {
            Long l = (Long) this.f28096v.get(2500L, TimeUnit.MILLISECONDS);
            if (l == null) {
                return null;
            }
            long jLongValue = l.longValue() - j;
            nxl nxlVarM18137O = nhe.f42295c.m18137O();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nhe nheVar = (nhe) nxlVarM18137O.f44974b;
            nheVar.f42297a |= 1;
            nheVar.f42298b = jLongValue;
            return (nhe) nxlVarM18137O.mo18103l();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) ((nbe) f28072A.m17251b()).mo17283h(e)).mo17276G((char) 3692)).mo17290o("Error retrieving kepler meta.");
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    private final boolean m10407k() {
        fcw fcwVar = this.f28099y;
        return fcwVar == null || fcwVar.f21322j.booleanValue() || this.f28077c;
    }

    /* JADX INFO: renamed from: l */
    private final int m10408l() {
        fcw fcwVar = this.f28099y;
        if (fcwVar == null) {
            ((nbe) ((nbe) f28072A.m17251b()).mo17276G((char) 3694)).mo17290o("inferPhotoMode called while atTimeRequestData not present yet");
            return 1;
        }
        if (this.f28100z != null) {
            return 22;
        }
        int i = fcwVar.f21331s;
        if (i == 29) {
            return 29;
        }
        if (i == 36) {
            return 36;
        }
        nkm nkmVar = this.f28086l;
        if (nkmVar != null) {
            int i2 = nkmVar.f43242l;
            int iM14982aA = kxk.m14982aA(i2);
            if (iM14982aA != 0 && iM14982aA == 4) {
                return 32;
            }
            int iM14982aA2 = kxk.m14982aA(i2);
            if (iM14982aA2 != 0 && iM14982aA2 == 5) {
                return 32;
            }
        }
        if (this.f28080f) {
            return 8;
        }
        return i;
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: a */
    public final Long mo10399a() {
        hkb hkbVar = this.f28084j;
        if (hkbVar == null) {
            return null;
        }
        return Long.valueOf(hkbVar.f28103a);
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: b */
    public final void mo10400b() {
        this.f28097w = true;
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: c */
    public final void mo10401c(kpl kplVar, boolean z) {
        this.f28080f = z;
        if (ivt.f32359m == null || kplVar.mo9517d(ivt.f32359m) == null) {
            this.f28082h = null;
        } else {
            this.f28082h = kpm.m14672h(kplVar);
        }
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: d */
    public final void mo10402d(long j) {
        hkb hkbVar = this.f28084j;
        if (hkbVar != null) {
            hkbVar.f28105c = SystemClock.elapsedRealtimeNanos();
        }
        this.f28074C = Long.valueOf(j);
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: e */
    public final void mo10403e(long j) throws Throwable {
        m10410i(1, j);
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: f */
    public final void mo10404f() {
        this.f28078d = true;
    }

    @Override // p000.hjy
    /* JADX INFO: renamed from: g */
    public final void mo10405g(C1058va c1058va) {
        this.f28073B.mo14894e(c1058va);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10409h() {
        return (this.f28099y == null || this.f28075a == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:107:0x0233  */
    /* JADX WARN: Code duplicated, block: B:109:0x0243  */
    /* JADX WARN: Code duplicated, block: B:113:0x0261  */
    /* JADX WARN: Code duplicated, block: B:114:0x0264  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [fcy] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [fcy] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fcp] */
    /* JADX WARN: Type inference failed for: r9v2, types: [fcp] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m10410i(int i, long j) throws Throwable {
        nki nkiVar;
        Object obj;
        ?? r18;
        nxl nxlVar;
        nlg nlgVar;
        int iM10408l;
        fcw fcwVar;
        ExifInterface exifInterface;
        boolean zM10407k;
        Float fValueOf;
        List list;
        nxl nxlVar2;
        nlg nlgVar2;
        Integer num;
        nhd nhdVar;
        niv nivVar;
        Long l;
        Long lMo10399a;
        boolean z;
        boolean z2;
        nmo nmoVar;
        nhg nhgVar;
        nhe nheVarM10406j;
        niz nizVar;
        nkr nkrVar;
        nku nkuVar;
        boolean z3;
        boolean z4;
        Long l2;
        nkm nkmVar;
        niw niwVar;
        nil nilVar;
        ?? r19;
        ?? r9;
        Object obj2;
        Object obj3;
        nki nkiVar2;
        long jLongValue = j - this.f28075a;
        fct fctVar = this.f28083i;
        if (fctVar != null) {
            nxl nxlVarM18137O = nki.f43208d.m18137O();
            synchronized (fctVar.f21282a) {
                if (fctVar.f21283b.isEmpty() || fctVar.f21284c.get(0) == null) {
                    int i2 = fcs.UNKNOWN.f21281d;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nki nkiVar3 = (nki) nxlVarM18137O.f44974b;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    nkiVar3.f43211b = i3;
                    nkiVar3.f43210a |= 1;
                } else {
                    int i4 = ((fcs) fctVar.f21284c.get(0)).f21281d;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nki nkiVar4 = (nki) nxlVarM18137O.f44974b;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    nkiVar4.f43211b = i5;
                    nkiVar4.f43210a |= 1;
                }
                List list2 = fctVar.f21283b;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nki nkiVar5 = (nki) nxlVarM18137O.f44974b;
                nxy nxyVar = nkiVar5.f43212c;
                if (!nxyVar.mo17770c()) {
                    nkiVar5.f43212c = nxq.m18127U(nxyVar);
                }
                nwb.m17749e(list2, nkiVar5.f43212c);
                nkiVar2 = (nki) nxlVarM18137O.mo18103l();
            }
            nkiVar = nkiVar2;
        } else {
            nkiVar = null;
        }
        nxl nxlVar3 = this.f28100z;
        if (nxlVar3 != null) {
            int i6 = (int) jLongValue;
            if (!nxlVar3.f44974b.m18142ac()) {
                nxlVar3.mo18106p();
            }
            nlg nlgVar3 = (nlg) nxlVar3.f44974b;
            nlg nlgVar4 = nlg.f43509f;
            nlgVar3.f43511a |= 1;
            nlgVar3.f43512b = i6;
        }
        try {
            if (this.f28080f) {
                C1058va c1058va = (C1058va) this.f28073B.get(500L, TimeUnit.MILLISECONDS);
                Object obj4 = c1058va.f47803b;
                try {
                    obj = c1058va.f47802a;
                    try {
                        obj2 = c1058va.f47804c;
                        obj3 = obj4;
                    } catch (InterruptedException e) {
                        e = e;
                        r18 = obj4;
                        try {
                            ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                            if (!m10409h()) {
                            }
                            fcp fcpVar = this.f28076b;
                            iM10408l = m10408l();
                            fcwVar = this.f28099y;
                            exifInterface = this.f28081g;
                            zM10407k = m10407k();
                            if (obj != null) {
                                jLongValue = ((Long) obj).longValue();
                            }
                            fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                            list = this.f28082h;
                            Long l3 = this.f28085k;
                            nkm nkmVar2 = this.f28086l;
                            niw niwVar2 = this.f28087m;
                            nil nilVar2 = this.f28092r;
                            nxlVar2 = this.f28100z;
                            if (nxlVar2 == null) {
                                nlgVar2 = null;
                            } else {
                                nlgVar2 = (nlg) nxlVar2.mo18103l();
                            }
                            num = null;
                            nhdVar = this.f28088n;
                            nivVar = this.f28091q;
                            l = this.f28074C;
                            lMo10399a = mo10399a();
                            z = this.f28078d;
                            z2 = this.f28079e;
                            nmoVar = this.f28093s;
                            nhgVar = this.f28089o;
                            nheVarM10406j = m10406j(j);
                            nizVar = this.f28090p;
                            nkrVar = this.f28095u;
                            nkuVar = this.f28098x;
                            z3 = this.f28099y.f21327o;
                            z4 = this.f28097w;
                            l2 = l3;
                            nkmVar = nkmVar2;
                            niwVar = niwVar2;
                            nilVar = nilVar2;
                            r9 = fcpVar;
                            r19 = r18;
                        } catch (Throwable th) {
                            th = th;
                            if (m10409h()) {
                                ?? r10 = this.f28076b;
                                int iM10408l2 = m10408l();
                                fcw fcwVar2 = this.f28099y;
                                ExifInterface exifInterface2 = this.f28081g;
                                boolean zM10407k2 = m10407k();
                                if (obj != null) {
                                    jLongValue = ((Long) obj).longValue();
                                }
                                Float fValueOf2 = Float.valueOf(jzn.m13806I(jLongValue));
                                List list3 = this.f28082h;
                                Long l4 = this.f28085k;
                                nkm nkmVar3 = this.f28086l;
                                niw niwVar3 = this.f28087m;
                                nil nilVar3 = this.f28092r;
                                nxlVar = this.f28100z;
                                if (nxlVar == null) {
                                    nlgVar = null;
                                } else {
                                    nlgVar = (nlg) nxlVar.mo18103l();
                                }
                                r10.mo8177av(iM10408l2, fcwVar2, exifInterface2, zM10407k2, fValueOf2, list3, nkiVar, i, r18, l4, null, nkmVar3, niwVar3, nilVar3, nlgVar, this.f28088n, this.f28091q, this.f28074C, mo10399a(), this.f28078d, this.f28079e, this.f28093s, this.f28089o, m10406j(j), this.f28090p, this.f28095u, this.f28098x, this.f28099y.f21327o, this.f28097w);
                            }
                            throw th;
                        }
                    } catch (ExecutionException e2) {
                        e = e2;
                        r18 = obj4;
                        ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                        if (!m10409h()) {
                        }
                        fcp fcpVar2 = this.f28076b;
                        iM10408l = m10408l();
                        fcwVar = this.f28099y;
                        exifInterface = this.f28081g;
                        zM10407k = m10407k();
                        if (obj != null) {
                            jLongValue = ((Long) obj).longValue();
                        }
                        fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                        list = this.f28082h;
                        Long l5 = this.f28085k;
                        nkm nkmVar4 = this.f28086l;
                        niw niwVar4 = this.f28087m;
                        nil nilVar4 = this.f28092r;
                        nxlVar2 = this.f28100z;
                        if (nxlVar2 == null) {
                            nlgVar2 = null;
                        } else {
                            nlgVar2 = (nlg) nxlVar2.mo18103l();
                        }
                        num = null;
                        nhdVar = this.f28088n;
                        nivVar = this.f28091q;
                        l = this.f28074C;
                        lMo10399a = mo10399a();
                        z = this.f28078d;
                        z2 = this.f28079e;
                        nmoVar = this.f28093s;
                        nhgVar = this.f28089o;
                        nheVarM10406j = m10406j(j);
                        nizVar = this.f28090p;
                        nkrVar = this.f28095u;
                        nkuVar = this.f28098x;
                        z3 = this.f28099y.f21327o;
                        z4 = this.f28097w;
                        l2 = l5;
                        nkmVar = nkmVar4;
                        niwVar = niwVar4;
                        nilVar = nilVar4;
                        r9 = fcpVar2;
                        r19 = r18;
                    } catch (TimeoutException e3) {
                        e = e3;
                        r18 = obj4;
                        ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                        if (!m10409h()) {
                        }
                        fcp fcpVar3 = this.f28076b;
                        iM10408l = m10408l();
                        fcwVar = this.f28099y;
                        exifInterface = this.f28081g;
                        zM10407k = m10407k();
                        if (obj != null) {
                            jLongValue = ((Long) obj).longValue();
                        }
                        fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                        list = this.f28082h;
                        Long l6 = this.f28085k;
                        nkm nkmVar5 = this.f28086l;
                        niw niwVar5 = this.f28087m;
                        nil nilVar5 = this.f28092r;
                        nxlVar2 = this.f28100z;
                        if (nxlVar2 == null) {
                            nlgVar2 = null;
                        } else {
                            nlgVar2 = (nlg) nxlVar2.mo18103l();
                        }
                        num = null;
                        nhdVar = this.f28088n;
                        nivVar = this.f28091q;
                        l = this.f28074C;
                        lMo10399a = mo10399a();
                        z = this.f28078d;
                        z2 = this.f28079e;
                        nmoVar = this.f28093s;
                        nhgVar = this.f28089o;
                        nheVarM10406j = m10406j(j);
                        nizVar = this.f28090p;
                        nkrVar = this.f28095u;
                        nkuVar = this.f28098x;
                        z3 = this.f28099y.f21327o;
                        z4 = this.f28097w;
                        l2 = l6;
                        nkmVar = nkmVar5;
                        niwVar = niwVar5;
                        nilVar = nilVar5;
                        r9 = fcpVar3;
                        r19 = r18;
                    } catch (Throwable th2) {
                        th = th2;
                        r18 = obj4;
                        if (m10409h()) {
                            ?? r11 = this.f28076b;
                            int iM10408l3 = m10408l();
                            fcw fcwVar3 = this.f28099y;
                            ExifInterface exifInterface3 = this.f28081g;
                            boolean zM10407k3 = m10407k();
                            if (obj != null) {
                                jLongValue = ((Long) obj).longValue();
                            }
                            Float fValueOf3 = Float.valueOf(jzn.m13806I(jLongValue));
                            List list4 = this.f28082h;
                            Long l7 = this.f28085k;
                            nkm nkmVar6 = this.f28086l;
                            niw niwVar6 = this.f28087m;
                            nil nilVar6 = this.f28092r;
                            nxlVar = this.f28100z;
                            if (nxlVar == null) {
                                nlgVar = null;
                            } else {
                                nlgVar = (nlg) nxlVar.mo18103l();
                            }
                            r11.mo8177av(iM10408l3, fcwVar3, exifInterface3, zM10407k3, fValueOf3, list4, nkiVar, i, r18, l7, null, nkmVar6, niwVar6, nilVar6, nlgVar, this.f28088n, this.f28091q, this.f28074C, mo10399a(), this.f28078d, this.f28079e, this.f28093s, this.f28089o, m10406j(j), this.f28090p, this.f28095u, this.f28098x, this.f28099y.f21327o, this.f28097w);
                        }
                        throw th;
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    obj = null;
                    r18 = obj4;
                    ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                    if (!m10409h()) {
                        fcp fcpVar4 = this.f28076b;
                        iM10408l = m10408l();
                        fcwVar = this.f28099y;
                        exifInterface = this.f28081g;
                        zM10407k = m10407k();
                        if (obj != null) {
                            jLongValue = ((Long) obj).longValue();
                        }
                        fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                        list = this.f28082h;
                        Long l8 = this.f28085k;
                        nkm nkmVar7 = this.f28086l;
                        niw niwVar7 = this.f28087m;
                        nil nilVar7 = this.f28092r;
                        nxlVar2 = this.f28100z;
                        if (nxlVar2 == null) {
                            nlgVar2 = null;
                        } else {
                            nlgVar2 = (nlg) nxlVar2.mo18103l();
                        }
                        num = null;
                        nhdVar = this.f28088n;
                        nivVar = this.f28091q;
                        l = this.f28074C;
                        lMo10399a = mo10399a();
                        z = this.f28078d;
                        z2 = this.f28079e;
                        nmoVar = this.f28093s;
                        nhgVar = this.f28089o;
                        nheVarM10406j = m10406j(j);
                        nizVar = this.f28090p;
                        nkrVar = this.f28095u;
                        nkuVar = this.f28098x;
                        z3 = this.f28099y.f21327o;
                        z4 = this.f28097w;
                        l2 = l8;
                        nkmVar = nkmVar7;
                        niwVar = niwVar7;
                        nilVar = nilVar7;
                        r9 = fcpVar4;
                        r19 = r18;
                        r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
                    }
                } catch (ExecutionException e5) {
                    e = e5;
                    obj = null;
                    r18 = obj4;
                    ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                    if (!m10409h()) {
                        fcp fcpVar5 = this.f28076b;
                        iM10408l = m10408l();
                        fcwVar = this.f28099y;
                        exifInterface = this.f28081g;
                        zM10407k = m10407k();
                        if (obj != null) {
                            jLongValue = ((Long) obj).longValue();
                        }
                        fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                        list = this.f28082h;
                        Long l9 = this.f28085k;
                        nkm nkmVar8 = this.f28086l;
                        niw niwVar8 = this.f28087m;
                        nil nilVar8 = this.f28092r;
                        nxlVar2 = this.f28100z;
                        if (nxlVar2 == null) {
                            nlgVar2 = null;
                        } else {
                            nlgVar2 = (nlg) nxlVar2.mo18103l();
                        }
                        num = null;
                        nhdVar = this.f28088n;
                        nivVar = this.f28091q;
                        l = this.f28074C;
                        lMo10399a = mo10399a();
                        z = this.f28078d;
                        z2 = this.f28079e;
                        nmoVar = this.f28093s;
                        nhgVar = this.f28089o;
                        nheVarM10406j = m10406j(j);
                        nizVar = this.f28090p;
                        nkrVar = this.f28095u;
                        nkuVar = this.f28098x;
                        z3 = this.f28099y.f21327o;
                        z4 = this.f28097w;
                        l2 = l9;
                        nkmVar = nkmVar8;
                        niwVar = niwVar8;
                        nilVar = nilVar8;
                        r9 = fcpVar5;
                        r19 = r18;
                        r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
                    }
                } catch (TimeoutException e6) {
                    e = e6;
                    obj = null;
                    r18 = obj4;
                    ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
                    if (!m10409h()) {
                        fcp fcpVar6 = this.f28076b;
                        iM10408l = m10408l();
                        fcwVar = this.f28099y;
                        exifInterface = this.f28081g;
                        zM10407k = m10407k();
                        if (obj != null) {
                            jLongValue = ((Long) obj).longValue();
                        }
                        fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                        list = this.f28082h;
                        Long l10 = this.f28085k;
                        nkm nkmVar9 = this.f28086l;
                        niw niwVar9 = this.f28087m;
                        nil nilVar9 = this.f28092r;
                        nxlVar2 = this.f28100z;
                        if (nxlVar2 == null) {
                            nlgVar2 = null;
                        } else {
                            nlgVar2 = (nlg) nxlVar2.mo18103l();
                        }
                        num = null;
                        nhdVar = this.f28088n;
                        nivVar = this.f28091q;
                        l = this.f28074C;
                        lMo10399a = mo10399a();
                        z = this.f28078d;
                        z2 = this.f28079e;
                        nmoVar = this.f28093s;
                        nhgVar = this.f28089o;
                        nheVarM10406j = m10406j(j);
                        nizVar = this.f28090p;
                        nkrVar = this.f28095u;
                        nkuVar = this.f28098x;
                        z3 = this.f28099y.f21327o;
                        z4 = this.f28097w;
                        l2 = l10;
                        nkmVar = nkmVar9;
                        niwVar = niwVar9;
                        nilVar = nilVar9;
                        r9 = fcpVar6;
                        r19 = r18;
                        r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                }
            } else {
                obj2 = null;
                obj = null;
                obj3 = null;
            }
            if (m10409h()) {
                fcp fcpVar7 = this.f28076b;
                iM10408l = m10408l();
                fcwVar = this.f28099y;
                exifInterface = this.f28081g;
                zM10407k = m10407k();
                if (obj != null) {
                    jLongValue = ((Long) obj).longValue();
                }
                fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                list = this.f28082h;
                Long l11 = this.f28085k;
                nkm nkmVar10 = this.f28086l;
                niw niwVar10 = this.f28087m;
                nil nilVar10 = this.f28092r;
                nxl nxlVar4 = this.f28100z;
                nlgVar2 = nxlVar4 == null ? null : (nlg) nxlVar4.mo18103l();
                nhdVar = this.f28088n;
                nivVar = this.f28091q;
                l = this.f28074C;
                lMo10399a = mo10399a();
                z = this.f28078d;
                z2 = this.f28079e;
                nmoVar = this.f28093s;
                nhgVar = this.f28089o;
                nheVarM10406j = m10406j(j);
                nizVar = this.f28090p;
                nkrVar = this.f28095u;
                nkuVar = this.f28098x;
                z3 = this.f28099y.f21327o;
                z4 = this.f28097w;
                num = (Integer) obj2;
                l2 = l11;
                nkmVar = nkmVar10;
                niwVar = niwVar10;
                nilVar = nilVar10;
                r9 = fcpVar7;
                r19 = obj3;
                r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
            }
        } catch (InterruptedException e7) {
            e = e7;
            obj = null;
            r18 = 0;
            ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
            if (!m10409h()) {
                fcp fcpVar8 = this.f28076b;
                iM10408l = m10408l();
                fcwVar = this.f28099y;
                exifInterface = this.f28081g;
                zM10407k = m10407k();
                if (obj != null) {
                    jLongValue = ((Long) obj).longValue();
                }
                fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                list = this.f28082h;
                Long l12 = this.f28085k;
                nkm nkmVar11 = this.f28086l;
                niw niwVar11 = this.f28087m;
                nil nilVar11 = this.f28092r;
                nxlVar2 = this.f28100z;
                if (nxlVar2 == null) {
                    nlgVar2 = null;
                } else {
                    nlgVar2 = (nlg) nxlVar2.mo18103l();
                }
                num = null;
                nhdVar = this.f28088n;
                nivVar = this.f28091q;
                l = this.f28074C;
                lMo10399a = mo10399a();
                z = this.f28078d;
                z2 = this.f28079e;
                nmoVar = this.f28093s;
                nhgVar = this.f28089o;
                nheVarM10406j = m10406j(j);
                nizVar = this.f28090p;
                nkrVar = this.f28095u;
                nkuVar = this.f28098x;
                z3 = this.f28099y.f21327o;
                z4 = this.f28097w;
                l2 = l12;
                nkmVar = nkmVar11;
                niwVar = niwVar11;
                nilVar = nilVar11;
                r9 = fcpVar8;
                r19 = r18;
                r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
            }
        } catch (ExecutionException e8) {
            e = e8;
            obj = null;
            r18 = 0;
            ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
            if (!m10409h()) {
                fcp fcpVar9 = this.f28076b;
                iM10408l = m10408l();
                fcwVar = this.f28099y;
                exifInterface = this.f28081g;
                zM10407k = m10407k();
                if (obj != null) {
                    jLongValue = ((Long) obj).longValue();
                }
                fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                list = this.f28082h;
                Long l13 = this.f28085k;
                nkm nkmVar12 = this.f28086l;
                niw niwVar12 = this.f28087m;
                nil nilVar12 = this.f28092r;
                nxlVar2 = this.f28100z;
                if (nxlVar2 == null) {
                    nlgVar2 = null;
                } else {
                    nlgVar2 = (nlg) nxlVar2.mo18103l();
                }
                num = null;
                nhdVar = this.f28088n;
                nivVar = this.f28091q;
                l = this.f28074C;
                lMo10399a = mo10399a();
                z = this.f28078d;
                z2 = this.f28079e;
                nmoVar = this.f28093s;
                nhgVar = this.f28089o;
                nheVarM10406j = m10406j(j);
                nizVar = this.f28090p;
                nkrVar = this.f28095u;
                nkuVar = this.f28098x;
                z3 = this.f28099y.f21327o;
                z4 = this.f28097w;
                l2 = l13;
                nkmVar = nkmVar12;
                niwVar = niwVar12;
                nilVar = nilVar12;
                r9 = fcpVar9;
                r19 = r18;
                r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
            }
        } catch (TimeoutException e9) {
            e = e9;
            obj = null;
            r18 = 0;
            ((nbe) ((nbe) f28072A.m17251b()).mo17276G(3696)).mo17293r("Error retrieving Gcam metadata. %s", e);
            if (!m10409h()) {
                fcp fcpVar10 = this.f28076b;
                iM10408l = m10408l();
                fcwVar = this.f28099y;
                exifInterface = this.f28081g;
                zM10407k = m10407k();
                if (obj != null) {
                    jLongValue = ((Long) obj).longValue();
                }
                fValueOf = Float.valueOf(jzn.m13806I(jLongValue));
                list = this.f28082h;
                Long l14 = this.f28085k;
                nkm nkmVar13 = this.f28086l;
                niw niwVar13 = this.f28087m;
                nil nilVar13 = this.f28092r;
                nxlVar2 = this.f28100z;
                if (nxlVar2 == null) {
                    nlgVar2 = null;
                } else {
                    nlgVar2 = (nlg) nxlVar2.mo18103l();
                }
                num = null;
                nhdVar = this.f28088n;
                nivVar = this.f28091q;
                l = this.f28074C;
                lMo10399a = mo10399a();
                z = this.f28078d;
                z2 = this.f28079e;
                nmoVar = this.f28093s;
                nhgVar = this.f28089o;
                nheVarM10406j = m10406j(j);
                nizVar = this.f28090p;
                nkrVar = this.f28095u;
                nkuVar = this.f28098x;
                z3 = this.f28099y.f21327o;
                z4 = this.f28097w;
                l2 = l14;
                nkmVar = nkmVar13;
                niwVar = niwVar13;
                nilVar = nilVar13;
                r9 = fcpVar10;
                r19 = r18;
                r9.mo8177av(iM10408l, fcwVar, exifInterface, zM10407k, fValueOf, list, nkiVar, i, r19, l2, num, nkmVar, niwVar, nilVar, nlgVar2, nhdVar, nivVar, l, lMo10399a, z, z2, nmoVar, nhgVar, nheVarM10406j, nizVar, nkrVar, nkuVar, z3, z4);
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            r18 = 0;
        }
    }
}
