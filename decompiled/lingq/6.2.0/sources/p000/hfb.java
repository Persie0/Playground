package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.DrmInitData;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.AuthenticationTokenHeader;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.Profile;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.DeviceAuthMethodHandler;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.InstagramAppLoginMethodHandler;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.metrics.Counter;
import com.lingq.core.navigation.model.NoticeNavArg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p000.hfb;

/* JADX INFO: loaded from: classes.dex */
public final class hfb implements Parcelable.Creator {

    /* JADX INFO: renamed from: b */
    public static final hfb f42311b = new hfb(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42312a;

    public /* synthetic */ hfb(int i) {
        this.f42312a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        gy3 gy3Var = null;
        Bundle bundleM17130l = null;
        Bundle bundle = null;
        switch (this.f42312a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    return fob.m11968a(parcel);
                }
                parcel.setDataPosition(iDataPosition - 4);
                return ApiMetadata.f11646d;
            case 1:
                parcel.getClass();
                return new ActivityResult(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 2:
                parcel.getClass();
                return new AuthenticationToken(parcel);
            case 3:
                parcel.getClass();
                return new AuthenticationTokenClaims(parcel);
            case 4:
                parcel.getClass();
                return new AuthenticationTokenHeader(parcel);
            case 5:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f12640i = 255;
                badgeState$State.f12642k = -2;
                badgeState$State.f12643l = -2;
                badgeState$State.f12613H = -2;
                badgeState$State.f12620O = Boolean.TRUE;
                badgeState$State.f12632a = parcel.readInt();
                badgeState$State.f12633b = (Integer) parcel.readSerializable();
                badgeState$State.f12634c = (Integer) parcel.readSerializable();
                badgeState$State.f12635d = (Integer) parcel.readSerializable();
                badgeState$State.f12636e = (Integer) parcel.readSerializable();
                badgeState$State.f12637f = (Integer) parcel.readSerializable();
                badgeState$State.f12638g = (Integer) parcel.readSerializable();
                badgeState$State.f12639h = (Integer) parcel.readSerializable();
                badgeState$State.f12640i = parcel.readInt();
                badgeState$State.f12641j = parcel.readString();
                badgeState$State.f12642k = parcel.readInt();
                badgeState$State.f12643l = parcel.readInt();
                badgeState$State.f12613H = parcel.readInt();
                badgeState$State.f12615J = parcel.readString();
                badgeState$State.f12616K = parcel.readString();
                badgeState$State.f12617L = parcel.readInt();
                badgeState$State.f12619N = (Integer) parcel.readSerializable();
                badgeState$State.f12621P = (Integer) parcel.readSerializable();
                badgeState$State.f12622Q = (Integer) parcel.readSerializable();
                badgeState$State.f12623R = (Integer) parcel.readSerializable();
                badgeState$State.f12624S = (Integer) parcel.readSerializable();
                badgeState$State.f12625T = (Integer) parcel.readSerializable();
                badgeState$State.f12626U = (Integer) parcel.readSerializable();
                badgeState$State.f12629X = (Integer) parcel.readSerializable();
                badgeState$State.f12627V = (Integer) parcel.readSerializable();
                badgeState$State.f12628W = (Integer) parcel.readSerializable();
                badgeState$State.f12620O = (Boolean) parcel.readSerializable();
                badgeState$State.f12614I = (Locale) parcel.readSerializable();
                badgeState$State.f12630Y = (Boolean) parcel.readSerializable();
                badgeState$State.f12631Z = (Integer) parcel.readSerializable();
                return badgeState$State;
            case 6:
                return new Counter(parcel);
            case 7:
                parcel.getClass();
                return new CustomTabLoginMethodHandler(parcel);
            case 8:
                return new DateValidatorPointForward(parcel.readLong());
            case 9:
                parcel.getClass();
                return new DeviceAuthMethodHandler(parcel);
            case 10:
                return new DrmInitData(parcel);
            case 11:
                parcel.getClass();
                return new GetTokenLoginMethodHandler(parcel);
            case 12:
                parcel.getClass();
                return new GraphRequest$ParcelableResourceWithMimeType(parcel);
            case 13:
                parcel.getClass();
                return new InstagramAppLoginMethodHandler(parcel);
            case 14:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 15:
                parcel.getClass();
                return new KatanaProxyLoginMethodHandler(parcel);
            case 16:
                parcel.getClass();
                LoginClient loginClient = new LoginClient();
                loginClient.f11445b = -1;
                Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable2 : parcelableArray) {
                    LoginMethodHandler loginMethodHandler = parcelable2 instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable2 : null;
                    if (loginMethodHandler != null) {
                        loginMethodHandler.f11487b = loginClient;
                    }
                    if (loginMethodHandler != null) {
                        arrayList.add(loginMethodHandler);
                    }
                }
                loginClient.f11444a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
                loginClient.f11445b = parcel.readInt();
                loginClient.f11450g = (LoginClient.Request) parcel.readParcelable(LoginClient.Request.class.getClassLoader());
                HashMap mapM3968p0 = bna.m3968p0(parcel);
                loginClient.f11451h = mapM3968p0 != null ? new LinkedHashMap(mapM3968p0) : null;
                HashMap mapM3968p1 = bna.m3968p0(parcel);
                loginClient.f11452i = mapM3968p1 != null ? new LinkedHashMap(mapM3968p1) : null;
                return loginClient;
            case 17:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new hfb(17);

                    /* JADX INFO: renamed from: a */
                    public final int f938a;

                    /* JADX INFO: renamed from: b */
                    public final MediaDescriptionCompat f939b;

                    {
                        this.f938a = parcel.readInt();
                        this.f939b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f938a + ", mDescription=" + this.f939b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f938a);
                        this.f939b.writeToParcel(parcel2, i);
                    }
                };
            case 18:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM13471g = hu5.m13471g(mediaDescription);
                CharSequence charSequenceM13473i = hu5.m13473i(mediaDescription);
                CharSequence charSequenceM13472h = hu5.m13472h(mediaDescription);
                CharSequence charSequenceM13467c = hu5.m13467c(mediaDescription);
                Bitmap bitmapM13469e = hu5.m13469e(mediaDescription);
                Uri uriM13470f = hu5.m13470f(mediaDescription);
                Bundle bundleM13468d = hu5.m13468d(mediaDescription);
                if (bundleM13468d != null) {
                    bundleM13468d = gv5.m12869c0(bundleM13468d);
                }
                Uri uriM14152a = bundleM13468d != null ? (Uri) bundleM13468d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uriM14152a == null) {
                    bundle = bundleM13468d;
                } else if (!bundleM13468d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM13468d.size() != 2) {
                    bundleM13468d.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleM13468d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleM13468d;
                }
                if (uriM14152a == null) {
                    uriM14152a = iu5.m14152a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM13471g, charSequenceM13473i, charSequenceM13472h, charSequenceM13467c, bitmapM13469e, uriM13470f, bundle, uriM14152a);
                mediaDescriptionCompat.f948i = mediaDescription;
                return mediaDescriptionCompat;
            case 19:
                return new MediaMetadataCompat(parcel);
            case 20:
                return new MediaSessionCompat$QueueItem(parcel);
            case 21:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 22:
                parcel.getClass();
                return new NoticeNavArg(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new ParcelImpl(parcel);
            case 24:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f962a = parcel.readInt();
                parcelableVolumeInfo.f964c = parcel.readInt();
                parcelableVolumeInfo.f965d = parcel.readInt();
                parcelableVolumeInfo.f966e = parcel.readInt();
                parcelableVolumeInfo.f963b = parcel.readInt();
                return parcelableVolumeInfo;
            case 25:
                return new PlaybackStateCompat(parcel);
            case 26:
                parcel.getClass();
                return new Profile(parcel);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 28:
                int iM17129k0 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k0) {
                    int i = parcel.readInt();
                    if (((char) i) != 2) {
                        AbstractC3352my.m17113c0(parcel, i);
                    } else {
                        bundleM17130l = AbstractC3352my.m17130l(parcel, i);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k0);
                return new RemoteMessage(bundleM17130l);
            default:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i2 = f98.f38687g;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(gy3.f41521e);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gy3)) {
                        fy3 fy3Var = new fy3();
                        fy3Var.f39921f = strongBinder;
                        gy3Var = fy3Var;
                    } else {
                        gy3Var = (gy3) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f997a = gy3Var;
                return resultReceiver;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f42312a) {
            case 0:
                return new ApiMetadata[i];
            case 1:
                return new ActivityResult[i];
            case 2:
                return new AuthenticationToken[i];
            case 3:
                return new AuthenticationTokenClaims[i];
            case 4:
                return new AuthenticationTokenHeader[i];
            case 5:
                return new BadgeState$State[i];
            case 6:
                return new Counter[i];
            case 7:
                return new CustomTabLoginMethodHandler[i];
            case 8:
                return new DateValidatorPointForward[i];
            case 9:
                return new DeviceAuthMethodHandler[i];
            case 10:
                return new DrmInitData[i];
            case 11:
                return new GetTokenLoginMethodHandler[i];
            case 12:
                return new GraphRequest$ParcelableResourceWithMimeType[i];
            case 13:
                return new InstagramAppLoginMethodHandler[i];
            case 14:
                return new IntentSenderRequest[i];
            case 15:
                return new KatanaProxyLoginMethodHandler[i];
            case 16:
                return new LoginClient[i];
            case 17:
                return new MediaBrowserCompat$MediaItem[i];
            case 18:
                return new MediaDescriptionCompat[i];
            case 19:
                return new MediaMetadataCompat[i];
            case 20:
                return new MediaSessionCompat$QueueItem[i];
            case 21:
                return new MediaSessionCompat$Token[i];
            case 22:
                return new NoticeNavArg[i];
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new ParcelImpl[i];
            case 24:
                return new ParcelableVolumeInfo[i];
            case 25:
                return new PlaybackStateCompat[i];
            case 26:
                return new Profile[i];
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new RatingCompat[i];
            case 28:
                return new RemoteMessage[i];
            default:
                return new ResultReceiver[i];
        }
    }
}
