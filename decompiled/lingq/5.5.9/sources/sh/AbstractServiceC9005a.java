package sh;

import android.app.Service;
import com.lingq.player.PlayerService;
import dagger.hilt.android.internal.managers.C5120g;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: sh.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC9005a extends Service implements InterfaceC8405b {

    /* JADX INFO: renamed from: a */
    public volatile C5120g f47213a;

    /* JADX INFO: renamed from: b */
    public final Object f47214b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f47215c = false;

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f47213a == null) {
            synchronized (this.f47214b) {
                if (this.f47213a == null) {
                    this.f47213a = new C5120g(this);
                }
            }
        }
        return this.f47213a.mo469d();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.f47215c) {
            this.f47215c = true;
            ((InterfaceC9016l) mo469d()).mo15137b((PlayerService) this);
        }
        super.onCreate();
    }
}
