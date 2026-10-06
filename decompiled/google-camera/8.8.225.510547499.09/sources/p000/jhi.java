package p000;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhi {

    /* JADX INFO: renamed from: a */
    public static final Uri f34059a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: b */
    public final String f34060b;

    /* JADX INFO: renamed from: c */
    public final String f34061c;

    /* JADX INFO: renamed from: d */
    public final int f34062d;

    /* JADX INFO: renamed from: e */
    public final boolean f34063e;

    /* JADX INFO: renamed from: f */
    private final ComponentName f34064f;

    public jhi(String str, String str2, boolean z) {
        jib.m13203h(str);
        this.f34060b = str;
        jib.m13203h(str2);
        this.f34061c = str2;
        this.f34064f = null;
        this.f34062d = 4225;
        this.f34063e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhi)) {
            return false;
        }
        jhi jhiVar = (jhi) obj;
        if (jib.m13209n(this.f34060b, jhiVar.f34060b) && jib.m13209n(this.f34061c, jhiVar.f34061c)) {
            ComponentName componentName = jhiVar.f34064f;
            if (jib.m13209n(null, null)) {
                int i = jhiVar.f34062d;
                if (this.f34063e == jhiVar.f34063e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34060b, this.f34061c, null, 4225, Boolean.valueOf(this.f34063e)});
    }

    public final String toString() {
        return this.f34060b;
    }
}
