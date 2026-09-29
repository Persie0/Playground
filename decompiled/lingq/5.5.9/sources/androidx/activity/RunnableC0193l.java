package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.media.session.C0166e;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.C0892f;
import androidx.emoji2.text.C0899m;
import androidx.emoji2.text.C0900n;
import androidx.emoji2.text.C0901o;
import androidx.view.C1052r;
import androidx.view.C1060z;
import androidx.view.Lifecycle;
import androidx.work.impl.background.systemalarm.C1252c;
import com.google.firebase.messaging.ServiceConnectionC3244g0;
import com.lingq.player.PlayerService;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p029b8.C1337c;
import p029b8.ViewOnClickListenerC1341g;
import p029b8.ViewTreeObserverOnGlobalLayoutListenerC1339e;
import p173i8.C6205a;
import p175ia.C6247k;
import p175ia.C6249m;
import p213k4.C6586f;
import p213k4.C6588h;
import p213k4.C6593m;
import p312p2.C8173e;
import p312p2.C8182n;
import p370rk.C8821a;
import p370rk.C8822b;
import p389t2.C9191j;
import p394t7.C9216b;
import p404u2.C9393m;
import p476x7.C10106e;
import va.C9701o;

/* JADX INFO: renamed from: androidx.activity.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0193l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f495b;

    public /* synthetic */ RunnableC0193l(int i10, Object obj) {
        this.f494a = i10;
        this.f495b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    private final void m822a() {
        C0899m.b bVar = (C0899m.b) this.f495b;
        synchronized (bVar.f6030d) {
            if (bVar.f6034h == null) {
                return;
            }
            try {
                C9393m c9393mM3540d = bVar.m3540d();
                int i10 = c9393mM3540d.f48206e;
                if (i10 == 2) {
                    synchronized (bVar.f6030d) {
                    }
                }
                if (i10 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                }
                try {
                    int i11 = C9191j.f47731a;
                    C9191j.a.m17531a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    C0899m.a aVar = bVar.f6029c;
                    Context context = bVar.f6027a;
                    aVar.getClass();
                    Typeface typefaceMo16237b = C8173e.f44309a.mo16237b(context, new C9393m[]{c9393mM3540d}, 0);
                    MappedByteBuffer mappedByteBufferM16294e = C8182n.m16294e(bVar.f6027a, c9393mM3540d.f48202a);
                    if (mappedByteBufferM16294e == null || typefaceMo16237b == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    try {
                        C9191j.a.m17531a("EmojiCompat.MetadataRepo.create");
                        C0901o c0901o = new C0901o(typefaceMo16237b, C0900n.m3541a(mappedByteBufferM16294e));
                        C9191j.a.m17532b();
                        C9191j.a.m17532b();
                        synchronized (bVar.f6030d) {
                            try {
                                C0892f.i iVar = bVar.f6034h;
                                if (iVar != null) {
                                    iVar.mo3518b(c0901o);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        bVar.m3538b();
                    } catch (Throwable th3) {
                        int i12 = C9191j.f47731a;
                        C9191j.a.m17532b();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    int i13 = C9191j.f47731a;
                    C9191j.a.m17532b();
                    throw th4;
                }
            } catch (Throwable th5) {
                synchronized (bVar.f6030d) {
                    try {
                        C0892f.i iVar2 = bVar.f6034h;
                        if (iVar2 != null) {
                            iVar2.mo3517a(th5);
                        }
                        bVar.m3538b();
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f495b;
        switch (this.f494a) {
            case 1:
                Toolbar.C0291f c0291f = ((Toolbar) obj).f1095k0;
                C0226h c0226h = c0291f != null ? c0291f.f1111b : null;
                if (c0226h != null) {
                    c0226h.collapseActionView();
                }
                return;
            case 2:
                m822a();
                return;
            case 3:
                C1060z c1060z = (C1060z) obj;
                C1060z c1060z2 = C1060z.f6693i;
                C5207g.m11111f(c1060z, "this$0");
                int i10 = c1060z.f6695b;
                C1052r c1052r = c1060z.f6699f;
                if (i10 == 0) {
                    c1060z.f6696c = true;
                    c1052r.m3955f(Lifecycle.Event.ON_PAUSE);
                }
                if (c1060z.f6694a == 0 && c1060z.f6696c) {
                    c1052r.m3955f(Lifecycle.Event.ON_STOP);
                    c1060z.f6697d = true;
                    return;
                }
                return;
            case 4:
                C0166e.m776w(obj);
                C5207g.m11111f(null, "this$0");
                throw null;
            case 5:
                C6588h c6588h = (C6588h) obj;
                C5207g.m11111f(c6588h, "this$0");
                C6586f.c cVar = c6588h.f37456f;
                if (cVar != null) {
                    c6588h.f37452b.m13176c(cVar);
                    return;
                } else {
                    C5207g.m11117l("observer");
                    throw null;
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C5207g.m11111f((C6593m) obj, "this$0");
                throw null;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C1252c.m4731b((C1252c) obj);
                return;
            case 8:
                ViewTreeObserverOnGlobalLayoutListenerC1339e viewTreeObserverOnGlobalLayoutListenerC1339e = (ViewTreeObserverOnGlobalLayoutListenerC1339e) obj;
                HashMap map = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                if (C6205a.m12742b(ViewTreeObserverOnGlobalLayoutListenerC1339e.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(viewTreeObserverOnGlobalLayoutListenerC1339e, "this$0");
                    try {
                        int i11 = C10106e.f51261a;
                        WeakReference<Activity> weakReference = viewTreeObserverOnGlobalLayoutListenerC1339e.f8148a;
                        View viewM18963b = C10106e.m18963b(weakReference.get());
                        Activity activity = weakReference.get();
                        if (viewM18963b != null && activity != null) {
                            while (true) {
                                for (View view : C1337c.m4909a(viewM18963b)) {
                                    if (!C9216b.m17563b(view)) {
                                        String strM4911d = C1337c.m4911d(view);
                                        if ((strM4911d.length() > 0) && strM4911d.length() <= 300) {
                                            HashSet hashSet = ViewOnClickListenerC1341g.f8155e;
                                            String localClassName = activity.getLocalClassName();
                                            C5207g.m11110e(localClassName, "activity.localClassName");
                                            ViewOnClickListenerC1341g.a.m4923b(view, viewM18963b, localClassName);
                                        }
                                    }
                                }
                                return;
                            }
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th2);
                    return;
                }
            case 9:
                ((C6247k.a) ((C6249m.a) obj)).m12849c();
                return;
            case 10:
                ((C9701o) obj).m18211i(2);
                return;
            case 11:
                ServiceConnectionC3244g0.a aVar = (ServiceConnectionC3244g0.a) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f16391a.getAction() + " Releasing WakeLock.");
                aVar.f16392b.m12116d(null);
                return;
            case 12:
                PlayerService playerService = (PlayerService) obj;
                MediaSessionCompat mediaSessionCompat = PlayerService.f17687S;
                C5207g.m11111f(playerService, "this$0");
                playerService.m9427b().pause();
                return;
            default:
                C8821a c8821a = (C8821a) obj;
                int i12 = C8822b.f46718c;
                C5207g.m11111f(c8821a, "this$0");
                Iterator it = c8821a.f46716b.iterator();
                while (it.hasNext()) {
                    ((C8821a.a) it.next()).mo17085b();
                }
                return;
        }
    }
}
