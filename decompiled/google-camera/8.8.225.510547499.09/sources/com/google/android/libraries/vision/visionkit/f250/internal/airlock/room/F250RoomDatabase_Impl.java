package com.google.android.libraries.vision.visionkit.f250.internal.airlock.room;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
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
import p000.lxd;
import p000.lxl;
import p000.lxn;
import p000.lxq;
import p000.lxs;
import p000.lxu;
import p000.lxw;
import p000.lxz;
import p000.lyx;
import p000.lyz;
import p000.lzd;
import p000.lze;
import p000.lzh;
import p000.lzo;
import p000.lzv;
import p000.maj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class F250RoomDatabase_Impl extends F250RoomDatabase {

    /* JADX INFO: renamed from: l */
    private volatile lxd f7973l;

    /* JADX INFO: renamed from: m */
    private volatile lxn f7974m;

    /* JADX INFO: renamed from: n */
    private volatile lxs f7975n;

    /* JADX INFO: renamed from: o */
    private volatile lxw f7976o;

    /* JADX INFO: renamed from: p */
    private volatile lyz f7977p;

    /* JADX INFO: renamed from: q */
    private volatile lzd f7978q;

    /* JADX INFO: renamed from: r */
    private volatile lzh f7979r;

    /* JADX INFO: renamed from: s */
    private volatile lzv f7980s;

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: A */
    public final lyz mo4719A() {
        lyz lyzVar;
        if (this.f7977p != null) {
            return this.f7977p;
        }
        synchronized (this) {
            if (this.f7977p == null) {
                this.f7977p = new lyz(this);
            }
            lyzVar = this.f7977p;
        }
        return lyzVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: B */
    public final lzd mo4720B() {
        lzd lzdVar;
        if (this.f7978q != null) {
            return this.f7978q;
        }
        synchronized (this) {
            if (this.f7978q == null) {
                this.f7978q = new lzd();
            }
            lzdVar = this.f7978q;
        }
        return lzdVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: C */
    public final lzh mo4721C() {
        lzh lzhVar;
        if (this.f7979r != null) {
            return this.f7979r;
        }
        synchronized (this) {
            if (this.f7979r == null) {
                this.f7979r = new lzo(this);
            }
            lzhVar = this.f7979r;
        }
        return lzhVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: D */
    public final lzv mo4722D() {
        lzv lzvVar;
        if (this.f7980s != null) {
            return this.f7980s;
        }
        synchronized (this) {
            if (this.f7980s == null) {
                this.f7980s = new maj(this);
            }
            lzvVar = this.f7980s;
        }
        return lzvVar;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: a */
    protected final apr mo1706a() {
        HashMap map = new HashMap(1);
        map.put("ResourceFts", "ResourceEntity");
        return new apr(this, map, new HashMap(0), "ResourceEntity", "ResourceFts", "AnnotachmentEntity", "F250LogEntity");
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: b */
    protected final aqt mo1707b(apm apmVar) {
        return apmVar.f2016c.mo1878a(afk.m524p(apmVar.f2014a, apmVar.f2015b, new aqq(apmVar, new lyx(this), KMNlNMe.PANgevDARL, "310938173a165a0105beebc721adaaaa"), false, false));
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
        map.put(lxd.class, Collections.emptyList());
        map.put(lxn.class, Collections.emptyList());
        map.put(lxs.class, Collections.emptyList());
        map.put(lxw.class, Collections.emptyList());
        map.put(lyz.class, Collections.emptyList());
        map.put(lzd.class, Collections.emptyList());
        map.put(lzh.class, Collections.emptyList());
        map.put(lzv.class, Collections.emptyList());
        map.put(lze.class, Collections.emptyList());
        return map;
    }

    @Override // p000.apt
    /* JADX INFO: renamed from: g */
    public final Set mo1710g() {
        return new HashSet();
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: w */
    public final lxd mo4723w() {
        lxd lxdVar;
        if (this.f7973l != null) {
            return this.f7973l;
        }
        synchronized (this) {
            if (this.f7973l == null) {
                this.f7973l = new lxl(this);
            }
            lxdVar = this.f7973l;
        }
        return lxdVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: x */
    public final lxn mo4724x() {
        lxn lxnVar;
        if (this.f7974m != null) {
            return this.f7974m;
        }
        synchronized (this) {
            if (this.f7974m == null) {
                this.f7974m = new lxq(this);
            }
            lxnVar = this.f7974m;
        }
        return lxnVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: y */
    public final lxs mo4725y() {
        lxs lxsVar;
        if (this.f7975n != null) {
            return this.f7975n;
        }
        synchronized (this) {
            if (this.f7975n == null) {
                this.f7975n = new lxu(this);
            }
            lxsVar = this.f7975n;
        }
        return lxsVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase
    /* JADX INFO: renamed from: z */
    public final lxw mo4726z() {
        lxw lxwVar;
        if (this.f7976o != null) {
            return this.f7976o;
        }
        synchronized (this) {
            if (this.f7976o == null) {
                this.f7976o = new lxz(this);
            }
            lxwVar = this.f7976o;
        }
        return lxwVar;
    }
}
