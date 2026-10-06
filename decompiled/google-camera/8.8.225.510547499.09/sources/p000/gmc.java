package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmc {

    /* JADX INFO: renamed from: a */
    public final Object f25581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25582b;

    public gmc(gva gvaVar, key keyVar, byte[] bArr) {
        this.f25582b = gvaVar;
        this.f25581a = keyVar;
    }

    public gmc(jau jauVar, long j) {
        this.f25582b = jauVar;
        jib.m13203h("monitoring");
        jib.m13196a(j > 0);
        this.f25581a = "monitoring";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX INFO: renamed from: a */
    public final kgg m9492a() {
        ?? r0;
        mxk mxkVar = this.f25581a.mo7049j().f36067c;
        if (mxkVar.contains(((gva) this.f25582b).f26480k)) {
            r0 = ((gva) this.f25582b).f26480k;
        } else if (mxkVar.contains(((gva) this.f25582b).f26475f)) {
            r0 = ((gva) this.f25582b).f26475f;
        } else if (mxkVar.contains(((gva) this.f25582b).f26476g)) {
            r0 = ((gva) this.f25582b).f26476g;
        } else if (mxkVar.contains(((gva) this.f25582b).f26479j)) {
            r0 = ((gva) this.f25582b).f26479j;
        } else if (mxkVar.contains(((gva) this.f25582b).f26478i)) {
            r0 = ((gva) this.f25582b).f26478i;
        } else {
            r0 = mxkVar.contains(((gva) this.f25582b).f26481l) ? ((gva) this.f25582b).f26481l : 0;
        }
        r0.getClass();
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kgg] */
    /* JADX INFO: renamed from: b */
    public final kgg m9493b() {
        gva gvaVar = (gva) this.f25582b;
        if (gvaVar.f26475f == null && gvaVar.f26476g == null) {
            return null;
        }
        if (gvaVar.f26479j == null && gvaVar.f26481l == null) {
            return null;
        }
        mxk mxkVar = this.f25581a.mo7049j().f36067c;
        if (!mxkVar.contains(((gva) this.f25582b).f26475f) && !mxkVar.contains(((gva) this.f25582b).f26476g)) {
            return null;
        }
        if (mxkVar.contains(((gva) this.f25582b).f26479j)) {
            return ((gva) this.f25582b).f26479j;
        }
        if (mxkVar.contains(((gva) this.f25582b).f26481l)) {
            return ((gva) this.f25582b).f26481l;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, key] */
    /* JADX INFO: renamed from: c */
    public final kpw m9494c(kgg kggVar) {
        if (kggVar == null) {
            return null;
        }
        try {
            return this.f25581a.mo7043d(kggVar);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kgg] */
    /* JADX INFO: renamed from: d */
    public final kpw m9495d() {
        kpw kpwVarM9494c = m9494c(((gva) this.f25582b).f26472c);
        return kpwVarM9494c != null ? kpwVarM9494c : m9494c(((gva) this.f25582b).f26471b);
    }

    /* JADX INFO: renamed from: e */
    public final kpw m9496e() {
        return m9494c(m9492a());
    }

    /* JADX INFO: renamed from: f */
    public final kpw m9497f() {
        return m9494c(m9493b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kgg] */
    /* JADX INFO: renamed from: g */
    public final kpw m9498g() {
        return m9494c(((gva) this.f25582b).f26473d);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9499h() {
        return m9493b() != null;
    }

    /* JADX INFO: renamed from: i */
    public final String m9500i() {
        return ((String) this.f25581a).concat(":count");
    }

    /* JADX INFO: renamed from: j */
    public final String m9501j() {
        return ((String) this.f25581a).concat(":start");
    }

    /* JADX INFO: renamed from: k */
    public final String m9502k() {
        return ((String) this.f25581a).concat(":value");
    }
}
