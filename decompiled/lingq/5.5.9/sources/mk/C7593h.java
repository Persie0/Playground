package mk;

import com.lingq.commons.services.LingQFirebaseMessagingService;
import com.lingq.player.PlayerService;
import p342qh.C8628c;

/* JADX INFO: renamed from: mk.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7593h extends AbstractC7595h1 {

    /* JADX INFO: renamed from: a */
    public final C7633z0 f41860a;

    public C7593h(C7633z0 c7633z0) {
        this.f41860a = c7633z0;
    }

    @Override // mh.InterfaceC7560b
    /* JADX INFO: renamed from: a */
    public final void mo15080a(LingQFirebaseMessagingService lingQFirebaseMessagingService) {
        lingQFirebaseMessagingService.f16709d = this.f41860a.f41965c0.get();
    }

    @Override // sh.InterfaceC9016l
    /* JADX INFO: renamed from: b */
    public final void mo15137b(PlayerService playerService) {
        C7633z0 c7633z0 = this.f41860a;
        playerService.f17699d = c7633z0.f41981h1.get();
        c7633z0.f41988k.get();
        playerService.f17700e = c7633z0.f41955Y0.get();
        playerService.f17701f = C8628c.m16854a();
        playerService.f17702g = c7633z0.f41957Z0.get();
    }
}
