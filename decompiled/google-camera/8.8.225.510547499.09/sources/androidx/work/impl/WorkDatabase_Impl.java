package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.afk;
import p000.apm;
import p000.apr;
import p000.aqq;
import p000.aqt;
import p000.azk;
import p000.azl;
import p000.azm;
import p000.azn;
import p000.bbv;
import p000.bbx;
import p000.bbz;
import p000.bcb;
import p000.bcc;
import p000.bce;
import p000.bci;
import p000.bcl;
import p000.bcn;
import p000.bco;
import p000.bcs;
import p000.bcw;
import p000.bdk;
import p000.bdl;
import p000.bdo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: l */
    private volatile bcw f1802l;

    /* JADX INFO: renamed from: m */
    private volatile bbv f1803m;

    /* JADX INFO: renamed from: n */
    private volatile bdl f1804n;

    /* JADX INFO: renamed from: o */
    private volatile bce f1805o;

    /* JADX INFO: renamed from: p */
    private volatile bcl f1806p;

    /* JADX INFO: renamed from: q */
    private volatile bco f1807q;

    /* JADX INFO: renamed from: r */
    private volatile bbz f1808r;

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: A */
    public final bco mo1699A() {
        bco bcoVar;
        if (this.f1807q != null) {
            return this.f1807q;
        }
        synchronized (this) {
            if (this.f1807q == null) {
                this.f1807q = new bcs(this);
            }
            bcoVar = this.f1807q;
        }
        return bcoVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: B */
    public final bcw mo1700B() {
        bcw bcwVar;
        if (this.f1802l != null) {
            return this.f1802l;
        }
        synchronized (this) {
            if (this.f1802l == null) {
                this.f1802l = new bdk(this);
            }
            bcwVar = this.f1802l;
        }
        return bcwVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: C */
    public final bdl mo1701C() {
        bdl bdlVar;
        if (this.f1804n != null) {
            return this.f1804n;
        }
        synchronized (this) {
            if (this.f1804n == null) {
                this.f1804n = new bdo(this);
            }
            bdlVar = this.f1804n;
        }
        return bdlVar;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: a */
    protected final apr mo1706a() {
        return new apr(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: b */
    protected final aqt mo1707b(apm apmVar) {
        return apmVar.f2016c.mo1878a(afk.m524p(apmVar.f2014a, apmVar.f2015b, new aqq(apmVar, new azn(this), "9a88f3f80fa3930a8acb506b8ba7ca77", "c7bdf24df36c34d3f38547c084675fa6"), false, false));
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: e */
    public final List mo1708e(Map map) {
        return Arrays.asList(new azk(), new azl(), new azm());
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: f */
    protected final Map mo1709f() {
        HashMap map = new HashMap();
        map.put(bcw.class, Collections.emptyList());
        map.put(bbv.class, Collections.emptyList());
        map.put(bdl.class, Collections.emptyList());
        map.put(bce.class, Collections.emptyList());
        map.put(bcl.class, Collections.emptyList());
        map.put(bco.class, Collections.emptyList());
        map.put(bbz.class, Collections.emptyList());
        map.put(bcc.class, Collections.emptyList());
        return map;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: g */
    public final Set mo1710g() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: w */
    public final bbv mo1702w() {
        bbv bbvVar;
        if (this.f1803m != null) {
            return this.f1803m;
        }
        synchronized (this) {
            if (this.f1803m == null) {
                this.f1803m = new bbx(this);
            }
            bbvVar = this.f1803m;
        }
        return bbvVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: x */
    public final bbz mo1703x() {
        bbz bbzVar;
        if (this.f1808r != null) {
            return this.f1808r;
        }
        synchronized (this) {
            if (this.f1808r == null) {
                this.f1808r = new bcb(this);
            }
            bbzVar = this.f1808r;
        }
        return bbzVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: y */
    public final bce mo1704y() {
        bce bceVar;
        if (this.f1805o != null) {
            return this.f1805o;
        }
        synchronized (this) {
            if (this.f1805o == null) {
                this.f1805o = new bci(this);
            }
            bceVar = this.f1805o;
        }
        return bceVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: z */
    public final bcl mo1705z() {
        bcl bclVar;
        if (this.f1806p != null) {
            return this.f1806p;
        }
        synchronized (this) {
            if (this.f1806p == null) {
                this.f1806p = new bcn(this);
            }
            bclVar = this.f1806p;
        }
        return bclVar;
    }
}
