package p000;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agu {
    /* JADX INFO: renamed from: a */
    static int m643a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    /* JADX INFO: renamed from: b */
    static int m644b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    /* JADX INFO: renamed from: c */
    public static void m645c(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m646d(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
