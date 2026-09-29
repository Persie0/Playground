package p000;

import com.lingq.feature.search.filter.model.ViewKeys;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u19 extends g29 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f63252a;

    /* JADX INFO: renamed from: b */
    public final int f63253b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f63254c;

    public u19(ArrayList arrayList, int i, ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f63252a = arrayList;
        this.f63253b = i;
        this.f63254c = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u19)) {
            return false;
        }
        u19 u19Var = (u19) obj;
        return this.f63252a.equals(u19Var.f63252a) && this.f63253b == u19Var.f63253b && this.f63254c == u19Var.f63254c;
    }

    public final int hashCode() {
        return this.f63254c.hashCode() + wq1.m24106b(this.f63253b, this.f63252a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Options(options=" + this.f63252a + ", selectedIndex=" + this.f63253b + ", key=" + this.f63254c + ")";
    }
}
