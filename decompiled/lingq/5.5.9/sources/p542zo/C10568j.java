package p542zo;

import dm.C5207g;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;
import p349qo.C8656b;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10568j extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52725f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f52726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10568j(String str, C10562d c10562d, int i10, List list, boolean z10) {
        super(str, true);
        this.f52724e = c10562d;
        this.f52725f = i10;
        this.f52726g = list;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        C8656b c8656b = this.f52724e.f52689l;
        List list = this.f52726g;
        c8656b.getClass();
        C5207g.m11111f(list, "responseHeaders");
        try {
            this.f52724e.f52675T.m19584w(this.f52725f, ErrorCode.CANCEL);
            synchronized (this.f52724e) {
                try {
                    this.f52724e.f52677V.remove(Integer.valueOf(this.f52725f));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
