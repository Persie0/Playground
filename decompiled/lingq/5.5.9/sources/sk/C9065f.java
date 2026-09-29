package sk;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import p150h9.RunnableC5918i0;
import p304ok.C8065a;
import p304ok.InterfaceC8066b;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: sk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9065f implements InterfaceC8066b {

    /* JADX INFO: renamed from: a */
    public final WebView f47347a;

    /* JADX INFO: renamed from: b */
    public final Handler f47348b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f47349c;

    public C9065f(WebView webView) {
        C5207g.m11111f(webView, "webView");
        this.f47347a = webView;
        this.f47348b = new Handler(Looper.getMainLooper());
        this.f47349c = new LinkedHashSet();
    }

    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: a */
    public final boolean mo15930a(InterfaceC8403d interfaceC8403d) {
        C5207g.m11111f(interfaceC8403d, "listener");
        return this.f47349c.remove(interfaceC8403d);
    }

    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: b */
    public final void mo15931b(float f3, String str) {
        C5207g.m11111f(str, "videoId");
        m17277g(this.f47347a, "cueVideo", str, Float.valueOf(f3));
    }

    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: c */
    public final void mo15932c(float f3) {
        m17277g(this.f47347a, "seekTo", Float.valueOf(f3));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: d */
    public final void mo15933d(PlayerConstants$PlaybackRate playerConstants$PlaybackRate) {
        float f3;
        C5207g.m11111f(playerConstants$PlaybackRate, "playbackRate");
        Object[] objArr = new Object[1];
        switch (C8065a.f43764a[playerConstants$PlaybackRate.ordinal()]) {
            case 1:
            case 4:
                f3 = 1.0f;
                break;
            case 2:
                f3 = 0.25f;
                break;
            case 3:
                f3 = 0.5f;
                break;
            case 5:
                f3 = 1.5f;
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                f3 = 2.0f;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        objArr[0] = Float.valueOf(f3);
        m17277g(this.f47347a, "setPlaybackRate", objArr);
    }

    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: e */
    public final boolean mo15934e(InterfaceC8403d interfaceC8403d) {
        C5207g.m11111f(interfaceC8403d, "listener");
        return this.f47349c.add(interfaceC8403d);
    }

    @Override // p304ok.InterfaceC8066b
    /* JADX INFO: renamed from: f */
    public final void mo15935f(float f3, String str) {
        C5207g.m11111f(str, "videoId");
        m17277g(this.f47347a, "loadVideo", str, Float.valueOf(f3));
    }

    /* JADX INFO: renamed from: g */
    public final void m17277g(WebView webView, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(obj instanceof String ? "'" + obj + '\'' : obj.toString());
        }
        this.f47348b.post(new RunnableC5918i0(5, webView, str, arrayList));
    }

    @Override // p304ok.InterfaceC8066b
    public final void pause() {
        m17277g(this.f47347a, "pauseVideo", new Object[0]);
    }

    @Override // p304ok.InterfaceC8066b
    public final void play() {
        m17277g(this.f47347a, "playVideo", new Object[0]);
    }
}
