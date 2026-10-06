package com.google.android.apps.camera.debug.shottracker.p009db;

import java.util.ArrayList;
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
import p000.dlz;
import p000.dmf;
import p000.dmg;
import p000.dmi;
import p000.dmm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ShotDatabase_Impl extends ShotDatabase {

    /* JADX INFO: renamed from: l */
    private volatile dlz f6605l;

    /* JADX INFO: renamed from: m */
    private volatile dmi f6606m;

    @Override // p000.apt
    /* JADX INFO: renamed from: a */
    protected final apr mo1706a() {
        return new apr(this, new HashMap(0), new HashMap(0), "shots", "shot_log");
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: b */
    protected final aqt mo1707b(apm apmVar) {
        return apmVar.f2016c.mo1878a(afk.m524p(apmVar.f2014a, apmVar.f2015b, new aqq(apmVar, new dmg(this), "d5a320f0e030e16072c0c60f65398e1d", "9330e297cee824d2d260a862d56ce4e4"), false, false));
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: e */
    public final List mo1708e(Map map) {
        return new ArrayList();
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: f */
    protected final Map mo1709f() {
        HashMap map = new HashMap();
        map.put(dlz.class, Collections.emptyList());
        map.put(dmi.class, Collections.emptyList());
        return map;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: g */
    public final Set mo1710g() {
        return new HashSet();
    }

    @Override // com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase
    /* JADX INFO: renamed from: w */
    public final dlz mo4093w() {
        dlz dlzVar;
        if (this.f6605l != null) {
            return this.f6605l;
        }
        synchronized (this) {
            if (this.f6605l == null) {
                this.f6605l = new dmf(this);
            }
            dlzVar = this.f6605l;
        }
        return dlzVar;
    }

    @Override // com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase
    /* JADX INFO: renamed from: x */
    public final dmi mo4094x() {
        dmi dmiVar;
        if (this.f6606m != null) {
            return this.f6606m;
        }
        synchronized (this) {
            if (this.f6606m == null) {
                this.f6606m = new dmm(this);
            }
            dmiVar = this.f6606m;
        }
        return dmiVar;
    }
}
