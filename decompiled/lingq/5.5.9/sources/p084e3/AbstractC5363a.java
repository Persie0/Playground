package p084e3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p326q.C8453i;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p497y2.C10280b;
import p497y2.C10284f;
import p497y2.C10285g;
import p497y2.C10287i;

/* JADX INFO: renamed from: e3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5363a extends C10026a {

    /* JADX INFO: renamed from: n */
    public static final Rect f33690n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final a f33691o = new a();

    /* JADX INFO: renamed from: p */
    public static final b f33692p = new b();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f33697h;

    /* JADX INFO: renamed from: i */
    public final View f33698i;

    /* JADX INFO: renamed from: j */
    public c f33699j;

    /* JADX INFO: renamed from: d */
    public final Rect f33693d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f33694e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f33695f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f33696g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f33700k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f33701l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f33702m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e3.a$a */
    public class a implements C5364b.a<C10284f> {
    }

    /* JADX INFO: renamed from: e3.a$b */
    public class b {
    }

    /* JADX INFO: renamed from: e3.a$c */
    public class c extends C10285g {
        public c() {
        }

        @Override // p497y2.C10285g
        /* JADX INFO: renamed from: a */
        public final C10284f mo11513a(int i10) {
            return new C10284f(AccessibilityNodeInfo.obtain(AbstractC5363a.this.m11510r(i10).f51739a));
        }

        @Override // p497y2.C10285g
        /* JADX INFO: renamed from: b */
        public final C10284f mo11514b(int i10) {
            AbstractC5363a abstractC5363a = AbstractC5363a.this;
            int i11 = i10 == 2 ? abstractC5363a.f33700k : abstractC5363a.f33701l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return mo11513a(i11);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b A[ADDED_TO_REGION, REMOVE] */
        @Override // p497y2.C10285g
        /* JADX INFO: renamed from: c */
        public final boolean mo11515c(int i10, int i11, Bundle bundle) {
            int i12;
            AbstractC5363a abstractC5363a = AbstractC5363a.this;
            View view = abstractC5363a.f33698i;
            if (i10 == -1) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                return C10029b0.d.m18673j(view, i11, bundle);
            }
            boolean z10 = true;
            if (i11 == 1) {
                return abstractC5363a.m11511w(i10);
            }
            if (i11 == 2) {
                return abstractC5363a.m11504j(i10);
            }
            if (i11 == 64) {
                AccessibilityManager accessibilityManager = abstractC5363a.f33697h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = abstractC5363a.f33700k) != i10) {
                    if (i12 != Integer.MIN_VALUE) {
                        abstractC5363a.f33700k = Integer.MIN_VALUE;
                        abstractC5363a.f33698i.invalidate();
                        abstractC5363a.m11512x(i12, 65536);
                    }
                    abstractC5363a.f33700k = i10;
                    view.invalidate();
                    abstractC5363a.m11512x(i10, 32768);
                } else {
                    z10 = false;
                }
            } else {
                if (i11 != 128) {
                    return abstractC5363a.mo8682s(i10, i11, bundle);
                }
                if (abstractC5363a.f33700k == i10) {
                    abstractC5363a.f33700k = Integer.MIN_VALUE;
                    view.invalidate();
                    abstractC5363a.m11512x(i10, 65536);
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC5363a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f33698i = view;
        this.f33697h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.d.m18666c(view) == 0) {
            C10029b0.d.m18682s(view, 1);
        }
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: b */
    public final C10285g mo2287b(View view) {
        if (this.f33699j == null) {
            this.f33699j = new c();
        }
        return this.f33699j;
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: c */
    public final void mo2998c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2998c(view, accessibilityEvent);
    }

    @Override // p471x2.C10026a
    /* JADX INFO: renamed from: d */
    public final void mo2999d(View view, C10284f c10284f) {
        this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
        mo8683t(c10284f);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11504j(int i10) {
        if (this.f33701l != i10) {
            return false;
        }
        this.f33701l = Integer.MIN_VALUE;
        mo8685v(i10, false);
        m11512x(i10, 8);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final AccessibilityEvent m11505k(int i10, int i11) {
        View view = this.f33698i;
        if (i10 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i11);
        C10284f c10284fM11510r = m11510r(i10);
        accessibilityEventObtain2.getText().add(c10284fM11510r.m19263h());
        AccessibilityNodeInfo accessibilityNodeInfo = c10284fM11510r.f51739a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        C10287i.m19280a(accessibilityEventObtain2, view, i10);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final C10284f m11506l(int i10) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C10284f c10284f = new C10284f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c10284f.m19264i("android.view.View");
        Rect rect = f33690n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c10284f.f51740b = -1;
        View view = this.f33698i;
        accessibilityNodeInfoObtain.setParent(view);
        mo8684u(i10, c10284f);
        if (c10284f.m19263h() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f33694e;
        c10284f.m19259d(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c10284f.f51741c = i10;
        accessibilityNodeInfoObtain.setSource(view, i10);
        boolean z10 = false;
        if (this.f33700k == i10) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c10284f.m19256a(BuildConfig.SDK_TRUNCATE_LENGTH);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c10284f.m19256a(64);
        }
        boolean z11 = this.f33701l == i10;
        if (z11) {
            c10284f.m19256a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c10284f.m19256a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z11);
        int[] iArr = this.f33696g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f33693d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c10284f.m19259d(rect3);
            if (c10284f.f51740b != -1) {
                C10284f c10284f2 = new C10284f(AccessibilityNodeInfo.obtain());
                int i11 = c10284f.f51740b;
                while (true) {
                    accessibilityNodeInfo = c10284f2.f51739a;
                    if (i11 == -1) {
                        break;
                    }
                    c10284f2.f51740b = -1;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo8684u(i11, c10284f2);
                    c10284f2.m19259d(rect2);
                    rect3.offset(rect2.left, rect2.top);
                    i11 = c10284f2.f51740b;
                }
                accessibilityNodeInfo.recycle();
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f33695f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c10284f.f51739a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() > 0.0f) {
                                if (view2.getVisibility() != 0) {
                                    break;
                                }
                                parent = view2.getParent();
                            }
                        } else if (parent != null) {
                            z10 = true;
                        }
                        break;
                    }
                }
                if (z10) {
                    accessibilityNodeInfo2.setVisibleToUser(true);
                }
            }
        }
        return c10284f;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m11507m(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.f33697h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo8680n = mo8680n(motionEvent.getX(), motionEvent.getY());
            int i11 = this.f33702m;
            if (i11 != iMo8680n) {
                this.f33702m = iMo8680n;
                m11512x(iMo8680n, BuildConfig.SDK_TRUNCATE_LENGTH);
                m11512x(i11, 256);
            }
            return iMo8680n != Integer.MIN_VALUE;
        }
        if (action != 10 || (i10 = this.f33702m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f33702m = Integer.MIN_VALUE;
            m11512x(Integer.MIN_VALUE, BuildConfig.SDK_TRUNCATE_LENGTH);
            m11512x(i10, 256);
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo8680n(float f3, float f10);

    /* JADX INFO: renamed from: o */
    public abstract void mo8681o(ArrayList arrayList);

    /* JADX INFO: renamed from: p */
    public final void m11508p(int i10) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE && this.f33697h.isEnabled() && (parent = (view = this.f33698i).getParent()) != null) {
            AccessibilityEvent accessibilityEventM11505k = m11505k(i10, 2048);
            C10280b.m19253b(accessibilityEventM11505k, 0);
            parent.requestSendAccessibilityEvent(view, accessibilityEventM11505k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:71:0x0157  */
    /* JADX INFO: renamed from: q */
    public final boolean m11509q(int i10, Rect rect) {
        int i11;
        int i12;
        Object obj;
        C10284f c10284f;
        int i13;
        int i14;
        Rect rect2;
        int iM16537h;
        Rect rect3;
        int i15;
        C10284f c10284f2;
        C10284f c10284f3;
        int i16;
        int i17;
        int iM11519d;
        int iM11520e;
        ArrayList arrayList = new ArrayList();
        mo8681o(arrayList);
        C8453i c8453i = new C8453i();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            c8453i.m16536g(((Integer) arrayList.get(i18)).intValue(), m11506l(((Integer) arrayList.get(i18)).intValue()));
        }
        int i19 = this.f33701l;
        int i20 = Integer.MIN_VALUE;
        C10284f c10284f4 = i19 == Integer.MIN_VALUE ? null : (C10284f) c8453i.m16535f(i19, null);
        a aVar = f33691o;
        b bVar = f33692p;
        View view = this.f33698i;
        if (i10 == 1 || i10 == 2) {
            i11 = 0;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            boolean z10 = C10029b0.e.m18686d(view) == 1;
            bVar.getClass();
            int iM16537h2 = c8453i.m16537h();
            ArrayList arrayList2 = new ArrayList(iM16537h2);
            for (int i21 = 0; i21 < iM16537h2; i21++) {
                arrayList2.add((C10284f) c8453i.m16538i(i21));
            }
            Collections.sort(arrayList2, new C5364b.b(z10, aVar));
            if (i10 == 1) {
                int size = arrayList2.size();
                if (c10284f4 != null) {
                    size = arrayList2.indexOf(c10284f4);
                }
                i12 = -1;
                int i22 = size - 1;
                obj = i22 >= 0 ? arrayList2.get(i22) : null;
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c10284f4 == null ? -1 : arrayList2.lastIndexOf(c10284f4)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    i12 = -1;
                } else {
                    i12 = -1;
                }
            }
            c10284f = (C10284f) obj;
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i23 = this.f33701l;
            if (i23 != Integer.MIN_VALUE) {
                m11510r(i23).m19259d(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i10 == 17) {
                        i14 = 0;
                        rect4.set(width, 0, width, height);
                    } else if (i10 == 33) {
                        i14 = 0;
                        rect4.set(0, height, width, height);
                    } else if (i10 == 66) {
                        rect4.set(-1, 0, -1, height);
                        i14 = 0;
                    } else {
                        if (i10 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i14 = 0;
                    }
                }
                rect2 = new Rect(rect4);
                if (i10 != 17) {
                    rect2.offset(rect4.width() + 1, i14);
                } else if (i10 != 33) {
                    rect2.offset(i14, rect4.height() + 1);
                } else if (i10 != 66) {
                    rect2.offset(-(rect4.width() + 1), i14);
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.offset(i14, -(rect4.height() + 1));
                }
                bVar.getClass();
                iM16537h = c8453i.m16537h();
                rect3 = new Rect();
                c10284f2 = null;
                for (i15 = i14; i15 < iM16537h; i15++) {
                    c10284f3 = (C10284f) c8453i.m16538i(i15);
                    if (c10284f3 == c10284f4) {
                        aVar.getClass();
                        c10284f3.m19259d(rect3);
                        if (C5364b.m11518c(i10, rect4, rect3)) {
                            if (C5364b.m11518c(i10, rect4, rect2) && !C5364b.m11516a(i10, rect4, rect3, rect2)) {
                                if (!C5364b.m11516a(i10, rect4, rect2, rect3)) {
                                    int iM11519d2 = C5364b.m11519d(i10, rect4, rect3);
                                    int iM11520e2 = C5364b.m11520e(i10, rect4, rect3);
                                    i17 = (iM11520e2 * iM11520e2) + (iM11519d2 * 13 * iM11519d2);
                                    iM11519d = C5364b.m11519d(i10, rect4, rect2);
                                    iM11520e = C5364b.m11520e(i10, rect4, rect2);
                                    if (i17 < (iM11520e * iM11520e) + (iM11519d * 13 * iM11519d)) {
                                    }
                                }
                                i16 = i14;
                            }
                            i16 = 1;
                        } else {
                            i16 = i14;
                        }
                        if (i16 != 0) {
                            rect2.set(rect3);
                            c10284f2 = c10284f3;
                        }
                    }
                }
                i11 = i14;
                c10284f = c10284f2;
                i12 = -1;
            }
            i14 = 0;
            rect2 = new Rect(rect4);
            if (i10 != 17) {
                rect2.offset(rect4.width() + 1, i14);
            } else if (i10 != 33) {
                rect2.offset(i14, rect4.height() + 1);
            } else if (i10 != 66) {
                rect2.offset(-(rect4.width() + 1), i14);
            } else {
                if (i10 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect2.offset(i14, -(rect4.height() + 1));
            }
            bVar.getClass();
            iM16537h = c8453i.m16537h();
            rect3 = new Rect();
            c10284f2 = null;
            while (i15 < iM16537h) {
                c10284f3 = (C10284f) c8453i.m16538i(i15);
                if (c10284f3 == c10284f4) {
                    aVar.getClass();
                    c10284f3.m19259d(rect3);
                    if (C5364b.m11518c(i10, rect4, rect3)) {
                        if (C5364b.m11518c(i10, rect4, rect2)) {
                            if (!C5364b.m11516a(i10, rect4, rect2, rect3)) {
                                int iM11519d3 = C5364b.m11519d(i10, rect4, rect3);
                                int iM11520e3 = C5364b.m11520e(i10, rect4, rect3);
                                i17 = (iM11520e3 * iM11520e3) + (iM11519d3 * 13 * iM11519d3);
                                iM11519d = C5364b.m11519d(i10, rect4, rect2);
                                iM11520e = C5364b.m11520e(i10, rect4, rect2);
                                if (i17 < (iM11520e * iM11520e) + (iM11519d * 13 * iM11519d)) {
                                }
                            }
                            i16 = i14;
                        }
                        i16 = 1;
                    } else {
                        i16 = i14;
                    }
                    if (i16 != 0) {
                        rect2.set(rect3);
                        c10284f2 = c10284f3;
                    }
                }
            }
            i11 = i14;
            c10284f = c10284f2;
            i12 = -1;
        }
        if (c10284f != null) {
            if (c8453i.f45621a) {
                c8453i.m16534e();
            }
            int i24 = i11;
            while (true) {
                if (i24 >= c8453i.f45624d) {
                    i13 = i12;
                    break;
                }
                if (c8453i.f45623c[i24] == c10284f) {
                    i13 = i24;
                    break;
                }
                i24++;
            }
            if (c8453i.f45621a) {
                c8453i.m16534e();
            }
            i20 = c8453i.f45622b[i13];
        }
        return m11511w(i20);
    }

    /* JADX INFO: renamed from: r */
    public final C10284f m11510r(int i10) {
        if (i10 != -1) {
            return m11506l(i10);
        }
        View view = this.f33698i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C10284f c10284f = new C10284f(accessibilityNodeInfoObtain);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo8681o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c10284f.f51739a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
        }
        return c10284f;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo8682s(int i10, int i11, Bundle bundle);

    /* JADX INFO: renamed from: t */
    public void mo8683t(C10284f c10284f) {
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo8684u(int i10, C10284f c10284f);

    /* JADX INFO: renamed from: v */
    public void mo8685v(int i10, boolean z10) {
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11511w(int i10) {
        int i11;
        View view = this.f33698i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f33701l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            m11504j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f33701l = i10;
        mo8685v(i10, true);
        m11512x(i10, 8);
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m11512x(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 != Integer.MIN_VALUE) {
            if (this.f33697h.isEnabled() && (parent = (view = this.f33698i).getParent()) != null) {
                parent.requestSendAccessibilityEvent(view, m11505k(i10, i11));
            }
        }
    }
}
