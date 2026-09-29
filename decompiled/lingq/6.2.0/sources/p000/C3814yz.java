package p000;

import android.media.AudioTrack;

/* JADX INFO: renamed from: yz */
/* JADX INFO: loaded from: classes2.dex */
public final class C3814yz extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gv5 f70660a;

    public C3814yz(gv5 gv5Var) {
        this.f70660a = gv5Var;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((C3851zz) this.f70660a.f41394d).f72410j.m23271d(-1, new hm2(3));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((C3851zz) this.f70660a.f41394d).f72410j.m23271d(-1, new hm2(4));
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ((C3851zz) this.f70660a.f41394d).f72410j.m23271d(-1, new hm2(3));
    }
}
