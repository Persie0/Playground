package jp;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: jp.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C6548p extends AbstractC6549q<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6549q f37243a;

    public C6548p(AbstractC6549q abstractC6549q) {
        this.f37243a = abstractC6549q;
    }

    @Override // jp.AbstractC6549q
    /* JADX INFO: renamed from: a */
    public final void mo13139a(C6551s c6551s, Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f37243a.mo13139a(c6551s, Array.get(obj, i10));
        }
    }
}
