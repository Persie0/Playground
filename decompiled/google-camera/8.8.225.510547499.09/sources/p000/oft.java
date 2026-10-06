package p000;

import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oft {

    /* JADX INFO: renamed from: a */
    public static final oft f45876a = m18470a("1.228.0");

    /* JADX INFO: renamed from: b */
    public static final oft f45877b = m18470a("1.81.0");

    /* JADX INFO: renamed from: c */
    public final int f45878c;

    /* JADX INFO: renamed from: d */
    public final int f45879d;

    /* JADX INFO: renamed from: e */
    public final int f45880e;

    public oft(int i, int i2, int i3) {
        this.f45878c = i;
        this.f45879d = i2;
        this.f45880e = i3;
    }

    /* JADX INFO: renamed from: a */
    public static oft m18470a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(str);
        if (matcher.matches()) {
            return new oft(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
        }
        Log.w("Version", "Failed to parse version from: ".concat(str));
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oft)) {
            return false;
        }
        oft oftVar = (oft) obj;
        return this.f45878c == oftVar.f45878c && this.f45879d == oftVar.f45879d && this.f45880e == oftVar.f45880e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f45878c), Integer.valueOf(this.f45879d), Integer.valueOf(this.f45880e));
    }

    public final String toString() {
        return String.format("%d.%d.%d", Integer.valueOf(this.f45878c), Integer.valueOf(this.f45879d), Integer.valueOf(this.f45880e));
    }
}
