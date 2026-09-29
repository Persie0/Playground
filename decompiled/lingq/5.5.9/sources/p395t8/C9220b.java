package p395t8;

import p003a2.C0009a;

/* JADX INFO: renamed from: t8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9220b {

    /* JADX INFO: renamed from: a */
    public final String f47836a;

    public C9220b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f47836a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9220b)) {
            return false;
        }
        return this.f47836a.equals(((C9220b) obj).f47836a);
    }

    public final int hashCode() {
        return this.f47836a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("Encoding{name=\""), this.f47836a, "\"}");
    }
}
