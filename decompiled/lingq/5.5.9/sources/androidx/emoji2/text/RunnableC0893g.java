package androidx.emoji2.text;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.android.gms.internal.play_billing.C2933a;
import com.google.android.gms.internal.play_billing.zzu;
import com.lingq.p055ui.token.DictionaryData;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment;
import com.lingq.p055ui.token.dictionaries.DictionaryContentFragment.C4893b;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import jp.C6540h;
import jp.C6553u;
import jp.InterfaceC6536d;
import ni.C7796d;
import org.json.JSONException;
import p118fe.C5509a;
import p205jk.C6505a;
import p213k4.C6591k;
import p213k4.C6592l;
import p288o4.InterfaceC7919e;
import p289o5.C7922b;
import p289o5.C7928h;
import p289o5.C7939s;
import p289o5.RunnableC7943w;
import ph.C8298i0;

/* JADX INFO: renamed from: androidx.emoji2.text.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0893g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6005d;

    public /* synthetic */ RunnableC0893g(int i10, Object obj, Object obj2, Object obj3) {
        this.f6002a = i10;
        this.f6003b = obj;
        this.f6004c = obj2;
        this.f6005d = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f6002a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                EmojiCompatInitializer.C0885b c0885b = (EmojiCompatInitializer.C0885b) this.f6003b;
                C0892f.i iVar = (C0892f.i) this.f6004c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f6005d;
                c0885b.getClass();
                try {
                    C0899m c0899mM3515a = C0889c.m3515a(c0885b.f5977a);
                    if (c0899mM3515a == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0899m.b bVar = (C0899m.b) c0899mM3515a.f5997a;
                    synchronized (bVar.f6030d) {
                        try {
                            bVar.f6032f = threadPoolExecutor;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    c0899mM3515a.f5997a.mo3513a(new C0894h(iVar, threadPoolExecutor));
                    return;
                } catch (Throwable th3) {
                    iVar.mo3517a(th3);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                C6591k c6591k = (C6591k) this.f6003b;
                InterfaceC7919e interfaceC7919e = (InterfaceC7919e) this.f6004c;
                C6592l c6592l = (C6592l) this.f6005d;
                C5207g.m11111f(c6591k, "this$0");
                C5207g.m11111f(interfaceC7919e, "$query");
                C5207g.m11111f(c6592l, "$queryInterceptorProgram");
                interfaceC7919e.mo13196b();
                throw null;
            case 2:
                NativeAppLoginMethodHandler nativeAppLoginMethodHandler = (NativeAppLoginMethodHandler) this.f6003b;
                LoginClient.Request request = (LoginClient.Request) this.f6004c;
                Bundle bundle = (Bundle) this.f6005d;
                C5207g.m11111f(nativeAppLoginMethodHandler, "this$0");
                C5207g.m11111f(request, "$request");
                C5207g.m11111f(bundle, "$extras");
                try {
                    nativeAppLoginMethodHandler.m6719l(bundle, request);
                    nativeAppLoginMethodHandler.m6726z(bundle, request);
                    return;
                } catch (FacebookServiceException e10) {
                    FacebookRequestError facebookRequestError = e10.f11447b;
                    nativeAppLoginMethodHandler.m6725x(request, facebookRequestError.f11441d, facebookRequestError.m6602a(), String.valueOf(facebookRequestError.f11439b));
                    return;
                } catch (FacebookException e11) {
                    nativeAppLoginMethodHandler.m6725x(request, null, e11.getMessage(), null);
                    return;
                }
            case 3:
                TokenFragment tokenFragment = (TokenFragment) this.f6003b;
                TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) this.f6004c;
                TokenData tokenData = (TokenData) this.f6005d;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(tokenRelatedPhrase, "$it");
                C5207g.m11111f(tokenData, "$tokenData");
                C7796d c7796d = tokenFragment.f31219Q0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "viewed_related_phrase");
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                tokenViewModelM10363o0.f31413L.mo10028I0(tokenRelatedPhrase, tokenFragment.f31204B0, tokenFragment.f31203A0, tokenData.f31183i);
                return;
            case 4:
                C8298i0 c8298i0 = (C8298i0) this.f6003b;
                DictionaryContentFragment dictionaryContentFragment = (DictionaryContentFragment) this.f6004c;
                DictionaryData dictionaryData = (DictionaryData) this.f6005d;
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                C5207g.m11111f(c8298i0, "$this_with");
                C5207g.m11111f(dictionaryContentFragment, "this$0");
                C5207g.m11111f(dictionaryData, "$data");
                WebChromeClient webChromeClient = new WebChromeClient();
                WebView webView = c8298i0.f44883k;
                webView.setWebChromeClient(webChromeClient);
                webView.setWebViewClient(dictionaryContentFragment.new C4893b());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.setLayerType(2, null);
                webView.setBackgroundColor(Color.argb(1, 0, 0, 0));
                webView.loadUrl(dictionaryData.f31172b);
                return;
            case 5:
                C6505a c6505a = (C6505a) this.f6003b;
                final C7928h c7928h = (C7928h) this.f6004c;
                InterfaceC2052l interfaceC2052l = (InterfaceC2052l) this.f6005d;
                C5207g.m11111f(c6505a, "this$0");
                C5207g.m11111f(c7928h, "$queryProductDetailsParams");
                C5207g.m11111f(interfaceC2052l, "$result");
                final C7922b c7922b = c6505a.f37120c;
                final C5509a c5509a = new C5509a(23, interfaceC2052l);
                if (!c7922b.m15738k0()) {
                    c5509a.m11742l(C7939s.f43250j, new ArrayList());
                    return;
                } else if (c7922b.f43154J) {
                    if (c7922b.m15742o0(new Callable() { // from class: o5.v
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String strM8512d;
                            C7922b c7922b2 = c7922b;
                            C7928h c7928h2 = c7928h;
                            C5509a c5509a2 = c5509a;
                            c7922b2.getClass();
                            ArrayList arrayList = new ArrayList();
                            int iM8509a = 0;
                            String str = ((C7928h.b) c7928h2.f43206a.get(0)).f43209b;
                            zzu zzuVar = c7928h2.f43206a;
                            int size = zzuVar.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    strM8512d = "";
                                    break;
                                }
                                int i11 = i10 + 20;
                                ArrayList arrayList2 = new ArrayList(zzuVar.subList(i10, i11 > size ? size : i11));
                                ArrayList<String> arrayList3 = new ArrayList<>();
                                int size2 = arrayList2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    arrayList3.add(((C7928h.b) arrayList2.get(i12)).f43208a);
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                                bundle2.putString("playBillingLibraryVersion", c7922b2.f43159b);
                                try {
                                    Bundle bundleMo19177t0 = c7922b2.f43163f.mo19177t0(c7922b2.f43162e.getPackageName(), str, bundle2, C2933a.m8510b(c7922b2.f43159b, arrayList2));
                                    if (bundleMo19177t0 != null) {
                                        if (bundleMo19177t0.containsKey("DETAILS_LIST")) {
                                            ArrayList<String> stringArrayList = bundleMo19177t0.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList == null) {
                                                C2933a.m8515g("BillingClient", "queryProductDetailsAsync got null response list");
                                            } else {
                                                for (int i13 = 0; i13 < stringArrayList.size(); i13++) {
                                                    try {
                                                        C7926f c7926f = new C7926f(stringArrayList.get(i13));
                                                        C2933a.m8514f("BillingClient", "Got product details: ".concat(c7926f.toString()));
                                                        arrayList.add(c7926f);
                                                    } catch (JSONException e12) {
                                                        C2933a.m8516h("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e12);
                                                        strM8512d = "Error trying to decode SkuDetails.";
                                                    }
                                                }
                                                i10 = i11;
                                            }
                                        } else {
                                            iM8509a = C2933a.m8509a(bundleMo19177t0, "BillingClient");
                                            strM8512d = C2933a.m8512d(bundleMo19177t0, "BillingClient");
                                            if (iM8509a != 0) {
                                                C2933a.m8515g("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iM8509a);
                                                break;
                                            }
                                            C2933a.m8515g("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                        }
                                        iM8509a = 6;
                                        break;
                                    }
                                    C2933a.m8515g("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                    iM8509a = 4;
                                    strM8512d = "Item is unavailable for purchase.";
                                    break;
                                } catch (Exception e13) {
                                    C2933a.m8516h("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
                                    strM8512d = "An internal error occurred.";
                                }
                            }
                            C7925e c7925e = new C7925e();
                            c7925e.f43186a = iM8509a;
                            c7925e.f43187b = strM8512d;
                            c5509a2.m11742l(c7925e, arrayList);
                            return null;
                        }
                    }, 30000L, new RunnableC7943w(0, c5509a), c7922b.m15739l0()) == null) {
                        c5509a.m11742l(c7922b.m15741n0(), new ArrayList());
                    }
                    return;
                } else {
                    C2933a.m8515g("BillingClient", "Querying product details is not supported.");
                    c5509a.m11742l(C7939s.f43255o, new ArrayList());
                    return;
                }
            default:
                C6540h.a.C10643a c10643a = (C6540h.a.C10643a) this.f6003b;
                InterfaceC6536d interfaceC6536d = (InterfaceC6536d) this.f6004c;
                C6553u c6553u = (C6553u) this.f6005d;
                C6540h.a aVar = C6540h.a.this;
                if (aVar.f37216b.mo13124l()) {
                    interfaceC6536d.mo13129a(aVar, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC6536d.mo13130b(aVar, c6553u);
                    return;
                }
        }
    }
}
