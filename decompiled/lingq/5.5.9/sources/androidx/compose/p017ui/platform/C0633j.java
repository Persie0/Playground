package androidx.compose.p017ui.platform;

import android.content.Context;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0633j implements InterfaceC0627h {
    public C0633j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}
