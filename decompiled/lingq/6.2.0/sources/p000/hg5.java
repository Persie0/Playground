package p000;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class hg5 {
    /* JADX INFO: renamed from: a */
    public static String m13229a(List list, String str, vi3 vi3Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[\n\t";
        String str3 = (i & 4) == 0 ? "\n]" : "";
        if ((i & 32) != 0) {
            vi3Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (vi3Var != null) {
                sb.append((CharSequence) vi3Var.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final Void m13230b(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m13231c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
