package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.C0357g;
import kotlin.jvm.internal.Lambda;
import p000.kv8;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 */
/* JADX INFO: loaded from: classes.dex */
final class C0373x7245ac5 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final C0373x7245ac5 f4501b = new C0373x7245ac5(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        kv8 kv8VarM1613z = ((C0357g) obj).m1613z();
        boolean z = false;
        if (kv8VarM1613z != null && kv8VarM1613z.f48473c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
