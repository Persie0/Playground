package p497y2;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p017ui.platform.AndroidComposeView;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p389t2.C9182a;

/* JADX INFO: renamed from: y2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10284f {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f51739a;

    /* JADX INFO: renamed from: b */
    public int f51740b = -1;

    /* JADX INFO: renamed from: c */
    public int f51741c = -1;

    /* JADX INFO: renamed from: y2.f$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public static final a f51742e;

        /* JADX INFO: renamed from: f */
        public static final a f51743f;

        /* JADX INFO: renamed from: g */
        public static final a f51744g;

        /* JADX INFO: renamed from: h */
        public static final a f51745h;

        /* JADX INFO: renamed from: i */
        public static final a f51746i;

        /* JADX INFO: renamed from: j */
        public static final a f51747j;

        /* JADX INFO: renamed from: k */
        public static final a f51748k;

        /* JADX INFO: renamed from: l */
        public static final a f51749l;

        /* JADX INFO: renamed from: m */
        public static final a f51750m;

        /* JADX INFO: renamed from: n */
        public static final a f51751n;

        /* JADX INFO: renamed from: o */
        public static final a f51752o;

        /* JADX INFO: renamed from: p */
        public static final a f51753p;

        /* JADX INFO: renamed from: q */
        public static final a f51754q;

        /* JADX INFO: renamed from: a */
        public final Object f51755a;

        /* JADX INFO: renamed from: b */
        public final int f51756b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC10288j.a> f51757c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC10288j f51758d;

        static {
            new a(1, (String) null);
            new a(2, (String) null);
            new a(4, (String) null);
            new a(8, (String) null);
            f51742e = new a(16, (String) null);
            new a(32, (String) null);
            f51743f = new a(64, (String) null);
            f51744g = new a(BuildConfig.SDK_TRUNCATE_LENGTH, (String) null);
            new a(256, InterfaceC10288j.b.class);
            new a(512, InterfaceC10288j.b.class);
            new a(1024, InterfaceC10288j.c.class);
            new a(2048, InterfaceC10288j.c.class);
            f51745h = new a(4096, (String) null);
            f51746i = new a(8192, (String) null);
            new a(16384, (String) null);
            new a(32768, (String) null);
            new a(65536, (String) null);
            new a(131072, InterfaceC10288j.g.class);
            f51747j = new a(262144, (String) null);
            f51748k = new a(524288, (String) null);
            f51749l = new a(1048576, (String) null);
            new a(2097152, InterfaceC10288j.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC10288j.e.class);
            f51750m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f51751n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f51752o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f51753p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f51754q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC10288j.f.class);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC10288j.d.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(int i10, String str) {
            this(null, i10, str, null, null);
        }

        public a(Object obj, int i10, String str, InterfaceC10288j interfaceC10288j, Class cls) {
            this.f51756b = i10;
            this.f51758d = interfaceC10288j;
            if (obj == null) {
                this.f51755a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
            } else {
                this.f51755a = obj;
            }
            this.f51757c = cls;
        }

        /* JADX INFO: renamed from: a */
        public final int m19273a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f51755a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f51755a;
            Object obj3 = this.f51755a;
            if (obj3 == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!obj3.equals(obj2)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Object obj = this.f51755a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: y2.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Object f51759a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f51759a = collectionInfo;
        }

        /* JADX INFO: renamed from: a */
        public static b m19274a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* JADX INFO: renamed from: y2.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final Object f51760a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f51760a = collectionItemInfo;
        }

        /* JADX INFO: renamed from: a */
        public static c m19275a(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
        }
    }

    public C10284f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f51739a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: a */
    public final void m19256a(int i10) {
        this.f51739a.addAction(i10);
    }

    /* JADX INFO: renamed from: b */
    public final void m19257b(a aVar) {
        this.f51739a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f51755a);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m19258c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m19259d(Rect rect) {
        this.f51739a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m19260e() {
        return this.f51739a.getHintText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10284f)) {
            C10284f c10284f = (C10284f) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f51739a;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            return this.f51741c == c10284f.f51741c && this.f51740b == c10284f.f51740b;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m19261f() {
        return this.f51739a.getMovementGranularities();
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m19262g() {
        boolean z10 = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        return z10 ? accessibilityNodeInfo.getStateDescription() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m19263h() {
        boolean z10 = !m19258c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        if (!z10) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM19258c = m19258c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM19258c2 = m19258c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM19258c3 = m19258c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM19258c4 = m19258c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i10 = 0; i10 < arrayListM19258c.size(); i10++) {
            spannableString.setSpan(new C10279a(((Integer) arrayListM19258c4.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM19258c.get(i10)).intValue(), ((Integer) arrayListM19258c2.get(i10)).intValue(), ((Integer) arrayListM19258c3.get(i10)).intValue());
        }
        return spannableString;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m19264i(CharSequence charSequence) {
        this.f51739a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public final void m19265j(b bVar) {
        this.f51739a.setCollectionInfo(bVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) bVar.f51759a);
    }

    /* JADX INFO: renamed from: k */
    public final void m19266k(c cVar) {
        this.f51739a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f51760a);
    }

    /* JADX INFO: renamed from: l */
    public final void m19267l(CharSequence charSequence) {
        this.f51739a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: m */
    public final void m19268m(boolean z10) {
        this.f51739a.setScrollable(z10);
    }

    /* JADX INFO: renamed from: n */
    public final void m19269n(CharSequence charSequence) {
        boolean z10 = Build.VERSION.SDK_INT >= 30;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        if (z10) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m19270o(CharSequence charSequence) {
        this.f51739a.setText(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public final void m19271p(AndroidComposeView androidComposeView, int i10) {
        this.f51739a.setTraversalAfter(androidComposeView, i10);
    }

    /* JADX INFO: renamed from: q */
    public final void m19272q(AndroidComposeView androidComposeView, int i10) {
        this.f51739a.setTraversalBefore(androidComposeView, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        ?? EmptyList;
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m19259d(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f51739a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(m19263h());
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(C9182a.m17515a() ? accessibilityNodeInfo.getUniqueId() : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            EmptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                EmptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            EmptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < EmptyList.size(); i11++) {
            a aVar = (a) EmptyList.get(i11);
            int iM19273a = aVar.m19273a();
            if (iM19273a == 1) {
                string = "ACTION_FOCUS";
            } else if (iM19273a != 2) {
                switch (iM19273a) {
                    case 4:
                        string = "ACTION_SELECT";
                        break;
                    case 8:
                        string = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        string = "ACTION_CLICK";
                        break;
                    case 32:
                        string = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        string = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                        string = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        string = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        string = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        string = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        string = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        string = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        string = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        string = "ACTION_COPY";
                        break;
                    case 32768:
                        string = "ACTION_PASTE";
                        break;
                    case 65536:
                        string = "ACTION_CUT";
                        break;
                    case 131072:
                        string = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        string = "ACTION_EXPAND";
                        break;
                    case 524288:
                        string = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        string = "ACTION_SET_TEXT";
                        break;
                    case R.id.accessibilityActionMoveWindow:
                        string = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (iM19273a) {
                            case R.id.accessibilityActionShowOnScreen:
                                string = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case R.id.accessibilityActionScrollToPosition:
                                string = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case R.id.accessibilityActionScrollUp:
                                string = "ACTION_SCROLL_UP";
                                break;
                            case R.id.accessibilityActionScrollLeft:
                                string = "ACTION_SCROLL_LEFT";
                                break;
                            case R.id.accessibilityActionScrollDown:
                                string = "ACTION_SCROLL_DOWN";
                                break;
                            case R.id.accessibilityActionScrollRight:
                                string = "ACTION_SCROLL_RIGHT";
                                break;
                            case R.id.accessibilityActionContextClick:
                                string = "ACTION_CONTEXT_CLICK";
                                break;
                            case R.id.accessibilityActionSetProgress:
                                string = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (iM19273a) {
                                    case R.id.accessibilityActionShowTooltip:
                                        string = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionHideTooltip:
                                        string = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionPageUp:
                                        string = "ACTION_PAGE_UP";
                                        break;
                                    case R.id.accessibilityActionPageDown:
                                        string = "ACTION_PAGE_DOWN";
                                        break;
                                    case R.id.accessibilityActionPageLeft:
                                        string = "ACTION_PAGE_LEFT";
                                        break;
                                    case R.id.accessibilityActionPageRight:
                                        string = "ACTION_PAGE_RIGHT";
                                        break;
                                    case R.id.accessibilityActionPressAndHold:
                                        string = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (iM19273a) {
                                            case R.id.accessibilityActionImeEnter:
                                                string = "ACTION_IME_ENTER";
                                                break;
                                            case R.id.accessibilityActionDragStart:
                                                string = "ACTION_DRAG_START";
                                                break;
                                            case R.id.accessibilityActionDragDrop:
                                                string = "ACTION_DRAG_DROP";
                                                break;
                                            case R.id.accessibilityActionDragCancel:
                                                string = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                string = "ACTION_UNKNOWN";
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                string = "ACTION_CLEAR_FOCUS";
            }
            if (string.equals("ACTION_UNKNOWN")) {
                Object obj = aVar.f51755a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    string = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(string);
            if (i11 != EmptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
