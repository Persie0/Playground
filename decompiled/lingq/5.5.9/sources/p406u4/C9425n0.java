package p406u4;

import android.support.v4.media.session.C0166e;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p003a2.C0009a;

/* JADX INFO: renamed from: u4.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9425n0 {

    /* JADX INFO: renamed from: b */
    public final View f48373b;

    /* JADX INFO: renamed from: a */
    public final HashMap f48372a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList<AbstractC9409f0> f48374c = new ArrayList<>();

    @Deprecated
    public C9425n0() {
    }

    public C9425n0(View view) {
        this.f48373b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9425n0) {
            C9425n0 c9425n0 = (C9425n0) obj;
            if (this.f48373b == c9425n0.f48373b && this.f48372a.equals(c9425n0.f48372a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48372a.hashCode() + (this.f48373b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM26o = C0009a.m26o("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM26o.append(this.f48373b);
        sbM26o.append("\n");
        String strM765k = C0166e.m765k(sbM26o.toString(), "    values:");
        HashMap map = this.f48372a;
        for (String str : map.keySet()) {
            strM765k = strM765k + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM765k;
    }
}
