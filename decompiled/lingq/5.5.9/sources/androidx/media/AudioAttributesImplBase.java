package androidx.media;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f6721a = 0;

    /* JADX INFO: renamed from: b */
    public int f6722b = 0;

    /* JADX INFO: renamed from: c */
    public int f6723c = 0;

    /* JADX INFO: renamed from: d */
    public int f6724d = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean equals(Object obj) {
        int i10;
        boolean z10 = false;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6722b == audioAttributesImplBase.f6722b) {
            int i11 = this.f6723c;
            int i12 = audioAttributesImplBase.f6723c;
            int i13 = audioAttributesImplBase.f6724d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f6721a;
                int i15 = AudioAttributesCompat.f6717b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                            default:
                                i10 = 3;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f6721a == audioAttributesImplBase.f6721a && this.f6724d == i13) {
                z10 = true;
            }
        }
        return z10;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6722b), Integer.valueOf(this.f6723c), Integer.valueOf(this.f6721a), Integer.valueOf(this.f6724d)});
    }

    public final String toString() {
        String strM761g;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f6724d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f6724d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f6721a;
        int i11 = AudioAttributesCompat.f6717b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                strM761g = "USAGE_UNKNOWN";
                break;
            case 1:
                strM761g = "USAGE_MEDIA";
                break;
            case 2:
                strM761g = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM761g = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM761g = "USAGE_ALARM";
                break;
            case 5:
                strM761g = "USAGE_NOTIFICATION";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                strM761g = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                strM761g = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM761g = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM761g = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM761g = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM761g = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM761g = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM761g = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM761g = "USAGE_GAME";
                break;
            case 15:
            default:
                strM761g = C0166e.m761g("unknown usage ", i10);
                break;
            case 16:
                strM761g = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strM761g);
        sb2.append(" content=");
        sb2.append(this.f6722b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f6723c).toUpperCase());
        return sb2.toString();
    }
}
