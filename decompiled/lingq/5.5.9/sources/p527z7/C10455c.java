package p527z7;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6752c;
import org.json.JSONArray;
import p067d8.C5074n;
import p067d8.C5086z;
import p173i8.C6205a;
import p409u7.C9475a;

/* JADX INFO: renamed from: z7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10455c {

    /* JADX INFO: renamed from: a */
    public static final C10455c f52310a = new C10455c();

    /* JADX INFO: renamed from: b */
    public static final String f52311b = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static final Bundle m19415a(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> list) {
        if (C6205a.m12742b(C10455c.class)) {
            return null;
        }
        try {
            C5207g.m11111f(eventType, "eventType");
            C5207g.m11111f(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray jSONArrayM19416b = f52310a.m19416b(list, str);
                if (jSONArrayM19416b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayM19416b.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            C6205a.m12741a(C10455c.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m19416b(List<AppEvent> list, String str) {
        boolean zM11106a;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<AppEvent> arrayListM13454v0 = C6752c.m13454v0(list);
            C9475a.m17895b(arrayListM13454v0);
            boolean z10 = false;
            if (!C6205a.m12742b(this)) {
                try {
                    C5074n c5074nM6673f = FetchedAppSettingsManager.m6673f(str, false);
                    if (c5074nM6673f != null) {
                        z10 = c5074nM6673f.f32967a;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
            while (true) {
                for (AppEvent appEvent : arrayListM13454v0) {
                    String str2 = appEvent.f11484e;
                    if (str2 == null) {
                        zM11106a = true;
                    } else {
                        String string = appEvent.f11480a.toString();
                        C5207g.m11110e(string, "jsonObject.toString()");
                        zM11106a = C5207g.m11106a(AppEvent.C2284a.m6640a(string), str2);
                    }
                    if (zM11106a) {
                        boolean z11 = appEvent.f11481b;
                        if (!(!z11) && (!z11 || !z10)) {
                        }
                        jSONArray.put(appEvent.f11480a);
                    } else {
                        C5086z c5086z = C5086z.f33015a;
                        C5086z.m10807F(f52311b, C5207g.m11116k(appEvent, "Event with invalid checksum: "));
                    }
                }
                return jSONArray;
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }
}
