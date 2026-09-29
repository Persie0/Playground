package p542zo;

import java.io.IOException;
import p442vo.AbstractC9765a;

/* JADX INFO: renamed from: zo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C10571m extends AbstractC9765a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C10562d f52733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10571m(String str, C10562d c10562d) {
        super(str, true);
        this.f52733e = c10562d;
    }

    @Override // p442vo.AbstractC9765a
    /* JADX INFO: renamed from: a */
    public final long mo18071a() {
        C10562d c10562d = this.f52733e;
        c10562d.getClass();
        try {
            c10562d.f52675T.m19583r(2, 0, false);
        } catch (IOException e10) {
            c10562d.m19544b(e10);
        }
        return -1L;
    }
}
