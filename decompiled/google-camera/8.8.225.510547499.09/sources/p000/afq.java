package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afq {

    /* JADX INFO: renamed from: a */
    public static final int[] f274a;

    /* JADX INFO: renamed from: b */
    private static WeakHashMap f275b;

    /* JADX INFO: renamed from: c */
    private static final aez f276c;

    static {
        new AtomicInteger(1);
        f275b = null;
        f274a = new int[]{C0100R.id.accessibility_custom_action_0, C0100R.id.accessibility_custom_action_1, C0100R.id.accessibility_custom_action_2, C0100R.id.accessibility_custom_action_3, C0100R.id.accessibility_custom_action_4, C0100R.id.accessibility_custom_action_5, C0100R.id.accessibility_custom_action_6, C0100R.id.accessibility_custom_action_7, C0100R.id.accessibility_custom_action_8, C0100R.id.accessibility_custom_action_9, C0100R.id.accessibility_custom_action_10, C0100R.id.accessibility_custom_action_11, C0100R.id.accessibility_custom_action_12, C0100R.id.accessibility_custom_action_13, C0100R.id.accessibility_custom_action_14, C0100R.id.accessibility_custom_action_15, C0100R.id.accessibility_custom_action_16, C0100R.id.accessibility_custom_action_17, C0100R.id.accessibility_custom_action_18, C0100R.id.accessibility_custom_action_19, C0100R.id.accessibility_custom_action_20, C0100R.id.accessibility_custom_action_21, C0100R.id.accessibility_custom_action_22, C0100R.id.accessibility_custom_action_23, C0100R.id.accessibility_custom_action_24, C0100R.id.accessibility_custom_action_25, C0100R.id.accessibility_custom_action_26, C0100R.id.accessibility_custom_action_27, C0100R.id.accessibility_custom_action_28, C0100R.id.accessibility_custom_action_29, C0100R.id.accessibility_custom_action_30, C0100R.id.accessibility_custom_action_31};
        f276c = new aez();
    }

    /* JADX INFO: renamed from: a */
    public static aei m541a(View view) {
        View.AccessibilityDelegate accessibilityDelegateM534a = afn.m534a(view);
        if (accessibilityDelegateM534a == null) {
            return null;
        }
        return accessibilityDelegateM534a instanceof aeg ? ((aeg) accessibilityDelegateM534a).f252a : new aei(accessibilityDelegateM534a);
    }

    /* JADX INFO: renamed from: b */
    public static ago m542b(View view, ago agoVar) {
        WindowInsets windowInsetsM607e = agoVar.m607e();
        if (windowInsetsM607e != null) {
            WindowInsets windowInsetsM465a = aff.m465a(view, windowInsetsM607e);
            if (!windowInsetsM465a.equals(windowInsetsM607e)) {
                return ago.m602n(windowInsetsM465a, view);
            }
        }
        return agoVar;
    }

    /* JADX INFO: renamed from: c */
    public static ago m543c(View view, ago agoVar) {
        WindowInsets windowInsetsM607e = agoVar.m607e();
        if (windowInsetsM607e != null) {
            WindowInsets windowInsetsM466b = aff.m466b(view, windowInsetsM607e);
            if (!windowInsetsM466b.equals(windowInsetsM607e)) {
                return ago.m602n(windowInsetsM466b, view);
            }
        }
        return agoVar;
    }

    /* JADX INFO: renamed from: d */
    public static List m544d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0100R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0100R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static void m545e(View view, agr agrVar) {
        aei aeiVarM541a = m541a(view);
        if (aeiVarM541a == null) {
            aeiVarM541a = new aei();
        }
        m547g(view, aeiVarM541a);
        m552l(agrVar.m619a(), view);
        m544d(view).add(agrVar);
        m550j(view);
    }

    /* JADX INFO: renamed from: f */
    public static void m546f(View view, int i) {
        m552l(i, view);
        m550j(view);
    }

    /* JADX INFO: renamed from: g */
    public static void m547g(View view, aei aeiVar) {
        if (aeiVar == null && (afn.m534a(view) instanceof aeg)) {
            aeiVar = new aei();
        }
        view.setAccessibilityDelegate(aeiVar == null ? null : aeiVar.f255c);
    }

    /* JADX INFO: renamed from: h */
    public static void m548h(View view, CharSequence charSequence) {
        afm.m530f(view, charSequence);
        if (charSequence == null) {
            aez aezVar = f276c;
            aezVar.f268a.remove(view);
            view.removeOnAttachStateChangeListener(aezVar);
            afb.m430k(view.getViewTreeObserver(), aezVar);
            return;
        }
        aez aezVar2 = f276c;
        WeakHashMap weakHashMap = aezVar2.f268a;
        boolean z = false;
        if (view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        weakHashMap.put(view, Boolean.valueOf(z));
        view.addOnAttachStateChangeListener(aezVar2);
        if (afe.m461e(view)) {
            aezVar2.m410a(view);
        }
    }

    /* JADX INFO: renamed from: j */
    static void m550j(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = afm.m525a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (afe.m457a(view) == 0 && !z) {
                if (view.getParent() != null) {
                    try {
                        afe.m458b(view.getParent(), view, view, 0);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            int i = true != z ? 2048 : 32;
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(i);
            afe.m460d(accessibilityEventObtain, 0);
            if (z) {
                accessibilityEventObtain.getText().add(afm.m525a(view));
                if (afb.m420a(view) == 0) {
                    afb.m434o(view, 1);
                }
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    if (afb.m420a((View) parent) == 4) {
                        afb.m434o(view, 2);
                        break;
                    }
                }
            }
            view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    /* JADX INFO: renamed from: k */
    public static bkn m551k(View view) {
        if (f275b == null) {
            f275b = new WeakHashMap();
        }
        bkn bknVar = (bkn) f275b.get(view);
        if (bknVar != null) {
            return bknVar;
        }
        bkn bknVar2 = new bkn(view);
        f275b.put(view, bknVar2);
        return bknVar2;
    }

    /* JADX INFO: renamed from: l */
    private static void m552l(int i, View view) {
        List listM544d = m544d(view);
        for (int i2 = 0; i2 < listM544d.size(); i2++) {
            if (((agr) listM544d.get(i2)).m619a() == i) {
                listM544d.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m549i(View view, agr agrVar, ahc ahcVar) {
        if (ahcVar == null) {
            m546f(view, agrVar.m619a());
        } else {
            m545e(view, new agr(null, agrVar.f352N, null, ahcVar, agrVar.f353O));
        }
    }
}
