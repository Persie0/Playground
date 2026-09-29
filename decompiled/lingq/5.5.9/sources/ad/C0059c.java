package ad;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.C0226h;
import p003a2.C0009a;

/* JADX INFO: renamed from: ad.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0059c extends C0224f {

    /* JADX INFO: renamed from: A */
    public final int f109A;

    /* JADX INFO: renamed from: z */
    public final Class<?> f110z;

    public C0059c(Context context, Class<?> cls, int i10) {
        super(context);
        this.f110z = cls;
        this.f109A = i10;
    }

    @Override // androidx.appcompat.view.menu.C0224f
    /* JADX INFO: renamed from: a */
    public final C0226h mo235a(int i10, int i11, int i12, CharSequence charSequence) {
        int size = size() + 1;
        int i13 = this.f109A;
        if (size <= i13) {
            m939w();
            C0226h c0226hMo235a = super.mo235a(i10, i11, i12, charSequence);
            c0226hMo235a.f746x = (c0226hMo235a.f746x & (-5)) | 4;
            m938v();
            return c0226hMo235a;
        }
        String simpleName = this.f110z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i13);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(C0009a.m23l(sb2, simpleName, "#getMaxItemCount()"));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.appcompat.view.menu.C0224f, android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f110z.getSimpleName().concat(" does not support submenus"));
    }
}
