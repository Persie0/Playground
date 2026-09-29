package com.amplitude.android.internal.locators;

import android.view.View;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import com.amplitude.android.internal.ViewTarget$Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.Pair;
import p000.cs4;
import p000.e16;
import p000.f16;
import p000.fa4;
import p000.kva;
import p000.lva;
import p000.ne1;
import p000.pj5;
import p000.u91;
import p000.ui3;
import p000.w64;
import p000.xna;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeViewTargetLocator implements lva {

    /* JADX INFO: renamed from: a */
    public final pj5 f10859a;

    /* JADX INFO: renamed from: b */
    public final cs4 f10860b;

    public ComposeViewTargetLocator(pj5 pj5Var) {
        pj5Var.getClass();
        this.f10859a = pj5Var;
        this.f10860b = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.android.internal.locators.ComposeViewTargetLocator$composeLayoutNodeBoundsHelper$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return new ne1(this.f10861b.f10859a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.lva
    /* JADX INFO: renamed from: a */
    public final kva mo5076a(View view, Pair pair, ViewTarget$Type viewTarget$Type) {
        view.getClass();
        viewTarget$Type.getClass();
        Owner owner = view instanceof Owner ? (Owner) view : null;
        if (owner == null) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getRoot());
        boolean z = false;
        String str = null;
        String strM22596N0 = null;
        String str2 = null;
        String str3 = null;
        while (!arrayDeque.isEmpty()) {
            C0357g c0357g = (C0357g) arrayDeque.poll();
            if (c0357g != null) {
                if (c0357g.m1570M() && ((ne1) this.f10860b.getValue()).m17397a(c0357g, pair)) {
                    Iterator it = c0357g.m1608u().iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        e16 e16Var = ((f16) it.next()).f38240a;
                        if (e16Var instanceof w64) {
                            w64 w64Var = (w64) e16Var;
                            String strMo1818m = w64Var.mo1818m();
                            if (strMo1818m != null) {
                                int iHashCode = strMo1818m.hashCode();
                                if (iHashCode != -1964681502) {
                                    if (iHashCode == -1422466648) {
                                        if (strMo1818m.equals("testTag")) {
                                            for (xna xnaVar : w64Var.mo1817l()) {
                                                if (xnaVar.f68405a.equals("tag")) {
                                                    Object obj = xnaVar.f68406b;
                                                    str = obj instanceof String ? (String) obj : null;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (iHashCode == -932820115 && strMo1818m.equals("semantics")) {
                                        Iterator it2 = w64Var.mo1817l().iterator();
                                        while (it2.hasNext()) {
                                            xna xnaVar2 = (xna) it2.next();
                                            if (xnaVar2.f68405a.equals("properties")) {
                                                Object obj2 = xnaVar2.f68406b;
                                                if (obj2 instanceof LinkedHashMap) {
                                                    for (Map.Entry entry : ((LinkedHashMap) obj2).entrySet()) {
                                                        entry.getClass();
                                                        Object key = entry.getKey();
                                                        Object value = entry.getValue();
                                                        Iterator it3 = it2;
                                                        if (fa4.m11650l(key, "TestTag")) {
                                                            str = value instanceof String ? (String) value : null;
                                                        } else if (fa4.m11650l(key, "ContentDescription")) {
                                                            List list = value instanceof List ? (List) value : null;
                                                            if (list != null) {
                                                                ArrayList arrayList = new ArrayList();
                                                                for (Object obj3 : list) {
                                                                    if (obj3 instanceof String) {
                                                                        arrayList.add(obj3);
                                                                    }
                                                                }
                                                                strM22596N0 = u91.m22596N0(arrayList, ", ", null, null, null, 62);
                                                            } else {
                                                                strM22596N0 = null;
                                                            }
                                                        }
                                                        it2 = it3;
                                                    }
                                                }
                                            }
                                            it2 = it2;
                                        }
                                    }
                                } else if (strMo1818m.equals("clickable")) {
                                    z2 = true;
                                }
                            }
                            String name = e16Var.getClass().getName();
                            if (name.equals("androidx.compose.foundation.ClickableElement") || name.equals("androidx.compose.foundation.CombinedClickableElement")) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2 && viewTarget$Type == ViewTarget$Type.Clickable) {
                        str2 = str;
                        str3 = strM22596N0;
                        z = true;
                    }
                }
                arrayDeque.addAll(c0357g.m1558A().m24309g());
            }
        }
        if (z) {
            return new kva(null, null, null, str2, null, str3, "jetpack_compose", null, false, false);
        }
        return null;
    }
}
