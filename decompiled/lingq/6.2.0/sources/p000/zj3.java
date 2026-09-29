package p000;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zj3 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f71642e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final ma3 f71643f = new ma3(16);

    /* JADX INFO: renamed from: b */
    public long f71645b;

    /* JADX INFO: renamed from: c */
    public long f71646c;

    /* JADX INFO: renamed from: a */
    public final ArrayList f71644a = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f71647d = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static o38 m25675c(RecyclerView recyclerView, int i, long j) {
        int iM22549j = recyclerView.f6653f.m22549j();
        for (int i2 = 0; i2 < iM22549j; i2++) {
            o38 o38VarM2699N = RecyclerView.m2699N(recyclerView.f6653f.m22548i(i2));
            if (o38VarM2699N.f53783c == i && !o38VarM2699N.m17788h()) {
                return null;
            }
        }
        g38 g38Var = recyclerView.f6647c;
        if (j == Long.MAX_VALUE) {
            try {
                if (f8d.m11606b()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.m2727V(false);
                Trace.endSection();
            }
        }
        recyclerView.m2726U();
        o38 o38VarM12340l = g38Var.m12340l(i, j);
        if (o38VarM12340l != null) {
            if (!o38VarM12340l.m17787g() || o38VarM12340l.m17788h()) {
                g38Var.m12329a(o38VarM12340l, false);
            } else {
                g38Var.m12337i(o38VarM12340l.f53781a);
            }
        }
        return o38VarM12340l;
    }

    /* JADX INFO: renamed from: a */
    public final void m25676a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f6623N) {
            if (RecyclerView.f6595X0 && !this.f71644a.contains(recyclerView)) {
                C3386nv.m17633t("attempting to post unregistered view!");
                return;
            } else if (this.f71645b == 0) {
                this.f71645b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        pj3 pj3Var = recyclerView.f6605B0;
        pj3Var.f56311b = i;
        pj3Var.f56312c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: b */
    public final void m25677b(long j) {
        yj3 yj3Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        yj3 yj3Var2;
        ArrayList arrayList = this.f71644a;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            pj3 pj3Var = recyclerView3.f6605B0;
            if (windowVisibility == 0) {
                pj3Var.m19197c(recyclerView3, false);
                i += pj3Var.f56313d;
            }
        }
        ArrayList arrayList2 = this.f71647d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                pj3 pj3Var2 = recyclerView4.f6605B0;
                int iAbs = Math.abs(pj3Var2.f56312c) + Math.abs(pj3Var2.f56311b);
                for (?? r11 = z; r11 < pj3Var2.f56313d * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        yj3Var2 = new yj3();
                        arrayList2.add(yj3Var2);
                    } else {
                        yj3Var2 = (yj3) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) pj3Var2.f56314e;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    yj3Var2.f69905a = z;
                    yj3Var2.f69906b = iAbs;
                    yj3Var2.f69907c = i5;
                    yj3Var2.f69908d = recyclerView4;
                    yj3Var2.f69909e = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f71643f);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (yj3Var = (yj3) arrayList2.get(i6)).f69908d) != null; i6++) {
            o38 o38VarM25675c = m25675c(recyclerView, yj3Var.f69909e, yj3Var.f69905a ? Long.MAX_VALUE : j);
            if (o38VarM25675c != null && o38VarM25675c.f53782b != null && o38VarM25675c.m17787g() && !o38VarM25675c.m17788h() && (recyclerView2 = (RecyclerView) o38VarM25675c.f53782b.get()) != null) {
                if (recyclerView2.f6646b0 && recyclerView2.f6653f.m22549j() != 0) {
                    g38 g38Var = recyclerView2.f6647c;
                    v28 v28Var = recyclerView2.f6664k0;
                    if (v28Var != null) {
                        v28Var.mo152e();
                    }
                    y28 y28Var = recyclerView2.f6613I;
                    if (y28Var != null) {
                        y28Var.m24898o0(g38Var);
                        recyclerView2.f6613I.m24900p0(g38Var);
                    }
                    g38Var.f40123a.clear();
                    g38Var.m12335g();
                }
                pj3 pj3Var3 = recyclerView2.f6605B0;
                pj3Var3.m19197c(recyclerView2, true);
                if (pj3Var3.f56313d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        k38 k38Var = recyclerView2.f6606C0;
                        p28 p28Var = recyclerView2.f6611H;
                        k38Var.f46630d = 1;
                        k38Var.f46631e = p28Var.mo6133a();
                        k38Var.f46633g = false;
                        k38Var.f46634h = false;
                        k38Var.f46635i = false;
                        for (int i7 = 0; i7 < pj3Var3.f56313d * 2; i7 += 2) {
                            m25675c(recyclerView2, ((int[]) pj3Var3.f56314e)[i7], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            yj3Var.f69905a = false;
            yj3Var.f69906b = 0;
            yj3Var.f69907c = 0;
            yj3Var.f69908d = null;
            yj3Var.f69909e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f71644a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m25677b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f71646c);
                }
            }
        } finally {
            this.f71645b = 0L;
            Trace.endSection();
        }
    }
}
