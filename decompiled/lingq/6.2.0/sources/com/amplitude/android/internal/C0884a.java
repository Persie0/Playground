package com.amplitude.android.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import p000.C0825bv;
import p000.kva;
import p000.lva;
import p000.pj5;
import p000.v63;
import p000.wfb;

/* JADX INFO: renamed from: com.amplitude.android.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0884a {
    /* JADX INFO: renamed from: a */
    public static final kva m5071a(pj5 pj5Var, View view, ViewTarget$Type viewTarget$Type, List list, Pair pair) {
        boolean z;
        C0825bv c0825bv = new C0825bv();
        c0825bv.addLast(view);
        kva kvaVar = null;
        while (!c0825bv.isEmpty()) {
            try {
                View view2 = (View) c0825bv.removeFirst();
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int i = 0;
                    while (i < viewGroup.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt == null) {
                            v63.m23128b();
                            return null;
                        }
                        c0825bv.addLast(childAt);
                        i = i2;
                    }
                }
                try {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            kva kvaVarMo5076a = ((lva) it.next()).mo5076a(view2, pair, viewTarget$Type);
                            if (kvaVarMo5076a == null) {
                                kvaVarMo5076a = kvaVar;
                                z = false;
                            } else {
                                if (viewTarget$Type != ViewTarget$Type.Clickable) {
                                    return kvaVarMo5076a;
                                }
                                z = true;
                            }
                            if (z) {
                                kvaVar = kvaVarMo5076a;
                                break;
                            }
                            kvaVar = kvaVarMo5076a;
                        }
                    }
                } catch (ClassCastException e) {
                    pj5Var.mo16255a("Error while locating target in view hierarchy: " + e);
                }
            } catch (NoSuchElementException unused) {
                pj5Var.mo16255a("Unable to get view from queue");
            }
        }
        return kvaVar;
    }

    /* JADX INFO: renamed from: b */
    public static final kva m5072b(pj5 pj5Var, View view, ViewTarget$Type viewTarget$Type, List list, Pair pair) {
        list.getClass();
        viewTarget$Type.getClass();
        pj5Var.getClass();
        return (kva) wfb.m23900B(EmptyCoroutineContext.f47685a, new ViewHierarchyScanner$findTarget$1(pj5Var, view, viewTarget$Type, list, pair, null));
    }
}
