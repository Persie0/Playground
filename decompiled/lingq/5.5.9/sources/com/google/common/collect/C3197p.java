package com.google.common.collect;

import ae.C0062b;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p338qd.C8573r0;
import p482xd.C10172d;

/* JADX INFO: renamed from: com.google.common.collect.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3197p {

    /* JADX INFO: renamed from: a */
    public boolean f16167a;

    /* JADX INFO: renamed from: b */
    public int f16168b = -1;

    /* JADX INFO: renamed from: c */
    public int f16169c = -1;

    /* JADX INFO: renamed from: d */
    public MapMakerInternalMap.Strength f16170d;

    /* JADX INFO: renamed from: e */
    public MapMakerInternalMap.Strength f16171e;

    /* JADX INFO: renamed from: f */
    public Equivalence<Object> f16172f;

    /* JADX INFO: renamed from: a */
    public final MapMakerInternalMap.Strength m9136a() {
        return (MapMakerInternalMap.Strength) C10172d.m19190a(this.f16170d, MapMakerInternalMap.Strength.STRONG);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final <K, V> ConcurrentMap<K, V> m9137b() {
        if (!this.f16167a) {
            int i10 = this.f16168b;
            if (i10 == -1) {
                i10 = 16;
            }
            int i11 = this.f16169c;
            if (i11 == -1) {
                i11 = 4;
            }
            return new ConcurrentHashMap(i10, 0.75f, i11);
        }
        MapMakerInternalMap.C3151a c3151a = MapMakerInternalMap.f16059j;
        MapMakerInternalMap.Strength strengthM9136a = m9136a();
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.STRONG;
        if (strengthM9136a == strength && ((MapMakerInternalMap.Strength) C10172d.m19190a(this.f16171e, strength)) == strength) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.C3163m.a.f16101a);
        }
        if (m9136a() == strength && ((MapMakerInternalMap.Strength) C10172d.m19190a(this.f16171e, strength)) == MapMakerInternalMap.Strength.WEAK) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.C3164n.a.f16103a);
        }
        MapMakerInternalMap.Strength strengthM9136a2 = m9136a();
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.WEAK;
        if (strengthM9136a2 == strength2 && ((MapMakerInternalMap.Strength) C10172d.m19190a(this.f16171e, strength)) == strength) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.C3167q.a.f16106a);
        }
        if (m9136a() == strength2 && ((MapMakerInternalMap.Strength) C10172d.m19190a(this.f16171e, strength)) == strength2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.C3168r.a.f16108a);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public final void m9138c() {
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.WEAK;
        MapMakerInternalMap.Strength strength2 = this.f16170d;
        C8573r0.m16693Q(strength2, "Key strength was already set to %s", strength2 == null);
        strength.getClass();
        this.f16170d = strength;
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f16167a = true;
        }
    }

    public final String toString() {
        C10172d.a aVar = new C10172d.a(C3197p.class.getSimpleName());
        int i10 = this.f16168b;
        if (i10 != -1) {
            String strValueOf = String.valueOf(i10);
            C10172d.a.C10684a c10684a = new C10172d.a.C10684a();
            aVar.f51483c.f51486c = c10684a;
            aVar.f51483c = c10684a;
            c10684a.f51485b = strValueOf;
            c10684a.f51484a = "initialCapacity";
        }
        int i11 = this.f16169c;
        if (i11 != -1) {
            String strValueOf2 = String.valueOf(i11);
            C10172d.a.C10684a c10684a2 = new C10172d.a.C10684a();
            aVar.f51483c.f51486c = c10684a2;
            aVar.f51483c = c10684a2;
            c10684a2.f51485b = strValueOf2;
            c10684a2.f51484a = "concurrencyLevel";
        }
        MapMakerInternalMap.Strength strength = this.f16170d;
        if (strength != null) {
            String strM383p2 = C0062b.m383p2(strength.toString());
            C10172d.a.b bVar = new C10172d.a.b();
            aVar.f51483c.f51486c = bVar;
            aVar.f51483c = bVar;
            bVar.f51485b = strM383p2;
            bVar.f51484a = "keyStrength";
        }
        MapMakerInternalMap.Strength strength2 = this.f16171e;
        if (strength2 != null) {
            String strM383p3 = C0062b.m383p2(strength2.toString());
            C10172d.a.b bVar2 = new C10172d.a.b();
            aVar.f51483c.f51486c = bVar2;
            aVar.f51483c = bVar2;
            bVar2.f51485b = strM383p3;
            bVar2.f51484a = "valueStrength";
        }
        if (this.f16172f != null) {
            C10172d.a.b bVar3 = new C10172d.a.b();
            aVar.f51483c.f51486c = bVar3;
            aVar.f51483c = bVar3;
            bVar3.f51485b = "keyEquivalence";
        }
        return aVar.toString();
    }
}
