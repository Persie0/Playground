package p258m6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: m6.i */
/* JADX INFO: loaded from: classes.dex */
public class C7489i<T, Y> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f41374a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f41375b;

    /* JADX INFO: renamed from: c */
    public long f41376c;

    /* JADX INFO: renamed from: m6.i$a */
    public static final class a<Y> {

        /* JADX INFO: renamed from: a */
        public final Y f41377a;

        /* JADX INFO: renamed from: b */
        public final int f41378b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, Object obj) {
            this.f41377a = obj;
            this.f41378b = i10;
        }
    }

    public C7489i(long j10) {
        this.f41375b = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized Y m14873a(T t10) {
        a aVar;
        aVar = (a) this.f41374a.get(t10);
        return aVar != null ? aVar.f41377a : null;
    }

    /* JADX INFO: renamed from: b */
    public int mo14874b(Y y10) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo14875c(T t10, Y y10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized Y m14876d(T t10, Y y10) {
        int iMo14874b = mo14874b(y10);
        long j10 = iMo14874b;
        Y y11 = null;
        if (j10 >= this.f41375b) {
            mo14875c(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f41376c += j10;
        }
        a aVar = (a) this.f41374a.put(t10, y10 == null ? null : new a(iMo14874b, y10));
        if (aVar != null) {
            this.f41376c -= (long) aVar.f41378b;
            if (!aVar.f41377a.equals(y10)) {
                mo14875c(t10, aVar.f41377a);
            }
        }
        m14877e(this.f41375b);
        if (aVar != null) {
            y11 = aVar.f41377a;
        }
        return y11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m14877e(long j10) {
        while (this.f41376c > j10) {
            try {
                Iterator it = this.f41374a.entrySet().iterator();
                Map.Entry entry = (Map.Entry) it.next();
                a aVar = (a) entry.getValue();
                this.f41376c -= (long) aVar.f41378b;
                Object key = entry.getKey();
                it.remove();
                mo14875c(key, aVar.f41377a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
