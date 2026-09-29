package androidx.compose.p017ui.platform;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0636k implements InterfaceC0634j0 {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f4321a;

    public C0636k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f4321a = (ClipboardManager) systemService;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2360a() {
        ClipDescription primaryClipDescription = this.f4321a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }
}
