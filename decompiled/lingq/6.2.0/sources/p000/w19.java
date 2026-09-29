package p000;

import com.lingq.core.settings.ViewKeys;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f66226a;

    /* JADX INFO: renamed from: b */
    public final List f66227b;

    /* JADX INFO: renamed from: c */
    public final float f66228c;

    /* JADX INFO: renamed from: d */
    public final float f66229d;

    /* JADX INFO: renamed from: e */
    public final ViewKeys f66230e;

    /* JADX INFO: renamed from: f */
    public final float f66231f;

    public w19(ArrayList arrayList, List list, float f, float f2, ViewKeys viewKeys, float f3) {
        viewKeys.getClass();
        this.f66226a = arrayList;
        this.f66227b = list;
        this.f66228c = f;
        this.f66229d = f2;
        this.f66230e = viewKeys;
        this.f66231f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w19)) {
            return false;
        }
        w19 w19Var = (w19) obj;
        return this.f66226a.equals(w19Var.f66226a) && this.f66227b.equals(w19Var.f66227b) && Float.compare(this.f66228c, w19Var.f66228c) == 0 && Float.compare(this.f66229d, w19Var.f66229d) == 0 && this.f66230e == w19Var.f66230e && Float.compare(this.f66231f, w19Var.f66231f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66231f) + g9a.m12428e((this.f66230e.hashCode() + wq1.m24105a(wq1.m24105a(ux5.m22979b(this.f66226a.hashCode() * 31, 31, this.f66227b), this.f66228c, 31), this.f66229d, 31)) * 31, 31, true);
    }

    public final String toString() {
        return "Range(rangeValues=" + this.f66226a + ", labels=" + this.f66227b + ", min=" + this.f66228c + ", max=" + this.f66229d + ", key=" + this.f66230e + ", detectDragFinished=true, maxValue=" + this.f66231f + ")";
    }
}
