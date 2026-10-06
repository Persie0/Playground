package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mvc extends mvp implements naf {

    /* JADX INFO: renamed from: a */
    private transient Comparator f41675a;

    /* JADX INFO: renamed from: b */
    private transient NavigableSet f41676b;

    /* JADX INFO: renamed from: c */
    private transient Set f41677c;

    @Override // p000.mvp, p000.mvl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract naf mo3817b();

    @Override // p000.naf, p000.nae
    public final Comparator comparator() {
        Comparator comparator = this.f41675a;
        if (comparator != null) {
            return comparator;
        }
        mzh mzhVarMo17165a = mzh.m17166b(mo3817b().comparator()).mo17165a();
        this.f41675a = mzhVarMo17165a;
        return mzhVarMo17165a;
    }

    /* JADX INFO: renamed from: e */
    public abstract Iterator mo16927e();

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: g */
    public final Set mo16921g() {
        Set set = this.f41677c;
        if (set != null) {
            return set;
        }
        mvb mvbVar = new mvb(this);
        this.f41677c = mvbVar;
        return mvbVar;
    }

    @Override // p000.mvl, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return mkv.m16556u(this);
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: j */
    public final myx mo16928j() {
        return mo3817b().mo16929k();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: k */
    public final myx mo16929k() {
        return mo3817b().mo16928j();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: l */
    public final myx mo16930l() {
        return mo3817b().mo16931m();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: m */
    public final myx mo16931m() {
        return mo3817b().mo16930l();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: n */
    public final naf mo16932n() {
        return mo3817b();
    }

    @Override // p000.mvp
    /* JADX INFO: renamed from: o */
    protected final myy mo17015o() {
        return mo3817b();
    }

    @Override // p000.mvp, p000.myy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final NavigableSet mo16920f() {
        NavigableSet navigableSet = this.f41676b;
        if (navigableSet != null) {
            return navigableSet;
        }
        nah nahVar = new nah(this);
        this.f41676b = nahVar;
        return nahVar;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: q */
    public final naf mo16935q(Object obj, int i, Object obj2, int i2) {
        return mo3817b().mo16935q(obj2, i2, obj, i).mo16932n();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: r */
    public final naf mo17016r(Object obj, int i) {
        return mo3817b().mo17017s(obj, i).mo16932n();
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: s */
    public final naf mo17017s(Object obj, int i) {
        return mo3817b().mo17016r(obj, i).mo16932n();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return m17030u();
    }

    @Override // p000.mvq
    public final String toString() {
        return mo16921g().toString();
    }

    @Override // p000.mvl, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return mkv.m16550o(this, objArr);
    }
}
