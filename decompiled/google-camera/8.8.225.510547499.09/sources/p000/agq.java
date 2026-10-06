package p000;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agq {
    /* JADX INFO: renamed from: a */
    public static int m617a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static void m618b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
