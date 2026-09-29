package p253m1;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.activity.C0189h;
import androidx.activity.C0197p;
import dm.C5207g;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7465l {
    /* JADX INFO: renamed from: a */
    public static final boolean m14836a(StaticLayout staticLayout) {
        C5207g.m11111f(staticLayout, "layout");
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static final void m14837b(StaticLayout.Builder builder, int i10, int i11) {
        C5207g.m11111f(builder, "builder");
        C0189h.m818f();
        LineBreakConfig lineBreakConfigBuild = C0197p.m833b().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build();
        C5207g.m11110e(lineBreakConfigBuild, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(lineBreakConfigBuild);
    }
}
