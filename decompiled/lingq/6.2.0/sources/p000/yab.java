package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;

/* JADX INFO: loaded from: classes3.dex */
public final class yab {

    /* JADX INFO: renamed from: a */
    public final r3b f69583a;

    /* JADX INFO: renamed from: b */
    public final Handler f69584b = new Handler(Looper.getMainLooper());

    public yab(r3b r3bVar) {
        this.f69583a = r3bVar;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f69584b.post(new xab(this, 1));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        PlayerConstants$PlayerError playerConstants$PlayerError;
        str.getClass();
        if (str.equalsIgnoreCase("2")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.INVALID_PARAMETER_IN_REQUEST;
        } else if (str.equalsIgnoreCase("5")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.HTML_5_PLAYER;
        } else if (str.equalsIgnoreCase("100")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.VIDEO_NOT_FOUND;
        } else if (str.equalsIgnoreCase("101") || str.equalsIgnoreCase("150")) {
            playerConstants$PlayerError = PlayerConstants$PlayerError.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
        } else {
            playerConstants$PlayerError = str.equalsIgnoreCase("153") ? PlayerConstants$PlayerError.REQUEST_MISSING_HTTP_REFERER : PlayerConstants$PlayerError.UNKNOWN;
        }
        this.f69584b.post(new mv5(23, this, playerConstants$PlayerError));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality;
        str.getClass();
        if (str.equalsIgnoreCase("small")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.SMALL;
        } else if (str.equalsIgnoreCase("medium")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.MEDIUM;
        } else if (str.equalsIgnoreCase("large")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.LARGE;
        } else if (str.equalsIgnoreCase("hd720")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HD720;
        } else if (str.equalsIgnoreCase("hd1080")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HD1080;
        } else if (str.equalsIgnoreCase("highres")) {
            playerConstants$PlaybackQuality = PlayerConstants$PlaybackQuality.HIGH_RES;
        } else {
            playerConstants$PlaybackQuality = str.equalsIgnoreCase("default") ? PlayerConstants$PlaybackQuality.DEFAULT : PlayerConstants$PlaybackQuality.UNKNOWN;
        }
        this.f69584b.post(new mv5(20, this, playerConstants$PlaybackQuality));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        PlayerConstants$PlaybackRate playerConstants$PlaybackRate;
        str.getClass();
        if (str.equalsIgnoreCase("0.25")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_25;
        } else if (str.equalsIgnoreCase("0.5")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_5;
        } else if (str.equalsIgnoreCase("0.75")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_0_75;
        } else if (str.equalsIgnoreCase("1")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1;
        } else if (str.equalsIgnoreCase("1.25")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1_25;
        } else if (str.equalsIgnoreCase("1.5")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1_5;
        } else if (str.equalsIgnoreCase("1.75")) {
            playerConstants$PlaybackRate = PlayerConstants$PlaybackRate.RATE_1_75;
        } else {
            playerConstants$PlaybackRate = str.equalsIgnoreCase("2") ? PlayerConstants$PlaybackRate.RATE_2 : PlayerConstants$PlaybackRate.UNKNOWN;
        }
        this.f69584b.post(new mv5(21, this, playerConstants$PlaybackRate));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f69584b.post(new xab(this, 2));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        PlayerConstants$PlayerState playerConstants$PlayerState;
        str.getClass();
        if (str.equalsIgnoreCase("UNSTARTED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.UNSTARTED;
        } else if (str.equalsIgnoreCase("ENDED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.ENDED;
        } else if (str.equalsIgnoreCase("PLAYING")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.PLAYING;
        } else if (str.equalsIgnoreCase("PAUSED")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.PAUSED;
        } else if (str.equalsIgnoreCase("BUFFERING")) {
            playerConstants$PlayerState = PlayerConstants$PlayerState.BUFFERING;
        } else {
            playerConstants$PlayerState = str.equalsIgnoreCase("CUED") ? PlayerConstants$PlayerState.VIDEO_CUED : PlayerConstants$PlayerState.UNKNOWN;
        }
        this.f69584b.post(new mv5(24, this, playerConstants$PlayerState));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        str.getClass();
        try {
            this.f69584b.post(new wab(this, Float.parseFloat(str), 0));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        str.getClass();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f69584b.post(new wab(this, Float.parseFloat(str), 1));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(String str) {
        str.getClass();
        return this.f69584b.post(new mv5(22, this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        str.getClass();
        try {
            this.f69584b.post(new xab(this, Float.parseFloat(str)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f69584b.post(new xab(this, 0));
    }
}
