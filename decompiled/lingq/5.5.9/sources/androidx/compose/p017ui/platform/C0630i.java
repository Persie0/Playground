package androidx.compose.p017ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import dm.C5207g;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0630i {

    /* JADX INFO: renamed from: a */
    public static final C0630i f4315a = new C0630i();

    /* JADX INFO: renamed from: a */
    public final void m2358a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        C5207g.m11111f(accessibilityNodeInfo, "node");
        C5207g.m11111f(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
