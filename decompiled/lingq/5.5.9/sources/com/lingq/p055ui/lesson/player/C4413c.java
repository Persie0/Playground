package com.lingq.p055ui.lesson.player;

import com.lingq.player.C3296a;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import pk.InterfaceC8402c;

/* JADX INFO: renamed from: com.lingq.ui.lesson.player.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4413c implements InterfaceC8402c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3296a f28892a;

    public C4413c(C3296a c3296a) {
        this.f28892a = c3296a;
    }

    @Override // pk.InterfaceC8402c
    /* JADX INFO: renamed from: a */
    public final void mo5247a(InterfaceC8066b interfaceC8066b) {
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate;
        int i10;
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        C3296a c3296a = this.f28892a;
        if (c3296a.f17747i && (i10 = c3296a.f17744f) <= c3296a.f17743e) {
            interfaceC8066b.mo15932c(i10 / 1000.0f);
        }
        interfaceC8066b.play();
        float f3 = c3296a.f17742d.f47230a;
        boolean z10 = true;
        if (f3 == 0.25f) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_25;
        } else {
            if (f3 == 0.5f) {
                playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_5;
            } else {
                if (f3 == 1.0f) {
                    playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1;
                } else {
                    if (f3 == 1.5f) {
                        playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1_5;
                    } else {
                        if (f3 != 2.0f) {
                            z10 = false;
                        }
                        playerConstants$PlaybackRate = z10 ? PlayerConstants$PlaybackRate.RATE_2 : PlayerConstants$PlaybackRate.RATE_1;
                    }
                }
            }
        }
        interfaceC8066b.mo15933d(playerConstants$PlaybackRate);
    }
}
