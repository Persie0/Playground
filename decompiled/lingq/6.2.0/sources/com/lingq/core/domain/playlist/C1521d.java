package com.lingq.core.domain.playlist;

import com.lingq.core.datastore.C1371d;
import kotlinx.coroutines.flow.C3228h;
import p000.vma;
import p000.xd7;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1521d {

    /* JADX INFO: renamed from: a */
    public final xd7 f19942a;

    /* JADX INFO: renamed from: b */
    public final vma f19943b;

    public C1521d(xd7 xd7Var, vma vmaVar) {
        xd7Var.getClass();
        vmaVar.getClass();
        this.f19942a = xd7Var;
        this.f19943b = vmaVar;
    }

    /* JADX INFO: renamed from: a */
    public final C3228h m8197a(String str) {
        str.getClass();
        return new C3228h(xd7.m24465a(this.f19942a, str), ((C1371d) this.f19943b).f18582s, new GetActivePlaylistUseCase$invoke$1(str, null));
    }
}
