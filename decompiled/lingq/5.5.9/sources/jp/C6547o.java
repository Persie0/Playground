package jp;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: jp.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C6547o extends AbstractC6549q<Iterable<Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6549q f37242a;

    public C6547o(AbstractC6549q abstractC6549q) {
        this.f37242a = abstractC6549q;
    }

    @Override // jp.AbstractC6549q
    /* JADX INFO: renamed from: a */
    public final void mo13139a(C6551s c6551s, Iterable<Object> iterable) throws IOException {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f37242a.mo13139a(c6551s, it.next());
        }
    }
}
