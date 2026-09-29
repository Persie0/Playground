package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class no8 {

    /* JADX INFO: renamed from: a */
    public final String f53065a;

    /* JADX INFO: renamed from: b */
    public final int f53066b;

    public no8(String str, int i) {
        str.getClass();
        this.f53065a = str;
        this.f53066b = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m17570a() {
        return this.f53066b;
    }

    /* JADX INFO: renamed from: b */
    public final String m17571b() {
        return this.f53065a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no8)) {
            return false;
        }
        no8 no8Var = (no8) obj;
        return fa4.m11650l(this.f53065a, no8Var.f53065a) && this.f53066b == no8Var.f53066b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53066b) + (this.f53065a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchChatHistoryJoin(query=" + this.f53065a + ", chatId=" + this.f53066b + ")";
    }
}
