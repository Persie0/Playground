package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import kotlin.jvm.internal.Lambda;
import p000.kv8;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 */
/* JADX INFO: loaded from: classes.dex */
final class C0375x93be146e extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final C0375x93be146e f4503b = new C0375x93be146e(1);

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean z;
        kv8 kv8VarM1613z = ((C0357g) obj).m1613z();
        if (kv8VarM1613z != null) {
            if (kv8VarM1613z.f48473c) {
                z = kv8VarM1613z.f48471a.m17251c(AbstractC0424d.f4983G);
            }
        }
        return Boolean.valueOf(z);
    }
}
