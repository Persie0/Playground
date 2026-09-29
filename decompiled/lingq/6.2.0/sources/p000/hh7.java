package p000;

import android.view.View;
import androidx.core.view.AbstractC0479a;
import androidx.customview.poolingcontainer.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh7 {

    /* JADX INFO: renamed from: a */
    public static final int f42375a = R$id.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b */
    public static final int f42376b = R$id.is_pooling_container_tag;

    /* JADX INFO: renamed from: a */
    public static final void m13242a(View view) {
        view.getClass();
        vx8 vx8VarM18129S = omd.m18129S((zi3) AbstractC0479a.m2000b(view).f71218b);
        while (vx8VarM18129S.hasNext()) {
            ArrayList arrayList = m13243b((View) vx8VarM18129S.next()).f44113a;
            for (int iM23602H = vz1.m23602H(arrayList); -1 < iM23602H; iM23602H--) {
                ((fta) arrayList.get(iM23602H)).f39633a.m1711e();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ih7 m13243b(View view) {
        int i = f42375a;
        ih7 ih7Var = (ih7) view.getTag(i);
        if (ih7Var != null) {
            return ih7Var;
        }
        ih7 ih7Var2 = new ih7();
        view.setTag(i, ih7Var2);
        return ih7Var2;
    }
}
