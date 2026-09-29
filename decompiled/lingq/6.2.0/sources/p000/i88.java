package p000;

import com.lingq.core.network.adapters.NetworkResponse;
import java.util.ArrayList;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class i88<T> {

    /* JADX INFO: renamed from: a */
    public final j88 f43689a;

    /* JADX INFO: renamed from: b */
    public final Object f43690b;

    /* JADX INFO: renamed from: c */
    public final m88 f43691c;

    public i88(j88 j88Var, Object obj, l88 l88Var) {
        this.f43689a = j88Var;
        this.f43690b = obj;
        this.f43691c = l88Var;
    }

    /* JADX INFO: renamed from: a */
    public static i88 m13718a(l88 l88Var) {
        l88 l88Var2 = m88.f50759b;
        ArrayList arrayList = new ArrayList(20);
        ar6 ar6Var = new ar6(l88Var.f49306c, l88Var.f49307d);
        Protocol protocol = Protocol.HTTP_1_1;
        protocol.getClass();
        w41 w41Var = new w41(13);
        w41Var.m23718L("http://localhost/");
        return m13719b(l88Var, new j88(new co7(w41Var), protocol, "Response.error()", 400, null, new qr3((String[]) arrayList.toArray(new String[0])), ar6Var, null, null, null, null, 0L, 0L, null, b9a.f8185x));
    }

    /* JADX INFO: renamed from: b */
    public static i88 m13719b(l88 l88Var, j88 j88Var) {
        if (!j88Var.f45200L) {
            return new i88(j88Var, null, l88Var);
        }
        C3386nv.m17626m("rawResponse should not be successful response");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static i88 m13720c(NetworkResponse networkResponse) {
        l88 l88Var = m88.f50759b;
        ArrayList arrayList = new ArrayList(20);
        Protocol protocol = Protocol.HTTP_1_1;
        protocol.getClass();
        w41 w41Var = new w41(13);
        w41Var.m23718L("http://localhost/");
        return m13721d(networkResponse, new j88(new co7(w41Var), protocol, "OK", 200, null, new qr3((String[]) arrayList.toArray(new String[0])), l88Var, null, null, null, null, 0L, 0L, null, b9a.f8185x));
    }

    /* JADX INFO: renamed from: d */
    public static i88 m13721d(Object obj, j88 j88Var) {
        if (j88Var.f45200L) {
            return new i88(j88Var, obj, null);
        }
        C3386nv.m17626m("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.f43689a.toString();
    }
}
