package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apy implements aqv, aqu {

    /* JADX INFO: renamed from: a */
    public static final TreeMap f2089a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final long[] f2090b;

    /* JADX INFO: renamed from: c */
    public final double[] f2091c;

    /* JADX INFO: renamed from: d */
    public final String[] f2092d;

    /* JADX INFO: renamed from: e */
    public final byte[][] f2093e;

    /* JADX INFO: renamed from: f */
    private final int f2094f;

    /* JADX INFO: renamed from: g */
    private volatile String f2095g;

    /* JADX INFO: renamed from: h */
    private final int[] f2096h;

    /* JADX INFO: renamed from: i */
    private int f2097i;

    public apy(int i) {
        this.f2094f = i;
        int i2 = i + 1;
        this.f2096h = new int[i2];
        this.f2090b = new long[i2];
        this.f2091c = new double[i2];
        this.f2092d = new String[i2];
        this.f2093e = new byte[i2][];
    }

    /* JADX INFO: renamed from: a */
    public static final apy m1841a(String str, int i) {
        TreeMap treeMap = f2089a;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                apy apyVar = new apy(i);
                apyVar.m1849i(str, i);
                return apyVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            apy apyVar2 = (apy) entryCeilingEntry.getValue();
            apyVar2.m1849i(str, i);
            apyVar2.getClass();
            return apyVar2;
        }
    }

    @Override // p000.aqv
    /* JADX INFO: renamed from: b */
    public final String mo1842b() {
        String str = this.f2095g;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: c */
    public final void mo1843c(int i, byte[] bArr) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: d */
    public final void mo1844d(int i, double d) {
        throw null;
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: e */
    public final void mo1845e(int i, long j) {
        this.f2096h[i] = 2;
        this.f2090b[i] = j;
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: f */
    public final void mo1846f(int i) {
        this.f2096h[i] = 1;
    }

    @Override // p000.aqu
    /* JADX INFO: renamed from: g */
    public final void mo1847g(int i, String str) {
        this.f2096h[i] = 4;
        this.f2092d[i] = str;
    }

    @Override // p000.aqv
    /* JADX INFO: renamed from: h */
    public final void mo1848h(aqu aquVar) {
        int i = this.f2097i;
        if (i <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            switch (this.f2096h[i2]) {
                case 1:
                    aquVar.mo1846f(i2);
                    break;
                case 2:
                    aquVar.mo1845e(i2, this.f2090b[i2]);
                    break;
                case 3:
                    aquVar.mo1844d(i2, this.f2091c[i2]);
                    break;
                case 4:
                    String str = this.f2092d[i2];
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aquVar.mo1847g(i2, str);
                    break;
                    break;
                case 5:
                    byte[] bArr = this.f2093e[i2];
                    if (bArr == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aquVar.mo1843c(i2, bArr);
                    break;
                    break;
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1849i(String str, int i) {
        this.f2095g = str;
        this.f2097i = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m1850j() {
        TreeMap treeMap = f2089a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2094f), this);
            if (treeMap.size() > 15) {
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                for (int size = treeMap.size() - 10; size > 0; size--) {
                    it.next();
                    it.remove();
                }
            }
        }
    }
}
