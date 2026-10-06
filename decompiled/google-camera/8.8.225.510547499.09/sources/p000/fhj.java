package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhj implements fhy, fhv {

    /* JADX INFO: renamed from: a */
    public static final nbh f22000a = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/CookieCutterMicrovideoEncoder");

    /* JADX INFO: renamed from: b */
    public final fir f22001b;

    /* JADX INFO: renamed from: c */
    public final mrm f22002c;

    /* JADX INFO: renamed from: g */
    private final fjg f22006g;

    /* JADX INFO: renamed from: i */
    private final fhk f22008i;

    /* JADX INFO: renamed from: j */
    private final fhk f22009j;

    /* JADX INFO: renamed from: k */
    private final fhk f22010k;

    /* JADX INFO: renamed from: l */
    private final boolean f22011l;

    /* JADX INFO: renamed from: m */
    private final boolean f22012m;

    /* JADX INFO: renamed from: n */
    private boolean f22013n = false;

    /* JADX INFO: renamed from: e */
    public boolean f22004e = false;

    /* JADX INFO: renamed from: d */
    public final Object f22003d = new Object();

    /* JADX INFO: renamed from: h */
    private long f22007h = -1;

    /* JADX INFO: renamed from: f */
    public final Set f22005f = new HashSet();

    public fhj(fir firVar, fjg fjgVar, mrm mrmVar, jvb jvbVar, dhv dhvVar, kbo kboVar) {
        this.f22001b = firVar;
        this.f22006g = fjgVar;
        this.f22002c = mrmVar;
        this.f22011l = dhvVar.mo6184l(dii.f11535k);
        this.f22012m = dhvVar.mo6184l(dii.f11542r);
        dhvVar.mo6177e();
        this.f22008i = new fhm(kboVar, "Vid");
        this.f22009j = new fhm(kboVar, "Aud");
        this.f22010k = new fhm(kboVar, "Mtn");
        jvbVar.m13537d(new ezc(this, 3));
    }

    @Override // p000.fhy
    /* JADX INFO: renamed from: a */
    public final void mo8422a(long j) {
        synchronized (this.f22003d) {
            long jMin = Long.MAX_VALUE;
            for (fhi fhiVar : this.f22005f) {
                if (!fhiVar.f21991c && !fhiVar.f21994f) {
                    jMin = Math.min(jMin, ((Long) fhiVar.f21990b.m17180i()).longValue());
                }
            }
            this.f22007h = Math.min(jMin, Math.max(j, this.f22007h));
            m8426e();
            this.f22008i.mo8430d(this.f22007h);
            this.f22009j.mo8430d(this.f22007h);
            this.f22010k.mo8430d(this.f22007h);
        }
    }

    @Override // p000.fhy
    /* JADX INFO: renamed from: b */
    public final void mo8423b() {
        synchronized (this.f22003d) {
            this.f22008i.mo8429c();
            this.f22009j.mo8429c();
            this.f22010k.mo8429c();
            for (fhi fhiVar : this.f22005f) {
                mzj mzjVar = fhiVar.f21990b;
                if (mzjVar != null) {
                    String.format(Locale.US, "%s to %s", mzjVar.m17183l() ? String.format(Locale.US, "<%d>", mzjVar.m17180i()) : "n/a", mzjVar.m17184m() ? String.format(Locale.US, "<%d>", mzjVar.m17181j()) : "n/a");
                }
                boolean z = fhiVar.f21993e;
                boolean z2 = fhiVar.f21991c;
            }
        }
    }

    @Override // p000.fhy
    /* JADX INFO: renamed from: c */
    public final void mo8424c() {
        synchronized (this.f22003d) {
            lku.m15614I(!this.f22004e, "Attempting to init encoder that is shut down!");
            if (!this.f22013n) {
                this.f22001b.mo8470c(this.f22008i, this);
                fjg fjgVar = this.f22006g;
                fhk fhkVar = this.f22010k;
                fhkVar.mo8408a(kxk.m14965K(fjgVar.f22225a));
                fjgVar.f22226b = fhkVar;
                fjgVar.f22227c = fjgVar.f22228d.m19464C();
                if (this.f22002c.mo16813g()) {
                    ((fhh) this.f22002c.mo16809c()).m8420b(this.f22009j, this);
                } else {
                    this.f22009j.mo8408a(kxk.m14963I());
                }
                this.f22013n = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8425d() {
        this.f22001b.mo8472e();
        if (this.f22002c.mo16813g()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v45, types: [fhk] */
    /* JADX WARN: Type inference failed for: r4v47, types: [fhk] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object, kyt] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kyt] */
    /* JADX WARN: Type inference failed for: r5v23, types: [kyt] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kyt] */
    /* JADX WARN: Type inference failed for: r5v26, types: [fhk] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v34 */
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
    /* JADX INFO: renamed from: e */
    public final void m8426e() {
        synchronized (this.f22003d) {
            long jMax = Long.MIN_VALUE;
            for (fhi fhiVar : this.f22005f) {
                if (fhiVar.f21990b.m17184m() && ((Long) fhiVar.f21990b.m17181j()).longValue() < this.f22007h) {
                    jMax = Math.max(jMax, ((Long) fhiVar.f21990b.m17181j()).longValue());
                }
            }
            for (fhi fhiVar2 : this.f22005f) {
                if (!fhiVar2.f21991c && !fhiVar2.f21994f && (fhiVar2.f21990b.m17184m() || fhiVar2.f21993e)) {
                    boolean z = fhiVar2.f21993e ? this.f22012m : this.f22011l;
                    gyu gyuVar = fhiVar2.f21989a;
                    ?? r5 = fhiVar2.f21999k.f47804c;
                    ?? fijVar = r5;
                    if (!z) {
                        fijVar = new fij(r5);
                    }
                    fhiVar2.f21996h = this.f22008i.mo8431e(fijVar, ((Long) fhiVar2.f21990b.m17180i()).longValue());
                    fhiVar2.f21998j = this.f22010k.mo8431e(fhiVar2.f21999k.f47803b, ((Long) fhiVar2.f21990b.m17180i()).longValue());
                    ?? r4 = fhiVar2.f21999k.f47802a;
                    if (r4 != 0) {
                        fhiVar2.f21997i = this.f22009j.mo8431e(r4, ((Long) fhiVar2.f21990b.m17180i()).longValue());
                    }
                    fhiVar2.f21991c = true;
                }
            }
            for (fhi fhiVar3 : this.f22005f) {
                if (fhiVar3.f21991c && !fhiVar3.f21990b.m17184m() && !fhiVar3.f21994f && fhiVar3.f21993e) {
                    gyu gyuVar2 = fhiVar3.f21989a;
                    fhl fhlVar = fhiVar3.f21996h;
                    fhlVar.getClass();
                    fhlVar.m8432a(this.f22007h, false);
                    fhl fhlVar2 = fhiVar3.f21998j;
                    fhlVar2.getClass();
                    fhlVar2.m8432a(this.f22007h, false);
                    if (this.f22002c.mo16813g() && fhiVar3.f21993e) {
                        fhl fhlVar3 = fhiVar3.f21997i;
                        fhlVar3.getClass();
                        fhlVar3.m8432a(this.f22007h, false);
                    }
                }
            }
            for (fhi fhiVar4 : this.f22005f) {
                if (fhiVar4.f21991c && fhiVar4.f21990b.m17184m() && !fhiVar4.f21994f && !fhiVar4.f21992d) {
                    gyu gyuVar3 = fhiVar4.f21989a;
                    fhiVar4.f21990b.m17180i();
                    fhiVar4.f21990b.m17181j();
                    ((Long) fhiVar4.f21990b.m17181j()).longValue();
                    ((Long) fhiVar4.f21990b.m17180i()).longValue();
                    fhl fhlVar4 = fhiVar4.f21996h;
                    fhlVar4.getClass();
                    fhlVar4.m8432a(((Long) fhiVar4.f21990b.m17181j()).longValue(), true);
                    fhl fhlVar5 = fhiVar4.f21998j;
                    fhlVar5.getClass();
                    fhlVar5.m8432a(((Long) fhiVar4.f21990b.m17181j()).longValue(), true);
                    fhl fhlVar6 = fhiVar4.f21997i;
                    if (fhlVar6 != null) {
                        if (fhiVar4.f21993e) {
                            fhlVar6.m8432a(((Long) fhiVar4.f21990b.m17181j()).longValue(), true);
                        } else {
                            gyu gyuVar4 = fhiVar4.f21989a;
                            fhlVar6.m8432a(((Long) fhiVar4.f21990b.m17180i()).longValue(), true);
                        }
                    }
                    fhiVar4.f21992d = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (fhi fhiVar5 : this.f22005f) {
                if (fhiVar5.f21994f || (fhiVar5.f21992d && fhiVar5.f21990b.m17184m() && ((Long) fhiVar5.f21990b.m17181j()).longValue() < this.f22007h - 10000000)) {
                    arrayList.add(fhiVar5);
                    gyu gyuVar5 = fhiVar5.f21989a;
                }
            }
            this.f22005f.removeAll(arrayList);
        }
    }

    @Override // p000.fhv
    /* JADX INFO: renamed from: f */
    public final oyo mo8427f(long j) {
        synchronized (this.f22003d) {
            int i = 0;
            boolean z = false;
            for (fhi fhiVar : this.f22005f) {
                if (!fhiVar.f21994f) {
                    boolean z2 = fhiVar.f21993e ? this.f22012m : this.f22011l;
                    mzj mzjVar = fhiVar.f21990b;
                    Long lValueOf = Long.valueOf(j);
                    if (mzjVar.mo8324a(lValueOf)) {
                        gyu gyuVar = fhiVar.f21989a;
                        return oyo.m19196o(z2);
                    }
                    if (fhiVar.f21990b.m17184m()) {
                        if (mzj.m17175e((Long) fhiVar.f21990b.m17181j(), Long.valueOf(((Long) fhiVar.f21990b.m17181j()).longValue() + (true != fhiVar.f21993e ? 66666L : 666666L))).mo8324a(lValueOf)) {
                            gyu gyuVar2 = fhiVar.f21989a;
                            return oyo.m19196o(z2);
                        }
                    }
                    z |= !(((Long) fhiVar.f21990b.m17180i()).longValue() < j);
                }
            }
            if (z) {
                return new oyo(0);
            }
            if (true == this.f22011l) {
                i = 4;
            }
            return new oyo(i | 3);
        }
    }

    @Override // p000.fhy
    /* JADX INFO: renamed from: g */
    public final fle mo8428g(gyu gyuVar, C1058va c1058va, long j, boolean z) {
        long j2;
        fhi fhiVar;
        synchronized (this.f22003d) {
            lku.m15614I(this.f22013n, "Must call initialize() before start()!");
            if (j < this.f22007h) {
                ((nbe) ((nbe) f22000a.m17251b()).mo17276G(2284)).mo17271B("Starting session %s at %d which is before the last promise %d", gyuVar, Long.valueOf(j), Long.valueOf(this.f22007h));
                j2 = this.f22007h;
            } else {
                j2 = j;
            }
            fhiVar = new fhi(this, gyuVar, c1058va, mzj.m17173c(Long.valueOf(j2)), z, null, null, null);
            this.f22005f.add(fhiVar);
            m8426e();
            m8425d();
        }
        return fhiVar;
    }
}
