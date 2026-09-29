package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p232l2.C7229h;
import p326q.C8446b;
import p448w4.C9810a;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a */
    public final MediaControllerImplApi21 f357a;

    public static class MediaControllerImplApi21 {

        /* JADX INFO: renamed from: a */
        public final MediaController f358a;

        /* JADX INFO: renamed from: b */
        public final Object f359b = new Object();

        /* JADX INFO: renamed from: c */
        public final ArrayList f360c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final HashMap<AbstractC0143a, BinderC0142a> f361d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public final MediaSessionCompat.Token f362e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: a */
            public final WeakReference<MediaControllerImplApi21> f363a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f363a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i10, Bundle bundle) {
                InterfaceC0163b c10582a;
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f363a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f359b) {
                        MediaSessionCompat.Token token = mediaControllerImplApi21.f362e;
                        IBinder iBinderM14560a = C7229h.m14560a(bundle, "android.support.v4.media.session.EXTRA_BINDER");
                        int i11 = InterfaceC0163b.a.f426a;
                        InterfaceC9812c interfaceC9812c = null;
                        if (iBinderM14560a == null) {
                            c10582a = null;
                        } else {
                            IInterface iInterfaceQueryLocalInterface = iBinderM14560a.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            c10582a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0163b)) ? new InterfaceC0163b.a.C10582a(iBinderM14560a) : (InterfaceC0163b) iInterfaceQueryLocalInterface;
                        }
                        synchronized (token.f374a) {
                            try {
                                token.f376c = c10582a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        MediaSessionCompat.Token token2 = mediaControllerImplApi21.f362e;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(C9810a.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (!(parcelable instanceof ParcelImpl)) {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                                interfaceC9812c = ((ParcelImpl) parcelable).f7630a;
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (token2.f374a) {
                            try {
                                token2.f377d = interfaceC9812c;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        mediaControllerImplApi21.m625a();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        public static class BinderC0142a extends AbstractC0143a.b {
            public BinderC0142a(AbstractC0143a abstractC0143a) {
                super(abstractC0143a);
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: G */
            public final void mo626G() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: G0 */
            public final void mo627G0() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: b0 */
            public final void mo628b0() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: c1 */
            public final void mo629c1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: q0 */
            public final void mo630q0() throws RemoteException {
                throw new AssertionError();
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: s0 */
            public final void mo631s0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            InterfaceC0163b interfaceC0163b;
            this.f362e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f375b);
            this.f358a = mediaController;
            synchronized (token.f374a) {
                try {
                    interfaceC0163b = token.f376c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC0163b == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m625a() {
            InterfaceC0163b interfaceC0163b;
            InterfaceC0163b interfaceC0163b2;
            MediaSessionCompat.Token token = this.f362e;
            synchronized (token.f374a) {
                try {
                    interfaceC0163b = token.f376c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC0163b == null) {
                return;
            }
            ArrayList<AbstractC0143a> arrayList = this.f360c;
            for (AbstractC0143a abstractC0143a : arrayList) {
                BinderC0142a binderC0142a = new BinderC0142a(abstractC0143a);
                this.f361d.put(abstractC0143a, binderC0142a);
                abstractC0143a.f364a = binderC0142a;
                try {
                    synchronized (token.f374a) {
                        try {
                            interfaceC0163b2 = token.f376c;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    interfaceC0163b2.mo688p(binderC0142a);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class AbstractC0143a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a */
        public MediaControllerImplApi21.BinderC0142a f364a;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        public static class a extends MediaController.Callback {

            /* JADX INFO: renamed from: a */
            public final WeakReference<AbstractC0143a> f365a;

            public a(AbstractC0143a abstractC0143a) {
                this.f365a = new WeakReference<>(abstractC0143a);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f365a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.m633a(bundle);
                this.f365a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (this.f365a.get() != null) {
                    C8446b<String, Integer> c8446b = MediaMetadataCompat.f350c;
                    if (mediaMetadata != null) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(parcelObtain, 0);
                        parcelObtain.setDataPosition(0);
                        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        mediaMetadataCompatCreateFromParcel.f352b = mediaMetadata;
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                ArrayList arrayList;
                PlaybackStateCompat.CustomAction customAction;
                AbstractC0143a abstractC0143a = this.f365a.get();
                if (abstractC0143a == null || abstractC0143a.f364a != null || playbackState == null) {
                    return;
                }
                List<PlaybackState.CustomAction> listM709j = PlaybackStateCompat.C0159b.m709j(playbackState);
                if (listM709j != null) {
                    ArrayList arrayList2 = new ArrayList(listM709j.size());
                    for (PlaybackState.CustomAction customAction2 : listM709j) {
                        if (customAction2 != null) {
                            PlaybackState.CustomAction customAction3 = customAction2;
                            Bundle bundleM711l = PlaybackStateCompat.C0159b.m711l(customAction3);
                            MediaSessionCompat.m633a(bundleM711l);
                            customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.C0159b.m705f(customAction3), PlaybackStateCompat.C0159b.m714o(customAction3), PlaybackStateCompat.C0159b.m712m(customAction3), bundleM711l);
                            customAction.f416e = customAction3;
                        } else {
                            customAction = null;
                        }
                        arrayList2.add(customAction);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                Bundle bundleM724a = PlaybackStateCompat.C0160c.m724a(playbackState);
                MediaSessionCompat.m633a(bundleM724a);
                new PlaybackStateCompat(PlaybackStateCompat.C0159b.m717r(playbackState), PlaybackStateCompat.C0159b.m716q(playbackState), PlaybackStateCompat.C0159b.m708i(playbackState), PlaybackStateCompat.C0159b.m715p(playbackState), PlaybackStateCompat.C0159b.m706g(playbackState), 0, PlaybackStateCompat.C0159b.m710k(playbackState), PlaybackStateCompat.C0159b.m713n(playbackState), arrayList, PlaybackStateCompat.C0159b.m707h(playbackState), bundleM724a).f411l = playbackState;
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.f365a.get() == null || list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaSession.QueueItem queueItem2 : list) {
                    if (queueItem2 != null) {
                        MediaSession.QueueItem queueItem3 = queueItem2;
                        queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.m535a(MediaSessionCompat.QueueItem.C0146b.m639b(queueItem3)), MediaSessionCompat.QueueItem.C0146b.m640c(queueItem3));
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.f365a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                this.f365a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.m633a(bundle);
                this.f365a.get();
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        public static class b extends InterfaceC0162a.a {

            /* JADX INFO: renamed from: b */
            public final WeakReference<AbstractC0143a> f366b;

            public b(AbstractC0143a abstractC0143a) {
                this.f366b = new WeakReference<>(abstractC0143a);
            }

            @Override // android.support.v4.media.session.InterfaceC0162a
            /* JADX INFO: renamed from: a1 */
            public final void mo632a1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.f366b.get();
            }
        }

        public AbstractC0143a() {
            new a(this);
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static class C0144b extends MediaControllerImplApi21 {
        public C0144b(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        new ConcurrentHashMap();
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token token = mediaSessionCompat.f368a.f386b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f357a = new C0144b(context, token);
        } else {
            this.f357a = new MediaControllerImplApi21(context, token);
        }
    }
}
