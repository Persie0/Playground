package p253m1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;
import dm.C5207g;
import p388t1.C9177c;

/* JADX INFO: renamed from: m1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7466m {

    /* JADX INFO: renamed from: a */
    public static final C7462i f41295a = new C7462i();

    /* JADX INFO: renamed from: a */
    public static StaticLayout m14838a(CharSequence charSequence, int i10, int i11, C9177c c9177c, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f3, float f10, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        C5207g.m11111f(charSequence, "text");
        C5207g.m11111f(c9177c, "paint");
        C5207g.m11111f(textDirectionHeuristic, "textDir");
        C5207g.m11111f(alignment, "alignment");
        return f41295a.mo14833a(new C7468o(charSequence, i10, i11, c9177c, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f3, f10, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2));
    }
}
