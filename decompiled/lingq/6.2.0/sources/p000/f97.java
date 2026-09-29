package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.facebook.login.C0930d;
import com.facebook.login.C0931e;
import com.facebook.login.C0935i;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f97 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f38676a;

    /* JADX INFO: renamed from: b */
    public final HandlerC3718wd f38677b;

    /* JADX INFO: renamed from: c */
    public vg1 f38678c;

    /* JADX INFO: renamed from: d */
    public boolean f38679d;

    /* JADX INFO: renamed from: e */
    public Messenger f38680e;

    /* JADX INFO: renamed from: f */
    public final int f38681f;

    /* JADX INFO: renamed from: g */
    public final int f38682g;

    /* JADX INFO: renamed from: h */
    public final String f38683h;

    /* JADX INFO: renamed from: i */
    public final String f38684i;

    /* JADX INFO: renamed from: j */
    public final int f38685j;

    /* JADX INFO: renamed from: k */
    public final String f38686k;

    public f97(Context context, String str, String str2, String str3) {
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.f38676a = applicationContext != null ? applicationContext : context;
        this.f38681f = 65536;
        this.f38682g = 65537;
        this.f38683h = str;
        this.f38684i = str2;
        this.f38685j = 20121101;
        this.f38686k = str3;
        this.f38677b = new HandlerC3718wd(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m11619a(Bundle bundle) {
        if (this.f38679d) {
            this.f38679d = false;
            vg1 vg1Var = this.f38678c;
            if (vg1Var != null) {
                GetTokenLoginMethodHandler getTokenLoginMethodHandler = (GetTokenLoginMethodHandler) vg1Var.f65341b;
                LoginClient.Request request = (LoginClient.Request) vg1Var.f65342c;
                request.getClass();
                C0930d c0930d = getTokenLoginMethodHandler.f11439c;
                if (c0930d != null) {
                    c0930d.f38678c = null;
                }
                getTokenLoginMethodHandler.f11439c = null;
                web webVar = getTokenLoginMethodHandler.m5240d().f11448e;
                if (webVar != null) {
                    View view = ((C0935i) webVar.f66742a).f11506A0;
                    if (view == null) {
                        fa4.m11636J("progressBar");
                        throw null;
                    }
                    view.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = EmptyList.f47638a;
                    }
                    Set<String> set = request.f11465b;
                    if (set == null) {
                        set = EmptySet.f47640a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        getTokenLoginMethodHandler.m5240d().m5226j();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            getTokenLoginMethodHandler.m5215l(bundle, request);
                            return;
                        }
                        web webVar2 = getTokenLoginMethodHandler.m5240d().f11448e;
                        if (webVar2 != null) {
                            View view2 = ((C0935i) webVar2.f66742a).f11506A0;
                            if (view2 == null) {
                                fa4.m11636J("progressBar");
                                throw null;
                            }
                            view2.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            bna.m3933V(new C0931e(bundle, getTokenLoginMethodHandler, request), string3);
                            return;
                        } else {
                            C3386nv.m17633t("Required value was null.");
                            return;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        getTokenLoginMethodHandler.m5238a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    request.f11465b = hashSet;
                }
                getTokenLoginMethodHandler.m5240d().m5226j();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.f38680e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f38683h);
        String str = this.f38686k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.f38684i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f38681f);
        messageObtain.arg1 = this.f38685j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f38677b);
        try {
            Messenger messenger = this.f38680e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            m11619a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.f38680e = null;
        try {
            this.f38676a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m11619a(null);
    }
}
