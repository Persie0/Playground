package p213k4;

import dm.C5207g;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p288o4.InterfaceC7918d;
import p288o4.InterfaceC7919e;
import sl.C9072e;

/* JADX INFO: renamed from: k4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6595o implements InterfaceC7919e, InterfaceC7918d {

    /* JADX INFO: renamed from: i */
    public static final TreeMap<Integer, C6595o> f37481i = new TreeMap<>();

    /* JADX INFO: renamed from: a */
    public final int f37482a;

    /* JADX INFO: renamed from: b */
    public volatile String f37483b;

    /* JADX INFO: renamed from: c */
    public final long[] f37484c;

    /* JADX INFO: renamed from: d */
    public final double[] f37485d;

    /* JADX INFO: renamed from: e */
    public final String[] f37486e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f37487f;

    /* JADX INFO: renamed from: g */
    public final int[] f37488g;

    /* JADX INFO: renamed from: h */
    public int f37489h;

    public C6595o(int i10) {
        this.f37482a = i10;
        int i11 = i10 + 1;
        this.f37488g = new int[i11];
        this.f37484c = new long[i11];
        this.f37485d = new double[i11];
        this.f37486e = new String[i11];
        this.f37487f = new byte[i11][];
    }

    /* JADX INFO: renamed from: l */
    public static final C6595o m13191l(String str, int i10) {
        C5207g.m11111f(str, "query");
        TreeMap<Integer, C6595o> treeMap = f37481i;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, C6595o> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    C9072e c9072e = C9072e.f47360a;
                    C6595o c6595o = new C6595o(i10);
                    c6595o.f37483b = str;
                    c6595o.f37489h = i10;
                    return c6595o;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                C6595o value = entryCeilingEntry.getValue();
                value.getClass();
                value.f37483b = str;
                value.f37489h = i10;
                return value;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: F0 */
    public final void mo13192F0(double d10, int i10) {
        this.f37488g[i10] = 3;
        this.f37485d[i10] = d10;
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: J0 */
    public final void mo13193J0(int i10) {
        this.f37488g[i10] = 1;
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: W */
    public final void mo13194W(int i10, long j10) {
        this.f37488g[i10] = 2;
        this.f37484c[i10] = j10;
    }

    @Override // p288o4.InterfaceC7919e
    /* JADX INFO: renamed from: a */
    public final void mo13195a(InterfaceC7918d interfaceC7918d) {
        int i10 = this.f37489h;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = this.f37488g[i11];
                if (i12 == 1) {
                    interfaceC7918d.mo13193J0(i11);
                } else if (i12 == 2) {
                    interfaceC7918d.mo13194W(i11, this.f37484c[i11]);
                } else if (i12 == 3) {
                    interfaceC7918d.mo13192F0(this.f37485d[i11], i11);
                } else if (i12 == 4) {
                    String str = this.f37486e[i11];
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    interfaceC7918d.mo13197h0(str, i11);
                } else if (i12 == 5) {
                    byte[] bArr = this.f37487f[i11];
                    if (bArr == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    interfaceC7918d.mo13199r0(bArr, i11);
                }
                if (i11 != i10) {
                    i11++;
                }
            }
        }
    }

    @Override // p288o4.InterfaceC7919e
    /* JADX INFO: renamed from: b */
    public final String mo13196b() {
        String str = this.f37483b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: h0 */
    public final void mo13197h0(String str, int i10) {
        C5207g.m11111f(str, "value");
        this.f37488g[i10] = 4;
        this.f37486e[i10] = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final void m13198q() {
        TreeMap<Integer, C6595o> treeMap = f37481i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f37482a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                C5207g.m11110e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            C9072e c9072e = C9072e.f47360a;
        }
    }

    @Override // p288o4.InterfaceC7918d
    /* JADX INFO: renamed from: r0 */
    public final void mo13199r0(byte[] bArr, int i10) {
        this.f37488g[i10] = 5;
        this.f37487f[i10] = bArr;
    }
}
