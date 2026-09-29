package p000;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: ig */
/* JADX INFO: loaded from: classes.dex */
public final class C3110ig implements InterfaceC3483q3 {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f44064a;

    public C3110ig(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.f44064a = (AccessibilityManager) systemService;
    }
}
