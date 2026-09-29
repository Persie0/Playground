package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import java.util.Map;
import p326q.C8446b;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C3256s();

    /* JADX INFO: renamed from: a */
    public final Bundle f16322a;

    /* JADX INFO: renamed from: b */
    public C8446b f16323b;

    /* JADX INFO: renamed from: c */
    public C3230a f16324c;

    /* JADX INFO: renamed from: com.google.firebase.messaging.RemoteMessage$a */
    public static class C3230a {

        /* JADX INFO: renamed from: a */
        public final String f16325a;

        /* JADX INFO: renamed from: b */
        public final String f16326b;

        /* JADX INFO: renamed from: c */
        public final Uri f16327c;

        public C3230a(C3253p c3253p) {
            this.f16325a = c3253p.m9286j("gcm.n.title");
            c3253p.m9283g("gcm.n.title");
            Object[] objArrM9282f = c3253p.m9282f("gcm.n.title");
            if (objArrM9282f != null) {
                String[] strArr = new String[objArrM9282f.length];
                for (int i10 = 0; i10 < objArrM9282f.length; i10++) {
                    strArr[i10] = String.valueOf(objArrM9282f[i10]);
                }
            }
            this.f16326b = c3253p.m9286j("gcm.n.body");
            c3253p.m9283g("gcm.n.body");
            Object[] objArrM9282f2 = c3253p.m9282f("gcm.n.body");
            if (objArrM9282f2 != null) {
                String[] strArr2 = new String[objArrM9282f2.length];
                for (int i11 = 0; i11 < objArrM9282f2.length; i11++) {
                    strArr2[i11] = String.valueOf(objArrM9282f2[i11]);
                }
            }
            c3253p.m9286j("gcm.n.icon");
            if (TextUtils.isEmpty(c3253p.m9286j("gcm.n.sound2"))) {
                c3253p.m9286j("gcm.n.sound");
            }
            c3253p.m9286j("gcm.n.tag");
            c3253p.m9286j("gcm.n.color");
            c3253p.m9286j("gcm.n.click_action");
            c3253p.m9286j("gcm.n.android_channel_id");
            this.f16327c = c3253p.m9281e();
            c3253p.m9286j("gcm.n.image");
            c3253p.m9286j("gcm.n.ticker");
            c3253p.m9278b("gcm.n.notification_priority");
            c3253p.m9278b("gcm.n.visibility");
            c3253p.m9278b("gcm.n.notification_count");
            c3253p.m9277a("gcm.n.sticky");
            c3253p.m9277a("gcm.n.local_only");
            c3253p.m9277a("gcm.n.default_sound");
            c3253p.m9277a("gcm.n.default_vibrate_timings");
            c3253p.m9277a("gcm.n.default_light_settings");
            c3253p.m9284h();
            c3253p.m9280d();
            c3253p.m9287k();
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f16322a = bundle;
    }

    /* JADX INFO: renamed from: q */
    public final Map<String, String> m9238q() {
        if (this.f16323b == null) {
            C8446b c8446b = new C8446b();
            Bundle bundle = this.f16322a;
            Iterator<String> it = bundle.keySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    Object obj = bundle.get(next);
                    if (!(obj instanceof String)) {
                        break;
                    }
                    String str = (String) obj;
                    if (next.startsWith("google.") || next.startsWith("gcm.") || next.equals("from") || next.equals("message_type") || next.equals("collapse_key")) {
                        break;
                    }
                    c8446b.put(next, str);
                }
            }
            this.f16323b = c8446b;
        }
        return this.f16323b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3827i(parcel, 2, this.f16322a);
        C0987y.m3839u(parcel, iM3836r);
    }
}
