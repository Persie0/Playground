package p000;

import androidx.media3.p004ui.AspectRatioFrameLayout;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.Objects;

/* JADX INFO: renamed from: wv */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3736wv implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67326a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f67327b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67328c;

    public RunnableC3736wv(C1043b c1043b, boolean z) {
        this.f67327b = z;
        Objects.requireNonNull(c1043b);
        this.f67328c = c1043b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f67326a) {
            case 0:
                this.f67327b = false;
                int i = AspectRatioFrameLayout.f6515d;
                break;
            default:
                C1043b c1043b = (C1043b) this.f67328c;
                kjc kjcVar = (kjc) c1043b.f60774a;
                boolean zM15282f = kjcVar.m15282f();
                boolean z2 = kjcVar.f47426T != null && kjcVar.f47426T.booleanValue();
                boolean z3 = this.f67327b;
                kjcVar.f47426T = Boolean.valueOf(z3);
                if (z2 == z3) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17924b(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (kjcVar.m15282f() != zM15282f) {
                    boolean zM15282f2 = kjcVar.m15282f();
                    if (kjcVar.f47426T != null && kjcVar.f47426T.booleanValue()) {
                        z = true;
                    }
                    if (zM15282f2 != z) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68085k.m17925c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zM15282f));
                    }
                } else {
                    xcc xccVar3 = kjcVar.f47438f;
                    kjc.m15280l(xccVar3);
                    xccVar3.f68085k.m17925c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zM15282f));
                }
                c1043b.m5865V();
                break;
        }
    }

    public RunnableC3736wv(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f67328c = aspectRatioFrameLayout;
    }
}
