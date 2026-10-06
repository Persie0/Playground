package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asi implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    final asf f2249a;

    /* JADX INFO: renamed from: b */
    final ViewGroup f2250b;

    public asi(asf asfVar, ViewGroup viewGroup) {
        this.f2249a = asfVar;
        this.f2250b = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    private final void m1957a() {
        this.f2250b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f2250b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        drj drjVar;
        bbo bboVar;
        asq asqVar;
        bbo bboVar2;
        m1957a();
        if (!asj.f2251a.remove(this.f2250b)) {
            return true;
        }
        C1109wy c1109wyM1958a = asj.m1958a();
        ArrayList arrayList2 = (ArrayList) c1109wyM1958a.get(this.f2250b);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c1109wyM1958a.put(this.f2250b, arrayList2);
            arrayList = null;
        } else {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
        }
        arrayList2.add(this.f2249a);
        this.f2249a.m1953w(new ash(this, c1109wyM1958a));
        this.f2249a.m1944n(this.f2250b, false);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((asf) arrayList.get(i)).mo1948r(this.f2250b);
            }
        }
        asf asfVar = this.f2249a;
        ViewGroup viewGroup = this.f2250b;
        asfVar.f2234g = new ArrayList();
        asfVar.f2235h = new ArrayList();
        bbo bboVar3 = asfVar.f2237j;
        bbo bboVar4 = asfVar.f2238k;
        C1109wy c1109wy = new C1109wy((C1117xf) bboVar3.f2909c);
        C1109wy c1109wy2 = new C1109wy((C1117xf) bboVar4.f2909c);
        int i2 = 0;
        while (true) {
            int[] iArr = asfVar.f2233f;
            if (i2 >= 4) {
                for (int i3 = 0; i3 < c1109wy.f48004d; i3++) {
                    asq asqVar2 = (asq) c1109wy.m19560g(i3);
                    if (asfVar.m1952v(asqVar2.f2261b)) {
                        asfVar.f2234g.add(asqVar2);
                        asfVar.f2235h.add(null);
                    }
                }
                for (int i4 = 0; i4 < c1109wy2.f48004d; i4++) {
                    asq asqVar3 = (asq) c1109wy2.m19560g(i4);
                    if (asfVar.m1952v(asqVar3.f2261b)) {
                        asfVar.f2235h.add(asqVar3);
                        asfVar.f2234g.add(null);
                    }
                }
                C1109wy c1109wyM1930g = asf.m1930g();
                int i5 = c1109wyM1930g.f48004d;
                asz aszVarM1973a = asu.m1973a(viewGroup);
                for (int i6 = i5 - 1; i6 >= 0; i6--) {
                    Animator animator = (Animator) c1109wyM1930g.m19559d(i6);
                    if (animator != null && (drjVar = (drj) c1109wyM1930g.get(animator)) != null && drjVar.f12398d != null && aszVarM1973a.equals(drjVar.f12396b)) {
                        Object obj = drjVar.f12397c;
                        Object obj2 = drjVar.f12398d;
                        View view = (View) obj2;
                        asq asqVarM1940j = asfVar.m1940j(view, true);
                        asq asqVarM1939i = asfVar.m1939i(view, true);
                        if (asqVarM1940j == null && asqVarM1939i == null) {
                            asqVarM1939i = (asq) ((C1117xf) asfVar.f2238k.f2909c).get(obj2);
                        }
                        if ((asqVarM1940j != null || asqVarM1939i != null) && ((asf) drjVar.f12399e).mo1951u((asq) obj, asqVarM1939i)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c1109wyM1930g.remove(animator);
                            }
                        }
                    }
                }
                asfVar.mo1935E(viewGroup, asfVar.f2237j, asfVar.f2238k, asfVar.f2234g, asfVar.f2235h);
                asfVar.mo1949s();
                return true;
            }
            switch (iArr[i2]) {
                case 1:
                    bboVar = bboVar4;
                    for (int i7 = c1109wy.f48004d - 1; i7 >= 0; i7--) {
                        View view2 = (View) c1109wy.m19559d(i7);
                        if (view2 != null && asfVar.m1952v(view2) && (asqVar = (asq) c1109wy2.remove(view2)) != null && asfVar.m1952v(asqVar.f2261b)) {
                            asfVar.f2234g.add((asq) c1109wy.mo3366e(i7));
                            asfVar.f2235h.add(asqVar);
                        }
                    }
                    break;
                case 2:
                    bboVar = bboVar4;
                    Object obj3 = bboVar3.f2907a;
                    Object obj4 = bboVar.f2907a;
                    C1117xf c1117xf = (C1117xf) obj3;
                    int i8 = c1117xf.f48004d;
                    for (int i9 = 0; i9 < i8; i9++) {
                        View view3 = (View) c1117xf.m19560g(i9);
                        if (view3 != null && asfVar.m1952v(view3)) {
                            View view4 = (View) ((C1117xf) obj4).get(c1117xf.m19559d(i9));
                            if (view4 != null && asfVar.m1952v(view4)) {
                                asq asqVar4 = (asq) c1109wy.get(view3);
                                asq asqVar5 = (asq) c1109wy2.get(view4);
                                if (asqVar4 != null && asqVar5 != null) {
                                    asfVar.f2234g.add(asqVar4);
                                    asfVar.f2235h.add(asqVar5);
                                    c1109wy.remove(view3);
                                    c1109wy2.remove(view4);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    Object obj5 = bboVar3.f2908b;
                    bboVar = bboVar4;
                    Object obj6 = bboVar.f2908b;
                    SparseArray sparseArray = (SparseArray) obj5;
                    int size2 = sparseArray.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        View view5 = (View) sparseArray.valueAt(i10);
                        if (view5 != null && asfVar.m1952v(view5)) {
                            View view6 = (View) ((SparseArray) obj6).get(sparseArray.keyAt(i10));
                            if (view6 != null && asfVar.m1952v(view6)) {
                                asq asqVar6 = (asq) c1109wy.get(view5);
                                asq asqVar7 = (asq) c1109wy2.get(view6);
                                if (asqVar6 != null && asqVar7 != null) {
                                    asfVar.f2234g.add(asqVar6);
                                    asfVar.f2235h.add(asqVar7);
                                    c1109wy.remove(view5);
                                    c1109wy2.remove(view6);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    Object obj7 = bboVar3.f2910d;
                    Object obj8 = bboVar4.f2910d;
                    C1114xc c1114xc = (C1114xc) obj7;
                    int iM19544b = c1114xc.m19544b();
                    int i11 = 0;
                    while (i11 < iM19544b) {
                        View view7 = (View) c1114xc.m19547e(i11);
                        if (view7 == null) {
                            bboVar2 = bboVar4;
                        } else if (asfVar.m1952v(view7)) {
                            bboVar2 = bboVar4;
                            View view8 = (View) ((C1114xc) obj8).m19546d(c1114xc.m19545c(i11));
                            if (view8 != null && asfVar.m1952v(view8)) {
                                asq asqVar8 = (asq) c1109wy.get(view7);
                                asq asqVar9 = (asq) c1109wy2.get(view8);
                                if (asqVar8 != null && asqVar9 != null) {
                                    asfVar.f2234g.add(asqVar8);
                                    asfVar.f2235h.add(asqVar9);
                                    c1109wy.remove(view7);
                                    c1109wy2.remove(view8);
                                }
                            }
                        } else {
                            bboVar2 = bboVar4;
                        }
                        i11++;
                        bboVar4 = bboVar2;
                    }
                    bboVar = bboVar4;
                    break;
                default:
                    bboVar = bboVar4;
                    break;
            }
            i2++;
            bboVar4 = bboVar;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m1957a();
        asj.f2251a.remove(this.f2250b);
        ArrayList arrayList = (ArrayList) asj.m1958a().get(this.f2250b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((asf) arrayList.get(i)).mo1948r(this.f2250b);
            }
        }
        this.f2249a.m1945o(true);
    }
}
