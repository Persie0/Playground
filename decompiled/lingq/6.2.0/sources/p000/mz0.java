package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mz0 extends nz0 {

    /* JADX INFO: renamed from: a */
    public final int f52057a;

    /* JADX INFO: renamed from: b */
    public final String f52058b;

    public mz0(int i, String str) {
        this.f52057a = i;
        this.f52058b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return this.f52057a == mz0Var.f52057a && fa4.m11650l(this.f52058b, mz0Var.f52058b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f52057a) * 31;
        String str = this.f52058b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hn1.m13354d(this.f52057a, "Started(chatId=", ", title=", this.f52058b, ")");
    }
}
