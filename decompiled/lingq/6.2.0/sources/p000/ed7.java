package p000;

import com.lingq.core.database.dao.C1322j;
import com.lingq.core.database.entity.PlaylistEntity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ed7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1322j f37067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PlaylistEntity f37068c;

    public /* synthetic */ ed7(C1322j c1322j, PlaylistEntity playlistEntity, int i) {
        this.f37066a = i;
        this.f37067b = c1322j;
        this.f37068c = playlistEntity;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f37066a;
        xfa xfaVar = xfa.f68157a;
        PlaylistEntity playlistEntity = this.f37068c;
        C1322j c1322j = this.f37067b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1322j.f17046L.m20400B(bk8Var, playlistEntity);
                return xfaVar;
            case 1:
                bk8Var.getClass();
                return Long.valueOf(c1322j.f17048N.m3842X(bk8Var, playlistEntity));
            default:
                bk8Var.getClass();
                c1322j.f17047M.m21729K(bk8Var, playlistEntity);
                return xfaVar;
        }
    }
}
