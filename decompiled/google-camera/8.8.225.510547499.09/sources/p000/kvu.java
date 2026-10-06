package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvu {

    /* JADX INFO: renamed from: a */
    public final kwe f37457a;

    /* JADX INFO: renamed from: b */
    public final List f37458b;

    /* JADX INFO: renamed from: c */
    public final kvw f37459c;

    public kvu() {
    }

    public kvu(kwe kweVar, List list, kvw kvwVar) {
        this.f37457a = kweVar;
        this.f37458b = list;
        this.f37459c = kvwVar;
    }

    /* JADX INFO: renamed from: a */
    public static npa m14935a() {
        npa npaVar = new npa();
        npaVar.m17580c(kvw.f37460b);
        return npaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvu) {
            kvu kvuVar = (kvu) obj;
            if (this.f37457a.equals(kvuVar.f37457a) && this.f37458b.equals(kvuVar.f37458b) && this.f37459c.equals(kvuVar.f37459c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM18134L;
        int iM18134L2;
        kwe kweVar = this.f37457a;
        if (kweVar.m18142ac()) {
            iM18134L = kweVar.m18134L();
        } else {
            int iM18134L3 = kweVar.f44820aG;
            if (iM18134L3 == 0) {
                iM18134L3 = kweVar.m18134L();
                kweVar.f44820aG = iM18134L3;
            }
            iM18134L = iM18134L3;
        }
        int iHashCode = ((iM18134L ^ 1000003) * 1000003) ^ this.f37458b.hashCode();
        kvw kvwVar = this.f37459c;
        if (kvwVar.m18142ac()) {
            iM18134L2 = kvwVar.m18134L();
        } else {
            int iM18134L4 = kvwVar.f44820aG;
            if (iM18134L4 == 0) {
                iM18134L4 = kvwVar.m18134L();
                kvwVar.f44820aG = iM18134L4;
            }
            iM18134L2 = iM18134L4;
        }
        return (iHashCode * 1000003) ^ iM18134L2;
    }

    public final String toString() {
        return "LinkPresentationResult{linkDataResult=" + String.valueOf(this.f37457a) + ", linkChipResult=" + String.valueOf(this.f37458b) + ", linkChipResultMetadata=" + String.valueOf(this.f37459c) + "}";
    }
}
