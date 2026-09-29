package p304ok;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.activity.RunnableC0191j;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import dm.C5207g;
import java.util.Collection;
import mo.C7661i;
import p080e.RunnableC5286r;
import p128g2.RunnableC5682t;
import p213k4.RunnableC6590j;
import pk.InterfaceC8403d;
import sk.C9064e;

/* JADX INFO: renamed from: ok.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8069e {

    /* JADX INFO: renamed from: a */
    public final a f43770a;

    /* JADX INFO: renamed from: b */
    public final Handler f43771b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ok.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15936a();

        InterfaceC8066b getInstance();

        Collection<InterfaceC8403d> getListeners();
    }

    public C8069e(C9064e c9064e) {
        this.f43770a = c9064e;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f43771b.post(new RunnableC0191j(20, this));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        PlayerConstants$PlayerError playerConstants$PlayerError;
        C5207g.m11111f(str, "error");
        if (C7661i.m15249O2(str, "2")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.INVALID_PARAMETER_IN_REQUEST;
        } else if (C7661i.m15249O2(str, "5")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.HTML_5_PLAYER;
        } else if (C7661i.m15249O2(str, "100")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.VIDEO_NOT_FOUND;
        } else {
            playerConstants$PlayerError = (C7661i.m15249O2(str, "101") || C7661i.m15249O2(str, "150")) ? PlayerConstants$PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER : PlayerConstants$PlayerError.UNKNOWN;
        }
        this.f43771b.post(new RunnableC6590j(this, 18, playerConstants$PlayerError));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality;
        C5207g.m11111f(str, "quality");
        if (C7661i.m15249O2(str, "small")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.SMALL;
        } else if (C7661i.m15249O2(str, "medium")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.MEDIUM;
        } else if (C7661i.m15249O2(str, "large")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.LARGE;
        } else if (C7661i.m15249O2(str, "hd720")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HD720;
        } else if (C7661i.m15249O2(str, "hd1080")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HD1080;
        } else if (C7661i.m15249O2(str, "highres")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HIGH_RES;
        } else {
            playerConstants$PlaybackQuality = C7661i.m15249O2(str, "default") ? PlayerConstants$PlaybackQuality.DEFAULT : PlayerConstants$PlaybackQuality.UNKNOWN;
        }
        this.f43771b.post(new RunnableC5286r(this, 22, playerConstants$PlaybackQuality));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate;
        C5207g.m11111f(str, "rate");
        if (C7661i.m15249O2(str, "0.25")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_25;
        } else if (C7661i.m15249O2(str, "0.5")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_5;
        } else if (C7661i.m15249O2(str, "1")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1;
        } else if (C7661i.m15249O2(str, "1.5")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1_5;
        } else {
            playerConstants$PlaybackRate = C7661i.m15249O2(str, "2") ? PlayerConstants$PlaybackRate.RATE_2 : PlayerConstants$PlaybackRate.UNKNOWN;
        }
        this.f43771b.post(new RunnableC5682t(this, 19, playerConstants$PlaybackRate));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f43771b.post(new RunnableC8068d(this, 0));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        PlayerConstants$PlayerState playerConstants$PlayerState;
        C5207g.m11111f(str, "state");
        if (C7661i.m15249O2(str, "UNSTARTED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.UNSTARTED;
        } else if (C7661i.m15249O2(str, "ENDED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.ENDED;
        } else if (C7661i.m15249O2(str, "PLAYING")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.PLAYING;
        } else if (C7661i.m15249O2(str, "PAUSED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.PAUSED;
        } else if (C7661i.m15249O2(str, "BUFFERING")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.BUFFERING;
        } else {
            playerConstants$PlayerState = C7661i.m15249O2(str, "CUED") ? PlayerConstants$PlayerState.VIDEO_CUED : PlayerConstants$PlayerState.UNKNOWN;
        }
        this.f43771b.post(new RunnableC5286r(this, 24, playerConstants$PlayerState));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        C5207g.m11111f(str, "seconds");
        try {
            this.f43771b.post(new RunnableC8067c(this, Float.parseFloat(str), 1));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        C5207g.m11111f(str, "seconds");
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f43771b.post(new RunnableC8067c(this, Float.parseFloat(str), 2));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(String str) {
        C5207g.m11111f(str, "videoId");
        return this.f43771b.post(new RunnableC5286r(this, 23, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        C5207g.m11111f(str, "fraction");
        try {
            this.f43771b.post(new RunnableC8067c(this, Float.parseFloat(str), 0));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f43771b.post(new RunnableC8068d(this, 1));
    }
}
