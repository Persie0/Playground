package p000;

import android.view.View;
import androidx.savedstate.R$id;

/* JADX INFO: loaded from: classes.dex */
public abstract class dja {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f35732a = 0;

    /* JADX INFO: renamed from: a */
    public static final vl8 m10417a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R$id.view_tree_saved_state_registry_owner);
            vl8 vl8Var = tag instanceof vl8 ? (vl8) tag : null;
            if (vl8Var != null) {
                return vl8Var;
            }
            Object objM17996b = oha.m17996b(view);
            view = objM17996b instanceof View ? (View) objM17996b : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m10418b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str.concat(" must not be null"));
    }
}
