package p471x2;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.linguist.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p497y2.C10284f;
import p497y2.C10285g;
import p497y2.InterfaceC10288j;

/* JADX INFO: renamed from: x2.a */
/* JADX INFO: loaded from: classes.dex */
public class C10026a {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f50988c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f50989a;

    /* JADX INFO: renamed from: b */
    public final a f50990b;

    /* JADX INFO: renamed from: x2.a$a */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final C10026a f50991a;

        public a(C10026a c10026a) {
            this.f50991a = c10026a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f50991a.mo4450a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C10285g c10285gMo2287b = this.f50991a.mo2287b(view);
            if (c10285gMo2287b != null) {
                return (AccessibilityNodeProvider) c10285gMo2287b.f51761a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f50991a.mo2998c(view, accessibilityEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            C10284f c10284f = new C10284f(accessibilityNodeInfo);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            boolean z10 = true;
            Object objM18771a = null;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(C10029b0.m.m18761d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean z11 = (bool == null || !bool.booleanValue()) ? 0 : 1;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z11);
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras != null) {
                    extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z11 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(C10029b0.m.m18760c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z12 = bool2 != null && bool2.booleanValue();
            if (i10 >= 28) {
                accessibilityNodeInfo.setHeading(z12);
            } else {
                Bundle extras2 = accessibilityNodeInfo.getExtras();
                if (extras2 != null) {
                    extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z12 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
                }
            }
            CharSequence charSequenceM18649e = C10029b0.m18649e(view);
            if (i10 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceM18649e);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM18649e);
            }
            if (Build.VERSION.SDK_INT < 30) {
                z10 = false;
            }
            if (z10) {
                objM18771a = C10029b0.o.m18771a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_state_description);
                if (CharSequence.class.isInstance(tag3)) {
                    objM18771a = tag3;
                }
            }
            c10284f.m19269n((CharSequence) objM18771a);
            this.f50991a.mo2999d(view, c10284f);
            accessibilityNodeInfo.getText();
            List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            for (int i11 = 0; i11 < listEmptyList.size(); i11++) {
                c10284f.m19257b((C10284f.a) listEmptyList.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f50991a.mo4451e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f50991a.mo4452f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f50991a.mo3000g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f50991a.mo4453h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f50991a.mo4454i(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: x2.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeProvider m18640a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18641b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public C10026a() {
        this(f50988c);
    }

    public C10026a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f50989a = accessibilityDelegate;
        this.f50990b = new a(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4450a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f50989a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C10285g mo2287b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM18640a = b.m18640a(this.f50989a, view);
        if (accessibilityNodeProviderM18640a != null) {
            return new C10285g(accessibilityNodeProviderM18640a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
        this.f50989a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo2999d(View view, C10284f c10284f) {
        this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
    }

    /* JADX INFO: renamed from: e */
    public void mo4451e(View view, AccessibilityEvent accessibilityEvent) {
        this.f50989a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo4452f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f50989a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo3000g(View view, int i10, Bundle bundle) {
        boolean zM18641b;
        WeakReference weakReference;
        boolean z10;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 < listEmptyList.size()) {
                C10284f.a aVar = (C10284f.a) listEmptyList.get(i11);
                if (aVar.m19273a() == i10) {
                    InterfaceC10288j interfaceC10288j = aVar.f51758d;
                    if (interfaceC10288j != null) {
                        Class<? extends InterfaceC10288j.a> cls = aVar.f51757c;
                        if (cls != null) {
                            try {
                                cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                            } catch (Exception e10) {
                                Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                            }
                        }
                        zM18641b = interfaceC10288j.mo4689a(view);
                        break;
                    }
                } else {
                    i11++;
                }
            }
            zM18641b = false;
            break;
        }
        if (!zM18641b) {
            zM18641b = b.m18641b(this.f50989a, view, i10, bundle);
        }
        if (zM18641b || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zM18641b;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan == null) {
                z10 = false;
                break;
            }
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    z10 = false;
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            if (z10) {
                clickableSpan.onClick(view);
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: h */
    public void mo4453h(View view, int i10) {
        this.f50989a.sendAccessibilityEvent(view, i10);
    }

    /* JADX INFO: renamed from: i */
    public void mo4454i(View view, AccessibilityEvent accessibilityEvent) {
        this.f50989a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
