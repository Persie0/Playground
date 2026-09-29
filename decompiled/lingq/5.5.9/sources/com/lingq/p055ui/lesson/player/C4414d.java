package com.lingq.p055ui.lesson.player;

import com.lingq.player.C3296a;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import pk.InterfaceC8402c;

/* JADX INFO: renamed from: com.lingq.ui.lesson.player.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4414d implements InterfaceC8402c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3296a f28893a;

    public C4414d(C3296a c3296a) {
        this.f28893a = c3296a;
    }

    @Override // pk.InterfaceC8402c
    /* JADX INFO: renamed from: a */
    public final void mo5247a(InterfaceC8066b interfaceC8066b) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        C3296a c3296a = this.f28893a;
        if (c3296a.f17747i) {
            interfaceC8066b.mo15932c(c3296a.f17744f / 1000.0f);
        }
        interfaceC8066b.pause();
    }
}
