package p542zo;

import dm.C5207g;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import p034bp.C1640h;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C10564f extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52712e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C10574p f52713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10564f(String str, C10562d c10562d, C10574p c10574p) {
        super(str, true);
        this.f52712e = c10562d;
        this.f52713f = c10574p;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        try {
            this.f52712e.f52679b.mo15971b(this.f52713f);
        } catch (IOException e10) {
            C1640h c1640h = C1640h.f9199a;
            C1640h c1640h2 = C1640h.f9199a;
            String strM11116k = C5207g.m11116k(this.f52712e.f52681d, "Http2Connection.Listener failure for ");
            c1640h2.getClass();
            C1640h.m5333i(4, strM11116k, e10);
            try {
                this.f52713f.m19566c(ErrorCode.PROTOCOL_ERROR, e10);
            } catch (IOException unused) {
            }
        }
        return -1L;
    }
}
