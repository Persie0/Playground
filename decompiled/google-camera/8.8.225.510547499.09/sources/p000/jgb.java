package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgb {

    /* JADX INFO: renamed from: a */
    public jgc f33938a;

    /* JADX INFO: renamed from: b */
    public jgc f33939b;

    /* JADX INFO: renamed from: c */
    public jfx f33940c;

    /* JADX INFO: renamed from: d */
    public jcw[] f33941d;

    /* JADX INFO: renamed from: e */
    public int f33942e;

    /* JADX INFO: renamed from: f */
    private final Runnable f33943f = hde.f27311m;

    /* JADX INFO: renamed from: a */
    public final djm m13127a() {
        jib.m13197b(this.f33938a != null, "Must set register function");
        jib.m13197b(this.f33939b != null, "Must set unregister function");
        jib.m13197b(this.f33940c != null, voNZjxiJou.iwZfKqjSyL);
        jib.m13206k(this.f33940c.f33922b, "Key must not be null");
        return new djm(new kyl(this, this.f33940c, this.f33941d, this.f33942e), new AmbientMode.AmbientController(this), this.f33943f, null, null, null, null);
    }
}
