package p000;

import java.util.regex.Pattern;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class koc {

    /* JADX INFO: renamed from: c */
    private static final Pattern f36673c = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]*$");

    /* JADX INFO: renamed from: a */
    public final String f36674a;

    /* JADX INFO: renamed from: b */
    public final Class f36675b;

    public koc(String str, Class cls) {
        lku.m15669w(f36673c.matcher(str).matches());
        this.f36674a = str;
        this.f36675b = cls;
    }

    /* JADX INFO: renamed from: a */
    public static koc m14616a(String str) {
        return new koc(str, Integer.class);
    }

    /* JADX INFO: renamed from: b */
    public static koc m14617b(String str) {
        return new koc(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof koc) {
            koc kocVar = (koc) obj;
            if (this.f36675b == kocVar.f36675b && this.f36674a.equals(kocVar.f36674a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f36674a, this.f36675b);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f36674a, this.f36675b);
    }
}
