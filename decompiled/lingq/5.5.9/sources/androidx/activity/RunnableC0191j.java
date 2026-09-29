package androidx.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.AbstractC1246d;
import androidx.work.impl.background.systemalarm.C1252c;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.exoplayer2.C2353a0;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.p051ui.C2515b;
import com.google.android.exoplayer2.source.C2496m;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.installations.C3219a;
import com.google.firebase.messaging.C3259v;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.lesson.LessonProgressBar;
import dm.C5207g;
import java.util.Iterator;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p067d8.C5073m;
import p084e3.C5365c;
import p131g5.C5700d;
import p136gc.C5752h;
import p170i5.C6195n;
import p173i8.C6205a;
import p213k4.C6586f;
import p213k4.C6588h;
import p213k4.C6593m;
import p213k4.InterfaceC6585e;
import p214k5.C6617s;
import p214k5.InterfaceC6618t;
import p240ld.C7312l;
import p271n5.C7707a;
import p286o2.RunnableC7907g;
import p304ok.C8069e;
import p370rk.C8821a;
import p370rk.C8822b;
import p385sf.C9000b;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: androidx.activity.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0191j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f490b;

    public /* synthetic */ RunnableC0191j(int i10, Object obj) {
        this.f489a = i10;
        this.f490b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // java.lang.Runnable
    public final void run() {
        final boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z11 = true;
        switch (this.f489a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                DialogC0192k.m820a((DialogC0192k) this.f490b);
                return;
            case 1:
                ((Toolbar) this.f490b).m1060l();
                return;
            case 2:
                C0166e.m776w(this.f490b);
                C5207g.m11111f(null, "this$0");
                throw null;
            case 3:
                C6588h c6588h = (C6588h) this.f490b;
                C5207g.m11111f(c6588h, "this$0");
                try {
                    InterfaceC6585e interfaceC6585e = c6588h.f37457g;
                    if (interfaceC6585e != null) {
                        c6588h.f37455e = interfaceC6585e.mo4547n(c6588h.f37458h, c6588h.f37451a);
                        C6586f c6586f = c6588h.f37452b;
                        C6586f.c cVar = c6588h.f37456f;
                        if (cVar != null) {
                            c6586f.m13174a(cVar);
                            return;
                        } else {
                            C5207g.m11117l("observer");
                            throw null;
                        }
                    }
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
                }
                return;
            case 4:
                C5207g.m11111f((C6593m) this.f490b, "this$0");
                throw null;
            case 5:
                C1252c.m4731b((C1252c) this.f490b);
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f490b;
                C5207g.m11111f(constraintTrackingWorker, "this$0");
                if (constraintTrackingWorker.f7950h.f7924a instanceof AbstractFuture.C1262b) {
                    return;
                }
                String strM4707e = constraintTrackingWorker.f7829b.f7802b.m4707e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
                C5207g.m11110e(abstractC1314gM4867d, "get()");
                if (strM4707e != null && strM4707e.length() != 0) {
                    z11 = false;
                }
                if (z11) {
                    abstractC1314gM4867d.mo4870b(C7707a.f42234a, "No worker to delegate to.");
                    C1268a<AbstractC1246d.a> c1268a = constraintTrackingWorker.f7950h;
                    C5207g.m11110e(c1268a, "future");
                    c1268a.m4766i(new AbstractC1246d.a.C10594a());
                    return;
                }
                AbstractC1246d abstractC1246dM4882b = constraintTrackingWorker.f7829b.f7806f.m4882b(constraintTrackingWorker.f7828a, strM4707e, constraintTrackingWorker.f7947e);
                constraintTrackingWorker.f7951i = abstractC1246dM4882b;
                if (abstractC1246dM4882b == null) {
                    abstractC1314gM4867d.mo4869a(C7707a.f42234a, "No worker to delegate to.");
                    C1268a<AbstractC1246d.a> c1268a2 = constraintTrackingWorker.f7950h;
                    C5207g.m11110e(c1268a2, "future");
                    c1268a2.m4766i(new AbstractC1246d.a.C10594a());
                    return;
                }
                C1699a0 c1699a0M5430d = C1699a0.m5430d(constraintTrackingWorker.f7828a);
                C5207g.m11110e(c1699a0M5430d, "getInstance(applicationContext)");
                InterfaceC6618t interfaceC6618tMo4718z = c1699a0M5430d.f9477c.mo4718z();
                String string = constraintTrackingWorker.f7829b.f7801a.toString();
                C5207g.m11110e(string, "id.toString()");
                C6617s c6617sMo13237o = interfaceC6618tMo4718z.mo13237o(string);
                if (c6617sMo13237o == null) {
                    C1268a<AbstractC1246d.a> c1268a3 = constraintTrackingWorker.f7950h;
                    C5207g.m11110e(c1268a3, "future");
                    String str = C7707a.f42234a;
                    c1268a3.m4766i(new AbstractC1246d.a.C10594a());
                    return;
                }
                C6195n c6195n = c1699a0M5430d.f9484j;
                C5207g.m11110e(c6195n, "workManagerImpl.trackers");
                C5700d c5700d = new C5700d(c6195n, constraintTrackingWorker);
                c5700d.m12066d(C9000b.m17251q(c6617sMo13237o));
                String string2 = constraintTrackingWorker.f7829b.f7801a.toString();
                C5207g.m11110e(string2, "id.toString()");
                if (!c5700d.m12065c(string2)) {
                    abstractC1314gM4867d.mo4869a(C7707a.f42234a, "Constraints not met for delegate " + strM4707e + ". Requesting retry.");
                    C1268a<AbstractC1246d.a> c1268a4 = constraintTrackingWorker.f7950h;
                    C5207g.m11110e(c1268a4, "future");
                    c1268a4.m4766i(new AbstractC1246d.a.b());
                    return;
                }
                abstractC1314gM4867d.mo4869a(C7707a.f42234a, "Constraints met for delegate " + strM4707e);
                int i10 = 3;
                try {
                    AbstractC1246d abstractC1246d = constraintTrackingWorker.f7951i;
                    C5207g.m11108c(abstractC1246d);
                    C1268a c1268aMo4697c = abstractC1246d.mo4697c();
                    C5207g.m11110e(c1268aMo4697c, "delegate!!.startWork()");
                    c1268aMo4697c.mo2629f(new RunnableC7907g(constraintTrackingWorker, i10, c1268aMo4697c), constraintTrackingWorker.f7829b.f7804d);
                    return;
                } catch (Throwable th2) {
                    String str2 = C7707a.f42234a;
                    String strM611g = C0141b.m611g("Delegated worker ", strM4707e, " threw exception in startWork.");
                    if (((AbstractC1314g.a) abstractC1314gM4867d).f8062c <= 3) {
                        Log.d(str2, strM611g, th2);
                    }
                    synchronized (constraintTrackingWorker.f7948f) {
                        try {
                            if (constraintTrackingWorker.f7949g) {
                                abstractC1314gM4867d.mo4869a(str2, "Constraints were unmet, Retrying.");
                                C1268a<AbstractC1246d.a> c1268a5 = constraintTrackingWorker.f7950h;
                                C5207g.m11110e(c1268a5, "future");
                                c1268a5.m4766i(new AbstractC1246d.a.b());
                            } else {
                                C1268a<AbstractC1246d.a> c1268a6 = constraintTrackingWorker.f7950h;
                                C5207g.m11110e(c1268a6, "future");
                                c1268a6.m4766i(new AbstractC1246d.a.C10594a());
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C5073m.a aVar = (C5073m.a) this.f490b;
                C5073m c5073m = C5073m.f32961a;
                aVar.mo10768d();
                return;
            case 8:
                FetchedAppSettingsManager.InterfaceC2306a interfaceC2306a = (FetchedAppSettingsManager.InterfaceC2306a) this.f490b;
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                interfaceC2306a.mo6675a();
                return;
            case 9:
                ToolTipPopup toolTipPopup = (ToolTipPopup) this.f490b;
                if (C6205a.m12742b(ToolTipPopup.class)) {
                    return;
                }
                try {
                    C5207g.m11111f(toolTipPopup, "this$0");
                    toolTipPopup.m6743a();
                    return;
                } catch (Throwable th4) {
                    C6205a.m12741a(ToolTipPopup.class, th4);
                    return;
                }
            case 10:
                C2353a0 c2353a0 = (C2353a0) this.f490b;
                int i11 = C2353a0.b.f11833b;
                c2353a0.m6786d();
                return;
            case 11:
                ((DefaultDrmSession) this.f490b).mo6938h(null);
                return;
            case 12:
                ((C2496m) this.f490b).f13333a0 = true;
                return;
            case 13:
                C2515b c2515b = (C2515b) this.f490b;
                int i12 = C2515b.f13517n0;
                c2515b.m7426f(false);
                return;
            case 14:
                SideSheetBehavior.C3051b c3051b = (SideSheetBehavior.C3051b) this.f490b;
                c3051b.f15465b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                C5365c c5365c = sideSheetBehavior.f15449i;
                if (c5365c != null && c5365c.m11527g()) {
                    c3051b.m8812a(c3051b.f15464a);
                    return;
                } else {
                    if (sideSheetBehavior.f15448h == 2) {
                        sideSheetBehavior.m8809s(c3051b.f15464a);
                    }
                    return;
                }
            case 15:
                C7312l c7312l = (C7312l) this.f490b;
                boolean zIsPopupShowing = c7312l.f40940h.isPopupShowing();
                c7312l.m14712t(zIsPopupShowing);
                c7312l.f40945m = zIsPopupShowing;
                return;
            case 16:
                C3219a c3219a = (C3219a) this.f490b;
                Object obj = C3219a.f16252m;
                c3219a.m9191b(false);
                return;
            case 17:
                final Context context = ((FirebaseMessaging) this.f490b).f16310d;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                try {
                    Context applicationContext2 = context.getApplicationContext();
                    PackageManager packageManager = applicationContext2.getPackageManager();
                    z10 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (Build.VERSION.SDK_INT < 29) {
                    z11 = false;
                }
                if (!z11) {
                    Tasks.m8539c(null);
                    return;
                } else {
                    final C5752h c5752h = new C5752h();
                    new Runnable() { // from class: com.google.firebase.messaging.r
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            C5752h c5752h2 = c5752h;
                            try {
                                if (Binder.getCallingUid() == context2.getApplicationInfo().uid) {
                                    Context applicationContext3 = context2.getApplicationContext();
                                    if (applicationContext3 == null) {
                                        applicationContext3 = context2;
                                    }
                                    SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                    editorEdit.putBoolean("proxy_notification_initialized", true);
                                    editorEdit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z10) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                } else {
                                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                }
                                c5752h2.m12116d(null);
                            } catch (Throwable th5) {
                                c5752h2.m12116d(null);
                                throw th5;
                            }
                        }
                    }.run();
                    return;
                }
            case 18:
                C3259v c3259v = (C3259v) this.f490b;
                synchronized (c3259v.f16445d) {
                    SharedPreferences.Editor editorEdit = c3259v.f16442a.edit();
                    String str3 = c3259v.f16443b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = c3259v.f16445d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(c3259v.f16444c);
                    }
                    editorEdit.putString(str3, sb2.toString()).commit();
                    break;
                }
                return;
            case 19:
                LessonProgressBar.setCompletedPages$lambda$31((LessonProgressBar) this.f490b);
                return;
            case 20:
                C8069e c8069e = (C8069e) this.f490b;
                C5207g.m11111f(c8069e, "this$0");
                C8069e.a aVar2 = c8069e.f43770a;
                Iterator<T> it2 = aVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC8403d) it2.next()).mo16426g(aVar2.getInstance());
                }
                return;
            default:
                C8821a c8821a = (C8821a) this.f490b;
                int i13 = C8822b.f46718c;
                C5207g.m11111f(c8821a, "this$0");
                Iterator it3 = c8821a.f46716b.iterator();
                while (it3.hasNext()) {
                    ((C8821a.a) it3.next()).mo17084a();
                }
                return;
        }
    }
}
