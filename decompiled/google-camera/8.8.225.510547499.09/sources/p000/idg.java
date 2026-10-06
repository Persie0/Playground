package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idg {

    /* JADX INFO: renamed from: a */
    public final jwn f30433a;

    /* JADX INFO: renamed from: b */
    public final had f30434b;

    /* JADX INFO: renamed from: c */
    public final elx f30435c;

    /* JADX INFO: renamed from: d */
    public final Context f30436d;

    /* JADX INFO: renamed from: e */
    public final Executor f30437e;

    /* JADX INFO: renamed from: f */
    public final String f30438f;

    /* JADX INFO: renamed from: g */
    public final String f30439g;

    /* JADX INFO: renamed from: h */
    public idb f30440h;

    /* JADX INFO: renamed from: i */
    public idb f30441i;

    /* JADX INFO: renamed from: j */
    public idb f30442j;

    /* JADX INFO: renamed from: k */
    public idb f30443k;

    /* JADX INFO: renamed from: l */
    public boolean f30444l = false;

    /* JADX INFO: renamed from: m */
    public final cdu f30445m;

    public idg(Context context, jwn jwnVar, had hadVar, elx elxVar, Executor executor, cdu cduVar) {
        this.f30433a = jwnVar;
        this.f30434b = hadVar;
        this.f30435c = elxVar;
        this.f30436d = context;
        this.f30445m = cduVar;
        this.f30438f = context.getResources().getString(C0100R.string.face_retouching_on_light);
        this.f30439g = context.getResources().getString(C0100R.string.face_retouching_on_strong);
        this.f30437e = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m11113a() {
        idb idbVar = this.f30443k;
        if (idbVar != null) {
            this.f30435c.mo7485g(idbVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11114b() {
        this.f30435c.mo7485g(this.f30441i);
    }

    /* JADX INFO: renamed from: c */
    public final void m11115c() {
        this.f30435c.mo7482d(this.f30441i);
    }
}
