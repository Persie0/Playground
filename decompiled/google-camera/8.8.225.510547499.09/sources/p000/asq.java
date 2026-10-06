package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asq {

    /* JADX INFO: renamed from: b */
    public View f2261b;

    /* JADX INFO: renamed from: a */
    public final Map f2260a = new HashMap();

    /* JADX INFO: renamed from: c */
    final ArrayList f2262c = new ArrayList();

    @Deprecated
    public asq() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof asq)) {
            return false;
        }
        asq asqVar = (asq) obj;
        return this.f2261b == asqVar.f2261b && this.f2260a.equals(asqVar.f2260a);
    }

    public final int hashCode() {
        return (this.f2261b.hashCode() * 31) + this.f2260a.hashCode();
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2261b + "\n").concat("    values:");
        for (String str : this.f2260a.keySet()) {
            strConcat = strConcat + "    " + str + ": " + this.f2260a.get(str) + "\n";
        }
        return strConcat;
    }

    public asq(View view) {
        this.f2261b = view;
    }
}
