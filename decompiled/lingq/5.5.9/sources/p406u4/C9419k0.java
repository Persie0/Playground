package p406u4;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p326q.C8446b;
import p326q.C8449e;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9419k0 {

    /* JADX INFO: renamed from: a */
    public static final C9400b f48348a = new C9400b();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<WeakReference<C8446b<ViewGroup, ArrayList<AbstractC9409f0>>>> f48349b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c */
    public static final ArrayList<ViewGroup> f48350c = new ArrayList<>();

    /* JADX INFO: renamed from: u4.k0$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final AbstractC9409f0 f48351a;

        /* JADX INFO: renamed from: b */
        public final ViewGroup f48352b;

        /* JADX INFO: renamed from: u4.k0$a$a, reason: collision with other inner class name */
        public class C10671a extends C9417j0 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C8446b f48353a;

            public C10671a(C8446b c8446b) {
                this.f48353a = c8446b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p406u4.AbstractC9409f0.e
            /* JADX INFO: renamed from: e */
            public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
                ((ArrayList) this.f48353a.getOrDefault(a.this.f48352b, null)).remove(abstractC9409f0);
                abstractC9409f0.mo17779F(this);
            }
        }

        public a(ViewGroup viewGroup, AbstractC9409f0 abstractC9409f0) {
            this.f48351a = abstractC9409f0;
            this.f48352b = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0227  */
        /* JADX WARN: Code duplicated, block: B:105:0x0246  */
        /* JADX WARN: Code duplicated, block: B:137:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:142:0x01ef A[EDGE_INSN: B:142:0x01ef->B:89:0x01ef BREAK  A[LOOP:1: B:19:0x0089->B:88:0x01e4], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x0050  */
        /* JADX WARN: Code duplicated, block: B:17:0x005a A[LOOP:0: B:15:0x0054->B:17:0x005a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:180:0x0210 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:183:0x0233 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x008e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0092  */
        /* JADX WARN: Code duplicated, block: B:25:0x0096  */
        /* JADX WARN: Code duplicated, block: B:27:0x009a  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:46:0x0101  */
        /* JADX WARN: Code duplicated, block: B:48:0x0113  */
        /* JADX WARN: Code duplicated, block: B:61:0x0158  */
        /* JADX WARN: Code duplicated, block: B:63:0x0168  */
        /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:79:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:92:0x01f6  */
        /* JADX WARN: Code duplicated, block: B:94:0x0204  */
        /* JADX WARN: Code duplicated, block: B:99:0x0219  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            AbstractC9409f0 abstractC9409f0;
            int i10;
            C9427o0 c9427o0;
            C9427o0 c9427o1;
            C8446b c8446b;
            C8446b c8446b2;
            int i11;
            int[] iArr;
            int i12;
            int i13;
            C8446b<Animator, AbstractC9409f0.b> c8446bM17775x;
            int i14;
            Animator animatorM16529h;
            AbstractC9409f0.b orDefault;
            View view;
            C9425n0 c9425n0;
            C9425n0 c9425n1;
            int i15;
            ViewGroup viewGroup;
            int i16;
            View view2;
            C9425n0 c9425n2;
            C8446b c8446b3;
            int i17;
            int i18;
            View view3;
            View view4;
            SparseArray sparseArray;
            int size;
            int i19;
            View view5;
            View view6;
            C8449e c8449e;
            int iM16514i;
            int i20;
            View view7;
            ViewGroup viewGroup2;
            Iterator it;
            ViewGroup viewGroup3 = this.f48352b;
            viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup3.removeOnAttachStateChangeListener(this);
            int i21 = 1;
            if (!C9419k0.f48350c.remove(viewGroup3)) {
                return true;
            }
            C8446b<ViewGroup, ArrayList<AbstractC9409f0>> c8446bM17820b = C9419k0.m17820b();
            Long l10 = null;
            ArrayList<AbstractC9409f0> orDefault2 = c8446bM17820b.getOrDefault(viewGroup3, null);
            if (orDefault2 != null) {
                arrayList = orDefault2.size() > 0 ? new ArrayList(orDefault2) : null;
                abstractC9409f0 = this.f48351a;
                orDefault2.add(abstractC9409f0);
                abstractC9409f0.mo17791b(new C10671a(c8446bM17820b));
                i10 = 0;
                abstractC9409f0.m17798m(viewGroup3, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC9409f0) it.next()).mo17781H(viewGroup3);
                    }
                }
                abstractC9409f0.f48280K = new ArrayList<>();
                abstractC9409f0.f48281L = new ArrayList<>();
                c9427o0 = abstractC9409f0.f48302l;
                c9427o1 = abstractC9409f0.f48277H;
                c8446b = new C8446b((C8446b) c9427o0.f48376a);
                c8446b2 = new C8446b((C8446b) c9427o1.f48376a);
                i11 = 0;
                while (true) {
                    iArr = abstractC9409f0.f48279J;
                    if (i11 < iArr.length) {
                        break;
                    }
                    i15 = iArr[i11];
                    if (i15 != i21) {
                        viewGroup = viewGroup3;
                        i16 = c8446b.f45619c;
                        while (true) {
                            i16--;
                            if (i16 >= 0) {
                                view2 = (View) c8446b.m16529h(i16);
                                if (view2 == null && abstractC9409f0.m17777B(view2) && (c9425n2 = (C9425n0) c8446b2.remove(view2)) != null && abstractC9409f0.m17777B(c9425n2.f48373b)) {
                                    abstractC9409f0.f48280K.add((C9425n0) c8446b.mo14869k(i16));
                                    abstractC9409f0.f48281L.add(c9425n2);
                                }
                            }
                        }
                    } else if (i15 != 2) {
                        viewGroup = viewGroup3;
                        c8446b3 = (C8446b) c9427o0.f48377b;
                        C8446b c8446b4 = (C8446b) c9427o1.f48377b;
                        i17 = c8446b3.f45619c;
                        for (i18 = 0; i18 < i17; i18++) {
                            view3 = (View) c8446b3.m16530m(i18);
                            if (view3 == null && abstractC9409f0.m17777B(view3) && (view4 = (View) c8446b4.getOrDefault(c8446b3.m16529h(i18), null)) != null && abstractC9409f0.m17777B(view4)) {
                                C9425n0 c9425n3 = (C9425n0) c8446b.getOrDefault(view3, null);
                                C9425n0 c9425n4 = (C9425n0) c8446b2.getOrDefault(view4, null);
                                if (c9425n3 != null && c9425n4 != null) {
                                    abstractC9409f0.f48280K.add(c9425n3);
                                    abstractC9409f0.f48281L.add(c9425n4);
                                    c8446b.remove(view3);
                                    c8446b2.remove(view4);
                                }
                            }
                        }
                    } else if (i15 != 3) {
                        if (i15 == 4) {
                            c8449e = (C8449e) c9427o0.f48379d;
                            C8449e c8449e2 = (C8449e) c9427o1.f48379d;
                            iM16514i = c8449e.m16514i();
                            i20 = i10;
                            while (i20 < iM16514i) {
                                view7 = (View) c8449e.m16515j(i20);
                                if (view7 == null && abstractC9409f0.m17777B(view7)) {
                                    viewGroup2 = viewGroup3;
                                    View view8 = (View) c8449e2.m16510e(c8449e.m16511f(i20), l10);
                                    if (view8 != null && abstractC9409f0.m17777B(view8)) {
                                        C9425n0 c9425n5 = (C9425n0) c8446b.getOrDefault(view7, l10);
                                        C9425n0 c9425n6 = (C9425n0) c8446b2.getOrDefault(view8, l10);
                                        if (c9425n5 != null && c9425n6 != null) {
                                            abstractC9409f0.f48280K.add(c9425n5);
                                            abstractC9409f0.f48281L.add(c9425n6);
                                            c8446b.remove(view7);
                                            c8446b2.remove(view8);
                                        }
                                    }
                                } else {
                                    viewGroup2 = viewGroup3;
                                }
                                i20++;
                                viewGroup3 = viewGroup2;
                                l10 = null;
                            }
                        }
                        viewGroup = viewGroup3;
                    } else {
                        viewGroup = viewGroup3;
                        sparseArray = (SparseArray) c9427o0.f48378c;
                        SparseArray sparseArray2 = (SparseArray) c9427o1.f48378c;
                        size = sparseArray.size();
                        for (i19 = 0; i19 < size; i19++) {
                            view5 = (View) sparseArray.valueAt(i19);
                            if (view5 == null && abstractC9409f0.m17777B(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && abstractC9409f0.m17777B(view6)) {
                                C9425n0 c9425n7 = (C9425n0) c8446b.getOrDefault(view5, null);
                                C9425n0 c9425n8 = (C9425n0) c8446b2.getOrDefault(view6, null);
                                if (c9425n7 != null && c9425n8 != null) {
                                    abstractC9409f0.f48280K.add(c9425n7);
                                    abstractC9409f0.f48281L.add(c9425n8);
                                    c8446b.remove(view5);
                                    c8446b2.remove(view6);
                                }
                            }
                        }
                    }
                    i11++;
                    viewGroup3 = viewGroup;
                    i10 = 0;
                    l10 = null;
                    i21 = 1;
                }
                ViewGroup viewGroup4 = viewGroup3;
                for (i12 = 0; i12 < c8446b.f45619c; i12++) {
                    c9425n1 = (C9425n0) c8446b.m16530m(i12);
                    if (abstractC9409f0.m17777B(c9425n1.f48373b)) {
                        abstractC9409f0.f48280K.add(c9425n1);
                        abstractC9409f0.f48281L.add(null);
                    }
                }
                for (i13 = 0; i13 < c8446b2.f45619c; i13++) {
                    c9425n0 = (C9425n0) c8446b2.m16530m(i13);
                    if (abstractC9409f0.m17777B(c9425n0.f48373b)) {
                        abstractC9409f0.f48281L.add(c9425n0);
                        abstractC9409f0.f48280K.add(null);
                    }
                }
                c8446bM17775x = AbstractC9409f0.m17775x();
                int i22 = c8446bM17775x.f45619c;
                C9441v0 c9441v0 = C9433r0.f48403a;
                WindowId windowId = viewGroup4.getWindowId();
                for (i14 = i22 - 1; i14 >= 0; i14--) {
                    animatorM16529h = c8446bM17775x.m16529h(i14);
                    if (animatorM16529h == null && (orDefault = c8446bM17775x.getOrDefault(animatorM16529h, null)) != null && (view = orDefault.f48303a) != null) {
                        InterfaceC9399a1 interfaceC9399a1 = orDefault.f48306d;
                        if ((interfaceC9399a1 instanceof C9449z0) && ((C9449z0) interfaceC9399a1).f48446a.equals(windowId)) {
                            C9425n0 c9425n0M17807z = abstractC9409f0.m17807z(view, true);
                            C9425n0 c9425n0M17806w = abstractC9409f0.m17806w(view, true);
                            if (c9425n0M17807z == null && c9425n0M17806w == null) {
                                c9425n0M17806w = (C9425n0) ((C8446b) abstractC9409f0.f48277H.f48376a).getOrDefault(view, null);
                            }
                            if (!(c9425n0M17807z == null && c9425n0M17806w == null) && orDefault.f48307e.mo17776A(orDefault.f48305c, c9425n0M17806w)) {
                                if (animatorM16529h.isRunning() || animatorM16529h.isStarted()) {
                                    animatorM16529h.cancel();
                                } else {
                                    c8446bM17775x.remove(animatorM16529h);
                                }
                            }
                        }
                    }
                }
                abstractC9409f0.mo17801r(viewGroup4, abstractC9409f0.f48302l, abstractC9409f0.f48277H, abstractC9409f0.f48280K, abstractC9409f0.f48281L);
                abstractC9409f0.mo17782I();
                return true;
            }
            orDefault2 = new ArrayList<>();
            c8446bM17820b.put(viewGroup3, orDefault2);
            abstractC9409f0 = this.f48351a;
            orDefault2.add(abstractC9409f0);
            abstractC9409f0.mo17791b(new C10671a(c8446bM17820b));
            i10 = 0;
            abstractC9409f0.m17798m(viewGroup3, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC9409f0) it.next()).mo17781H(viewGroup3);
                }
            }
            abstractC9409f0.f48280K = new ArrayList<>();
            abstractC9409f0.f48281L = new ArrayList<>();
            c9427o0 = abstractC9409f0.f48302l;
            c9427o1 = abstractC9409f0.f48277H;
            c8446b = new C8446b((C8446b) c9427o0.f48376a);
            c8446b2 = new C8446b((C8446b) c9427o1.f48376a);
            i11 = 0;
            while (true) {
                iArr = abstractC9409f0.f48279J;
                if (i11 < iArr.length) {
                    break;
                    break;
                }
                i15 = iArr[i11];
                if (i15 != i21) {
                    viewGroup = viewGroup3;
                    i16 = c8446b.f45619c;
                    while (true) {
                        i16--;
                        if (i16 >= 0) {
                            view2 = (View) c8446b.m16529h(i16);
                            if (view2 == null) {
                            }
                        }
                    }
                } else if (i15 != 2) {
                    viewGroup = viewGroup3;
                    c8446b3 = (C8446b) c9427o0.f48377b;
                    C8446b c8446b5 = (C8446b) c9427o1.f48377b;
                    i17 = c8446b3.f45619c;
                    while (i18 < i17) {
                        view3 = (View) c8446b3.m16530m(i18);
                        if (view3 == null) {
                        }
                    }
                } else if (i15 != 3) {
                    if (i15 == 4) {
                        c8449e = (C8449e) c9427o0.f48379d;
                        C8449e c8449e3 = (C8449e) c9427o1.f48379d;
                        iM16514i = c8449e.m16514i();
                        i20 = i10;
                        while (i20 < iM16514i) {
                            view7 = (View) c8449e.m16515j(i20);
                            if (view7 == null) {
                                viewGroup2 = viewGroup3;
                            } else {
                                viewGroup2 = viewGroup3;
                            }
                            i20++;
                            viewGroup3 = viewGroup2;
                            l10 = null;
                        }
                    }
                    viewGroup = viewGroup3;
                } else {
                    viewGroup = viewGroup3;
                    sparseArray = (SparseArray) c9427o0.f48378c;
                    SparseArray sparseArray3 = (SparseArray) c9427o1.f48378c;
                    size = sparseArray.size();
                    while (i19 < size) {
                        view5 = (View) sparseArray.valueAt(i19);
                        if (view5 == null) {
                        }
                    }
                }
                i11++;
                viewGroup3 = viewGroup;
                i10 = 0;
                l10 = null;
                i21 = 1;
            }
            ViewGroup viewGroup5 = viewGroup3;
            while (i12 < c8446b.f45619c) {
                c9425n1 = (C9425n0) c8446b.m16530m(i12);
                if (abstractC9409f0.m17777B(c9425n1.f48373b)) {
                    abstractC9409f0.f48280K.add(c9425n1);
                    abstractC9409f0.f48281L.add(null);
                }
            }
            while (i13 < c8446b2.f45619c) {
                c9425n0 = (C9425n0) c8446b2.m16530m(i13);
                if (abstractC9409f0.m17777B(c9425n0.f48373b)) {
                    abstractC9409f0.f48281L.add(c9425n0);
                    abstractC9409f0.f48280K.add(null);
                }
            }
            c8446bM17775x = AbstractC9409f0.m17775x();
            int i23 = c8446bM17775x.f45619c;
            C9441v0 c9441v1 = C9433r0.f48403a;
            WindowId windowId2 = viewGroup5.getWindowId();
            while (i14 >= 0) {
                animatorM16529h = c8446bM17775x.m16529h(i14);
                if (animatorM16529h == null) {
                }
            }
            abstractC9409f0.mo17801r(viewGroup5, abstractC9409f0.f48302l, abstractC9409f0.f48277H, abstractC9409f0.f48280K, abstractC9409f0.f48281L);
            abstractC9409f0.mo17782I();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f48352b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            C9419k0.f48350c.remove(viewGroup);
            ArrayList<AbstractC9409f0> orDefault = C9419k0.m17820b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<AbstractC9409f0> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().mo17781H(viewGroup);
                }
            }
            this.f48351a.m17799n(true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m17819a(ViewGroup viewGroup, AbstractC9409f0 abstractC9409f0) {
        ArrayList<ViewGroup> arrayList = f48350c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18699c(viewGroup)) {
                arrayList.add(viewGroup);
                if (abstractC9409f0 == null) {
                    abstractC9409f0 = f48348a;
                }
                AbstractC9409f0 abstractC9409f0Clone = abstractC9409f0.clone();
                ArrayList<AbstractC9409f0> orDefault = m17820b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<AbstractC9409f0> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().mo17778E(viewGroup);
                    }
                }
                if (abstractC9409f0Clone != null) {
                    abstractC9409f0Clone.m17798m(viewGroup, true);
                }
                if (((C9401b0) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                    throw null;
                }
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (abstractC9409f0Clone != null) {
                    a aVar = new a(viewGroup, abstractC9409f0Clone);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8446b<ViewGroup, ArrayList<AbstractC9409f0>> m17820b() {
        C8446b<ViewGroup, ArrayList<AbstractC9409f0>> c8446b;
        ThreadLocal<WeakReference<C8446b<ViewGroup, ArrayList<AbstractC9409f0>>>> threadLocal = f48349b;
        WeakReference<C8446b<ViewGroup, ArrayList<AbstractC9409f0>>> weakReference = threadLocal.get();
        if (weakReference != null && (c8446b = weakReference.get()) != null) {
            return c8446b;
        }
        C8446b<ViewGroup, ArrayList<AbstractC9409f0>> c8446b2 = new C8446b<>();
        threadLocal.set(new WeakReference<>(c8446b2));
        return c8446b2;
    }
}
