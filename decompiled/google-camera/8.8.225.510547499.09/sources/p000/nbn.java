package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nbn implements nbw, ncm {

    /* JADX INFO: renamed from: a */
    private static final String f41945a = new String();

    /* JADX INFO: renamed from: b */
    public final long f41946b;

    /* JADX INFO: renamed from: c */
    public nbm f41947c;

    /* JADX INFO: renamed from: d */
    private final Level f41948d;

    /* JADX INFO: renamed from: e */
    private nbq f41949e;

    /* JADX INFO: renamed from: f */
    private ndm f41950f;

    /* JADX INFO: renamed from: g */
    private Object[] f41951g;

    protected nbn(Level level) {
        long jM17361b = ndk.m17361b();
        this.f41947c = null;
        this.f41949e = null;
        this.f41950f = null;
        this.f41951g = null;
        nea.m17397k(level, "level");
        this.f41948d = level;
        this.f41946b = jM17361b;
    }

    /* JADX INFO: renamed from: K */
    private final void m17268K(String str, Object... objArr) {
        this.f41951g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof nbi) {
                objArr[i] = ((nbi) obj).mo3585a();
            }
        }
        if (str != f41945a) {
            this.f41950f = new ndm(mo17255a(), str);
        }
        nei neiVarM17366k = ndk.m17366k();
        if (!neiVarM17366k.m17416a()) {
            nei neiVar = (nei) mo17285j().mo17266d(nbl.f41941f);
            if (neiVar != null && !neiVar.m17416a()) {
                neiVarM17366k = neiVarM17366k.m17416a() ? neiVar : new nei(new neg(neiVarM17366k.f42108c, neiVar.f42108c));
            }
            m17289n(nbl.f41941f, neiVarM17366k);
        }
        nbc nbcVarMo17257c = mo17257c();
        try {
            Cnew cnew = (Cnew) Cnew.f42158a.get();
            int i2 = cnew.f42159b + 1;
            cnew.f42159b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    nbcVarMo17257c.f41933a.mo17340c(this);
                } else {
                    nbc.m17249e("unbounded recursion in log statement", this);
                }
                if (cnew != null) {
                    cnew.close();
                }
            } catch (Throwable th) {
                if (cnew != null) {
                    try {
                        cnew.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e) {
                        }
                    }
                }
                throw th;
            }
        } catch (RuntimeException e2) {
            try {
                nbcVarMo17257c.f41933a.mo17339b(e2, this);
            } catch (nco e3) {
                throw e3;
            } catch (RuntimeException e4) {
                nbc.m17249e(e4.getClass().getName() + ": " + e4.getMessage(), this);
                try {
                    e4.printStackTrace(System.err);
                } catch (RuntimeException e5) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    private final boolean m17269L() {
        if (this.f41949e == null) {
            this.f41949e = ndk.m17364g().mo17358a(nbn.class, 1);
        }
        nbr nbrVarM17307b = this.f41949e;
        if (nbrVarM17307b != nbq.f41957a) {
            nbm nbmVar = this.f41947c;
            if (nbmVar != null && nbmVar.f41944b > 0) {
                nea.m17397k(nbrVarM17307b, "logSiteKey");
                int i = nbmVar.f41944b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (nbl.f41939d.equals(nbmVar.mo17265c(i2))) {
                        Object objMo17267e = nbmVar.mo17267e(i2);
                        nbrVarM17307b = objMo17267e instanceof nbx ? ((nbx) objMo17267e).m17307b() : new nca(nbrVarM17307b, objMo17267e);
                    }
                }
            }
        } else {
            nbrVarM17307b = null;
        }
        return mo17256b(nbrVarM17307b);
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: A */
    public final void mo17270A(String str, Object obj, boolean z) {
        if (m17269L()) {
            m17268K(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: B */
    public final void mo17271B(String str, Object obj, Object obj2, Object obj3) {
        if (m17269L()) {
            m17268K(str, obj, obj2, obj3);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: C */
    public final void mo17272C(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (m17269L()) {
            m17268K(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: D */
    public final void mo17273D(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m17269L()) {
            m17268K(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: E */
    public final boolean mo17274E() {
        return this.f41947c != null && Boolean.TRUE.equals(this.f41947c.mo17266d(nbl.f41940e));
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: F */
    public final Object[] mo17275F() {
        if (this.f41950f != null) {
            return this.f41951g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: G */
    public final nbw mo17276G(int i) {
        nbp nbpVar = new nbp(i);
        if (this.f41949e == null) {
            this.f41949e = nbpVar;
        }
        return mo17258d();
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: H */
    public final nbw mo17277H(TimeUnit timeUnit) {
        if (mo17274E()) {
            return mo17258d();
        }
        m17289n(nbl.f41938c, new nbt(timeUnit));
        return mo17258d();
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: I */
    public final void mo17278I(float f, float f2) {
        if (m17269L()) {
            m17268K(HEePJw.wdgfmLBnCZIi, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: J */
    public final void mo17279J(float f, Object obj) {
        if (m17269L()) {
            m17268K("Focal length needed = %g / available: %s", Float.valueOf(f), obj);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract ner mo17255a();

    /* JADX INFO: renamed from: b */
    protected boolean mo17256b(nbr nbrVar) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract nbc mo17257c();

    /* JADX INFO: renamed from: d */
    protected abstract nbw mo17258d();

    @Override // p000.ncm
    /* JADX INFO: renamed from: e */
    public final long mo17280e() {
        return this.f41946b;
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: f */
    public final nbq mo17281f() {
        nbq nbqVar = this.f41949e;
        if (nbqVar != null) {
            return nbqVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: g */
    public final nbw mo17282g(nbz nbzVar, Object obj) {
        nea.m17397k(nbzVar, "metadata key");
        if (obj != null) {
            m17289n(nbzVar, obj);
        }
        return mo17258d();
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: h */
    public final nbw mo17283h(Throwable th) {
        return mo17282g(nbl.f41936a, th);
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: i */
    public final nbw mo17284i(ncb ncbVar) {
        nea.m17397k(ncbVar, "stack size");
        if (ncbVar != ncb.f41982e) {
            m17289n(nbl.f41942g, ncbVar);
        }
        return mo17258d();
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: j */
    public final ncr mo17285j() {
        nbm nbmVar = this.f41947c;
        return nbmVar != null ? nbmVar : ncq.f42022a;
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: k */
    public final ndm mo17286k() {
        return this.f41950f;
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: l */
    public final Object mo17287l() {
        if (this.f41950f == null) {
            return this.f41951g[0];
        }
        throw new IllegalStateException(CswIK.ZvTDZt);
    }

    @Override // p000.ncm
    /* JADX INFO: renamed from: m */
    public final Level mo17288m() {
        return this.f41948d;
    }

    /* JADX INFO: renamed from: n */
    protected final void m17289n(nbz nbzVar, Object obj) {
        int iM17263a;
        if (this.f41947c == null) {
            this.f41947c = new nbm();
        }
        nbm nbmVar = this.f41947c;
        if (!nbzVar.f41966b && (iM17263a = nbmVar.m17263a(nbzVar)) != -1) {
            nea.m17397k(obj, "metadata value");
            nbmVar.f41943a[iM17263a + iM17263a + 1] = obj;
            return;
        }
        int i = nbmVar.f41944b + 1;
        Object[] objArr = nbmVar.f41943a;
        int length = objArr.length;
        if (i + i > length) {
            nbmVar.f41943a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = nbmVar.f41943a;
        int i2 = nbmVar.f41944b;
        nea.m17397k(nbzVar, "metadata key");
        objArr2[i2 + i2] = nbzVar;
        Object[] objArr3 = nbmVar.f41943a;
        int i3 = nbmVar.f41944b;
        nea.m17397k(obj, "metadata value");
        objArr3[i3 + i3 + 1] = obj;
        nbmVar.f41944b++;
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: o */
    public final void mo17290o(String str) {
        if (m17269L()) {
            m17268K(f41945a, str);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: p */
    public final void mo17291p(String str, int i) {
        if (m17269L()) {
            m17268K(str, Integer.valueOf(i));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: q */
    public final void mo17292q(String str, long j) {
        if (m17269L()) {
            m17268K(str, Long.valueOf(j));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: r */
    public final void mo17293r(String str, Object obj) {
        if (m17269L()) {
            m17268K(str, obj);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: s */
    public final void mo17294s(String str, int i, int i2) {
        if (m17269L()) {
            m17268K(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: t */
    public final void mo17295t(String str, int i, long j) {
        if (m17269L()) {
            m17268K(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: u */
    public final void mo17296u(String str, int i, Object obj) {
        if (m17269L()) {
            m17268K(str, Integer.valueOf(i), obj);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: v */
    public final void mo17297v(String str, long j, long j2) {
        if (m17269L()) {
            m17268K(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: w */
    public final void mo17298w(String str, long j, Object obj) {
        if (m17269L()) {
            m17268K(str, Long.valueOf(j), obj);
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: x */
    public final void mo17299x(String str, Object obj, int i) {
        if (m17269L()) {
            m17268K(str, obj, Integer.valueOf(i));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: y */
    public final void mo17300y(String str, Object obj, long j) {
        if (m17269L()) {
            m17268K(str, obj, Long.valueOf(j));
        }
    }

    @Override // p000.nbw
    /* JADX INFO: renamed from: z */
    public final void mo17301z(String str, Object obj, Object obj2) {
        if (m17269L()) {
            m17268K(str, obj, obj2);
        }
    }
}
