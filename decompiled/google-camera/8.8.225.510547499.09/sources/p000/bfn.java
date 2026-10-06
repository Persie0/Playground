package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class bfn implements Iterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bfp f3110a;

    /* JADX INFO: renamed from: b */
    public bfm f3111b;

    /* JADX INFO: renamed from: c */
    private int f3112c;

    /* JADX INFO: renamed from: d */
    private bfu f3113d;

    /* JADX INFO: renamed from: e */
    private String f3114e;

    /* JADX INFO: renamed from: f */
    private Iterator f3115f;

    /* JADX INFO: renamed from: g */
    private int f3116g;

    /* JADX INFO: renamed from: h */
    private Iterator f3117h;

    public bfn(bfp bfpVar) {
        this.f3110a = bfpVar;
        this.f3112c = 0;
        this.f3115f = null;
        this.f3116g = 0;
        this.f3117h = Collections.EMPTY_LIST.iterator();
        this.f3111b = null;
    }

    /* JADX INFO: renamed from: b */
    protected static final bfm m2319b(bfu bfuVar, String str, String str2) {
        return new bfm(str, str2, bfuVar.m2340g().m2395n() ? null : bfuVar.f3131b, bfuVar);
    }

    /* JADX INFO: renamed from: c */
    private final boolean m2320c(Iterator it) {
        if (!this.f3117h.hasNext() && it.hasNext()) {
            bfu bfuVar = (bfu) it.next();
            int i = this.f3116g + 1;
            this.f3116g = i;
            this.f3117h = new bfn(this.f3110a, bfuVar, this.f3114e, i);
        }
        if (!this.f3117h.hasNext()) {
            return false;
        }
        this.f3111b = (bfm) this.f3117h.next();
        return true;
    }

    /* JADX INFO: renamed from: a */
    protected final String m2321a(bfu bfuVar, String str, int i) {
        String str2;
        String str3;
        if (bfuVar.f3132c == null || bfuVar.m2340g().m2395n()) {
            return null;
        }
        if (bfuVar.f3132c.m2340g().m2389d()) {
            str2 = "[" + String.valueOf(i) + "]";
            str3 = "";
        } else {
            str2 = bfuVar.f3130a;
            str3 = "/";
        }
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (this.f3110a.f3122a.m2384h(1024)) {
            return !str2.startsWith("?") ? str2 : str2.substring(1);
        }
        return str + str3 + str2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f3111b != null) {
            return true;
        }
        int i = this.f3112c;
        if (i == 0) {
            this.f3112c = 1;
            bfu bfuVar = this.f3113d;
            if (bfuVar.f3132c == null || (this.f3110a.f3122a.m2379b() && bfuVar.m2352s())) {
                return hasNext();
            }
            this.f3111b = m2319b(this.f3113d, this.f3110a.f3123b, this.f3114e);
            return true;
        }
        if (i != 1) {
            if (this.f3115f == null) {
                this.f3115f = this.f3113d.m2342i();
            }
            return m2320c(this.f3115f);
        }
        if (this.f3115f == null) {
            this.f3115f = this.f3113d.m2341h();
        }
        boolean zM2320c = m2320c(this.f3115f);
        if (zM2320c || !this.f3113d.m2353t() || this.f3110a.f3122a.m2384h(4096)) {
            return zM2320c;
        }
        this.f3112c = 2;
        this.f3115f = null;
        return hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("There are no more nodes to return");
        }
        bfm bfmVar = this.f3111b;
        this.f3111b = null;
        return bfmVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public bfn(bfp bfpVar, bfu bfuVar, String str, int i) {
        this.f3110a = bfpVar;
        this.f3112c = 0;
        this.f3115f = null;
        this.f3116g = 0;
        this.f3117h = Collections.EMPTY_LIST.iterator();
        this.f3111b = null;
        this.f3113d = bfuVar;
        this.f3112c = 0;
        if (bfuVar.m2340g().m2395n()) {
            bfpVar.f3123b = bfuVar.f3130a;
        }
        this.f3114e = m2321a(bfuVar, str, i);
    }
}
