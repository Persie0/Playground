package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p338qd.C8573r0;
import p482xd.InterfaceC10177i;

/* JADX INFO: loaded from: classes.dex */
class Multimaps$CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {

    /* JADX INFO: renamed from: f */
    public transient InterfaceC10177i<? extends List<V>> f16114f;

    public Multimaps$CustomListMultimap(Map<K, Collection<V>> map, InterfaceC10177i<? extends List<V>> interfaceC10177i) {
        super(map);
        this.f16114f = interfaceC10177i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f16114f = (InterfaceC10177i) objectInputStream.readObject();
        Map<K, Collection<V>> map = (Map) objectInputStream.readObject();
        this.f15984d = map;
        this.f15985e = 0;
        for (Collection<V> collection : map.values()) {
            C8573r0.m16681K(!collection.isEmpty());
            this.f15985e = collection.size() + this.f15985e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f16114f);
        objectOutputStream.writeObject(this.f15984d);
    }
}
