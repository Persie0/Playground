package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.compose.foundation.gestures.snapping.AbstractC0113b;
import androidx.compose.runtime.AbstractC0278f;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import com.lingq.core.database.entity.TranslationSentenceEntity;
import com.lingq.core.domain.model.chat.ChatMessage$$serializer;
import com.lingq.core.domain.model.lesson.LessonTextToken;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.lesson.Note;
import com.lingq.core.domain.model.lesson.Translation;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.security.Provider;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qn3 implements gg5, tk1, InterfaceC3458pf, fi0, InterfaceC3407of, InterfaceC0786au, ks2 {

    /* JADX INFO: renamed from: b */
    public static volatile qn3 f57969b;

    /* JADX INFO: renamed from: c */
    public static final Object f57970c = new Object();

    /* JADX INFO: renamed from: d */
    public static final rk3 f57971d = new rk3(1);

    /* JADX INFO: renamed from: e */
    public static final g9c f57972e = new g9c(18);

    /* JADX INFO: renamed from: f */
    public static final smd f57973f = new smd();

    /* JADX INFO: renamed from: a */
    public Object f57974a;

    public qn3(int i) {
        qx5 qx5Var;
        switch (i) {
            case 2:
                try {
                    qx5Var = (qx5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    qx5Var = f57971d;
                }
                qx5[] qx5VarArr = {rk3.f59426b, qx5Var};
                mp5 mp5Var = new mp5();
                mp5Var.f51701a = qx5VarArr;
                Charset charset = p94.f55800a;
                this.f57974a = mp5Var;
                break;
            case 3:
                int i2 = dhb.f35664a;
                this.f57974a = new nr9(new vib[]{ho5.f42708l, f57972e});
                break;
            case 5:
                this.f57974a = new C0834c4(this);
                break;
            case 10:
                this.f57974a = new HashMap();
                break;
            case 12:
                this.f57974a = new AtomicReference(null);
                break;
            case 14:
                this.f57974a = new CopyOnWriteArrayList();
                break;
            case 20:
                this.f57974a = ss5.m21704c(new C2951e4(14));
                break;
            case 24:
                this.f57974a = Handler.createAsync(Looper.getMainLooper());
                break;
            case 29:
                this.f57974a = new sg3(0);
                break;
            default:
                this.f57974a = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: H */
    public static String m20044H(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: X */
    public static void m20045X(String str, rmd rmdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(rmdVar.f59560b / 1000000)));
        sb.append(": logging error [");
        bnd bndVar = rmdVar.f59562d;
        if (bndVar == null) {
            C3386nv.m17633t("cannot request log site information prior to postProcess()");
            return;
        }
        uea.m22718c(1, bndVar, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    /* JADX INFO: renamed from: n */
    public static Long m20046n(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static Date m20047q(Long l) {
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public String m20048A(List list) {
        list.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(Note.Companion.serializer()), list);
    }

    /* JADX INFO: renamed from: B */
    public String m20049B(List list) {
        if (list == null) {
            return null;
        }
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(thb.m22059r(sk9.f60959a)), list);
    }

    /* JADX INFO: renamed from: C */
    public boolean mo1757C(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: D */
    public JSONObject m20050D() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f57974a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(pb1.m19029Q(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        pb1.m19047q(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    pb1.m19047q(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            pb1.m19047q(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            pb1.m19047q(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m20051E(Activity activity) {
        sg3 sg3Var = (sg3) this.f57974a;
        ArrayList<WeakReference> arrayList = (ArrayList) sg3Var.f60818d;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((rg3) sg3Var.f60819e);
    }

    /* JADX INFO: renamed from: F */
    public void m20052F(float f, long j) {
        ym0 ym0VarM16515r = ((C3309ls) this.f57974a).m16515r();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ym0VarM16515r.mo17023o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ym0VarM16515r.mo17011c(f);
        ym0VarM16515r.mo17023o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: G */
    public void m20053G(float f, float f2, long j) {
        ym0 ym0VarM16515r = ((C3309ls) this.f57974a).m16515r();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        ym0VarM16515r.mo17023o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        ym0VarM16515r.mo17010b(f, f2);
        ym0VarM16515r.mo17023o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: I */
    public List m20054I(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(ChatMessage$$serializer.INSTANCE));
    }

    /* JADX INFO: renamed from: J */
    public ArrayList m20055J(String str) {
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return u91.m22587E0((Iterable) yf4Var.m10321a(str, new C2978ev(thb.m22059r(l73.f49244a))));
    }

    /* JADX INFO: renamed from: K */
    public List m20056K(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(LessonTransliteration.Companion.serializer()));
    }

    /* JADX INFO: renamed from: L */
    public List m20057L(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(LibraryTab.Companion.serializer()));
    }

    /* JADX INFO: renamed from: M */
    public List m20058M(String str) {
        if (str == null || vk9.m23391n0(str)) {
            return EmptyList.f47638a;
        }
        try {
            yf4 yf4Var = (yf4) this.f57974a;
            yf4Var.getClass();
            return (List) yf4Var.m10321a(str, new C2978ev(sk9.f60959a));
        } catch (Exception unused) {
            List listM23366B0 = vk9.m23366B0(str, new char[]{','});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM23366B0) {
                if (!vk9.m23391n0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: N */
    public List m20059N(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(TokenMeaning.Companion.serializer()));
    }

    /* JADX INFO: renamed from: O */
    public List m20060O(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(Note.Companion.serializer()));
    }

    /* JADX INFO: renamed from: P */
    public List m20061P(String str) {
        if (str == null || vk9.m23391n0(str)) {
            return null;
        }
        try {
            yf4 yf4Var = (yf4) this.f57974a;
            yf4Var.getClass();
            return (List) yf4Var.m10321a(str, new C2978ev(thb.m22059r(sk9.f60959a)));
        } catch (Exception unused) {
            return vk9.m23366B0(str, new char[]{','});
        }
    }

    /* JADX INFO: renamed from: Q */
    public List m20062Q(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(TranslationSentenceEntity.Companion.serializer()));
    }

    /* JADX INFO: renamed from: R */
    public List m20063R(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(LessonTextToken.Companion.serializer()));
    }

    /* JADX INFO: renamed from: S */
    public List m20064S(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(Translation.Companion.serializer()));
    }

    /* JADX INFO: renamed from: T */
    public List m20065T(String str) {
        str.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return (List) yf4Var.m10321a(str, new C2978ev(TextToSpeechAppVoice.Companion.serializer()));
    }

    /* JADX INFO: renamed from: U */
    public String m20066U(List list) {
        list.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(LessonTextToken.Companion.serializer()), list);
    }

    /* JADX INFO: renamed from: V */
    public void m20067V(float f, float f2) {
        ((C3309ls) this.f57974a).m16515r().mo17023o(f, f2);
    }

    /* JADX INFO: renamed from: W */
    public String m20068W(List list) {
        list.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(Translation.Companion.serializer()), list);
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: a */
    public void mo12582a(int i, int i2) {
        ((se5) this.f57974a).f55486a.m19619c(i, i2);
    }

    @Override // p000.fi0
    /* JADX INFO: renamed from: b */
    public void mo11842b(qp1 qp1Var) {
        this.f57974a = qp1Var;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: c */
    public void mo12583c(int i, int i2) {
        ((se5) this.f57974a).f55486a.m19621e(i, i2);
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: d */
    public void mo12584d(int i, int i2) {
        ((se5) this.f57974a).f55486a.m19622f(i, i2);
    }

    @Override // p000.InterfaceC0786au
    /* JADX INFO: renamed from: e */
    public Object mo3040e(wn8 wn8Var, Float f, Float f2, vi3 vi3Var, Continuation continuation) {
        Object objM924a = AbstractC0113b.m924a(wn8Var, f.floatValue(), r46.m20376a(0.0f, f2.floatValue(), 28), (f32) this.f57974a, vi3Var, (ContinuationImpl) continuation);
        return objM924a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM924a : (C3764xm) objM924a;
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: f */
    public void mo12585f(int i, int i2) {
        ((se5) this.f57974a).f55486a.m19620d(i, i2);
    }

    @Override // p000.InterfaceC3407of
    /* JADX INFO: renamed from: g */
    public void mo16507g(Bundle bundle) {
        ((C3182kf) ((InterfaceC3036gf) this.f57974a)).m15167a("clx", "_ae", bundle);
    }

    @Override // p000.InterfaceC3458pf
    /* JADX INFO: renamed from: h */
    public void mo16508h(String str, Bundle bundle) {
        qp1 qp1Var = (qp1) this.f57974a;
        if (qp1Var != null) {
            try {
                String str2 = "$A$:" + m20044H(str, bundle);
                tp1 tp1Var = qp1Var.f58024a;
                tp1Var.f62668o.f13668a.m9856b(new rp1(tp1Var, System.currentTimeMillis() - tp1Var.f62657d, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo1758i(int i, C0797b4 c0797b4, String str, Bundle bundle) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x000b), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x0050, LOOP:1: B:17:0x0040->B:19:0x0046, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x000b), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public synchronized void m20069j(PersistedEvents persistedEvents) {
        cz8 cz8VarM20075u;
        Iterator it;
        Set<Map.Entry> set = null;
        if (lp1.f49971a.contains(persistedEvents)) {
            for (Map.Entry entry : set) {
                cz8VarM20075u = m20075u((AccessTokenAppIdPair) entry.getKey());
                if (cz8VarM20075u != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        cz8VarM20075u.m9940a((AppEvent) it.next());
                    }
                }
            }
        } else {
            try {
                Set setEntrySet = persistedEvents.f11389a.entrySet();
                setEntrySet.getClass();
                set = setEntrySet;
            } catch (Throwable th) {
                lp1.m16420a(persistedEvents, th);
            }
            while (r4.hasNext()) {
                cz8VarM20075u = m20075u((AccessTokenAppIdPair) entry.getKey());
                if (cz8VarM20075u != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        cz8VarM20075u.m9940a((AppEvent) it.next());
                    }
                }
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public void m20070k(float f, float f2, float f3, float f4, int i) {
        ((C3309ls) this.f57974a).m16515r().mo17022n(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: l */
    public C0797b4 mo1759l(int i) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public nk1 m20071m(Object obj, z21 z21Var, Activity activity, vi3 vi3Var) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        mk1 mk1Var = new mk1(z21Var, vi3Var);
        ClassLoader classLoader = (ClassLoader) this.f57974a;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, mk1Var);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new nk1(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }

    /* JADX INFO: renamed from: o */
    public C0797b4 mo1760o(int i) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public String m20072p(List list) {
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(l73.f49244a), list);
    }

    @Override // p000.ks2
    /* JADX INFO: renamed from: r */
    public Object mo13283r(String str) {
        ns2 ns2Var = (ns2) this.f57974a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ns2Var.mo10838d(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return ns2Var.mo10838d(str, null);
    }

    /* JADX INFO: renamed from: s */
    public synchronized int m20073s() {
        int i;
        int size;
        i = 0;
        for (cz8 cz8Var : ((HashMap) this.f57974a).values()) {
            synchronized (cz8Var) {
                if (!lp1.f49971a.contains(cz8Var)) {
                    try {
                        size = cz8Var.f34741c.size();
                    } catch (Throwable th) {
                        lp1.m16420a(cz8Var, th);
                        size = 0;
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    /* JADX INFO: renamed from: t */
    public dh9 m20074t() {
        pq2 pq2VarM19448a = pq2.m19448a();
        if (pq2VarM19448a.m19451c() == 1) {
            return new z04(true);
        }
        t66 t66VarM1260j = AbstractC0278f.m1260j(Boolean.FALSE);
        pq2VarM19448a.m19455h(new r62(t66VarM1260j, this));
        return t66VarM1260j;
    }

    /* JADX INFO: renamed from: u */
    public synchronized cz8 m20075u(AccessTokenAppIdPair accessTokenAppIdPair) {
        Context contextM21766a;
        C3388nx c3388nxM19782l;
        cz8 cz8Var = (cz8) ((HashMap) this.f57974a).get(accessTokenAppIdPair);
        if (cz8Var == null && (c3388nxM19782l = AbstractC3489q9.m19782l((contextM21766a = sy2.m21766a()))) != null) {
            cz8Var = new cz8(c3388nxM19782l, thb.m22056o(contextM21766a));
        }
        if (cz8Var == null) {
            return null;
        }
        ((HashMap) this.f57974a).put(accessTokenAppIdPair, cz8Var);
        return cz8Var;
    }

    /* JADX INFO: renamed from: v */
    public void m20076v(float f, float f2, float f3, float f4) {
        C3309ls c3309ls = (C3309ls) this.f57974a;
        ym0 ym0VarM16515r = c3309ls.m16515r();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c3309ls.m16483A() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c3309ls.m16483A() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            h54.m13056a("Width and height must be greater than or equal to zero");
        }
        c3309ls.m16501U(jFloatToRawIntBits);
        ym0VarM16515r.mo17023o(f, f2);
    }

    /* JADX INFO: renamed from: w */
    public synchronized Set m20077w() {
        Set setKeySet;
        setKeySet = ((HashMap) this.f57974a).keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    /* JADX INFO: renamed from: x */
    public String m20078x(List list) {
        list.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(LessonTransliteration.Companion.serializer()), list);
    }

    /* JADX INFO: renamed from: y */
    public String m20079y(List list) {
        if (list == null) {
            return null;
        }
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(sk9.f60959a), list);
    }

    /* JADX INFO: renamed from: z */
    public String m20080z(List list) {
        list.getClass();
        yf4 yf4Var = (yf4) this.f57974a;
        yf4Var.getClass();
        return yf4Var.m10322b(new C2978ev(TokenMeaning.Companion.serializer()), list);
    }

    public qn3(zw0 zw0Var) {
        zw0Var.getClass();
        this.f57974a = zw0Var;
    }

    public /* synthetic */ qn3(Object obj) {
        this.f57974a = obj;
    }

    public qn3(ClassLoader classLoader) {
        classLoader.getClass();
        this.f57974a = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[PHI: r9
      0x0024: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    public qn3(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        C2977eu[][] c2977euArr = new C2977eu[length][];
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i4 < length) {
            int i5 = iArr[i4];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i2 = 1;
                i = i2;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i3;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i2 != 1) {
                            i2 = 1;
                        }
                        i = i2;
                    }
                }
                i2 = 2;
                i = i2;
            }
            float[] fArr3 = fArr2[i4];
            int i7 = i4 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i4];
            float f2 = fArr[i7];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C2977eu[] c2977euArr2 = new C2977eu[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = i8 * 2;
                C2977eu[] c2977euArr3 = c2977euArr2;
                int i10 = i8;
                int i11 = i9 + 1;
                c2977euArr3[i10] = new C2977eu(i, f, f2, fArr3[i9], fArr3[i11], fArr4[i9], fArr4[i11]);
                i8 = i10 + 1;
                c2977euArr2 = c2977euArr3;
            }
            c2977euArr[i4] = c2977euArr2;
            i4 = i7;
            i3 = i;
        }
        this.f57974a = c2977euArr;
    }

    public qn3(ed1 ed1Var) {
        Context context = (Context) ed1Var.f37033a;
        String str = (String) ed1Var.f37034b;
        String str2 = (String) ed1Var.f37035c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f57974a = (or3) ed1Var.f37039g;
            return;
        }
        C3386nv.m17626m("keysetName cannot be null");
        throw null;
    }
}
