package p000;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public final class p97 extends AbstractC2949e2 {

    /* JADX INFO: renamed from: a */
    public boolean f55805a;

    /* JADX INFO: renamed from: b */
    public boolean f55806b;

    /* JADX INFO: renamed from: c */
    public PlayerConstants$PlayerError f55807c;

    /* JADX INFO: renamed from: d */
    public String f55808d;

    /* JADX INFO: renamed from: e */
    public float f55809e;

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: a */
    public final void mo8497a(vab vabVar, float f) {
        vabVar.getClass();
        this.f55809e = f;
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: b */
    public final void mo10794b(vab vabVar, PlayerConstants$PlayerError playerConstants$PlayerError) {
        vabVar.getClass();
        playerConstants$PlayerError.getClass();
        if (playerConstants$PlayerError == PlayerConstants$PlayerError.HTML_5_PLAYER) {
            this.f55807c = playerConstants$PlayerError;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: e */
    public final void mo8500e(vab vabVar, PlayerConstants$PlayerState playerConstants$PlayerState) {
        vabVar.getClass();
        playerConstants$PlayerState.getClass();
        int i = o97.f54084a[playerConstants$PlayerState.ordinal()];
        if (i == 1 || i == 2) {
            this.f55806b = false;
        } else {
            if (i != 3) {
                return;
            }
            this.f55806b = true;
        }
    }

    @Override // p000.AbstractC2949e2
    /* JADX INFO: renamed from: g */
    public final void mo10795g(vab vabVar, String str) {
        vabVar.getClass();
        this.f55808d = str;
    }
}
