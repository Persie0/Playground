package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kig {

    /* JADX INFO: renamed from: a */
    public static final Object f36145a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f36146b;

    /* JADX INFO: renamed from: c */
    public boolean f36147c;

    /* JADX INFO: renamed from: d */
    public boolean f36148d;

    /* JADX INFO: renamed from: f */
    private final khg f36150f;

    /* JADX INFO: renamed from: g */
    private final kjm f36151g;

    /* JADX INFO: renamed from: h */
    private final kie f36152h;

    /* JADX INFO: renamed from: i */
    private final khx f36153i;

    /* JADX INFO: renamed from: j */
    private final jvb f36154j;

    /* JADX INFO: renamed from: k */
    private final kbz f36155k;

    /* JADX INFO: renamed from: l */
    private final kbo f36156l;

    /* JADX INFO: renamed from: m */
    private final mrm f36157m;

    /* JADX INFO: renamed from: p */
    private final kon f36160p;

    /* JADX INFO: renamed from: e */
    public int f36149e = 1;

    /* JADX INFO: renamed from: o */
    private final kiy f36159o = new kif(this);

    /* JADX INFO: renamed from: n */
    private Set f36158n = new HashSet();

    public kig(kgt kgtVar, kkk kkkVar, AmbientDelegate ambientDelegate, khx khxVar, kjm kjmVar, kie kieVar, khg khgVar, kon konVar, jvb jvbVar, kbz kbzVar, kbo kboVar, mrm mrmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36151g = kjmVar;
        this.f36152h = kieVar;
        this.f36153i = khxVar;
        this.f36160p = konVar;
        this.f36150f = khgVar;
        this.f36154j = jvbVar;
        this.f36155k = kbzVar;
        this.f36156l = kboVar.mo6314a("RequestQueue");
        this.f36157m = mrmVar;
        jzq jzqVar = new jzq(this, 7);
        jzq jzqVar2 = new jzq(this, 8);
        jvbVar.m13537d(kgtVar.m14223b(jzqVar));
        kkkVar.m14433b(jzqVar);
        ambientDelegate.m1582M(jzqVar);
        khxVar.m14301c(jzqVar2);
        jzq jzqVar3 = new jzq(this, 9);
        lku.m15614I(kieVar.f36137b == null, "Session closed listener was set multiple times!");
        kieVar.f36137b = jzqVar3;
    }

    /* JADX INFO: renamed from: c */
    private final void m14326c(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                khq khqVar = (khq) it.next();
                this.f36156l.mo13947i("Failed to submit ".concat(String.valueOf(String.valueOf(khqVar))));
                khqVar.m14282f();
            }
        }
    }

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
    /* JADX INFO: renamed from: a */
    final void m14327a() {
        int i;
        kka kkaVar;
        kjl kjlVar;
        boolean z;
        synchronized (this.f36160p) {
            Object obj = f36145a;
            synchronized (obj) {
                if (!this.f36154j.mo8995b() && this.f36160p.m14629e(this.f36150f) && (i = this.f36149e) != 2 && i != 3) {
                    this.f36149e = 2;
                    this.f36156l.mo13940b("RequestQueue startCamera");
                    this.f36155k.mo13961e("RequestQueue startCamera");
                    if (this.f36157m.mo16813g()) {
                        ((kko) this.f36157m.mo16809c()).f36389a.mo19371d();
                    } else {
                        kjm kjmVar = this.f36151g;
                        if (kjmVar.f36276e.mo8995b() || !((kjlVar = kjmVar.f36281j) == null || kjlVar.m14377f())) {
                            kkaVar = kjmVar.f36279h;
                        } else {
                            jvb jvbVar = new jvb();
                            kjmVar.f36276e.m13537d(new igy(kjmVar, jvbVar, 7));
                            kjl kjlVar2 = new kjl(kjmVar.f36272a.f35837a, kjmVar.m14378a(kjmVar.f36279h, kjmVar.f36280i), kjmVar.f36274c, kjmVar.f36280i, kjmVar.f36277f, kjmVar.f36278g);
                            kcs kcsVar = new kcs(mws.m17095j(mws.m17098m(kjlVar2, kjmVar.f36282k)));
                            jvbVar.m13537d(kjlVar2);
                            kjlVar2.f36263a.m13537d(jvbVar);
                            jzq jzqVar = new jzq(kjmVar, 11);
                            kjmVar.f36275d.m14433b(jzqVar);
                            jvbVar.m13537d(new igy(kjmVar, jzqVar, 8));
                            kjmVar.f36278g.mo13944f("Starting Camera ".concat(String.valueOf(kjmVar.f36272a.f35837a.f36540a)));
                            kjmVar.f36273b.mo13986c(kjmVar.f36272a.f35837a, kcsVar);
                            kjmVar.f36281j = kjlVar2;
                            kkaVar = kjmVar.f36279h;
                        }
                        kiy kiyVar = this.f36159o;
                        synchronized (kkaVar) {
                            if (!kkaVar.f36322f) {
                                kiyVar.getClass();
                                kkaVar.f36320d = kiyVar;
                                kiv kivVar = kkaVar.f36318b;
                                if (kivVar != null) {
                                    kiyVar.mo14325b();
                                }
                            }
                        }
                    }
                    synchronized (obj) {
                        if (this.f36148d) {
                            z = false;
                        } else {
                            z = true;
                            this.f36146b = true;
                            this.f36147c = true;
                        }
                    }
                    if (z) {
                        m14328b();
                    }
                    this.f36155k.mo13962f();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX INFO: renamed from: b */
    public final void m14328b() {
        boolean z;
        boolean z2;
        Set setM14299a;
        kic kicVarM14323b;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = true;
        while (true) {
            synchronized (f36145a) {
                if (z5) {
                    if (this.f36148d) {
                        return;
                    }
                }
                z = this.f36146b;
                z2 = this.f36147c;
                if (!z6) {
                    this.f36148d = false;
                    return;
                }
                if (!z && !z2) {
                    this.f36148d = false;
                    return;
                }
                kie kieVar = this.f36152h;
                knt kntVarM14605b = kieVar.f36136a.m14605b(1L);
                setM14299a = null;
                if (kntVarM14605b == null) {
                    kicVarM14323b = null;
                } else {
                    try {
                        kicVarM14323b = kieVar.m14323b(kntVarM14605b);
                    } catch (kec e) {
                        kicVarM14323b = null;
                    }
                }
                if (kicVarM14323b == null) {
                    this.f36148d = false;
                    return;
                } else {
                    this.f36146b = false;
                    this.f36147c = false;
                    this.f36148d = true;
                }
            }
            if (z) {
                try {
                    kgx kgxVarMo14109a = kicVarM14323b.m14308b().mo14109a();
                    if (kgxVarMo14109a.m14227a().isEmpty()) {
                        z4 = false;
                    } else {
                        synchronized (f36145a) {
                            try {
                                if (!this.f36158n.equals(kgxVarMo14109a.m14227a())) {
                                    this.f36156l.mo13944f("Set repeating request to " + kgxVarMo14109a.toString() + " with " + String.valueOf(kgxVarMo14109a.m14227a()));
                                    this.f36158n = mxk.m17134F(kgxVarMo14109a.m14227a());
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        kicVarM14323b.m14315i(kgxVarMo14109a);
                        z4 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z3 = false;
                    try {
                        kicVarM14323b.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                        } catch (Exception e2) {
                        }
                    }
                    try {
                        throw th;
                    } catch (kec e3) {
                        e = e3;
                        this.f36156l.mo13948j("Unable to invoke setRepeating, requestProcessor is unavailable", e);
                        m14326c(setM14299a);
                        z6 = z3;
                        z5 = false;
                    }
                }
            } else {
                z4 = false;
            }
            if (z2) {
                try {
                    setM14299a = this.f36153i.m14299a();
                    while (setM14299a != null) {
                        kgw kgwVarM14308b = kicVarM14323b.m14308b();
                        Iterator it = setM14299a.iterator();
                        while (it.hasNext()) {
                            kgwVarM14308b.mo14110b(((khq) it.next()).f36079c);
                        }
                        kgx kgxVarMo14109a2 = kgwVarM14308b.mo14109a();
                        if (kgxVarMo14109a2.m14227a().isEmpty()) {
                            m14326c(setM14299a);
                        } else {
                            this.f36156l.mo13944f("Submitting " + kgxVarMo14109a2.toString() + " with " + String.valueOf(kgxVarMo14109a2.m14227a()));
                            kicVarM14323b.m14316j(kgxVarMo14109a2, setM14299a);
                            z4 = true;
                        }
                        setM14299a = this.f36153i.m14299a();
                    }
                } catch (Throwable th4) {
                    z3 = z4;
                    th = th4;
                    kicVarM14323b.close();
                    throw th;
                }
            }
            if (z4) {
                m14327a();
            }
            try {
                kicVarM14323b.close();
                z6 = z4;
            } catch (kec e4) {
                z3 = z4;
                e = e4;
                this.f36156l.mo13948j("Unable to invoke setRepeating, requestProcessor is unavailable", e);
                m14326c(setM14299a);
                z6 = z3;
            }
            z5 = false;
        }
    }
}
