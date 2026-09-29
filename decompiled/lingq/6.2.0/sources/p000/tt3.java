package p000;

import android.app.Service;
import com.lingq.core.domain.playlist.C1521d;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayerService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tt3 extends Service implements nk3 {

    /* JADX INFO: renamed from: a */
    public volatile ly8 f62841a;

    /* JADX INFO: renamed from: b */
    public final Object f62842b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f62843c = false;

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f62841a == null) {
            synchronized (this.f62842b) {
                try {
                    if (this.f62841a == null) {
                        this.f62841a = new ly8(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f62841a.mo6995b();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.f62843c) {
            this.f62843c = true;
            PlayerService playerService = (PlayerService) this;
            ky1 ky1Var = ((gy1) ((gc7) mo6995b())).f41518a;
            playerService.f21989d = (C1808b) ky1Var.f48667Z1.get();
            playerService.f21990e = (cma) ky1Var.f48596D.get();
            playerService.f21991f = new C1521d((xd7) ky1Var.f48629N.get(), (vma) ky1Var.f48623L.get());
            playerService.f21992g = ky1Var.m15729c();
            playerService.f21993h = (un1) ky1Var.f48676c.get();
            playerService.f21994i = yn1.m25211b();
            playerService.f21995j = (dc7) ky1Var.f48655V1.get();
        }
        super.onCreate();
    }
}
