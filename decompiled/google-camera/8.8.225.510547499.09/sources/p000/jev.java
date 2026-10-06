package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jev {

    /* JADX INFO: renamed from: a */
    private final int f33842a;

    /* JADX INFO: renamed from: b */
    private final jdt f33843b;

    /* JADX INFO: renamed from: c */
    private final String f33844c;

    /* JADX INFO: renamed from: d */
    private final ihk f33845d;

    public jev(ihk ihkVar, jdt jdtVar, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33845d = ihkVar;
        this.f33843b = jdtVar;
        this.f33844c = str;
        this.f33842a = Arrays.hashCode(new Object[]{ihkVar, jdtVar, str});
    }

    /* JADX INFO: renamed from: a */
    public final String m12997a() {
        return (String) this.f33845d.f30966a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jev)) {
            return false;
        }
        jev jevVar = (jev) obj;
        return jib.m13209n(this.f33845d, jevVar.f33845d) && jib.m13209n(this.f33843b, jevVar.f33843b) && jib.m13209n(this.f33844c, jevVar.f33844c);
    }

    public final int hashCode() {
        return this.f33842a;
    }
}
