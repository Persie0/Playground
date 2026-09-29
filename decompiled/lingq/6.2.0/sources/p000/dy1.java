package p000;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes.dex */
public final class dy1 implements ro7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36421a;

    @Override // p000.so7
    public final Object get() {
        switch (this.f36421a) {
            case 0:
                return AbstractC3786y7.m24965a();
            case 1:
                dh1 dh1VarM10376e = dh1.m10376e();
                pvc.m19519o(dh1VarM10376e);
                return dh1VarM10376e;
            case 2:
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                pvc.m19519o(remoteConfigManager);
                return remoteConfigManager;
            default:
                SessionManager sessionManager = SessionManager.getInstance();
                pvc.m19519o(sessionManager);
                return sessionManager;
        }
    }

    public /* synthetic */ dy1(ny8 ny8Var, int i) {
        this.f36421a = i;
    }
}
