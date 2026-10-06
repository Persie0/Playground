package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmc extends jme {

    /* JADX INFO: renamed from: a */
    private static boolean f34350a = false;

    /* JADX INFO: renamed from: b */
    private final Context f34351b;

    public jmc(Context context) {
        this.f34351b = context;
    }

    /* JADX INFO: renamed from: e */
    private static final void m13351e(Context context) {
        synchronized (jmc.class) {
            if (f34350a) {
                return;
            }
            f34350a = true;
            try {
                if (mkv.m16518Z(pbn.m19303c(context), jmb.f34346a)) {
                    new liv(context);
                    throw null;
                }
            } catch (IllegalStateException | UnsatisfiedLinkError e) {
                if (Log.isLoggable("brella.CrntHttpUrlFctry", 5)) {
                    Log.w("brella.CrntHttpUrlFctry", "failed to load Cronet engine", e);
                }
            }
        }
    }

    @Override // p000.jmf
    /* JADX INFO: renamed from: b */
    public final jjc mo13352b() throws RemoteException {
        try {
            m13351e(this.f34351b);
            throw new RemoteException("failed to initialize CronetEngine");
        } catch (IOException e) {
            throw new RemoteException("unexpected IOException: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // p000.jmf
    /* JADX INFO: renamed from: c */
    public final void mo13353c() {
        synchronized (jmc.class) {
        }
    }

    @Override // p000.jmf
    /* JADX INFO: renamed from: d */
    public final void mo13354d() {
        m13351e(this.f34351b);
    }
}
