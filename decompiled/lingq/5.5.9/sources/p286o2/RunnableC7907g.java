package p286o2;

import ae.C0062b;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.util.Pair;
import androidx.activity.RunnableC0183b;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC1246d;
import androidx.work.impl.utils.futures.C1268a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.widget.LoginButton;
import com.google.android.datatransport.Priority;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.source.C2496m;
import com.google.android.exoplayer2.source.C2497n;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingq.p055ui.home.library.LibraryAdapter;
import dm.C5207g;
import ge.ScheduledFutureC5784h;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import mo.C7653a;
import ne.AbstractC7743b0;
import org.json.JSONException;
import org.json.JSONObject;
import p010a9.C0051a;
import p067d8.C5055a;
import p067d8.C5074n;
import p067d8.C5086z;
import p118fe.C5524p;
import p136gc.C5752h;
import p173i8.C6205a;
import p181ii.C6336e;
import p218k9.C6635e;
import p261m9.InterfaceC7520u;
import p271n5.C7707a;
import p274n8.C7725j;
import p291o7.C8004n;
import p291o7.C8009s;
import p291o7.C8014x;
import p382s7.C8974g;
import p395t8.InterfaceC9223e;
import p452w8.C9840u;
import p452w8.C9842w;
import p479xa.C10134c0;
import p505ya.InterfaceC10331m;
import p532zd.InterfaceFutureC10478a;
import re.C8772c;
import sl.C9072e;

