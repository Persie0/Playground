package p000;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class naa implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public daa f52544a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f52545b;

    /* JADX WARN: Code duplicated, block: B:100:0x020b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0219  */
    /* JADX WARN: Code duplicated, block: B:103:0x0225  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02da  */
    /* JADX WARN: Code duplicated, block: B:143:0x02df  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0303 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3 A[EDGE_INSN: B:153:0x01e3->B:90:0x01e3 BREAK  A[LOOP:1: B:19:0x0087->B:89:0x01dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x02e5, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        ny8 ny8Var;
        ny8 ny8Var2;
        C3275kv c3275kv;
        C3275kv c3275kv2;
        int i2;
        int[] iArr;
        boolean z;
        int i3;
        int i4;
        C3275kv c3275kvM10182x;
        int i5;
        Animator animator;
        s9a s9aVar;
        waa waaVar;
        waa waaVar2;
        int i6;
        boolean z2;
        int i7;
        View view;
        waa waaVar3;
        C3275kv c3275kv3;
        int i8;
        int i9;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i10;
        View view4;
        View view5;
        tk5 tk5Var;
        int iM22182h;
        int i11;
        View view6;
        boolean z3;
        Iterator it;
        daa daaVar = this.f52544a;
        ViewGroup viewGroup = this.f52545b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z4 = true;
        if (!oaa.f54112c.remove(viewGroup)) {
            return true;
        }
        C3275kv c3275kvM17885b = oaa.m17885b();
        ArrayList arrayList2 = (ArrayList) c3275kvM17885b.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(daaVar);
            daaVar.m10202a(new maa(this, c3275kvM17885b));
            i = 0;
            daaVar.m10209k(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((daa) it.next()).mo10191L(viewGroup);
                }
            }
            daaVar.f35313K = new ArrayList();
            daaVar.f35314L = new ArrayList();
            ny8Var = daaVar.f35340l;
            ny8Var2 = daaVar.f35310H;
            c3275kv = new C3275kv((C3275kv) ny8Var.f53414b);
            c3275kv2 = new C3275kv((C3275kv) ny8Var2.f53414b);
            i2 = 0;
            while (true) {
                iArr = daaVar.f35312J;
                if (i2 < iArr.length) {
                    break;
                }
                i6 = iArr[i2];
                if (i6 != z4) {
                    z2 = z4;
                    for (i7 = c3275kv.f49254c - 1; i7 >= 0; i7--) {
                        view = (View) c3275kv.m15974f(i7);
                        if (view == null && daaVar.m10185D(view) && (waaVar3 = (waa) c3275kv2.remove(view)) != null && daaVar.m10185D(waaVar3.f66571b)) {
                            daaVar.f35313K.add((waa) c3275kv.m15975g(i7));
                            daaVar.f35314L.add(waaVar3);
                        }
                    }
                } else if (i6 != 2) {
                    z2 = z4;
                    c3275kv3 = (C3275kv) ny8Var.f53417e;
                    C3275kv c3275kv4 = (C3275kv) ny8Var2.f53417e;
                    i8 = c3275kv3.f49254c;
                    for (i9 = 0; i9 < i8; i9++) {
                        view2 = (View) c3275kv3.m15977i(i9);
                        if (view2 == null && daaVar.m10185D(view2) && (view3 = (View) c3275kv4.get(c3275kv3.m15974f(i9))) != null && daaVar.m10185D(view3)) {
                            waa waaVar4 = (waa) c3275kv.get(view2);
                            waa waaVar5 = (waa) c3275kv2.get(view3);
                            if (waaVar4 != null && waaVar5 != null) {
                                daaVar.f35313K.add(waaVar4);
                                daaVar.f35314L.add(waaVar5);
                                c3275kv.remove(view2);
                                c3275kv2.remove(view3);
                            }
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        tk5Var = (tk5) ny8Var.f53416d;
                        tk5 tk5Var2 = (tk5) ny8Var2.f53416d;
                        iM22182h = tk5Var.m22182h();
                        i11 = i;
                        while (i11 < iM22182h) {
                            view6 = (View) tk5Var.m22183i(i11);
                            if (view6 == null && daaVar.m10185D(view6)) {
                                boolean z5 = z4;
                                View view7 = (View) tk5Var2.m22176b(tk5Var.m22179e(i11));
                                if (view7 == null || !daaVar.m10185D(view7)) {
                                    z3 = z5;
                                } else {
                                    waa waaVar6 = (waa) c3275kv.get(view6);
                                    z3 = z5;
                                    waa waaVar7 = (waa) c3275kv2.get(view7);
                                    if (waaVar6 != null && waaVar7 != null) {
                                        daaVar.f35313K.add(waaVar6);
                                        daaVar.f35314L.add(waaVar7);
                                        c3275kv.remove(view6);
                                        c3275kv2.remove(view7);
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                            i11++;
                            z4 = z3;
                        }
                    }
                    z2 = z4;
                } else {
                    z2 = z4;
                    sparseArray = (SparseArray) ny8Var.f53415c;
                    SparseArray sparseArray2 = (SparseArray) ny8Var2.f53415c;
                    size = sparseArray.size();
                    for (i10 = 0; i10 < size; i10++) {
                        view4 = (View) sparseArray.valueAt(i10);
                        if (view4 == null && daaVar.m10185D(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && daaVar.m10185D(view5)) {
                            waa waaVar8 = (waa) c3275kv.get(view4);
                            waa waaVar9 = (waa) c3275kv2.get(view5);
                            if (waaVar8 != null && waaVar9 != null) {
                                daaVar.f35313K.add(waaVar8);
                                daaVar.f35314L.add(waaVar9);
                                c3275kv.remove(view4);
                                c3275kv2.remove(view5);
                            }
                        }
                    }
                }
                i2++;
                i = 0;
                z4 = z2;
            }
            z = z4;
            for (i3 = 0; i3 < c3275kv.f49254c; i3++) {
                waaVar2 = (waa) c3275kv.m15977i(i3);
                if (daaVar.m10185D(waaVar2.f66571b)) {
                    daaVar.f35313K.add(waaVar2);
                    daaVar.f35314L.add(null);
                }
            }
            for (i4 = 0; i4 < c3275kv2.f49254c; i4++) {
                waaVar = (waa) c3275kv2.m15977i(i4);
                if (daaVar.m10185D(waaVar.f66571b)) {
                    daaVar.f35314L.add(waaVar);
                    daaVar.f35313K.add(null);
                }
            }
            c3275kvM10182x = daa.m10182x();
            int i12 = c3275kvM10182x.f49254c;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                animator = (Animator) c3275kvM10182x.m15974f(i5);
                if (animator == null && (s9aVar = (s9a) c3275kvM10182x.get(animator)) != null) {
                    daa daaVar2 = s9aVar.f60569e;
                    View view8 = s9aVar.f60565a;
                    if (view8 != null && windowId.equals(s9aVar.f60568d)) {
                        waa waaVar10 = s9aVar.f60567c;
                        boolean z6 = z;
                        waa waaVarM10219z = daaVar.m10219z(view8, z6);
                        waa waaVarM10217v = daaVar.m10217v(view8, z6);
                        if (waaVarM10219z == null && waaVarM10217v == null) {
                            waaVarM10217v = (waa) ((C3275kv) daaVar.f35310H.f53414b).get(view8);
                        }
                        if ((waaVarM10219z != null || waaVarM10217v != null) && daaVar2.mo10184C(waaVar10, waaVarM10217v)) {
                            daa daaVarM10218w = daaVar2.m10218w();
                            ArrayList arrayList3 = daaVar2.f35316N;
                            if (daaVarM10218w.f35327Y != null) {
                                animator.cancel();
                                arrayList3.remove(animator);
                                c3275kvM10182x.remove(animator);
                                if (arrayList3.size() == 0) {
                                    daaVar2.m10186F(daaVar2, uk9.f64029d, false);
                                    if (!daaVar2.f35320R) {
                                        daaVar2.f35320R = true;
                                        daaVar2.m10186F(daaVar2, uk9.f64028c, false);
                                    }
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c3275kvM10182x.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z = true;
            }
            daaVar.mo10212p(viewGroup, daaVar.f35340l, daaVar.f35310H, daaVar.f35313K, daaVar.f35314L);
            if (daaVar.f35327Y == null) {
                daaVar.mo10192M();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            daaVar.mo10188H();
            y9a y9aVar = daaVar.f35327Y;
            raa raaVar = y9aVar.f69522g;
            long j = raaVar.f35326X == 0 ? 1L : 0L;
            raaVar.mo10193N(j, y9aVar.f69516a);
            y9aVar.f69516a = j;
            daaVar.f35327Y.f69517b = true;
            return true;
        }
        arrayList2 = new ArrayList();
        c3275kvM17885b.put(viewGroup, arrayList2);
        arrayList2.add(daaVar);
        daaVar.m10202a(new maa(this, c3275kvM17885b));
        i = 0;
        daaVar.m10209k(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((daa) it.next()).mo10191L(viewGroup);
            }
        }
        daaVar.f35313K = new ArrayList();
        daaVar.f35314L = new ArrayList();
        ny8Var = daaVar.f35340l;
        ny8Var2 = daaVar.f35310H;
        c3275kv = new C3275kv((C3275kv) ny8Var.f53414b);
        c3275kv2 = new C3275kv((C3275kv) ny8Var2.f53414b);
        i2 = 0;
        while (true) {
            iArr = daaVar.f35312J;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i6 = iArr[i2];
            if (i6 != z4) {
                z2 = z4;
                while (i7 >= 0) {
                    view = (View) c3275kv.m15974f(i7);
                    if (view == null) {
                    }
                }
            } else if (i6 != 2) {
                z2 = z4;
                c3275kv3 = (C3275kv) ny8Var.f53417e;
                C3275kv c3275kv5 = (C3275kv) ny8Var2.f53417e;
                i8 = c3275kv3.f49254c;
                while (i9 < i8) {
                    view2 = (View) c3275kv3.m15977i(i9);
                    if (view2 == null) {
                    }
                }
            } else if (i6 != 3) {
                if (i6 == 4) {
                    tk5Var = (tk5) ny8Var.f53416d;
                    tk5 tk5Var3 = (tk5) ny8Var2.f53416d;
                    iM22182h = tk5Var.m22182h();
                    i11 = i;
                    while (i11 < iM22182h) {
                        view6 = (View) tk5Var.m22183i(i11);
                        if (view6 == null) {
                            z3 = z4;
                        } else {
                            z3 = z4;
                        }
                        i11++;
                        z4 = z3;
                    }
                }
                z2 = z4;
            } else {
                z2 = z4;
                sparseArray = (SparseArray) ny8Var.f53415c;
                SparseArray sparseArray3 = (SparseArray) ny8Var2.f53415c;
                size = sparseArray.size();
                while (i10 < size) {
                    view4 = (View) sparseArray.valueAt(i10);
                    if (view4 == null) {
                    }
                }
            }
            i2++;
            i = 0;
            z4 = z2;
        }
        z = z4;
        while (i3 < c3275kv.f49254c) {
            waaVar2 = (waa) c3275kv.m15977i(i3);
            if (daaVar.m10185D(waaVar2.f66571b)) {
                daaVar.f35313K.add(waaVar2);
                daaVar.f35314L.add(null);
            }
        }
        while (i4 < c3275kv2.f49254c) {
            waaVar = (waa) c3275kv2.m15977i(i4);
            if (daaVar.m10185D(waaVar.f66571b)) {
                daaVar.f35314L.add(waaVar);
                daaVar.f35313K.add(null);
            }
        }
        c3275kvM10182x = daa.m10182x();
        int i13 = c3275kvM10182x.f49254c;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i13 - 1;
        while (i5 >= 0) {
            animator = (Animator) c3275kvM10182x.m15974f(i5);
            if (animator == null) {
            }
            i5--;
            z = true;
        }
        daaVar.mo10212p(viewGroup, daaVar.f35340l, daaVar.f35310H, daaVar.f35313K, daaVar.f35314L);
        if (daaVar.f35327Y == null) {
            daaVar.mo10192M();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        daaVar.mo10188H();
        y9a y9aVar2 = daaVar.f35327Y;
        raa raaVar2 = y9aVar2.f69522g;
        if (raaVar2.f35326X == 0) {
        }
        raaVar2.mo10193N(j, y9aVar2.f69516a);
        y9aVar2.f69516a = j;
        daaVar.f35327Y.f69517b = true;
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f52545b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        oaa.f54112c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) oaa.m17885b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((daa) it.next()).mo10191L(viewGroup);
            }
        }
        this.f52544a.m10210l(true);
    }
}
