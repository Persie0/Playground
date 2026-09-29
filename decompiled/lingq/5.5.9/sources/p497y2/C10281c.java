package p497y2;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: y2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10281c {
    /* JADX INFO: renamed from: a */
    public static boolean m19254a(AccessibilityManager accessibilityManager, InterfaceC10282d interfaceC10282d) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC10283e(interfaceC10282d));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m19255b(AccessibilityManager accessibilityManager, InterfaceC10282d interfaceC10282d) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC10283e(interfaceC10282d));
    }
}
