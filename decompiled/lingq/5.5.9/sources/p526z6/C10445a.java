package p526z6;

import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import p232l2.C7236o;
import p430v6.InterfaceC9656b;

/* JADX INFO: renamed from: z6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10445a implements InterfaceC10446b, InterfaceC9656b {

    /* JADX INFO: renamed from: a */
    public String f52292a;

    /* JADX INFO: renamed from: b */
    public String f52293b;

    /* JADX INFO: renamed from: c */
    public int f52294c;

    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    @Override // p430v6.InterfaceC9656b
    /* JADX INFO: renamed from: a */
    public final C7236o mo18117a(Context context, Bundle bundle, C7236o c7236o, CleverTapInstanceConfig cleverTapInstanceConfig) {
        Uri defaultUri;
        try {
            if (bundle.containsKey("wzrk_sound")) {
                Object obj = bundle.get("wzrk_sound");
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    defaultUri = RingtoneManager.getDefaultUri(2);
                } else if (obj instanceof String) {
                    String strSubstring = (String) obj;
                    if (strSubstring.equals("true")) {
                        defaultUri = RingtoneManager.getDefaultUri(2);
                    } else if (strSubstring.isEmpty()) {
                        defaultUri = null;
                    } else {
                        if (strSubstring.contains(".mp3") || strSubstring.contains(".ogg") || strSubstring.contains(".wav")) {
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 4);
                        }
                        defaultUri = Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + strSubstring);
                    }
                } else {
                    defaultUri = null;
                }
                if (defaultUri != null) {
                    c7236o.m14582g(defaultUri);
                }
            }
        } catch (Throwable th2) {
            cleverTapInstanceConfig.m6433b().getClass();
            C2181a.m6453e(cleverTapInstanceConfig.f10995a, "Could not process sound parameter", th2);
        }
        return c7236o;
    }
}
