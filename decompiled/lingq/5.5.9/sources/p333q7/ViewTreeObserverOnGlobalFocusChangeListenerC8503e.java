package p333q7;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7661i;
import p128g2.RunnableC5682t;
import p173i8.C6205a;
import p317p7.C8204k;
import p476x7.C10106e;

/* JADX INFO: renamed from: q7.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC8503e implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: e */
    public static final HashMap f45749e;

    /* JADX INFO: renamed from: c */
    public final WeakReference<Activity> f45752c;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f45750a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public final Handler f45751b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f45753d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q7.e$a */
    public static final class a {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x005f  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        public static final void m16607a(HashMap map, String str, String str2) {
            HashMap map2 = ViewTreeObserverOnGlobalFocusChangeListenerC8503e.f45749e;
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        str2 = (C7661i.m15256V2(str2, "m", false) || C7661i.m15256V2(str2, "b", false) || C7661i.m15256V2(str2, "ge", false)) ? "m" : "f";
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new Regex("[^a-z]+").m14272c(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new Regex("[^a-z]+").m14272c(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3588:
                    if (str.equals("r6") && C7076b.m14278X2(str2, "-", false)) {
                        Object[] array = new Regex("-").m14273d(str2).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        str2 = ((String[]) array)[0];
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m16608b(Activity activity) {
            HashMap map;
            C5207g.m11111f(activity, "activity");
            int iHashCode = activity.hashCode();
            if (C6205a.m12742b(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class)) {
                map = null;
            } else {
                try {
                    map = ViewTreeObserverOnGlobalFocusChangeListenerC8503e.f45749e;
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class, th2);
                    map = null;
                }
            }
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewTreeObserverOnGlobalFocusChangeListenerC8503e = map.get(numValueOf);
            if (viewTreeObserverOnGlobalFocusChangeListenerC8503e == null) {
                viewTreeObserverOnGlobalFocusChangeListenerC8503e = new ViewTreeObserverOnGlobalFocusChangeListenerC8503e(activity);
                map.put(numValueOf, viewTreeObserverOnGlobalFocusChangeListenerC8503e);
            }
            ViewTreeObserverOnGlobalFocusChangeListenerC8503e viewTreeObserverOnGlobalFocusChangeListenerC8503e2 = (ViewTreeObserverOnGlobalFocusChangeListenerC8503e) viewTreeObserverOnGlobalFocusChangeListenerC8503e;
            if (C6205a.m12742b(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class)) {
                return;
            }
            try {
                if (C6205a.m12742b(viewTreeObserverOnGlobalFocusChangeListenerC8503e2)) {
                    return;
                }
                try {
                    if (viewTreeObserverOnGlobalFocusChangeListenerC8503e2.f45753d.getAndSet(true)) {
                        return;
                    }
                    int i10 = C10106e.f51261a;
                    View viewM18963b = C10106e.m18963b(viewTreeObserverOnGlobalFocusChangeListenerC8503e2.f45752c.get());
                    if (viewM18963b == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = viewM18963b.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC8503e2);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(viewTreeObserverOnGlobalFocusChangeListenerC8503e2, th3);
                    return;
                }
                C6205a.m12741a(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class, th);
            } catch (Throwable th4) {
                C6205a.m12741a(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class, th4);
            }
        }
    }

    static {
        new a();
        f45749e = new HashMap();
    }

    public ViewTreeObserverOnGlobalFocusChangeListenerC8503e(Activity activity) {
        this.f45752c = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m16605a(View view) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            RunnableC5682t runnableC5682t = new RunnableC5682t(view, 3, this);
            if (C6205a.m12742b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnableC5682t.run();
                } else {
                    this.f45751b.post(runnableC5682t);
                }
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0127 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:6:0x0009, B:8:0x001a, B:10:0x0025, B:17:0x0043, B:19:0x004b, B:22:0x0059, B:24:0x007b, B:26:0x0081, B:28:0x0096, B:30:0x00aa, B:35:0x00b9, B:40:0x00c6, B:43:0x00d0, B:49:0x00ed, B:53:0x00f5, B:63:0x0113, B:65:0x0119, B:67:0x0127, B:68:0x012c, B:75:0x0141, B:77:0x0147, B:74:0x013c, B:62:0x010e, B:78:0x0151, B:81:0x0157, B:82:0x0162, B:83:0x0163, B:84:0x016c, B:71:0x0134, B:46:0x00da, B:59:0x0105), top: B:94:0x0009, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:6:0x0009, B:8:0x001a, B:10:0x0025, B:17:0x0043, B:19:0x004b, B:22:0x0059, B:24:0x007b, B:26:0x0081, B:28:0x0096, B:30:0x00aa, B:35:0x00b9, B:40:0x00c6, B:43:0x00d0, B:49:0x00ed, B:53:0x00f5, B:63:0x0113, B:65:0x0119, B:67:0x0127, B:68:0x012c, B:75:0x0141, B:77:0x0147, B:74:0x013c, B:62:0x010e, B:78:0x0151, B:81:0x0157, B:82:0x0162, B:83:0x0163, B:84:0x016c, B:71:0x0134, B:46:0x00da, B:59:0x0105), top: B:94:0x0009, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0125 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m16606b(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean zM14271b;
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            String string = ((EditText) view).getText().toString();
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String string2 = C7076b.m14277B3(string).toString();
            if (string2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = string2.toLowerCase();
            C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0)) {
                LinkedHashSet linkedHashSet = this.f45750a;
                if (!linkedHashSet.contains(lowerCase)) {
                    if (lowerCase.length() > 100) {
                        return;
                    }
                    linkedHashSet.add(lowerCase);
                    HashMap map = new HashMap();
                    ArrayList arrayListM16599b = C8501c.m16599b(view);
                    CopyOnWriteArraySet copyOnWriteArraySet = C8502d.f45745d;
                    Iterator it = new HashSet(C8502d.m16602a()).iterator();
                    ArrayList arrayListM16598a = null;
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            C8502d c8502d = (C8502d) it.next();
                            String strM14272c = C5207g.m11106a("r2", c8502d.m16603b()) ? new Regex("[^\\d.]").m14272c(lowerCase, "") : lowerCase;
                            boolean zM12742b = C6205a.m12742b(c8502d);
                            String str = c8502d.f45747b;
                            if ((zM12742b ? null : str).length() > 0) {
                                C8501c c8501c = C8501c.f45744a;
                                if (C6205a.m12742b(c8502d)) {
                                    str = null;
                                }
                                if (C6205a.m12742b(C8501c.class)) {
                                    zM14271b = false;
                                    if (!zM14271b) {
                                    }
                                } else {
                                    try {
                                        C5207g.m11111f(str, "rule");
                                        zM14271b = new Regex(str).m14271b(strM14272c);
                                    } catch (Throwable th2) {
                                        C6205a.m12741a(C8501c.class, th2);
                                        zM14271b = false;
                                    }
                                    if (!zM14271b) {
                                    }
                                }
                            }
                            C8501c c8501c2 = C8501c.f45744a;
                            boolean zM12742b2 = C6205a.m12742b(c8502d);
                            List<String> list = c8502d.f45748c;
                            if (!zM12742b2) {
                                try {
                                    arrayList = new ArrayList(list);
                                } catch (Throwable th3) {
                                    C6205a.m12741a(c8502d, th3);
                                    arrayList = null;
                                }
                                if (C8501c.m16600d(arrayListM16599b, arrayList)) {
                                    a.m16607a(map, c8502d.m16603b(), strM14272c);
                                } else {
                                    if (arrayListM16598a == null) {
                                        arrayListM16598a = C8501c.m16598a(view);
                                    }
                                    if (C6205a.m12742b(c8502d)) {
                                        arrayList2 = null;
                                    } else {
                                        try {
                                            arrayList2 = new ArrayList(list);
                                        } catch (Throwable th4) {
                                            C6205a.m12741a(c8502d, th4);
                                            arrayList2 = null;
                                        }
                                    }
                                    if (C8501c.m16600d(arrayListM16598a, arrayList2)) {
                                        a.m16607a(map, c8502d.m16603b(), strM14272c);
                                    }
                                }
                            }
                            arrayList = null;
                            if (C8501c.m16600d(arrayListM16599b, arrayList)) {
                                a.m16607a(map, c8502d.m16603b(), strM14272c);
                            } else {
                                if (arrayListM16598a == null) {
                                    arrayListM16598a = C8501c.m16598a(view);
                                }
                                if (C6205a.m12742b(c8502d)) {
                                    arrayList2 = null;
                                } else {
                                    arrayList2 = new ArrayList(list);
                                }
                                if (C8501c.m16600d(arrayListM16598a, arrayList2)) {
                                    a.m16607a(map, c8502d.m16603b(), strM14272c);
                                }
                            }
                        }
                    }
                    C8204k.a.m16341a(map);
                }
            }
        } catch (Throwable th5) {
            C6205a.m12741a(this, th5);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (C6205a.m12742b(this)) {
            return;
        }
        if (view != null) {
            try {
                m16605a(view);
            } catch (Throwable th2) {
                C6205a.m12741a(this, th2);
            }
        }
        if (view2 != null) {
            m16605a(view2);
        }
    }
}
