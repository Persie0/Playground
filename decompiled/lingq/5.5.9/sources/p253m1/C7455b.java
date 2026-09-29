package p253m1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextUtils;
import dm.C5207g;
import p388t1.C9177c;
import p389t2.C9182a;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7455b {
    /* JADX INFO: renamed from: a */
    public static BoringLayout m14826a(CharSequence charSequence, C9177c c9177c, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(c9177c, "paint");
        C5207g.m11111f(alignment, "alignment");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i11 >= 0) {
            return C9182a.m17515a() ? C7454a.m14824a(charSequence, c9177c, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11) : C7456c.m14827a(charSequence, c9177c, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
