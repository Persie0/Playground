package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: loaded from: classes.dex */
public class C3133j3 {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f44986c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f44987a;

    /* JADX INFO: renamed from: b */
    public final C3098i3 f44988b;

    public C3133j3(View.AccessibilityDelegate accessibilityDelegate) {
        this.f44987a = accessibilityDelegate;
        this.f44988b = new C3098i3(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo14275a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f44987a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public qn3 mo1782b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f44987a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new qn3(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo14276c(View view, AccessibilityEvent accessibilityEvent) {
        this.f44987a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo6010d(View view, C0797b4 c0797b4) {
        this.f44987a.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
    }

    /* JADX INFO: renamed from: e */
    public void mo10704e(View view, AccessibilityEvent accessibilityEvent) {
        this.f44987a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo14277f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f44987a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo6011g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R$id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < list.size()) {
                C3671v3 c3671v3 = (C3671v3) list.get(i2);
                if (c3671v3.m23075a() == i) {
                    Class cls = c3671v3.f64771c;
                    InterfaceC3396o4 interfaceC3396o4 = c3671v3.f64772d;
                    if (interfaceC3396o4 != null) {
                        if (cls != null) {
                            try {
                                g9a.m12435l(cls.getDeclaredConstructor(null).newInstance(null));
                                throw null;
                            } catch (Exception e) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = interfaceC3396o4.mo4797b(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f44987a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R$id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public void mo14278h(View view, int i) {
        this.f44987a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo14279i(View view, AccessibilityEvent accessibilityEvent) {
        this.f44987a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C3133j3() {
        this(f44986c);
    }
}
