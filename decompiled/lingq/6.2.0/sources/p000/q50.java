package p000;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q50 {

    /* JADX INFO: renamed from: a */
    public final String f57279a;

    /* JADX INFO: renamed from: b */
    public final byte[] f57280b;

    /* JADX INFO: renamed from: c */
    public final Priority f57281c;

    public q50(String str, byte[] bArr, Priority priority) {
        this.f57279a = str;
        this.f57280b = bArr;
        this.f57281c = priority;
    }

    /* JADX INFO: renamed from: a */
    public static C3309ls m19658a() {
        C3309ls c3309ls = new C3309ls(9, false);
        Priority priority = Priority.DEFAULT;
        if (priority != null) {
            c3309ls.f50066d = priority;
            return c3309ls;
        }
        C3386nv.m17635v("Null priority");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final q50 m19659b(Priority priority) {
        C3309ls c3309lsM19658a = m19658a();
        c3309lsM19658a.m16496P(this.f57279a);
        if (priority == null) {
            C3386nv.m17635v("Null priority");
            return null;
        }
        c3309lsM19658a.f50066d = priority;
        c3309lsM19658a.f50065c = this.f57280b;
        return c3309lsM19658a.m16506f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q50) {
            q50 q50Var = (q50) obj;
            if (this.f57279a.equals(q50Var.f57279a)) {
                if (Arrays.equals(this.f57280b, q50Var instanceof q50 ? q50Var.f57280b : q50Var.f57280b) && this.f57281c.equals(q50Var.f57281c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57281c.hashCode() ^ ((((this.f57279a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f57280b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f57280b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f57279a);
        sb.append(", ");
        sb.append(this.f57281c);
        sb.append(", ");
        return AbstractC3393o1.m17738m(sb, strEncodeToString, ")");
    }
}
