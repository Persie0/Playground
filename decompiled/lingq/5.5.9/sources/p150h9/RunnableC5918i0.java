package p150h9;

import android.content.Intent;
import android.util.Pair;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.firebase.messaging.AbstractServiceC3245h;
import dm.C5207g;
import ge.ScheduledExecutorServiceC5783g;
import ge.ScheduledFutureC5784h;
import java.util.List;
import kotlin.collections.C6752c;
import p136gc.C5752h;
import p213k4.RunnableC6590j;
import p218k9.C6637g;
import p479xa.C10134c0;

/* JADX INFO: renamed from: h9.i0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5918i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35308c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35309d;

    public /* synthetic */ RunnableC5918i0(int i10, Object obj, Object obj2, Object obj3) {
        this.f35306a = i10;
        this.f35307b = obj;
        this.f35308c = obj2;
        this.f35309d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35306a;
        Object obj = this.f35309d;
        Object obj2 = this.f35308c;
        Object obj3 = this.f35307b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Pair pair = (Pair) obj2;
                ((C2469s.a) obj3).f12999b.f12993h.mo6966y(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, (Exception) obj);
                return;
            case 1:
                InterfaceC2368b.a aVar = (InterfaceC2368b.a) obj3;
                aVar.getClass();
                int i11 = C10134c0.f51354a;
                InterfaceC2368b interfaceC2368b = aVar.f11946b;
                interfaceC2368b.getClass();
                interfaceC2368b.mo6843i((C2416m) obj2, (C6637g) obj);
                return;
            case 2:
                ((AdsMediaSource.C2472a) obj3).getClass();
                int i12 = AdsMediaSource.f13032d;
                throw null;
            case 3:
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = (ScheduledExecutorServiceC5783g) obj3;
                scheduledExecutorServiceC5783g.getClass();
                scheduledExecutorServiceC5783g.f34984a.execute(new RunnableC6590j((Runnable) obj2, 15, (ScheduledFutureC5784h.b) obj));
                return;
            case 4:
                ((AbstractServiceC3245h) obj3).lambda$processIntent$0((Intent) obj2, (C5752h) obj);
                return;
            default:
                WebView webView = (WebView) obj3;
                String str = (String) obj2;
                List list = (List) obj;
                C5207g.m11111f(webView, "$this_invoke");
                C5207g.m11111f(str, "$function");
                C5207g.m11111f(list, "$stringArgs");
                webView.loadUrl("javascript:" + str + '(' + C6752c.m13430X(list, ",", null, null, null, 62) + ')');
                return;
        }
    }
}
