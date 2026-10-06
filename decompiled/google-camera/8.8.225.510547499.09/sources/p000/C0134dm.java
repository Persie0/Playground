package p000;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: dm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0134dm {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f12008a;

    /* JADX INFO: renamed from: b */
    final ArrayList f12009b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f12010c = new ArrayList();

    /* JADX INFO: renamed from: d */
    boolean f12011d = false;

    /* JADX INFO: renamed from: e */
    boolean f12012e = false;

    public C0134dm(ViewGroup viewGroup) {
        this.f12008a = viewGroup;
    }

    /* JADX INFO: renamed from: b */
    public static C0134dm m6385b(ViewGroup viewGroup, C0111cq c0111cq) {
        c0111cq.m5321af();
        return m6387i(viewGroup);
    }

    /* JADX INFO: renamed from: h */
    public static void m6386h(C0133dl c0133dl) {
        C0137dp.m6524u(c0133dl.f11919e, c0133dl.f11915a.f4586N);
    }

    /* JADX INFO: renamed from: i */
    static C0134dm m6387i(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(C0100R.id.special_effects_controller_view_tag);
        if (tag instanceof C0134dm) {
            return (C0134dm) tag;
        }
        C0134dm c0134dm = new C0134dm(viewGroup);
        viewGroup.setTag(C0100R.id.special_effects_controller_view_tag, c0134dm);
        return c0134dm;
    }

    /* JADX INFO: renamed from: j */
    public static void m6388j(C1109wy c1109wy, Collection collection) {
        Iterator it = c1109wy.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(afh.m477h((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m6389l() {
        ArrayList arrayList = this.f12009b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0133dl c0133dl = (C0133dl) arrayList.get(i);
            if (c0133dl.f11920f == 2) {
                c0133dl.m6326e(C0137dp.m6522s(c0133dl.f11915a.requireView().getVisibility()), 1);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0133dl m6390a(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        ArrayList arrayList = this.f12009b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0133dl c0133dl = (C0133dl) arrayList.get(i);
            if (c0133dl.f11915a.equals(componentCallbacksC0077bw) && !c0133dl.f11917c) {
                return c0133dl;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0607 A[Catch: all -> 0x094e, TryCatch #2 {all -> 0x094e, blocks: (B:11:0x0019, B:13:0x0021, B:14:0x0031, B:16:0x0038, B:18:0x0044, B:19:0x0051, B:21:0x0058, B:22:0x005e, B:23:0x0076, B:25:0x007c, B:26:0x0086, B:27:0x008f, B:29:0x0095, B:31:0x00a9, B:39:0x00b8, B:40:0x00b9, B:42:0x00bf, B:43:0x00d4, B:44:0x00f5, B:46:0x00fb, B:47:0x011d, B:48:0x0121, B:50:0x0127, B:57:0x0155, B:58:0x017d, B:59:0x018a, B:61:0x0190, B:63:0x019c, B:68:0x01af, B:69:0x01de, B:77:0x01eb, B:78:0x0214, B:80:0x0217, B:81:0x021b, B:83:0x0221, B:85:0x0241, B:86:0x026b, B:88:0x0271, B:92:0x0283, B:93:0x02a4, B:95:0x02ac, B:97:0x02b9, B:98:0x02c4, B:99:0x02cb, B:101:0x02d3, B:103:0x02ec, B:105:0x02f5, B:106:0x0313, B:108:0x031c, B:110:0x0323, B:111:0x032c, B:113:0x0333, B:114:0x033c, B:116:0x034d, B:118:0x0354, B:120:0x0363, B:121:0x0364, B:123:0x0383, B:125:0x038a, B:127:0x0399, B:128:0x039a, B:130:0x03a2, B:132:0x03ae, B:133:0x03b1, B:134:0x03b4, B:136:0x03c8, B:137:0x03dd, B:139:0x03fc, B:141:0x0417, B:143:0x0424, B:145:0x0433, B:148:0x0448, B:102:0x02e0, B:150:0x0481, B:151:0x0495, B:153:0x049b, B:155:0x04ab, B:156:0x04c0, B:165:0x04de, B:168:0x04f7, B:171:0x050b, B:172:0x050f, B:173:0x0512, B:175:0x0518, B:180:0x0563, B:182:0x0568, B:184:0x056d, B:187:0x057b, B:189:0x0588, B:190:0x059e, B:186:0x0576, B:176:0x0520, B:178:0x0539, B:191:0x05b5, B:196:0x05cf, B:198:0x05db, B:211:0x05f8, B:213:0x0600, B:215:0x0607, B:216:0x061e, B:217:0x0624, B:226:0x0659, B:231:0x0674, B:233:0x067b, B:234:0x06a9, B:236:0x06b4), top: B:327:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:425:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0600 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX INFO: renamed from: c */
    final void m6391c() {
        ArrayList<C0060bf> arrayList;
        List list;
        C0133dl c0133dl;
        HashMap map;
        C0133dl c0133dl2;
        ArrayList arrayList2;
        HashMap map2;
        C0133dl c0133dl3;
        boolean z;
        Object obj;
        Object obj2;
        View view;
        View view2;
        aaa aaaVarM3129x;
        aaa aaaVarM3130y;
        Object obj3;
        Rect rect;
        View view3;
        List list2;
        C0133dl c0133dl4;
        boolean z2;
        if (this.f12012e) {
            return;
        }
        if (!afe.m461e(this.f12008a)) {
            m6392d();
            this.f12011d = false;
            return;
        }
        synchronized (this.f12009b) {
            try {
                try {
                    if (!this.f12009b.isEmpty()) {
                        ArrayList<C0133dl> arrayList3 = new ArrayList(this.f12010c);
                        this.f12010c.clear();
                        for (C0133dl c0133dl5 : arrayList3) {
                            if (C0111cq.m5275S(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Cancelling operation ");
                                sb.append(c0133dl5);
                            }
                            c0133dl5.m6325d();
                            if (!c0133dl5.f11918d) {
                                this.f12010c.add(c0133dl5);
                            }
                        }
                        m6389l();
                        ArrayList<C0133dl> arrayList4 = new ArrayList(this.f12009b);
                        this.f12009b.clear();
                        this.f12010c.addAll(arrayList4);
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            ((C0133dl) it.next()).mo6275b();
                        }
                        boolean z3 = this.f12011d;
                        byte[] bArr = null;
                        C0133dl c0133dl6 = null;
                        C0133dl c0133dl7 = null;
                        for (C0133dl c0133dl8 : arrayList4) {
                            int iM6523t = C0137dp.m6523t(c0133dl8.f11915a.f4586N);
                            int i = c0133dl8.f11919e;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            switch (i2) {
                                case 0:
                                case 2:
                                case 3:
                                    if (iM6523t == 2 && c0133dl7 == null) {
                                        c0133dl7 = c0133dl8;
                                    }
                                    break;
                                case 1:
                                    if (iM6523t != 2) {
                                        c0133dl6 = c0133dl8;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (C0111cq.m5275S(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Executing operations from ");
                            sb2.append(c0133dl7);
                            sb2.append(" to ");
                            sb2.append(c0133dl6);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList(arrayList4);
                        ComponentCallbacksC0077bw componentCallbacksC0077bw = ((C0133dl) arrayList4.get(arrayList4.size() - 1)).f11915a;
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C0073bs c0073bs = ((C0133dl) it2.next()).f11915a.f4589Q;
                            C0073bs c0073bs2 = componentCallbacksC0077bw.f4589Q;
                            c0073bs.f4256b = c0073bs2.f4256b;
                            c0073bs.f4257c = c0073bs2.f4257c;
                            c0073bs.f4258d = c0073bs2.f4258d;
                            c0073bs.f4259e = c0073bs2.f4259e;
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            C0133dl c0133dl9 = (C0133dl) it3.next();
                            exz exzVar = new exz(bArr);
                            c0133dl9.m6327f(exzVar);
                            arrayList5.add(new C0060bf(c0133dl9, exzVar, z3, bArr));
                            exz exzVar2 = new exz(bArr);
                            c0133dl9.m6327f(exzVar2);
                            if (z3) {
                                if (c0133dl9 == c0133dl7) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else if (c0133dl9 == c0133dl6) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ArrayList arrayList8 = arrayList7;
                            ArrayList arrayList9 = arrayList6;
                            arrayList9.add(new C0062bh(c0133dl9, exzVar2, z3, z2, null));
                            c0133dl9.m6324c(new RunnableC0058bd(arrayList8, c0133dl9, 1));
                            c0133dl6 = c0133dl6;
                            arrayList6 = arrayList9;
                            arrayList7 = arrayList8;
                            it3 = it3;
                            bArr = null;
                        }
                        ArrayList arrayList10 = arrayList7;
                        ArrayList<C0062bh> arrayList11 = arrayList6;
                        C0133dl c0133dl10 = c0133dl6;
                        HashMap map3 = new HashMap();
                        AbstractC0127df abstractC0127df = null;
                        for (C0062bh c0062bh : arrayList11) {
                            if (!c0062bh.m2374c()) {
                                AbstractC0127df abstractC0127dfM2455a = c0062bh.m2455a(c0062bh.f3226c);
                                AbstractC0127df abstractC0127dfM2455a2 = c0062bh.m2455a(c0062bh.f3228e);
                                if (abstractC0127dfM2455a != null && abstractC0127dfM2455a2 != null && abstractC0127dfM2455a != abstractC0127dfM2455a2) {
                                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c0062bh.f3152a.f11915a + VzWFSVj.swSAFKEvT + c0062bh.f3226c + " which uses a different Transition  type than its shared element transition " + c0062bh.f3228e);
                                }
                                if (abstractC0127dfM2455a == null) {
                                    abstractC0127dfM2455a = abstractC0127dfM2455a2;
                                }
                                if (abstractC0127df == null) {
                                    abstractC0127df = abstractC0127dfM2455a;
                                } else if (abstractC0127dfM2455a != null && abstractC0127df != abstractC0127dfM2455a) {
                                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c0062bh.f3152a.f11915a + " returned Transition " + c0062bh.f3226c + " which uses a different Transition  type than other Fragments.");
                                }
                            }
                        }
                        if (abstractC0127df == null) {
                            for (C0062bh c0062bh2 : arrayList11) {
                                map3.put(c0062bh2.f3152a, false);
                                c0062bh2.m2373b();
                            }
                            c0133dl = c0133dl10;
                            map = map3;
                            arrayList = arrayList5;
                            list = arrayList10;
                            c0133dl2 = c0133dl7;
                        } else {
                            View view4 = new View(this.f12008a.getContext());
                            Rect rect2 = new Rect();
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = new ArrayList();
                            C1109wy c1109wy = new C1109wy();
                            Iterator it4 = arrayList11.iterator();
                            arrayList = arrayList5;
                            Object obj4 = null;
                            boolean z4 = false;
                            View view5 = null;
                            while (it4.hasNext()) {
                                arrayList10 = arrayList10;
                                Object obj5 = ((C0062bh) it4.next()).f3228e;
                                if (obj5 == null || c0133dl7 == null || c0133dl10 == null) {
                                    rect2 = rect2;
                                    view4 = view4;
                                    map3 = map3;
                                    arrayList11 = arrayList11;
                                } else {
                                    Object objMo1912c = abstractC0127df.mo1912c(abstractC0127df.mo1910a(obj5));
                                    ArrayList arrayListM3116k = c0133dl10.f11915a.m3116k();
                                    ArrayList arrayList14 = arrayList11;
                                    ArrayList arrayListM3116k2 = c0133dl7.f11915a.m3116k();
                                    HashMap map4 = map3;
                                    ArrayList arrayListM3117l = c0133dl7.f11915a.m3117l();
                                    View view6 = view4;
                                    int i3 = 0;
                                    while (true) {
                                        Rect rect3 = rect2;
                                        if (i3 < arrayListM3117l.size()) {
                                            int iIndexOf = arrayListM3116k.indexOf(arrayListM3117l.get(i3));
                                            ArrayList arrayList15 = arrayListM3117l;
                                            if (iIndexOf != -1) {
                                                arrayListM3116k.set(iIndexOf, (String) arrayListM3116k2.get(i3));
                                            }
                                            i3++;
                                            arrayListM3117l = arrayList15;
                                            rect2 = rect3;
                                        } else {
                                            ArrayList arrayListM3117l2 = c0133dl10.f11915a.m3117l();
                                            if (z3) {
                                                aaaVarM3129x = c0133dl7.f11915a.m3129x();
                                                aaaVarM3130y = c0133dl10.f11915a.m3130y();
                                            } else {
                                                aaaVarM3129x = c0133dl7.f11915a.m3130y();
                                                aaaVarM3130y = c0133dl10.f11915a.m3129x();
                                            }
                                            int size = arrayListM3116k.size();
                                            int i4 = 0;
                                            while (i4 < size) {
                                                c1109wy.put((String) arrayListM3116k.get(i4), (String) arrayListM3117l2.get(i4));
                                                i4++;
                                                size = size;
                                                abstractC0127df = abstractC0127df;
                                            }
                                            AbstractC0127df abstractC0127df2 = abstractC0127df;
                                            if (C0111cq.m5275S(2)) {
                                                int size2 = arrayListM3117l2.size();
                                                for (int i5 = 0; i5 < size2; i5++) {
                                                }
                                                int size3 = arrayListM3116k.size();
                                                for (int i6 = 0; i6 < size3; i6++) {
                                                }
                                            }
                                            C1109wy c1109wy2 = new C1109wy();
                                            m6395g(c1109wy2, c0133dl7.f11915a.f4586N);
                                            c1109wy2.m19535a(arrayListM3116k);
                                            if (aaaVarM3129x != null) {
                                                if (C0111cq.m5275S(2)) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append("Executing exit callback for operation ");
                                                    sb3.append(c0133dl7);
                                                }
                                                throw null;
                                            }
                                            c1109wy.m19535a(c1109wy2.keySet());
                                            C1109wy c1109wy3 = new C1109wy();
                                            m6395g(c1109wy3, c0133dl10.f11915a.f4586N);
                                            c1109wy3.m19535a(arrayListM3117l2);
                                            c1109wy3.m19535a(c1109wy.values());
                                            if (aaaVarM3130y != null) {
                                                if (C0111cq.m5275S(2)) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append("Executing enter callback for operation ");
                                                    sb4.append(c0133dl10);
                                                }
                                                throw null;
                                            }
                                            int i7 = C0119cy.f10021c;
                                            for (int i8 = c1109wy.f48004d - 1; i8 >= 0; i8--) {
                                                if (!c1109wy3.containsKey((String) c1109wy.m19560g(i8))) {
                                                    c1109wy.mo3366e(i8);
                                                }
                                            }
                                            m6388j(c1109wy2, c1109wy.keySet());
                                            m6388j(c1109wy3, c1109wy.values());
                                            if (c1109wy.isEmpty()) {
                                                arrayList12.clear();
                                                arrayList13.clear();
                                                arrayList11 = arrayList14;
                                                map3 = map4;
                                                view4 = view6;
                                                rect2 = rect3;
                                                abstractC0127df = abstractC0127df2;
                                                obj4 = null;
                                            } else {
                                                C0119cy.m5728a(c0133dl10.f11915a, c0133dl7.f11915a, z3, c1109wy2, true);
                                                aex.m403b(this.f12008a, new RunnableC0057bc(c0133dl10, c0133dl7, z3, c1109wy3));
                                                arrayList12.addAll(c1109wy2.values());
                                                if (arrayListM3116k.isEmpty()) {
                                                    obj3 = objMo1912c;
                                                    abstractC0127df = abstractC0127df2;
                                                } else {
                                                    View view7 = (View) c1109wy2.get((String) arrayListM3116k.get(0));
                                                    obj3 = objMo1912c;
                                                    abstractC0127df = abstractC0127df2;
                                                    abstractC0127df.mo1919j(obj3, view7);
                                                    view5 = view7;
                                                }
                                                arrayList13.addAll(c1109wy3.values());
                                                if (arrayListM3117l2.isEmpty() || (view3 = (View) c1109wy3.get((String) arrayListM3117l2.get(0))) == null) {
                                                    rect = rect3;
                                                } else {
                                                    rect = rect3;
                                                    aex.m403b(this.f12008a, new RunnableC0058bd(view3, rect, 0));
                                                    z4 = true;
                                                }
                                                abstractC0127df.mo1920k(obj3, view6, arrayList12);
                                                abstractC0127df.mo1924o(obj3, null, null, obj3, arrayList13);
                                                map4.put(c0133dl7, true);
                                                map4.put(c0133dl10, true);
                                                obj4 = obj3;
                                                rect2 = rect;
                                                view4 = view6;
                                                map3 = map4;
                                                arrayList11 = arrayList14;
                                            }
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList16 = arrayList11;
                            list = arrayList10;
                            HashMap map5 = map3;
                            View view8 = view4;
                            Rect rect4 = rect2;
                            ArrayList arrayList17 = new ArrayList();
                            Iterator it5 = arrayList16.iterator();
                            Map map6 = c1109wy;
                            Object objMo1923n = null;
                            Object objMo1923n2 = null;
                            while (it5.hasNext()) {
                                it5 = it5;
                                C0062bh c0062bh3 = (C0062bh) it5.next();
                                if (c0062bh3.m2374c()) {
                                    obj = objMo1923n;
                                    obj2 = objMo1923n2;
                                    map5.put(c0062bh3.f3152a, false);
                                    c0062bh3.m2373b();
                                } else {
                                    obj = objMo1923n;
                                    obj2 = objMo1923n2;
                                    Object objMo1910a = abstractC0127df.mo1910a(c0062bh3.f3226c);
                                    C0133dl c0133dl11 = c0062bh3.f3152a;
                                    boolean z5 = obj4 != null && (c0133dl11 == c0133dl7 || c0133dl11 == c0133dl10);
                                    if (objMo1910a != null) {
                                        C0133dl c0133dl12 = c0133dl10;
                                        ArrayList arrayList18 = new ArrayList();
                                        Object obj6 = obj4;
                                        m6394f(arrayList18, c0133dl11.f11915a.f4586N);
                                        if (z5) {
                                            if (c0133dl11 == c0133dl7) {
                                                arrayList18.removeAll(arrayList12);
                                            } else {
                                                arrayList18.removeAll(arrayList13);
                                            }
                                        }
                                        if (arrayList18.isEmpty()) {
                                            abstractC0127df.mo1913d(objMo1910a, view8);
                                            view = view8;
                                        } else {
                                            abstractC0127df.mo1914e(objMo1910a, arrayList18);
                                            abstractC0127df.mo1924o(objMo1910a, objMo1910a, arrayList18, null, null);
                                            view = view8;
                                            if (c0133dl11.f11919e == 3) {
                                                List list3 = list;
                                                list3.remove(c0133dl11);
                                                ArrayList arrayList19 = new ArrayList(arrayList18);
                                                list = list3;
                                                arrayList19.remove(c0133dl11.f11915a.f4586N);
                                                abstractC0127df.mo1917h(objMo1910a, c0133dl11.f11915a.f4586N, arrayList19);
                                                aex.m403b(this.f12008a, new RunnableC0059be(arrayList18, 0));
                                            }
                                        }
                                        if (c0133dl11.f11919e == 2) {
                                            arrayList17.addAll(arrayList18);
                                            if (z4) {
                                                abstractC0127df.mo1918i(objMo1910a, rect4);
                                                view2 = view5;
                                            } else {
                                                view2 = view5;
                                            }
                                        } else {
                                            view2 = view5;
                                            abstractC0127df.mo1919j(objMo1910a, view2);
                                        }
                                        map5.put(c0133dl11, true);
                                        if (c0062bh3.f3227d) {
                                            objMo1923n2 = abstractC0127df.mo1923n(obj2, objMo1910a);
                                            view5 = view2;
                                            objMo1923n = obj;
                                            view8 = view;
                                            c0133dl10 = c0133dl12;
                                            obj4 = obj6;
                                            arrayList12 = arrayList12;
                                        } else {
                                            objMo1923n = abstractC0127df.mo1923n(obj, objMo1910a);
                                            view5 = view2;
                                            objMo1923n2 = obj2;
                                            view8 = view;
                                            c0133dl10 = c0133dl12;
                                            obj4 = obj6;
                                            arrayList12 = arrayList12;
                                        }
                                    } else if (!z5) {
                                        map5.put(c0133dl11, false);
                                        c0062bh3.m2373b();
                                    }
                                }
                                objMo1923n = obj;
                                objMo1923n2 = obj2;
                                c0133dl10 = c0133dl10;
                            }
                            c0133dl = c0133dl10;
                            Object obj7 = obj4;
                            ArrayList arrayList20 = arrayList12;
                            Object objMo1911b = abstractC0127df.mo1911b(objMo1923n2, objMo1923n, obj7);
                            if (objMo1911b != null) {
                                try {
                                    Iterator it6 = arrayList16.iterator();
                                    while (it6.hasNext()) {
                                        C0062bh c0062bh4 = (C0062bh) it6.next();
                                        if (!c0062bh4.m2374c()) {
                                            Object obj8 = c0062bh4.f3226c;
                                            C0133dl c0133dl13 = c0062bh4.f3152a;
                                            if (obj7 != null) {
                                                if (c0133dl13 != c0133dl7) {
                                                    c0133dl3 = c0133dl;
                                                    if (c0133dl13 == c0133dl3) {
                                                        z = true;
                                                    }
                                                } else {
                                                    c0133dl3 = c0133dl;
                                                    z = true;
                                                }
                                                if (obj8 != null && !z) {
                                                    c0133dl = c0133dl3;
                                                } else if (afe.m462f(this.f12008a)) {
                                                    ComponentCallbacksC0077bw componentCallbacksC0077bw2 = c0062bh4.f3152a.f11915a;
                                                    Iterator it7 = it6;
                                                    abstractC0127df.mo1925p(objMo1911b, c0062bh4.f3153b, new RunnableC0058bd(c0062bh4, c0133dl13, 2));
                                                    c0133dl = c0133dl3;
                                                    it6 = it7;
                                                } else {
                                                    if (C0111cq.m5275S(2)) {
                                                        StringBuilder sb5 = new StringBuilder();
                                                        sb5.append("SpecialEffectsController: Container ");
                                                        sb5.append(this.f12008a);
                                                        sb5.append(" has not been laid out. Completing operation ");
                                                        sb5.append(c0133dl13);
                                                    }
                                                    c0062bh4.m2373b();
                                                    c0133dl = c0133dl3;
                                                }
                                            } else {
                                                c0133dl3 = c0133dl;
                                            }
                                            z = false;
                                            if (obj8 != null) {
                                            }
                                            if (afe.m462f(this.f12008a)) {
                                                if (C0111cq.m5275S(2)) {
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append("SpecialEffectsController: Container ");
                                                    sb6.append(this.f12008a);
                                                    sb6.append(" has not been laid out. Completing operation ");
                                                    sb6.append(c0133dl13);
                                                }
                                                c0062bh4.m2373b();
                                                c0133dl = c0133dl3;
                                            } else {
                                                ComponentCallbacksC0077bw componentCallbacksC0077bw3 = c0062bh4.f3152a.f11915a;
                                                Iterator it8 = it6;
                                                abstractC0127df.mo1925p(objMo1911b, c0062bh4.f3153b, new RunnableC0058bd(c0062bh4, c0133dl13, 2));
                                                c0133dl = c0133dl3;
                                                it6 = it8;
                                            }
                                        }
                                    }
                                    C0133dl c0133dl14 = c0133dl;
                                    if (afe.m462f(this.f12008a)) {
                                        C0119cy.m5729b(arrayList17, 4);
                                        ArrayList arrayList21 = new ArrayList();
                                        int size4 = arrayList13.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            View view9 = (View) arrayList13.get(i9);
                                            arrayList21.add(afh.m477h(view9));
                                            afh.m484o(view9, null);
                                        }
                                        if (C0111cq.m5275S(2)) {
                                            int size5 = arrayList20.size();
                                            int i10 = 0;
                                            while (i10 < size5) {
                                                ArrayList arrayList22 = arrayList20;
                                                View view10 = (View) arrayList22.get(i10);
                                                int i11 = size5;
                                                StringBuilder sb7 = new StringBuilder();
                                                sb7.append("View: ");
                                                sb7.append(view10);
                                                sb7.append(" Name: ");
                                                sb7.append(afh.m477h(view10));
                                                i10++;
                                                arrayList20 = arrayList22;
                                                size5 = i11;
                                                c0133dl14 = c0133dl14;
                                            }
                                            c0133dl = c0133dl14;
                                            arrayList2 = arrayList20;
                                            int size6 = arrayList13.size();
                                            int i12 = 0;
                                            while (i12 < size6) {
                                                View view11 = (View) arrayList13.get(i12);
                                                StringBuilder sb8 = new StringBuilder();
                                                int i13 = size6;
                                                sb8.append("View: ");
                                                sb8.append(view11);
                                                sb8.append(" Name: ");
                                                sb8.append(afh.m477h(view11));
                                                i12++;
                                                size6 = i13;
                                            }
                                        } else {
                                            c0133dl = c0133dl14;
                                            arrayList2 = arrayList20;
                                        }
                                        abstractC0127df.mo1915f(this.f12008a, objMo1911b);
                                        ViewGroup viewGroup = this.f12008a;
                                        int size7 = arrayList13.size();
                                        ArrayList arrayList23 = new ArrayList();
                                        int i14 = 0;
                                        while (i14 < size7) {
                                            View view12 = (View) arrayList2.get(i14);
                                            C0133dl c0133dl15 = c0133dl7;
                                            String strM477h = afh.m477h(view12);
                                            arrayList23.add(strM477h);
                                            if (strM477h != null) {
                                                afh.m484o(view12, null);
                                                Map map7 = map6;
                                                String str = (String) map7.get(strM477h);
                                                map6 = map7;
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= size7) {
                                                        map2 = map5;
                                                        break;
                                                    }
                                                    map2 = map5;
                                                    if (str.equals(arrayList21.get(i15))) {
                                                        afh.m484o((View) arrayList13.get(i15), strM477h);
                                                        break;
                                                    } else {
                                                        i15++;
                                                        map5 = map2;
                                                    }
                                                }
                                            } else {
                                                map2 = map5;
                                            }
                                            i14++;
                                            c0133dl7 = c0133dl15;
                                            map5 = map2;
                                        }
                                        map = map5;
                                        c0133dl2 = c0133dl7;
                                        aex.m403b(viewGroup, new gli(size7, arrayList13, arrayList21, arrayList2, arrayList23, 1));
                                        C0119cy.m5729b(arrayList17, 0);
                                        abstractC0127df.mo1921l(obj7, arrayList2, arrayList13);
                                    } else {
                                        map = map5;
                                        c0133dl = c0133dl14;
                                        c0133dl2 = c0133dl7;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } else {
                                map = map5;
                                c0133dl2 = c0133dl7;
                            }
                        }
                        Map map8 = map;
                        boolean zContainsValue = map8.containsValue(true);
                        ViewGroup viewGroup2 = this.f12008a;
                        Context context = viewGroup2.getContext();
                        ArrayList arrayList24 = new ArrayList();
                        boolean z6 = false;
                        for (C0060bf c0060bf : arrayList) {
                            if (c0060bf.m2374c()) {
                                c0060bf.m2373b();
                            } else {
                                bck bckVarM2288a = c0060bf.m2288a(context);
                                if (bckVarM2288a == null) {
                                    c0060bf.m2373b();
                                } else {
                                    Object obj9 = bckVarM2288a.f2948a;
                                    if (obj9 == null) {
                                        arrayList24.add(c0060bf);
                                    } else {
                                        C0133dl c0133dl16 = c0060bf.f3152a;
                                        ComponentCallbacksC0077bw componentCallbacksC0077bw4 = c0133dl16.f11915a;
                                        if (Boolean.TRUE.equals(map8.get(c0133dl16))) {
                                            if (C0111cq.m5275S(2)) {
                                                StringBuilder sb9 = new StringBuilder();
                                                sb9.append("Ignoring Animator set on ");
                                                sb9.append(componentCallbacksC0077bw4);
                                                sb9.append(" as this Fragment was involved in a Transition.");
                                            }
                                            c0060bf.m2373b();
                                        } else {
                                            boolean z7 = c0133dl16.f11919e == 3;
                                            if (z7) {
                                                list2 = list;
                                                list2.remove(c0133dl16);
                                            } else {
                                                list2 = list;
                                            }
                                            View view13 = componentCallbacksC0077bw4.f4586N;
                                            viewGroup2.startViewTransition(view13);
                                            List list4 = list2;
                                            ((Animator) obj9).addListener(new C0052ay(viewGroup2, view13, z7, c0133dl16, c0060bf));
                                            ((Animator) obj9).setTarget(view13);
                                            ((Animator) obj9).start();
                                            if (C0111cq.m5275S(2)) {
                                                StringBuilder sb10 = new StringBuilder();
                                                sb10.append("Animator from operation ");
                                                c0133dl4 = c0133dl16;
                                                sb10.append(c0133dl4);
                                                sb10.append(yTyWiTtGtnBhy.tMxpKLgkSM);
                                            } else {
                                                c0133dl4 = c0133dl16;
                                            }
                                            c0060bf.f3153b.m8036a(new C0053az((Animator) obj9, c0133dl4));
                                            list = list4;
                                            z6 = true;
                                        }
                                    }
                                }
                            }
                        }
                        List list5 = list;
                        int size8 = arrayList24.size();
                        for (int i16 = 0; i16 < size8; i16++) {
                            C0060bf c0060bf2 = (C0060bf) arrayList24.get(i16);
                            C0133dl c0133dl17 = c0060bf2.f3152a;
                            ComponentCallbacksC0077bw componentCallbacksC0077bw5 = c0133dl17.f11915a;
                            if (zContainsValue) {
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb11 = new StringBuilder();
                                    sb11.append("Ignoring Animation set on ");
                                    sb11.append(componentCallbacksC0077bw5);
                                    sb11.append(" as Animations cannot run alongside Transitions.");
                                }
                                c0060bf2.m2373b();
                            } else if (z6) {
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append("Ignoring Animation set on ");
                                    sb12.append(componentCallbacksC0077bw5);
                                    sb12.append(" as Animations cannot run alongside Animators.");
                                }
                                c0060bf2.m2373b();
                            } else {
                                View view14 = componentCallbacksC0077bw5.f4586N;
                                bck bckVarM2288a2 = c0060bf2.m2288a(context);
                                abf.m90c(bckVarM2288a2);
                                Object obj10 = bckVarM2288a2.f2949b;
                                abf.m90c(obj10);
                                if (c0133dl17.f11919e != 1) {
                                    view14.startAnimation((Animation) obj10);
                                    c0060bf2.m2373b();
                                } else {
                                    viewGroup2.startViewTransition(view14);
                                    RunnableC0082ca runnableC0082ca = new RunnableC0082ca((Animation) obj10, viewGroup2, view14);
                                    runnableC0082ca.setAnimationListener(new AnimationAnimationListenerC0055ba(c0133dl17, viewGroup2, view14, c0060bf2));
                                    view14.startAnimation(runnableC0082ca);
                                    if (C0111cq.m5275S(2)) {
                                        StringBuilder sb13 = new StringBuilder();
                                        sb13.append("Animation from operation ");
                                        sb13.append(c0133dl17);
                                        sb13.append(" has started.");
                                    }
                                }
                                c0060bf2.f3153b.m8036a(new C0056bb(view14, viewGroup2, c0060bf2, c0133dl17));
                            }
                        }
                        int size9 = list5.size();
                        int i17 = 0;
                        while (i17 < size9) {
                            List list6 = list5;
                            m6386h((C0133dl) list6.get(i17));
                            i17++;
                            list5 = list6;
                        }
                        list5.clear();
                        if (C0111cq.m5275S(2)) {
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append("Completed executing operations from ");
                            sb14.append(c0133dl2);
                            sb14.append(" to ");
                            sb14.append(c0133dl);
                        }
                        this.f12011d = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6392d() {
        boolean zM461e = afe.m461e(this.f12008a);
        synchronized (this.f12009b) {
            m6389l();
            Iterator it = this.f12009b.iterator();
            while (it.hasNext()) {
                ((C0133dl) it.next()).mo6275b();
            }
            for (C0133dl c0133dl : new ArrayList(this.f12010c)) {
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zM461e ? "" : "Container " + this.f12008a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(c0133dl);
                }
                c0133dl.m6325d();
            }
            for (C0133dl c0133dl2 : new ArrayList(this.f12009b)) {
                if (C0111cq.m5275S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zM461e ? "" : "Container " + this.f12008a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c0133dl2);
                }
                c0133dl2.m6325d();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    final void m6393e() {
        synchronized (this.f12009b) {
            m6389l();
            boolean z = false;
            this.f12012e = false;
            for (int size = this.f12009b.size() - 1; size >= 0; size--) {
                C0133dl c0133dl = (C0133dl) this.f12009b.get(size);
                int iM6523t = C0137dp.m6523t(c0133dl.f11915a.f4586N);
                if (c0133dl.f11919e == 2 && iM6523t != 2) {
                    C0073bs c0073bs = c0133dl.f11915a.f4589Q;
                    if (c0073bs != null) {
                        z = c0073bs.f4273s;
                    }
                    this.f12012e = z;
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6394f(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (aft.m559c(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m6394f(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6395g(Map map, View view) {
        String strM477h = afh.m477h(view);
        if (strM477h != null) {
            map.put(strM477h, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m6395g(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6396k(int i, int i2, jew jewVar) {
        synchronized (this.f12009b) {
            exz exzVar = new exz(null);
            C0133dl c0133dlM6390a = m6390a((ComponentCallbacksC0077bw) jewVar.f33848c);
            if (c0133dlM6390a != null) {
                c0133dlM6390a.m6326e(i, i2);
                return;
            }
            C0132dk c0132dk = new C0132dk(i, i2, jewVar, exzVar, null);
            this.f12009b.add(c0132dk);
            c0132dk.m6324c(new RunnableC0058bd(this, c0132dk, 3));
            c0132dk.m6324c(new RunnableC0058bd(this, c0132dk, 4));
        }
    }
}
