package p476x7;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import dm.C5207g;
import java.util.Arrays;
import kotlin.text.C7076b;
import mo.C7661i;
import p173i8.C6205a;

/* JADX INFO: renamed from: x7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10106e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f51261a = 0;

    static {
        new C10106e();
    }

    /* JADX INFO: renamed from: a */
    public static final String m18962a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            C5207g.m11110e(str, "java.lang.String.format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        C5207g.m11110e(string, "sb.toString()");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static final View m18963b(Activity activity) {
        if (!C6205a.m12742b(C10106e.class) && activity != null) {
            try {
                Window window = activity.getWindow();
                if (window == null) {
                    return null;
                }
                return window.getDecorView().getRootView();
            } catch (Exception unused) {
                return null;
            } catch (Throwable th2) {
                C6205a.m12741a(C10106e.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final boolean m18964c() {
        String str = Build.FINGERPRINT;
        C5207g.m11110e(str, "FINGERPRINT");
        if (!C7661i.m15256V2(str, "generic", false)) {
            C5207g.m11110e(str, "FINGERPRINT");
            if (!C7661i.m15256V2(str, "unknown", false)) {
                String str2 = Build.MODEL;
                C5207g.m11110e(str2, "MODEL");
                if (!C7076b.m14278X2(str2, "google_sdk", false)) {
                    C5207g.m11110e(str2, "MODEL");
                    if (!C7076b.m14278X2(str2, "Emulator", false)) {
                        C5207g.m11110e(str2, "MODEL");
                        if (!C7076b.m14278X2(str2, "Android SDK built for x86", false)) {
                            String str3 = Build.MANUFACTURER;
                            C5207g.m11110e(str3, "MANUFACTURER");
                            if (!C7076b.m14278X2(str3, "Genymotion", false)) {
                                String str4 = Build.BRAND;
                                C5207g.m11110e(str4, "BRAND");
                                if (C7661i.m15256V2(str4, "generic", false)) {
                                    String str5 = Build.DEVICE;
                                    C5207g.m11110e(str5, "DEVICE");
                                    if (!C7661i.m15256V2(str5, "generic", false)) {
                                        if (C5207g.m11106a("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                } else if (C5207g.m11106a("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
