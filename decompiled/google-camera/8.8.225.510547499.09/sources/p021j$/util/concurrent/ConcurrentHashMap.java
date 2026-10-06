package p021j$.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p021j$.sun.misc.C0414a;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0522c;
import p021j$.util.Spliterator;
import p021j$.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC0543u {

    /* JADX INFO: renamed from: g */
    static final int f33176g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h */
    private static final C0414a f33177h;

    /* JADX INFO: renamed from: i */
    private static final long f33178i;

    /* JADX INFO: renamed from: j */
    private static final long f33179j;

    /* JADX INFO: renamed from: k */
    private static final long f33180k;

    /* JADX INFO: renamed from: l */
    private static final long f33181l;

    /* JADX INFO: renamed from: m */
    private static final long f33182m;

    /* JADX INFO: renamed from: n */
    private static final int f33183n;

    /* JADX INFO: renamed from: o */
    private static final int f33184o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* JADX INFO: renamed from: a */
    volatile transient C0533k[] f33185a;

    /* JADX INFO: renamed from: b */
    private volatile transient C0533k[] f33186b;
    private volatile transient long baseCount;

    /* JADX INFO: renamed from: c */
    private volatile transient C0525c[] f33187c;
    private volatile transient int cellsBusy;

    /* JADX INFO: renamed from: d */
    private transient KeySetView f33188d;

    /* JADX INFO: renamed from: e */
    private transient C0541s f33189e;

    /* JADX INFO: renamed from: f */
    private transient C0527e f33190f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    public static class KeySetView<K, V> extends AbstractC0524b implements Set<K>, InterfaceC0522c {

        /* JADX INFO: renamed from: b */
        private final Object f33191b;

        KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f33191b = bool;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Object obj2 = this.f33191b;
            if (obj2 != null) {
                return this.f33201a.m12554g(obj, obj2, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            Object obj = this.f33191b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.f33201a.m12554g(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f33201a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            C0533k[] c0533kArr = this.f33201a.f33185a;
            if (c0533kArr == null) {
                return;
            }
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    return;
                } else {
                    consumer.accept(c0533kM12566a.f33212b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Iterator it = iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += it.next().hashCode();
            }
            return iHashCode;
        }

        @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f33201a;
            C0533k[] c0533kArr = concurrentHashMap.f33185a;
            int length = c0533kArr == null ? 0 : c0533kArr.length;
            return new C0530h(c0533kArr, length, length, concurrentHashMap, 0);
        }

        @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f33201a.remove(obj) != null;
        }

        @Override // java.util.Collection, p021j$.util.InterfaceC0522c
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return AbstractC0521b.m12530d(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p021j$.lang.InterfaceC0305a
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f33201a;
            long jM12556k = concurrentHashMap.m12556k();
            C0533k[] c0533kArr = concurrentHashMap.f33185a;
            int length = c0533kArr == null ? 0 : c0533kArr.length;
            return new C0531i(c0533kArr, length, 0, length, jM12556k >= 0 ? jM12556k : 0L, 0);
        }

        @Override // java.util.Collection, p021j$.util.InterfaceC0522c
        public final /* synthetic */ Stream stream() {
            return AbstractC0521b.m12535i(this);
        }

        @Override // java.util.Collection
        public final Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C0536n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C0414a c0414aM12221h = C0414a.m12221h();
        f33177h = c0414aM12221h;
        f33178i = c0414aM12221h.m12230j(ConcurrentHashMap.class, "sizeCtl");
        f33179j = c0414aM12221h.m12230j(ConcurrentHashMap.class, "transferIndex");
        f33180k = c0414aM12221h.m12230j(ConcurrentHashMap.class, "baseCount");
        f33181l = c0414aM12221h.m12230j(ConcurrentHashMap.class, "cellsBusy");
        f33182m = c0414aM12221h.m12230j(C0525c.class, "value");
        f33183n = c0414aM12221h.m12223a(C0533k[].class);
        int iM12224b = c0414aM12221h.m12224b(C0533k[].class);
        if (((iM12224b - 1) & iM12224b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f33184o = 31 - Integer.numberOfLeadingZeros(iM12224b);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        double d = (i < i2 ? i2 : i) / f;
        Double.isNaN(d);
        long j = (long) (d + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : m12548m((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #1 {all -> 0x014c, blocks: (B:94:0x0139, B:96:0x013d), top: B:125:0x0139 }] */
    /* JADX INFO: renamed from: a */
    private final void m12540a(long j, int i) {
        boolean zM12226d;
        int iM12558b;
        boolean z;
        C0525c[] c0525cArr;
        C0414a c0414a;
        long j2;
        long j3;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        int length3;
        C0525c c0525c;
        long jM12556k;
        C0533k[] c0533kArr;
        int length4;
        C0533k[] c0533kArr2;
        C0525c[] c0525cArr2 = this.f33187c;
        if (c0525cArr2 == null) {
            C0414a c0414a2 = f33177h;
            long j4 = f33180k;
            long j5 = this.baseCount;
            jM12556k = j5 + j;
            if (!c0414a2.m12226d(this, j4, j5, jM12556k)) {
                if (c0525cArr2 != null || (length3 = c0525cArr2.length - 1) < 0 || (c0525c = c0525cArr2[length3 & ThreadLocalRandom.m12558b()]) == null) {
                    zM12226d = true;
                } else {
                    C0414a c0414a3 = f33177h;
                    long j6 = f33182m;
                    long j7 = c0525c.value;
                    zM12226d = c0414a3.m12226d(c0525c, j6, j7, j7 + j);
                    if (zM12226d) {
                        if (i <= 1) {
                            return;
                        } else {
                            jM12556k = m12556k();
                        }
                    }
                }
                iM12558b = ThreadLocalRandom.m12558b();
                if (iM12558b == 0) {
                    ThreadLocalRandom.m12559c();
                    iM12558b = ThreadLocalRandom.m12558b();
                    zM12226d = true;
                }
                while (true) {
                    z = zM12226d;
                    boolean z4 = false;
                    while (true) {
                        c0525cArr = this.f33187c;
                        if (c0525cArr == null && (length = c0525cArr.length) > 0) {
                            C0525c c0525c2 = c0525cArr[(length - 1) & iM12558b];
                            if (c0525c2 != null) {
                                if (z) {
                                    C0414a c0414a4 = f33177h;
                                    long j8 = f33182m;
                                    long j9 = c0525c2.value;
                                    if (!c0414a4.m12226d(c0525c2, j8, j9, j9 + j)) {
                                        if (this.f33187c == c0525cArr && length < f33176g) {
                                            if (!z4) {
                                                z4 = true;
                                            } else if (this.cellsBusy == 0 && c0414a4.m12225c(this, f33181l, 0, 1)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z = true;
                                }
                                iM12558b = ThreadLocalRandom.m12557a(iM12558b);
                            } else if (this.cellsBusy == 0) {
                                C0525c c0525c3 = new C0525c(j);
                                if (this.cellsBusy == 0 && f33177h.m12225c(this, f33181l, 0, 1)) {
                                    try {
                                        C0525c[] c0525cArr3 = this.f33187c;
                                        if (c0525cArr3 == null || (length2 = c0525cArr3.length) <= 0) {
                                            z3 = false;
                                        } else {
                                            int i2 = (length2 - 1) & iM12558b;
                                            if (c0525cArr3[i2] == null) {
                                                c0525cArr3[i2] = c0525c3;
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        }
                                        this.cellsBusy = 0;
                                        if (z3) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        this.cellsBusy = 0;
                                        throw th;
                                    }
                                }
                            }
                            z4 = false;
                            iM12558b = ThreadLocalRandom.m12557a(iM12558b);
                        } else if (this.cellsBusy != 0 && this.f33187c == c0525cArr && f33177h.m12225c(this, f33181l, 0, 1)) {
                            try {
                                if (this.f33187c == c0525cArr) {
                                    C0525c[] c0525cArr4 = new C0525c[2];
                                    c0525cArr4[iM12558b & 1] = new C0525c(j);
                                    this.f33187c = c0525cArr4;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.cellsBusy = 0;
                                if (z2) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.cellsBusy = 0;
                                throw th2;
                            }
                        } else {
                            c0414a = f33177h;
                            j2 = f33180k;
                            j3 = this.baseCount;
                            if (c0414a.m12226d(this, j2, j3, j3 + j)) {
                                return;
                            }
                        }
                    }
                    try {
                        if (this.f33187c == c0525cArr) {
                            this.f33187c = (C0525c[]) Arrays.copyOf(c0525cArr, length << 1);
                        }
                        this.cellsBusy = 0;
                        zM12226d = z;
                    } catch (Throwable th3) {
                        this.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        } else {
            if (c0525cArr2 != null) {
                zM12226d = true;
            } else {
                zM12226d = true;
            }
            iM12558b = ThreadLocalRandom.m12558b();
            if (iM12558b == 0) {
                ThreadLocalRandom.m12559c();
                iM12558b = ThreadLocalRandom.m12558b();
                zM12226d = true;
            }
            while (true) {
                z = zM12226d;
                boolean z5 = false;
                while (true) {
                    c0525cArr = this.f33187c;
                    if (c0525cArr == null) {
                    }
                    if (this.cellsBusy != 0) {
                    }
                    c0414a = f33177h;
                    j2 = f33180k;
                    j3 = this.baseCount;
                    if (c0414a.m12226d(this, j2, j3, j3 + j)) {
                        return;
                    }
                }
                if (this.f33187c == c0525cArr) {
                    this.f33187c = (C0525c[]) Arrays.copyOf(c0525cArr, length << 1);
                }
                this.cellsBusy = 0;
                zM12226d = z;
            }
        }
        if (i < 0) {
            return;
        }
        while (true) {
            int i3 = this.sizeCtl;
            if (jM12556k < i3 || (c0533kArr = this.f33185a) == null || (length4 = c0533kArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
            if (i3 < 0) {
                if ((i3 >>> 16) != iNumberOfLeadingZeros || i3 == iNumberOfLeadingZeros + 1 || i3 == iNumberOfLeadingZeros + 65535 || (c0533kArr2 = this.f33186b) == null || this.transferIndex <= 0) {
                    return;
                }
                if (f33177h.m12225c(this, f33178i, i3, i3 + 1)) {
                    m12549n(c0533kArr, c0533kArr2);
                }
            } else if (f33177h.m12225c(this, f33178i, i3, (iNumberOfLeadingZeros << 16) + 2)) {
                m12549n(c0533kArr, null);
            }
            jM12556k = m12556k();
        }
    }

    /* JADX INFO: renamed from: b */
    static final boolean m12541b(C0533k[] c0533kArr, int i, C0533k c0533k) {
        return f33177h.m12227e(c0533kArr, ((long) f33183n) + (((long) i) << f33184o), c0533k);
    }

    /* JADX INFO: renamed from: c */
    static Class m12542c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    static int m12543d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX INFO: renamed from: f */
    private final C0533k[] m12544f() {
        while (true) {
            C0533k[] c0533kArr = this.f33185a;
            if (c0533kArr != null && c0533kArr.length != 0) {
                return c0533kArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f33177h.m12225c(this, f33178i, i, -1)) {
                try {
                    C0533k[] c0533kArr2 = this.f33185a;
                    if (c0533kArr2 == null || c0533kArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C0533k[] c0533kArr3 = new C0533k[i2];
                        this.f33185a = c0533kArr3;
                        i = i2 - (i2 >>> 2);
                        c0533kArr2 = c0533kArr3;
                    }
                    return c0533kArr2;
                } finally {
                    this.sizeCtl = i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    static final void m12545i(C0533k[] c0533kArr, int i, C0533k c0533k) {
        f33177h.m12232l(c0533kArr, (((long) i) << f33184o) + ((long) f33183n), c0533k);
    }

    /* JADX INFO: renamed from: j */
    static final int m12546j(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    static final C0533k m12547l(C0533k[] c0533kArr, int i) {
        return (C0533k) f33177h.m12229g(c0533kArr, (((long) i) << f33184o) + ((long) f33183n));
    }

    /* JADX INFO: renamed from: m */
    private static final int m12548m(int i) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + iNumberOfLeadingZeros;
    }

    /* JADX INFO: renamed from: n */
    private final void m12549n(C0533k[] c0533kArr, C0533k[] c0533kArr2) {
        C0533k[] c0533kArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        C0533k[] c0533kArr4;
        int i;
        int i2;
        C0529g c0529g;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i3;
        C0533k c0533k;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = c0533kArr.length;
        int i4 = f33176g;
        int i5 = i4 > 1 ? (length >>> 3) / i4 : length;
        int i6 = i5 < 16 ? 16 : i5;
        if (c0533kArr2 == null) {
            try {
                C0533k[] c0533kArr5 = new C0533k[length << 1];
                concurrentHashMap3.f33186b = c0533kArr5;
                concurrentHashMap3.transferIndex = length;
                c0533kArr3 = c0533kArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c0533kArr3 = c0533kArr2;
        }
        int length2 = c0533kArr3.length;
        C0529g c0529g2 = new C0529g(c0533kArr3);
        C0533k[] c0533kArr6 = c0533kArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i7 = 0;
        int i8 = 0;
        boolean zM12541b = true;
        boolean z = false;
        while (true) {
            if (zM12541b) {
                int i9 = i7 - 1;
                if (i9 >= i8 || z) {
                    concurrentHashMap = concurrentHashMap4;
                    c0533kArr4 = c0533kArr6;
                    i7 = i9;
                    i8 = i8;
                    c0533kArr6 = c0533kArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zM12541b = false;
                } else {
                    int i10 = concurrentHashMap4.transferIndex;
                    if (i10 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        c0533kArr4 = c0533kArr6;
                        i7 = -1;
                    } else {
                        C0414a c0414a = f33177h;
                        long j = f33179j;
                        int i11 = i10 > i6 ? i10 - i6 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        c0533kArr4 = c0533kArr6;
                        int i12 = i8;
                        if (c0414a.m12225c(this, j, i10, i11)) {
                            i7 = i10 - 1;
                            i8 = i11;
                        } else {
                            c0533kArr6 = c0533kArr4;
                            i7 = i9;
                            i8 = i12;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                    c0533kArr6 = c0533kArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zM12541b = false;
                }
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                C0533k[] c0533kArr7 = c0533kArr6;
                int i13 = i8;
                C0540r c0540r = null;
                C0533k c0533k2 = null;
                if (i7 < 0 || i7 >= length || (i3 = i7 + length) >= length2) {
                    i = i6;
                    i2 = length2;
                    c0529g = c0529g2;
                    if (z) {
                        this.f33186b = null;
                        this.f33185a = c0533kArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    C0414a c0414a2 = f33177h;
                    long j2 = f33178i;
                    int i14 = concurrentHashMap2.sizeCtl;
                    int i15 = i7;
                    if (!c0414a2.m12225c(this, j2, i14, i14 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        i7 = i15;
                        c0533kArr6 = c0533kArr7;
                    } else {
                        if (i14 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i7 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        c0533kArr6 = c0533kArr7;
                        zM12541b = true;
                        z = true;
                    }
                } else {
                    C0533k c0533kM12547l = m12547l(c0533kArr7, i7);
                    if (c0533kM12547l == null) {
                        zM12541b = m12541b(c0533kArr7, i7, c0529g2);
                        i = i6;
                        c0529g = c0529g2;
                        c0533kArr6 = c0533kArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                        i2 = length2;
                    } else {
                        int i16 = c0533kM12547l.f33211a;
                        if (i16 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i = i6;
                            c0529g = c0529g2;
                            c0533kArr6 = c0533kArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            zM12541b = true;
                            i2 = length2;
                        } else {
                            synchronized (c0533kM12547l) {
                                if (m12547l(c0533kArr7, i7) == c0533kM12547l) {
                                    if (i16 >= 0) {
                                        int i17 = i16 & length;
                                        C0533k c0533k3 = c0533kM12547l;
                                        for (C0533k c0533k4 = c0533kM12547l.f33214d; c0533k4 != null; c0533k4 = c0533k4.f33214d) {
                                            int i18 = c0533k4.f33211a & length;
                                            if (i18 != i17) {
                                                c0533k3 = c0533k4;
                                                i17 = i18;
                                            }
                                        }
                                        if (i17 == 0) {
                                            c0533k = c0533k3;
                                        } else {
                                            c0533k = null;
                                            c0533k2 = c0533k3;
                                        }
                                        C0533k c0533k5 = c0533kM12547l;
                                        while (c0533k5 != c0533k3) {
                                            int i19 = c0533k5.f33211a;
                                            C0533k c0533k6 = c0533k3;
                                            Object obj = c0533k5.f33212b;
                                            int i20 = i6;
                                            Object obj2 = c0533k5.f33213c;
                                            if ((i19 & length) == 0) {
                                                c0533k = new C0533k(i19, obj, obj2, c0533k);
                                            } else {
                                                c0533k2 = new C0533k(i19, obj, obj2, c0533k2);
                                            }
                                            c0533k5 = c0533k5.f33214d;
                                            c0533k3 = c0533k6;
                                            i6 = i20;
                                            length2 = length2;
                                        }
                                        i = i6;
                                        i2 = length2;
                                        m12545i(c0533kArr3, i7, c0533k);
                                        m12545i(c0533kArr3, i3, c0533k2);
                                        m12545i(c0533kArr7, i7, c0529g2);
                                        c0529g = c0529g2;
                                    } else {
                                        i = i6;
                                        i2 = length2;
                                        if (c0533kM12547l instanceof C0539q) {
                                            C0539q c0539q = (C0539q) c0533kM12547l;
                                            C0540r c0540r2 = null;
                                            C0540r c0540r3 = null;
                                            C0533k c0533k7 = c0539q.f33230f;
                                            int i21 = 0;
                                            int i22 = 0;
                                            C0540r c0540r4 = null;
                                            while (c0533k7 != null) {
                                                C0539q c0539q2 = c0539q;
                                                int i23 = c0533k7.f33211a;
                                                C0529g c0529g3 = c0529g2;
                                                C0540r c0540r5 = new C0540r(i23, c0533k7.f33212b, c0533k7.f33213c, null, null);
                                                if ((i23 & length) == 0) {
                                                    c0540r5.f33235h = c0540r3;
                                                    if (c0540r3 == null) {
                                                        c0540r = c0540r5;
                                                    } else {
                                                        c0540r3.f33214d = c0540r5;
                                                    }
                                                    i21++;
                                                    c0540r3 = c0540r5;
                                                } else {
                                                    c0540r5.f33235h = c0540r2;
                                                    if (c0540r2 == null) {
                                                        c0540r4 = c0540r5;
                                                    } else {
                                                        c0540r2.f33214d = c0540r5;
                                                    }
                                                    i22++;
                                                    c0540r2 = c0540r5;
                                                }
                                                c0533k7 = c0533k7.f33214d;
                                                c0539q = c0539q2;
                                                c0529g2 = c0529g3;
                                            }
                                            C0539q c0539q3 = c0539q;
                                            C0529g c0529g4 = c0529g2;
                                            C0533k c0533kM12552q = i21 <= 6 ? m12552q(c0540r) : i22 != 0 ? new C0539q(c0540r) : c0539q3;
                                            C0533k c0533kM12552q2 = i22 <= 6 ? m12552q(c0540r4) : i21 != 0 ? new C0539q(c0540r4) : c0539q3;
                                            m12545i(c0533kArr3, i7, c0533kM12552q);
                                            m12545i(c0533kArr3, i3, c0533kM12552q2);
                                            c0529g = c0529g4;
                                            m12545i(c0533kArr, i7, c0529g);
                                            c0533kArr7 = c0533kArr;
                                        }
                                    }
                                    zM12541b = true;
                                } else {
                                    i = i6;
                                    i2 = length2;
                                }
                                c0529g = c0529g2;
                            }
                            concurrentHashMap4 = this;
                            c0533kArr6 = c0533kArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                }
                c0529g2 = c0529g;
                concurrentHashMap3 = concurrentHashMap2;
                i8 = i13;
                i6 = i;
                length2 = i2;
            }
        }
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    private final void m12550o(C0533k[] c0533kArr, int i) {
        int length = c0533kArr.length;
        if (length < 64) {
            m12551p(length << 1);
            return;
        }
        C0533k c0533kM12547l = m12547l(c0533kArr, i);
        if (c0533kM12547l == null || c0533kM12547l.f33211a < 0) {
            return;
        }
        synchronized (c0533kM12547l) {
            if (m12547l(c0533kArr, i) == c0533kM12547l) {
                C0540r c0540r = null;
                C0533k c0533k = c0533kM12547l;
                C0540r c0540r2 = null;
                while (c0533k != null) {
                    C0540r c0540r3 = new C0540r(c0533k.f33211a, c0533k.f33212b, c0533k.f33213c, null, null);
                    c0540r3.f33235h = c0540r2;
                    if (c0540r2 == null) {
                        c0540r = c0540r3;
                    } else {
                        c0540r2.f33214d = c0540r3;
                    }
                    c0533k = c0533k.f33214d;
                    c0540r2 = c0540r3;
                }
                m12545i(c0533kArr, i, new C0539q(c0540r));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m12551p(int i) {
        int length;
        int iM12548m = i >= 536870912 ? 1073741824 : m12548m(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            C0533k[] c0533kArr = this.f33185a;
            if (c0533kArr == null || (length = c0533kArr.length) == 0) {
                int i3 = i2 > iM12548m ? i2 : iM12548m;
                if (f33177h.m12225c(this, f33178i, i2, -1)) {
                    try {
                        if (this.f33185a == c0533kArr) {
                            this.f33185a = new C0533k[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                        this.sizeCtl = i2;
                    } catch (Throwable th) {
                        this.sizeCtl = i2;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iM12548m <= i2 || length >= 1073741824) {
                    return;
                }
                if (c0533kArr == this.f33185a) {
                    if (f33177h.m12225c(this, f33178i, i2, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m12549n(c0533kArr, null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    static C0533k m12552q(C0540r c0540r) {
        C0533k c0533k = null;
        C0533k c0533k2 = null;
        for (C0533k c0533k3 = c0540r; c0533k3 != null; c0533k3 = c0533k3.f33214d) {
            C0533k c0533k4 = new C0533k(c0533k3.f33211a, c0533k3.f33212b, c0533k3.f33213c);
            if (c0533k2 == null) {
                c0533k = c0533k4;
            } else {
                c0533k2.f33214d = c0533k4;
            }
            c0533k2 = c0533k4;
        }
        return c0533k;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C0533k c0533k = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j = 1;
            if (object == null || object2 == null) {
                break;
            }
            j3++;
            c0533k = new C0533k(m12546j(object.hashCode()), object, object2, c0533k);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        double d = j3 / 0.75f;
        Double.isNaN(d);
        Double.isNaN(d);
        long j4 = (long) (d + 1.0d);
        int iM12548m = j4 >= 1073741824 ? 1073741824 : m12548m((int) j4);
        C0533k[] c0533kArr = new C0533k[iM12548m];
        int i = iM12548m - 1;
        while (c0533k != null) {
            C0533k c0533k2 = c0533k.f33214d;
            int i2 = c0533k.f33211a;
            int i3 = i2 & i;
            C0533k c0533kM12547l = m12547l(c0533kArr, i3);
            if (c0533kM12547l == null) {
                z2 = true;
            } else {
                Object obj2 = c0533k.f33212b;
                if (c0533kM12547l.f33211a >= 0) {
                    C0533k c0533k3 = c0533kM12547l;
                    int i4 = 0;
                    while (true) {
                        if (c0533k3 == null) {
                            z = true;
                            break;
                        }
                        if (c0533k3.f33211a == i2 && ((obj = c0533k3.f33212b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        } else {
                            i4++;
                            c0533k3 = c0533k3.f33214d;
                        }
                    }
                    if (!z || i4 < 8) {
                        z2 = z;
                    } else {
                        long j5 = j2 + 1;
                        c0533k.f33214d = c0533kM12547l;
                        C0533k c0533k4 = c0533k;
                        C0540r c0540r = null;
                        C0540r c0540r2 = null;
                        while (c0533k4 != null) {
                            long j6 = j5;
                            C0540r c0540r3 = new C0540r(c0533k4.f33211a, c0533k4.f33212b, c0533k4.f33213c, null, null);
                            c0540r3.f33235h = c0540r2;
                            if (c0540r2 == null) {
                                c0540r = c0540r3;
                            } else {
                                c0540r2.f33214d = c0540r3;
                            }
                            c0533k4 = c0533k4.f33214d;
                            c0540r2 = c0540r3;
                            j5 = j6;
                        }
                        m12545i(c0533kArr, i3, new C0539q(c0540r));
                        j2 = j5;
                    }
                } else if (((C0539q) c0533kM12547l).m12573e(i2, obj2, c0533k.f33213c) == null) {
                    j2 += j;
                }
                z2 = false;
            }
            j = 1;
            if (z2) {
                j2++;
                c0533k.f33214d = c0533kM12547l;
                m12545i(c0533kArr, i3, c0533k);
            }
            c0533k = c0533k2;
        }
        this.f33185a = c0533kArr;
        this.sizeCtl = iM12548m - (iM12548m >>> 2);
        this.baseCount = j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        C0536n[] c0536nArr = new C0536n[16];
        for (int i5 = 0; i5 < 16; i5++) {
            c0536nArr[i5] = new C0536n();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", c0536nArr);
        putFieldPutFields.put("segmentShift", i3);
        putFieldPutFields.put("segmentMask", i4);
        objectOutputStream.writeFields();
        C0533k[] c0533kArr = this.f33185a;
        if (c0533kArr != null) {
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                objectOutputStream.writeObject(c0533kM12566a.f33212b);
                objectOutputStream.writeObject(c0533kM12566a.f33213c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C0533k c0533kM12547l;
        C0533k c0533k;
        C0533k[] c0533kArrM12553e = this.f33185a;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (true) {
                if (c0533kArrM12553e == null || i >= c0533kArrM12553e.length) {
                    break loop0;
                }
                c0533kM12547l = m12547l(c0533kArrM12553e, i);
                if (c0533kM12547l == null) {
                    i++;
                } else {
                    int i2 = c0533kM12547l.f33211a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (c0533kM12547l) {
                        if (m12547l(c0533kArrM12553e, i) == c0533kM12547l) {
                            if (i2 >= 0) {
                                c0533k = c0533kM12547l;
                            } else {
                                c0533k = c0533kM12547l instanceof C0539q ? ((C0539q) c0533kM12547l).f33230f : null;
                            }
                            while (c0533k != null) {
                                j--;
                                c0533k = c0533k.f33214d;
                            }
                            m12545i(c0533kArrM12553e, i, null);
                            i++;
                        }
                    }
                }
            }
            c0533kArrM12553e = m12553e(c0533kArrM12553e, c0533kM12547l);
        }
        if (j != 0) {
            m12540a(j, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004f */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        int i;
        C0533k c0533k;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12544f = this.f33185a;
        int i2 = 0;
        Object obj3 = null;
        int i3 = 0;
        while (true) {
            if (c0533kArrM12544f != null) {
                int length = c0533kArrM12544f.length;
                if (length != 0) {
                    int i4 = (length - 1) & iM12546j;
                    C0533k c0533kM12547l = m12547l(c0533kArrM12544f, i4);
                    if (c0533kM12547l == null) {
                        C0534l c0534l = new C0534l();
                        synchronized (c0534l) {
                            if (m12541b(c0533kArrM12544f, i4, c0534l)) {
                                try {
                                    Object objApply2 = biFunction.apply(obj, null);
                                    if (objApply2 != null) {
                                        c0533k = new C0533k(iM12546j, obj, objApply2);
                                        i = 1;
                                    } else {
                                        i = i2;
                                        c0533k = null;
                                    }
                                    m12545i(c0533kArrM12544f, i4, c0533k);
                                    i2 = i;
                                    obj3 = objApply2;
                                    i3 = 1;
                                } catch (Throwable th) {
                                    m12545i(c0533kArrM12544f, i4, null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = c0533kM12547l.f33211a;
                        if (i5 == -1) {
                            c0533kArrM12544f = m12553e(c0533kArrM12544f, c0533kM12547l);
                        } else {
                            synchronized (c0533kM12547l) {
                                try {
                                    if (m12547l(c0533kArrM12544f, i4) == c0533kM12547l) {
                                        if (i5 >= 0) {
                                            C0533k c0533k2 = null;
                                            C0533k c0533k3 = c0533kM12547l;
                                            int i6 = 1;
                                            while (true) {
                                                if (c0533k3.f33211a == iM12546j && ((obj2 = c0533k3.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    objApply = biFunction.apply(obj, c0533k3.f33213c);
                                                    if (objApply == null) {
                                                        C0533k c0533k4 = c0533k3.f33214d;
                                                        if (c0533k2 != null) {
                                                            c0533k2.f33214d = c0533k4;
                                                        } else {
                                                            m12545i(c0533kArrM12544f, i4, c0533k4);
                                                        }
                                                        i2 = -1;
                                                        break;
                                                    }
                                                    c0533k3.f33213c = objApply;
                                                    break;
                                                }
                                                C0533k c0533k5 = c0533k3.f33214d;
                                                if (c0533k5 == null) {
                                                    Object objApply3 = biFunction.apply(obj, null);
                                                    if (objApply3 == null) {
                                                        objApply = objApply3;
                                                        break;
                                                    }
                                                    if (c0533k3.f33214d != null) {
                                                        throw new IllegalStateException("Recursive update");
                                                    }
                                                    c0533k3.f33214d = new C0533k(iM12546j, obj, objApply3);
                                                    objApply = objApply3;
                                                    i2 = 1;
                                                    break;
                                                }
                                                i6++;
                                                c0533k2 = c0533k3;
                                                c0533k3 = c0533k5;
                                            }
                                            i3 = i6;
                                            obj3 = objApply;
                                        } else if (c0533kM12547l instanceof C0539q) {
                                            C0539q c0539q = (C0539q) c0533kM12547l;
                                            C0540r c0540r = c0539q.f33229e;
                                            C0540r c0540rM12575b = c0540r != null ? c0540r.m12575b(iM12546j, obj, null) : null;
                                            Object objApply4 = biFunction.apply(obj, c0540rM12575b == null ? null : c0540rM12575b.f33213c);
                                            if (objApply4 != null) {
                                                if (c0540rM12575b != null) {
                                                    c0540rM12575b.f33213c = objApply4;
                                                } else {
                                                    c0539q.m12573e(iM12546j, obj, objApply4);
                                                    i2 = 1;
                                                }
                                            } else if (c0540rM12575b != null) {
                                                if (c0539q.m12574f(c0540rM12575b)) {
                                                    m12545i(c0533kArrM12544f, i4, m12552q(c0539q.f33230f));
                                                }
                                                i2 = -1;
                                            }
                                            obj3 = objApply4;
                                            i3 = 1;
                                        } else if (c0533kM12547l instanceof C0534l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 < 8) {
                                    break;
                                }
                                m12550o(c0533kArrM12544f, i4);
                                break;
                            }
                        }
                    }
                }
            }
            c0533kArrM12544f = m12544f();
        }
        if (i2 != 0) {
            m12540a(i2, i3);
        }
        return obj3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004c */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        C0540r c0540rM12575b;
        Object objApply;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || function == null) {
            throw null;
        }
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12544f = this.f33185a;
        Object objApply2 = null;
        int i = 0;
        while (true) {
            if (c0533kArrM12544f != null) {
                int length = c0533kArrM12544f.length;
                if (length != 0) {
                    int i2 = (length - 1) & iM12546j;
                    C0533k c0533kM12547l = m12547l(c0533kArrM12544f, i2);
                    boolean z = true;
                    if (c0533kM12547l == null) {
                        C0534l c0534l = new C0534l();
                        synchronized (c0534l) {
                            if (m12541b(c0533kArrM12544f, i2, c0534l)) {
                                try {
                                    Object objApply3 = function.apply(obj);
                                    m12545i(c0533kArrM12544f, i2, objApply3 != null ? new C0533k(iM12546j, obj, objApply3) : null);
                                    objApply2 = objApply3;
                                    i = 1;
                                } catch (Throwable th) {
                                    m12545i(c0533kArrM12544f, i2, null);
                                    throw th;
                                }
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    } else {
                        int i3 = c0533kM12547l.f33211a;
                        if (i3 == -1) {
                            c0533kArrM12544f = m12553e(c0533kArrM12544f, c0533kM12547l);
                        } else {
                            if (i3 == iM12546j && (((obj5 = c0533kM12547l.f33212b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c0533kM12547l.f33213c) != null)) {
                                return obj6;
                            }
                            synchronized (c0533kM12547l) {
                                if (m12547l(c0533kArrM12544f, i2) != c0533kM12547l) {
                                    z = false;
                                } else if (i3 >= 0) {
                                    C0533k c0533k = c0533kM12547l;
                                    int i4 = 1;
                                    while (true) {
                                        if (c0533k.f33211a == iM12546j && ((obj4 = c0533k.f33212b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                            obj3 = c0533k.f33213c;
                                            objApply = obj3;
                                            z = false;
                                            break;
                                        }
                                        C0533k c0533k2 = c0533k.f33214d;
                                        if (c0533k2 == null) {
                                            objApply = function.apply(obj);
                                            if (objApply == null) {
                                                obj3 = objApply;
                                                objApply = obj3;
                                                z = false;
                                                break;
                                            }
                                            if (c0533k.f33214d != null) {
                                                throw new IllegalStateException("Recursive update");
                                            }
                                            c0533k.f33214d = new C0533k(iM12546j, obj, objApply);
                                            break;
                                        }
                                        i4++;
                                        c0533k = c0533k2;
                                    }
                                    i = i4;
                                    objApply2 = objApply;
                                } else if (c0533kM12547l instanceof C0539q) {
                                    C0539q c0539q = (C0539q) c0533kM12547l;
                                    C0540r c0540r = c0539q.f33229e;
                                    if (c0540r == null || (c0540rM12575b = c0540r.m12575b(iM12546j, obj, null)) == null) {
                                        objApply2 = function.apply(obj);
                                        if (objApply2 != null) {
                                            c0539q.m12573e(iM12546j, obj, objApply2);
                                        } else {
                                            obj2 = objApply2;
                                        }
                                        i = 2;
                                    } else {
                                        obj2 = c0540rM12575b.f33213c;
                                    }
                                    objApply2 = obj2;
                                    z = false;
                                    i = 2;
                                } else {
                                    if (c0533kM12547l instanceof C0534l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    z = false;
                                }
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    m12550o(c0533kArrM12544f, i2);
                                }
                                if (z) {
                                    break;
                                }
                                return objApply2;
                            }
                        }
                    }
                }
            }
            c0533kArrM12544f = m12544f();
        }
        if (objApply2 != null) {
            m12540a(1L, i);
        }
        return objApply2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C0540r c0540rM12575b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12544f = this.f33185a;
        int i = 0;
        Object objApply = null;
        int i2 = 0;
        while (true) {
            if (c0533kArrM12544f != null) {
                int length = c0533kArrM12544f.length;
                if (length != 0) {
                    int i3 = (length - 1) & iM12546j;
                    C0533k c0533kM12547l = m12547l(c0533kArrM12544f, i3);
                    if (c0533kM12547l == null) {
                        break;
                    }
                    int i4 = c0533kM12547l.f33211a;
                    if (i4 == -1) {
                        c0533kArrM12544f = m12553e(c0533kArrM12544f, c0533kM12547l);
                    } else {
                        synchronized (c0533kM12547l) {
                            try {
                                if (m12547l(c0533kArrM12544f, i3) == c0533kM12547l) {
                                    if (i4 >= 0) {
                                        i2 = 1;
                                        C0533k c0533k = null;
                                        C0533k c0533k2 = c0533kM12547l;
                                        while (true) {
                                            if (c0533k2.f33211a == iM12546j && ((obj2 = c0533k2.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, c0533k2.f33213c);
                                                if (objApply == null) {
                                                    C0533k c0533k3 = c0533k2.f33214d;
                                                    if (c0533k != null) {
                                                        c0533k.f33214d = c0533k3;
                                                    } else {
                                                        m12545i(c0533kArrM12544f, i3, c0533k3);
                                                    }
                                                    i = -1;
                                                    break;
                                                }
                                                c0533k2.f33213c = objApply;
                                                break;
                                            }
                                            C0533k c0533k4 = c0533k2.f33214d;
                                            if (c0533k4 == null) {
                                                break;
                                            }
                                            i2++;
                                            c0533k = c0533k2;
                                            c0533k2 = c0533k4;
                                        }
                                    } else if (c0533kM12547l instanceof C0539q) {
                                        C0539q c0539q = (C0539q) c0533kM12547l;
                                        C0540r c0540r = c0539q.f33229e;
                                        if (c0540r != null && (c0540rM12575b = c0540r.m12575b(iM12546j, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, c0540rM12575b.f33213c);
                                            if (objApply != null) {
                                                c0540rM12575b.f33213c = objApply;
                                            } else {
                                                if (c0539q.m12574f(c0540rM12575b)) {
                                                    m12545i(c0533kArrM12544f, i3, m12552q(c0539q.f33230f));
                                                }
                                                i = -1;
                                            }
                                        }
                                        i2 = 2;
                                    } else if (c0533kM12547l instanceof C0534l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            c0533kArrM12544f = m12544f();
        }
        if (i != 0) {
            m12540a(i, i2);
        }
        return objApply;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C0533k[] c0533kArr = this.f33185a;
        if (c0533kArr != null) {
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                Object obj2 = c0533kM12566a.f33213c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    final C0533k[] m12553e(C0533k[] c0533kArr, C0533k c0533k) {
        C0533k[] c0533kArr2;
        int i;
        if (!(c0533k instanceof C0529g) || (c0533kArr2 = ((C0529g) c0533k).f33204e) == null) {
            return this.f33185a;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(c0533kArr.length) | 32768;
        while (c0533kArr2 == this.f33186b && this.f33185a == c0533kArr && (i = this.sizeCtl) < 0 && (i >>> 16) == iNumberOfLeadingZeros && i != iNumberOfLeadingZeros + 1 && i != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            if (f33177h.m12225c(this, f33178i, i, i + 1)) {
                m12549n(c0533kArr, c0533kArr2);
                break;
            }
        }
        return c0533kArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0527e c0527e = this.f33190f;
        if (c0527e != null) {
            return c0527e;
        }
        C0527e c0527e2 = new C0527e(this);
        this.f33190f = c0527e2;
        return c0527e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C0533k[] c0533kArr = this.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        C0538p c0538p = new C0538p(c0533kArr, length, 0, length);
        while (true) {
            C0533k c0533kM12566a = c0538p.m12566a();
            if (c0533kM12566a == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = c0533kM12566a.f33213c;
            Object obj3 = map.get(c0533kM12566a.f33212b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C0533k[] c0533kArr = this.f33185a;
        if (c0533kArr == null) {
            return;
        }
        C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
        while (true) {
            C0533k c0533kM12566a = c0538p.m12566a();
            if (c0533kM12566a == null) {
                return;
            } else {
                biConsumer.accept(c0533kM12566a.f33212b, c0533kM12566a.f33213c);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    final Object m12554g(Object obj, Object obj2, boolean z) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12544f = this.f33185a;
        int i = 0;
        while (true) {
            if (c0533kArrM12544f != null) {
                int length = c0533kArrM12544f.length;
                if (length != 0) {
                    int i2 = (length - 1) & iM12546j;
                    C0533k c0533kM12547l = m12547l(c0533kArrM12544f, i2);
                    if (c0533kM12547l != null) {
                        int i3 = c0533kM12547l.f33211a;
                        if (i3 == -1) {
                            c0533kArrM12544f = m12553e(c0533kArrM12544f, c0533kM12547l);
                        } else {
                            if (z && i3 == iM12546j && (((obj5 = c0533kM12547l.f33212b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = c0533kM12547l.f33213c) != null)) {
                                return obj6;
                            }
                            synchronized (c0533kM12547l) {
                                if (m12547l(c0533kArrM12544f, i2) != c0533kM12547l) {
                                    obj3 = null;
                                } else if (i3 >= 0) {
                                    i = 1;
                                    C0533k c0533k = c0533kM12547l;
                                    while (true) {
                                        if (c0533k.f33211a != iM12546j || ((obj4 = c0533k.f33212b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                            C0533k c0533k2 = c0533k.f33214d;
                                            if (c0533k2 == null) {
                                                c0533k.f33214d = new C0533k(iM12546j, obj, obj2);
                                                obj3 = null;
                                            } else {
                                                i++;
                                                c0533k = c0533k2;
                                            }
                                        } else {
                                            obj3 = c0533k.f33213c;
                                            if (!z) {
                                                c0533k.f33213c = obj2;
                                            }
                                        }
                                    }
                                } else if (c0533kM12547l instanceof C0539q) {
                                    C0540r c0540rM12573e = ((C0539q) c0533kM12547l).m12573e(iM12546j, obj, obj2);
                                    if (c0540rM12573e != null) {
                                        Object obj7 = c0540rM12573e.f33213c;
                                        if (!z) {
                                            c0540rM12573e.f33213c = obj2;
                                        }
                                        obj3 = obj7;
                                    } else {
                                        obj3 = null;
                                    }
                                    i = 2;
                                } else {
                                    if (c0533kM12547l instanceof C0534l) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                    obj3 = null;
                                }
                            }
                            if (i != 0) {
                                if (i >= 8) {
                                    m12550o(c0533kArrM12544f, i2);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    } else if (m12541b(c0533kArrM12544f, i2, new C0533k(iM12546j, obj, obj2))) {
                        break;
                    }
                }
            }
            c0533kArrM12544f = m12544f();
        }
        m12540a(1L, i);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        C0533k c0533kM12547l;
        Object obj2;
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArr = this.f33185a;
        if (c0533kArr != null && (length = c0533kArr.length) > 0 && (c0533kM12547l = m12547l(c0533kArr, (length - 1) & iM12546j)) != null) {
            int i = c0533kM12547l.f33211a;
            if (i == iM12546j) {
                Object obj3 = c0533kM12547l.f33212b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) c0533kM12547l.f33213c;
                }
            } else if (i < 0) {
                C0533k c0533kMo12563a = c0533kM12547l.mo12563a(iM12546j, obj);
                if (c0533kMo12563a != null) {
                    return (V) c0533kMo12563a.f33213c;
                }
                return null;
            }
            while (true) {
                c0533kM12547l = c0533kM12547l.f33214d;
                if (c0533kM12547l == null) {
                    break;
                }
                if (c0533kM12547l.f33211a == iM12546j && ((obj2 = c0533kM12547l.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return (V) c0533kM12547l.f33213c;
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00ab A[PHI: r7
      0x00ab: PHI (r7v3 boolean) = 
      (r7v1 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
      (r7v4 boolean)
     binds: [B:66:0x00aa, B:44:0x0070, B:46:0x0076, B:50:0x007e, B:52:0x0084, B:39:0x0062, B:29:0x0047, B:31:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: h */
    final Object m12555h(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C0533k c0533kM12547l;
        boolean z;
        Object obj4;
        C0540r c0540rM12575b;
        C0533k c0533kM12552q;
        Object obj5;
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12553e = this.f33185a;
        while (c0533kArrM12553e != null && (length = c0533kArrM12553e.length) != 0 && (c0533kM12547l = m12547l(c0533kArrM12553e, (i = (length - 1) & iM12546j))) != null) {
            int i2 = c0533kM12547l.f33211a;
            if (i2 == -1) {
                c0533kArrM12553e = m12553e(c0533kArrM12553e, c0533kM12547l);
            } else {
                synchronized (c0533kM12547l) {
                    try {
                        if (m12547l(c0533kArrM12553e, i) == c0533kM12547l) {
                            z = true;
                            if (i2 >= 0) {
                                C0533k c0533k = null;
                                C0533k c0533k2 = c0533kM12547l;
                                while (true) {
                                    if (c0533k2.f33211a != iM12546j || ((obj5 = c0533k2.f33212b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        C0533k c0533k3 = c0533k2.f33214d;
                                        if (c0533k3 != null) {
                                            c0533k = c0533k2;
                                            c0533k2 = c0533k3;
                                        }
                                    } else {
                                        obj4 = c0533k2.f33213c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                c0533k2.f33213c = obj2;
                                            } else if (c0533k != null) {
                                                c0533k.f33214d = c0533k2.f33214d;
                                            } else {
                                                c0533kM12552q = c0533k2.f33214d;
                                                m12545i(c0533kArrM12553e, i, c0533kM12552q);
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (c0533kM12547l instanceof C0539q) {
                                C0539q c0539q = (C0539q) c0533kM12547l;
                                C0540r c0540r = c0539q.f33229e;
                                if (c0540r == null || (c0540rM12575b = c0540r.m12575b(iM12546j, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = c0540rM12575b.f33213c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        c0540rM12575b.f33213c = obj2;
                                    } else if (c0539q.m12574f(c0540rM12575b)) {
                                        c0533kM12552q = m12552q(c0539q.f33230f);
                                        m12545i(c0533kArrM12553e, i, c0533kM12552q);
                                    }
                                }
                            } else {
                                if (c0533kM12547l instanceof C0534l) {
                                    throw new IllegalStateException("Recursive update");
                                }
                                z = false;
                                obj4 = null;
                            }
                        } else {
                            z = false;
                            obj4 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        m12540a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C0533k[] c0533kArr = this.f33185a;
        int iHashCode = 0;
        if (c0533kArr != null) {
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                iHashCode += c0533kM12566a.f33213c.hashCode() ^ c0533kM12566a.f33212b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return m12556k() <= 0;
    }

    /* JADX INFO: renamed from: k */
    final long m12556k() {
        C0525c[] c0525cArr = this.f33187c;
        long j = this.baseCount;
        if (c0525cArr != null) {
            for (C0525c c0525c : c0525cArr) {
                if (c0525c != null) {
                    j += c0525c.value;
                }
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySetView keySetView = this.f33188d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f33188d = keySetView2;
        return keySetView2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object objApply;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int iM12546j = m12546j(obj.hashCode());
        C0533k[] c0533kArrM12544f = this.f33185a;
        int i2 = 0;
        Object obj5 = null;
        int i3 = 0;
        while (true) {
            if (c0533kArrM12544f != null) {
                int length = c0533kArrM12544f.length;
                if (length != 0) {
                    int i4 = (length - 1) & iM12546j;
                    C0533k c0533kM12547l = m12547l(c0533kArrM12544f, i4);
                    i = 1;
                    if (c0533kM12547l != null) {
                        int i5 = c0533kM12547l.f33211a;
                        if (i5 == -1) {
                            c0533kArrM12544f = m12553e(c0533kArrM12544f, c0533kM12547l);
                        } else {
                            synchronized (c0533kM12547l) {
                                try {
                                    if (m12547l(c0533kArrM12544f, i4) == c0533kM12547l) {
                                        if (i5 >= 0) {
                                            C0533k c0533k = null;
                                            C0533k c0533k2 = c0533kM12547l;
                                            int i6 = 1;
                                            while (true) {
                                                if (c0533k2.f33211a == iM12546j && ((obj3 = c0533k2.f33212b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    objApply = biFunction.apply(c0533k2.f33213c, obj4);
                                                    if (objApply == null) {
                                                        C0533k c0533k3 = c0533k2.f33214d;
                                                        if (c0533k != null) {
                                                            c0533k.f33214d = c0533k3;
                                                        } else {
                                                            m12545i(c0533kArrM12544f, i4, c0533k3);
                                                        }
                                                        i3 = -1;
                                                        break;
                                                    }
                                                    c0533k2.f33213c = objApply;
                                                    break;
                                                }
                                                C0533k c0533k4 = c0533k2.f33214d;
                                                if (c0533k4 == null) {
                                                    c0533k2.f33214d = new C0533k(iM12546j, obj, obj4);
                                                    objApply = obj4;
                                                    i3 = 1;
                                                    break;
                                                }
                                                i6++;
                                                c0533k = c0533k2;
                                                c0533k2 = c0533k4;
                                            }
                                            i2 = i6;
                                            obj5 = objApply;
                                        } else if (c0533kM12547l instanceof C0539q) {
                                            C0539q c0539q = (C0539q) c0533kM12547l;
                                            C0540r c0540r = c0539q.f33229e;
                                            C0540r c0540rM12575b = c0540r == null ? null : c0540r.m12575b(iM12546j, obj, null);
                                            Object objApply2 = c0540rM12575b == null ? obj4 : biFunction.apply(c0540rM12575b.f33213c, obj4);
                                            if (objApply2 != null) {
                                                if (c0540rM12575b != null) {
                                                    c0540rM12575b.f33213c = objApply2;
                                                } else {
                                                    c0539q.m12573e(iM12546j, obj, objApply2);
                                                    i3 = 1;
                                                }
                                            } else if (c0540rM12575b != null) {
                                                if (c0539q.m12574f(c0540rM12575b)) {
                                                    m12545i(c0533kArrM12544f, i4, m12552q(c0539q.f33230f));
                                                }
                                                i3 = -1;
                                            }
                                            i2 = 2;
                                            obj5 = objApply2;
                                        } else if (c0533kM12547l instanceof C0534l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m12550o(c0533kArrM12544f, i4);
                                }
                                i = i3;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (m12541b(c0533kArrM12544f, i4, new C0533k(iM12546j, obj, obj4))) {
                        break;
                    }
                }
            }
            c0533kArrM12544f = m12544f();
        }
        if (i != 0) {
            m12540a(i, i2);
        }
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return m12554g(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m12551p(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            m12554g(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public V putIfAbsent(K k, V v) {
        return (V) m12554g(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) m12555h(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return m12555h(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C0533k[] c0533kArr = this.f33185a;
        if (c0533kArr == null) {
            return;
        }
        C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
        while (true) {
            C0533k c0533kM12566a = c0538p.m12566a();
            if (c0533kM12566a == null) {
                return;
            }
            Object obj = c0533kM12566a.f33213c;
            Object obj2 = c0533kM12566a.f33212b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (m12555h(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jM12556k = m12556k();
        if (jM12556k < 0) {
            return 0;
        }
        if (jM12556k > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM12556k;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        C0533k[] c0533kArr = this.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        C0538p c0538p = new C0538p(c0533kArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C0533k c0533kM12566a = c0538p.m12566a();
        if (c0533kM12566a != null) {
            while (true) {
                Object obj = c0533kM12566a.f33212b;
                Object obj2 = c0533kM12566a.f33213c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        C0541s c0541s = this.f33189e;
        if (c0541s != null) {
            return c0541s;
        }
        C0541s c0541s2 = new C0541s(this);
        this.f33189e = c0541s2;
        return c0541s2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || m12555h(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p021j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m12555h(obj, obj3, obj2) != null;
    }
}
