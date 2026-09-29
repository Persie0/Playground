package mh;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.lingq.commons.services.LingQFirebaseMessagingService;
import dagger.hilt.android.internal.managers.C5120g;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: mh.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC7559a extends FirebaseMessagingService implements InterfaceC8405b {

    /* JADX INFO: renamed from: a */
    public volatile C5120g f41671a;

    /* JADX INFO: renamed from: b */
    public final Object f41672b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f41673c = false;

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f41671a == null) {
            synchronized (this.f41672b) {
                if (this.f41671a == null) {
                    this.f41671a = new C5120g(this);
                }
            }
        }
        return this.f41671a.mo469d();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.f41673c) {
            this.f41673c = true;
            ((InterfaceC7560b) mo469d()).mo15080a((LingQFirebaseMessagingService) this);
        }
        super.onCreate();
    }
}
