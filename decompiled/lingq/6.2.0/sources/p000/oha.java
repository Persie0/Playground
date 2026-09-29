package p000;

import android.view.View;
import android.view.ViewParent;
import androidx.core.viewtree.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class oha {
    /* JADX INFO: renamed from: a */
    public static final void m17995a(or3 or3Var, String str, String str2) {
        or3Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = (ArrayList) or3Var.f54782a;
        arrayList.add(str);
        arrayList.add(vk9.m23376L0(str2).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final ViewParent m17996b(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R$id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m17997c(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C3386nv.m17626m("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ci8.m4727l(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                AbstractC3393o1.m17748w(i, string, " at ", " in header name: ", sb);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m17998d(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ci8.m4727l(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                AbstractC3393o1.m17748w(i, string, " at ", " in ", sb);
                sb.append(str2);
                sb.append(" value");
                sb.append(icb.m13776l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m17999e(ye1 ye1Var, Integer num, zi3 zi3Var) {
        if (((tj3) ye1Var).f62384S) {
            ((tj3) ye1Var).m22110b(num, zi3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m18000f(ye1 ye1Var, vi3 vi3Var) {
        ((tj3) ye1Var).m22110b(xfa.f68157a, new C3186kj(vi3Var, 24));
    }

    /* JADX INFO: renamed from: g */
    public static final void m18001g(ye1 ye1Var, zi3 zi3Var, Object obj) {
        if (((tj3) ye1Var).f62384S || !fa4.m11650l(((tj3) ye1Var).m22097O(), obj)) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22131l0(obj);
            tj3Var.m22110b(obj, zi3Var);
        }
    }
}
