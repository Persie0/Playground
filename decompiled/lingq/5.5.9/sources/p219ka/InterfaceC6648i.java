package p219ka;

import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import java.util.List;
import la.C7293a;
import la.C7294b;
import ma.C7526a;
import na.C7734a;
import p361ra.C8755c;
import p397ta.C9233a;
import p397ta.C9239g;
import pa.C8210a;
import qa.C8507a;
import sa.C8985a;

/* JADX INFO: renamed from: ka.i */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6648i {

    /* JADX INFO: renamed from: a */
    public static final a f37699a = new a();

    /* JADX INFO: renamed from: ka.i$a */
    public class a implements InterfaceC6648i {
        /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final InterfaceC6647h m13280a(C2416m c2416m) {
            byte b10;
            String str = c2416m.f12484l;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1351681404:
                        if (!str.equals("application/dvbsubs")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -1248334819:
                        if (!str.equals("application/pgs")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -1026075066:
                        if (!str.equals("application/x-mp4-vtt")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case -1004728940:
                        if (!str.equals("text/vtt")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 691401887:
                        if (!str.equals("application/x-quicktime-tx3g")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 822864842:
                        if (!str.equals("text/x-ssa")) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case 930165504:
                        if (!str.equals("application/x-mp4-cea-608")) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case 1201784583:
                        if (!str.equals("text/x-exoplayer-cues")) {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case 1566015601:
                        if (!str.equals("application/cea-608")) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 1566016562:
                        if (!str.equals("application/cea-708")) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1668750253:
                        if (!str.equals("application/x-subrip")) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    case 1693976202:
                        if (!str.equals("application/ttml+xml")) {
                            b10 = -1;
                        } else {
                            b10 = 11;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                int i10 = c2416m.f12468Y;
                List<byte[]> list = c2416m.f12452I;
                switch (b10) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        return new C7526a(list);
                    case 1:
                        return new C7734a();
                    case 2:
                        return new C9233a();
                    case 3:
                        return new C9239g();
                    case 4:
                        return new C8985a(list);
                    case 5:
                        return new C8210a(list);
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 8:
                        return new C7293a(str, i10);
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        return new C6643d();
                    case 9:
                        return new C7294b(i10, list);
                    case 10:
                        return new C8507a();
                    case 11:
                        return new C8755c();
                }
            }
            throw new IllegalArgumentException(C0204c.m852k("Attempted to create decoder for unsupported MIME type: ", str));
        }

        /* JADX INFO: renamed from: b */
        public final boolean m13281b(C2416m c2416m) {
            String str = c2416m.f12484l;
            if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
                return false;
            }
            return true;
        }
    }
}
