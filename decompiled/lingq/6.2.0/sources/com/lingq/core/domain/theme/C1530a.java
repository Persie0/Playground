package com.lingq.core.domain.theme;

import com.lingq.core.datastore.C1368a;
import kotlinx.coroutines.flow.C3228h;
import p000.aq9;
import p000.si7;

/* JADX INFO: renamed from: com.lingq.core.domain.theme.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1530a {

    /* JADX INFO: renamed from: a */
    public final si7 f19995a;

    /* JADX INFO: renamed from: b */
    public final aq9 f19996b;

    public C1530a(si7 si7Var, aq9 aq9Var) {
        si7Var.getClass();
        aq9Var.getClass();
        this.f19995a = si7Var;
        this.f19996b = aq9Var;
    }

    /* JADX INFO: renamed from: a */
    public final C3228h m8209a() {
        C1368a c1368a = (C1368a) this.f19995a;
        return new C3228h(c1368a.f18463y0, c1368a.f18323A0, new GetHighlightColorForThemeUseCase$invoke$1(this, null));
    }
}
