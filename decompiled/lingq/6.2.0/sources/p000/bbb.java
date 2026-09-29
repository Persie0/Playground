package p000;

import android.os.Handler;
import android.os.Looper;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class bbb implements vab {

    /* JADX INFO: renamed from: a */
    public final r3b f8302a;

    /* JADX INFO: renamed from: b */
    public final Handler f8303b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final Object f8304c = new Object();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f8305d = new LinkedHashSet();

    public bbb(r3b r3bVar, abb abbVar) {
        this.f8302a = r3bVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3590a(AbstractC2949e2 abstractC2949e2) {
        boolean zAdd;
        abstractC2949e2.getClass();
        synchronized (this.f8304c) {
            zAdd = this.f8305d.add(abstractC2949e2);
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public final void m3591b(String str, float f) {
        str.getClass();
        m3592c(this.f8302a, "cueVideo", str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: c */
    public final void m3592c(r3b r3bVar, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? ux5.m22992o(new StringBuilder("'"), (String) obj, '\'') : obj.toString());
        }
        this.f8303b.post(new RunnableC3725wk(r3bVar, str, arrayList, 19));
    }

    /* JADX INFO: renamed from: d */
    public final void m3593d(String str, float f) {
        str.getClass();
        m3592c(this.f8302a, "loadVideo", str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: e */
    public final void m3594e() {
        m3592c(this.f8302a, "pauseVideo", new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3595f(AbstractC2949e2 abstractC2949e2) {
        boolean zRemove;
        abstractC2949e2.getClass();
        synchronized (this.f8304c) {
            zRemove = this.f8305d.remove(abstractC2949e2);
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: g */
    public final void m3596g(float f) {
        m3592c(this.f8302a, "seekTo", Float.valueOf(f));
    }

    /* JADX INFO: renamed from: h */
    public final void m3597h(PlayerConstants$PlaybackRate playerConstants$PlaybackRate) {
        playerConstants$PlaybackRate.getClass();
        float f = 1.0f;
        switch (sb7.f60622a[playerConstants$PlaybackRate.ordinal()]) {
            case 1:
            case 5:
                break;
            case 2:
                f = 0.25f;
                break;
            case 3:
                f = 0.5f;
                break;
            case 4:
                f = 0.75f;
                break;
            case 6:
                f = 1.25f;
                break;
            case 7:
                f = 1.5f;
                break;
            case 8:
                f = 1.75f;
                break;
            case 9:
                f = 2.0f;
                break;
            default:
                gm5.m12750e();
                return;
        }
        m3592c(this.f8302a, "setPlaybackRate", Float.valueOf(f));
    }
}
