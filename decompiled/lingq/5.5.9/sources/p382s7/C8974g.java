package p382s7;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import dm.C5207g;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5078r;
import p128g2.RunnableC5682t;
import p173i8.C6205a;
import p286o2.RunnableC7907g;
import p291o7.C8004n;
import p291o7.C8010t;
import p394t7.C9217c;
import p394t7.C9218d;
import p476x7.C10106e;

/* JADX INFO: renamed from: s7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8974g {

    /* JADX INFO: renamed from: e */
    public static final String f47025e;

    /* JADX INFO: renamed from: a */
    public final Handler f47026a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<Activity> f47027b;

    /* JADX INFO: renamed from: c */
    public Timer f47028c;

    /* JADX INFO: renamed from: d */
    public String f47029d;

    /* JADX INFO: renamed from: s7.g$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static GraphRequest m17216a(String str, AccessToken accessToken, String str2) {
            String str3;
            String str4 = GraphRequest.f11448j;
            String str5 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            C5207g.m11110e(str5, "java.lang.String.format(locale, format, *args)");
            GraphRequest graphRequestM6622h = GraphRequest.C2279c.m6622h(accessToken, str5, null, null);
            Bundle bundle = graphRequestM6622h.f11454d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("tree", str);
            int i10 = C10106e.f51261a;
            Context contextM15871a = C8004n.m15871a();
            try {
                str3 = contextM15871a.getPackageManager().getPackageInfo(contextM15871a.getPackageName(), 0).versionName;
                C5207g.m11110e(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            } catch (PackageManager.NameNotFoundException unused) {
                str3 = "";
            }
            bundle.putString("app_version", str3);
            bundle.putString("platform", "android");
            bundle.putString("request_type", "app_indexing");
            if (C5207g.m11106a("app_indexing", "app_indexing")) {
                bundle.putString("device_session_id", C8970c.m17200a());
            }
            graphRequestM6622h.f11454d = bundle;
            graphRequestM6622h.m6612j(new GraphRequest.InterfaceC2278b() { // from class: s7.f
                @Override // com.facebook.GraphRequest.InterfaceC2278b
                /* JADX INFO: renamed from: a */
                public final void mo6614a(C8010t c8010t) {
                    C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, C8974g.m17213a(), "App index sent to FB!");
                }
            });
            return graphRequestM6622h;
        }
    }

    /* JADX INFO: renamed from: s7.g$b */
    public static final class b implements Callable<String> {

        /* JADX INFO: renamed from: a */
        public final WeakReference<View> f47030a;

        public b(View view) {
            this.f47030a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            View view = this.f47030a.get();
            if (view != null && view.getWidth() != 0) {
                if (view.getHeight() != 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    view.draw(new Canvas(bitmapCreateBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    C5207g.m11110e(strEncodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                    return strEncodeToString;
                }
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: s7.g$c */
    public static final class c extends TimerTask {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:24:0x004f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0053 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0054 A[Catch: Exception -> 0x0112, TRY_LEAVE, TryCatch #7 {Exception -> 0x0112, blocks: (B:3:0x0004, B:12:0x001b, B:17:0x002d, B:27:0x0054, B:30:0x005f, B:32:0x0067, B:39:0x0082, B:40:0x0086, B:45:0x00a3, B:46:0x00a9, B:49:0x00d1, B:63:0x010c, B:48:0x00c7, B:44:0x0099, B:23:0x004b, B:10:0x0016, B:36:0x007d, B:7:0x0012, B:41:0x0089, B:20:0x0043, B:53:0x00e5, B:60:0x0106, B:57:0x00f3), top: B:83:0x0004, inners: #0, #1, #3, #4, #5, #6 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x005f A[Catch: Exception -> 0x0112, TRY_ENTER, TryCatch #7 {Exception -> 0x0112, blocks: (B:3:0x0004, B:12:0x001b, B:17:0x002d, B:27:0x0054, B:30:0x005f, B:32:0x0067, B:39:0x0082, B:40:0x0086, B:45:0x00a3, B:46:0x00a9, B:49:0x00d1, B:63:0x010c, B:48:0x00c7, B:44:0x0099, B:23:0x004b, B:10:0x0016, B:36:0x007d, B:7:0x0012, B:41:0x0089, B:20:0x0043, B:53:0x00e5, B:60:0x0106, B:57:0x00f3), top: B:83:0x0004, inners: #0, #1, #3, #4, #5, #6 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0067 A[Catch: Exception -> 0x0112, TRY_LEAVE, TryCatch #7 {Exception -> 0x0112, blocks: (B:3:0x0004, B:12:0x001b, B:17:0x002d, B:27:0x0054, B:30:0x005f, B:32:0x0067, B:39:0x0082, B:40:0x0086, B:45:0x00a3, B:46:0x00a9, B:49:0x00d1, B:63:0x010c, B:48:0x00c7, B:44:0x0099, B:23:0x004b, B:10:0x0016, B:36:0x007d, B:7:0x0012, B:41:0x0089, B:20:0x0043, B:53:0x00e5, B:60:0x0106, B:57:0x00f3), top: B:83:0x0004, inners: #0, #1, #3, #4, #5, #6 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x007c  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:79:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            WeakReference<Activity> weakReference;
            Activity activity;
            View viewM18963b;
            String simpleName;
            boolean z10;
            String str;
            String string;
            try {
                boolean zM12742b = C6205a.m12742b(C8974g.class);
                Handler handler = null;
                C8974g c8974g = C8974g.this;
                if (!zM12742b) {
                    try {
                        weakReference = c8974g.f47027b;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8974g.class, th2);
                        weakReference = null;
                    }
                    activity = weakReference.get();
                    viewM18963b = C10106e.m18963b(activity);
                    if (activity == null && viewM18963b != null) {
                        simpleName = activity.getClass().getSimpleName();
                        C8970c c8970c = C8970c.f46998a;
                        if (C6205a.m12742b(C8970c.class)) {
                            z10 = false;
                        } else {
                            try {
                                z10 = C8970c.f47004g.get();
                            } catch (Throwable th3) {
                                C6205a.m12741a(C8970c.class, th3);
                                z10 = false;
                            }
                        }
                        if (z10) {
                            str = "";
                            if (C5207g.m11106a(null, Boolean.TRUE)) {
                                C9217c.m17565a("CaptureViewHierarchy", "");
                                return;
                            }
                            FutureTask futureTask = new FutureTask(new b(viewM18963b));
                            if (!C6205a.m12742b(C8974g.class)) {
                                try {
                                    handler = c8974g.f47026a;
                                } catch (Throwable th4) {
                                    C6205a.m12741a(C8974g.class, th4);
                                }
                            }
                            handler.post(futureTask);
                            try {
                                str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                            } catch (Exception e10) {
                                Log.e(C8974g.m17213a(), "Failed to take screenshot.", e10);
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("screenname", simpleName);
                                jSONObject.put("screenshot", str);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(C9218d.m17568c(viewM18963b));
                                jSONObject.put("view", jSONArray);
                            } catch (JSONException unused) {
                                Log.e(C8974g.m17213a(), "Failed to create JSONObject");
                            }
                            string = jSONObject.toString();
                            C5207g.m11110e(string, "viewTree.toString()");
                            if (C6205a.m12742b(C8974g.class)) {
                                return;
                            }
                            try {
                                c8974g.getClass();
                                if (C6205a.m12742b(c8974g)) {
                                    return;
                                }
                                try {
                                    C8004n.m15873c().execute(new RunnableC7907g(string, 6, c8974g));
                                } catch (Throwable th5) {
                                    C6205a.m12741a(c8974g, th5);
                                    return;
                                }
                            } catch (Throwable th6) {
                                C6205a.m12741a(C8974g.class, th6);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                weakReference = null;
                activity = weakReference.get();
                viewM18963b = C10106e.m18963b(activity);
                if (activity == null) {
                    return;
                }
                simpleName = activity.getClass().getSimpleName();
                C8970c c8970c2 = C8970c.f46998a;
                if (C6205a.m12742b(C8970c.class)) {
                    z10 = false;
                } else {
                    z10 = C8970c.f47004g.get();
                }
                if (z10) {
                    return;
                }
                str = "";
                if (C5207g.m11106a(null, Boolean.TRUE)) {
                    C9217c.m17565a("CaptureViewHierarchy", "");
                    return;
                }
                FutureTask futureTask2 = new FutureTask(new b(viewM18963b));
                if (!C6205a.m12742b(C8974g.class)) {
                    handler = c8974g.f47026a;
                }
                handler.post(futureTask2);
                str = (String) futureTask2.get(1L, TimeUnit.SECONDS);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("screenname", simpleName);
                jSONObject2.put("screenshot", str);
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(C9218d.m17568c(viewM18963b));
                jSONObject2.put("view", jSONArray2);
                string = jSONObject2.toString();
                C5207g.m11110e(string, "viewTree.toString()");
                if (C6205a.m12742b(C8974g.class)) {
                    return;
                }
                c8974g.getClass();
                if (C6205a.m12742b(c8974g)) {
                    return;
                }
                C8004n.m15873c().execute(new RunnableC7907g(string, 6, c8974g));
            } catch (Exception e11) {
                Log.e(C8974g.m17213a(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = C8974g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f47025e = canonicalName;
    }

    public C8974g(Activity activity) {
        C5207g.m11111f(activity, "activity");
        this.f47027b = new WeakReference<>(activity);
        this.f47029d = null;
        this.f47026a = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m17213a() {
        if (C6205a.m12742b(C8974g.class)) {
            return null;
        }
        try {
            return f47025e;
        } catch (Throwable th2) {
            C6205a.m12741a(C8974g.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17214b(GraphRequest graphRequest, String str) {
        String str2 = f47025e;
        if (C6205a.m12742b(this) || graphRequest == null) {
            return;
        }
        try {
            C8010t c8010tM6606c = graphRequest.m6606c();
            try {
                JSONObject jSONObject = c8010tM6606c.f43587b;
                if (jSONObject == null) {
                    Log.e(str2, C5207g.m11116k(c8010tM6606c.f43588c, "Error sending UI component tree to Facebook: "));
                    return;
                }
                if (C5207g.m11106a("true", jSONObject.optString("success"))) {
                    C5078r.f32986e.m10780b(LoggingBehavior.APP_EVENTS, str2, "Successfully send UI component tree to server");
                    this.f47029d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z10 = jSONObject.getBoolean("is_app_indexing_enabled");
                    C8970c c8970c = C8970c.f46998a;
                    if (C6205a.m12742b(C8970c.class)) {
                        return;
                    }
                    try {
                        C8970c.f47004g.set(z10);
                    } catch (Throwable th2) {
                        C6205a.m12741a(C8970c.class, th2);
                    }
                }
            } catch (JSONException e10) {
                Log.e(str2, "Error decoding server response.", e10);
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17215c() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            try {
                C8004n.m15873c().execute(new RunnableC5682t(this, 5, new c()));
            } catch (RejectedExecutionException e10) {
                Log.e(f47025e, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
