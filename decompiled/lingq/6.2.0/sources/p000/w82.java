package p000;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import androidx.media3.common.C0713b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w82 implements li7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i92 f66509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d92 f66510b;

    public /* synthetic */ w82(i92 i92Var, d92 d92Var) {
        this.f66509a = i92Var;
        this.f66510b = d92Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    @Override // p000.li7
    public final boolean apply(Object obj) {
        Boolean bool;
        nc0 nc0Var;
        nc0 nc0Var2;
        boolean zCanBeSpatialized;
        nc0 nc0Var3;
        C0713b c0713b = (C0713b) obj;
        i92 i92Var = this.f66509a;
        i92Var.getClass();
        if (this.f66510b.f35198A && ((bool = i92Var.f43736j) == null || !bool.booleanValue())) {
            int i = c0713b.f6381G;
            String str = c0713b.f6406o;
            if (i != -1 && i > 2) {
                if (str == null) {
                    if (Build.VERSION.SDK_INT >= 32 && (nc0Var = i92Var.f43734h) != null && nc0Var.f52584b && nc0Var.m17329f() && i92Var.f43734h.m17330g()) {
                        nc0Var2 = i92Var.f43734h;
                        C3476px c3476px = i92Var.f43735i;
                        if (((Spatializer) nc0Var2.f52585c) == null && nc0Var2.f52584b && nc0Var2.m17329f() && nc0Var2.m17330g()) {
                            int i2 = c0713b.f6381G;
                            if (Objects.equals(str, "audio/eac3-joc")) {
                                if (i2 == 16) {
                                    i2 = 12;
                                }
                            } else if (Objects.equals(str, "audio/iamf")) {
                                if (i2 == -1) {
                                    i2 = 6;
                                }
                            } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                                i2 = 24;
                            }
                            int iM22818m = uma.m22818m(i2);
                            if (iM22818m == 0) {
                                zCanBeSpatialized = false;
                            } else {
                                AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM22818m);
                                int i3 = c0713b.f6382H;
                                if (i3 != -1) {
                                    channelMask.setSampleRate(i3);
                                }
                                Spatializer spatializer = (Spatializer) nc0Var2.f52585c;
                                spatializer.getClass();
                                zCanBeSpatialized = AbstractC3439ox.m18547c(spatializer).canBeSpatialized(c3476px.m19557a(), channelMask.build());
                            }
                        } else {
                            zCanBeSpatialized = false;
                        }
                        if (zCanBeSpatialized) {
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/ac4":
                    case "audio/eac3":
                        if (Build.VERSION.SDK_INT >= 32 && (nc0Var3 = i92Var.f43734h) != null && nc0Var3.f52584b) {
                        }
                    default:
                        if (Build.VERSION.SDK_INT >= 32) {
                            nc0Var2 = i92Var.f43734h;
                            C3476px c3476px2 = i92Var.f43735i;
                            if (((Spatializer) nc0Var2.f52585c) == null) {
                                zCanBeSpatialized = false;
                            } else {
                                zCanBeSpatialized = false;
                            }
                            if (zCanBeSpatialized) {
                            }
                        }
                        return false;
                }
            }
        }
        return true;
    }
}
