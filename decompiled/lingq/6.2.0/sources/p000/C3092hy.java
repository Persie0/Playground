package p000;

import android.media.AudioManager;
import com.lingq.core.player.service.PlayerService;

/* JADX INFO: renamed from: hy */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3092hy implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43137a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43138b;

    public /* synthetic */ C3092hy(Object obj, int i) {
        this.f43137a = i;
        this.f43138b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        C3476px c3476px;
        int i2 = this.f43137a;
        Object obj = this.f43138b;
        switch (i2) {
            case 0:
                C3164jy c3164jy = (C3164jy) obj;
                c3164jy.getClass();
                if (i == -3 || i == -2) {
                    if (i != -2 && ((c3476px = c3164jy.f46374d) == null || c3476px.f56935a != 1)) {
                        c3164jy.m14743c(4);
                        return;
                    } else {
                        c3164jy.m14742b(0);
                        c3164jy.m14743c(3);
                        return;
                    }
                }
                if (i == -1) {
                    c3164jy.m14742b(-1);
                    c3164jy.m14741a();
                    c3164jy.m14743c(1);
                    return;
                } else if (i != 1) {
                    hn1.m13364n("Unknown focus change type: ", i, "AudioFocusManager");
                    return;
                } else {
                    c3164jy.m14743c(2);
                    c3164jy.m14742b(1);
                    return;
                }
            default:
                PlayerService playerService = (PlayerService) obj;
                if (i == -3) {
                    playerService.f21986S = -3;
                    jw2 jw2Var = playerService.m8471c().f21960m;
                    if (jw2Var == null) {
                        fa4.m11636J("player");
                        throw null;
                    }
                    jw2Var.m14705K();
                    playerService.f21985R = jw2Var.f46274U;
                    playerService.m8471c().m8453R(0.1f);
                    return;
                }
                if (i == -2) {
                    playerService.f21986S = -2;
                    Object obj2 = playerService.f21975H;
                    if (obj2 == null) {
                        fa4.m11636J("focusLock");
                        throw null;
                    }
                    synchronized (obj2) {
                        playerService.f21996k = playerService.m8471c().m8444G();
                        playerService.f21997l = false;
                    }
                    playerService.m8471c().m8447J();
                    return;
                }
                if (i == -1) {
                    playerService.f21986S = -1;
                    if (playerService.f21997l || playerService.f21996k) {
                        Object obj3 = playerService.f21975H;
                        if (obj3 == null) {
                            fa4.m11636J("focusLock");
                            throw null;
                        }
                        synchronized (obj3) {
                            playerService.f21997l = false;
                            playerService.f21996k = false;
                        }
                    }
                    playerService.m8471c().m8447J();
                    return;
                }
                if (i != 1) {
                    bc7 bc7Var = PlayerService.Companion;
                    return;
                }
                if (playerService.f21986S == -3) {
                    playerService.m8471c().m8453R(playerService.f21985R);
                }
                playerService.f21986S = 1;
                if (playerService.f21997l || playerService.f21996k) {
                    Object obj4 = playerService.f21975H;
                    if (obj4 == null) {
                        fa4.m11636J("focusLock");
                        throw null;
                    }
                    synchronized (obj4) {
                        playerService.f21997l = false;
                        playerService.f21996k = false;
                    }
                    playerService.m8471c().m8458W();
                    return;
                }
                return;
        }
    }
}
