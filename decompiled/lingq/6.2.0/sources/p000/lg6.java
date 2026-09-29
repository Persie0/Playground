package p000;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class lg6 extends hw5 {

    /* JADX INFO: renamed from: A */
    public final int f49632A;

    /* JADX INFO: renamed from: z */
    public final Class f49633z;

    public lg6(Context context, Class cls, int i) {
        super(context);
        this.f49633z = cls;
        this.f49632A = i;
    }

    @Override // p000.hw5
    /* JADX INFO: renamed from: a */
    public final mw5 mo13518a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f43042f.size() + 1;
        int i4 = this.f49632A;
        if (size > i4) {
            String simpleName = this.f49633z.getSimpleName();
            C3386nv.m17626m(AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(i4, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
            return null;
        }
        m13540w();
        mw5 mw5VarMo13518a = super.mo13518a(i, i2, i3, charSequence);
        m13539v();
        return mw5VarMo13518a;
    }

    @Override // p000.hw5, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f49633z.getSimpleName().concat(" does not support submenus"));
    }
}
