package com.google.android.apps.camera.camerafatalerror;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
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
import p000.dcq;
import p000.dcw;
import p000.ddb;
import p000.ddd;
import p000.ddi;
import p000.ddk;
import p000.ddo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CameraFatalErrorTrackerDatabase_Impl extends CameraFatalErrorTrackerDatabase {

    /* JADX INFO: renamed from: l */
    private volatile ddd f6587l;

    /* JADX INFO: renamed from: m */
    private volatile dcw f6588m;

    /* JADX INFO: renamed from: n */
    private volatile ddk f6589n;

    @Override // p000.apt
    /* JADX INFO: renamed from: a */
    protected final apr mo1706a() {
        return new apr(this, new HashMap(0), new HashMap(0), "FatalErrorCounts", "EnumerationErrorCounts", "HardwareHelpDialogCounts");
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: b */
    protected final aqt mo1707b(apm apmVar) {
        return apmVar.f2016c.mo1878a(afk.m524p(apmVar.f2014a, apmVar.f2015b, new aqq(apmVar, new dcq(this), wUzNh.jWTpSyHrQupbl, "c9b58355d6a76cd8d24dcaa135d48342"), false, false));
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
        map.put(ddd.class, Collections.emptyList());
        map.put(dcw.class, Collections.emptyList());
        map.put(ddk.class, Collections.emptyList());
        return map;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: g */
    public final Set mo1710g() {
        return new HashSet();
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    /* JADX INFO: renamed from: w */
    public final dcw mo4083w() {
        dcw dcwVar;
        if (this.f6588m != null) {
            return this.f6588m;
        }
        synchronized (this) {
            if (this.f6588m == null) {
                this.f6588m = new ddb(this);
            }
            dcwVar = this.f6588m;
        }
        return dcwVar;
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    /* JADX INFO: renamed from: x */
    public final ddd mo4084x() {
        ddd dddVar;
        if (this.f6587l != null) {
            return this.f6587l;
        }
        synchronized (this) {
            if (this.f6587l == null) {
                this.f6587l = new ddi(this);
            }
            dddVar = this.f6587l;
        }
        return dddVar;
    }

    @Override // com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase
    /* JADX INFO: renamed from: y */
    public final ddk mo4085y() {
        ddk ddkVar;
        if (this.f6589n != null) {
            return this.f6589n;
        }
        synchronized (this) {
            if (this.f6589n == null) {
                this.f6589n = new ddo(this);
            }
            ddkVar = this.f6589n;
        }
        return ddkVar;
    }
}
