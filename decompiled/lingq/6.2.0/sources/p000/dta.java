package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.R$id;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class dta {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f36217a;

    /* JADX INFO: renamed from: b */
    public static final int[] f36218b = {R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: c */
    public static final rsa f36219c = new rsa();

    /* JADX INFO: renamed from: d */
    public static final tsa f36220d = new tsa();

    /* JADX INFO: renamed from: a */
    public static xua m10630a(View view) {
        if (f36217a == null) {
            f36217a = new WeakHashMap();
        }
        xua xuaVar = (xua) f36217a.get(view);
        if (xuaVar != null) {
            return xuaVar;
        }
        xua xuaVar2 = new xua(view);
        f36217a.put(view, xuaVar2);
        return xuaVar2;
    }

    /* JADX INFO: renamed from: b */
    public static void m10631b(View view, f6b f6bVar) {
        WindowInsets windowInsetsM11575f = f6bVar.m11575f();
        if (windowInsetsM11575f != null) {
            WindowInsets windowInsetsM4163a = Build.VERSION.SDK_INT >= 30 ? bta.m4163a(view, windowInsetsM11575f) : usa.m22906a(view, windowInsetsM11575f);
            if (windowInsetsM4163a.equals(windowInsetsM11575f)) {
                return;
            }
            f6b.m11570g(view, windowInsetsM4163a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m10632c(View view) {
        return (CharSequence) new ssa(R$id.tag_accessibility_pane_title, 1).m22870d(view);
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m10633d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R$id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static String[] m10634e(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? cta.m9882a(appCompatEditText) : (String[]) appCompatEditText.getTag(R$id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: f */
    public static k6b m10635f(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return bta.m4165c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new k6b(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m10636g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m10632c(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m10632c(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m10632c(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static bl1 m10637h(View view, bl1 bl1Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bl1Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return cta.m9883b(view, bl1Var);
        }
        by9 by9Var = (by9) view.getTag(R$id.tag_on_receive_content_listener);
        gs6 gs6Var = f36219c;
        if (by9Var == null) {
            if (view instanceof gs6) {
                gs6Var = (gs6) view;
            }
            return gs6Var.mo678a(bl1Var);
        }
        bl1 bl1VarM4225a = by9.m4225a(view, bl1Var);
        if (bl1VarM4225a == null) {
            return null;
        }
        if (view instanceof gs6) {
            gs6Var = (gs6) view;
        }
        return gs6Var.mo678a(bl1VarM4225a);
    }

    /* JADX INFO: renamed from: i */
    public static void m10638i(View view, int i) {
        ArrayList arrayListM10633d = m10633d(view);
        for (int i2 = 0; i2 < arrayListM10633d.size(); i2++) {
            if (((C3671v3) arrayListM10633d.get(i2)).m23075a() == i) {
                arrayListM10633d.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m10639j(View view, C3671v3 c3671v3, InterfaceC3396o4 interfaceC3396o4) {
        C3133j3 c3133j3;
        C3671v3 c3671v4 = new C3671v3(null, c3671v3.f64770b, null, interfaceC3396o4, c3671v3.f64771c);
        View.AccessibilityDelegate accessibilityDelegateM3034a = ata.m3034a(view);
        if (accessibilityDelegateM3034a == null) {
            c3133j3 = null;
        } else {
            c3133j3 = accessibilityDelegateM3034a instanceof C3098i3 ? ((C3098i3) accessibilityDelegateM3034a).f43394a : new C3133j3(accessibilityDelegateM3034a);
        }
        if (c3133j3 == null) {
            c3133j3 = new C3133j3();
        }
        m10640k(view, c3133j3);
        m10638i(view, c3671v4.m23075a());
        m10633d(view).add(c3671v4);
        m10636g(view, 0);
    }

    /* JADX INFO: renamed from: k */
    public static void m10640k(View view, C3133j3 c3133j3) {
        if (c3133j3 == null && (ata.m3034a(view) instanceof C3098i3)) {
            c3133j3 = new C3133j3();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c3133j3 == null ? null : c3133j3.f44988b);
    }

    /* JADX INFO: renamed from: l */
    public static void m10641l(View view, CharSequence charSequence) {
        new ssa(R$id.tag_accessibility_pane_title, 1).m22871e(view, charSequence);
        tsa tsaVar = f36220d;
        if (charSequence == null) {
            tsaVar.f62831a.remove(view);
            view.removeOnAttachStateChangeListener(tsaVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(tsaVar);
        } else {
            tsaVar.f62831a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(tsaVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(tsaVar);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m10642m(View view, m80 m80Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(m80Var != null ? new j5b(m80Var) : null);
        } else {
            h5b.m13067l(view, m80Var);
        }
    }
}
