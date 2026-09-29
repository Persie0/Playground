package ua;

import com.google.android.exoplayer2.C2416m;
import p479xa.C10134c0;
import p482xd.InterfaceC10173e;

/* JADX INFO: renamed from: ua.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9495d implements InterfaceC10173e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9496e f48796a;

    public /* synthetic */ C9495d(C9496e c9496e) {
        this.f48796a = c9496e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba A[ADDED_TO_REGION, PHI: r3
      0x00ba: PHI (r3v1 boolean) = (r3v0 boolean), (r3v0 boolean), (r3v0 boolean), (r3v3 boolean), (r3v0 boolean), (r3v0 boolean), (r3v0 boolean) binds: [B:5:0x0013, B:7:0x0018, B:9:0x001f, B:60:0x00b9, B:42:0x0078, B:44:0x007e, B:46:0x0084] A[DONT_GENERATE, DONT_INLINE], REMOVE] */
    @Override // p482xd.InterfaceC10173e
    public final boolean apply(Object obj) {
        boolean z10;
        boolean z11;
        C9496e.e eVar;
        C9496e.e eVar2;
        C9496e c9496e = this.f48796a;
        C2416m c2416m = (C2416m) obj;
        synchronized (c9496e.f48799c) {
            z10 = true;
            if (c9496e.f48803g.f48849F0 && !c9496e.f48802f) {
                if (c2416m.f12463T > 2) {
                    String str = c2416m.f12484l;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/ac3":
                            case "audio/ac4":
                            case "audio/eac3":
                                z11 = true;
                                break;
                            default:
                                z11 = false;
                                break;
                        }
                    } else {
                        z11 = false;
                    }
                    if ((!z11 || (C10134c0.f51354a >= 32 && (eVar2 = c9496e.f48804h) != null && eVar2.f48882b)) && (C10134c0.f51354a < 32 || (eVar = c9496e.f48804h) == null || !eVar.f48882b || !eVar.f48881a.isAvailable() || !c9496e.f48804h.f48881a.isEnabled() || !c9496e.f48804h.m17959a(c2416m, c9496e.f48805i))) {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }
}
