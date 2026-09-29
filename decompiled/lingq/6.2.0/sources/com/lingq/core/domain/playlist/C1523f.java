package com.lingq.core.domain.playlist;

import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3577sk;
import p000.c83;
import p000.im3;
import p000.xd7;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1523f {

    /* JADX INFO: renamed from: a */
    public final xd7 f19947a;

    public C1523f(xd7 xd7Var, int i) {
        xd7Var.getClass();
        switch (i) {
            case 1:
                this.f19947a = xd7Var;
                break;
            default:
                this.f19947a = xd7Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m8199a(int i, String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new im3(this, i, 0, str), new GetLessonPlaylistsUseCase$invoke$2(this, str, i, null)));
    }

    /* JADX INFO: renamed from: b */
    public c83 m8200b(String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new C3577sk(23, this, str), new GetPlaylistsUseCase$invoke$2(this, str, null)));
    }
}
