package p542zo;

import dm.C5207g;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import p349qo.C8656b;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10569k extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52727e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52728f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f52729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10569k(String str, C10562d c10562d, int i10, List list) {
        super(str, true);
        this.f52727e = c10562d;
        this.f52728f = i10;
        this.f52729g = list;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        C8656b c8656b = this.f52727e.f52689l;
        List list = this.f52729g;
        c8656b.getClass();
        C5207g.m11111f(list, "requestHeaders");
        try {
            this.f52727e.f52675T.m19584w(this.f52728f, ErrorCode.CANCEL);
            synchronized (this.f52727e) {
                try {
                    this.f52727e.f52677V.remove(Integer.valueOf(this.f52728f));
                } finally {
                }
            }
        } catch (IOException unused) {
        }
        return -1L;
    }
}
