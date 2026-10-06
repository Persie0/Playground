package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fep implements kba {

    /* JADX INFO: renamed from: a */
    public final Object f21542a;

    /* JADX INFO: renamed from: b */
    final Object f21543b;

    /* JADX INFO: renamed from: c */
    final Object f21544c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f21545d;

    public fep(AmbientModeSupport.AmbientController ambientController, jwf jwfVar, Collection collection, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f21545d = i;
        this.f21544c = ambientController;
        this.f21542a = jwfVar;
        this.f21543b = collection;
    }

    public fep(cjd cjdVar, jvb jvbVar, int i) {
        this.f21545d = i;
        this.f21544c = cjdVar;
        this.f21542a = jvbVar;
        this.f21543b = new AtomicBoolean(false);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f21545d) {
            case 0:
                nba it = ((mws) this.f21543b).iterator();
                while (it.hasNext()) {
                    ((kba) it.next()).close();
                }
                break;
            default:
                if (!((AtomicBoolean) this.f21543b).getAndSet(true)) {
                    ((cjd) this.f21544c).execute(new cei(this, 12, null));
                    ((cjd) this.f21544c).close();
                    break;
                }
                break;
        }
    }
}
