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
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aei {

    /* JADX INFO: renamed from: a */
    private static final View.AccessibilityDelegate f253a = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: b */
    private final View.AccessibilityDelegate f254b;

    /* JADX INFO: renamed from: c */
    public final View.AccessibilityDelegate f255c;

    public aei() {
        this(f253a);
    }

    /* JADX INFO: renamed from: l */
    static List m324l(View view) {
        List list = (List) view.getTag(C0100R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: renamed from: a */
    public void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        this.f254b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public void mo326b(View view, agt agtVar) {
        this.f254b.onInitializeAccessibilityNodeInfo(view, agtVar.f355a);
    }

    /* JADX INFO: renamed from: c */
    public void mo327c(View view, AccessibilityEvent accessibilityEvent) {
        this.f254b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo328d(View view, int i) {
        this.f254b.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: e */
    public void mo329e(View view, AccessibilityEvent accessibilityEvent) {
        this.f254b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo330f(View view, AccessibilityEvent accessibilityEvent) {
        return this.f254b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo331g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f254b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: h */
    public boolean mo332h(View view, int i, Bundle bundle) {
        boolean zM323b;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listM324l = m324l(view);
        int i2 = 0;
        while (true) {
            if (i2 < listM324l.size()) {
                agr agrVar = (agr) listM324l.get(i2);
                if (agrVar.m619a() == i) {
                    if (agrVar.f354P != null) {
                        Class cls = agrVar.f353O;
                        if (cls != null) {
                            try {
                            } catch (Exception e) {
                                Class cls2 = agrVar.f353O;
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                            }
                        }
                        zM323b = agrVar.f354P.mo654a(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zM323b = false;
            break;
        }
        if (!zM323b) {
            zM323b = aeh.m323b(this.f254b, view, i, bundle);
        }
        if (zM323b || i != C0100R.id.accessibility_action_clickable_span || bundle == null) {
            return zM323b;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C0100R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
        for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
            if (clickableSpan.equals(clickableSpanArr[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public bkn mo333i(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM322a = aeh.m322a(this.f254b, view);
        if (accessibilityNodeProviderM322a != null) {
            return new bkn(accessibilityNodeProviderM322a);
        }
        return null;
    }

    public aei(View.AccessibilityDelegate accessibilityDelegate) {
        this.f254b = accessibilityDelegate;
        this.f255c = new aeg(this);
    }
}
