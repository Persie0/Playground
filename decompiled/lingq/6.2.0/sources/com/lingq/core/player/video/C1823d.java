package com.lingq.core.player.video;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import p000.AbstractC2949e2;
import p000.ac7;
import p000.bbb;
import p000.gm5;
import p000.t66;
import p000.ui3;
import p000.vab;
import p000.vi3;

/* JADX INFO: renamed from: com.lingq.core.player.video.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1823d extends AbstractC2949e2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ui3 f22199a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f22200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f22201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f22202d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f22203e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f22204f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f22205g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1821b f22206h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ vi3 f22207i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ vi3 f22208j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ vi3 f22209k;

    public C1823d(ui3 ui3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, t66 t66Var5, t66 t66Var6, C1821b c1821b, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3) {
        this.f22199a = ui3Var;
        this.f22200b = t66Var;
        this.f22201c = t66Var2;
        this.f22202d = t66Var3;
        this.f22203e = t66Var4;
        this.f22204f = t66Var5;
        this.f22205g = t66Var6;
        this.f22206h = c1821b;
        this.f22207i = vi3Var;
        this.f22208j = vi3Var2;
        this.f22209k = vi3Var3;
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: a */
    public final void mo8497a(vab vabVar, float f) {
        vabVar.getClass();
        ac7 ac7Var = (ac7) this.f22205g.getValue();
        C1821b c1821b = this.f22206h;
        c1821b.getClass();
        ac7Var.getClass();
        if (c1821b.f22194b) {
            int i = AbstractC1820a.f22192b[c1821b.f22193a.ordinal()];
            if (i == 1) {
                PlayerConstants$PlaybackRate playerConstants$PlaybackRateM8505d = AbstractC1824e.m8505d(ac7Var);
                PlayerConstants$PlaybackRate playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1;
                if (playerConstants$PlaybackRateM8505d == playerConstants$PlaybackRate) {
                    c1821b.m8496a();
                } else {
                    c1821b.f22195c = playerConstants$PlaybackRateM8505d;
                    c1821b.f22193a = YoutubePlaybackRateRestoration$State.WAITING_FOR_BASELINE_RATE;
                    c1821b.f22196d = 0;
                    ((bbb) vabVar).m3597h(playerConstants$PlaybackRate);
                }
            } else if (i == 2) {
                int i2 = c1821b.f22196d + 1;
                c1821b.f22196d = i2;
                if (i2 >= 2) {
                    PlayerConstants$PlaybackRate playerConstants$PlaybackRate2 = c1821b.f22195c;
                    if (playerConstants$PlaybackRate2 == null) {
                        c1821b.m8496a();
                    } else {
                        c1821b.f22193a = YoutubePlaybackRateRestoration$State.WAITING_FOR_TARGET_RATE;
                        c1821b.f22196d = 0;
                        ((bbb) vabVar).m3597h(playerConstants$PlaybackRate2);
                    }
                }
            } else if (i == 3) {
                int i3 = c1821b.f22196d + 1;
                c1821b.f22196d = i3;
                if (i3 >= 2) {
                    c1821b.m8496a();
                }
            } else if (i != 4) {
                gm5.m12750e();
                return;
            }
        }
        this.f22208j.invoke(Float.valueOf(f));
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: c */
    public final void mo8498c(vab vabVar, PlayerConstants$PlaybackRate playerConstants$PlaybackRate) {
        vabVar.getClass();
        playerConstants$PlaybackRate.getClass();
        ac7 ac7Var = (ac7) this.f22205g.getValue();
        C1821b c1821b = this.f22206h;
        c1821b.getClass();
        ac7Var.getClass();
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate2 = c1821b.f22195c;
        if (playerConstants$PlaybackRate2 == null) {
            return;
        }
        if (playerConstants$PlaybackRate2 != AbstractC1824e.m8505d(ac7Var)) {
            c1821b.m8496a();
            return;
        }
        int i = AbstractC1820a.f22192b[c1821b.f22193a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (playerConstants$PlaybackRate == PlayerConstants$PlaybackRate.RATE_1) {
                    c1821b.f22193a = YoutubePlaybackRateRestoration$State.WAITING_FOR_TARGET_RATE;
                    c1821b.f22196d = 0;
                    ((bbb) vabVar).m3597h(playerConstants$PlaybackRate2);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    return;
                }
                gm5.m12750e();
            } else if (playerConstants$PlaybackRate == playerConstants$PlaybackRate2) {
                c1821b.m8496a();
            }
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: d */
    public final void mo8499d(vab vabVar) {
        vabVar.getClass();
        this.f22200b.setValue(vabVar);
        boolean zBooleanValue = ((Boolean) this.f22201c.getValue()).booleanValue();
        t66 t66Var = this.f22203e;
        t66 t66Var2 = this.f22202d;
        if (zBooleanValue) {
            ((bbb) vabVar).m3593d((String) t66Var2.getValue(), ((Number) t66Var.getValue()).floatValue());
        } else {
            ((bbb) vabVar).m3591b((String) t66Var2.getValue(), ((Number) t66Var.getValue()).floatValue());
        }
        this.f22204f.setValue(null);
        ((bbb) vabVar).m3597h(AbstractC1824e.m8505d((ac7) this.f22205g.getValue()));
        this.f22199a.mo0a();
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: e */
    public final void mo8500e(vab vabVar, PlayerConstants$PlayerState playerConstants$PlayerState) {
        vabVar.getClass();
        playerConstants$PlayerState.getClass();
        C1821b c1821b = this.f22206h;
        c1821b.getClass();
        int i = AbstractC1820a.f22191a[playerConstants$PlayerState.ordinal()];
        if (i == 1) {
            c1821b.f22194b = true;
        } else if (i == 2) {
            c1821b.f22194b = false;
            YoutubePlaybackRateRestoration$State youtubePlaybackRateRestoration$State = c1821b.f22193a;
            if (youtubePlaybackRateRestoration$State == YoutubePlaybackRateRestoration$State.WAITING_FOR_BASELINE_RATE || youtubePlaybackRateRestoration$State == YoutubePlaybackRateRestoration$State.WAITING_FOR_TARGET_RATE) {
                c1821b.f22193a = YoutubePlaybackRateRestoration$State.RESTORE_ON_PLAYBACK;
                c1821b.f22195c = null;
            }
        } else if (i == 3 || i == 4 || i == 5) {
            c1821b.m8496a();
        }
        this.f22207i.invoke(playerConstants$PlayerState);
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: f */
    public final void mo8501f(vab vabVar, float f) {
        vabVar.getClass();
        this.f22209k.invoke(Float.valueOf(f));
    }
}
