package p174i9;

import ae.C0065e;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C3246i;
import com.google.firebase.messaging.C3252o;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5750f;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6224n implements C10144m.a, InterfaceC5750f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36191c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36192d;

    public /* synthetic */ C6224n(int i10, Object obj, Object obj2, Object obj3) {
        this.f36189a = i10;
        this.f36190b = obj;
        this.f36191c = obj2;
        this.f36192d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g mo428f(Object obj) {
        C3260w c3260w;
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f36190b;
        String str2 = (String) this.f36191c;
        C3260w.a aVar = (C3260w.a) this.f36192d;
        String str3 = (String) obj;
        Context context = firebaseMessaging.f16310d;
        synchronized (FirebaseMessaging.class) {
            try {
                if (FirebaseMessaging.f16304m == null) {
                    FirebaseMessaging.f16304m = new C3260w(context);
                }
                c3260w = FirebaseMessaging.f16304m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0065e c0065e = firebaseMessaging.f16307a;
        c0065e.m437a();
        String strM438c = "[DEFAULT]".equals(c0065e.f172b) ? "" : c0065e.m438c();
        C3252o c3252o = firebaseMessaging.f16316j;
        synchronized (c3252o) {
            try {
                if (c3252o.f16410b == null) {
                    c3252o.m9274d();
                }
                str = c3252o.f16410b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (c3260w) {
            String strM9294a = C3260w.a.m9294a(System.currentTimeMillis(), str3, str);
            if (strM9294a != null) {
                SharedPreferences.Editor editorEdit = c3260w.f16447a.edit();
                editorEdit.putString(strM438c + "|T|" + str2 + "|*", strM9294a);
                editorEdit.commit();
            }
        }
        if (aVar == null || !str3.equals(aVar.f16449a)) {
            C0065e c0065e2 = firebaseMessaging.f16307a;
            c0065e2.m437a();
            if ("[DEFAULT]".equals(c0065e2.f172b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    c0065e2.m437a();
                    sb2.append(c0065e2.f172b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str3);
                new C3246i(firebaseMessaging.f16310d).m9263b(intent);
            }
        }
        return Tasks.m8539c(str3);
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        switch (this.f36189a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC6208b.a aVar = (InterfaceC6208b.a) this.f36190b;
                C2416m c2416m = (C2416m) this.f36191c;
                InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
                interfaceC6208b.getClass();
                interfaceC6208b.mo12766A(aVar, c2416m);
                break;
            default:
                ((InterfaceC6208b) obj).mo12776K();
                break;
        }
    }
}
