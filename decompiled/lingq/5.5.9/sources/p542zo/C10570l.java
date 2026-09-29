package p542zo;

import dm.C5207g;
import okhttp3.internal.http2.ErrorCode;
import p349qo.C8656b;
import p442vo.AbstractC9765a;
import sl.C9072e;

/* JADX INFO: renamed from: zo.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C10570l extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52730e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52731f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ErrorCode f52732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10570l(String str, C10562d c10562d, int i10, ErrorCode errorCode) {
        super(str, true);
        this.f52730e = c10562d;
        this.f52731f = i10;
        this.f52732g = errorCode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        C8656b c8656b = this.f52730e.f52689l;
        ErrorCode errorCode = this.f52732g;
        c8656b.getClass();
        C5207g.m11111f(errorCode, "errorCode");
        synchronized (this.f52730e) {
            this.f52730e.f52677V.remove(Integer.valueOf(this.f52731f));
            C9072e c9072e = C9072e.f47360a;
        }
        return -1L;
    }
}
