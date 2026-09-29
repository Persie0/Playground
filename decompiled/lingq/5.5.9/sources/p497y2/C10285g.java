package p497y2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: y2.g */
/* JADX INFO: loaded from: classes.dex */
public class C10285g {

    /* JADX INFO: renamed from: a */
    public final Object f51761a;

    /* JADX INFO: renamed from: y2.g$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C10285g f51762a;

        public a(C10285g c10285g) {
            this.f51762a = c10285g;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C10284f c10284fMo11513a = this.f51762a.mo11513a(i10);
            if (c10284fMo11513a == null) {
                return null;
            }
            return c10284fMo11513a.f51739a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f51762a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f51762a.mo11515c(i10, i11, bundle);
        }
    }

    /* JADX INFO: renamed from: y2.g$b */
    public static class b extends a {
        public b(C10285g c10285g) {
            super(c10285g);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            C10284f c10284fMo11514b = this.f51762a.mo11514b(i10);
            if (c10284fMo11514b == null) {
                return null;
            }
            return c10284fMo11514b.f51739a;
        }
    }

    /* JADX INFO: renamed from: y2.g$c */
    public static class c extends b {
        public c(C10285g c10285g) {
            super(c10285g);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f51762a.getClass();
        }
    }

    public C10285g() {
        this.f51761a = new c(this);
    }

    public C10285g(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f51761a = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: a */
    public C10284f mo11513a(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C10284f mo11514b(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo11515c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
