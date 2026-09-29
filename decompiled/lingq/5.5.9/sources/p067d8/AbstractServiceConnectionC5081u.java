package p067d8;

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
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import dm.C5207g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import p274n8.C7721f;
import p274n8.C7722g;
import p290o6.C7946b;

/* JADX INFO: renamed from: d8.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC5081u implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f33000a;

    /* JADX INFO: renamed from: b */
    public final HandlerC5080t f33001b;

    /* JADX INFO: renamed from: c */
    public a f33002c;

    /* JADX INFO: renamed from: d */
    public boolean f33003d;

    /* JADX INFO: renamed from: e */
    public Messenger f33004e;

    /* JADX INFO: renamed from: f */
    public final int f33005f;

    /* JADX INFO: renamed from: g */
    public final int f33006g;

    /* JADX INFO: renamed from: h */
    public final String f33007h;

    /* JADX INFO: renamed from: i */
    public final int f33008i;

    /* JADX INFO: renamed from: j */
    public final String f33009j;

    /* JADX INFO: renamed from: d8.u$a */
    public interface a {
    }

    public AbstractServiceConnectionC5081u(Context context, String str, String str2) {
        C5207g.m11111f(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f33000a = applicationContext != null ? applicationContext : context;
        this.f33005f = 65536;
        this.f33006g = 65537;
        this.f33007h = str;
        this.f33008i = 20121101;
        this.f33009j = str2;
        this.f33001b = new HandlerC5080t(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m10799a(Bundle bundle) {
        if (this.f33003d) {
            this.f33003d = false;
            a aVar = this.f33002c;
            if (aVar == null) {
                return;
            }
            C7946b c7946b = (C7946b) aVar;
            GetTokenLoginMethodHandler getTokenLoginMethodHandler = (GetTokenLoginMethodHandler) c7946b.f43280b;
            LoginClient.Request request = (LoginClient.Request) c7946b.f43281c;
            C5207g.m11111f(getTokenLoginMethodHandler, "this$0");
            C5207g.m11111f(request, "$request");
            C7721f c7721f = getTokenLoginMethodHandler.f11596c;
            if (c7721f != null) {
                c7721f.f33002c = null;
            }
            getTokenLoginMethodHandler.f11596c = null;
            LoginClient.InterfaceC2322a interfaceC2322a = getTokenLoginMethodHandler.m6717d().f11605e;
            if (interfaceC2322a != null) {
                interfaceC2322a.mo6714b();
            }
            if (bundle != null) {
                List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                if (stringArrayList == null) {
                    stringArrayList = EmptyList.f38032a;
                }
                Set set = request.f11620b;
                if (set == null) {
                    set = EmptySet.f38034a;
                }
                String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                if (set.contains("openid")) {
                    if (string == null || string.length() == 0) {
                        getTokenLoginMethodHandler.m6717d().m6711n();
                        return;
                    }
                }
                if (stringArrayList.containsAll(set)) {
                    String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                    if (!(string2 == null || string2.length() == 0)) {
                        getTokenLoginMethodHandler.m6700r(bundle, request);
                        return;
                    }
                    LoginClient.InterfaceC2322a interfaceC2322a2 = getTokenLoginMethodHandler.m6717d().f11605e;
                    if (interfaceC2322a2 != null) {
                        interfaceC2322a2.mo6713a();
                    }
                    String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                    if (string3 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    C5086z.m10831p(new C7722g(bundle, getTokenLoginMethodHandler, request), string3);
                    return;
                }
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        String str = (String) it.next();
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                }
                if (!hashSet.isEmpty()) {
                    getTokenLoginMethodHandler.m6715a(TextUtils.join(",", hashSet), "new_permissions");
                }
                request.f11620b = hashSet;
            }
            getTokenLoginMethodHandler.m6717d().m6711n();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C5207g.m11111f(componentName, "name");
        C5207g.m11111f(iBinder, "service");
        this.f33004e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f33007h);
        String str = this.f33009j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f33005f);
        messageObtain.arg1 = this.f33008i;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f33001b);
        try {
            Messenger messenger = this.f33004e;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            m10799a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5207g.m11111f(componentName, "name");
        this.f33004e = null;
        try {
            this.f33000a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m10799a(null);
    }
}
