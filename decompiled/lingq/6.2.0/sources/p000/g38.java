package p000;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g38 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40123a;

    /* JADX INFO: renamed from: b */
    public ArrayList f40124b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f40125c;

    /* JADX INFO: renamed from: d */
    public final List f40126d;

    /* JADX INFO: renamed from: e */
    public int f40127e;

    /* JADX INFO: renamed from: f */
    public int f40128f;

    /* JADX INFO: renamed from: g */
    public f38 f40129g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f40130h;

    public g38(RecyclerView recyclerView) {
        this.f40130h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f40123a = arrayList;
        this.f40124b = null;
        this.f40125c = new ArrayList();
        this.f40126d = Collections.unmodifiableList(arrayList);
        this.f40127e = 2;
        this.f40128f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m12329a(o38 o38Var, boolean z) {
        RecyclerView.m2706l(o38Var);
        View view = o38Var.f53781a;
        RecyclerView recyclerView = this.f40130h;
        q38 q38Var = recyclerView.f6616J0;
        if (q38Var != null) {
            p38 p38Var = q38Var.f57195e;
            dta.m10640k(view, p38Var != null ? (C3133j3) p38Var.f55531e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.f6615J;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ho2.m13383c();
                return;
            }
            p28 p28Var = recyclerView.f6611H;
            if (p28Var != null) {
                p28Var.mo13585j(o38Var);
            }
            if (recyclerView.f6606C0 != null) {
                recyclerView.f6655g.m19911k(o38Var);
            }
            if (RecyclerView.f6596Y0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + o38Var);
            }
        }
        o38Var.f53799s = null;
        o38Var.f53798r = null;
        f38 f38VarM12331c = m12331c();
        f38VarM12331c.getClass();
        int i = o38Var.f53786f;
        ArrayList arrayList2 = f38VarM12331c.m11528a(i).f36658a;
        if (((e38) f38VarM12331c.f38365a.get(i)).f36659b <= arrayList2.size()) {
            hh7.m13242a(view);
        } else if (RecyclerView.f6595X0 && arrayList2.contains(o38Var)) {
            C3386nv.m17626m("this scrap item already exists");
        } else {
            o38Var.m17795o();
            arrayList2.add(o38Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m12330b(int i) {
        RecyclerView recyclerView = this.f40130h;
        k38 k38Var = recyclerView.f6606C0;
        if (i >= 0 && i < k38Var.m14789b()) {
            return !k38Var.f46633g ? i : recyclerView.f6651e.m19751t(i, 0);
        }
        StringBuilder sbM22998u = ux5.m22998u("invalid position ", i, ". State item count is ");
        sbM22998u.append(k38Var.m14789b());
        sbM22998u.append(recyclerView.m2710C());
        throw new IndexOutOfBoundsException(sbM22998u.toString());
    }

    /* JADX INFO: renamed from: c */
    public final f38 m12331c() {
        if (this.f40129g == null) {
            f38 f38Var = new f38();
            f38Var.f38365a = new SparseArray();
            f38Var.f38366b = 0;
            f38Var.f38367c = Collections.newSetFromMap(new IdentityHashMap());
            this.f40129g = f38Var;
            m12333e();
        }
        return this.f40129g;
    }

    /* JADX INFO: renamed from: d */
    public final View m12332d(int i) {
        return m12340l(i, Long.MAX_VALUE).f53781a;
    }

    /* JADX INFO: renamed from: e */
    public final void m12333e() {
        RecyclerView recyclerView;
        p28 p28Var;
        f38 f38Var = this.f40129g;
        if (f38Var == null || (p28Var = (recyclerView = this.f40130h).f6611H) == null || !recyclerView.f6623N) {
            return;
        }
        f38Var.f38367c.add(p28Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m12334f(p28 p28Var, boolean z) {
        f38 f38Var = this.f40129g;
        if (f38Var != null) {
            SparseArray sparseArray = f38Var.f38365a;
            Set set = f38Var.f38367c;
            set.remove(p28Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((e38) sparseArray.get(sparseArray.keyAt(i))).f36658a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hh7.m13242a(((o38) arrayList.get(i2)).f53781a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12335g() {
        ArrayList arrayList = this.f40125c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m12336h(size);
        }
        arrayList.clear();
        if (RecyclerView.f6600c1) {
            pj3 pj3Var = this.f40130h.f6605B0;
            int[] iArr = (int[]) pj3Var.f56314e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            pj3Var.f56313d = 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12336h(int i) {
        if (RecyclerView.f6596Y0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f40125c;
        o38 o38Var = (o38) arrayList.get(i);
        if (RecyclerView.f6596Y0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + o38Var);
        }
        m12329a(o38Var, true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m12337i(View view) {
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        boolean zM17792l = o38VarM2699N.m17792l();
        RecyclerView recyclerView = this.f40130h;
        if (zM17792l) {
            recyclerView.removeDetachedView(view, false);
        }
        if (o38VarM2699N.m17791k()) {
            o38VarM2699N.f53794n.m12341m(o38VarM2699N);
        } else if (o38VarM2699N.m17798r()) {
            o38VarM2699N.f53790j &= -33;
        }
        m12338j(o38VarM2699N);
        if (recyclerView.f6664k0 == null || o38VarM2699N.m17789i()) {
            return;
        }
        recyclerView.f6664k0.mo151d(o38VarM2699N);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00df A[LOOP:2: B:64:0x00d2->B:68:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e2 A[EDGE_INSN: B:93:0x00e2->B:69:0x00e2 BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00dc, LOOP_LABEL: LOOP:1: B:60:0x00bd->B:67:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e2 A[EDGE_INSN: B:95:0x00e2->B:69:0x00e2 BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00dc], SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public final void m12338j(o38 o38Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f40130h;
        pj3 pj3Var = recyclerView.f6605B0;
        boolean zM17791k = o38Var.m17791k();
        View view = o38Var.f53781a;
        boolean z3 = false;
        boolean z4 = true;
        if (zM17791k || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(o38Var.m17791k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m2710C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (o38Var.m17792l()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(o38Var);
            C3386nv.m17630q(sb2, recyclerView.m2710C());
            return;
        }
        if (o38Var.m17797q()) {
            C3386nv.m17626m("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.m2710C()));
            return;
        }
        if ((o38Var.f53790j & 16) == 0) {
            WeakHashMap weakHashMap = dta.f36217a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        p28 p28Var = recyclerView.f6611H;
        boolean z5 = p28Var != null && z && p28Var.mo13583h(o38Var);
        boolean z6 = RecyclerView.f6595X0;
        ArrayList arrayList = this.f40125c;
        if (z6 && arrayList.contains(o38Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(o38Var);
            C3386nv.m17630q(sb3, recyclerView.m2710C());
            return;
        }
        if (z5 || o38Var.m17789i()) {
            if (this.f40128f <= 0 || (o38Var.f53790j & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f40128f && size > 0) {
                    m12336h(0);
                    size--;
                }
                if (RecyclerView.f6600c1 && size > 0) {
                    int i5 = o38Var.f53783c;
                    if (((int[]) pj3Var.f56314e) != null) {
                        int i6 = pj3Var.f56313d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((o38) arrayList.get(i)).f53783c;
                                    if (((int[]) pj3Var.f56314e) != null) {
                                        break;
                                    }
                                    i3 = pj3Var.f56313d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (((int[]) pj3Var.f56314e)[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (((int[]) pj3Var.f56314e)[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((o38) arrayList.get(i)).f53783c;
                            if (((int[]) pj3Var.f56314e) != null) {
                                break;
                                break;
                            }
                            i3 = pj3Var.f56313d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) pj3Var.f56314e)[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, o38Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                m12329a(o38Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.f6596Y0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.m2710C()));
            }
            z4 = false;
        }
        recyclerView.f6655g.m19911k(o38Var);
        if (z3 || z4 || !z) {
            return;
        }
        hh7.m13242a(view);
        o38Var.f53799s = null;
        o38Var.f53798r = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m12339k(View view) {
        v28 v28Var;
        o38 o38VarM2699N = RecyclerView.m2699N(view);
        int i = o38VarM2699N.f53790j & 12;
        RecyclerView recyclerView = this.f40130h;
        if (i == 0 && o38VarM2699N.m17793m() && (v28Var = recyclerView.f6664k0) != null) {
            a72 a72Var = (a72) v28Var;
            if (o38VarM2699N.m17785e().isEmpty() && a72Var.f306g && !o38VarM2699N.m17788h()) {
                if (this.f40124b == null) {
                    this.f40124b = new ArrayList();
                }
                o38VarM2699N.f53794n = this;
                o38VarM2699N.f53795o = true;
                this.f40124b.add(o38VarM2699N);
                return;
            }
        }
        if (o38VarM2699N.m17788h() && !o38VarM2699N.m17790j() && !recyclerView.f6611H.f55487b) {
            C3386nv.m17626m("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m2710C()));
            return;
        }
        o38VarM2699N.f53794n = this;
        o38VarM2699N.f53795o = false;
        this.f40123a.add(o38VarM2699N);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:127:0x0200  */
    /* JADX WARN: Code duplicated, block: B:129:0x020a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x021b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0226  */
    /* JADX WARN: Code duplicated, block: B:137:0x0244  */
    /* JADX WARN: Code duplicated, block: B:140:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0257  */
    /* JADX WARN: Code duplicated, block: B:144:0x0261  */
    /* JADX WARN: Code duplicated, block: B:146:0x026f  */
    /* JADX WARN: Code duplicated, block: B:148:0x027b  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:176:0x0304  */
    /* JADX WARN: Code duplicated, block: B:178:0x030a  */
    /* JADX WARN: Code duplicated, block: B:180:0x030e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0332  */
    /* JADX WARN: Code duplicated, block: B:185:0x033a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0342  */
    /* JADX WARN: Code duplicated, block: B:190:0x0355 A[LOOP:4: B:186:0x0340->B:190:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x0358 A[EDGE_INSN: B:191:0x0358->B:192:0x0359 BREAK  A[LOOP:4: B:186:0x0340->B:190:0x0355]] */
    /* JADX WARN: Code duplicated, block: B:193:0x035b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0363  */
    /* JADX WARN: Code duplicated, block: B:198:0x036b  */
    /* JADX WARN: Code duplicated, block: B:208:0x038b A[Catch: all -> 0x03eb, TryCatch #0 {all -> 0x03eb, blocks: (B:206:0x0385, B:208:0x038b, B:209:0x039c, B:211:0x03a8, B:224:0x03e3, B:225:0x03ea), top: B:361:0x0385 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x03a8 A[Catch: all -> 0x03eb, TRY_LEAVE, TryCatch #0 {all -> 0x03eb, blocks: (B:206:0x0385, B:208:0x038b, B:209:0x039c, B:211:0x03a8, B:224:0x03e3, B:225:0x03ea), top: B:361:0x0385 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:223:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e3 A[Catch: all -> 0x03eb, TRY_ENTER, TryCatch #0 {all -> 0x03eb, blocks: (B:206:0x0385, B:208:0x038b, B:209:0x039c, B:211:0x03a8, B:224:0x03e3, B:225:0x03ea), top: B:361:0x0385 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0412  */
    /* JADX WARN: Code duplicated, block: B:238:0x0424  */
    /* JADX WARN: Code duplicated, block: B:240:0x042c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0451  */
    /* JADX WARN: Code duplicated, block: B:248:0x0457  */
    /* JADX WARN: Code duplicated, block: B:257:0x0470  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:270:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:272:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:276:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:279:0x04db  */
    /* JADX WARN: Code duplicated, block: B:281:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:284:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:287:0x050e  */
    /* JADX WARN: Code duplicated, block: B:289:0x0514  */
    /* JADX WARN: Code duplicated, block: B:296:0x0551  */
    /* JADX WARN: Code duplicated, block: B:303:0x056a  */
    /* JADX WARN: Code duplicated, block: B:305:0x056e  */
    /* JADX WARN: Code duplicated, block: B:308:0x057f  */
    /* JADX WARN: Code duplicated, block: B:311:0x058a  */
    /* JADX WARN: Code duplicated, block: B:315:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:318:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:342:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:347:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:348:0x0608  */
    /* JADX WARN: Code duplicated, block: B:350:0x060e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0618  */
    /* JADX WARN: Code duplicated, block: B:354:0x061e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x0622  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[EDGE_INSN: B:35:0x007c->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0024->B:20:0x003e]] */
    /* JADX WARN: Code duplicated, block: B:368:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:381:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138 A[EDGE_INSN: B:80:0x0138->B:101:0x01aa BREAK  A[LOOP:1: B:43:0x0090->B:55:0x00bc]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x030e, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public final o38 m12340l(int i, long j) {
        o38 o38VarMo6136f;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        long j2;
        long j3;
        View view;
        boolean z3;
        int iM19751t;
        int i2;
        long nanoTime;
        boolean z4;
        p28 p28Var;
        boolean z5;
        long nanoTime2;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z6;
        boolean z7;
        C3133j3 c3133j3;
        ArrayList arrayList3;
        ViewGroup.LayoutParams layoutParams;
        boolean z8;
        long j5;
        ViewGroup.LayoutParams layoutParams2;
        z28 z28Var;
        boolean z9;
        int i3;
        int iM19751t2;
        int iMo8978c;
        p28 p28Var2;
        long nanoTime3;
        View view2;
        long nanoTime4;
        long j6;
        RecyclerView recyclerViewM2698H;
        long j7;
        e38 e38Var;
        o38 o38Var;
        ArrayList arrayList4;
        int size;
        long jMo6134b;
        int size2;
        int size3;
        o38 o38Var2;
        ArrayList arrayList5;
        long j8;
        ArrayList arrayList6;
        int size4;
        int i4;
        ArrayList arrayList7;
        int size5;
        int i5;
        View view3;
        int size6;
        int i6;
        o38 o38Var3;
        o38 o38VarM2699N;
        u8a u8aVar;
        s01 s01Var;
        int iIndexOfChild;
        s01 s01Var2;
        int iIndexOfChild2;
        int iM20991b;
        o38 o38VarM2699N2;
        int i7;
        boolean z10;
        o38 o38Var4;
        int size7;
        int iM19751t3;
        RecyclerView recyclerView = this.f40130h;
        k38 k38Var = recyclerView.f6606C0;
        if (i < 0 || i >= k38Var.m14789b()) {
            StringBuilder sbM22994q = ux5.m22994q(i, i, "Invalid item position ", "(", "). Item count:");
            sbM22994q.append(k38Var.m14789b());
            sbM22994q.append(recyclerView.m2710C());
            throw new IndexOutOfBoundsException(sbM22994q.toString());
        }
        if (k38Var.f46633g) {
            ArrayList arrayList8 = this.f40124b;
            if (arrayList8 != null && (size7 = arrayList8.size()) != 0) {
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        if (recyclerView.f6611H.f55487b && (iM19751t3 = recyclerView.f6651e.m19751t(i, 0)) > 0 && iM19751t3 < recyclerView.f6611H.mo6133a()) {
                            long jMo6134b2 = recyclerView.f6611H.mo6134b(iM19751t3);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= size7) {
                                    o38VarMo6136f = null;
                                    break;
                                }
                                o38 o38Var5 = (o38) this.f40124b.get(i9);
                                if (!o38Var5.m17798r() && o38Var5.f53785e == jMo6134b2) {
                                    o38Var5.m17781a(32);
                                    o38VarMo6136f = o38Var5;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            o38VarMo6136f = null;
                            break;
                        }
                    } else {
                        o38VarMo6136f = (o38) this.f40124b.get(i8);
                        if (!o38VarMo6136f.m17798r() && o38VarMo6136f.m17784d() == i) {
                            o38VarMo6136f.m17781a(32);
                            break;
                        }
                        i8++;
                    }
                }
            } else {
                o38VarMo6136f = null;
                break;
            }
            if (o38VarMo6136f != null) {
                z = true;
            }
            arrayList = this.f40123a;
            arrayList2 = this.f40125c;
            if (o38VarMo6136f == null) {
                size4 = arrayList.size();
                i4 = 0;
                while (true) {
                    if (i4 < size4) {
                        arrayList7 = (ArrayList) recyclerView.f6653f.f63596e;
                        size5 = arrayList7.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size5) {
                                z2 = true;
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList7.get(i5);
                            o38VarM2699N2 = RecyclerView.m2699N(view3);
                            z2 = true;
                            if (o38VarM2699N2.m17784d() != i && !o38VarM2699N2.m17788h() && !o38VarM2699N2.m17790j()) {
                                break;
                            }
                            i5++;
                        }
                        if (view3 != null) {
                            size6 = arrayList2.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size6) {
                                    o38VarMo6136f = null;
                                    break;
                                }
                                o38Var3 = (o38) arrayList2.get(i6);
                                if (o38Var3.m17788h() && o38Var3.m17784d() == i && !o38Var3.m17786f()) {
                                    arrayList2.remove(i6);
                                    if (RecyclerView.f6596Y0) {
                                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + o38Var3);
                                    }
                                    o38VarMo6136f = o38Var3;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            o38VarM2699N = RecyclerView.m2699N(view3);
                            u8aVar = recyclerView.f6653f;
                            s01Var = (s01) u8aVar.f63595d;
                            iIndexOfChild = ((n28) u8aVar.f63594c).f52241a.indexOfChild(view3);
                            if (iIndexOfChild >= 0) {
                                v63.m23142t(view3, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (s01Var.m20993d(iIndexOfChild)) {
                                ho2.m13384d(view3, "trying to unhide a view that was not hidden");
                                return null;
                            }
                            s01Var.m20990a(iIndexOfChild);
                            u8aVar.m22564y(view3);
                            u8a u8aVar2 = recyclerView.f6653f;
                            s01Var2 = (s01) u8aVar2.f63595d;
                            iIndexOfChild2 = ((n28) u8aVar2.f63594c).f52241a.indexOfChild(view3);
                            if (iIndexOfChild2 == -1 && !s01Var2.m20993d(iIndexOfChild2)) {
                                iM20991b = iIndexOfChild2 - s01Var2.m20991b(iIndexOfChild2);
                            } else {
                                iM20991b = -1;
                            }
                            if (iM20991b != -1) {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(o38VarM2699N);
                                v63.m23138p(sb, recyclerView.m2710C());
                                return null;
                            }
                            recyclerView.f6653f.m22542c(iM20991b);
                            m12339k(view3);
                            o38VarM2699N.m17781a(8224);
                            o38VarMo6136f = o38VarM2699N;
                            break;
                        }
                    } else {
                        o38Var4 = (o38) arrayList.get(i4);
                        if (o38Var4.m17798r() && o38Var4.m17784d() == i && !o38Var4.m17788h() && (k38Var.f46633g || !o38Var4.m17790j())) {
                            o38Var4.m17781a(32);
                            o38VarMo6136f = o38Var4;
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (o38VarMo6136f != null) {
                    if (o38VarMo6136f.m17790j()) {
                        i7 = o38VarMo6136f.f53783c;
                        if (i7 >= 0 || i7 >= recyclerView.f6611H.mo6133a()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + o38VarMo6136f + recyclerView.m2710C());
                        }
                        if (k38Var.f46633g || recyclerView.f6611H.mo8978c(o38VarMo6136f.f53783c) == o38VarMo6136f.f53786f) {
                            p28 p28Var3 = recyclerView.f6611H;
                            if (!p28Var3.f55487b || o38VarMo6136f.f53785e == p28Var3.mo6134b(o38VarMo6136f.f53783c)) {
                                z10 = z2;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        if (!RecyclerView.f6595X0 && !k38Var.f46633g) {
                            C3386nv.m17633t("should not receive a removed view unless it is pre layout".concat(recyclerView.m2710C()));
                            return null;
                        }
                        z10 = k38Var.f46633g;
                    }
                    if (z10) {
                        z = z2;
                    } else {
                        o38VarMo6136f.m17781a(4);
                        if (o38VarMo6136f.m17791k()) {
                            recyclerView.removeDetachedView(o38VarMo6136f.f53781a, false);
                            o38VarMo6136f.f53794n.m12341m(o38VarMo6136f);
                        } else if (o38VarMo6136f.m17798r()) {
                            o38VarMo6136f.f53790j &= -33;
                        }
                        m12338j(o38VarMo6136f);
                        o38VarMo6136f = null;
                    }
                }
            } else {
                z2 = true;
            }
            if (o38VarMo6136f == null) {
                iM19751t2 = recyclerView.f6651e.m19751t(i, 0);
                if (iM19751t2 >= 0) {
                    j2 = 3;
                    if (iM19751t2 < recyclerView.f6611H.mo6133a()) {
                        iMo8978c = recyclerView.f6611H.mo8978c(iM19751t2);
                        p28Var2 = recyclerView.f6611H;
                        j3 = 4;
                        if (p28Var2.f55487b) {
                            jMo6134b = p28Var2.mo6134b(iM19751t2);
                            size2 = arrayList.size() - 1;
                            while (true) {
                                if (size2 >= 0) {
                                    size3 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size3 >= 0) {
                                            o38Var2 = (o38) arrayList2.get(size3);
                                            if (o38Var2.f53785e == jMo6134b || o38Var2.m17786f()) {
                                                size3--;
                                            } else if (iMo8978c == o38Var2.f53786f) {
                                                arrayList2.remove(size3);
                                            } else {
                                                m12336h(size3);
                                            }
                                        }
                                        o38VarMo6136f = null;
                                        break;
                                    }
                                }
                                o38Var2 = (o38) arrayList.get(size2);
                                arrayList5 = arrayList;
                                j8 = o38Var2.f53785e;
                                View view4 = o38Var2.f53781a;
                                if (j8 == jMo6134b || o38Var2.m17798r()) {
                                    arrayList6 = arrayList5;
                                } else if (iMo8978c == o38Var2.f53786f) {
                                    o38Var2.m17781a(32);
                                    if (o38Var2.m17790j() && !k38Var.f46633g) {
                                        o38Var2.f53790j = (o38Var2.f53790j & (-15)) | 2;
                                    }
                                } else {
                                    arrayList6 = arrayList5;
                                    arrayList6.remove(size2);
                                    recyclerView.removeDetachedView(view4, false);
                                    o38 o38VarM2699N3 = RecyclerView.m2699N(view4);
                                    o38VarM2699N3.f53794n = null;
                                    o38VarM2699N3.f53795o = false;
                                    o38VarM2699N3.f53790j &= -33;
                                    m12338j(o38VarM2699N3);
                                }
                                size2--;
                                arrayList = arrayList6;
                                o38VarMo6136f = o38Var2;
                                break;
                            }
                            if (o38VarMo6136f != null) {
                                o38VarMo6136f.f53783c = iM19751t2;
                                z = z2;
                            }
                        }
                        if (o38VarMo6136f == null) {
                            if (RecyclerView.f6596Y0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                            }
                            e38Var = (e38) m12331c().f38365a.get(iMo8978c);
                            if (e38Var != null) {
                                o38Var = null;
                                break;
                            }
                            arrayList4 = e38Var.f36658a;
                            if (arrayList4.isEmpty()) {
                                size = arrayList4.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        o38Var = null;
                                        break;
                                    }
                                    if (!((o38) arrayList4.get(size)).m17786f()) {
                                        o38Var = (o38) arrayList4.remove(size);
                                        break;
                                    }
                                    size--;
                                }
                            } else {
                                o38Var = null;
                                break;
                            }
                            if (o38Var != null) {
                                o38Var.m17795o();
                                boolean z11 = RecyclerView.f6595X0;
                            }
                            o38VarMo6136f = o38Var;
                        }
                        if (o38VarMo6136f == null) {
                            nanoTime3 = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                j7 = this.f40129g.m11528a(iMo8978c).f36660c;
                                if (j7 != 0 && j7 + nanoTime3 >= j) {
                                    return null;
                                }
                            }
                            p28 p28Var4 = recyclerView.f6611H;
                            p28Var4.getClass();
                            try {
                                if (f8d.m11606b()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo8978c)));
                                }
                                o38VarMo6136f = p28Var4.mo6136f(recyclerView, iMo8978c);
                                view2 = o38VarMo6136f.f53781a;
                                if (view2.getParent() == null) {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                                o38VarMo6136f.f53786f = iMo8978c;
                                Trace.endSection();
                                if (RecyclerView.f6600c1 && (recyclerViewM2698H = RecyclerView.m2698H(view2)) != null) {
                                    o38VarMo6136f.f53782b = new WeakReference(recyclerViewM2698H);
                                }
                                nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                e38 e38VarM11528a = this.f40129g.m11528a(iMo8978c);
                                j6 = e38VarM11528a.f36660c;
                                if (j6 != 0) {
                                    nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                                }
                                e38VarM11528a.f36660c = nanoTime4;
                                if (RecyclerView.f6596Y0) {
                                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                StringBuilder sbM22994q2 = ux5.m22994q(i, iM19751t2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                sbM22994q2.append(k38Var.m14789b());
                sbM22994q2.append(recyclerView.m2710C());
                throw new IndexOutOfBoundsException(sbM22994q2.toString());
            }
            j2 = 3;
            j3 = 4;
            view = o38VarMo6136f.f53781a;
            if (z && !k38Var.f46633g) {
                i3 = o38VarMo6136f.f53790j;
                if ((i3 & 8192) != 0) {
                    o38VarMo6136f.f53790j = i3 & (-8193);
                    if (k38Var.f46636j) {
                        v28.m23067b(o38VarMo6136f);
                        v28 v28Var = recyclerView.f6664k0;
                        o38VarMo6136f.m17785e();
                        v28Var.getClass();
                        xp7 xp7Var = new xp7(3, (byte) 0);
                        xp7Var.m24630a(o38VarMo6136f);
                        recyclerView.m2732a0(o38VarMo6136f, xp7Var);
                    }
                }
            }
            if (k38Var.f46633g || !o38VarMo6136f.m17787g()) {
                if (o38VarMo6136f.m17787g() || (o38VarMo6136f.f53790j & 2) != 0 || o38VarMo6136f.m17788h()) {
                    if (!RecyclerView.f6595X0 && o38VarMo6136f.m17790j()) {
                        StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                        sb2.append(o38VarMo6136f);
                        v63.m23138p(sb2, recyclerView.m2710C());
                        return null;
                    }
                    z3 = false;
                    iM19751t = recyclerView.f6651e.m19751t(i, 0);
                    o38VarMo6136f.f53799s = null;
                    o38VarMo6136f.f53798r = recyclerView;
                    i2 = o38VarMo6136f.f53786f;
                    nanoTime = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j5 = this.f40129g.m11528a(i2).f36661d;
                        if (j5 != 0 || j5 + nanoTime < j) {
                            if (o38VarMo6136f.m17792l()) {
                                recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                                z4 = z2;
                            } else {
                                z4 = false;
                            }
                            p28Var = recyclerView.f6611H;
                            p28Var.getClass();
                            if (o38VarMo6136f.f53799s == null) {
                                z5 = z2;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                o38VarMo6136f.f53783c = iM19751t;
                                if (p28Var.f55487b) {
                                    o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                                }
                                o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                                if (f8d.m11606b()) {
                                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                                }
                            }
                            o38VarMo6136f.f53799s = p28Var;
                            if (RecyclerView.f6595X0) {
                                if (view.getParent() != null && view.isAttachedToWindow() != o38VarMo6136f.m17792l()) {
                                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + o38VarMo6136f.m17792l() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + o38VarMo6136f);
                                }
                                if (view.getParent() == null && view.isAttachedToWindow()) {
                                    ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                    return null;
                                }
                            }
                            o38VarMo6136f.m17785e();
                            p28Var.mo6135e(o38VarMo6136f, iM19751t);
                            if (z5) {
                                arrayList3 = o38VarMo6136f.f53791k;
                                if (arrayList3 != null) {
                                    arrayList3.clear();
                                }
                                o38VarMo6136f.f53790j &= -1025;
                                layoutParams = view.getLayoutParams();
                                if (layoutParams instanceof z28) {
                                    ((z28) layoutParams).f70801c = z2;
                                }
                                Trace.endSection();
                            }
                            if (z4) {
                                recyclerView.detachViewFromParent(view);
                            }
                            nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            e38 e38VarM11528a2 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                            j4 = e38VarM11528a2.f36661d;
                            if (j4 != 0) {
                                nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                            }
                            e38VarM11528a2.f36661d = nanoTime2;
                            accessibilityManager = recyclerView.f6641W;
                            if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                z6 = true;
                                if (view.getImportantForAccessibility() == 0) {
                                    view.setImportantForAccessibility(1);
                                }
                                q38 q38Var = recyclerView.f6616J0;
                                if (q38Var != null) {
                                    p38 p38Var = q38Var.f57195e;
                                    if (p38Var != null) {
                                        WeakHashMap weakHashMap = dta.f36217a;
                                        View.AccessibilityDelegate accessibilityDelegateM3034a = ata.m3034a(view);
                                        if (accessibilityDelegateM3034a == null) {
                                            c3133j3 = null;
                                        } else {
                                            c3133j3 = accessibilityDelegateM3034a instanceof C3098i3 ? ((C3098i3) accessibilityDelegateM3034a).f43394a : new C3133j3(accessibilityDelegateM3034a);
                                        }
                                        if (c3133j3 != null && c3133j3 != p38Var) {
                                            p38Var.f55531e.put(view, c3133j3);
                                        }
                                    }
                                    dta.m10640k(view, p38Var);
                                }
                            } else {
                                z6 = true;
                            }
                            if (k38Var.f46633g) {
                                o38VarMo6136f.f53787g = i;
                            }
                            z7 = z6;
                        } else {
                            z7 = false;
                            z6 = z2;
                        }
                    } else {
                        if (o38VarMo6136f.m17792l()) {
                            recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                            z4 = z2;
                        } else {
                            z4 = false;
                        }
                        p28Var = recyclerView.f6611H;
                        p28Var.getClass();
                        if (o38VarMo6136f.f53799s == null) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            o38VarMo6136f.f53783c = iM19751t;
                            if (p28Var.f55487b) {
                                o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                            }
                            o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                            if (f8d.m11606b()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                            }
                        }
                        o38VarMo6136f.f53799s = p28Var;
                        if (RecyclerView.f6595X0) {
                            if (view.getParent() != null) {
                            }
                            if (view.getParent() == null) {
                                ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        o38VarMo6136f.m17785e();
                        p28Var.mo6135e(o38VarMo6136f, iM19751t);
                        if (z5) {
                            arrayList3 = o38VarMo6136f.f53791k;
                            if (arrayList3 != null) {
                                arrayList3.clear();
                            }
                            o38VarMo6136f.f53790j &= -1025;
                            layoutParams = view.getLayoutParams();
                            if (layoutParams instanceof z28) {
                                ((z28) layoutParams).f70801c = z2;
                            }
                            Trace.endSection();
                        }
                        if (z4) {
                            recyclerView.detachViewFromParent(view);
                        }
                        nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        e38 e38VarM11528a3 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                        j4 = e38VarM11528a3.f36661d;
                        if (j4 != 0) {
                            nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                        }
                        e38VarM11528a3.f36661d = nanoTime2;
                        accessibilityManager = recyclerView.f6641W;
                        if (accessibilityManager == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (k38Var.f46633g) {
                            o38VarMo6136f.f53787g = i;
                        }
                        z7 = z6;
                    }
                    z8 = z7;
                }
                layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    z28Var = (z28) recyclerView.generateDefaultLayoutParams();
                    view.setLayoutParams(z28Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    z28Var = (z28) layoutParams2;
                } else {
                    z28Var = (z28) recyclerView.generateLayoutParams(layoutParams2);
                    view.setLayoutParams(z28Var);
                }
                z28Var.f70799a = o38VarMo6136f;
                if (z || !z8) {
                    z9 = z3;
                } else {
                    z9 = z6;
                }
                z28Var.f70802d = z9;
                return o38VarMo6136f;
            }
            o38VarMo6136f.f53787g = i;
            z6 = z2;
            z3 = false;
            z8 = false;
            layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                z28Var = (z28) recyclerView.generateDefaultLayoutParams();
                view.setLayoutParams(z28Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                z28Var = (z28) recyclerView.generateLayoutParams(layoutParams2);
                view.setLayoutParams(z28Var);
            } else {
                z28Var = (z28) layoutParams2;
            }
            z28Var.f70799a = o38VarMo6136f;
            if (z) {
                z9 = z3;
            } else {
                z9 = z3;
            }
            z28Var.f70802d = z9;
            return o38VarMo6136f;
        }
        o38VarMo6136f = null;
        z = false;
        arrayList = this.f40123a;
        arrayList2 = this.f40125c;
        if (o38VarMo6136f == null) {
            size4 = arrayList.size();
            i4 = 0;
            while (true) {
                if (i4 < size4) {
                    arrayList7 = (ArrayList) recyclerView.f6653f.f63596e;
                    size5 = arrayList7.size();
                    i5 = 0;
                    while (true) {
                        if (i5 < size5) {
                            z2 = true;
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList7.get(i5);
                        o38VarM2699N2 = RecyclerView.m2699N(view3);
                        z2 = true;
                        if (o38VarM2699N2.m17784d() != i) {
                        }
                        i5++;
                    }
                    if (view3 != null) {
                        size6 = arrayList2.size();
                        i6 = 0;
                        while (true) {
                            if (i6 < size6) {
                                o38VarMo6136f = null;
                                break;
                            }
                            o38Var3 = (o38) arrayList2.get(i6);
                            if (o38Var3.m17788h()) {
                            }
                            i6++;
                        }
                    } else {
                        o38VarM2699N = RecyclerView.m2699N(view3);
                        u8aVar = recyclerView.f6653f;
                        s01Var = (s01) u8aVar.f63595d;
                        iIndexOfChild = ((n28) u8aVar.f63594c).f52241a.indexOfChild(view3);
                        if (iIndexOfChild >= 0) {
                            v63.m23142t(view3, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (s01Var.m20993d(iIndexOfChild)) {
                            ho2.m13384d(view3, "trying to unhide a view that was not hidden");
                            return null;
                        }
                        s01Var.m20990a(iIndexOfChild);
                        u8aVar.m22564y(view3);
                        u8a u8aVar3 = recyclerView.f6653f;
                        s01Var2 = (s01) u8aVar3.f63595d;
                        iIndexOfChild2 = ((n28) u8aVar3.f63594c).f52241a.indexOfChild(view3);
                        if (iIndexOfChild2 == -1) {
                            iM20991b = -1;
                        } else {
                            iM20991b = iIndexOfChild2 - s01Var2.m20991b(iIndexOfChild2);
                        }
                        if (iM20991b != -1) {
                            StringBuilder sb3 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb3.append(o38VarM2699N);
                            v63.m23138p(sb3, recyclerView.m2710C());
                            return null;
                        }
                        recyclerView.f6653f.m22542c(iM20991b);
                        m12339k(view3);
                        o38VarM2699N.m17781a(8224);
                        o38VarMo6136f = o38VarM2699N;
                        break;
                    }
                } else {
                    o38Var4 = (o38) arrayList.get(i4);
                    if (o38Var4.m17798r()) {
                    }
                    i4++;
                }
            }
            if (o38VarMo6136f != null) {
                if (o38VarMo6136f.m17790j()) {
                    i7 = o38VarMo6136f.f53783c;
                    if (i7 >= 0) {
                    }
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + o38VarMo6136f + recyclerView.m2710C());
                }
                if (!RecyclerView.f6595X0) {
                }
                z10 = k38Var.f46633g;
                if (z10) {
                    o38VarMo6136f.m17781a(4);
                    if (o38VarMo6136f.m17791k()) {
                        recyclerView.removeDetachedView(o38VarMo6136f.f53781a, false);
                        o38VarMo6136f.f53794n.m12341m(o38VarMo6136f);
                    } else if (o38VarMo6136f.m17798r()) {
                        o38VarMo6136f.f53790j &= -33;
                    }
                    m12338j(o38VarMo6136f);
                    o38VarMo6136f = null;
                } else {
                    z = z2;
                }
            }
        } else {
            z2 = true;
        }
        if (o38VarMo6136f == null) {
            iM19751t2 = recyclerView.f6651e.m19751t(i, 0);
            if (iM19751t2 >= 0) {
                j2 = 3;
                if (iM19751t2 < recyclerView.f6611H.mo6133a()) {
                    iMo8978c = recyclerView.f6611H.mo8978c(iM19751t2);
                    p28Var2 = recyclerView.f6611H;
                    j3 = 4;
                    if (p28Var2.f55487b) {
                        jMo6134b = p28Var2.mo6134b(iM19751t2);
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                size3 = arrayList2.size() - 1;
                                while (true) {
                                    if (size3 >= 0) {
                                        o38Var2 = (o38) arrayList2.get(size3);
                                        if (o38Var2.f53785e == jMo6134b) {
                                        }
                                        size3--;
                                    }
                                    o38VarMo6136f = null;
                                    break;
                                }
                            }
                            o38Var2 = (o38) arrayList.get(size2);
                            arrayList5 = arrayList;
                            j8 = o38Var2.f53785e;
                            View view5 = o38Var2.f53781a;
                            if (j8 == jMo6134b) {
                                arrayList6 = arrayList5;
                            } else {
                                arrayList6 = arrayList5;
                            }
                            size2--;
                            arrayList = arrayList6;
                            o38VarMo6136f = o38Var2;
                            break;
                        }
                        if (o38VarMo6136f != null) {
                            o38VarMo6136f.f53783c = iM19751t2;
                            z = z2;
                        }
                    }
                    if (o38VarMo6136f == null) {
                        if (RecyclerView.f6596Y0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        e38Var = (e38) m12331c().f38365a.get(iMo8978c);
                        if (e38Var != null) {
                            o38Var = null;
                            break;
                        }
                        arrayList4 = e38Var.f36658a;
                        if (arrayList4.isEmpty()) {
                            o38Var = null;
                            break;
                        }
                        size = arrayList4.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                o38Var = null;
                                break;
                            }
                            if (!((o38) arrayList4.get(size)).m17786f()) {
                                o38Var = (o38) arrayList4.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (o38Var != null) {
                            o38Var.m17795o();
                            boolean z12 = RecyclerView.f6595X0;
                        }
                        o38VarMo6136f = o38Var;
                    }
                    if (o38VarMo6136f == null) {
                        nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            j7 = this.f40129g.m11528a(iMo8978c).f36660c;
                            if (j7 != 0) {
                                return null;
                            }
                        }
                        p28 p28Var5 = recyclerView.f6611H;
                        p28Var5.getClass();
                        if (f8d.m11606b()) {
                            Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iMo8978c)));
                        }
                        o38VarMo6136f = p28Var5.mo6136f(recyclerView, iMo8978c);
                        view2 = o38VarMo6136f.f53781a;
                        if (view2.getParent() == null) {
                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                        }
                        o38VarMo6136f.f53786f = iMo8978c;
                        Trace.endSection();
                        if (RecyclerView.f6600c1) {
                            o38VarMo6136f.f53782b = new WeakReference(recyclerViewM2698H);
                        }
                        nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        e38 e38VarM11528a4 = this.f40129g.m11528a(iMo8978c);
                        j6 = e38VarM11528a4.f36660c;
                        if (j6 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
                        }
                        e38VarM11528a4.f36660c = nanoTime4;
                        if (RecyclerView.f6596Y0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
            }
            StringBuilder sbM22994q3 = ux5.m22994q(i, iM19751t2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbM22994q3.append(k38Var.m14789b());
            sbM22994q3.append(recyclerView.m2710C());
            throw new IndexOutOfBoundsException(sbM22994q3.toString());
        }
        j2 = 3;
        j3 = 4;
        view = o38VarMo6136f.f53781a;
        if (z) {
            i3 = o38VarMo6136f.f53790j;
            if ((i3 & 8192) != 0) {
                o38VarMo6136f.f53790j = i3 & (-8193);
                if (k38Var.f46636j) {
                    v28.m23067b(o38VarMo6136f);
                    v28 v28Var2 = recyclerView.f6664k0;
                    o38VarMo6136f.m17785e();
                    v28Var2.getClass();
                    xp7 xp7Var2 = new xp7(3, (byte) 0);
                    xp7Var2.m24630a(o38VarMo6136f);
                    recyclerView.m2732a0(o38VarMo6136f, xp7Var2);
                }
            }
        }
        if (k38Var.f46633g) {
            if (o38VarMo6136f.m17787g()) {
            }
            if (!RecyclerView.f6595X0) {
            }
            z3 = false;
            iM19751t = recyclerView.f6651e.m19751t(i, 0);
            o38VarMo6136f.f53799s = null;
            o38VarMo6136f.f53798r = recyclerView;
            i2 = o38VarMo6136f.f53786f;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.f40129g.m11528a(i2).f36661d;
                if (j5 != 0) {
                    if (o38VarMo6136f.m17792l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p28Var = recyclerView.f6611H;
                    p28Var.getClass();
                    if (o38VarMo6136f.f53799s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        o38VarMo6136f.f53783c = iM19751t;
                        if (p28Var.f55487b) {
                            o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                        }
                        o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                        if (f8d.m11606b()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                        }
                    }
                    o38VarMo6136f.f53799s = p28Var;
                    if (RecyclerView.f6595X0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    o38VarMo6136f.m17785e();
                    p28Var.mo6135e(o38VarMo6136f, iM19751t);
                    if (z5) {
                        arrayList3 = o38VarMo6136f.f53791k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        o38VarMo6136f.f53790j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof z28) {
                            ((z28) layoutParams).f70801c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    e38 e38VarM11528a5 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                    j4 = e38VarM11528a5.f36661d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    e38VarM11528a5.f36661d = nanoTime2;
                    accessibilityManager = recyclerView.f6641W;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (k38Var.f46633g) {
                        o38VarMo6136f.f53787g = i;
                    }
                    z7 = z6;
                } else {
                    if (o38VarMo6136f.m17792l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p28Var = recyclerView.f6611H;
                    p28Var.getClass();
                    if (o38VarMo6136f.f53799s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        o38VarMo6136f.f53783c = iM19751t;
                        if (p28Var.f55487b) {
                            o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                        }
                        o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                        if (f8d.m11606b()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                        }
                    }
                    o38VarMo6136f.f53799s = p28Var;
                    if (RecyclerView.f6595X0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    o38VarMo6136f.m17785e();
                    p28Var.mo6135e(o38VarMo6136f, iM19751t);
                    if (z5) {
                        arrayList3 = o38VarMo6136f.f53791k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        o38VarMo6136f.f53790j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof z28) {
                            ((z28) layoutParams).f70801c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    e38 e38VarM11528a6 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                    j4 = e38VarM11528a6.f36661d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    e38VarM11528a6.f36661d = nanoTime2;
                    accessibilityManager = recyclerView.f6641W;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (k38Var.f46633g) {
                        o38VarMo6136f.f53787g = i;
                    }
                    z7 = z6;
                }
            } else {
                if (o38VarMo6136f.m17792l()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                p28Var = recyclerView.f6611H;
                p28Var.getClass();
                if (o38VarMo6136f.f53799s == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    o38VarMo6136f.f53783c = iM19751t;
                    if (p28Var.f55487b) {
                        o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                    }
                    o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                    if (f8d.m11606b()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                    }
                }
                o38VarMo6136f.f53799s = p28Var;
                if (RecyclerView.f6595X0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                o38VarMo6136f.m17785e();
                p28Var.mo6135e(o38VarMo6136f, iM19751t);
                if (z5) {
                    arrayList3 = o38VarMo6136f.f53791k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    o38VarMo6136f.f53790j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof z28) {
                        ((z28) layoutParams).f70801c = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                e38 e38VarM11528a7 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                j4 = e38VarM11528a7.f36661d;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                e38VarM11528a7.f36661d = nanoTime2;
                accessibilityManager = recyclerView.f6641W;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (k38Var.f46633g) {
                    o38VarMo6136f.f53787g = i;
                }
                z7 = z6;
            }
            z8 = z7;
        } else {
            if (o38VarMo6136f.m17787g()) {
            }
            if (!RecyclerView.f6595X0) {
            }
            z3 = false;
            iM19751t = recyclerView.f6651e.m19751t(i, 0);
            o38VarMo6136f.f53799s = null;
            o38VarMo6136f.f53798r = recyclerView;
            i2 = o38VarMo6136f.f53786f;
            nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                j5 = this.f40129g.m11528a(i2).f36661d;
                if (j5 != 0) {
                    if (o38VarMo6136f.m17792l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p28Var = recyclerView.f6611H;
                    p28Var.getClass();
                    if (o38VarMo6136f.f53799s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        o38VarMo6136f.f53783c = iM19751t;
                        if (p28Var.f55487b) {
                            o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                        }
                        o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                        if (f8d.m11606b()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                        }
                    }
                    o38VarMo6136f.f53799s = p28Var;
                    if (RecyclerView.f6595X0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    o38VarMo6136f.m17785e();
                    p28Var.mo6135e(o38VarMo6136f, iM19751t);
                    if (z5) {
                        arrayList3 = o38VarMo6136f.f53791k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        o38VarMo6136f.f53790j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof z28) {
                            ((z28) layoutParams).f70801c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    e38 e38VarM11528a8 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                    j4 = e38VarM11528a8.f36661d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    e38VarM11528a8.f36661d = nanoTime2;
                    accessibilityManager = recyclerView.f6641W;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (k38Var.f46633g) {
                        o38VarMo6136f.f53787g = i;
                    }
                    z7 = z6;
                } else {
                    if (o38VarMo6136f.m17792l()) {
                        recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                    p28Var = recyclerView.f6611H;
                    p28Var.getClass();
                    if (o38VarMo6136f.f53799s == null) {
                        z5 = z2;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        o38VarMo6136f.f53783c = iM19751t;
                        if (p28Var.f55487b) {
                            o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                        }
                        o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                        if (f8d.m11606b()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                        }
                    }
                    o38VarMo6136f.f53799s = p28Var;
                    if (RecyclerView.f6595X0) {
                        if (view.getParent() != null) {
                        }
                        if (view.getParent() == null) {
                            ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    o38VarMo6136f.m17785e();
                    p28Var.mo6135e(o38VarMo6136f, iM19751t);
                    if (z5) {
                        arrayList3 = o38VarMo6136f.f53791k;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        o38VarMo6136f.f53790j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof z28) {
                            ((z28) layoutParams).f70801c = z2;
                        }
                        Trace.endSection();
                    }
                    if (z4) {
                        recyclerView.detachViewFromParent(view);
                    }
                    nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    e38 e38VarM11528a9 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                    j4 = e38VarM11528a9.f36661d;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                    }
                    e38VarM11528a9.f36661d = nanoTime2;
                    accessibilityManager = recyclerView.f6641W;
                    if (accessibilityManager == null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (k38Var.f46633g) {
                        o38VarMo6136f.f53787g = i;
                    }
                    z7 = z6;
                }
            } else {
                if (o38VarMo6136f.m17792l()) {
                    recyclerView.attachViewToParent(view, recyclerView.getChildCount(), view.getLayoutParams());
                    z4 = z2;
                } else {
                    z4 = false;
                }
                p28Var = recyclerView.f6611H;
                p28Var.getClass();
                if (o38VarMo6136f.f53799s == null) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                if (z5) {
                    o38VarMo6136f.f53783c = iM19751t;
                    if (p28Var.f55487b) {
                        o38VarMo6136f.f53785e = p28Var.mo6134b(iM19751t);
                    }
                    o38VarMo6136f.f53790j = (o38VarMo6136f.f53790j & (-520)) | 1;
                    if (f8d.m11606b()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(o38VarMo6136f.f53786f)));
                    }
                }
                o38VarMo6136f.f53799s = p28Var;
                if (RecyclerView.f6595X0) {
                    if (view.getParent() != null) {
                    }
                    if (view.getParent() == null) {
                        ij6.m13966x(o38VarMo6136f, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                        return null;
                    }
                }
                o38VarMo6136f.m17785e();
                p28Var.mo6135e(o38VarMo6136f, iM19751t);
                if (z5) {
                    arrayList3 = o38VarMo6136f.f53791k;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    o38VarMo6136f.f53790j &= -1025;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof z28) {
                        ((z28) layoutParams).f70801c = z2;
                    }
                    Trace.endSection();
                }
                if (z4) {
                    recyclerView.detachViewFromParent(view);
                }
                nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                e38 e38VarM11528a10 = this.f40129g.m11528a(o38VarMo6136f.f53786f);
                j4 = e38VarM11528a10.f36661d;
                if (j4 != 0) {
                    nanoTime2 = (nanoTime2 / j3) + ((j4 / j3) * j2);
                }
                e38VarM11528a10.f36661d = nanoTime2;
                accessibilityManager = recyclerView.f6641W;
                if (accessibilityManager == null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (k38Var.f46633g) {
                    o38VarMo6136f.f53787g = i;
                }
                z7 = z6;
            }
            z8 = z7;
        }
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            z28Var = (z28) recyclerView.generateDefaultLayoutParams();
            view.setLayoutParams(z28Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            z28Var = (z28) recyclerView.generateLayoutParams(layoutParams2);
            view.setLayoutParams(z28Var);
        } else {
            z28Var = (z28) layoutParams2;
        }
        z28Var.f70799a = o38VarMo6136f;
        if (z) {
            z9 = z3;
        } else {
            z9 = z3;
        }
        z28Var.f70802d = z9;
        return o38VarMo6136f;
    }

    /* JADX INFO: renamed from: m */
    public final void m12341m(o38 o38Var) {
        if (o38Var.f53795o) {
            this.f40124b.remove(o38Var);
        } else {
            this.f40123a.remove(o38Var);
        }
        o38Var.f53794n = null;
        o38Var.f53795o = false;
        o38Var.f53790j &= -33;
    }

    /* JADX INFO: renamed from: n */
    public final void m12342n() {
        y28 y28Var = this.f40130h.f6613I;
        this.f40128f = this.f40127e + (y28Var != null ? y28Var.f69180j : 0);
        ArrayList arrayList = this.f40125c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f40128f; size--) {
            m12336h(size);
        }
    }
}
