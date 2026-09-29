package p326q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes.dex */
public class C8450f<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f45593a;

    /* JADX INFO: renamed from: b */
    public int f45594b;

    /* JADX INFO: renamed from: c */
    public final int f45595c;

    /* JADX INFO: renamed from: d */
    public int f45596d;

    /* JADX INFO: renamed from: e */
    public int f45597e;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8450f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f45595c = i10;
        this.f45593a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    public V mo5610a(K k10) {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final V m16516b(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.f45593a.get(k10);
                if (v10 != null) {
                    this.f45596d++;
                    return v10;
                }
                this.f45597e++;
                V vMo5610a = mo5610a(k10);
                if (vMo5610a == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        vPut = this.f45593a.put(k10, vMo5610a);
                        if (vPut != null) {
                            this.f45593a.put(k10, vPut);
                        } else {
                            this.f45594b++;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                m16518d(this.f45595c);
                return vMo5610a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final V m16517c(K k10, V v10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f45594b++;
            vPut = this.f45593a.put(k10, v10);
            if (vPut != null) {
                this.f45594b--;
            }
        }
        m16518d(this.f45595c);
        return vPut;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m16518d(int i10) {
        while (true) {
            synchronized (this) {
                if (this.f45594b < 0 || (this.f45593a.isEmpty() && this.f45594b != 0)) {
                    break;
                }
                if (this.f45594b > i10 && !this.f45593a.isEmpty()) {
                    Map.Entry<K, V> next = this.f45593a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f45593a.remove(key);
                    this.f45594b--;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f45596d;
        i11 = this.f45597e + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f45595c), Integer.valueOf(this.f45596d), Integer.valueOf(this.f45597e), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
