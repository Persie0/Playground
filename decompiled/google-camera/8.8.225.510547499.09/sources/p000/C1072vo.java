package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: vo */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1072vo implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public static final CancellationException f47856a = new CancellationException();

    /* JADX INFO: renamed from: c */
    public boolean f47858c;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f47857b = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public long f47859d = 1;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ols] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, opx] */
    /* JADX INFO: renamed from: a */
    public final void m19507a(long j) {
        synchronized (this.f47857b) {
            if (this.f47858c) {
                return;
            }
            this.f47859d += j;
            ArrayList<C1071vn> arrayList = null;
            if (!this.f47857b.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (!this.f47857b.isEmpty()) {
                    Object objPeek = this.f47857b.peek();
                    objPeek.getClass();
                    C1071vn c1071vn = (C1071vn) objPeek;
                    if ((((opy) c1071vn.f47854a).m18888n() instanceof oqa) || c1071vn.f47854a.mo18873h()) {
                        this.f47857b.remove();
                    } else {
                        long jMin = Math.min(this.f47859d, 1L);
                        if (jMin < 1) {
                            break;
                        }
                        this.f47859d -= jMin;
                        c1071vn.f47855b = new C1070vm(this, jMin);
                        Object objRemove = this.f47857b.remove();
                        objRemove.getClass();
                        arrayList2.add(objRemove);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            if (arrayList != null) {
                for (C1071vn c1071vn2 : arrayList) {
                    ?? r0 = c1071vn2.f47854a;
                    Object obj = c1071vn2.f47855b;
                    obj.getClass();
                    r0.mo18640e(obj);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, opx] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47857b) {
            if (this.f47858c) {
                return;
            }
            this.f47858c = true;
            Iterator it = this.f47857b.iterator();
            while (it.hasNext()) {
                ((C1071vn) it.next()).f47854a.mo18876k(null);
            }
            this.f47857b.clear();
        }
    }
}
