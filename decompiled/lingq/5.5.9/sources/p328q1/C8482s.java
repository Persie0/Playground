package p328q1;

import android.content.Context;
import android.graphics.Typeface;
import dm.C5207g;

/* JADX INFO: renamed from: q1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C8482s {

    /* JADX INFO: renamed from: a */
    public static final C8482s f45663a = new C8482s();

    /* JADX INFO: renamed from: a */
    public final Typeface m16553a(Context context, C8481r c8481r) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(c8481r, "font");
        Typeface font = context.getResources().getFont(c8481r.f45658a);
        C5207g.m11110e(font, "context.resources.getFont(font.resId)");
        return font;
    }
}
