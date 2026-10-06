package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfu implements Comparable {

    /* JADX INFO: renamed from: a */
    public String f3130a;

    /* JADX INFO: renamed from: b */
    public String f3131b;

    /* JADX INFO: renamed from: c */
    public bfu f3132c;

    /* JADX INFO: renamed from: d */
    public List f3133d;

    /* JADX INFO: renamed from: e */
    public bge f3134e;

    /* JADX INFO: renamed from: f */
    public boolean f3135f;

    /* JADX INFO: renamed from: g */
    public boolean f3136g;

    /* JADX INFO: renamed from: h */
    public boolean f3137h;

    /* JADX INFO: renamed from: i */
    public boolean f3138i;

    /* JADX INFO: renamed from: j */
    private List f3139j;

    public bfu(String str, bge bgeVar) {
        this(str, null, bgeVar);
    }

    public bfu(String str, String str2, bge bgeVar) {
        this.f3139j = null;
        this.f3133d = null;
        this.f3130a = str;
        this.f3131b = str2;
        this.f3134e = bgeVar;
    }

    /* JADX INFO: renamed from: u */
    private final List m2329u() {
        if (this.f3133d == null) {
            this.f3133d = new ArrayList(0);
        }
        return this.f3133d;
    }

    /* JADX INFO: renamed from: v */
    private final void m2330v(String str) throws bfc {
        if ("[]".equals(str) || m2336c(str) == null) {
            return;
        }
        throw new bfc("Duplicate property or field node '" + str + "'", 203);
    }

    /* JADX INFO: renamed from: w */
    private final boolean m2331w() {
        return "xml:lang".equals(this.f3130a);
    }

    /* JADX INFO: renamed from: x */
    private final boolean m2332x() {
        return "rdf:type".equals(this.f3130a);
    }

    /* JADX INFO: renamed from: y */
    private static final bfu m2333y(List list, String str) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bfu bfuVar = (bfu) it.next();
            if (bfuVar.f3130a.equals(str)) {
                return bfuVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m2334a() {
        List list = this.f3139j;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m2335b() {
        List list = this.f3133d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final bfu m2336c(String str) {
        return m2333y(m2343j(), str);
    }

    public final Object clone() {
        bge bgeVar;
        try {
            bgeVar = new bge(m2340g().f3154a);
        } catch (bfc e) {
            bgeVar = new bge();
        }
        bfu bfuVar = new bfu(this.f3130a, this.f3131b, bgeVar);
        try {
            Iterator itM2341h = m2341h();
            while (itM2341h.hasNext()) {
                bfuVar.m2344k((bfu) ((bfu) itM2341h.next()).clone());
            }
            Iterator itM2342i = m2342i();
            while (itM2342i.hasNext()) {
                bfuVar.m2346m((bfu) ((bfu) itM2342i.next()).clone());
            }
        } catch (bfc e2) {
        }
        return bfuVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m2340g().m2395n() ? this.f3131b.compareTo(((bfu) obj).f3131b) : this.f3130a.compareTo(((bfu) obj).f3130a);
    }

    /* JADX INFO: renamed from: d */
    public final bfu m2337d(String str) {
        return m2333y(this.f3133d, str);
    }

    /* JADX INFO: renamed from: e */
    public final bfu m2338e(int i) {
        return (bfu) m2343j().get(i - 1);
    }

    /* JADX INFO: renamed from: f */
    public final bfu m2339f(int i) {
        return (bfu) m2329u().get(i - 1);
    }

    /* JADX INFO: renamed from: g */
    public final bge m2340g() {
        if (this.f3134e == null) {
            this.f3134e = new bge();
        }
        return this.f3134e;
    }

    /* JADX INFO: renamed from: h */
    public final Iterator m2341h() {
        return this.f3139j != null ? m2343j().iterator() : Collections.EMPTY_LIST.listIterator();
    }

    /* JADX INFO: renamed from: i */
    public final Iterator m2342i() {
        return this.f3133d != null ? new bft(m2329u().iterator()) : Collections.EMPTY_LIST.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final List m2343j() {
        if (this.f3139j == null) {
            this.f3139j = new ArrayList(0);
        }
        return this.f3139j;
    }

    /* JADX INFO: renamed from: k */
    public final void m2344k(bfu bfuVar) throws bfc {
        m2330v(bfuVar.f3130a);
        bfuVar.f3132c = this;
        m2343j().add(bfuVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m2345l(int i, bfu bfuVar) throws bfc {
        m2330v(bfuVar.f3130a);
        bfuVar.f3132c = this;
        m2343j().add(i - 1, bfuVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m2346m(bfu bfuVar) throws bfc {
        String str = bfuVar.f3130a;
        if (!"[]".equals(str) && m2337d(str) != null) {
            throw new bfc("Duplicate '" + str + "' qualifier", 203);
        }
        bfuVar.f3132c = this;
        bfuVar.m2340g().m2382f(32, true);
        m2340g().m2403v(true);
        if (bfuVar.m2331w()) {
            this.f3134e.m2402u(true);
            m2329u().add(0, bfuVar);
        } else if (!bfuVar.m2332x()) {
            m2329u().add(bfuVar);
        } else {
            this.f3134e.m2404w(true);
            m2329u().add(this.f3134e.m2388c() ? 1 : 0, bfuVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2347n() {
        if (this.f3139j.isEmpty()) {
            this.f3139j = null;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2348o(bfu bfuVar) {
        m2343j().remove(bfuVar);
        m2347n();
    }

    /* JADX INFO: renamed from: p */
    public final void m2349p() {
        this.f3139j = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m2350q(bfu bfuVar) {
        bge bgeVarM2340g = m2340g();
        if (bfuVar.m2331w()) {
            bgeVarM2340g.m2402u(false);
        } else if (bfuVar.m2332x()) {
            bgeVarM2340g.m2404w(false);
        }
        m2329u().remove(bfuVar);
        if (this.f3133d.isEmpty()) {
            bgeVarM2340g.m2403v(false);
            this.f3133d = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2351r() {
        int length;
        if (m2353t()) {
            bfu[] bfuVarArr = (bfu[]) m2329u().toArray(new bfu[m2335b()]);
            int i = 0;
            while (true) {
                length = bfuVarArr.length;
                if (length <= i || !("xml:lang".equals(bfuVarArr[i].f3130a) || "rdf:type".equals(bfuVarArr[i].f3130a))) {
                    break;
                }
                bfuVarArr[i].m2351r();
                i++;
            }
            Arrays.sort(bfuVarArr, i, length);
            ListIterator listIterator = this.f3133d.listIterator();
            for (int i2 = 0; i2 < bfuVarArr.length; i2++) {
                listIterator.next();
                listIterator.set(bfuVarArr[i2]);
                bfuVarArr[i2].m2351r();
            }
        }
        if (m2352s()) {
            if (!m2340g().m2389d()) {
                Collections.sort(this.f3139j);
            }
            Iterator itM2341h = m2341h();
            while (itM2341h.hasNext()) {
                ((bfu) itM2341h.next()).m2351r();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2352s() {
        List list = this.f3139j;
        return list != null && list.size() > 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2353t() {
        List list = this.f3133d;
        return list != null && list.size() > 0;
    }
}
