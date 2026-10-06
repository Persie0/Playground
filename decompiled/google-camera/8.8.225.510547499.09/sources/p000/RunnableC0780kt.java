package p000;

import android.support.v7.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: kt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0780kt implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f37151a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    static final Comparator f37152b = new C1143ye(1);

    /* JADX INFO: renamed from: d */
    long f37154d;

    /* JADX INFO: renamed from: e */
    public long f37155e;

    /* JADX INFO: renamed from: c */
    public final ArrayList f37153c = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final ArrayList f37156f = new ArrayList();

    /* JADX INFO: renamed from: b */
    private static final C0829mo m14831b(RecyclerView recyclerView, int i, long j) {
        int iM13611c = recyclerView.f1118h.m13611c();
        for (int i2 = 0; i2 < iM13611c; i2++) {
            C0829mo c0829moM1197h = RecyclerView.m1197h(recyclerView.f1118h.m13614f(i2));
            if (c0829moM1197h.f41157c == i && !c0829moM1197h.m16692s()) {
                return null;
            }
        }
        C0818md c0818md = recyclerView.f1116f;
        try {
            recyclerView.m1215N();
            C0829mo c0829moM16326o = c0818md.m16326o(i, j);
            if (c0829moM16326o != null) {
                if (!c0829moM16326o.m16691r() || c0829moM16326o.m16692s()) {
                    c0818md.m16314c(c0829moM16326o, false);
                } else {
                    c0818md.m16321j(c0829moM16326o.f41155a);
                }
            }
            return c0829moM16326o;
        } finally {
            recyclerView.m1217P(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14832a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1129s && this.f37154d == 0) {
            this.f37154d = RecyclerView.m1195aq();
            recyclerView.post(this);
        }
        C0778kr c0778kr = recyclerView.f1074L;
        c0778kr.f36983a = i;
        c0778kr.f36984b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0779ks c0779ks;
        RecyclerView recyclerView;
        WeakReference weakReference;
        RecyclerView recyclerView2;
        C0779ks c0779ks2;
        try {
            adq.m303a("RV Prefetch");
            if (this.f37153c.isEmpty()) {
                this.f37154d = 0L;
            } else {
                int size = this.f37153c.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.f37153c.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView3.getDrawingTime(), jMax);
                    }
                }
                if (jMax == 0) {
                    this.f37154d = 0L;
                } else {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(jMax) + this.f37155e;
                    int size2 = this.f37153c.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.f37153c.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.f1074L.m14737c(recyclerView4, false);
                            i2 += recyclerView4.f1074L.f36986d;
                        }
                    }
                    this.f37156f.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.f37153c.get(i5);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            C0778kr c0778kr = recyclerView5.f1074L;
                            int iAbs = Math.abs(c0778kr.f36983a) + Math.abs(c0778kr.f36984b);
                            int i6 = 0;
                            while (true) {
                                int i7 = c0778kr.f36986d;
                                if (i6 < i7 + i7) {
                                    if (i4 >= this.f37156f.size()) {
                                        c0779ks2 = new C0779ks();
                                        this.f37156f.add(c0779ks2);
                                    } else {
                                        c0779ks2 = (C0779ks) this.f37156f.get(i4);
                                    }
                                    int[] iArr = c0778kr.f36985c;
                                    int i8 = iArr[i6 + 1];
                                    c0779ks2.f37103a = i8 <= iAbs;
                                    c0779ks2.f37104b = iAbs;
                                    c0779ks2.f37105c = i8;
                                    c0779ks2.f37106d = recyclerView5;
                                    c0779ks2.f37107e = iArr[i6];
                                    i4++;
                                    i6 += 2;
                                }
                            }
                        }
                    }
                    Collections.sort(this.f37156f, f37152b);
                    for (int i9 = 0; i9 < this.f37156f.size() && (recyclerView = (c0779ks = (C0779ks) this.f37156f.get(i9)).f37106d) != null; i9++) {
                        C0829mo c0829moM14831b = m14831b(recyclerView, c0779ks.f37107e, true != c0779ks.f37103a ? nanos : Long.MAX_VALUE);
                        if (c0829moM14831b != null && (weakReference = c0829moM14831b.f41156b) != null && c0829moM14831b.m16691r() && !c0829moM14831b.m16692s() && (recyclerView2 = (RecyclerView) weakReference.get()) != null) {
                            if (recyclerView2.f1136z && recyclerView2.f1118h.m13611c() != 0) {
                                recyclerView2.m1222U();
                            }
                            C0778kr c0778kr2 = recyclerView2.f1074L;
                            c0778kr2.m14737c(recyclerView2, true);
                            if (c0778kr2.f36986d != 0) {
                                try {
                                    adq.m303a("RV Nested Prefetch");
                                    C0826ml c0826ml = recyclerView2.f1075M;
                                    AbstractC0806ls abstractC0806ls = recyclerView2.f1123m;
                                    c0826ml.f40919d = 1;
                                    c0826ml.f40920e = abstractC0806ls.mo1762a();
                                    c0826ml.f40922g = false;
                                    c0826ml.f40923h = false;
                                    c0826ml.f40924i = false;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = c0778kr2.f36986d;
                                        if (i10 >= i11 + i11) {
                                            break;
                                        }
                                        m14831b(recyclerView2, c0778kr2.f36985c[i10], nanos);
                                        i10 += 2;
                                        this.f37154d = 0L;
                                        adq.m304b();
                                        throw th;
                                    }
                                    adq.m304b();
                                } catch (Throwable th) {
                                    adq.m304b();
                                    throw th;
                                }
                            }
                        }
                        c0779ks.f37103a = false;
                        c0779ks.f37104b = 0;
                        c0779ks.f37105c = 0;
                        c0779ks.f37106d = null;
                        c0779ks.f37107e = 0;
                    }
                    this.f37154d = 0L;
                }
            }
            adq.m304b();
        } catch (Throwable th2) {
            this.f37154d = 0L;
            adq.m304b();
            throw th2;
        }
    }
}
