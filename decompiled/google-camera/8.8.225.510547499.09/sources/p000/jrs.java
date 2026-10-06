package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrs extends jij {
    public static final Parcelable.Creator CREATOR = new jri(6);

    /* JADX INFO: renamed from: a */
    final jrt f34683a;

    /* JADX INFO: renamed from: b */
    final int f34684b;

    /* JADX INFO: renamed from: c */
    final int f34685c;

    /* JADX INFO: renamed from: d */
    final int f34686d;

    public jrs(jrt jrtVar, int i, int i2, int i3) {
        this.f34683a = jrtVar;
        this.f34684b = i;
        this.f34685c = i2;
        this.f34686d = i3;
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.f34683a);
        int i = this.f34684b;
        switch (i) {
            case 1:
                string = "CHANNEL_OPENED";
                break;
            case 2:
                string = "CHANNEL_CLOSED";
                break;
            case 3:
                string = "INPUT_CLOSED";
                break;
            case 4:
                string = "OUTPUT_CLOSED";
                break;
            default:
                string = Integer.toString(i);
                break;
        }
        int i2 = this.f34685c;
        switch (i2) {
            case 0:
                string2 = "CLOSE_REASON_NORMAL";
                break;
            case 1:
                string2 = "CLOSE_REASON_DISCONNECTED";
                break;
            case 2:
                string2 = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case 3:
                string2 = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                string2 = Integer.toString(i2);
                break;
        }
        return "ChannelEventParcelable[, channel=" + strValueOf + ", type=" + string + ", closeReason=" + string2 + ", appErrorCode=" + this.f34686d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 2, this.f34683a, i);
        jiy.m13287n(parcel, 3, this.f34684b);
        jiy.m13287n(parcel, 4, this.f34685c);
        jiy.m13287n(parcel, 5, this.f34686d);
        jiy.m13283j(parcel, iM13281h);
    }

    /* JADX INFO: renamed from: a */
    public final void m13492a(jqr jqrVar) {
        int i = this.f34684b;
        switch (i) {
            case 1:
                jqrVar.mo13473b(this.f34683a);
                break;
            case 2:
                jqrVar.mo13474c(this.f34683a);
                break;
            case 3:
                jqrVar.mo13475d(this.f34683a);
                break;
            case 4:
                jqrVar.mo13476e(this.f34683a);
                break;
            default:
                Log.w("ChannelEventParcelable", "Unknown type: " + i);
                break;
        }
    }
}
