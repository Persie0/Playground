package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p389t2.C9191j;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1164o implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<RunnableC1164o> f7386e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static final a f7387f = new a();

    /* JADX INFO: renamed from: b */
    public long f7389b;

    /* JADX INFO: renamed from: c */
    public long f7390c;

    /* JADX INFO: renamed from: a */
    public final ArrayList<RecyclerView> f7388a = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<c> f7391d = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$a */
    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
        
            if (r0 != false) goto L15;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f7399d;
            if ((recyclerView == null) != (cVar4.f7399d == null)) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z10 = cVar3.f7396a;
            if (z10 == cVar4.f7396a) {
                int i10 = cVar4.f7397b - cVar3.f7397b;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = cVar3.f7398c - cVar4.f7398c;
                if (i11 != 0) {
                    return i11;
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$b */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.AbstractC1120m.c {

        /* JADX INFO: renamed from: a */
        public int f7392a;

        /* JADX INFO: renamed from: b */
        public int f7393b;

        /* JADX INFO: renamed from: c */
        public int[] f7394c;

        /* JADX INFO: renamed from: d */
        public int f7395d;

        /* JADX INFO: renamed from: a */
        public final void m4505a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f7395d * 2;
            int[] iArr = this.f7394c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f7394c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i12 * 2];
                this.f7394c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f7394c;
            iArr4[i12] = i10;
            iArr4[i12 + 1] = i11;
            this.f7395d++;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX INFO: renamed from: b */
        public final void m4506b(RecyclerView recyclerView, boolean z10) {
            int i10;
            this.f7395d = 0;
            int[] iArr = this.f7394c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1120m abstractC1120m = recyclerView.f6973I;
            if (recyclerView.f6971H != null && abstractC1120m != null && abstractC1120m.f7092i) {
                if (z10) {
                    if (!recyclerView.f7010e.m4417g()) {
                        abstractC1120m.mo4146k(recyclerView.f6971H.mo4226e(), this);
                    }
                    i10 = this.f7395d;
                    if (i10 > abstractC1120m.f7093j) {
                        abstractC1120m.f7093j = i10;
                        abstractC1120m.f7094k = z10;
                        recyclerView.f7006c.m4355n();
                    }
                } else {
                    if (!(!recyclerView.f6989Q || recyclerView.f7007c0 || recyclerView.f7010e.m4417g())) {
                        abstractC1120m.mo4144j(this.f7392a, this.f7393b, recyclerView.f6967D0, this);
                    }
                }
                i10 = this.f7395d;
                if (i10 > abstractC1120m.f7093j) {
                    abstractC1120m.f7093j = i10;
                    abstractC1120m.f7094k = z10;
                    recyclerView.f7006c.m4355n();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.o$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f7396a;

        /* JADX INFO: renamed from: b */
        public int f7397b;

        /* JADX INFO: renamed from: c */
        public int f7398c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f7399d;

        /* JADX INFO: renamed from: e */
        public int f7400e;
    }

    /* JADX INFO: renamed from: c */
    public static RecyclerView.AbstractC1109b0 m4502c(RecyclerView recyclerView, int i10, long j10) {
        boolean z10;
        int iM4462h = recyclerView.f7012f.m4462h();
        int i11 = 0;
        while (true) {
            if (i11 >= iM4462h) {
                z10 = false;
                break;
            }
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(recyclerView.f7012f.m4461g(i11));
            if (abstractC1109b0M4161L.f7056c == i10 && !abstractC1109b0M4161L.m4246i()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.C1127t c1127t = recyclerView.f7006c;
        try {
            recyclerView.m4184R();
            RecyclerView.AbstractC1109b0 abstractC1109b0M4353l = c1127t.m4353l(i10, j10);
            if (abstractC1109b0M4353l != null) {
                if (!abstractC1109b0M4353l.m4245h() || abstractC1109b0M4353l.m4246i()) {
                    c1127t.m4342a(abstractC1109b0M4353l, false);
                } else {
                    c1127t.m4350i(abstractC1109b0M4353l.f7054a);
                }
            }
            recyclerView.m4185S(false);
            return abstractC1109b0M4353l;
        } catch (Throwable th2) {
            recyclerView.m4185S(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4503a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f7389b == 0) {
            this.f7389b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f6966C0;
        bVar.f7392a = i10;
        bVar.f7393b = i11;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX INFO: renamed from: b */
    public final void m4504b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f7388a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = arrayList.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f6966C0;
                bVar.m4506b(recyclerView3, false);
                i10 += bVar.f7395d;
            }
        }
        ArrayList<c> arrayList2 = this.f7391d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = arrayList.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f6966C0;
                int iAbs = Math.abs(bVar2.f7393b) + Math.abs(bVar2.f7392a);
                for (int i14 = 0; i14 < bVar2.f7395d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.f7394c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f7396a = i15 <= iAbs;
                    cVar2.f7397b = iAbs;
                    cVar2.f7398c = i15;
                    cVar2.f7399d = recyclerView4;
                    cVar2.f7400e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f7387f);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i16)).f7399d) != null; i16++) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4502c = m4502c(recyclerView, cVar.f7400e, cVar.f7396a ? Long.MAX_VALUE : j10);
            if (abstractC1109b0M4502c != null && abstractC1109b0M4502c.f7055b != null && abstractC1109b0M4502c.m4245h() && !abstractC1109b0M4502c.m4246i() && (recyclerView2 = abstractC1109b0M4502c.f7055b.get()) != null) {
                if (recyclerView2.f7007c0 && recyclerView2.f7012f.m4462h() != 0) {
                    RecyclerView.AbstractC1117j abstractC1117j = recyclerView2.f7025l0;
                    if (abstractC1117j != null) {
                        abstractC1117j.mo4277f();
                    }
                    RecyclerView.AbstractC1120m abstractC1120m = recyclerView2.f6973I;
                    RecyclerView.C1127t c1127t = recyclerView2.f7006c;
                    if (abstractC1120m != null) {
                        abstractC1120m.m4315m0(c1127t);
                        recyclerView2.f6973I.m4316n0(c1127t);
                    }
                    c1127t.f7116a.clear();
                    c1127t.m4348g();
                }
                b bVar3 = recyclerView2.f6966C0;
                bVar3.m4506b(recyclerView2, true);
                if (bVar3.f7395d != 0) {
                    try {
                        int i17 = C9191j.f47731a;
                        C9191j.a.m17531a("RV Nested Prefetch");
                        RecyclerView.C1131x c1131x = recyclerView2.f6967D0;
                        RecyclerView.Adapter adapter = recyclerView2.f6971H;
                        c1131x.f7143d = 1;
                        c1131x.f7144e = adapter.mo4226e();
                        c1131x.f7146g = false;
                        c1131x.f7147h = false;
                        c1131x.f7148i = false;
                        for (int i18 = 0; i18 < bVar3.f7395d * 2; i18 += 2) {
                            m4502c(recyclerView2, bVar3.f7394c[i18], j10);
                        }
                        C9191j.a.m17532b();
                    } catch (Throwable th2) {
                        int i19 = C9191j.f47731a;
                        C9191j.a.m17532b();
                        throw th2;
                    }
                }
            }
            cVar.f7396a = false;
            cVar.f7397b = 0;
            cVar.f7398c = 0;
            cVar.f7399d = null;
            cVar.f7400e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = C9191j.f47731a;
            C9191j.a.m17531a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f7388a;
            if (arrayList.isEmpty()) {
                this.f7389b = 0L;
                C9191j.a.m17532b();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f7389b = 0L;
                C9191j.a.m17532b();
            } else {
                m4504b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7390c);
                this.f7389b = 0L;
                C9191j.a.m17532b();
            }
        } catch (Throwable th2) {
            this.f7389b = 0L;
            int i12 = C9191j.f47731a;
            C9191j.a.m17532b();
            throw th2;
        }
    }
}
