package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mp2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51685a;

    /* JADX INFO: renamed from: b */
    public String f51686b;

    /* JADX INFO: renamed from: c */
    public String f51687c;

    public mp2(String str, String str2) {
        this.f51685a = 2;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f51686b = str;
        this.f51687c = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    /* JADX INFO: renamed from: a */
    public String m16977a() {
        return this.f51686b;
    }

    /* JADX INFO: renamed from: b */
    public String m16978b() {
        return this.f51687c;
    }

    public boolean equals(Object obj) {
        switch (this.f51685a) {
            case 3:
                return false;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f51685a) {
            case 3:
                String str = this.f51686b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f51687c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f51685a) {
            case 3:
                return "Pair{" + ((Object) this.f51686b) + " " + ((Object) this.f51687c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mp2(String str, int i, String str2) {
        this.f51685a = i;
        this.f51686b = str;
        this.f51687c = str2;
    }
}
