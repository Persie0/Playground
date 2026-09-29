package com.lingq.core.playlists;

import p000.ld7;
import p000.lda;
import p000.nd7;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.playlists.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1831g implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1832h f22290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nd7 f22291c;

    public /* synthetic */ C1831g(C1832h c1832h, nd7 nd7Var, int i) {
        this.f22289a = i;
        this.f22290b = c1832h;
        this.f22291c = nd7Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f22289a;
        xfa xfaVar = xfa.f68157a;
        nd7 nd7Var = this.f22291c;
        C1832h c1832h = this.f22290b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                String str2 = ((ld7) nd7Var).f49504a;
                str2.getClass();
                wfb.m23926u(lda.m16103C(c1832h), c1832h.f22301k, null, new PlaylistsSelectorViewModel$updatePlaylistName$1(c1832h, str, str2, null), 2);
                break;
            default:
                str.getClass();
                String str3 = ((ld7) nd7Var).f49504a;
                str3.getClass();
                wfb.m23926u(lda.m16103C(c1832h), c1832h.f22301k, null, new PlaylistsSelectorViewModel$updatePlaylistName$1(c1832h, str, str3, null), 2);
                break;
        }
        return xfaVar;
    }
}
