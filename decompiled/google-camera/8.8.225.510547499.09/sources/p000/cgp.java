package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgp implements cgv {

    /* JADX INFO: renamed from: a */
    public final elx f5651a;

    /* JADX INFO: renamed from: b */
    public final idb f5652b;

    /* JADX INFO: renamed from: c */
    private final jwn f5653c;

    /* JADX INFO: renamed from: d */
    private final cgu f5654d;

    /* JADX INFO: renamed from: e */
    private final FrameLayout f5655e;

    /* JADX INFO: renamed from: f */
    private final iuj f5656f;

    public cgp(Resources resources, jwn jwnVar, Context context, elx elxVar, iuj iujVar, cgu cguVar) {
        this.f5653c = jwnVar;
        this.f5651a = elxVar;
        this.f5654d = cguVar;
        this.f5652b = jpd.m13426g(false, 3000, null, null, resources.getString(C0100R.string.thermal_boba_disabled_chip), context, false, -1, 12);
        this.f5655e = (FrameLayout) ((Activity) context).findViewById(C0100R.id.module_layout);
        this.f5656f = iujVar;
    }

    @Override // p000.cgv
    /* JADX INFO: renamed from: a */
    public final kba mo3651a() {
        nbz nbzVar = nch.f41987a;
        jvb jvbVar = new jvb();
        jvbVar.m13537d(this.f5654d.mo3639b(this.f5655e, this.f5656f));
        jvbVar.m13537d(jwj.m13624c(this.f5653c).mo3830a(new cbx(this, 12), not.INSTANCE));
        return jvbVar;
    }
}
