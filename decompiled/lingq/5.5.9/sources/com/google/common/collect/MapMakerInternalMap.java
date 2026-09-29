package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap.InterfaceC3158h;
import com.google.common.collect.MapMakerInternalMap.Segment;
import com.google.common.primitives.Ints;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p338qd.C8573r0;
import p482xd.C10172d;

/* JADX INFO: loaded from: classes.dex */
class MapMakerInternalMap<K, V, E extends InterfaceC3158h<K, V, E>, S extends Segment<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: j */
    public static final C3151a f16059j = new C3151a();

    /* JADX INFO: renamed from: a */
    public final transient int f16060a;

    /* JADX INFO: renamed from: b */
    public final transient int f16061b;

    /* JADX INFO: renamed from: c */
    public final transient Segment<K, V, E, S>[] f16062c;

    /* JADX INFO: renamed from: d */
    public final int f16063d;

    /* JADX INFO: renamed from: e */
    public final Equivalence<Object> f16064e;

    /* JADX INFO: renamed from: f */
    public final transient InterfaceC3159i<K, V, E, S> f16065f;

    /* JADX INFO: renamed from: g */
    @NullableDecl
    public transient C3161k f16066g;

    /* JADX INFO: renamed from: h */
    @NullableDecl
    public transient C3166p f16067h;

    /* JADX INFO: renamed from: i */
    @NullableDecl
    public transient C3156f f16068i;

    public static abstract class AbstractSerializationProxy<K, V> extends AbstractConcurrentMapC3191j<K, V> implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Strength f16069a;

        /* JADX INFO: renamed from: b */
        public final Strength f16070b;

        /* JADX INFO: renamed from: c */
        public final Equivalence<Object> f16071c;

        /* JADX INFO: renamed from: d */
        public final int f16072d;

        /* JADX INFO: renamed from: e */
        public transient ConcurrentMap<K, V> f16073e;

        public AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, int i10, ConcurrentMap concurrentMap) {
            this.f16069a = strength;
            this.f16070b = strength2;
            this.f16071c = equivalence;
            this.f16072d = i10;
            this.f16073e = concurrentMap;
        }

        @Override // com.google.common.collect.AbstractC3193l
        /* JADX INFO: renamed from: a */
        public final Object mo9087a() {
            return this.f16073e;
        }

        @Override // com.google.common.collect.AbstractC3192k
        /* JADX INFO: renamed from: b */
        public final Map mo9088b() {
            return this.f16073e;
        }
    }

    public static abstract class Segment<K, V, E extends InterfaceC3158h<K, V, E>, S extends Segment<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int f16074g = 0;

        /* JADX INFO: renamed from: a */
        @Weak
        public final MapMakerInternalMap<K, V, E, S> f16075a;

        /* JADX INFO: renamed from: b */
        public volatile int f16076b;

        /* JADX INFO: renamed from: c */
        public int f16077c;

        /* JADX INFO: renamed from: d */
        public int f16078d;

        /* JADX INFO: renamed from: e */
        @NullableDecl
        public volatile AtomicReferenceArray<E> f16079e;

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f16080f = new AtomicInteger();

        public Segment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            this.f16075a = mapMakerInternalMap;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i10);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f16078d = length;
            if (length == -1) {
                this.f16078d = length + 1;
            }
            this.f16079e = atomicReferenceArray;
        }

        /* JADX INFO: renamed from: a */
        public final void m9089a(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                InterfaceC3158h interfaceC3158h = (InterfaceC3158h) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.f16075a;
                mapMakerInternalMap.getClass();
                int iMo9105c = interfaceC3158h.mo9105c();
                Segment<K, V, E, S> segmentM9086c = mapMakerInternalMap.m9086c(iMo9105c);
                segmentM9086c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
                    int length = iMo9105c & (atomicReferenceArray.length() - 1);
                    E e10 = atomicReferenceArray.get(length);
                    for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                        if (interfaceC3158hMo9104a == interfaceC3158h) {
                            segmentM9086c.f16077c++;
                            InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                            int i11 = segmentM9086c.f16076b - 1;
                            atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                            segmentM9086c.f16076b = i11;
                            break;
                        }
                    }
                    segmentM9086c.unlock();
                    i10++;
                } catch (Throwable th2) {
                    segmentM9086c.unlock();
                    throw th2;
                }
            } while (i10 != 16);
        }

        /* JADX INFO: renamed from: b */
        public final void m9090b(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                InterfaceC3170t<K, V, E> interfaceC3170t = (InterfaceC3170t) referencePoll;
                MapMakerInternalMap<K, V, E, S> mapMakerInternalMap = this.f16075a;
                mapMakerInternalMap.getClass();
                InterfaceC3158h interfaceC3158hMo9103b = interfaceC3170t.mo9103b();
                int iMo9105c = interfaceC3158hMo9103b.mo9105c();
                Segment<K, V, E, S> segmentM9086c = mapMakerInternalMap.m9086c(iMo9105c);
                Object key = interfaceC3158hMo9103b.getKey();
                segmentM9086c.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
                    int length = (atomicReferenceArray.length() - 1) & iMo9105c;
                    E e10 = atomicReferenceArray.get(length);
                    for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                        Object key2 = interfaceC3158hMo9104a.getKey();
                        if (interfaceC3158hMo9104a.mo9105c() == iMo9105c && key2 != null && segmentM9086c.f16075a.f16064e.m9015d(key, key2)) {
                            if (((InterfaceC3169s) interfaceC3158hMo9104a).mo9116b() != interfaceC3170t) {
                                break;
                            }
                            segmentM9086c.f16077c++;
                            InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                            int i11 = segmentM9086c.f16076b - 1;
                            atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                            segmentM9086c.f16076b = i11;
                            break;
                        }
                    }
                    segmentM9086c.unlock();
                    i10++;
                } catch (Throwable th2) {
                    segmentM9086c.unlock();
                    throw th2;
                }
            } while (i10 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public final void m9091c() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f16079e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f16076b;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f16078d = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E eMo9104a = atomicReferenceArray.get(i11);
                if (eMo9104a != null) {
                    InterfaceC3158h interfaceC3158hMo9104a = eMo9104a.mo9104a();
                    int iMo9105c = eMo9104a.mo9105c() & length2;
                    if (interfaceC3158hMo9104a == null) {
                        atomicReferenceArray2.set(iMo9105c, eMo9104a);
                    } else {
                        InterfaceC3158h interfaceC3158h = eMo9104a;
                        while (interfaceC3158hMo9104a != null) {
                            int iMo9105c2 = interfaceC3158hMo9104a.mo9105c() & length2;
                            if (iMo9105c2 != iMo9105c) {
                                interfaceC3158h = interfaceC3158hMo9104a;
                                iMo9105c = iMo9105c2;
                            }
                            interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a();
                        }
                        atomicReferenceArray2.set(iMo9105c, interfaceC3158h);
                        while (eMo9104a != interfaceC3158h) {
                            int iMo9105c3 = eMo9104a.mo9105c() & length2;
                            InterfaceC3158h interfaceC3158hMo9111b = this.f16075a.f16065f.mo9111b(mo9099q(), eMo9104a, (InterfaceC3158h) atomicReferenceArray2.get(iMo9105c3));
                            if (interfaceC3158hMo9111b != null) {
                                atomicReferenceArray2.set(iMo9105c3, interfaceC3158hMo9111b);
                            } else {
                                i10--;
                            }
                            eMo9104a = eMo9104a.mo9104a();
                        }
                    }
                }
            }
            this.f16079e = atomicReferenceArray2;
            this.f16076b = i10;
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC3158h m9092d(int i10, Object obj) {
            if (this.f16076b != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f16079e;
                for (E eMo9104a = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i10); eMo9104a != null; eMo9104a = eMo9104a.mo9104a()) {
                    if (eMo9104a.mo9105c() == i10) {
                        Object key = eMo9104a.getKey();
                        if (key == null) {
                            m9101s();
                        } else if (this.f16075a.f16064e.m9015d(obj, key)) {
                            return eMo9104a;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public void mo9093e() {
        }

        /* JADX INFO: renamed from: h */
        public void mo9094h() {
        }

        /* JADX INFO: renamed from: j */
        public final void m9095j() {
            if ((this.f16080f.incrementAndGet() & 63) == 0) {
                m9098n();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k */
        public final Object m9096k(int i10, Object obj, Object obj2, boolean z10) {
            lock();
            try {
                m9098n();
                int i11 = this.f16076b + 1;
                if (i11 > this.f16078d) {
                    m9091c();
                    i11 = this.f16076b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f16079e;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                    Object key = interfaceC3158hMo9104a.getKey();
                    if (interfaceC3158hMo9104a.mo9105c() == i10 && key != null && this.f16075a.f16064e.m9015d(obj, key)) {
                        Object value = interfaceC3158hMo9104a.getValue();
                        if (value == null) {
                            this.f16077c++;
                            m9100r(interfaceC3158hMo9104a, obj2);
                            this.f16076b = this.f16076b;
                            unlock();
                            return null;
                        }
                        if (z10) {
                            unlock();
                            return value;
                        }
                        this.f16077c++;
                        m9100r(interfaceC3158hMo9104a, obj2);
                        unlock();
                        return value;
                    }
                }
                this.f16077c++;
                InterfaceC3158h interfaceC3158hMo9115f = this.f16075a.f16065f.mo9115f(mo9099q(), obj, i10, e10);
                m9100r(interfaceC3158hMo9115f, obj2);
                atomicReferenceArray.set(length, (E) interfaceC3158hMo9115f);
                this.f16076b = i11;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        /* JADX INFO: renamed from: l */
        public final E m9097l(E e10, E e11) {
            int i10 = this.f16076b;
            E e12 = (E) e11.mo9104a();
            while (e10 != e11) {
                InterfaceC3158h interfaceC3158hMo9111b = this.f16075a.f16065f.mo9111b(mo9099q(), e10, e12);
                if (interfaceC3158hMo9111b != null) {
                    e12 = (E) interfaceC3158hMo9111b;
                } else {
                    i10--;
                }
                e10 = (E) e10.mo9104a();
            }
            this.f16076b = i10;
            return e12;
        }

        /* JADX INFO: renamed from: n */
        public final void m9098n() {
            if (tryLock()) {
                try {
                    mo9094h();
                    this.f16080f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public abstract S mo9099q();

        /* JADX INFO: renamed from: r */
        public final void m9100r(E e10, V v10) {
            this.f16075a.f16065f.mo9114e(mo9099q(), e10, v10);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: s */
        public final void m9101s() {
            if (tryLock()) {
                try {
                    mo9094h();
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }
    }

    public static final class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        public SerializationProxy(Strength strength, Strength strength2, Equivalence equivalence, int i10, ConcurrentMap concurrentMap) {
            super(strength, strength2, equivalence, i10, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i10 = objectInputStream.readInt();
            C3197p c3197p = new C3197p();
            int i11 = c3197p.f16168b;
            boolean z10 = false;
            C8573r0.m16695R("initial capacity was already set to %s", i11, i11 == -1);
            C8573r0.m16681K(i10 >= 0);
            c3197p.f16168b = i10;
            Strength strength = c3197p.f16170d;
            C8573r0.m16693Q(strength, "Key strength was already set to %s", strength == null);
            Strength strength2 = this.f16069a;
            strength2.getClass();
            c3197p.f16170d = strength2;
            Strength strength3 = Strength.STRONG;
            if (strength2 != strength3) {
                c3197p.f16167a = true;
            }
            Strength strength4 = c3197p.f16171e;
            C8573r0.m16693Q(strength4, "Value strength was already set to %s", strength4 == null);
            Strength strength5 = this.f16070b;
            strength5.getClass();
            c3197p.f16171e = strength5;
            if (strength5 != strength3) {
                c3197p.f16167a = true;
            }
            Equivalence<Object> equivalence = c3197p.f16172f;
            C8573r0.m16693Q(equivalence, "key equivalence was already set to %s", equivalence == null);
            Equivalence<Object> equivalence2 = this.f16071c;
            equivalence2.getClass();
            c3197p.f16172f = equivalence2;
            c3197p.f16167a = true;
            int i12 = c3197p.f16169c;
            C8573r0.m16695R("concurrency level was already set to %s", i12, i12 == -1);
            int i13 = this.f16072d;
            if (i13 > 0) {
                z10 = true;
            }
            C8573r0.m16681K(z10);
            c3197p.f16169c = i13;
            this.f16073e = c3197p.m9137b();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f16073e.put((K) object, (V) objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f16073e;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f16073e.size());
            for (Map.Entry<K, V> entry : this.f16073e.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public enum Strength {
        STRONG { // from class: com.google.common.collect.MapMakerInternalMap.Strength.1
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.m9011c();
            }
        },
        WEAK { // from class: com.google.common.collect.MapMakerInternalMap.Strength.2
            @Override // com.google.common.collect.MapMakerInternalMap.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.m9012e();
            }
        };

        /* synthetic */ Strength(C3151a c3151a) {
            this();
        }

        public abstract Equivalence<Object> defaultEquivalence();
    }

    public static final class StrongKeyStrongValueSegment<K, V> extends Segment<K, V, C3163m<K, V>, StrongKeyStrongValueSegment<K, V>> {
        public StrongKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: q */
        public final Segment mo9099q() {
            return this;
        }
    }

    public static final class StrongKeyWeakValueSegment<K, V> extends Segment<K, V, C3164n<K, V>, StrongKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: h */
        public final ReferenceQueue<V> f16081h;

        public StrongKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f16081h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: e */
        public final void mo9093e() {
            while (this.f16081h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: h */
        public final void mo9094h() {
            m9090b(this.f16081h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: q */
        public final Segment mo9099q() {
            return this;
        }
    }

    public static final class WeakKeyStrongValueSegment<K, V> extends Segment<K, V, C3167q<K, V>, WeakKeyStrongValueSegment<K, V>> {

        /* JADX INFO: renamed from: h */
        public final ReferenceQueue<K> f16082h;

        public WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f16082h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: e */
        public final void mo9093e() {
            while (this.f16082h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: h */
        public final void mo9094h() {
            m9089a(this.f16082h);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: q */
        public final Segment mo9099q() {
            return this;
        }
    }

    public static final class WeakKeyWeakValueSegment<K, V> extends Segment<K, V, C3168r<K, V>, WeakKeyWeakValueSegment<K, V>> {

        /* JADX INFO: renamed from: h */
        public final ReferenceQueue<K> f16083h;

        /* JADX INFO: renamed from: i */
        public final ReferenceQueue<V> f16084i;

        public WeakKeyWeakValueSegment(MapMakerInternalMap mapMakerInternalMap, int i10) {
            super(mapMakerInternalMap, i10);
            this.f16083h = new ReferenceQueue<>();
            this.f16084i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: e */
        public final void mo9093e() {
            while (this.f16083h.poll() != null) {
            }
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: h */
        public final void mo9094h() {
            m9089a(this.f16083h);
            m9090b(this.f16084i);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.Segment
        /* JADX INFO: renamed from: q */
        public final Segment mo9099q() {
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$a */
    public class C3151a implements InterfaceC3170t<Object, Object, C3154d> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        /* JADX INFO: renamed from: a */
        public final InterfaceC3170t mo9102a(ReferenceQueue referenceQueue, InterfaceC3169s interfaceC3169s) {
            return this;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ InterfaceC3158h mo9103b() {
            return null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        public final void clear() {
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        public final Object get() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$b */
    public static abstract class AbstractC3152b<K, V, E extends InterfaceC3158h<K, V, E>> implements InterfaceC3158h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final K f16085a;

        /* JADX INFO: renamed from: b */
        public final int f16086b;

        /* JADX INFO: renamed from: c */
        @NullableDecl
        public final E f16087c;

        public AbstractC3152b(K k10, int i10, @NullableDecl E e10) {
            this.f16085a = k10;
            this.f16086b = i10;
            this.f16087c = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: a */
        public final E mo9104a() {
            return this.f16087c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: c */
        public final int mo9105c() {
            return this.f16086b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final K getKey() {
            return this.f16085a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$c */
    public static abstract class AbstractC3153c<K, V, E extends InterfaceC3158h<K, V, E>> extends WeakReference<K> implements InterfaceC3158h<K, V, E> {

        /* JADX INFO: renamed from: a */
        public final int f16088a;

        /* JADX INFO: renamed from: b */
        @NullableDecl
        public final E f16089b;

        public AbstractC3153c(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl E e10) {
            super(k10, referenceQueue);
            this.f16088a = i10;
            this.f16089b = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: a */
        public final E mo9104a() {
            return this.f16089b;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: c */
        public final int mo9105c() {
            return this.f16088a;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final K getKey() {
            return get();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$d */
    public static final class C3154d implements InterfaceC3158h<Object, Object, C3154d> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public C3154d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: a */
        public final InterfaceC3158h mo9104a() {
            throw new AssertionError();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        /* JADX INFO: renamed from: c */
        public final int mo9105c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final Object getKey() {
            throw new AssertionError();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$e */
    public final class C3155e extends MapMakerInternalMap<K, V, E, S>.AbstractC3157g<Map.Entry<K, V>> {
        public C3155e(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return m9108c();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$f */
    public final class C3156f extends AbstractC3162l<Map.Entry<K, V>> {
        public C3156f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            boolean z10 = false;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null) {
                MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
                Object obj2 = mapMakerInternalMap.get(key);
                if (obj2 != null && mapMakerInternalMap.f16065f.mo9113d().defaultEquivalence().m9015d(entry.getValue(), obj2)) {
                    z10 = true;
                }
                return z10;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C3155e(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            boolean z10 = false;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (key != null && MapMakerInternalMap.this.remove(key, entry.getValue())) {
                z10 = true;
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$g */
    public abstract class AbstractC3157g<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f16091a;

        /* JADX INFO: renamed from: b */
        public int f16092b = -1;

        /* JADX INFO: renamed from: c */
        @NullableDecl
        public Segment<K, V, E, S> f16093c;

        /* JADX INFO: renamed from: d */
        @NullableDecl
        public AtomicReferenceArray<E> f16094d;

        /* JADX INFO: renamed from: e */
        @NullableDecl
        public E f16095e;

        /* JADX INFO: renamed from: f */
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.C3172v f16096f;

        /* JADX INFO: renamed from: g */
        @NullableDecl
        public MapMakerInternalMap<K, V, E, S>.C3172v f16097g;

        public AbstractC3157g() {
            this.f16091a = MapMakerInternalMap.this.f16062c.length - 1;
            m9106a();
        }

        /* JADX INFO: renamed from: a */
        public final void m9106a() {
            boolean z10;
            this.f16096f = null;
            E e10 = this.f16095e;
            if (e10 == null) {
                z10 = false;
                break;
            }
            while (true) {
                E e11 = (E) e10.mo9104a();
                this.f16095e = e11;
                if (e11 == null) {
                    z10 = false;
                    break;
                } else {
                    if (m9107b(e11)) {
                        z10 = true;
                        break;
                    }
                    e10 = this.f16095e;
                }
            }
            if (!z10 && !m9109d()) {
                while (true) {
                    int i10 = this.f16091a;
                    if (i10 < 0) {
                        break;
                    }
                    Segment<K, V, E, S>[] segmentArr = MapMakerInternalMap.this.f16062c;
                    this.f16091a = i10 - 1;
                    Segment<K, V, E, S> segment = segmentArr[i10];
                    this.f16093c = segment;
                    if (segment.f16076b != 0) {
                        AtomicReferenceArray<E> atomicReferenceArray = this.f16093c.f16079e;
                        this.f16094d = atomicReferenceArray;
                        this.f16092b = atomicReferenceArray.length() - 1;
                        if (m9109d()) {
                            break;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final boolean m9107b(E e10) {
            MapMakerInternalMap mapMakerInternalMap = MapMakerInternalMap.this;
            try {
                Object key = e10.getKey();
                mapMakerInternalMap.getClass();
                Object value = e10.getKey() == null ? null : e10.getValue();
                if (value == null) {
                    this.f16093c.m9095j();
                    return false;
                }
                this.f16096f = new C3172v(key, value);
                this.f16093c.m9095j();
                return true;
            } catch (Throwable th2) {
                this.f16093c.m9095j();
                throw th2;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final MapMakerInternalMap<K, V, E, S>.C3172v m9108c() {
            MapMakerInternalMap<K, V, E, S>.C3172v c3172v = this.f16096f;
            if (c3172v == null) {
                throw new NoSuchElementException();
            }
            this.f16097g = c3172v;
            m9106a();
            return this.f16097g;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m9109d() {
            while (true) {
                int i10 = this.f16092b;
                boolean z10 = false;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f16094d;
                this.f16092b = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.f16095e = e10;
                if (e10 != null) {
                    if (!m9107b(e10)) {
                        E e11 = this.f16095e;
                        if (e11 != null) {
                            while (true) {
                                E e12 = (E) e11.mo9104a();
                                this.f16095e = e12;
                                if (e12 == null) {
                                    break;
                                }
                                if (m9107b(e12)) {
                                    z10 = true;
                                    break;
                                }
                                e11 = this.f16095e;
                            }
                        }
                        if (z10) {
                        }
                    }
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16096f != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C8573r0.m16697S("no calls to next() since the last call to remove()", this.f16097g != null);
            MapMakerInternalMap.this.remove(this.f16097g.f16110a);
            this.f16097g = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$h */
    public interface InterfaceC3158h<K, V, E extends InterfaceC3158h<K, V, E>> {
        /* JADX INFO: renamed from: a */
        E mo9104a();

        /* JADX INFO: renamed from: c */
        int mo9105c();

        K getKey();

        V getValue();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$i */
    public interface InterfaceC3159i<K, V, E extends InterfaceC3158h<K, V, E>, S extends Segment<K, V, E, S>> {
        /* JADX INFO: renamed from: a */
        Segment mo9110a(MapMakerInternalMap mapMakerInternalMap, int i10);

        /* JADX INFO: renamed from: b */
        E mo9111b(S s10, E e10, @NullableDecl E e11);

        /* JADX INFO: renamed from: c */
        Strength mo9112c();

        /* JADX INFO: renamed from: d */
        Strength mo9113d();

        /* JADX INFO: renamed from: e */
        void mo9114e(S s10, E e10, V v10);

        /* JADX INFO: renamed from: f */
        E mo9115f(S s10, K k10, int i10, @NullableDecl E e10);
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$j */
    public final class C3160j extends MapMakerInternalMap<K, V, E, S>.AbstractC3157g<K> {
        public C3160j(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public final K next() {
            return m9108c().f16110a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$k */
    public final class C3161k extends AbstractC3162l<K> {
        public C3161k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new C3160j(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return MapMakerInternalMap.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return MapMakerInternalMap.this.size();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$l */
    public static abstract class AbstractC3162l<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return MapMakerInternalMap.m9084a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m9084a(this).toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$m */
    public static final class C3163m<K, V> extends AbstractC3152b<K, V, C3163m<K, V>> {

        /* JADX INFO: renamed from: d */
        @NullableDecl
        public volatile V f16100d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$m$a */
        public static final class a<K, V> implements InterfaceC3159i<K, V, C3163m<K, V>, StrongKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f16101a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: a */
            public final Segment mo9110a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new StrongKeyStrongValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: b */
            public final InterfaceC3158h mo9111b(Segment segment, InterfaceC3158h interfaceC3158h, @NullableDecl InterfaceC3158h interfaceC3158h2) {
                C3163m c3163m = (C3163m) interfaceC3158h;
                C3163m c3163m2 = new C3163m(c3163m.f16085a, c3163m.f16086b, (C3163m) interfaceC3158h2);
                c3163m2.f16100d = c3163m.f16100d;
                return c3163m2;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: c */
            public final Strength mo9112c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: d */
            public final Strength mo9113d() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: e */
            public final void mo9114e(Segment segment, InterfaceC3158h interfaceC3158h, Object obj) {
                ((C3163m) interfaceC3158h).f16100d = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: f */
            public final InterfaceC3158h mo9115f(Segment segment, Object obj, int i10, @NullableDecl InterfaceC3158h interfaceC3158h) {
                return new C3163m(obj, i10, (C3163m) interfaceC3158h);
            }
        }

        public C3163m(K k10, int i10, @NullableDecl C3163m<K, V> c3163m) {
            super(k10, i10, c3163m);
            this.f16100d = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        @NullableDecl
        public final V getValue() {
            return this.f16100d;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n */
    public static final class C3164n<K, V> extends AbstractC3152b<K, V, C3164n<K, V>> implements InterfaceC3169s<K, V, C3164n<K, V>> {

        /* JADX INFO: renamed from: d */
        public volatile InterfaceC3170t<K, V, C3164n<K, V>> f16102d;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$n$a */
        public static final class a<K, V> implements InterfaceC3159i<K, V, C3164n<K, V>, StrongKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f16103a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: a */
            public final Segment mo9110a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new StrongKeyWeakValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: b */
            public final InterfaceC3158h mo9111b(Segment segment, InterfaceC3158h interfaceC3158h, @NullableDecl InterfaceC3158h interfaceC3158h2) {
                StrongKeyWeakValueSegment strongKeyWeakValueSegment = (StrongKeyWeakValueSegment) segment;
                C3164n c3164n = (C3164n) interfaceC3158h;
                C3164n c3164n2 = (C3164n) interfaceC3158h2;
                int i10 = Segment.f16074g;
                if (c3164n.getValue() == null) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = strongKeyWeakValueSegment.f16081h;
                C3164n c3164n3 = new C3164n(c3164n.f16085a, c3164n.f16086b, c3164n2);
                c3164n3.f16102d = c3164n.f16102d.mo9102a(referenceQueue, c3164n3);
                return c3164n3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: c */
            public final Strength mo9112c() {
                return Strength.STRONG;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: d */
            public final Strength mo9113d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: e */
            public final void mo9114e(Segment segment, InterfaceC3158h interfaceC3158h, Object obj) {
                C3164n c3164n = (C3164n) interfaceC3158h;
                ReferenceQueue<V> referenceQueue = ((StrongKeyWeakValueSegment) segment).f16081h;
                InterfaceC3170t<K, V, C3164n<K, V>> interfaceC3170t = c3164n.f16102d;
                c3164n.f16102d = new C3171u(referenceQueue, obj, c3164n);
                interfaceC3170t.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: f */
            public final InterfaceC3158h mo9115f(Segment segment, Object obj, int i10, @NullableDecl InterfaceC3158h interfaceC3158h) {
                return new C3164n(obj, i10, (C3164n) interfaceC3158h);
            }
        }

        public C3164n(K k10, int i10, @NullableDecl C3164n<K, V> c3164n) {
            super(k10, i10, c3164n);
            this.f16102d = MapMakerInternalMap.f16059j;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3169s
        /* JADX INFO: renamed from: b */
        public final InterfaceC3170t<K, V, C3164n<K, V>> mo9116b() {
            return this.f16102d;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final V getValue() {
            return this.f16102d.get();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$o */
    public final class C3165o extends MapMakerInternalMap<K, V, E, S>.AbstractC3157g<V> {
        public C3165o(MapMakerInternalMap mapMakerInternalMap) {
            super();
        }

        @Override // java.util.Iterator
        public final V next() {
            return m9108c().f16111b;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$p */
    public final class C3166p extends AbstractCollection<V> {
        public C3166p() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            MapMakerInternalMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return MapMakerInternalMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return MapMakerInternalMap.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new C3165o(MapMakerInternalMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return MapMakerInternalMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return MapMakerInternalMap.m9084a(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) MapMakerInternalMap.m9084a(this).toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$q */
    public static final class C3167q<K, V> extends AbstractC3153c<K, V, C3167q<K, V>> {

        /* JADX INFO: renamed from: c */
        @NullableDecl
        public volatile V f16105c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$q$a */
        public static final class a<K, V> implements InterfaceC3159i<K, V, C3167q<K, V>, WeakKeyStrongValueSegment<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f16106a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: a */
            public final Segment mo9110a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new WeakKeyStrongValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: b */
            public final InterfaceC3158h mo9111b(Segment segment, InterfaceC3158h interfaceC3158h, @NullableDecl InterfaceC3158h interfaceC3158h2) {
                WeakKeyStrongValueSegment weakKeyStrongValueSegment = (WeakKeyStrongValueSegment) segment;
                C3167q c3167q = (C3167q) interfaceC3158h;
                C3167q c3167q2 = (C3167q) interfaceC3158h2;
                if (c3167q.get() == null) {
                    return null;
                }
                C3167q c3167q3 = new C3167q(weakKeyStrongValueSegment.f16082h, c3167q.get(), c3167q.f16088a, c3167q2);
                c3167q3.f16105c = c3167q.f16105c;
                return c3167q3;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: c */
            public final Strength mo9112c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: d */
            public final Strength mo9113d() {
                return Strength.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: e */
            public final void mo9114e(Segment segment, InterfaceC3158h interfaceC3158h, Object obj) {
                ((C3167q) interfaceC3158h).f16105c = obj;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: f */
            public final InterfaceC3158h mo9115f(Segment segment, Object obj, int i10, @NullableDecl InterfaceC3158h interfaceC3158h) {
                return new C3167q(((WeakKeyStrongValueSegment) segment).f16082h, obj, i10, (C3167q) interfaceC3158h);
            }
        }

        public C3167q(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl C3167q<K, V> c3167q) {
            super(referenceQueue, k10, i10, c3167q);
            this.f16105c = null;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        @NullableDecl
        public final V getValue() {
            return this.f16105c;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r */
    public static final class C3168r<K, V> extends AbstractC3153c<K, V, C3168r<K, V>> implements InterfaceC3169s<K, V, C3168r<K, V>> {

        /* JADX INFO: renamed from: c */
        public volatile InterfaceC3170t<K, V, C3168r<K, V>> f16107c;

        /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$r$a */
        public static final class a<K, V> implements InterfaceC3159i<K, V, C3168r<K, V>, WeakKeyWeakValueSegment<K, V>> {

            /* JADX INFO: renamed from: a */
            public static final a<?, ?> f16108a = new a<>();

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: a */
            public final Segment mo9110a(MapMakerInternalMap mapMakerInternalMap, int i10) {
                return new WeakKeyWeakValueSegment(mapMakerInternalMap, i10);
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: b */
            public final InterfaceC3158h mo9111b(Segment segment, InterfaceC3158h interfaceC3158h, @NullableDecl InterfaceC3158h interfaceC3158h2) {
                WeakKeyWeakValueSegment weakKeyWeakValueSegment = (WeakKeyWeakValueSegment) segment;
                C3168r c3168r = (C3168r) interfaceC3158h;
                C3168r c3168r2 = (C3168r) interfaceC3158h2;
                if (c3168r.get() != null) {
                    int i10 = Segment.f16074g;
                    if (!(c3168r.getValue() == null)) {
                        ReferenceQueue<K> referenceQueue = weakKeyWeakValueSegment.f16083h;
                        ReferenceQueue<V> referenceQueue2 = weakKeyWeakValueSegment.f16084i;
                        C3168r c3168r3 = new C3168r(referenceQueue, c3168r.get(), c3168r.f16088a, c3168r2);
                        c3168r3.f16107c = c3168r.f16107c.mo9102a(referenceQueue2, c3168r3);
                        return c3168r3;
                    }
                }
                return null;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: c */
            public final Strength mo9112c() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: d */
            public final Strength mo9113d() {
                return Strength.WEAK;
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: e */
            public final void mo9114e(Segment segment, InterfaceC3158h interfaceC3158h, Object obj) {
                C3168r c3168r = (C3168r) interfaceC3158h;
                ReferenceQueue<V> referenceQueue = ((WeakKeyWeakValueSegment) segment).f16084i;
                InterfaceC3170t<K, V, C3168r<K, V>> interfaceC3170t = c3168r.f16107c;
                c3168r.f16107c = new C3171u(referenceQueue, obj, c3168r);
                interfaceC3170t.clear();
            }

            @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3159i
            /* JADX INFO: renamed from: f */
            public final InterfaceC3158h mo9115f(Segment segment, Object obj, int i10, @NullableDecl InterfaceC3158h interfaceC3158h) {
                return new C3168r(((WeakKeyWeakValueSegment) segment).f16083h, obj, i10, (C3168r) interfaceC3158h);
            }
        }

        public C3168r(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl C3168r<K, V> c3168r) {
            super(referenceQueue, k10, i10, c3168r);
            this.f16107c = MapMakerInternalMap.f16059j;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3169s
        /* JADX INFO: renamed from: b */
        public final InterfaceC3170t<K, V, C3168r<K, V>> mo9116b() {
            return this.f16107c;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3158h
        public final V getValue() {
            return this.f16107c.get();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$s */
    public interface InterfaceC3169s<K, V, E extends InterfaceC3158h<K, V, E>> extends InterfaceC3158h<K, V, E> {
        /* JADX INFO: renamed from: b */
        InterfaceC3170t<K, V, E> mo9116b();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$t */
    public interface InterfaceC3170t<K, V, E extends InterfaceC3158h<K, V, E>> {
        /* JADX INFO: renamed from: a */
        InterfaceC3170t mo9102a(ReferenceQueue referenceQueue, InterfaceC3169s interfaceC3169s);

        /* JADX INFO: renamed from: b */
        E mo9103b();

        void clear();

        @NullableDecl
        V get();
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$u */
    public static final class C3171u<K, V, E extends InterfaceC3158h<K, V, E>> extends WeakReference<V> implements InterfaceC3170t<K, V, E> {

        /* JADX INFO: renamed from: a */
        @Weak
        public final E f16109a;

        public C3171u(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f16109a = e10;
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        /* JADX INFO: renamed from: a */
        public final InterfaceC3170t mo9102a(ReferenceQueue referenceQueue, InterfaceC3169s interfaceC3169s) {
            return new C3171u(referenceQueue, get(), interfaceC3169s);
        }

        @Override // com.google.common.collect.MapMakerInternalMap.InterfaceC3170t
        /* JADX INFO: renamed from: b */
        public final E mo9103b() {
            return this.f16109a;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MapMakerInternalMap$v */
    public final class C3172v extends AbstractC3180c<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f16110a;

        /* JADX INFO: renamed from: b */
        public V f16111b;

        public C3172v(K k10, V v10) {
            this.f16110a = k10;
            this.f16111b = v10;
        }

        @Override // com.google.common.collect.AbstractC3180c, java.util.Map.Entry
        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f16110a.equals(entry.getKey()) && this.f16111b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f16110a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f16111b;
        }

        @Override // com.google.common.collect.AbstractC3180c, java.util.Map.Entry
        public final int hashCode() {
            return this.f16110a.hashCode() ^ this.f16111b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = (V) MapMakerInternalMap.this.put(this.f16110a, v10);
            this.f16111b = v10;
            return v11;
        }
    }

    public MapMakerInternalMap(C3197p c3197p, InterfaceC3159i<K, V, E, S> interfaceC3159i) {
        int i10 = c3197p.f16169c;
        this.f16063d = Math.min(i10 == -1 ? 4 : i10, 65536);
        this.f16064e = (Equivalence) C10172d.m19190a(c3197p.f16172f, c3197p.m9136a().defaultEquivalence());
        this.f16065f = interfaceC3159i;
        int i11 = c3197p.f16168b;
        int iMin = Math.min(i11 == -1 ? 16 : i11, 1073741824);
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        int i15 = 0;
        while (i14 < this.f16063d) {
            i15++;
            i14 <<= 1;
        }
        this.f16061b = 32 - i15;
        this.f16060a = i14 - 1;
        this.f16062c = new Segment[i14];
        int i16 = iMin / i14;
        while (i12 < (i14 * i16 < iMin ? i16 + 1 : i16)) {
            i12 <<= 1;
        }
        while (true) {
            Segment<K, V, E, S>[] segmentArr = this.f16062c;
            if (i13 >= segmentArr.length) {
                return;
            }
            segmentArr[i13] = this.f16065f.mo9110a(this, i12);
            i13++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m9084a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final int m9085b(Object obj) {
        int iMo9014b;
        Equivalence<Object> equivalence = this.f16064e;
        if (obj == null) {
            equivalence.getClass();
            iMo9014b = 0;
        } else {
            iMo9014b = equivalence.mo9014b(obj);
        }
        int i10 = iMo9014b + ((iMo9014b << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    /* JADX INFO: renamed from: c */
    public final Segment<K, V, E, S> m9086c(int i10) {
        return this.f16062c[(i10 >>> this.f16061b) & this.f16060a];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Segment<K, V, E, S> segment : this.f16062c) {
            if (segment.f16076b != 0) {
                segment.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = segment.f16079e;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    segment.mo9093e();
                    segment.f16080f.set(0);
                    segment.f16077c++;
                    segment.f16076b = 0;
                    segment.unlock();
                } catch (Throwable th2) {
                    segment.unlock();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        InterfaceC3158h interfaceC3158hM9092d;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int iM9085b = m9085b(obj);
        Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
        segmentM9086c.getClass();
        try {
            if (segmentM9086c.f16076b != 0 && (interfaceC3158hM9092d = segmentM9086c.m9092d(iM9085b, obj)) != null && interfaceC3158hM9092d.getValue() != null) {
                z10 = true;
            }
            segmentM9086c.m9095j();
            return z10;
        } catch (Throwable th2) {
            segmentM9086c.m9095j();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Object value;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        Segment<K, V, E, S>[] segmentArr = this.f16062c;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            int length = segmentArr.length;
            long j11 = 0;
            for (?? r10 = z10; r10 < length; r10++) {
                Segment<K, V, E, S> segment = segmentArr[r10];
                int i11 = segment.f16076b;
                AtomicReferenceArray<E> atomicReferenceArray = segment.f16079e;
                for (?? r13 = z10; r13 < atomicReferenceArray.length(); r13++) {
                    for (E eMo9104a = atomicReferenceArray.get(r13); eMo9104a != null; eMo9104a = eMo9104a.mo9104a()) {
                        if (eMo9104a.getKey() == null || (value = eMo9104a.getValue()) == null) {
                            segment.m9101s();
                            value = null;
                        }
                        if (value != null && this.f16065f.mo9113d().defaultEquivalence().m9015d(obj, value)) {
                            return true;
                        }
                    }
                }
                j11 += (long) segment.f16077c;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C3156f c3156f = this.f16068i;
        if (c3156f != null) {
            return c3156f;
        }
        C3156f c3156f2 = new C3156f();
        this.f16068i = c3156f2;
        return c3156f2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        V v10 = null;
        if (obj == null) {
            return null;
        }
        int iM9085b = m9085b(obj);
        Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
        segmentM9086c.getClass();
        try {
            InterfaceC3158h interfaceC3158hM9092d = segmentM9086c.m9092d(iM9085b, obj);
            if (interfaceC3158hM9092d != null && (v10 = (V) interfaceC3158hM9092d.getValue()) == null) {
                segmentM9086c.m9101s();
            }
            segmentM9086c.m9095j();
            return v10;
        } catch (Throwable th2) {
            segmentM9086c.m9095j();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Segment<K, V, E, S>[] segmentArr = this.f16062c;
        long j10 = 0;
        for (int i10 = 0; i10 < segmentArr.length; i10++) {
            if (segmentArr[i10].f16076b != 0) {
                return false;
            }
            j10 += (long) segmentArr[i10].f16077c;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < segmentArr.length; i11++) {
            if (segmentArr[i11].f16076b != 0) {
                return false;
            }
            j10 -= (long) segmentArr[i11].f16077c;
        }
        return j10 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C3161k c3161k = this.f16066g;
        if (c3161k != null) {
            return c3161k;
        }
        C3161k c3161k2 = new C3161k();
        this.f16066g = c3161k2;
        return c3161k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iM9085b = m9085b(k10);
        return (V) m9086c(iM9085b).m9096k(iM9085b, k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iM9085b = m9085b(k10);
        return (V) m9086c(iM9085b).m9096k(iM9085b, k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iM9085b = m9085b(obj);
        Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
        segmentM9086c.lock();
        try {
            segmentM9086c.m9098n();
            AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
            int length = (atomicReferenceArray.length() - 1) & iM9085b;
            E e10 = atomicReferenceArray.get(length);
            for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                Object key = interfaceC3158hMo9104a.getKey();
                if (interfaceC3158hMo9104a.mo9105c() == iM9085b && key != null && segmentM9086c.f16075a.f16064e.m9015d(obj, key)) {
                    V v10 = (V) interfaceC3158hMo9104a.getValue();
                    if (v10 == null) {
                        if (!(interfaceC3158hMo9104a.getValue() == null)) {
                            break;
                        }
                    }
                    segmentM9086c.f16077c++;
                    InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                    int i10 = segmentM9086c.f16076b - 1;
                    atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                    segmentM9086c.f16076b = i10;
                    segmentM9086c.unlock();
                    return v10;
                }
            }
            segmentM9086c.unlock();
            return null;
        } catch (Throwable th2) {
            segmentM9086c.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        boolean z10 = false;
        if (obj != null && obj2 != null) {
            int iM9085b = m9085b(obj);
            Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
            segmentM9086c.lock();
            try {
                segmentM9086c.m9098n();
                AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
                int length = (atomicReferenceArray.length() - 1) & iM9085b;
                E e10 = atomicReferenceArray.get(length);
                for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                    Object key = interfaceC3158hMo9104a.getKey();
                    if (interfaceC3158hMo9104a.mo9105c() == iM9085b && key != null && segmentM9086c.f16075a.f16064e.m9015d(obj, key)) {
                        if (!segmentM9086c.f16075a.f16065f.mo9113d().defaultEquivalence().m9015d(obj2, interfaceC3158hMo9104a.getValue())) {
                            if (interfaceC3158hMo9104a.getValue() == null) {
                            }
                            segmentM9086c.unlock();
                            return z10;
                        }
                        z10 = true;
                        segmentM9086c.f16077c++;
                        InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                        int i10 = segmentM9086c.f16076b - 1;
                        atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                        segmentM9086c.f16076b = i10;
                        segmentM9086c.unlock();
                        return z10;
                    }
                }
                segmentM9086c.unlock();
                return z10;
            } catch (Throwable th2) {
                segmentM9086c.unlock();
                throw th2;
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k10, V v10) {
        k10.getClass();
        v10.getClass();
        int iM9085b = m9085b(k10);
        Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
        segmentM9086c.lock();
        try {
            segmentM9086c.m9098n();
            AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
            int length = (atomicReferenceArray.length() - 1) & iM9085b;
            E e10 = atomicReferenceArray.get(length);
            for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                Object key = interfaceC3158hMo9104a.getKey();
                if (interfaceC3158hMo9104a.mo9105c() == iM9085b && key != null && segmentM9086c.f16075a.f16064e.m9015d(k10, key)) {
                    V v11 = (V) interfaceC3158hMo9104a.getValue();
                    if (v11 != null) {
                        segmentM9086c.f16077c++;
                        segmentM9086c.m9100r(interfaceC3158hMo9104a, v10);
                        segmentM9086c.unlock();
                        return v11;
                    }
                    if (interfaceC3158hMo9104a.getValue() == null) {
                        segmentM9086c.f16077c++;
                        InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                        int i10 = segmentM9086c.f16076b - 1;
                        atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                        segmentM9086c.f16076b = i10;
                    }
                    segmentM9086c.unlock();
                    return null;
                }
            }
            segmentM9086c.unlock();
            return null;
        } catch (Throwable th2) {
            segmentM9086c.unlock();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k10, @NullableDecl V v10, V v11) {
        k10.getClass();
        v11.getClass();
        if (v10 == null) {
            return false;
        }
        int iM9085b = m9085b(k10);
        Segment<K, V, E, S> segmentM9086c = m9086c(iM9085b);
        segmentM9086c.lock();
        try {
            segmentM9086c.m9098n();
            AtomicReferenceArray<E> atomicReferenceArray = segmentM9086c.f16079e;
            int length = (atomicReferenceArray.length() - 1) & iM9085b;
            E e10 = atomicReferenceArray.get(length);
            for (InterfaceC3158h interfaceC3158hMo9104a = e10; interfaceC3158hMo9104a != null; interfaceC3158hMo9104a = interfaceC3158hMo9104a.mo9104a()) {
                Object key = interfaceC3158hMo9104a.getKey();
                if (interfaceC3158hMo9104a.mo9105c() == iM9085b && key != null && segmentM9086c.f16075a.f16064e.m9015d(k10, key)) {
                    Object value = interfaceC3158hMo9104a.getValue();
                    if (value != null) {
                        if (!segmentM9086c.f16075a.f16065f.mo9113d().defaultEquivalence().m9015d(v10, value)) {
                            break;
                        }
                        segmentM9086c.f16077c++;
                        segmentM9086c.m9100r(interfaceC3158hMo9104a, v11);
                        segmentM9086c.unlock();
                        return true;
                    }
                    if (!(interfaceC3158hMo9104a.getValue() == null)) {
                        break;
                    }
                    segmentM9086c.f16077c++;
                    InterfaceC3158h interfaceC3158hM9097l = segmentM9086c.m9097l(e10, interfaceC3158hMo9104a);
                    int i10 = segmentM9086c.f16076b - 1;
                    atomicReferenceArray.set(length, (E) interfaceC3158hM9097l);
                    segmentM9086c.f16076b = i10;
                    break;
                }
            }
            segmentM9086c.unlock();
            return false;
        } catch (Throwable th2) {
            segmentM9086c.unlock();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j10 = 0;
        for (Segment<K, V, E, S> segment : this.f16062c) {
            j10 += (long) segment.f16076b;
        }
        return Ints.m9144n0(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        C3166p c3166p = this.f16067h;
        if (c3166p != null) {
            return c3166p;
        }
        C3166p c3166p2 = new C3166p();
        this.f16067h = c3166p2;
        return c3166p2;
    }

    public Object writeReplace() {
        InterfaceC3159i<K, V, E, S> interfaceC3159i = this.f16065f;
        Strength strengthMo9112c = interfaceC3159i.mo9112c();
        Strength strengthMo9113d = interfaceC3159i.mo9113d();
        Equivalence<Object> equivalence = this.f16064e;
        interfaceC3159i.mo9113d().defaultEquivalence();
        return new SerializationProxy(strengthMo9112c, strengthMo9113d, equivalence, this.f16063d, this);
    }
}
