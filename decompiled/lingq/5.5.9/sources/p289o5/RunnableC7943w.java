package p289o5;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value;
import cc.C1782b6;
import cc.C1860k3;
import cc.C1879m4;
import cc.C1881m6;
import cc.C1897o4;
import cc.C1934s5;
import cc.C1936s7;
import cc.C1986y3;
import cc.ServiceConnectionC1872l6;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p115fb.AbstractC5498n;
import p115fb.C5496l;
import p115fb.ServiceConnectionC5495k;
import p118fe.C5509a;
import p152hb.C6008s0;

/* JADX INFO: renamed from: o5.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7943w implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43265a;

    /* JADX INFO: renamed from: b */
    public final Object f43266b;

    public /* synthetic */ RunnableC7943w(int i10, Object obj) {
        this.f43265a = i10;
        this.f43266b = obj;
    }

    public RunnableC7943w(Runnable runnable) {
        this.f43265a = 4;
        this.f43266b = runnable;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43265a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C5509a) this.f43266b).m11742l(C7939s.f43251k, new ArrayList());
                return;
            case 1:
                ServiceConnectionC5495k serviceConnectionC5495k = (ServiceConnectionC5495k) this.f43266b;
                while (true) {
                    synchronized (serviceConnectionC5495k) {
                        try {
                            if (serviceConnectionC5495k.f34094a != 2) {
                                return;
                            }
                            if (serviceConnectionC5495k.f34097d.isEmpty()) {
                                serviceConnectionC5495k.m11720c();
                                return;
                            }
                            AbstractC5498n<?> abstractC5498n = (AbstractC5498n) serviceConnectionC5495k.f34097d.poll();
                            serviceConnectionC5495k.f34098e.put(abstractC5498n.f34102a, abstractC5498n);
                            serviceConnectionC5495k.f34099f.f34108b.schedule(new RunnableC7933m(serviceConnectionC5495k, 1, abstractC5498n), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String strValueOf = String.valueOf(abstractC5498n);
                                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
                                sb2.append("Sending ");
                                sb2.append(strValueOf);
                                Log.d("MessengerIpcClient", sb2.toString());
                            }
                            Context context = serviceConnectionC5495k.f34099f.f34107a;
                            Messenger messenger = serviceConnectionC5495k.f34095b;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = abstractC5498n.f34104c;
                            messageObtain.arg1 = abstractC5498n.f34102a;
                            messageObtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", abstractC5498n.mo11723b());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", abstractC5498n.f34105d);
                            messageObtain.setData(bundle);
                            try {
                                C5496l c5496l = serviceConnectionC5495k.f34096c;
                                Messenger messenger2 = (Messenger) c5496l.f34100a;
                                if (messenger2 != null) {
                                    messenger2.send(messageObtain);
                                } else {
                                    zzd zzdVar = (zzd) c5496l.f34101b;
                                    if (zzdVar == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                    }
                                    Messenger messenger3 = zzdVar.f13854a;
                                    messenger3.getClass();
                                    messenger3.send(messageObtain);
                                }
                            } catch (RemoteException e10) {
                                serviceConnectionC5495k.m11718a(e10.getMessage(), 2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                break;
            case 2:
                ((C6008s0) this.f43266b).m12457e();
                return;
            case 4:
                Process.setThreadPriority(0);
                ((Runnable) this.f43266b).run();
                return;
            case 5:
                C1936s7 c1936s7 = ((C1934s5) this.f43266b).f10186I;
                C1897o4 c1897o4 = c1936s7.f10200a;
                C1879m4 c1879m4 = c1897o4.f10087j;
                C1897o4.m5776k(c1879m4);
                c1879m4.mo5748g();
                if (c1936s7.m5887b()) {
                    boolean zM5888c = c1936s7.m5888c();
                    C1934s5 c1934s5 = c1897o4.f10060K;
                    C1986y3 c1986y3 = c1897o4.f10085h;
                    if (zM5888c) {
                        C1897o4.m5774i(c1986y3);
                        c1986y3.f10398P.m5914b(null);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "(not set)");
                        bundle2.putString("medium", "(not set)");
                        bundle2.putString("_cis", "intent");
                        bundle2.putLong("_cc", 1L);
                        C1897o4.m5775j(c1934s5);
                        c1934s5.m5871o("auto", "_cmpx", bundle2);
                    } else {
                        C1897o4.m5774i(c1986y3);
                        String strM5913a = c1986y3.f10398P.m5913a();
                        if (TextUtils.isEmpty(strM5913a)) {
                            C1860k3 c1860k3 = c1897o4.f10086i;
                            C1897o4.m5776k(c1860k3);
                            c1860k3.f9943g.m5623a("Cache still valid but referrer not found");
                        } else {
                            long jM5897a = c1986y3.f10399Q.m5897a() / 3600000;
                            Uri uri = Uri.parse(strM5913a);
                            Bundle bundle3 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle3);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle3.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jM5897a - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C1897o4.m5775j(c1934s5);
                            c1934s5.m5871o(str2, "_cmp", (Bundle) pair.second);
                        }
                        c1986y3.f10398P.m5914b(null);
                    }
                    C1897o4.m5774i(c1986y3);
                    c1986y3.f10399Q.m5898b(0L);
                    return;
                }
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C1782b6) this.f43266b).f9692j = null;
                return;
        }
        ServiceConnectionC1872l6 serviceConnectionC1872l6 = (ServiceConnectionC1872l6) this.f43266b;
        C1881m6 c1881m6 = serviceConnectionC1872l6.f9984c;
        Context context2 = ((C1897o4) c1881m6.f10430a).f10076a;
        ((C1897o4) serviceConnectionC1872l6.f9984c.f10430a).getClass();
        C1881m6.m5757u(c1881m6, new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
