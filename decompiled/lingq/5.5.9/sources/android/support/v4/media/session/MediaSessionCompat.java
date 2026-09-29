package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p025b4.C1307a;
import p232l2.C7229h;
import p448w4.InterfaceC9812c;
import p523z3.C10438a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {

    /* JADX INFO: renamed from: d */
    public static int f367d;

    /* JADX INFO: renamed from: a */
    public final C0152d f368a;

    /* JADX INFO: renamed from: b */
    public final MediaControllerCompat f369b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<InterfaceC0155g> f370c = new ArrayList<>();

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0145a();

        /* JADX INFO: renamed from: a */
        public final MediaDescriptionCompat f371a;

        /* JADX INFO: renamed from: b */
        public final long f372b;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0145a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        public static class C0146b {
            /* JADX INFO: renamed from: a */
            public static MediaSession.QueueItem m638a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            /* JADX INFO: renamed from: b */
            public static MediaDescription m639b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            /* JADX INFO: renamed from: c */
            public static long m640c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(Parcel parcel) {
            this.f371a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f372b = parcel.readLong();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f371a = mediaDescriptionCompat;
            this.f372b = j10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f371a + ", Id=" + this.f372b + " }";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f371a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f372b);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0147a();

        /* JADX INFO: renamed from: a */
        public final ResultReceiver f373a;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0147a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f373a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            this.f373a.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0148a();

        /* JADX INFO: renamed from: b */
        public final Object f375b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0163b f376c;

        /* JADX INFO: renamed from: a */
        public final Object f374a = new Object();

        /* JADX INFO: renamed from: d */
        public InterfaceC9812c f377d = null;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0148a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj, C0151c.a aVar) {
            this.f375b = obj;
            this.f376c = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f375b;
            if (obj2 == null) {
                return token.f375b == null;
            }
            Object obj3 = token.f375b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f375b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f375b, i10);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class AbstractC0149a {

        /* JADX INFO: renamed from: c */
        public boolean f380c;

        /* JADX INFO: renamed from: e */
        public a f382e;

        /* JADX INFO: renamed from: a */
        public final Object f378a = new Object();

        /* JADX INFO: renamed from: b */
        public final b f379b = new b();

        /* JADX INFO: renamed from: d */
        public WeakReference<InterfaceC0150b> f381d = new WeakReference<>(null);

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                InterfaceC0150b interfaceC0150b;
                AbstractC0149a abstractC0149a;
                a aVar;
                if (message.what == 1) {
                    synchronized (AbstractC0149a.this.f378a) {
                        interfaceC0150b = AbstractC0149a.this.f381d.get();
                        abstractC0149a = AbstractC0149a.this;
                        aVar = abstractC0149a.f382e;
                    }
                    if (interfaceC0150b != null && abstractC0149a == interfaceC0150b.mo653a() && aVar != null) {
                        interfaceC0150b.mo654b((C10438a) message.obj);
                        AbstractC0149a.this.m641a(interfaceC0150b, aVar);
                        interfaceC0150b.mo654b(null);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        public class b extends MediaSession.Callback {
            public b() {
            }

            /* JADX INFO: renamed from: b */
            public static void m651b(C0151c c0151c) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strM657e = c0151c.m657e();
                if (TextUtils.isEmpty(strM657e)) {
                    strM657e = "android.media.session.MediaController";
                }
                c0151c.mo654b(new C10438a(strM657e, -1, -1));
            }

            /* JADX INFO: renamed from: a */
            public final C0151c m652a() {
                C0151c c0151c;
                synchronized (AbstractC0149a.this.f378a) {
                    try {
                        c0151c = (C0151c) AbstractC0149a.this.f381d.get();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c0151c == null || AbstractC0149a.this != c0151c.mo653a()) {
                    return null;
                }
                return c0151c;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                InterfaceC0163b interfaceC0163b;
                InterfaceC9812c interfaceC9812c;
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = c0151cM652a.f386b;
                        synchronized (token.f374a) {
                            try {
                                interfaceC0163b = token.f376c;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        C7229h.m14561b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", interfaceC0163b == null ? null : interfaceC0163b.asBinder());
                        synchronized (token.f374a) {
                            interfaceC9812c = token.f377d;
                        }
                        if (interfaceC9812c != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(interfaceC9812c));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        AbstractC0149a abstractC0149a = AbstractC0149a.this;
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        AbstractC0149a abstractC0149a2 = AbstractC0149a.this;
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        abstractC0149a2.getClass();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        AbstractC0149a abstractC0149a3 = AbstractC0149a.this;
                        abstractC0149a3.getClass();
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        AbstractC0149a.this.getClass();
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                try {
                    boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                    AbstractC0149a abstractC0149a = AbstractC0149a.this;
                    if (zEquals) {
                        MediaSessionCompat.m633a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.m633a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.m633a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        MediaSessionCompat.m633a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        MediaSessionCompat.m633a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        abstractC0149a.getClass();
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        abstractC0149a.getClass();
                    } else {
                        abstractC0149a.getClass();
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo642b();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return false;
                }
                m651b(c0151cM652a);
                boolean zM643c = AbstractC0149a.this.m643c(intent);
                c0151cM652a.mo654b(null);
                return zM643c || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo644d();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo645e();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                MediaSessionCompat.m633a(bundle);
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo646f();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j10) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo647g(j10);
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f3) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                RatingCompat.m555a(rating);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo648h();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.mo649i();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j10) {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                C0151c c0151cM652a = m652a();
                if (c0151cM652a == null) {
                    return;
                }
                m651b(c0151cM652a);
                AbstractC0149a.this.getClass();
                c0151cM652a.mo654b(null);
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m641a(InterfaceC0150b interfaceC0150b, a aVar) {
            if (this.f380c) {
                this.f380c = false;
                aVar.removeMessages(1);
                PlaybackStateCompat playbackState = interfaceC0150b.getPlaybackState();
                long j10 = playbackState == null ? 0L : playbackState.f404e;
                boolean z10 = playbackState != null && playbackState.f400a == 3;
                boolean z11 = (516 & j10) != 0;
                boolean z12 = (j10 & 514) != 0;
                if (z10 && z12) {
                    mo644d();
                } else {
                    if (z10 || !z11) {
                        return;
                    }
                    mo645e();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo642b() {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0096  */
        /* JADX INFO: renamed from: c */
        public final boolean m643c(Intent intent) {
            InterfaceC0150b interfaceC0150b;
            a aVar;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f378a) {
                try {
                    interfaceC0150b = this.f381d.get();
                    aVar = this.f382e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC0150b != null) {
                if (aVar != null) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    if (keyEvent != null) {
                        if (keyEvent.getAction() == 0) {
                            C10438a c10438aMo655c = interfaceC0150b.mo655c();
                            int keyCode = keyEvent.getKeyCode();
                            if (keyCode != 79 && keyCode != 85) {
                                m641a(interfaceC0150b, aVar);
                                return false;
                            }
                            if (keyEvent.getRepeatCount() == 0) {
                                if (this.f380c) {
                                    aVar.removeMessages(1);
                                    this.f380c = false;
                                    PlaybackStateCompat playbackState = interfaceC0150b.getPlaybackState();
                                    if (((playbackState == null ? 0L : playbackState.f404e) & 32) != 0) {
                                        mo648h();
                                    }
                                } else {
                                    this.f380c = true;
                                    aVar.sendMessageDelayed(aVar.obtainMessage(1, c10438aMo655c), ViewConfiguration.getDoubleTapTimeout());
                                }
                                return true;
                            }
                            m641a(interfaceC0150b, aVar);
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public void mo644d() {
        }

        /* JADX INFO: renamed from: e */
        public void mo645e() {
        }

        /* JADX INFO: renamed from: f */
        public void mo646f() {
        }

        /* JADX INFO: renamed from: g */
        public void mo647g(long j10) {
        }

        /* JADX INFO: renamed from: h */
        public void mo648h() {
        }

        /* JADX INFO: renamed from: i */
        public void mo649i() {
        }

        /* JADX INFO: renamed from: j */
        public final void m650j(InterfaceC0150b interfaceC0150b, Handler handler) {
            synchronized (this.f378a) {
                this.f381d = new WeakReference<>(interfaceC0150b);
                a aVar = this.f382e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                if (interfaceC0150b != null && handler != null) {
                    aVar2 = new a(handler.getLooper());
                }
                this.f382e = aVar2;
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    public interface InterfaceC0150b {
        /* JADX INFO: renamed from: a */
        AbstractC0149a mo653a();

        /* JADX INFO: renamed from: b */
        void mo654b(C10438a c10438a);

        /* JADX INFO: renamed from: c */
        C10438a mo655c();

        PlaybackStateCompat getPlaybackState();
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    public static class C0151c implements InterfaceC0150b {

        /* JADX INFO: renamed from: a */
        public final MediaSession f385a;

        /* JADX INFO: renamed from: b */
        public final Token f386b;

        /* JADX INFO: renamed from: d */
        public final Bundle f388d;

        /* JADX INFO: renamed from: f */
        public PlaybackStateCompat f390f;

        /* JADX INFO: renamed from: g */
        public MediaMetadataCompat f391g;

        /* JADX INFO: renamed from: h */
        public AbstractC0149a f392h;

        /* JADX INFO: renamed from: i */
        public C10438a f393i;

        /* JADX INFO: renamed from: c */
        public final Object f387c = new Object();

        /* JADX INFO: renamed from: e */
        public final RemoteCallbackList<InterfaceC0162a> f389e = new RemoteCallbackList<>();

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$c$a */
        public class a extends InterfaceC0163b.a {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0151c f394b;

            public a(C0152d c0152d) {
                this.f394b = c0152d;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: A */
            public final void mo659A(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: B */
            public final boolean mo660B() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: B0 */
            public final void mo661B0(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: C */
            public final void mo662C() throws RemoteException {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: D */
            public final void mo663D(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: D0 */
            public final void mo664D0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: E0 */
            public final void mo665E0() {
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: F */
            public final PendingIntent mo666F() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: H */
            public final void mo667H() {
                this.f394b.getClass();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: H0 */
            public final void mo668H0() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: I0 */
            public final void mo669I0(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: N */
            public final void mo670N(int i10, int i11) {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: N0 */
            public final void mo671N0(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: P */
            public final CharSequence mo672P() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: Q */
            public final void mo673Q(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: Q0 */
            public final ParcelableVolumeInfo mo674Q0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: R */
            public final MediaMetadataCompat mo675R() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: S */
            public final Bundle mo676S() {
                C0151c c0151c = this.f394b;
                if (c0151c.f388d == null) {
                    return null;
                }
                return new Bundle(c0151c.f388d);
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: T */
            public final void mo677T(InterfaceC0162a interfaceC0162a) {
                this.f394b.f389e.unregister(interfaceC0162a);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (this.f394b.f387c) {
                    this.f394b.getClass();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: U0 */
            public final void mo678U0(int i10) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: X0 */
            public final String mo679X0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: Y */
            public final void mo680Y(int i10, int i11) {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: Z */
            public final void mo681Z() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: Z0 */
            public final void mo682Z0(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: a0 */
            public final void mo683a0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: g */
            public final String mo684g() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            public final PlaybackStateCompat getPlaybackState() {
                C0151c c0151c = this.f394b;
                return MediaSessionCompat.m634b(c0151c.f390f, c0151c.f391g);
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void getRepeatMode() {
                this.f394b.getClass();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: i */
            public final long mo685i() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: m0 */
            public final boolean mo686m0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: o */
            public final Bundle mo687o() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: p */
            public final void mo688p(InterfaceC0162a interfaceC0162a) {
                this.f394b.getClass();
                this.f394b.f389e.register(interfaceC0162a, new C10438a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (this.f394b.f387c) {
                    this.f394b.getClass();
                }
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: p0 */
            public final void mo689p0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void pause() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void play() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void prepare() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: r */
            public final void mo690r() {
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: r0 */
            public final void mo691r0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: s */
            public final void mo692s(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void seekTo(long j10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void setPlaybackSpeed(float f3) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void setRepeatMode(int i10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            public final void stop() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: t */
            public final void mo693t(Bundle bundle, String str) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: v0 */
            public final void mo694v0(boolean z10) throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: w */
            public final void mo695w(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: w0 */
            public final void mo696w0() {
                this.f394b.getClass();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: y0 */
            public final void mo697y0(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0163b
            /* JADX INFO: renamed from: z0 */
            public final void mo698z0() {
                this.f394b.getClass();
            }
        }

        public C0151c(Context context, String str) {
            MediaSession mediaSessionMo656d = mo656d(context, str);
            this.f385a = mediaSessionMo656d;
            this.f386b = new Token(mediaSessionMo656d.getSessionToken(), new a((C0152d) this));
            this.f388d = null;
            mediaSessionMo656d.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        /* JADX INFO: renamed from: a */
        public final AbstractC0149a mo653a() {
            AbstractC0149a abstractC0149a;
            synchronized (this.f387c) {
                abstractC0149a = this.f392h;
            }
            return abstractC0149a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        /* JADX INFO: renamed from: b */
        public void mo654b(C10438a c10438a) {
            synchronized (this.f387c) {
                this.f393i = c10438a;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        /* JADX INFO: renamed from: c */
        public C10438a mo655c() {
            C10438a c10438a;
            synchronized (this.f387c) {
                c10438a = this.f393i;
            }
            return c10438a;
        }

        /* JADX INFO: renamed from: d */
        public MediaSession mo656d(Context context, String str) {
            return new MediaSession(context, str);
        }

        /* JADX INFO: renamed from: e */
        public final String m657e() {
            MediaSession mediaSession = this.f385a;
            try {
                return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final void m658f(AbstractC0149a abstractC0149a, Handler handler) {
            synchronized (this.f387c) {
                this.f392h = abstractC0149a;
                this.f385a.setCallback(abstractC0149a == null ? null : abstractC0149a.f379b, handler);
                if (abstractC0149a != null) {
                    abstractC0149a.m650j(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        public final PlaybackStateCompat getPlaybackState() {
            return this.f390f;
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    public static class C0152d extends C0151c {
        public C0152d(Context context, String str) {
            super(context, str);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    public static class C0153e extends C0152d {
        public C0153e(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0151c, android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        /* JADX INFO: renamed from: b */
        public final void mo654b(C10438a c10438a) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0151c, android.support.v4.media.session.MediaSessionCompat.InterfaceC0150b
        /* JADX INFO: renamed from: c */
        public final C10438a mo655c() {
            return new C10438a(this.f385a.getCurrentControllerInfo());
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    public static class C0154f extends C0153e {
        public C0154f(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.C0151c
        /* JADX INFO: renamed from: d */
        public final MediaSession mo656d(Context context, String str) {
            C0166e.m773t();
            return C0165d.m738h(context, str);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    public interface InterfaceC0155g {
        /* JADX INFO: renamed from: a */
        void m699a();
    }

    public MediaSessionCompat(Context context, String str) {
        PendingIntent broadcast;
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        ComponentName componentNameM4866b = C1307a.m4866b(context);
        if (componentNameM4866b == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentNameM4866b != null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentNameM4866b);
            broadcast = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        } else {
            broadcast = null;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f368a = new C0154f(context, str);
        } else if (i10 >= 28) {
            this.f368a = new C0153e(context, str);
        } else {
            this.f368a = new C0152d(context, str);
        }
        this.f368a.m658f(new C0164c(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f368a.f385a.setMediaButtonReceiver(broadcast);
        this.f369b = new MediaControllerCompat(context, this);
        if (f367d == 0) {
            f367d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m633a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: b */
    public static PlaybackStateCompat m634b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j10;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j11 = playbackStateCompat.f401b;
        long j12 = -1;
        if (j11 == -1) {
            return playbackStateCompat;
        }
        int i10 = playbackStateCompat.f400a;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return playbackStateCompat;
        }
        long j13 = playbackStateCompat.f407h;
        if (j13 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = ((long) (playbackStateCompat.f403d * (jElapsedRealtime - j13))) + j11;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f351a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j12 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j12 < 0 || j14 <= j12) {
            j10 = j14 < 0 ? 0L : j14;
        } else {
            j10 = j12;
        }
        ArrayList arrayList = new ArrayList();
        long j15 = playbackStateCompat.f402c;
        long j16 = playbackStateCompat.f404e;
        int i11 = playbackStateCompat.f405f;
        CharSequence charSequence = playbackStateCompat.f406g;
        ArrayList arrayList2 = playbackStateCompat.f408i;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f400a, j10, j15, playbackStateCompat.f403d, j16, i11, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f409j, playbackStateCompat.f410k);
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m635e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m633a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m636c(boolean z10) {
        this.f368a.f385a.setActive(z10);
        Iterator<InterfaceC0155g> it = this.f370c.iterator();
        while (it.hasNext()) {
            it.next().m699a();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m637d(PlaybackStateCompat playbackStateCompat) {
        C0152d c0152d = this.f368a;
        c0152d.f390f = playbackStateCompat;
        synchronized (c0152d.f387c) {
            try {
                int iBeginBroadcast = c0152d.f389e.beginBroadcast();
                while (true) {
                    iBeginBroadcast--;
                    if (iBeginBroadcast < 0) {
                        break;
                    } else {
                        try {
                            ((InterfaceC0162a) c0152d.f389e.getBroadcastItem(iBeginBroadcast)).mo632a1(playbackStateCompat);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                c0152d.f389e.finishBroadcast();
            } finally {
            }
        }
        MediaSession mediaSession = c0152d.f385a;
        if (playbackStateCompat.f411l == null) {
            PlaybackState.Builder builderM703d = PlaybackStateCompat.C0159b.m703d();
            PlaybackStateCompat.C0159b.m723x(builderM703d, playbackStateCompat.f400a, playbackStateCompat.f401b, playbackStateCompat.f403d, playbackStateCompat.f407h);
            PlaybackStateCompat.C0159b.m720u(builderM703d, playbackStateCompat.f402c);
            PlaybackStateCompat.C0159b.m718s(builderM703d, playbackStateCompat.f404e);
            PlaybackStateCompat.C0159b.m721v(builderM703d, playbackStateCompat.f406g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.f408i) {
                PlaybackState.CustomAction customActionM701b = customAction.f416e;
                if (customActionM701b == null) {
                    PlaybackState.CustomAction.Builder builderM704e = PlaybackStateCompat.C0159b.m704e(customAction.f412a, customAction.f413b, customAction.f414c);
                    PlaybackStateCompat.C0159b.m722w(builderM704e, customAction.f415d);
                    customActionM701b = PlaybackStateCompat.C0159b.m701b(builderM704e);
                }
                PlaybackStateCompat.C0159b.m700a(builderM703d, customActionM701b);
            }
            PlaybackStateCompat.C0159b.m719t(builderM703d, playbackStateCompat.f409j);
            PlaybackStateCompat.C0160c.m725b(builderM703d, playbackStateCompat.f410k);
            playbackStateCompat.f411l = PlaybackStateCompat.C0159b.m702c(builderM703d);
        }
        mediaSession.setPlaybackState(playbackStateCompat.f411l);
    }
}
