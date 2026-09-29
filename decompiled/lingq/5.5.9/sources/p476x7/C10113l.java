package p476x7;

/* JADX INFO: renamed from: x7.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10113l {

    /* JADX INFO: renamed from: a */
    public final String f51287a;

    /* JADX INFO: renamed from: b */
    public final boolean f51288b;

    public C10113l(String str, boolean z10) {
        this.f51287a = str;
        this.f51288b = z10;
    }

    public final String toString() {
        String str = this.f51288b ? "Applink" : "Unclassified";
        String str2 = this.f51287a;
        if (str2 != null) {
            str = str + '(' + ((Object) str2) + ')';
        }
        return str;
    }
}
