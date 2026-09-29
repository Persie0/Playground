package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f55 {

    /* JADX INFO: renamed from: a */
    public final String f38433a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f38434b;

    public f55(String str, ArrayList arrayList) {
        str.getClass();
        this.f38433a = str;
        this.f38434b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f55)) {
            return false;
        }
        f55 f55Var = (f55) obj;
        return fa4.m11650l(this.f38433a, f55Var.f38433a) && this.f38434b.equals(f55Var.f38434b);
    }

    public final int hashCode() {
        return this.f38434b.hashCode() + (this.f38433a.hashCode() * 31);
    }

    public final String toString() {
        return "PreparedTranslationPagingData(text=" + this.f38433a + ", tokens=" + this.f38434b + ")";
    }
}
