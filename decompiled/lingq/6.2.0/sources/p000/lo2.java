package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;

/* JADX INFO: loaded from: classes.dex */
public final class lo2 {

    /* JADX INFO: renamed from: a */
    public final Context f49921a;

    /* JADX INFO: renamed from: b */
    public final int f49922b;

    /* JADX INFO: renamed from: c */
    public long f49923c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f49924d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f49925e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f49926f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f49927g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f49928h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f49929i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f49930j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f49931k;

    public lo2(Context context, int i) {
        this.f49921a = context;
        this.f49922b = i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16408f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16409g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC0818bo.m3991b(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m16410a(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f49921a;
        EdgeEffect edgeEffectM3990a = i >= 31 ? AbstractC0818bo.m3990a(context) : new ao3(context);
        edgeEffectM3990a.setColor(this.f49922b);
        if (!n84.m17279a(this.f49923c, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.f49923c;
            if (orientation == orientation2) {
                edgeEffectM3990a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM3990a;
            }
            edgeEffectM3990a.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM3990a;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m16411b() {
        EdgeEffect edgeEffect = this.f49925e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM16410a = m16410a(Orientation.Vertical);
        this.f49925e = edgeEffectM16410a;
        return edgeEffectM16410a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m16412c() {
        EdgeEffect edgeEffect = this.f49926f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM16410a = m16410a(Orientation.Horizontal);
        this.f49926f = edgeEffectM16410a;
        return edgeEffectM16410a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m16413d() {
        EdgeEffect edgeEffect = this.f49927g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM16410a = m16410a(Orientation.Horizontal);
        this.f49927g = edgeEffectM16410a;
        return edgeEffectM16410a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m16414e() {
        EdgeEffect edgeEffect = this.f49924d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM16410a = m16410a(Orientation.Vertical);
        this.f49924d = edgeEffectM16410a;
        return edgeEffectM16410a;
    }
}
