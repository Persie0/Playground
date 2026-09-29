package p000;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.lingq.core.player.service.PlayerService;

/* JADX INFO: loaded from: classes2.dex */
public final class cc7 extends dv5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ PlayerService f9891e;

    public cc7(PlayerService playerService) {
        this.f9891e = playerService;
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: a */
    public final void mo4527a() {
        PlayerService playerService = this.f9891e;
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8442C(ea7.f36938f);
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: b */
    public final void mo4528b() {
        PlayerService playerService = this.f9891e;
        try {
            playerService.unregisterReceiver(playerService.f21979L);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8447J();
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: c */
    public final void mo4529c() {
        Integer numValueOf;
        PlayerService playerService = this.f9891e;
        bc7 bc7Var = PlayerService.Companion;
        playerService.f21975H = new Object();
        playerService.f21997l = false;
        AudioManager audioManager = playerService.f21980M;
        if (audioManager != null) {
            AudioFocusRequest audioFocusRequest = playerService.f21976I;
            if (audioFocusRequest == null) {
                fa4.m11636J("focusRequest");
                throw null;
            }
            numValueOf = Integer.valueOf(audioManager.requestAudioFocus(audioFocusRequest));
        } else {
            numValueOf = null;
        }
        Object obj = playerService.f21975H;
        if (obj == null) {
            fa4.m11636J("focusLock");
            throw null;
        }
        synchronized (obj) {
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                }
            }
            if (numValueOf == null || numValueOf.intValue() != 1) {
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    playerService.f21997l = true;
                }
            }
        }
        PlayerService playerService2 = this.f9891e;
        playerService2.f21983P.removeCallbacks(playerService2.f21984Q);
        this.f9891e.m8471c().m8458W();
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: d */
    public final void mo4530d() {
        PlayerService playerService = this.f9891e;
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8442C(ea7.f36936d);
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: e */
    public final void mo4531e(long j) {
        PlayerService playerService = this.f9891e;
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8452Q((int) j);
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: f */
    public final void mo4532f() {
        PlayerService playerService = this.f9891e;
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8455T();
    }

    @Override // p000.dv5
    /* JADX INFO: renamed from: g */
    public final void mo4533g() {
        PlayerService playerService = this.f9891e;
        playerService.f21983P.removeCallbacks(playerService.f21984Q);
        playerService.m8471c().m8456U();
    }
}
