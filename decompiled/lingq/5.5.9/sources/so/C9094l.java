package so;

import dm.C5207g;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p124fp.C5608e;
import p124fp.InterfaceC5609f;
import to.C9347b;

/* JADX INFO: renamed from: so.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C9094l extends AbstractC9105w {

    /* JADX INFO: renamed from: c */
    public static final C9098p f47446c;

    /* JADX INFO: renamed from: a */
    public final List<String> f47447a;

    /* JADX INFO: renamed from: b */
    public final List<String> f47448b;

    /* JADX INFO: renamed from: so.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Charset f47449a = null;

        /* JADX INFO: renamed from: b */
        public final ArrayList f47450b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final ArrayList f47451c = new ArrayList();
    }

    static {
        Pattern pattern = C9098p.f47473d;
        f47446c = C9098p.a.m17339a("application/x-www-form-urlencoded");
    }

    public C9094l(ArrayList arrayList, ArrayList arrayList2) {
        C5207g.m11111f(arrayList, "encodedNames");
        C5207g.m11111f(arrayList2, "encodedValues");
        this.f47447a = C9347b.m17717x(arrayList);
        this.f47448b = C9347b.m17717x(arrayList2);
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: a */
    public final long mo13145a() {
        return m17304d(null, true);
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: b */
    public final C9098p mo13146b() {
        return f47446c;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: c */
    public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
        m17304d(interfaceC5609f, false);
    }

    /* JADX INFO: renamed from: d */
    public final long m17304d(InterfaceC5609f interfaceC5609f, boolean z10) throws EOFException {
        C5608e c5608eMo11956f;
        if (z10) {
            c5608eMo11956f = new C5608e();
        } else {
            C5207g.m11108c(interfaceC5609f);
            c5608eMo11956f = interfaceC5609f.mo11956f();
        }
        List<String> list = this.f47447a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                c5608eMo11956f.m11954d1(38);
            }
            c5608eMo11956f.m11969t1(list.get(i10));
            c5608eMo11956f.m11954d1(61);
            c5608eMo11956f.m11969t1(this.f47448b.get(i10));
            i10 = i11;
        }
        if (!z10) {
            return 0L;
        }
        long j10 = c5608eMo11956f.f34435b;
        c5608eMo11956f.m11951b();
        return j10;
    }
}
