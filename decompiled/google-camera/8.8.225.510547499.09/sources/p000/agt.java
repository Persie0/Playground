package p000;

import android.R;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agt {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f355a;

    private agt(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f355a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: a */
    public static agt m622a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new agt(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: c */
    static String m623c(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionShowOnScreen:
                return "ACTION_SHOW_ON_SCREEN";
            case R.id.accessibilityActionScrollToPosition:
                return "ACTION_SCROLL_TO_POSITION";
            case R.id.accessibilityActionScrollUp:
                return "ACTION_SCROLL_UP";
            case R.id.accessibilityActionScrollLeft:
                return "ACTION_SCROLL_LEFT";
            case R.id.accessibilityActionScrollDown:
                return "ACTION_SCROLL_DOWN";
            case R.id.accessibilityActionScrollRight:
                return "ACTION_SCROLL_RIGHT";
            case R.id.accessibilityActionContextClick:
                return "ACTION_CONTEXT_CLICK";
            case R.id.accessibilityActionSetProgress:
                return "ACTION_SET_PROGRESS";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionShowTooltip:
                return "ACTION_SHOW_TOOLTIP";
            case R.id.accessibilityActionHideTooltip:
                return "ACTION_HIDE_TOOLTIP";
            case R.id.accessibilityActionPageUp:
                return "ACTION_PAGE_UP";
            case R.id.accessibilityActionPageDown:
                return "ACTION_PAGE_DOWN";
            case R.id.accessibilityActionPageLeft:
                return "ACTION_PAGE_LEFT";
            case R.id.accessibilityActionPageRight:
                return "ACTION_PAGE_RIGHT";
            case R.id.accessibilityActionPressAndHold:
                return "ACTION_PRESS_AND_HOLD";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            case R.id.accessibilityActionDragStart:
                return "ACTION_DRAG_START";
            case R.id.accessibilityActionDragDrop:
                return "ACTION_DRAG_DROP";
            case R.id.accessibilityActionDragCancel:
                return "ACTION_DRAG_CANCEL";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: u */
    private final List m624u(String str) {
        ArrayList<Integer> integerArrayList = ags.m621a(this.f355a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ags.m621a(this.f355a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m625b() {
        return this.f355a.getClassName();
    }

    /* JADX INFO: renamed from: d */
    public final List m626d() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f355a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new agr(actionList.get(i), 0, null, null, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final void m627e(int i) {
        this.f355a.addAction(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof agt)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.f355a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = ((agt) obj).f355a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m628f(agr agrVar) {
        this.f355a.addAction((AccessibilityNodeInfo.AccessibilityAction) agrVar.f351M);
    }

    /* JADX INFO: renamed from: g */
    public final void m629g(boolean z) {
        this.f355a.setCheckable(z);
    }

    /* JADX INFO: renamed from: h */
    public final void m630h(boolean z) {
        this.f355a.setChecked(z);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f355a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m631i(CharSequence charSequence) {
        this.f355a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public final void m632j(boolean z) {
        this.f355a.setClickable(z);
    }

    /* JADX INFO: renamed from: k */
    public final void m633k(Object obj) {
        this.f355a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((bkn) obj).f3651a);
    }

    /* JADX INFO: renamed from: l */
    public final void m634l(Object obj) {
        this.f355a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((bkn) obj).f3651a);
    }

    /* JADX INFO: renamed from: m */
    public final void m635m(boolean z) {
        this.f355a.setDismissable(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m636n(boolean z) {
        this.f355a.setScrollable(z);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m637o() {
        return this.f355a.isCheckable();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m638p() {
        return this.f355a.isClickable();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m639q() {
        return this.f355a.isLongClickable();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m640r() {
        return this.f355a.isPassword();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m641s() {
        return this.f355a.isScrollable();
    }

    /* JADX INFO: renamed from: t */
    public final void m642t(agr agrVar) {
        this.f355a.removeAction((AccessibilityNodeInfo.AccessibilityAction) agrVar.f351M);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.text.Spannable, android.text.SpannableString] */
    public final String toString() {
        ?? text;
        ?? sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f355a.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append("; boundsInParent: ".concat(rect.toString()));
        this.f355a.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        sb.append("; packageName: ");
        sb.append(this.f355a.getPackageName());
        sb.append("; className: ");
        sb.append(m625b());
        sb.append("; text: ");
        if (m624u("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            text = this.f355a.getText();
        } else {
            List listM624u = m624u("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List listM624u2 = m624u("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List listM624u3 = m624u("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List listM624u4 = m624u("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString(TextUtils.substring(this.f355a.getText(), 0, this.f355a.getText().length()));
            for (int i = 0; i < listM624u.size(); i++) {
                text.setSpan(new agp(((Integer) listM624u4.get(i)).intValue(), this, ags.m621a(this.f355a).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listM624u.get(i)).intValue(), ((Integer) listM624u2.get(i)).intValue(), ((Integer) listM624u3.get(i)).intValue());
            }
        }
        sb.append(text);
        sb.append("; contentDescription: ");
        sb.append(this.f355a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f355a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        int i2 = adg.f162a;
        sb.append(this.f355a.getUniqueId());
        sb.append("; checkable: ");
        sb.append(m637o());
        sb.append("; checked: ");
        sb.append(this.f355a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f355a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f355a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f355a.isSelected());
        sb.append("; clickable: ");
        sb.append(m638p());
        sb.append("; longClickable: ");
        sb.append(m639q());
        sb.append("; enabled: ");
        sb.append(this.f355a.isEnabled());
        sb.append("; password: ");
        sb.append(m640r());
        sb.append("; scrollable: " + m641s());
        sb.append("; [");
        List listM626d = m626d();
        for (int i3 = 0; i3 < listM626d.size(); i3++) {
            agr agrVar = (agr) listM626d.get(i3);
            String strM623c = m623c(agrVar.m619a());
            if (strM623c.equals("ACTION_UNKNOWN") && agrVar.m620b() != null) {
                strM623c = agrVar.m620b().toString();
            }
            sb.append(strM623c);
            if (i3 != listM626d.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
