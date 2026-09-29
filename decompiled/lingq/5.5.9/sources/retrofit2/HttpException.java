package retrofit2;

import java.util.Objects;
import jp.C6553u;
import so.C9106x;

/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient C6553u<?> f46513a;

    public HttpException(C6553u<?> c6553u) {
        Objects.requireNonNull(c6553u, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        C9106x c9106x = c6553u.f37338a;
        sb2.append(c9106x.f47566d);
        sb2.append(" ");
        sb2.append(c9106x.f47565c);
        super(sb2.toString());
        C9106x c9106x2 = c6553u.f37338a;
        int i10 = c9106x2.f47566d;
        String str = c9106x2.f47565c;
        this.f46513a = c6553u;
    }
}
