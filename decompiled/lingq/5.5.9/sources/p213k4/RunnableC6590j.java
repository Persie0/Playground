package p213k4;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.util.Pair;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.GraphRequest;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.lingq.p055ui.home.library.LessonPreviewFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import dm.C5207g;
import ge.ScheduledFutureC5784h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import km.InterfaceC6727j;
import kotlin.collections.EmptyList;
import p029b8.ViewOnClickListenerC1341g;
import p131g5.InterfaceC5697a;
import p138gk.C5816f;
import p170i5.AbstractC6189h;
import p173i8.C6205a;
import p225kk.C6716m;
import p235l5.RunnableC7276w;
import p291o7.C7995e;
import p291o7.C8009s;
import p291o7.C8010t;
import p304ok.C8069e;
import p317p7.C8199f;
import p317p7.C8200g;
import p317p7.C8201h;
import p317p7.C8205l;
import p387t0.C9166r;
import p431v7.C9662f;
import p479xa.C10134c0;
import p479xa.C10150s;
import p505ya.C10332n;
import p505ya.InterfaceC10331m;
import p512yi.C10387o;
import p533ze.C10479a;
import p533ze.InterfaceC10480b;
import ph.C8334o0;
import ph.C8393z3;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: k4.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6590j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37473c;

    public /* synthetic */ RunnableC6590j(Object obj, int i10, Object obj2) {
        this.f37471a = i10;
        this.f37472b = obj;
        this.f37473c = obj2;
    }

    public /* synthetic */ RunnableC6590j(String str, String str2) {
        this.f37471a = 8;
        this.f37473c = str;
        this.f37472b = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.f37471a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C6591k c6591k = (C6591k) this.f37472b;
                String str = (String) this.f37473c;
                C5207g.m11111f(c6591k, "this$0");
                C5207g.m11111f(str, "$sql");
                EmptyList emptyList = EmptyList.f38032a;
                throw null;
            case 1:
                List list = (List) this.f37472b;
                AbstractC6189h abstractC6189h = (AbstractC6189h) this.f37473c;
                C5207g.m11111f(list, "$listenersList");
                C5207g.m11111f(abstractC6189h, "this$0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5697a) it.next()).mo12062a(abstractC6189h.f36049e);
                }
                return;
            case 2:
                RunnableC7276w runnableC7276w = (RunnableC7276w) this.f37472b;
                C1268a c1268a = (C1268a) this.f37473c;
                if (runnableC7276w.f40777a.f7924a instanceof AbstractFuture.C1262b) {
                    c1268a.cancel(true);
                    return;
                } else {
                    c1268a.m4768k(runnableC7276w.f40780d.mo4695a());
                    return;
                }
            case 3:
                C7995e c7995e = (C7995e) this.f37472b;
                C0166e.m776w(this.f37473c);
                C5207g.m11111f(c7995e, "this$0");
                c7995e.m15860a();
                return;
            case 4:
                ArrayList<Pair> arrayList = (ArrayList) this.f37472b;
                C8009s c8009s = (C8009s) this.f37473c;
                C5207g.m11111f(arrayList, "$callbacks");
                C5207g.m11111f(c8009s, "$requests");
                for (Pair pair : arrayList) {
                    GraphRequest.InterfaceC2278b interfaceC2278b = (GraphRequest.InterfaceC2278b) pair.first;
                    Object obj = pair.second;
                    C5207g.m11110e(obj, "pair.second");
                    interfaceC2278b.mo6614a((C8010t) obj);
                }
                Iterator it2 = c8009s.f43584d.iterator();
                while (it2.hasNext()) {
                    ((C8009s.a) it2.next()).mo15859a(c8009s);
                }
                return;
            case 5:
                AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) this.f37472b;
                AppEvent appEvent = (AppEvent) this.f37473c;
                String str2 = C8199f.f44386a;
                if (C6205a.m12742b(C8199f.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(accessTokenAppIdPair, "$accessTokenAppId");
                    C5207g.m11111f(appEvent, "$appEvent");
                    C9166r c9166r = C8199f.f44388c;
                    synchronized (c9166r) {
                        try {
                            C8205l c8205lM17489s = c9166r.m17489s(accessTokenAppIdPair);
                            if (c8205lM17489s != null) {
                                c8205lM17489s.m16342a(appEvent);
                                break;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    String str3 = C8201h.f44393c;
                    if (C8201h.a.m16337b() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && C8199f.f44388c.m17488q() > C8199f.f44387b) {
                        C8199f.m16324d(FlushReason.EVENT_THRESHOLD);
                        return;
                    }
                    if (C8199f.f44390e == null) {
                        C8199f.f44390e = C8199f.f44389d.schedule(C8199f.f44391f, 15L, TimeUnit.SECONDS);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C8199f.class, th3);
                }
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                AccessTokenAppIdPair accessTokenAppIdPair2 = (AccessTokenAppIdPair) this.f37472b;
                C8205l c8205l = (C8205l) this.f37473c;
                String str4 = C8199f.f44386a;
                if (C6205a.m12742b(C8199f.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(accessTokenAppIdPair2, "$accessTokenAppId");
                    C5207g.m11111f(c8205l, "$appEvents");
                    C8200g.m16327a(accessTokenAppIdPair2, c8205l);
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(C8199f.class, th4);
                    return;
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C9662f c9662f = (C9662f) this.f37472b;
                Runnable runnable = (Runnable) this.f37473c;
                C9662f.b bVar = C9662f.f49458s;
                if (C6205a.m12742b(C9662f.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(c9662f, "this$0");
                    C5207g.m11111f(runnable, "$queryPurchaseHistoryRunnable");
                    c9662f.m18125d(new ArrayList(c9662f.f49481r), runnable);
                    return;
                } catch (Throwable th5) {
                    C6205a.m12741a(C9662f.class, th5);
                    return;
                }
            case 8:
                String str5 = (String) this.f37473c;
                String str6 = (String) this.f37472b;
                C5207g.m11111f(str5, "$queriedEvent");
                C5207g.m11111f(str6, "$buttonText");
                HashSet hashSet = ViewOnClickListenerC1341g.f8155e;
                ViewOnClickListenerC1341g.a.m4924c(str5, str6, new float[0]);
                return;
            case 9:
                C2469s.a aVar = (C2469s.a) this.f37472b;
                Pair pair2 = (Pair) this.f37473c;
                C2469s.this.f12993h.mo6965r0(((Integer) pair2.first).intValue(), (InterfaceC2492i.b) pair2.second);
                return;
            case 10:
                InterfaceC2368b.a aVar2 = (InterfaceC2368b.a) this.f37472b;
                Exception exc = (Exception) this.f37473c;
                aVar2.getClass();
                int i11 = C10134c0.f51354a;
                aVar2.f11946b.mo6845l(exc);
                return;
            case 11:
                DefaultDrmSessionManager.C2392c c2392c = (DefaultDrmSessionManager.C2392c) this.f37472b;
                C2416m c2416m = (C2416m) this.f37473c;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f12167p != 0 && !c2392c.f12181c) {
                    Looper looper = defaultDrmSessionManager.f12171t;
                    looper.getClass();
                    c2392c.f12180b = defaultDrmSessionManager.m6951e(looper, c2392c.f12179a, c2416m, false);
                    defaultDrmSessionManager.f12165n.add(c2392c);
                    return;
                }
                return;
            case 12:
                C10150s c10150s = (C10150s) this.f37472b;
                C10150s.a aVar3 = (C10150s.a) this.f37473c;
                synchronized (c10150s.f51432c) {
                    try {
                        i10 = c10150s.f51433d;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                aVar3.mo18382a(i10);
                return;
            case 13:
                InterfaceC10331m.a aVar4 = (InterfaceC10331m.a) this.f37472b;
                C10332n c10332n = (C10332n) this.f37473c;
                aVar4.getClass();
                int i12 = C10134c0.f51354a;
                aVar4.f52010b.mo7047h(c10332n);
                return;
            case 14:
                Map.Entry entry = (Map.Entry) this.f37472b;
                ((InterfaceC10480b) entry.getKey()).mo5936a((C10479a) this.f37473c);
                return;
            case 15:
                Runnable runnable2 = (Runnable) this.f37472b;
                ScheduledFutureC5784h.b bVar2 = (ScheduledFutureC5784h.b) this.f37473c;
                try {
                    runnable2.run();
                    ScheduledFutureC5784h scheduledFutureC5784h = ScheduledFutureC5784h.this;
                    scheduledFutureC5784h.getClass();
                    if (AbstractResolvableFuture.f4754f.mo2635b(scheduledFutureC5784h, null, AbstractResolvableFuture.f4755g)) {
                        AbstractResolvableFuture.m2626i(scheduledFutureC5784h);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ((ScheduledFutureC5784h.a) bVar2).m12172a(e10);
                    return;
                }
            case 16:
                C8334o0 c8334o0 = (C8334o0) this.f37472b;
                LessonPreviewFragment lessonPreviewFragment = (LessonPreviewFragment) this.f37473c;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
                C5207g.m11111f(c8334o0, "$this_with");
                C5207g.m11111f(lessonPreviewFragment, "this$0");
                WebChromeClient webChromeClient = new WebChromeClient();
                WebView webView = c8334o0.f45101e;
                webView.setWebChromeClient(webChromeClient);
                webView.setWebViewClient(new LessonPreviewFragment.C3744a(lessonPreviewFragment));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.setLayerType(2, null);
                webView.setBackgroundColor(Color.argb(1, 0, 0, 0));
                webView.loadUrl(((C10387o) lessonPreviewFragment.f24533C0.getValue()).f52176b);
                return;
            case 17:
                RecyclerView.AbstractC1109b0 abstractC1109b0 = (RecyclerView.AbstractC1109b0) this.f37472b;
                TokenFragment tokenFragment = (TokenFragment) this.f37473c;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5816f.d dVar = (C5816f.d) abstractC1109b0;
                dVar.f35115u.f45508b.requestFocus();
                C8393z3 c8393z3 = dVar.f35115u;
                EditText editText = c8393z3.f45508b;
                editText.setSelection(editText.length());
                List<Integer> list2 = C6716m.f37937a;
                Context contextM3578a0 = tokenFragment.m3578a0();
                EditText editText2 = c8393z3.f45508b;
                C5207g.m11110e(editText2, "holder.binding.etHint");
                Object systemService = contextM3578a0.getSystemService("input_method");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(editText2, 1);
                return;
            default:
                C8069e c8069e = (C8069e) this.f37472b;
                PlayerConstants$PlayerError playerConstants$PlayerError = (PlayerConstants$PlayerError) this.f37473c;
                C5207g.m11111f(c8069e, "this$0");
                C5207g.m11111f(playerConstants$PlayerError, "$playerError");
                C8069e.a aVar5 = c8069e.f43770a;
                Iterator<T> it3 = aVar5.getListeners().iterator();
                while (it3.hasNext()) {
                    ((InterfaceC8403d) it3.next()).mo16422a(aVar5.getInstance(), playerConstants$PlayerError);
                }
                return;
        }
    }
}
