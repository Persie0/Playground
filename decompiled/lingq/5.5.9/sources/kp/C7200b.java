package kp;

import com.squareup.moshi.AbstractC4949k;
import dm.C5207g;
import java.io.IOException;
import java.util.regex.Pattern;
import jp.InterfaceC6538f;
import okio.ByteString;
import p124fp.C5608e;
import so.AbstractC9105w;
import so.C9098p;
import so.C9103u;
import tk.C9309m;

/* JADX INFO: renamed from: kp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7200b<T> implements InterfaceC6538f<T, AbstractC9105w> {

    /* JADX INFO: renamed from: b */
    public static final C9098p f40526b;

    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<T> f40527a;

    static {
        Pattern pattern = C9098p.f47473d;
        f40526b = C9098p.a.m17339a("application/json; charset=UTF-8");
    }

    public C7200b(AbstractC4949k<T> abstractC4949k) {
        this.f40527a = abstractC4949k;
    }

    @Override // jp.InterfaceC6538f
    /* JADX INFO: renamed from: a */
    public final AbstractC9105w mo13122a(Object obj) throws IOException {
        C5608e c5608e = new C5608e();
        this.f40527a.mo9386f(new C9309m(c5608e), obj);
        ByteString byteStringM11976y0 = c5608e.m11976y0();
        C5207g.m11111f(byteStringM11976y0, "content");
        return new C9103u(f40526b, byteStringM11976y0);
    }
}
