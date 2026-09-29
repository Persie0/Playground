package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p000.bna;
import p000.on9;

/* JADX INFO: loaded from: classes2.dex */
class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {

    /* JADX INFO: renamed from: f */
    public transient on9 f13414f;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f13414f = (on9) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        Map map = (Map) object2;
        this.f13381d = map;
        this.f13382e = 0;
        for (V v : map.values()) {
            bna.m3969q(!v.isEmpty());
            this.f13382e = v.size() + this.f13382e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f13414f);
        objectOutputStream.writeObject(this.f13381d);
    }

    @Override // p000.AbstractC2948e1
    /* JADX INFO: renamed from: b */
    public final Map mo6317b() {
        Map map = this.f13381d;
        if (map instanceof NavigableMap) {
            return new C1090f(this, (NavigableMap) this.f13381d);
        }
        return map instanceof SortedMap ? new C1092h(this, (SortedMap) this.f13381d) : new C1087c(this, this.f13381d);
    }

    @Override // p000.AbstractC2948e1
    /* JADX INFO: renamed from: c */
    public final Set mo6318c() {
        Map map = this.f13381d;
        if (map instanceof NavigableMap) {
            return new C1091g(this, (NavigableMap) this.f13381d);
        }
        return map instanceof SortedMap ? new C1093i(this, (SortedMap) this.f13381d) : new C1089e(this, this.f13381d);
    }
}