/* JADX INFO: renamed from: o2.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7907g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43066c;

    public /* synthetic */ RunnableC7907g(Object obj, int i10, Object obj2) {
        this.f43064a = i10;
        this.f43065b = obj;
        this.f43066c = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        z = false;
        boolean z10 = false;
        switch (this.f43064a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((C7906f.e) this.f43065b).mo1297d((Typeface) this.f43066c);
                return;
            case 1:
            default:
                LibraryAdapter.AbstractC3755a.c cVar = (LibraryAdapter.AbstractC3755a.c) this.f43065b;
                LibraryAdapter.AbstractC3756b.c cVar2 = (LibraryAdapter.AbstractC3756b.c) this.f43066c;
                int i11 = LibraryAdapter.AbstractC3756b.c.f24624w;
                C5207g.m11111f(cVar, "$item");
                C5207g.m11111f(cVar2, "this$0");
                Iterator<C6336e> it = cVar.f24610c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                    } else if (!it.next().f36632e) {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    ((RecyclerView) cVar2.f24625u.f44673d).m4200g0(i10);
                    return;
                }
                return;
            case 2:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f43065b;
                Context context = (Context) this.f43066c;
                profileInstallerInitializer.getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.C1090b.m4044a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0183b(4, context), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 3:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f43065b;
                InterfaceFutureC10478a<? extends AbstractC1246d.a> interfaceFutureC10478a = (InterfaceFutureC10478a) this.f43066c;
                C5207g.m11111f(constraintTrackingWorker, "this$0");
                C5207g.m11111f(interfaceFutureC10478a, "$innerFuture");
                synchronized (constraintTrackingWorker.f7948f) {
                    if (constraintTrackingWorker.f7949g) {
                        C1268a<AbstractC1246d.a> c1268a = constraintTrackingWorker.f7950h;
                        C5207g.m11110e(c1268a, "future");
                        String str = C7707a.f42234a;
                        c1268a.m4766i(new AbstractC1246d.a.b());
                    } else {
                        constraintTrackingWorker.f7950h.m4768k(interfaceFutureC10478a);
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
                return;
            case 4:
                Context context2 = (Context) this.f43065b;
                String str2 = (String) this.f43066c;
                C8004n c8004n = C8004n.f43550a;
                C5207g.m11111f(str2, "$applicationId");
                C5207g.m11110e(context2, "applicationContext");
                C8004n c8004n2 = C8004n.f43550a;
                c8004n2.getClass();
                try {
                    if (C6205a.m12742b(c8004n2)) {
                        return;
                    }
                    try {
                        C5055a c5055a = C5055a.f32901f;
                        C5055a c5055aM10738a = C5055a.a.m10738a(context2);
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String strM11116k = C5207g.m11116k("ping", str2);
                        long j10 = sharedPreferences.getLong(strM11116k, 0L);
                        try {
                            HashMap map = AppEventsLoggerUtility.f11523a;
                            JSONObject jSONObjectM6648a = AppEventsLoggerUtility.m6648a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, c5055aM10738a, C0062b.m328Z0(context2), C8004n.m15876f(context2), context2);
                            String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str2}, 1));
                            C5207g.m11110e(str3, "java.lang.String.format(format, *args)");
                            C8004n.f43570u.getClass();
                            String str4 = GraphRequest.f11448j;
                            GraphRequest graphRequestM6622h = GraphRequest.C2279c.m6622h(null, str3, jSONObjectM6648a, null);
                            if (j10 == 0 && graphRequestM6622h.m6606c().f43588c == null) {
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putLong(strM11116k, System.currentTimeMillis());
                                editorEdit.apply();
                                return;
                            }
                            return;
                        } catch (JSONException e10) {
                            throw new FacebookException("An error occurred while publishing install.", e10);
                        }
                    } catch (Exception e11) {
                        C5086z.m10806E("Facebook-publish", e11);
                        return;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(c8004n2, th2);
                    return;
                }
            case 5:
                C8009s.a aVar = (C8009s.a) this.f43065b;
                C8014x c8014x = (C8014x) this.f43066c;
                int i12 = C8014x.f43601h;
                C5207g.m11111f(aVar, "$callback");
                C5207g.m11111f(c8014x, "this$0");
                ((C8009s.b) aVar).m15883b();
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                String str5 = (String) this.f43065b;
                C8974g c8974g = (C8974g) this.f43066c;
                String str6 = C8974g.f47025e;
                if (C6205a.m12742b(C8974g.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(str5, "$tree");
                    C5207g.m11111f(c8974g, "this$0");
                    C5086z.f33015a.getClass();
                    byte[] bytes = str5.getBytes(C7653a.f42116b);
                    C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
                    String strM10836u = C5086z.m10836u("MD5", bytes);
                    Date date = AccessToken.f11370l;
                    AccessToken accessTokenM6595b = AccessToken.C2262b.m6595b();
                    if (strM10836u == null || !C5207g.m11106a(strM10836u, c8974g.f47029d)) {
                        c8974g.m17214b(C8974g.a.m17216a(str5, accessTokenM6595b, C8004n.m15872b()), strM10836u);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(C8974g.class, th3);
                    return;
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                FetchedAppSettingsManager.InterfaceC2306a interfaceC2306a = (FetchedAppSettingsManager.InterfaceC2306a) this.f43065b;
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                interfaceC2306a.mo6676b();
                return;
            case 8:
                C7725j c7725j = (C7725j) this.f43065b;
                Bundle bundle = (Bundle) this.f43066c;
                ScheduledExecutorService scheduledExecutorService = C7725j.f42268d;
                if (C6205a.m12742b(C7725j.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(c7725j, "this$0");
                    C5207g.m11111f(bundle, "$bundle");
                    c7725j.f42270b.m16340a(bundle, "fb_mobile_login_heartbeat");
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(C7725j.class, th4);
                    return;
                }
            case 9:
                LoginButton loginButton = (LoginButton) this.f43065b;
                C5074n c5074n = (C5074n) this.f43066c;
                int i13 = LoginButton.f11670U;
                C5207g.m11111f(loginButton, "this$0");
                if (C6205a.m12742b(loginButton) || c5074n == null) {
                    return;
                }
                try {
                    if (c5074n.f32969c && loginButton.getVisibility() == 0) {
                        loginButton.m6734g(c5074n.f32968b);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    C6205a.m12741a(loginButton, th5);
                    return;
                }
            case 10:
                C2469s.a aVar2 = (C2469s.a) this.f43065b;
                Pair pair = (Pair) this.f43066c;
                aVar2.f12999b.f12993h.mo6961a0(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second);
                return;
            case 11:
                InterfaceC2368b.a aVar3 = (InterfaceC2368b.a) this.f43065b;
                C6635e c6635e = (C6635e) this.f43066c;
                aVar3.getClass();
                synchronized (c6635e) {
                }
                InterfaceC2368b interfaceC2368b = aVar3.f11946b;
                int i14 = C10134c0.f51354a;
                interfaceC2368b.mo6848r(c6635e);
                return;
            case 12:
                C2496m c2496m = (C2496m) this.f43065b;
                InterfaceC7520u interfaceC7520u = (InterfaceC7520u) this.f43066c;
                c2496m.f13325T = c2496m.f13318M == null ? interfaceC7520u : new InterfaceC7520u.b(-9223372036854775807L);
                c2496m.f13326U = interfaceC7520u.mo14984i();
                if (!c2496m.f13333a0 && interfaceC7520u.mo14984i() == -9223372036854775807L) {
                    z10 = true;
                }
                c2496m.f13327V = z10;
                c2496m.f13328W = z10 ? 7 : 1;
                ((C2497n) c2496m.f13344g).m7378b(c2496m.f13326U, interfaceC7520u.mo14982b(), c2496m.f13327V);
                if (c2496m.f13322Q) {
                    return;
                }
                c2496m.m7372y();
                return;
            case 13:
                C0166e.m776w(this.f43065b);
                int i15 = AdsMediaSource.f13032d;
                throw null;
            case 14:
                InterfaceC10331m.a aVar4 = (InterfaceC10331m.a) this.f43065b;
                C6635e c6635e2 = (C6635e) this.f43066c;
                aVar4.getClass();
                int i16 = C10134c0.f51354a;
                aVar4.f52010b.mo7053u(c6635e2);
                return;
            case 15:
                C5524p c5524p = (C5524p) this.f43065b;
                InterfaceC2005b interfaceC2005b = (InterfaceC2005b) this.f43066c;
                synchronized (c5524p) {
                    if (c5524p.f34192b == 0) {
                        c5524p.f34191a.add((InterfaceC2005b<T>) interfaceC2005b);
                    } else {
                        c5524p.f34192b.add((T) interfaceC2005b.get());
                    }
                }
                return;
            case 16:
                Callable callable = (Callable) this.f43065b;
                ScheduledFutureC5784h.b bVar = (ScheduledFutureC5784h.b) this.f43066c;
                try {
                    Object objCall = callable.call();
                    ScheduledFutureC5784h scheduledFutureC5784h = ScheduledFutureC5784h.this;
                    scheduledFutureC5784h.getClass();
                    if (objCall == null) {
                        objCall = AbstractResolvableFuture.f4755g;
                    }
                    if (AbstractResolvableFuture.f4754f.mo2635b(scheduledFutureC5784h, null, objCall)) {
                        AbstractResolvableFuture.m2626i(scheduledFutureC5784h);
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    ((ScheduledFutureC5784h.a) bVar).m12172a(e12);
                    return;
                }
            case 17:
                C8772c c8772c = (C8772c) this.f43065b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f43066c;
                c8772c.getClass();
                try {
                    InterfaceC9223e<AbstractC7743b0> interfaceC9223e = c8772c.f46506h;
                    Priority priority = Priority.HIGHEST;
                    if (interfaceC9223e instanceof C9840u) {
                        C9842w.m18333a().f50056d.m5486a(((C9840u) interfaceC9223e).f50047a.m18331e(priority), 1);
                    } else {
                        String strM210c = C0051a.m210c("ForcedSender");
                        if (Log.isLoggable(strM210c, 5)) {
                            Log.w(strM210c, String.format("Expected instance of `TransportImpl`, got `%s`.", interfaceC9223e));
                        }
                    }
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f43065b;
                C5752h c5752h = (C5752h) this.f43066c;
                C3260w c3260w = FirebaseMessaging.f16304m;
                firebaseMessaging.getClass();
                try {
                    c5752h.m12114b(firebaseMessaging.m9229a());
                    return;
                } catch (Exception e13) {
                    c5752h.m12113a(e13);
                    return;
                }
        }
    }
}
