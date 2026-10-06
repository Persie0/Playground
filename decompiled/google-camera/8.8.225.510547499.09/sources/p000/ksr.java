package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksr {

    /* JADX INFO: renamed from: a */
    public final Context f37126a;

    /* JADX INFO: renamed from: b */
    public final mrm f37127b;

    /* JADX INFO: renamed from: c */
    public final mrm f37128c;

    /* JADX INFO: renamed from: d */
    private final mrm f37129d;

    public ksr() {
    }

    public ksr(Context context, mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        this.f37126a = context;
        this.f37129d = mrmVar;
        this.f37127b = mrmVar2;
        this.f37128c = mrmVar3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ksr) {
            ksr ksrVar = (ksr) obj;
            if (this.f37126a.equals(ksrVar.f37126a) && this.f37129d.equals(ksrVar.f37129d) && this.f37127b.equals(ksrVar.f37127b) && this.f37128c.equals(ksrVar.f37128c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f37126a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.f37127b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollectionBasisContext{context=" + String.valueOf(this.f37126a) + ", accountNames=" + String.valueOf(this.f37129d) + ", stacktrace=" + String.valueOf(this.f37127b) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(this.f37128c) + "}";
    }
}
