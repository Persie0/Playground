package p000;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class k58 {

    /* JADX INFO: renamed from: a */
    public final Uri f46729a;

    /* JADX INFO: renamed from: b */
    public final String f46730b;

    /* JADX INFO: renamed from: c */
    public final String f46731c;

    public k58(web webVar) {
        this.f46730b = webVar.m23868E("gcm.n.title");
        webVar.m23889z("gcm.n.title");
        Object[] objArrM23888y = webVar.m23888y("gcm.n.title");
        if (objArrM23888y != null) {
            String[] strArr = new String[objArrM23888y.length];
            for (int i = 0; i < objArrM23888y.length; i++) {
                strArr[i] = String.valueOf(objArrM23888y[i]);
            }
        }
        this.f46731c = webVar.m23868E("gcm.n.body");
        webVar.m23889z("gcm.n.body");
        Object[] objArrM23888y2 = webVar.m23888y("gcm.n.body");
        if (objArrM23888y2 != null) {
            String[] strArr2 = new String[objArrM23888y2.length];
            for (int i2 = 0; i2 < objArrM23888y2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrM23888y2[i2]);
            }
        }
        webVar.m23868E("gcm.n.icon");
        if (TextUtils.isEmpty(webVar.m23868E("gcm.n.sound2"))) {
            webVar.m23868E("gcm.n.sound");
        }
        webVar.m23868E("gcm.n.tag");
        webVar.m23868E("gcm.n.color");
        webVar.m23868E("gcm.n.click_action");
        webVar.m23868E("gcm.n.android_channel_id");
        String strM23868E = webVar.m23868E("gcm.n.link_android");
        strM23868E = TextUtils.isEmpty(strM23868E) ? webVar.m23868E("gcm.n.link") : strM23868E;
        this.f46729a = !TextUtils.isEmpty(strM23868E) ? Uri.parse(strM23868E) : null;
        webVar.m23868E("gcm.n.image");
        webVar.m23868E("gcm.n.ticker");
        webVar.m23885v("gcm.n.notification_priority");
        webVar.m23885v("gcm.n.visibility");
        webVar.m23885v("gcm.n.notification_count");
        webVar.m23880o("gcm.n.sticky");
        webVar.m23880o("gcm.n.local_only");
        webVar.m23880o("gcm.n.default_sound");
        webVar.m23880o("gcm.n.default_vibrate_timings");
        webVar.m23880o("gcm.n.default_light_settings");
        webVar.m23864A();
        webVar.m23887x();
        webVar.m23869F();
    }

    /* JADX INFO: renamed from: a */
    public String m14855a() {
        return this.f46731c;
    }

    public k58(Uri uri, String str, String str2) {
        this.f46729a = uri;
        this.f46730b = str;
        this.f46731c = str2;
    }
}
