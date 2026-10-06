package androidx.media;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f1533a = 0;

    /* JADX INFO: renamed from: b */
    public int f1534b = 0;

    /* JADX INFO: renamed from: c */
    public int f1535c = 0;

    /* JADX INFO: renamed from: d */
    public int f1536d = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1534b == audioAttributesImplBase.f1534b) {
            int i = this.f1535c;
            int i2 = audioAttributesImplBase.f1535c;
            int i3 = audioAttributesImplBase.f1536d;
            if (i3 == -1) {
                int i4 = audioAttributesImplBase.f1533a;
                int i5 = AudioAttributesCompat.f1528b;
                if ((i2 & 1) != 1) {
                    if ((i2 & 4) != 4) {
                        switch (i4) {
                            case 0:
                            case 1:
                            case 12:
                            case 14:
                            case 15:
                            case 16:
                            default:
                                i3 = 3;
                                break;
                            case 2:
                                i3 = 0;
                                break;
                            case 3:
                                i3 = 8;
                                break;
                            case 4:
                                i3 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case 6:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 7;
                }
            }
            if (i3 == 6) {
                i2 |= 4;
            } else if (i3 == 7) {
                i2 |= 1;
            }
            if (i == (i2 & 273) && this.f1533a == audioAttributesImplBase.f1533a && this.f1536d == audioAttributesImplBase.f1536d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1534b), Integer.valueOf(this.f1535c), Integer.valueOf(this.f1533a), Integer.valueOf(this.f1536d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1536d != -1) {
            sb.append(" stream=");
            sb.append(this.f1536d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f1533a;
        int i2 = AudioAttributesCompat.f1528b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = rgoX.MCEAyd;
                break;
            case 15:
            default:
                str = "unknown usage " + i;
                break;
            case 16:
                str = wUzNh.mwchBDFEkBOO;
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f1534b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1535c).toUpperCase());
        return sb.toString();
    }
}
