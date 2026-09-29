package androidx.media;

import java.util.Arrays;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f6358a;

    /* JADX INFO: renamed from: b */
    public int f6359b;

    /* JADX INFO: renamed from: c */
    public int f6360c;

    /* JADX INFO: renamed from: d */
    public int f6361d;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6359b == audioAttributesImplBase.f6359b) {
            int i2 = this.f6360c;
            int i3 = audioAttributesImplBase.f6360c;
            int i4 = audioAttributesImplBase.f6361d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f6358a;
                int i6 = AudioAttributesCompat.f6354b;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f6358a == audioAttributesImplBase.f6358a && this.f6361d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6359b), Integer.valueOf(this.f6360c), Integer.valueOf(this.f6358a), Integer.valueOf(this.f6361d)});
    }

    public final String toString() {
        String strM22988k;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6361d != -1) {
            sb.append(" stream=");
            sb.append(this.f6361d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f6358a;
        int i2 = AudioAttributesCompat.f6354b;
        switch (i) {
            case 0:
                strM22988k = "USAGE_UNKNOWN";
                break;
            case 1:
                strM22988k = "USAGE_MEDIA";
                break;
            case 2:
                strM22988k = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM22988k = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM22988k = "USAGE_ALARM";
                break;
            case 5:
                strM22988k = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM22988k = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM22988k = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM22988k = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM22988k = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM22988k = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM22988k = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM22988k = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM22988k = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM22988k = "USAGE_GAME";
                break;
            case 15:
            default:
                strM22988k = ux5.m22988k(i, "unknown usage ");
                break;
            case 16:
                strM22988k = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM22988k);
        sb.append(" content=");
        sb.append(this.f6359b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6360c).toUpperCase());
        return sb.toString();
    }
}
