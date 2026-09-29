package p029b8;

import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import com.facebook.appevents.p050ml.ModelManager;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import mo.C7661i;
import org.json.JSONException;
import org.json.JSONObject;
import p067d8.C5086z;
import p173i8.C6205a;
import p213k4.RunnableC6590j;
import p291o7.C8004n;
import p317p7.C8201h;
import p394t7.C9218d;

/* JADX INFO: renamed from: b8.g */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1341g implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public static final HashSet f8155e;

    /* JADX INFO: renamed from: a */
    public final View.OnClickListener f8156a;

    /* JADX INFO: renamed from: b */
    public final WeakReference<View> f8157b;

    /* JADX INFO: renamed from: c */
    public final WeakReference<View> f8158c;

    /* JADX INFO: renamed from: d */
    public final String f8159d;

    /* JADX INFO: renamed from: b8.g$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX INFO: renamed from: a */
        public static final boolean m4922a(String str, String str2) {
            String str3;
            HashSet hashSet = ViewOnClickListenerC1341g.f8155e;
            C1336b c1336b = C1336b.f8137a;
            if (C6205a.m12742b(C1336b.class)) {
                str3 = null;
            } else {
                try {
                    LinkedHashMap linkedHashMap = C1336b.f8138b;
                    if (linkedHashMap.containsKey(str)) {
                        str3 = (String) linkedHashMap.get(str);
                    } else {
                        str3 = null;
                    }
                } catch (Throwable th2) {
                    C6205a.m12741a(C1336b.class, th2);
                }
            }
            if (str3 == null) {
                return false;
            }
            if (!C5207g.m11106a(str3, "other")) {
                RunnableC6590j runnableC6590j = new RunnableC6590j(str3, str2);
                C5086z c5086z = C5086z.f33015a;
                try {
                    C8004n.m15873c().execute(runnableC6590j);
                } catch (Exception unused) {
                }
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:41:0x009d  */
        /* JADX WARN: Code duplicated, block: B:52:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m4923b(View view, View view2, String str) {
            HashSet hashSet;
            ViewOnClickListenerC1341g viewOnClickListenerC1341g;
            Object declaredField;
            Field declaredField2;
            Field field;
            Object obj;
            C5207g.m11111f(view, "hostView");
            int iHashCode = view.hashCode();
            HashSet hashSet2 = ViewOnClickListenerC1341g.f8155e;
            HashSet hashSet3 = null;
            if (!C6205a.m12742b(ViewOnClickListenerC1341g.class)) {
                try {
                    hashSet = ViewOnClickListenerC1341g.f8155e;
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewOnClickListenerC1341g.class, th2);
                    hashSet = hashSet3;
                }
                if (hashSet.contains(Integer.valueOf(iHashCode))) {
                }
                C9218d c9218d = C9218d.f47829a;
                viewOnClickListenerC1341g = new ViewOnClickListenerC1341g(view, view2, str);
                if (C6205a.m12742b(C9218d.class)) {
                    try {
                        try {
                            declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                            try {
                                declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                                field = declaredField;
                            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                declaredField2 = hashSet3;
                                field = declaredField;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                            declaredField = hashSet3;
                        }
                        if (field != 0 || declaredField2 == 0) {
                            view.setOnClickListener(viewOnClickListenerC1341g);
                        } else {
                            field.setAccessible(true);
                            declaredField2.setAccessible(true);
                            try {
                                field.setAccessible(true);
                                obj = field.get(view);
                            } catch (IllegalAccessException unused3) {
                                obj = hashSet3;
                            }
                            if (obj == null) {
                                view.setOnClickListener(viewOnClickListenerC1341g);
                            } else {
                                declaredField2.set(obj, viewOnClickListenerC1341g);
                            }
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th3) {
                        C6205a.m12741a(C9218d.class, th3);
                    }
                }
                if (C6205a.m12742b(ViewOnClickListenerC1341g.class)) {
                    try {
                        hashSet3 = ViewOnClickListenerC1341g.f8155e;
                    } catch (Throwable th4) {
                        C6205a.m12741a(ViewOnClickListenerC1341g.class, th4);
                    }
                }
                hashSet3.add(Integer.valueOf(iHashCode));
            }
            hashSet = hashSet3;
            if (hashSet.contains(Integer.valueOf(iHashCode))) {
                C9218d c9218d2 = C9218d.f47829a;
                viewOnClickListenerC1341g = new ViewOnClickListenerC1341g(view, view2, str);
                if (C6205a.m12742b(C9218d.class)) {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    field = declaredField;
                    if (field != 0) {
                    }
                    view.setOnClickListener(viewOnClickListenerC1341g);
                }
                if (C6205a.m12742b(ViewOnClickListenerC1341g.class)) {
                    hashSet3 = ViewOnClickListenerC1341g.f8155e;
                }
                hashSet3.add(Integer.valueOf(iHashCode));
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0027  */
        /* JADX WARN: Code duplicated, block: B:16:0x003b  */
        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0067  */
        /* JADX WARN: Code duplicated, block: B:30:0x007b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0096 A[Catch: JSONException -> 0x00ef, LOOP:0: B:32:0x0094->B:33:0x0096, LOOP_END, TryCatch #3 {JSONException -> 0x00ef, blocks: (B:31:0x0081, B:33:0x0096, B:34:0x00a6), top: B:43:0x0081 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: c */
        public static void m4924c(String str, String str2, float[] fArr) throws Throwable {
            boolean zContains;
            boolean zContains2;
            StringBuilder sb2;
            int length;
            int i10;
            C8201h c8201h;
            C1338d c1338d = C1338d.f8143a;
            if (!C6205a.m12742b(C1338d.class)) {
                try {
                    C5207g.m11111f(str, "event");
                    zContains = C1338d.f8145c.contains(str);
                } catch (Throwable th2) {
                    C6205a.m12741a(C1338d.class, th2);
                    zContains = false;
                }
                if (zContains) {
                    c8201h = new C8201h(C8004n.m15871a(), (String) null);
                    if (C6205a.m12742b(c8201h)) {
                        return;
                    }
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString("_is_suggested_event", "1");
                        bundle.putString("_button_text", str2);
                        c8201h.m16332d(bundle, str);
                        return;
                    } catch (Throwable th3) {
                        C6205a.m12741a(c8201h, th3);
                        return;
                    }
                }
                C1338d c1338d2 = C1338d.f8143a;
                if (C6205a.m12742b(C1338d.class)) {
                    try {
                        C5207g.m11111f(str, "event");
                        zContains2 = C1338d.f8146d.contains(str);
                    } catch (Throwable th4) {
                        C6205a.m12741a(C1338d.class, th4);
                        zContains2 = false;
                    }
                    if (zContains2) {
                        Bundle bundle2 = new Bundle();
                        try {
                            bundle2.putString("event_name", str);
                            JSONObject jSONObject = new JSONObject();
                            sb2 = new StringBuilder();
                            length = fArr.length;
                            i10 = 0;
                            while (i10 < length) {
                                float f3 = fArr[i10];
                                i10++;
                                sb2.append(f3);
                                sb2.append(",");
                            }
                            jSONObject.put("dense", sb2.toString());
                            jSONObject.put("button_text", str2);
                            bundle2.putString("metadata", jSONObject.toString());
                            String str3 = GraphRequest.f11448j;
                            String str4 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
                            C5207g.m11110e(str4, "java.lang.String.format(locale, format, *args)");
                            GraphRequest graphRequestM6622h = GraphRequest.C2279c.m6622h(null, str4, null, null);
                            graphRequestM6622h.f11454d = bundle2;
                            graphRequestM6622h.m6606c();
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                }
                zContains2 = false;
                if (zContains2) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("event_name", str);
                    JSONObject jSONObject2 = new JSONObject();
                    sb2 = new StringBuilder();
                    length = fArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        float f10 = fArr[i10];
                        i10++;
                        sb2.append(f10);
                        sb2.append(",");
                    }
                    jSONObject2.put("dense", sb2.toString());
                    jSONObject2.put("button_text", str2);
                    bundle3.putString("metadata", jSONObject2.toString());
                    String str5 = GraphRequest.f11448j;
                    String str6 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
                    C5207g.m11110e(str6, "java.lang.String.format(locale, format, *args)");
                    GraphRequest graphRequestM6622h2 = GraphRequest.C2279c.m6622h(null, str6, null, null);
                    graphRequestM6622h2.f11454d = bundle3;
                    graphRequestM6622h2.m6606c();
                }
            }
            zContains = false;
            if (zContains) {
                c8201h = new C8201h(C8004n.m15871a(), (String) null);
                if (C6205a.m12742b(c8201h)) {
                    return;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString("_is_suggested_event", "1");
                bundle4.putString("_button_text", str2);
                c8201h.m16332d(bundle4, str);
                return;
            }
            C1338d c1338d3 = C1338d.f8143a;
            if (C6205a.m12742b(C1338d.class)) {
                C5207g.m11111f(str, "event");
                zContains2 = C1338d.f8146d.contains(str);
                if (zContains2) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("event_name", str);
                    JSONObject jSONObject3 = new JSONObject();
                    sb2 = new StringBuilder();
                    length = fArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        float f11 = fArr[i10];
                        i10++;
                        sb2.append(f11);
                        sb2.append(",");
                    }
                    jSONObject3.put("dense", sb2.toString());
                    jSONObject3.put("button_text", str2);
                    bundle5.putString("metadata", jSONObject3.toString());
                    String str7 = GraphRequest.f11448j;
                    String str8 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
                    C5207g.m11110e(str8, "java.lang.String.format(locale, format, *args)");
                    GraphRequest graphRequestM6622h3 = GraphRequest.C2279c.m6622h(null, str8, null, null);
                    graphRequestM6622h3.f11454d = bundle5;
                    graphRequestM6622h3.m6606c();
                }
            }
            zContains2 = false;
            if (zContains2) {
                Bundle bundle6 = new Bundle();
                bundle6.putString("event_name", str);
                JSONObject jSONObject4 = new JSONObject();
                sb2 = new StringBuilder();
                length = fArr.length;
                i10 = 0;
                while (i10 < length) {
                    float f12 = fArr[i10];
                    i10++;
                    sb2.append(f12);
                    sb2.append(",");
                }
                jSONObject4.put("dense", sb2.toString());
                jSONObject4.put("button_text", str2);
                bundle6.putString("metadata", jSONObject4.toString());
                String str9 = GraphRequest.f11448j;
                String str10 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C8004n.m15872b()}, 1));
                C5207g.m11110e(str10, "java.lang.String.format(locale, format, *args)");
                GraphRequest graphRequestM6622h4 = GraphRequest.C2279c.m6622h(null, str10, null, null);
                graphRequestM6622h4.f11454d = bundle6;
                graphRequestM6622h4.m6606c();
            }
        }
    }

    static {
        new a();
        f8155e = new HashSet();
    }

    public ViewOnClickListenerC1341g(View view, View view2, String str) {
        this.f8156a = C9218d.m17569e(view);
        this.f8157b = new WeakReference<>(view2);
        this.f8158c = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f8159d = C7661i.m15254T2(lowerCase, "activity", "");
    }

    /* JADX INFO: renamed from: a */
    public final void m4921a() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            View view = this.f8157b.get();
            View view2 = this.f8158c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                final String strM4911d = C1337c.m4911d(view2);
                final String strM4907b = C1336b.m4907b(view2, strM4911d);
                if (strM4907b == null || a.m4922a(strM4907b, strM4911d)) {
                    return;
                }
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put("view", C1337c.m4910b(view, view2));
                jSONObject.put("screenname", this.f8159d);
                if (C6205a.m12742b(this)) {
                    return;
                }
                try {
                    Runnable runnable = new Runnable() { // from class: b8.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            JSONObject jSONObject2 = jSONObject;
                            String str = strM4911d;
                            ViewOnClickListenerC1341g viewOnClickListenerC1341g = this;
                            String str2 = strM4907b;
                            if (C6205a.m12742b(ViewOnClickListenerC1341g.class)) {
                                return;
                            }
                            try {
                                C5207g.m11111f(jSONObject2, "$viewData");
                                C5207g.m11111f(str, "$buttonText");
                                C5207g.m11111f(viewOnClickListenerC1341g, "this$0");
                                C5207g.m11111f(str2, "$pathID");
                                try {
                                    C5086z c5086z = C5086z.f33015a;
                                    String strM10828m = C5086z.m10828m(C8004n.m15871a());
                                    if (strM10828m == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                    String lowerCase = strM10828m.toLowerCase();
                                    C5207g.m11110e(lowerCase, "(this as java.lang.String).toLowerCase()");
                                    float[] fArrM4894a = C1335a.m4894a(lowerCase, jSONObject2);
                                    String strM4895c = C1335a.m4895c(str, viewOnClickListenerC1341g.f8159d, lowerCase);
                                    if (fArrM4894a == null) {
                                        return;
                                    }
                                    ModelManager modelManager = ModelManager.f11524a;
                                    String[] strArrM6650f = ModelManager.m6650f(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{fArrM4894a}, new String[]{strM4895c});
                                    if (strArrM6650f == null) {
                                        return;
                                    }
                                    String str3 = strArrM6650f[0];
                                    C1336b.m4906a(str2, str3);
                                    if (C5207g.m11106a(str3, "other")) {
                                        return;
                                    }
                                    HashSet hashSet = ViewOnClickListenerC1341g.f8155e;
                                    ViewOnClickListenerC1341g.a.m4924c(str3, str, fArrM4894a);
                                } catch (Exception unused) {
                                }
                            } catch (Throwable th2) {
                                C6205a.m12741a(ViewOnClickListenerC1341g.class, th2);
                            }
                        }
                    };
                    C5086z c5086z = C5086z.f33015a;
                    C8004n.m15873c().execute(runnable);
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(view, "view");
            View.OnClickListener onClickListener = this.f8156a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m4921a();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
