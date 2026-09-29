package p000;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class cv5 extends MediaSession.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dv5 f34607a;

    public cv5(dv5 dv5Var) {
        this.f34607a = dv5Var;
    }

    /* JADX INFO: renamed from: a */
    public final fv5 m9910a() {
        fv5 fv5Var;
        dv5 dv5Var;
        synchronized (this.f34607a.f36267a) {
            fv5Var = (fv5) this.f34607a.f36269c.get();
        }
        if (fv5Var == null) {
            return null;
        }
        dv5 dv5Var2 = this.f34607a;
        synchronized (fv5Var.f39751c) {
            dv5Var = fv5Var.f39755g;
        }
        if (dv5Var2 == dv5Var) {
            return fv5Var;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        xx3 xx3Var;
        npa npaVar;
        fv5 fv5VarM9910a = m9910a();
        if (fv5VarM9910a == null) {
            return;
        }
        gv5.m12871x(bundle);
        try {
            if (!str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    return;
                }
                if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    return;
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    return;
                } else {
                    str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
                    return;
                }
            }
            Bundle bundle2 = new Bundle();
            MediaSessionCompat$Token mediaSessionCompat$Token = fv5VarM9910a.f39750b;
            synchronized (mediaSessionCompat$Token.f958a) {
                xx3Var = mediaSessionCompat$Token.f960c;
            }
            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", xx3Var == null ? null : xx3Var.asBinder());
            synchronized (mediaSessionCompat$Token.f958a) {
                npaVar = mediaSessionCompat$Token.f961d;
            }
            if (npaVar != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("a", new ParcelImpl(npaVar));
                bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
            }
            resultReceiver.send(0, bundle2);
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
        try {
            if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                gv5.m12871x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                return;
            }
            if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                return;
            }
            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                gv5.m12871x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                return;
            }
            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                gv5.m12871x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                return;
            }
            if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                gv5.m12871x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                return;
            }
            if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                return;
            }
            if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                return;
            }
            if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                return;
            }
            if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                gv5.m12871x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4527a();
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        return m9910a() != null && super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4528b();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4529c();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        m9910a();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        if (m9910a() == null) {
            return;
        }
        gv5.m12871x(bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4530d();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4531e(j);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        m9910a();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        if (m9910a() == null || rating == null) {
            return;
        }
        int iM22859b = uq7.m22859b(rating);
        RatingCompat ratingCompat = null;
        if (!uq7.m22862e(rating)) {
            switch (iM22859b) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ratingCompat = new RatingCompat(iM22859b, -1.0f);
                    break;
            }
        } else {
            switch (iM22859b) {
                case 1:
                    ratingCompat = new RatingCompat(1, uq7.m22861d(rating) ? 1.0f : 0.0f);
                    break;
                case 2:
                    ratingCompat = new RatingCompat(2, uq7.m22863f(rating) ? 1.0f : 0.0f);
                    break;
                case 3:
                case 4:
                case 5:
                    float fM22860c = uq7.m22860c(rating);
                    if (iM22859b == 3) {
                        f = 3.0f;
                    } else if (iM22859b == 4) {
                        f = 4.0f;
                    } else if (iM22859b != 5) {
                        Log.e("Rating", "Invalid rating style (" + iM22859b + ") for a star rating");
                    } else {
                        f = 5.0f;
                    }
                    if (fM22860c >= 0.0f && fM22860c <= f) {
                        ratingCompat = new RatingCompat(iM22859b, fM22860c);
                    } else {
                        Log.e("Rating", "Trying to set out of range star-based rating");
                    }
                    break;
                case 6:
                    float fM22858a = uq7.m22858a(rating);
                    if (fM22858a >= 0.0f && fM22858a <= 100.0f) {
                        ratingCompat = new RatingCompat(6, fM22858a);
                    } else {
                        Log.e("Rating", "Invalid percentage-based rating value");
                    }
                    break;
                default:
                    return;
            }
        }
        ratingCompat.getClass();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4532f();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        if (m9910a() == null) {
            return;
        }
        this.f34607a.mo4533g();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        m9910a();
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        m9910a();
    }
}
