package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1146d<T> {

    /* JADX INFO: renamed from: h */
    public static final c f7227h = new c();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1171v f7228a;

    /* JADX INFO: renamed from: b */
    public final C1144c<T> f7229b;

    /* JADX INFO: renamed from: e */
    public List<T> f7232e;

    /* JADX INFO: renamed from: g */
    public int f7234g;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f7231d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public List<T> f7233f = Collections.emptyList();

    /* JADX INFO: renamed from: c */
    public final c f7230c = f7227h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f7235a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f7236b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f7237c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f7238d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C10593a extends C1162m.b {
            public C10593a() {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // androidx.recyclerview.widget.C1162m.b
            /* JADX INFO: renamed from: a */
            public final boolean mo4440a(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f7235a.get(i10);
                Object obj2 = aVar.f7236b.get(i11);
                if (obj != null && obj2 != null) {
                    return C1146d.this.f7229b.f7222b.mo480a((T) obj, (T) obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C1162m.b
            /* JADX INFO: renamed from: b */
            public final boolean mo4441b(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f7235a.get(i10);
                Object obj2 = aVar.f7236b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C1146d.this.f7229b.f7222b.mo481b((T) obj, (T) obj2);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // androidx.recyclerview.widget.C1162m.b
            /* JADX INFO: renamed from: c */
            public final void mo4442c(int i10, int i11) {
                a aVar = a.this;
                Object obj = aVar.f7235a.get(i10);
                Object obj2 = aVar.f7236b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                C1146d.this.f7229b.f7222b.getClass();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1162m.d f7241a;

            public b(C1162m.d dVar) {
                this.f7241a = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr;
                int i10;
                C1162m.b bVar;
                int i11;
                C1162m.d dVar;
                C1146d c1146d;
                int i12;
                int i13;
                a aVar = a.this;
                C1146d c1146d2 = C1146d.this;
                if (c1146d2.f7234g == aVar.f7237c) {
                    List<T> list = c1146d2.f7233f;
                    List<T> list2 = aVar.f7236b;
                    c1146d2.f7232e = list2;
                    c1146d2.f7233f = Collections.unmodifiableList(list2);
                    C1162m.d dVar2 = this.f7241a;
                    dVar2.getClass();
                    InterfaceC1171v interfaceC1171v = c1146d2.f7228a;
                    C1148e c1148e = interfaceC1171v instanceof C1148e ? (C1148e) interfaceC1171v : new C1148e(interfaceC1171v);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    List<C1162m.c> list3 = dVar2.f7332a;
                    int size = list3.size() - 1;
                    int i14 = dVar2.f7336e;
                    int i15 = dVar2.f7337f;
                    int i16 = i14;
                    while (size >= 0) {
                        C1162m.c cVar = list3.get(size);
                        int i17 = cVar.f7329a;
                        int i18 = cVar.f7331c;
                        int i19 = i17 + i18;
                        int i20 = cVar.f7330b;
                        int i21 = i18 + i20;
                        List<C1162m.c> list4 = list3;
                        while (true) {
                            iArr = dVar2.f7333b;
                            i10 = i20;
                            bVar = dVar2.f7335d;
                            if (i16 <= i19) {
                                break;
                            }
                            i16--;
                            int i22 = iArr[i16];
                            if ((i22 & 12) != 0) {
                                i12 = i15;
                                int i23 = i22 >> 4;
                                i13 = i19;
                                C1162m.f fVarM4496a = C1162m.d.m4496a(arrayDeque, i23, false);
                                if (fVarM4496a != null) {
                                    c1146d = c1146d2;
                                    int i24 = (i14 - fVarM4496a.f7340b) - 1;
                                    c1148e.mo4426a(i16, i24);
                                    if ((i22 & 4) != 0) {
                                        bVar.mo4442c(i16, i23);
                                        c1148e.mo4429d(i24, 1, null);
                                    }
                                } else {
                                    c1146d = c1146d2;
                                    arrayDeque.add(new C1162m.f(i16, (i14 - i16) - 1, true));
                                }
                            } else {
                                c1146d = c1146d2;
                                i12 = i15;
                                i13 = i19;
                                c1148e.mo4428c(i16, 1);
                                i14--;
                            }
                            i20 = i10;
                            i15 = i12;
                            i19 = i13;
                            c1146d2 = c1146d;
                        }
                        C1146d c1146d3 = c1146d2;
                        while (i15 > i21) {
                            i15--;
                            int i25 = dVar2.f7334c[i15];
                            if ((i25 & 12) != 0) {
                                int i26 = i25 >> 4;
                                i11 = i21;
                                dVar = dVar2;
                                C1162m.f fVarM4496a2 = C1162m.d.m4496a(arrayDeque, i26, true);
                                if (fVarM4496a2 == null) {
                                    arrayDeque.add(new C1162m.f(i15, i14 - i16, false));
                                } else {
                                    c1148e.mo4426a((i14 - fVarM4496a2.f7340b) - 1, i16);
                                    if ((i25 & 4) != 0) {
                                        bVar.mo4442c(i26, i15);
                                        c1148e.mo4429d(i16, 1, null);
                                    }
                                }
                            } else {
                                i11 = i21;
                                dVar = dVar2;
                                c1148e.mo4427b(i16, 1);
                                i14++;
                            }
                            i21 = i11;
                            dVar2 = dVar;
                        }
                        C1162m.d dVar3 = dVar2;
                        i16 = cVar.f7329a;
                        int i27 = i16;
                        int i28 = i10;
                        for (int i29 = 0; i29 < i18; i29++) {
                            if ((iArr[i27] & 15) == 2) {
                                bVar.mo4442c(i27, i28);
                                c1148e.mo4429d(i27, 1, null);
                            }
                            i27++;
                            i28++;
                        }
                        size--;
                        list3 = list4;
                        i15 = i10;
                        dVar2 = dVar3;
                        c1146d2 = c1146d3;
                    }
                    c1148e.m4449e();
                    c1146d2.m4438a(list, aVar.f7238d);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f7235a = list;
            this.f7236b = list2;
            this.f7237c = i10;
            this.f7238d = runnable;
        }

        /* JADX WARN: Code duplicated, block: B:133:0x0109 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:50:0x0107  */
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList;
            ArrayList arrayList2;
            C1162m.g gVar;
            C1162m.h hVar;
            ArrayList arrayList3;
            ArrayList arrayList4;
            C1162m.g gVar2;
            C1162m.c cVar;
            int i10;
            int i11;
            boolean z10;
            C1162m.h hVar2;
            C1162m.h hVar3;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            C10593a c10593a = new C10593a();
            int size = this.f7235a.size();
            int size2 = this.f7236b.size();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(new C1162m.g(size, size2));
            int i21 = size + size2;
            int i22 = 1;
            int i23 = (((i21 + 1) / 2) * 2) + 1;
            int[] iArr = new int[i23];
            int i24 = i23 / 2;
            int[] iArr2 = new int[i23];
            ArrayList arrayList7 = new ArrayList();
            while (!arrayList6.isEmpty()) {
                C1162m.g gVar3 = (C1162m.g) arrayList6.remove(arrayList6.size() - i22);
                int i25 = gVar3.f7343b;
                int i26 = gVar3.f7342a;
                int i27 = i25 - i26;
                if (i27 >= i22 && (i10 = gVar3.f7345d - gVar3.f7344c) >= i22) {
                    int i28 = ((i10 + i27) + i22) / 2;
                    int i29 = i22 + i24;
                    iArr[i29] = i26;
                    iArr2[i29] = i25;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= i28) {
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            gVar = gVar3;
                            hVar = null;
                            break;
                        }
                        int i31 = Math.abs((gVar3.f7343b - gVar3.f7342a) - (gVar3.f7345d - gVar3.f7344c)) % 2 == i22 ? i22 : 0;
                        int i32 = (gVar3.f7343b - gVar3.f7342a) - (gVar3.f7345d - gVar3.f7344c);
                        int i33 = -i30;
                        int i34 = i33;
                        while (true) {
                            if (i34 > i30) {
                                arrayList = arrayList6;
                                arrayList2 = arrayList7;
                                i11 = i28;
                                z10 = false;
                                hVar2 = null;
                                break;
                            }
                            if (i34 != i33) {
                                if (i34 != i30) {
                                    i11 = i28;
                                    if (iArr[i34 + 1 + i24] > iArr[(i34 - 1) + i24]) {
                                    }
                                    arrayList = arrayList6;
                                    i17 = ((i16 - gVar3.f7342a) + gVar3.f7344c) - i34;
                                    if (i30 == 0 && i16 == i15) {
                                        i18 = i17 - 1;
                                    } else {
                                        i18 = i17;
                                    }
                                    arrayList2 = arrayList7;
                                    while (i16 < gVar3.f7343b && i17 < gVar3.f7345d && c10593a.mo4441b(i16, i17)) {
                                        i16++;
                                        i17++;
                                    }
                                    iArr[i34 + i24] = i16;
                                    if (i31 != 0) {
                                        i20 = i32 - i34;
                                        i19 = i31;
                                        if (i20 < i33 + 1 && i20 <= i30 - 1 && iArr2[i20 + i24] <= i16) {
                                            hVar2 = new C1162m.h();
                                            hVar2.f7346a = i15;
                                            hVar2.f7347b = i18;
                                            hVar2.f7348c = i16;
                                            hVar2.f7349d = i17;
                                            z10 = false;
                                            hVar2.f7350e = false;
                                            break;
                                        }
                                    } else {
                                        i19 = i31;
                                    }
                                    i34 += 2;
                                    arrayList6 = arrayList;
                                    i28 = i11;
                                    arrayList7 = arrayList2;
                                    i31 = i19;
                                } else {
                                    i11 = i28;
                                }
                                i15 = iArr[(i34 - 1) + i24];
                                i16 = i15 + 1;
                                arrayList = arrayList6;
                                i17 = ((i16 - gVar3.f7342a) + gVar3.f7344c) - i34;
                                if (i30 == 0) {
                                    i18 = i17;
                                } else {
                                    i18 = i17;
                                }
                                arrayList2 = arrayList7;
                                while (i16 < gVar3.f7343b) {
                                    i16++;
                                    i17++;
                                }
                                iArr[i34 + i24] = i16;
                                if (i31 != 0) {
                                    i20 = i32 - i34;
                                    i19 = i31;
                                    if (i20 < i33 + 1) {
                                        continue;
                                    }
                                } else {
                                    i19 = i31;
                                }
                                i34 += 2;
                                arrayList6 = arrayList;
                                i28 = i11;
                                arrayList7 = arrayList2;
                                i31 = i19;
                            } else {
                                i11 = i28;
                            }
                            i15 = iArr[i34 + 1 + i24];
                            i16 = i15;
                            arrayList = arrayList6;
                            i17 = ((i16 - gVar3.f7342a) + gVar3.f7344c) - i34;
                            if (i30 == 0) {
                                i18 = i17;
                            } else {
                                i18 = i17;
                            }
                            arrayList2 = arrayList7;
                            while (i16 < gVar3.f7343b) {
                                i16++;
                                i17++;
                            }
                            iArr[i34 + i24] = i16;
                            if (i31 != 0) {
                                i20 = i32 - i34;
                                i19 = i31;
                                if (i20 < i33 + 1) {
                                    continue;
                                }
                            } else {
                                i19 = i31;
                            }
                            i34 += 2;
                            arrayList6 = arrayList;
                            i28 = i11;
                            arrayList7 = arrayList2;
                            i31 = i19;
                        }
                        if (hVar2 != null) {
                            hVar = hVar2;
                            gVar = gVar3;
                            break;
                        }
                        int i35 = (gVar3.f7343b - gVar3.f7342a) - (gVar3.f7345d - gVar3.f7344c);
                        boolean z11 = i35 % 2 == 0 ? true : z10;
                        int i36 = i33;
                        while (true) {
                            if (i36 > i30) {
                                gVar = gVar3;
                                hVar3 = null;
                                break;
                            }
                            if (i36 == i33 || (i36 != i30 && iArr2[i36 + 1 + i24] < iArr2[(i36 - 1) + i24])) {
                                i12 = iArr2[i36 + 1 + i24];
                                i13 = i12;
                            } else {
                                i12 = iArr2[(i36 - 1) + i24];
                                i13 = i12 - 1;
                            }
                            int i37 = gVar3.f7345d - ((gVar3.f7343b - i13) - i36);
                            int i38 = (i30 == 0 || i13 != i12) ? i37 : i37 + 1;
                            while (true) {
                                if (i13 > gVar3.f7342a && i37 > gVar3.f7344c) {
                                    int i39 = i13 - 1;
                                    gVar = gVar3;
                                    int i40 = i37 - 1;
                                    if (!c10593a.mo4441b(i39, i40)) {
                                        break;
                                    }
                                    i13 = i39;
                                    i37 = i40;
                                    gVar3 = gVar;
                                } else {
                                    gVar = gVar3;
                                    break;
                                }
                            }
                            iArr2[i36 + i24] = i13;
                            if (z11 && (i14 = i35 - i36) >= i33 && i14 <= i30 && iArr[i14 + i24] >= i13) {
                                hVar3 = new C1162m.h();
                                hVar3.f7346a = i13;
                                hVar3.f7347b = i37;
                                hVar3.f7348c = i12;
                                hVar3.f7349d = i38;
                                hVar3.f7350e = true;
                                break;
                            }
                            i36 += 2;
                            gVar3 = gVar;
                        }
                        if (hVar3 != null) {
                            hVar = hVar3;
                            break;
                        }
                        i30++;
                        arrayList6 = arrayList;
                        i28 = i11;
                        arrayList7 = arrayList2;
                        gVar3 = gVar;
                        i22 = 1;
                    }
                } else {
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    gVar = gVar3;
                    hVar = null;
                    break;
                }
                if (hVar != null) {
                    if (hVar.m4497a() > 0) {
                        int i41 = hVar.f7349d;
                        int i42 = hVar.f7347b;
                        int i43 = i41 - i42;
                        int i44 = hVar.f7348c;
                        int i45 = hVar.f7346a;
                        int i46 = i44 - i45;
                        if (!(i43 != i46)) {
                            cVar = new C1162m.c(i45, i42, i46);
                        } else if (hVar.f7350e) {
                            cVar = new C1162m.c(i45, i42, hVar.m4497a());
                        } else {
                            cVar = i43 > i46 ? new C1162m.c(i45, i42 + 1, hVar.m4497a()) : new C1162m.c(i45 + 1, i42, hVar.m4497a());
                        }
                        arrayList5.add(cVar);
                    }
                    if (arrayList2.isEmpty()) {
                        gVar2 = new C1162m.g();
                        arrayList4 = arrayList2;
                        i22 = 1;
                    } else {
                        i22 = 1;
                        arrayList4 = arrayList2;
                        gVar2 = (C1162m.g) arrayList4.remove(arrayList2.size() - 1);
                    }
                    gVar2.f7342a = gVar.f7342a;
                    gVar2.f7344c = gVar.f7344c;
                    gVar2.f7343b = hVar.f7346a;
                    gVar2.f7345d = hVar.f7347b;
                    arrayList3 = arrayList;
                    arrayList3.add(gVar2);
                    gVar.f7343b = gVar.f7343b;
                    gVar.f7345d = gVar.f7345d;
                    gVar.f7342a = hVar.f7348c;
                    gVar.f7344c = hVar.f7349d;
                    arrayList3.add(gVar);
                } else {
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    i22 = 1;
                    arrayList4.add(gVar);
                }
                ArrayList arrayList8 = arrayList3;
                arrayList7 = arrayList4;
                arrayList6 = arrayList8;
            }
            Collections.sort(arrayList5, C1162m.f7328a);
            C1146d.this.f7230c.execute(new b(new C1162m.d(c10593a, arrayList5, iArr, iArr2)));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        void mo4443a();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f7243a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f7243a.post(runnable);
        }
    }

    public C1146d(C1142b c1142b, C1144c c1144c) {
        this.f7228a = c1142b;
        this.f7229b = c1144c;
    }

    /* JADX INFO: renamed from: a */
    public final void m4438a(List<T> list, Runnable runnable) {
        Iterator it = this.f7231d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo4443a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4439b(List<T> list, Runnable runnable) {
        int i10 = this.f7234g + 1;
        this.f7234g = i10;
        List<T> list2 = this.f7232e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        List<T> list3 = this.f7233f;
        InterfaceC1171v interfaceC1171v = this.f7228a;
        if (list == null) {
            int size = list2.size();
            this.f7232e = null;
            this.f7233f = Collections.emptyList();
            interfaceC1171v.mo4428c(0, size);
            m4438a(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f7229b.f7221a.execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f7232e = list;
        this.f7233f = Collections.unmodifiableList(list);
        interfaceC1171v.mo4427b(0, list.size());
        m4438a(list3, runnable);
    }
}
