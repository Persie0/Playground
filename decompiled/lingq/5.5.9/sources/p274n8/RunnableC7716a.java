package p274n8;

import android.os.Bundle;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import com.lingq.commons.p053ui.views.ScrollingPagerIndicator;
import dm.C5207g;
import ga.C5726i;
import ge.ScheduledExecutorServiceC5783g;
import ge.ScheduledFutureC5784h;
import jp.C6540h;
import jp.InterfaceC6536d;
import p080e.RunnableC5286r;
import p174i9.InterfaceC6206a;
import p218k9.C6637g;
import p479xa.C10134c0;
import p505ya.InterfaceC10331m;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7716a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42246c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f42247d;

    public /* synthetic */ RunnableC7716a(int i10, Object obj, Object obj2, Object obj3) {
        this.f42244a = i10;
        this.f42245b = obj;
        this.f42246c = obj2;
        this.f42247d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42244a;
        Object obj = this.f42247d;
        Object obj2 = this.f42246c;
        Object obj3 = this.f42245b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                CustomTabLoginMethodHandler customTabLoginMethodHandler = (CustomTabLoginMethodHandler) obj3;
                LoginClient.Request request = (LoginClient.Request) obj2;
                Bundle bundle = (Bundle) obj;
                C5207g.m11111f(customTabLoginMethodHandler, "this$0");
                C5207g.m11111f(request, "$request");
                C5207g.m11111f(bundle, "$values");
                try {
                    customTabLoginMethodHandler.m6719l(bundle, request);
                    customTabLoginMethodHandler.m6728x(request, bundle, null);
                } catch (FacebookException e10) {
                    customTabLoginMethodHandler.m6728x(request, null, e10);
                    return;
                }
                break;
            case 1:
                Pair pair = (Pair) obj2;
                InterfaceC6206a interfaceC6206a = ((C2469s.a) obj3).f12999b.f12993h;
                int iIntValue = ((Integer) pair.first).intValue();
                InterfaceC2492i.b bVar = (InterfaceC2492i.b) pair.second;
                bVar.getClass();
                interfaceC6206a.mo7240d0(iIntValue, bVar, (C5726i) obj);
                break;
            case 2:
                InterfaceC2493j.a aVar = (InterfaceC2493j.a) obj3;
                ((InterfaceC2493j) obj2).mo7242g0(aVar.f13289a, aVar.f13290b, (C5726i) obj);
                break;
            case 3:
                InterfaceC10331m.a aVar2 = (InterfaceC10331m.a) obj3;
                aVar2.getClass();
                int i11 = C10134c0.f51354a;
                InterfaceC10331m interfaceC10331m = aVar2.f52010b;
                interfaceC10331m.getClass();
                interfaceC10331m.mo7051q((C2416m) obj2, (C6637g) obj);
                break;
            case 4:
                ScheduledExecutorServiceC5783g scheduledExecutorServiceC5783g = (ScheduledExecutorServiceC5783g) obj3;
                scheduledExecutorServiceC5783g.getClass();
                scheduledExecutorServiceC5783g.f34984a.execute(new RunnableC5286r((Runnable) obj2, (ScheduledFutureC5784h.b) obj));
                break;
            case 5:
                ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) obj3;
                ScrollingPagerIndicator.InterfaceC3283a interfaceC3283a = (ScrollingPagerIndicator.InterfaceC3283a) obj;
                int i12 = ScrollingPagerIndicator.f16790Q;
                C5207g.m11111f(scrollingPagerIndicator, "this$0");
                C5207g.m11111f(interfaceC3283a, "$attacher");
                scrollingPagerIndicator.f16791H = -1;
                scrollingPagerIndicator.m9368b(obj2, interfaceC3283a);
                break;
            default:
                ((InterfaceC6536d) obj2).mo13129a(((C6540h.a.C10643a) obj3).f37218b, (Throwable) obj);
                break;
        }
    }
}
