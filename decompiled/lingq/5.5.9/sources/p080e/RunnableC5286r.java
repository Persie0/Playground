package p080e;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1031f;
import androidx.work.impl.utils.futures.AbstractFuture;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.InterfaceC2368b;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.C2488a;
import com.lingq.p055ui.lesson.LessonFragment;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenFragment;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlaybackQuality;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import dm.C5207g;
import ge.ScheduledFutureC5784h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import km.InterfaceC6727j;
import p041c5.RunnableC1707e0;
import p138gk.C5816f;
import p173i8.C6205a;
import p213k4.C6586f;
import p213k4.C6588h;
import p218k9.C6635e;
import p225kk.C6716m;
import p229l.C7203b;
import p304ok.C8069e;
import p317p7.C8201h;
import p317p7.C8206m;
import p352r1.C8708i;
import p385sf.C9000b;
import p479xa.C10134c0;
import p479xa.C10136e;
import p505ya.InterfaceC10331m;
import p527z7.C10454b;
import p532zd.InterfaceFutureC10478a;
import ph.C8393z3;
import pk.InterfaceC8403d;
import sl.C9072e;
import za.C10474j;

/* JADX INFO: renamed from: e.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5286r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33490b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33491c;

    public /* synthetic */ RunnableC5286r(Object obj, int i10, Object obj2) {
        this.f33489a = i10;
        this.f33490b = obj;
        this.f33491c = obj2;
    }

    public /* synthetic */ RunnableC5286r(Runnable runnable, ScheduledFutureC5784h.b bVar) {
        this.f33489a = 19;
        this.f33491c = runnable;
        this.f33490b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f33489a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5287s.a aVar = (C5287s.a) this.f33490b;
                Runnable runnable = (Runnable) this.f33491c;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.m11401a();
                }
            case 1:
                InputMethodManager inputMethodManager = (InputMethodManager) this.f33490b;
                C8708i c8708i = (C8708i) this.f33491c;
                C5207g.m11111f(inputMethodManager, "$imm");
                C5207g.m11111f(c8708i, "this$0");
                inputMethodManager.showSoftInput(c8708i.f46299a, 0);
                return;
            case 2:
                String str = (String) this.f33490b;
                Violation violation = (Violation) this.f33491c;
                FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
                C5207g.m11111f(violation, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
                throw violation;
            case 3:
                C1031f c1031f = (C1031f) this.f33490b;
                Runnable runnable2 = (Runnable) this.f33491c;
                C5207g.m11111f(c1031f, "this$0");
                C5207g.m11111f(runnable2, "$runnable");
                if (!((Queue) c1031f.f6646d).offer(runnable2)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                c1031f.m3935a();
                return;
            case 4:
                C6588h c6588h = (C6588h) this.f33490b;
                String[] strArr = (String[]) this.f33491c;
                int i10 = C6588h.b.f37464b;
                C5207g.m11111f(c6588h, "this$0");
                C5207g.m11111f(strArr, "$tables");
                C6586f c6586f = c6588h.f37452b;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                c6586f.getClass();
                C5207g.m11111f(strArr2, "tables");
                synchronized (c6586f.f37436j) {
                    Iterator<Map.Entry<C6586f.c, C6586f.d>> it = c6586f.f37436j.iterator();
                    while (true) {
                        C7203b.e eVar = (C7203b.e) it;
                        if (eVar.hasNext()) {
                            Map.Entry entry = (Map.Entry) eVar.next();
                            C5207g.m11110e(entry, "(observer, wrapper)");
                            C6586f.c cVar = (C6586f.c) entry.getKey();
                            C6586f.d dVar = (C6586f.d) entry.getValue();
                            cVar.getClass();
                            if (!(cVar instanceof C6588h.a)) {
                                dVar.m13183b(strArr2);
                            }
                        } else {
                            C9072e c9072e = C9072e.f47360a;
                        }
                    }
                }
                return;
            case 5:
                RunnableC1707e0 runnableC1707e0 = (RunnableC1707e0) this.f33490b;
                InterfaceFutureC10478a interfaceFutureC10478a = (InterfaceFutureC10478a) this.f33491c;
                if (runnableC1707e0.f9497K.f7924a instanceof AbstractFuture.C1262b) {
                    interfaceFutureC10478a.cancel(true);
                    return;
                }
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = (Context) this.f33490b;
                C8201h c8201h = (C8201h) this.f33491c;
                C5207g.m11111f(context, "$context");
                C5207g.m11111f(c8201h, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr3 = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr4 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + 1;
                    String str2 = strArr3[i11];
                    String str3 = strArr4[i11];
                    try {
                        Class.forName(str2);
                        bundle.putInt(str3, 1);
                        i12 |= 1 << i11;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i13 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i12) {
                            sharedPreferences.edit().putInt("kitsBitmask", i12).apply();
                            c8201h.m16334f("fb_sdk_initialize", bundle);
                            return;
                        }
                        return;
                    }
                    i11 = i13;
                }
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                String str4 = (String) this.f33490b;
                String str5 = (String) this.f33491c;
                C8206m c8206m = C8206m.f44408a;
                if (C6205a.m12742b(C8206m.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(str4, "$key");
                    C5207g.m11111f(str5, "$value");
                    if (!C8206m.f44411d.get()) {
                        C8206m.f44408a.m16348b();
                    }
                    SharedPreferences sharedPreferences2 = C8206m.f44410c;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putString(str4, str5).apply();
                        return;
                    } else {
                        C5207g.m11117l("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(C8206m.class, th2);
                    return;
                }
            case 8:
                String str6 = (String) this.f33490b;
                AppEvent appEvent = (AppEvent) this.f33491c;
                C10454b c10454b = C10454b.f52308a;
                if (C6205a.m12742b(C10454b.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(str6, "$applicationId");
                    C5207g.m11111f(appEvent, "$event");
                    RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f11538a;
                    List<AppEvent> listM17251q = C9000b.m17251q(appEvent);
                    if (!C6205a.m12742b(RemoteServiceWrapper.class)) {
                        try {
                            RemoteServiceWrapper.f11538a.m6661b(RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS, str6, listM17251q);
                        } catch (Throwable th3) {
                            C6205a.m12741a(RemoteServiceWrapper.class, th3);
                        }
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(C10454b.class, th4);
                    return;
                }
            case 9:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f33490b;
                JobParameters jobParameters = (JobParameters) this.f33491c;
                int i14 = JobInfoSchedulerService.f11781a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 10:
                InterfaceC2368b.a aVar2 = (InterfaceC2368b.a) this.f33490b;
                String str7 = (String) this.f33491c;
                aVar2.getClass();
                int i15 = C10134c0.f51354a;
                aVar2.f11946b.mo6842e(str7);
                return;
            case 11:
                InterfaceC2368b.a aVar3 = (InterfaceC2368b.a) this.f33490b;
                C6635e c6635e = (C6635e) this.f33491c;
                aVar3.getClass();
                int i16 = C10134c0.f51354a;
                aVar3.f11946b.mo6841c(c6635e);
                return;
            case 12:
                AudioTrack audioTrack = (AudioTrack) this.f33490b;
                C10136e c10136e = (C10136e) this.f33491c;
                Object obj = DefaultAudioSink.f11848d0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    c10136e.m19062a();
                    synchronized (DefaultAudioSink.f11848d0) {
                        int i17 = DefaultAudioSink.f11850f0 - 1;
                        DefaultAudioSink.f11850f0 = i17;
                        if (i17 == 0) {
                            DefaultAudioSink.f11849e0.shutdown();
                            DefaultAudioSink.f11849e0 = null;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th5) {
                    c10136e.m19062a();
                    synchronized (DefaultAudioSink.f11848d0) {
                        int i18 = DefaultAudioSink.f11850f0 - 1;
                        DefaultAudioSink.f11850f0 = i18;
                        if (i18 == 0) {
                            DefaultAudioSink.f11849e0.shutdown();
                            DefaultAudioSink.f11849e0 = null;
                        }
                        throw th5;
                    }
                }
            case 13:
                InterfaceC2398b.a aVar4 = (InterfaceC2398b.a) this.f33490b;
                ((InterfaceC2398b) this.f33491c).mo6965r0(aVar4.f12200a, aVar4.f12201b);
                return;
            case 14:
                ((AdsMediaSource.C2472a) this.f33490b).getClass();
                int i19 = AdsMediaSource.f13032d;
                throw null;
            case 15:
                C2488a.b bVar = (C2488a.b) this.f33490b;
                Uri uri = (Uri) this.f33491c;
                bVar.f13224i = false;
                bVar.m7318c(uri);
                return;
            case 16:
                InterfaceC10331m.a aVar5 = (InterfaceC10331m.a) this.f33490b;
                String str8 = (String) this.f33491c;
                aVar5.getClass();
                int i20 = C10134c0.f51354a;
                aVar5.f52010b.mo7042a(str8);
                return;
            case 17:
                InterfaceC10331m.a aVar6 = (InterfaceC10331m.a) this.f33490b;
                Exception exc = (Exception) this.f33491c;
                aVar6.getClass();
                int i21 = C10134c0.f51354a;
                aVar6.f52010b.mo7049o(exc);
                return;
            case 18:
                C10474j c10474j = (C10474j) this.f33490b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f33491c;
                SurfaceTexture surfaceTexture2 = c10474j.f52392g;
                Surface surface = c10474j.f52393h;
                Surface surface2 = new Surface(surfaceTexture);
                c10474j.f52392g = surfaceTexture;
                c10474j.f52393h = surface2;
                Iterator<C10474j.b> it2 = c10474j.f52386a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo7055x(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 19:
                Runnable runnable3 = (Runnable) this.f33491c;
                ScheduledFutureC5784h.b bVar2 = (ScheduledFutureC5784h.b) this.f33490b;
                try {
                    runnable3.run();
                    return;
                } catch (Exception e10) {
                    ((ScheduledFutureC5784h.a) bVar2).m12172a(e10);
                    throw e10;
                }
            case 20:
                LessonFragment lessonFragment = (LessonFragment) this.f33490b;
                TokenData tokenData = (TokenData) this.f33491c;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                C5207g.m11111f(lessonFragment, "this$0");
                C5207g.m11111f(tokenData, "$data");
                lessonFragment.m10111s0(tokenData);
                return;
            case 21:
                RecyclerView.AbstractC1109b0 abstractC1109b0 = (RecyclerView.AbstractC1109b0) this.f33490b;
                TokenFragment tokenFragment = (TokenFragment) this.f33491c;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5816f.d dVar2 = (C5816f.d) abstractC1109b0;
                dVar2.f35115u.f45508b.requestFocus();
                C8393z3 c8393z3 = dVar2.f35115u;
                EditText editText = c8393z3.f45508b;
                editText.setSelection(editText.length());
                List<Integer> list = C6716m.f37937a;
                Context contextM3578a0 = tokenFragment.m3578a0();
                EditText editText2 = c8393z3.f45508b;
                C5207g.m11110e(editText2, "holder.binding.etHint");
                Object systemService = contextM3578a0.getSystemService("input_method");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(editText2, 1);
                return;
            case 22:
                C8069e c8069e = (C8069e) this.f33490b;
                PlayerConstants$PlaybackQuality playerConstants$PlaybackQuality = (PlayerConstants$PlaybackQuality) this.f33491c;
                C5207g.m11111f(c8069e, "this$0");
                C5207g.m11111f(playerConstants$PlaybackQuality, "$playbackQuality");
                C8069e.a aVar7 = c8069e.f43770a;
                Iterator<T> it3 = aVar7.getListeners().iterator();
                while (it3.hasNext()) {
                    ((InterfaceC8403d) it3.next()).mo16425f(aVar7.getInstance(), playerConstants$PlaybackQuality);
                }
                return;
            case 23:
                C8069e c8069e2 = (C8069e) this.f33490b;
                String str9 = (String) this.f33491c;
                C5207g.m11111f(c8069e2, "this$0");
                C5207g.m11111f(str9, "$videoId");
                C8069e.a aVar8 = c8069e2.f43770a;
                Iterator<T> it4 = aVar8.getListeners().iterator();
                while (it4.hasNext()) {
                    ((InterfaceC8403d) it4.next()).mo16424c(aVar8.getInstance(), str9);
                }
                return;
            default:
                C8069e c8069e3 = (C8069e) this.f33490b;
                PlayerConstants$PlayerState playerConstants$PlayerState = (PlayerConstants$PlayerState) this.f33491c;
                C5207g.m11111f(c8069e3, "this$0");
                C5207g.m11111f(playerConstants$PlayerState, "$playerState");
                C8069e.a aVar9 = c8069e3.f43770a;
                Iterator<T> it5 = aVar9.getListeners().iterator();
                while (it5.hasNext()) {
                    ((InterfaceC8403d) it5.next()).mo9990i(aVar9.getInstance(), playerConstants$PlayerState);
                }
                return;
        }
    }
}
