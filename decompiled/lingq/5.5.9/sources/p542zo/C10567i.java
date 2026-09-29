package p542zo;

import dm.C5207g;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import p124fp.C5608e;
import p349qo.C8656b;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10567i extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52720e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52721f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5608e f52722g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f52723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10567i(String str, C10562d c10562d, int i10, C5608e c5608e, int i11, boolean z10) {
        super(str, true);
        this.f52720e = c10562d;
        this.f52721f = i10;
        this.f52722g = c5608e;
        this.f52723h = i11;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        try {
            C8656b c8656b = this.f52720e.f52689l;
            C5608e c5608e = this.f52722g;
            int i10 = this.f52723h;
            c8656b.getClass();
            C5207g.m11111f(c5608e, "source");
            c5608e.skip(i10);
            this.f52720e.f52675T.m19584w(this.f52721f, ErrorCode.CANCEL);
            synchronized (this.f52720e) {
                this.f52720e.f52677V.remove(Integer.valueOf(this.f52721f));
            }
        } catch (IOException unused) {
        }
        return -1L;
    }
}
