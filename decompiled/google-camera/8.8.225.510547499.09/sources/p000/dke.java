package p000;

import android.net.Uri;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import p021j$.util.Comparator$CC;
import p021j$.util.Comparator$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dke implements Iterable {

    /* JADX INFO: renamed from: a */
    private static final nbh f11876a = nbh.m17259h("com/google/android/apps/camera/data/NavigableFilmstripData");

    /* JADX INFO: renamed from: b */
    private final TreeSet f11877b = new TreeSet(Comparator$EL.reversed(Comparator$EL.thenComparing(Comparator$CC.comparing(cqk.f8925l), cqk.f8926m)));

    /* JADX INFO: renamed from: c */
    private final Map f11878c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Map f11879d = new HashMap();

    /* JADX INFO: renamed from: l */
    private final synchronized mrm m6292l(chq chqVar) {
        gyu gyuVarMo3744d = chqVar.mo3744d();
        Uri uriMo3743c = chqVar.mo3743c();
        boolean z = (gyuVarMo3744d == null && uriMo3743c.equals(Uri.EMPTY)) ? false : true;
        lku.m15616K(z, "At least one of shotId or Uri should be set: %s", chqVar);
        chp chpVar = gyuVarMo3744d != null ? (chp) this.f11878c.get(gyuVarMo3744d) : null;
        chp chpVar2 = (chp) this.f11879d.get(uriMo3743c);
        if (chpVar != null && chpVar2 != null) {
            lku.m15617L(chpVar == chpVar2, "Maps out of sync, byUri:%s, byShotId: %s", chpVar2, chpVar);
            return mrm.m16829i(chpVar);
        }
        if (chpVar != null) {
            return mrm.m16829i(chpVar);
        }
        return chpVar2 != null ? mrm.m16829i(chpVar2) : mqu.f41450a;
    }

    /* JADX INFO: renamed from: m */
    private final synchronized void m6293m(chp chpVar) {
        mrm mrmVarM6292l = m6292l(chpVar.mo3733b());
        if (mrmVarM6292l.mo16813g()) {
            chp chpVar2 = (chp) mrmVarM6292l.mo16809c();
            gyu gyuVarMo3744d = chpVar2.mo3733b().mo3744d();
            Uri uriMo3743c = chpVar2.mo3733b().mo3743c();
            if (gyuVarMo3744d != null) {
                ((chp) this.f11878c.remove(gyuVarMo3744d)).getClass();
            }
            if (!uriMo3743c.equals(Uri.EMPTY)) {
                ((chp) this.f11879d.remove(uriMo3743c)).getClass();
            }
            lku.m15617L(this.f11877b.remove(chpVar2), IuyLAqNmW.tiKiE, chpVar2, this.f11877b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m6294a() {
        return this.f11877b.size();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized chp m6295b() {
        if (this.f11877b.isEmpty()) {
            return null;
        }
        return (chp) this.f11877b.first();
    }

    /* JADX INFO: renamed from: c */
    final synchronized chp m6296c(Uri uri) {
        return (chp) this.f11879d.get(uri);
    }

    /* JADX INFO: renamed from: d */
    final synchronized chp m6297d(gyu gyuVar) {
        return (chp) this.f11878c.get(gyuVar);
    }

    /* JADX INFO: renamed from: e */
    final synchronized chp m6298e(chp chpVar) {
        mrm mrmVarM6292l = m6292l(chpVar.mo3733b());
        if (mrmVarM6292l.mo16813g()) {
            return (chp) mrmVarM6292l.mo16809c();
        }
        m6304k(chpVar);
        return chpVar;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized chp m6299f() {
        if (this.f11877b.isEmpty()) {
            return null;
        }
        return (chp) this.f11877b.last();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6300g(Collection collection) {
        int i = ((mzr) collection).f41859c;
        lku.m15615J(this.f11877b.isEmpty(), "addAll must be called on an empty list. filmstripItems contains: %s", this.f11877b.size());
        lku.m15615J(this.f11879d.isEmpty(), "addAll must be called on an empty list. uriFilmstripItemMap contains: %s", this.f11879d.size());
        lku.m15615J(this.f11878c.isEmpty(), "addAll must be called on an empty list. shotToFilmStripMap contains: %s", this.f11878c.size());
        this.f11877b.addAll(collection);
        nba it = ((mws) collection).iterator();
        while (it.hasNext()) {
            chp chpVar = (chp) it.next();
            gyu gyuVarMo3744d = chpVar.mo3733b().mo3744d();
            Uri uriMo3743c = chpVar.mo3733b().mo3743c();
            if (!uriMo3743c.equals(Uri.EMPTY)) {
                lku.m15614I(!this.f11879d.containsKey(uriMo3743c), String.format(Locale.ROOT, "Multiple entries for uri: %s. %s & %s", uriMo3743c, this.f11879d.get(uriMo3743c), chpVar));
                this.f11879d.put(uriMo3743c, chpVar);
            }
            if (gyuVarMo3744d != null) {
                lku.m15614I(!this.f11878c.containsKey(gyuVarMo3744d), String.format(Locale.ROOT, "Multiple entries for shotId: %s. %s & %s", gyuVarMo3744d, this.f11878c.get(gyuVarMo3744d), chpVar));
                this.f11878c.put(gyuVarMo3744d, chpVar);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    final synchronized void m6301h() {
        this.f11878c.clear();
        this.f11879d.clear();
        this.f11877b.clear();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m6302i(Uri uri) {
        chp chpVarM6296c = m6296c(uri);
        if (chpVarM6296c == null) {
            ((nbe) ((nbe) f11876a.m17252c()).mo17276G((char) 946)).mo17293r("Uri %s not found in filmstrip", uri);
        } else {
            m6293m(chpVarM6296c);
        }
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new TreeSet((SortedSet) this.f11877b).iterator();
    }

    /* JADX INFO: renamed from: j */
    final synchronized void m6303j(chp chpVar) {
        m6293m(chpVar);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m6304k(chp chpVar) {
        chq chqVarMo3733b = chpVar.mo3733b();
        gyu gyuVarMo3744d = chqVarMo3733b.mo3744d();
        Uri uriMo3743c = chqVarMo3733b.mo3743c();
        boolean z = true;
        if (gyuVarMo3744d == null && uriMo3743c.equals(Uri.EMPTY)) {
            z = false;
        }
        lku.m15616K(z, "At least one of shotId or Uri should be set: %s", chpVar);
        mrm mrmVarM6292l = m6292l(chqVarMo3733b);
        if (mrmVarM6292l.mo16813g()) {
            chpVar = (chp) mrmVarM6292l.mo16809c();
            this.f11877b.remove(chpVar);
            chpVar.mo3737f(chqVarMo3733b);
        }
        if (gyuVarMo3744d != null) {
            this.f11878c.put(gyuVarMo3744d, chpVar);
        }
        if (!uriMo3743c.equals(Uri.EMPTY)) {
            this.f11879d.put(uriMo3743c, chpVar);
        }
        this.f11877b.add(chpVar);
        mrmVarM6292l.mo16813g();
    }
}
