package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1162m {

    /* JADX INFO: renamed from: a */
    public static final a f7328a = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$a */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f7329a - cVar2.f7329a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo4440a(int i10, int i11);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo4441b(int i10, int i11);

        /* JADX INFO: renamed from: c */
        public abstract void mo4442c(int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f7329a;

        /* JADX INFO: renamed from: b */
        public final int f7330b;

        /* JADX INFO: renamed from: c */
        public final int f7331c;

        public c(int i10, int i11, int i12) {
            this.f7329a = i10;
            this.f7330b = i11;
            this.f7331c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final List<c> f7332a;

        /* JADX INFO: renamed from: b */
        public final int[] f7333b;

        /* JADX INFO: renamed from: c */
        public final int[] f7334c;

        /* JADX INFO: renamed from: d */
        public final b f7335d;

        /* JADX INFO: renamed from: e */
        public final int f7336e;

        /* JADX INFO: renamed from: f */
        public final int f7337f;

        /* JADX INFO: renamed from: g */
        public final boolean f7338g;

        public d(C1146d.a.C10593a c10593a, ArrayList arrayList, int[] iArr, int[] iArr2) {
            b bVar;
            int[] iArr3;
            int[] iArr4;
            int i10;
            int i11;
            this.f7332a = arrayList;
            this.f7333b = iArr;
            this.f7334c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f7335d = c10593a;
            C1146d.a aVar = C1146d.a.this;
            int size = aVar.f7235a.size();
            this.f7336e = size;
            int size2 = aVar.f7236b.size();
            this.f7337f = size2;
            this.f7338g = true;
            c cVar = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar == null || cVar.f7329a != 0 || cVar.f7330b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(size, size2, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                bVar = this.f7335d;
                iArr3 = this.f7334c;
                iArr4 = this.f7333b;
                if (!zHasNext) {
                    break;
                }
                c cVar2 = (c) it.next();
                for (int i12 = 0; i12 < cVar2.f7331c; i12++) {
                    int i13 = cVar2.f7329a + i12;
                    int i14 = cVar2.f7330b + i12;
                    int i15 = bVar.mo4440a(i13, i14) ? 1 : 2;
                    iArr4[i13] = (i14 << 4) | i15;
                    iArr3[i14] = (i13 << 4) | i15;
                }
            }
            if (this.f7338g) {
                Iterator it2 = arrayList.iterator();
                int i16 = 0;
                while (it2.hasNext()) {
                    c cVar3 = (c) it2.next();
                    while (true) {
                        i10 = cVar3.f7329a;
                        if (i16 < i10) {
                            if (iArr4[i16] != 0) {
                                break;
                                break;
                            }
                            int size3 = arrayList.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 >= size3) {
                                    break;
                                }
                                c cVar4 = (c) arrayList.get(i17);
                                while (true) {
                                    i11 = cVar4.f7330b;
                                    if (i18 < i11) {
                                        if (iArr3[i18] == 0 && bVar.mo4441b(i16, i18)) {
                                            int i19 = bVar.mo4440a(i16, i18) ? 8 : 4;
                                            iArr4[i16] = (i18 << 4) | i19;
                                            iArr3[i18] = i19 | (i16 << 4);
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                                i18 = cVar4.f7331c + i11;
                                i17++;
                            }
                            i16++;
                        }
                    }
                    i16 = cVar3.f7331c + i10;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static f m4496a(ArrayDeque arrayDeque, int i10, boolean z10) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.f7339a == i10 && fVar.f7341c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z10) {
                    fVar2.f7340b--;
                } else {
                    fVar2.f7340b++;
                }
            }
            return fVar;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$e */
    public static abstract class e<T> {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo480a(T t10, T t11);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo481b(T t10, T t11);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final int f7339a;

        /* JADX INFO: renamed from: b */
        public int f7340b;

        /* JADX INFO: renamed from: c */
        public final boolean f7341c;

        public f(int i10, int i11, boolean z10) {
            this.f7339a = i10;
            this.f7340b = i11;
            this.f7341c = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public int f7342a;

        /* JADX INFO: renamed from: b */
        public int f7343b;

        /* JADX INFO: renamed from: c */
        public int f7344c;

        /* JADX INFO: renamed from: d */
        public int f7345d;

        public g() {
        }

        public g(int i10, int i11) {
            this.f7342a = 0;
            this.f7343b = i10;
            this.f7344c = 0;
            this.f7345d = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        public int f7346a;

        /* JADX INFO: renamed from: b */
        public int f7347b;

        /* JADX INFO: renamed from: c */
        public int f7348c;

        /* JADX INFO: renamed from: d */
        public int f7349d;

        /* JADX INFO: renamed from: e */
        public boolean f7350e;

        /* JADX INFO: renamed from: a */
        public final int m4497a() {
            return Math.min(this.f7348c - this.f7346a, this.f7349d - this.f7347b);
        }
    }
}
