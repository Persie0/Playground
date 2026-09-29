package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class waa {

    /* JADX INFO: renamed from: b */
    public final View f66571b;

    /* JADX INFO: renamed from: a */
    public final HashMap f66570a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f66572c = new ArrayList();

    public waa(View view) {
        this.f66571b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof waa)) {
            return false;
        }
        waa waaVar = (waa) obj;
        return this.f66571b == waaVar.f66571b && this.f66570a.equals(waaVar.f66570a);
    }

    public final int hashCode() {
        return this.f66570a.hashCode() + (this.f66571b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM22999v = ux5.m22999v("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM22999v.append(this.f66571b);
        sbM22999v.append("\n");
        String strConcat = sbM22999v.toString().concat("    values:");
        HashMap map = this.f66570a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
