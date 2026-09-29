package p432v8;

import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: v8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9670c extends AbstractC9674g {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC9676i> f49519a;

    public C9670c(ArrayList arrayList) {
        this.f49519a = arrayList;
    }

    @Override // p432v8.AbstractC9674g
    /* JADX INFO: renamed from: a */
    public final List<AbstractC9676i> mo18168a() {
        return this.f49519a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9674g) {
            return this.f49519a.equals(((AbstractC9674g) obj).mo18168a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f49519a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0009a.m24m(new StringBuilder("BatchedLogRequest{logRequests="), this.f49519a, "}");
    }
}
