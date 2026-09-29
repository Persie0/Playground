package retrofit2;

import p000.i88;
import p000.j88;

/* JADX INFO: loaded from: classes.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f59169a;

    /* JADX INFO: renamed from: b */
    public final transient i88 f59170b;

    public HttpException(i88 i88Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        j88 j88Var = i88Var.f43689a;
        int i = j88Var.f45204d;
        sb.append(i);
        sb.append(" ");
        sb.append(j88Var.f45203c);
        super(sb.toString());
        this.f59169a = i;
        this.f59170b = i88Var;
    }
}
