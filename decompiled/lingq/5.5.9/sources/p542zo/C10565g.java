package p542zo;

import java.io.IOException;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C10565g extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52714e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52715f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f52716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10565g(String str, C10562d c10562d, int i10, int i11) {
        super(str, true);
        this.f52714e = c10562d;
        this.f52715f = i10;
        this.f52716g = i11;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        int i10 = this.f52715f;
        int i11 = this.f52716g;
        C10562d c10562d = this.f52714e;
        c10562d.getClass();
        try {
            c10562d.f52675T.m19583r(i10, i11, true);
            return -1L;
        } catch (IOException e10) {
            c10562d.m19544b(e10);
            return -1L;
        }
    }
}
