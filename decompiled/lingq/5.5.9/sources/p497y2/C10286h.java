package p497y2;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: y2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10286h {
    /* JADX INFO: renamed from: a */
    public static int m19276a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    /* JADX INFO: renamed from: b */
    public static int m19277b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    /* JADX INFO: renamed from: c */
    public static void m19278c(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    /* JADX INFO: renamed from: d */
    public static void m19279d(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }
}
