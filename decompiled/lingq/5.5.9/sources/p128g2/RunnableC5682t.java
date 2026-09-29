package p128g2;

import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.motion.widget.C0755c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.widget.LoginButton;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2415l;
import com.google.android.exoplayer2.C2534w;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.firebase.messaging.C3250m;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackRate;
import dm.C5207g;
import ge.ScheduledFutureC5784h;
import ge.ThreadFactoryC5777a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.collections.EmptyList;
import p118fe.C5526r;
import p136gc.C5752h;
import p150h9.C5920j0;
import p150h9.C5922k0;
import p173i8.C6205a;
import p181ii.C6336e;
import p213k4.C6591k;
import p213k4.ExecutorC6598r;
import p218k9.C6635e;
import p286o2.RunnableC7907g;
import p291o7.C8004n;
import p304ok.C8069e;
import p317p7.C8201h;
import p333q7.ViewTreeObserverOnGlobalFocusChangeListenerC8503e;
import p382s7.C8968a;
import p382s7.C8974g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p505ya.InterfaceC10331m;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: g2.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5682t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f34665c;

    public /* synthetic */ RunnableC5682t(Object obj, int i10, Object obj2) {
        this.f34663a = i10;
        this.f34664b = obj;
        this.f34665c = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        InterfaceC2004a.a<T> aVar;
        boolean z11 = true;
        int i10 = 0;
        switch (this.f34663a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C0755c c0755c = (C0755c) this.f34664b;
                View[] viewArr = (View[]) this.f34665c;
                if (c0755c.f5233p != -1) {
                    for (View view : viewArr) {
                        view.setTag(c0755c.f5233p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (c0755c.f5234q != -1) {
                    int length = viewArr.length;
                    while (i10 < length) {
                        viewArr[i10].setTag(c0755c.f5234q, null);
                        i10++;
                    }
                    return;
                }
                return;
            case 1:
                C6591k c6591k = (C6591k) this.f34664b;
                String str = (String) this.f34665c;
                C5207g.m11111f(c6591k, "this$0");
                C5207g.m11111f(str, "$query");
                EmptyList emptyList = EmptyList.f38032a;
                throw null;
            case 2:
                Runnable runnable = (Runnable) this.f34664b;
                ExecutorC6598r executorC6598r = (ExecutorC6598r) this.f34665c;
                C5207g.m11111f(runnable, "$command");
                C5207g.m11111f(executorC6598r, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC6598r.m13202a();
                }
            case 3:
                View view2 = (View) this.f34664b;
                ViewTreeObserverOnGlobalFocusChangeListenerC8503e viewTreeObserverOnGlobalFocusChangeListenerC8503e = (ViewTreeObserverOnGlobalFocusChangeListenerC8503e) this.f34665c;
                HashMap map = ViewTreeObserverOnGlobalFocusChangeListenerC8503e.f45749e;
                if (C6205a.m12742b(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(view2, "$view");
                    C5207g.m11111f(viewTreeObserverOnGlobalFocusChangeListenerC8503e, "this$0");
                    if (view2 instanceof EditText) {
                        viewTreeObserverOnGlobalFocusChangeListenerC8503e.m16606b(view2);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewTreeObserverOnGlobalFocusChangeListenerC8503e.class, th2);
                    return;
                }
            case 4:
                String str2 = (String) this.f34664b;
                Bundle bundle = (Bundle) this.f34665c;
                C8968a c8968a = C8968a.f46984a;
                if (C6205a.m12742b(C8968a.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(str2, "$eventName");
                    C5207g.m11111f(bundle, "$parameters");
                    new C8201h(C8004n.m15871a(), (String) null).m16332d(bundle, str2);
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C8968a.class, th3);
                    return;
                }
            case 5:
                C8974g c8974g = (C8974g) this.f34664b;
                TimerTask timerTask = (TimerTask) this.f34665c;
                String str3 = C8974g.f47025e;
                if (C6205a.m12742b(C8974g.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(c8974g, "this$0");
                    C5207g.m11111f(timerTask, "$indexingTask");
                    try {
                        Timer timer = c8974g.f47028c;
                        if (timer != null) {
                            timer.cancel();
                        }
                        c8974g.f47029d = null;
                        Timer timer2 = new Timer();
                        timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                        c8974g.f47028c = timer2;
                        return;
                    } catch (Exception e10) {
                        Log.e(C8974g.f47025e, "Error scheduling indexing job", e10);
                        return;
                    }
                } catch (Throwable th4) {
                    C6205a.m12741a(C8974g.class, th4);
                    return;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                String str4 = (String) this.f34664b;
                LoginButton loginButton = (LoginButton) this.f34665c;
                int i11 = LoginButton.f11670U;
                C5207g.m11111f(str4, "$appId");
                C5207g.m11111f(loginButton, "this$0");
                loginButton.getActivity().runOnUiThread(new RunnableC7907g(loginButton, 9, FetchedAppSettingsManager.m6673f(str4, false)));
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C2413j c2413j = (C2413j) this.f34664b;
                C2415l.d dVar = (C2415l.d) this.f34665c;
                int i12 = c2413j.f12275H - dVar.f12403c;
                c2413j.f12275H = i12;
                if (dVar.f12404d) {
                    c2413j.f12276I = dVar.f12405e;
                    c2413j.f12277J = true;
                }
                if (dVar.f12406f) {
                    c2413j.f12278K = dVar.f12407g;
                }
                if (i12 == 0) {
                    AbstractC2382c0 abstractC2382c0 = dVar.f12402b.f35313a;
                    if (!c2413j.f12334u0.f35313a.m6910p() && abstractC2382c0.m6910p()) {
                        c2413j.f12336v0 = -1;
                        c2413j.f12338w0 = 0L;
                    }
                    if (!abstractC2382c0.m6910p()) {
                        List listAsList = Arrays.asList(((C5922k0) abstractC2382c0).f35338j);
                        C10129a.m18992d(listAsList.size() == c2413j.f12321o.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((C2413j.d) c2413j.f12321o.get(i13)).f12348b = (AbstractC2382c0) listAsList.get(i13);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (c2413j.f12277J) {
                        if (dVar.f12402b.f35314b.equals(c2413j.f12334u0.f35314b) && dVar.f12402b.f35316d == c2413j.f12334u0.f35330r) {
                            z11 = false;
                        }
                        if (z11) {
                            if (abstractC2382c0.m6910p() || dVar.f12402b.f35314b.m12079a()) {
                                j10 = dVar.f12402b.f35316d;
                            } else {
                                C5920j0 c5920j0 = dVar.f12402b;
                                InterfaceC2492i.b bVar = c5920j0.f35314b;
                                long j11 = c5920j0.f35316d;
                                Object obj = bVar.f34757a;
                                AbstractC2382c0.b bVar2 = c2413j.f12319n;
                                abstractC2382c0.mo6778g(obj, bVar2);
                                j10 = j11 + bVar2.f12067e;
                            }
                        }
                        z10 = z11;
                    } else {
                        z10 = false;
                    }
                    c2413j.f12277J = false;
                    c2413j.m7019B(dVar.f12402b, 1, c2413j.f12278K, false, z10, c2413j.f12276I, j10, -1, false);
                    return;
                }
                return;
            case 8:
                C2415l c2415l = (C2415l) this.f34664b;
                C2534w c2534w = (C2534w) this.f34665c;
                c2415l.getClass();
                try {
                    synchronized (c2534w) {
                    }
                    try {
                        c2534w.f13776a.mo6889q(c2534w.f13779d, c2534w.f13780e);
                        return;
                    } finally {
                        c2534w.m7516b(true);
                    }
                } catch (ExoPlaybackException e11) {
                    C10145n.m19096d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            case 9:
                InterfaceC2368b.a aVar2 = (InterfaceC2368b.a) this.f34664b;
                Exception exc = (Exception) this.f34665c;
                aVar2.getClass();
                int i14 = C10134c0.f51354a;
                aVar2.f11946b.mo6847n(exc);
                return;
            case 10:
                InterfaceC2398b.a aVar3 = (InterfaceC2398b.a) this.f34664b;
                ((InterfaceC2398b) this.f34665c).mo6961a0(aVar3.f12200a, aVar3.f12201b);
                return;
            case 11:
                C0166e.m776w(this.f34664b);
                int i15 = AdsMediaSource.f13032d;
                throw null;
            case 12:
                InterfaceC10331m.a aVar4 = (InterfaceC10331m.a) this.f34664b;
                C6635e c6635e = (C6635e) this.f34665c;
                aVar4.getClass();
                synchronized (c6635e) {
                }
                InterfaceC10331m interfaceC10331m = aVar4.f52010b;
                int i16 = C10134c0.f51354a;
                interfaceC10331m.mo7044d(c6635e);
                return;
            case 13:
                C5526r c5526r = (C5526r) this.f34664b;
                InterfaceC2005b<T> interfaceC2005b = (InterfaceC2005b) this.f34665c;
                if (c5526r.f34197b != C5526r.f34195d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (c5526r) {
                    aVar = c5526r.f34196a;
                    c5526r.f34196a = null;
                    c5526r.f34197b = interfaceC2005b;
                    break;
                }
                aVar.mo5937f(interfaceC2005b);
                return;
            case 14:
                ThreadFactoryC5777a threadFactoryC5777a = (ThreadFactoryC5777a) this.f34664b;
                Runnable runnable2 = (Runnable) this.f34665c;
                Process.setThreadPriority(threadFactoryC5777a.f34961c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC5777a.f34962d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 15:
                Runnable runnable3 = (Runnable) this.f34664b;
                ScheduledFutureC5784h.b bVar3 = (ScheduledFutureC5784h.b) this.f34665c;
                try {
                    runnable3.run();
                    return;
                } catch (Exception e12) {
                    ((ScheduledFutureC5784h.a) bVar3).m12172a(e12);
                    return;
                }
            case 16:
            default:
                C8069e c8069e = (C8069e) this.f34664b;
                PlayerConstants$PlaybackRate playerConstants$PlaybackRate = (PlayerConstants$PlaybackRate) this.f34665c;
                C5207g.m11111f(c8069e, "this$0");
                C5207g.m11111f(playerConstants$PlaybackRate, "$playbackRate");
                C8069e.a aVar5 = c8069e.f43770a;
                Iterator<T> it = aVar5.getListeners().iterator();
                while (it.hasNext()) {
                    ((InterfaceC8403d) it.next()).mo16427j(aVar5.getInstance(), playerConstants$PlaybackRate);
                }
                return;
            case 17:
                C3250m c3250m = (C3250m) this.f34664b;
                C5752h c5752h = (C5752h) this.f34665c;
                c3250m.getClass();
                try {
                    c5752h.m12114b(c3250m.m9268a());
                    return;
                } catch (Exception e13) {
                    c5752h.m12113a(e13);
                    return;
                }
            case 18:
                List list = (List) this.f34664b;
                CollectionsAdapter.AbstractC3740b.o oVar = (CollectionsAdapter.AbstractC3740b.o) this.f34665c;
                int i17 = CollectionsAdapter.AbstractC3740b.o.f24519w;
                C5207g.m11111f(list, "$tabs");
                C5207g.m11111f(oVar, "this$0");
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i10 = -1;
                    } else if (!((C6336e) it2.next()).f36632e) {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    ((RecyclerView) oVar.f24520u.f45086b).m4200g0(i10);
                    return;
                }
                return;
        }
    }
}
