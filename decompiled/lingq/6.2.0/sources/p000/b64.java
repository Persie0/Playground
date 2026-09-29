package p000;

import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.R$styleable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.C0713b;
import androidx.media3.container.C0715b;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public class b64 implements u31, InterfaceC2974er, xl0, fm1 {

    /* JADX INFO: renamed from: c */
    public static final ho5 f8002c = new ho5(13);

    /* JADX INFO: renamed from: d */
    public static final Object f8003d = new Object();

    /* JADX INFO: renamed from: e */
    public static HandlerThread f8004e;

    /* JADX INFO: renamed from: f */
    public static ExecutorService f8005f;

    /* JADX INFO: renamed from: a */
    public Object f8006a;

    /* JADX INFO: renamed from: b */
    public Object f8007b;

    public b64(int i) {
        switch (i) {
            case 6:
                this.f8006a = Choreographer.getInstance();
                this.f8007b = Looper.myLooper();
                return;
            case 11:
                this.f8006a = ByteBuffer.allocateDirect(500);
                return;
            case 29:
                this.f8006a = new fpa();
                this.f8007b = new fpa();
                return;
            default:
                synchronized (f8003d) {
                    try {
                        HandlerThread handlerThread = f8004e;
                        if (handlerThread == null || !handlerThread.isAlive()) {
                            HandlerThread handlerThread2 = new HandlerThread("KochavaPrimaryThread");
                            f8004e = handlerThread2;
                            handlerThread2.start();
                        }
                        if (f8005f == null) {
                            f8005f = Executors.newCachedThreadPool();
                        }
                        Looper looper = f8004e.getLooper();
                        if (looper == null) {
                            throw new RuntimeException("Failed to start KochavaPrimaryThread");
                        }
                        this.f8006a = new Handler(Looper.getMainLooper());
                        this.f8007b = new Handler(looper);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX INFO: renamed from: b */
    public static b64 m3348b(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b64(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // p000.InterfaceC2974er
    /* JADX INFO: renamed from: a */
    public void mo3349a(int i, float f) {
    }

    /* JADX INFO: renamed from: c */
    public void m3350c(String str) {
        Set set = (Set) this.f8007b;
        set.add(str);
        while (set.size() > 10) {
            set.remove(u91.m22588F0(set));
        }
    }

    @Override // p000.fm1
    public Object convert(Object obj) {
        m88 m88Var = (m88) obj;
        m88Var.getClass();
        cc4 cc4Var = (cc4) this.f8007b;
        KSerializer kSerializer = (KSerializer) this.f8006a;
        String strM16682n = m88Var.m16682n();
        strM16682n.getClass();
        return ((df4) cc4Var.f9881a).m10321a(strM16682n, kSerializer);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3351d() {
        synchronized (this) {
            if (((AtomicBoolean) this.f8007b).get()) {
                return false;
            }
            ((AtomicInteger) this.f8006a).incrementAndGet();
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m3352e(int i) {
        return ((t63) this.f8006a).f61911a.get(i);
    }

    /* JADX INFO: renamed from: f */
    public void m3353f() {
        String str = (String) this.f8006a;
        try {
            t33 t33Var = (t33) this.f8007b;
            t33Var.getClass();
            new File((File) t33Var.f61788c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: g */
    public Type mo3354g() {
        return (Type) this.f8006a;
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: h */
    public Object mo3355h(br6 br6Var) {
        Executor executor = (Executor) this.f8007b;
        return executor == null ? br6Var : new w52(executor, br6Var);
    }

    /* JADX INFO: renamed from: i */
    public y90[] m3356i(Handler handler, ew2 ew2Var, ew2 ew2Var2, ew2 ew2Var3, ew2 ew2Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f8006a;
        du5 du5Var = new du5(context);
        C3002fi c3002fi = (C3002fi) this.f8007b;
        du5Var.f36244c = c3002fi;
        du5Var.f36245d = 5000L;
        du5Var.f36246e = handler;
        du5Var.f36247f = ew2Var;
        du5Var.f36248g = 50;
        bna.m3987z(!du5Var.f36243b);
        Handler handler2 = du5Var.f36246e;
        short s = 0;
        bna.m3987z((handler2 == null && du5Var.f36247f == null) || !(handler2 == null || du5Var.f36247f == null));
        du5Var.f36243b = true;
        arrayList.add(new fu5(du5Var));
        tz1 tz1Var = new tz1(context);
        bna.m3987z(!tz1Var.f63122a);
        tz1Var.f63122a = true;
        if (((C3309ls) tz1Var.f63124c) == null) {
            tz1Var.f63124c = new C3309ls(new InterfaceC0828bz[0]);
        }
        b00 b00Var = (b00) tz1Var.f63126e;
        b64 b64Var = (b64) tz1Var.f63127f;
        if (b00Var == null) {
            if (b64Var == null) {
                tz1Var.f63127f = new b64(context, 22);
            }
            if (((j13) tz1Var.f63125d) == null) {
                tz1Var.f63125d = o52.f53858s;
            }
            a00 a00Var = new a00(context);
            Context context2 = (Context) a00Var.f5b;
            if (context2 == null) {
                a00Var.f8e = null;
            }
            b64 b64Var2 = (b64) tz1Var.f63127f;
            a00Var.f6c = b64Var2;
            a00Var.f7d = (j13) tz1Var.f63125d;
            if (b64Var2 == null) {
                a00Var.f6c = new b64(context2, 22);
            }
            tz1Var.f63126e = new b00(a00Var);
        } else {
            bna.m3987z(b64Var == null);
            bna.m3987z(((j13) tz1Var.f63125d) == null);
        }
        arrayList.add(new tt5(context, c3002fi, handler, ew2Var2, new s52(tz1Var)));
        arrayList.add(new lx9(ew2Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new ny5(ew2Var4, looper));
        }
        arrayList.add(new jm0());
        arrayList.add(new c04(new C3002fi(context, s)));
        return (y90[]) arrayList.toArray(new y90[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX INFO: renamed from: j */
    public ArrayList m3357j() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        qn3 qn3Var = (qn3) this.f8007b;
        Context context = (Context) this.f8006a;
        Class cls = (Class) qn3Var.f57974a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new yc1((String) it.next(), 0));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public String m3358k() {
        Set set = (Set) this.f8007b;
        List list = (List) this.f8006a;
        if ((list == null || list.isEmpty()) && set.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list2 = (List) this.f8006a;
        if (list2 != null) {
            list2.getClass();
            if (!list2.isEmpty()) {
                List list3 = (List) this.f8006a;
                list3.getClass();
                linkedHashMap.put("malformed_events", list3);
            }
        }
        if (!set.isEmpty()) {
            linkedHashMap.put("error_logs", u91.m22622n1(set));
        }
        String strValueOf = String.valueOf(vz1.m23632g0(linkedHashMap));
        List list4 = (List) this.f8006a;
        if (list4 != null) {
            list4.clear();
        }
        set.clear();
        return strValueOf;
    }

    /* JADX INFO: renamed from: l */
    public C3591sy m3359l(C0713b c0713b, C3476px c3476px) {
        boolean zBooleanValue;
        int i;
        c0713b.getClass();
        c3476px.getClass();
        int i2 = c0713b.f6382H;
        if (i2 == -1) {
            return C3591sy.f61573d;
        }
        Context context = (Context) this.f8006a;
        Boolean bool = (Boolean) this.f8007b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = AbstractC3352my.m17083B(context).getParameters("offloadVariableRateSupported");
                this.f8007b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f8007b = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.f8007b).booleanValue();
        }
        String str = c0713b.f6406o;
        str.getClass();
        int iM11392b = ez5.m11392b(str, c0713b.f6402k);
        if (iM11392b == 0 || (i = Build.VERSION.SDK_INT) < uma.m22817l(iM11392b)) {
            return C3591sy.f61573d;
        }
        int iM22818m = uma.m22818m(c0713b.f6381G);
        if (iM22818m == 0) {
            return C3591sy.f61573d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(iM22818m).setEncoding(iM11392b).build();
            if (i >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, c3476px.m19557a());
                if ((directPlaybackSupport & 1) == 0) {
                    return C3591sy.f61573d;
                }
                z = (directPlaybackSupport & 3) == 3;
                C3553ry c3553ry = new C3553ry();
                c3553ry.m20984b(true);
                c3553ry.m20985c(z);
                c3553ry.m20986d(zBooleanValue);
                return c3553ry.m20983a();
            }
            if (i < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, c3476px.m19557a())) {
                    return C3591sy.f61573d;
                }
                C3553ry c3553ry2 = new C3553ry();
                c3553ry2.m20984b(true);
                c3553ry2.m20986d(zBooleanValue);
                return c3553ry2.m20983a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, c3476px.m19557a());
            if (playbackOffloadSupport == 0) {
                return C3591sy.f61573d;
            }
            C3553ry c3553ry3 = new C3553ry();
            if (i > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            c3553ry3.m20984b(true);
            c3553ry3.m20985c(z);
            c3553ry3.m20986d(zBooleanValue);
            return c3553ry3.m20983a();
        } catch (IllegalArgumentException unused) {
            return C3591sy.f61573d;
        }
    }

    /* JADX INFO: renamed from: m */
    public ClipboardManager m3360m() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f8007b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = ((Context) this.f8006a).getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.f8007b = clipboardManager2;
        return clipboardManager2;
    }

    /* JADX INFO: renamed from: n */
    public hy2 m3361n(Object... objArr) {
        Constructor constructorM17637a;
        synchronized (((AtomicBoolean) this.f8007b)) {
            if (!((AtomicBoolean) this.f8007b).get()) {
                try {
                    constructorM17637a = ((C3386nv) this.f8006a).m17637a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f8007b).set(true);
                    constructorM17637a = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorM17637a = null;
        }
        if (constructorM17637a == null) {
            return null;
        }
        try {
            return (hy2) constructorM17637a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    /* JADX INFO: renamed from: o */
    public InputMethodManager m3362o() {
        return (InputMethodManager) ((cs4) this.f8007b).getValue();
    }

    /* JADX INFO: renamed from: p */
    public KeyListener m3363p(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? ((ck6) this.f8007b).m4808q(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: q */
    public void m3364q(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f8006a).getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((ck6) this.f8007b).m4795F(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m3365r() {
        ((pc0) this.f8006a).f55937a = false;
    }

    /* JADX INFO: renamed from: s */
    public void m3366s(qc0 qc0Var) {
        qc0Var.getClass();
        if (qc0Var.f57553a == 0) {
            ((pc0) this.f8006a).f55937a = true;
            ((Runnable) this.f8007b).run();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m3367t(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC3458pf interfaceC3458pf = "clx".equals(bundle2.getString("_o")) ? (C3309ls) this.f8006a : (qn3) this.f8007b;
            if (interfaceC3458pf == null) {
                return;
            }
            interfaceC3458pf.mo16508h(string, bundle2);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3368u() {
        try {
            ((FileLock) this.f8007b).release();
            ((FileChannel) this.f8006a).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m3369v() {
        synchronized (this) {
            ((AtomicInteger) this.f8006a).decrementAndGet();
            if (((AtomicInteger) this.f8006a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3370w(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((tp6) arrayList.get(i)).f62698a == 1) {
                this.f8007b = C0715b.m2524a((tp6) arrayList.get(i));
            }
        }
    }

    public /* synthetic */ b64(Object obj, Object obj2) {
        this.f8006a = obj;
        this.f8007b = obj2;
    }

    public b64(String str, pk9 pk9Var, p84 p84Var) {
        this.f8007b = str;
        this.f8006a = pk9Var;
    }

    public b64(t33 t33Var) {
        this.f8006a = t33Var;
        this.f8007b = f8002c;
    }

    public b64(EditText editText) {
        this.f8006a = editText;
        this.f8007b = new ck6(editText);
    }

    public b64(Context context, int i) {
        switch (i) {
            case 22:
                this.f8006a = context != null ? context.getApplicationContext() : null;
                break;
            case 25:
                this.f8006a = context;
                this.f8007b = new C3002fi(context, (short) 0);
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                this.f8006a = context;
                this.f8007b = null;
                break;
            default:
                this.f8006a = context;
                break;
        }
    }

    public b64(View view) {
        this.f8006a = view;
        this.f8007b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new C3539rk(this, 23));
    }

    public b64(C3386nv c3386nv) {
        this.f8006a = c3386nv;
        this.f8007b = new AtomicBoolean(false);
    }

    public b64(C3048gr c3048gr) {
        this.f8007b = c3048gr;
        this.f8006a = c3048gr;
    }
}
