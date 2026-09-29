package p000;

import com.google.firebase.perf.p010v1.NetworkRequestMetric$NetworkClientErrorReason;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk6 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f51438a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* JADX INFO: renamed from: a */
    public static Long m16866a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C3723wi.m23970d().m23971a("The content-length value is not a valid number");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16867b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* JADX INFO: renamed from: c */
    public static void m16868c(lk6 lk6Var) {
        if (!((kk6) lk6Var.f49770d.f64019b).m15320S()) {
            ik6 ik6Var = lk6Var.f49770d;
            NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason = NetworkRequestMetric$NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
            ik6Var.m22767h();
            kk6.m15301t((kk6) ik6Var.f64019b, networkRequestMetric$NetworkClientErrorReason);
        }
        lk6Var.m16316b();
    }
}
