package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwp implements kwo {

    /* JADX INFO: renamed from: a */
    public final kvt f37521a;

    /* JADX INFO: renamed from: b */
    private final Context f37522b;

    /* JADX INFO: renamed from: c */
    private final lpe f37523c;

    public kwp(Context context, lpe lpeVar, kvt kvtVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37522b = context;
        this.f37523c = lpeVar;
        this.f37521a = kvtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01e8  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kvt] */
    @Override // p000.kwo
    /* JADX INFO: renamed from: a */
    public final DLEngineApi mo14947a(String str) throws kwm {
        char c;
        DLEngineApi engineApi;
        kws kwsVar;
        ClassLoader dexClassLoader;
        lpe lpeVar = this.f37523c;
        Context context = (Context) ((ohj) lpeVar.f38883b).f46012a;
        Set set = ((ohm) lpeVar.f38884c).get();
        set.getClass();
        str.getClass();
        kwl kwlVar = new kwl(context, set, str);
        Context context2 = kwlVar.f37517d;
        String str2 = kwlVar.f37519f;
        try {
            Context contextCreatePackageContext = context2.createPackageContext(str2, 3);
            String strM14944c = kwl.m14944c(contextCreatePackageContext, kwlVar.f37519f);
            synchronized (kwl.f37515b) {
                if (!kwl.f37516c.containsKey(strM14944c)) {
                    if (contextCreatePackageContext.getPackageName().equals(kwlVar.f37517d.getPackageName())) {
                        dexClassLoader = kwlVar.f37517d.getClassLoader();
                    } else {
                        String packageCodePath = contextCreatePackageContext.getPackageCodePath();
                        String absolutePath = kwlVar.f37517d.getCodeCacheDir().getAbsolutePath();
                        String str3 = contextCreatePackageContext.getApplicationInfo().nativeLibraryDir;
                        String packageCodePath2 = contextCreatePackageContext.getPackageCodePath();
                        String[] strArr = contextCreatePackageContext.getApplicationInfo().splitSourceDirs;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str3);
                        if (!TextUtils.isEmpty(packageCodePath2)) {
                            sb.append(File.pathSeparator);
                            sb.append(packageCodePath2);
                            sb.append("!/lib/");
                            sb.append(Build.SUPPORTED_ABIS[0]);
                        }
                        if (strArr != null) {
                            for (String str4 : strArr) {
                                sb.append(File.pathSeparator);
                                sb.append(str4);
                                sb.append("!/lib/");
                                sb.append(Build.SUPPORTED_ABIS[0]);
                            }
                        }
                        dexClassLoader = new DexClassLoader(packageCodePath, absolutePath, sb.toString(), new kwk(kwlVar.f37517d.getClassLoader(), kwl.f37514a));
                    }
                    kwl.f37516c.put(strM14944c, dexClassLoader);
                }
            }
            kwlVar.f37520g = new kwj(contextCreatePackageContext, kwlVar.f37517d);
            String str5 = kwlVar.f37519f;
            Iterator it = kwlVar.f37518e.iterator();
            do {
                c = 4;
                if (!it.hasNext()) {
                    try {
                        EngineApiLoader engineApiLoader = (EngineApiLoader) kwlVar.m14946b("com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Context contextM14945a = kwlVar.m14945a();
                        if (lme.m15721g(kwlVar) >= ApiVersion.VERSION_6.getVersionCode()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong(qQLA.ebrpjPHYxZAWN, 17L);
                            bundle.putString("host_package_name", str);
                            bundle.putString("shim_package_name", this.f37522b.getPackageName());
                            engineApi = engineApiLoader.getEngineApi(contextM14945a, new kij(this, 4), bundle);
                        } else {
                            engineApi = engineApiLoader.getEngineApi(contextM14945a, new kij(this, 5), 17L);
                        }
                        String.format(yTyWiTtGtnBhy.DRkM, str, this.f37522b.getPackageManager().getPackageInfo(str, 0).versionName, Long.valueOf(engineApi.getHostApiVersion()));
                        return engineApi;
                    } catch (IllegalAccessException e) {
                        e = e;
                        throw new kwm("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
                    } catch (InstantiationException e2) {
                        e = e2;
                        throw new kwm("Cannot create new instance of com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        throw new kwm("Cannot get constructor for com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        throw new kwm("Cannot get constructor for com.google.android.libraries.lens.lenslite.engine.EngineApiLoaderImpl class from loadedClass!", e);
                    } catch (Throwable th) {
                        throw new kwm(th.getMessage() != null ? th.getMessage() : "Failed to load engine", th);
                    }
                }
                lpe lpeVar2 = (lpe) it.next();
                Object obj = lpeVar2.f38884c;
                long jM15721g = lme.m15721g(kwlVar);
                Object obj2 = lpeVar2.f38884c;
                long jM15720f = lme.m15720f(kwlVar);
                lpeVar2.f38883b.mo8060a();
                if (jM15721g == 17) {
                    nxl nxlVarM18137O = kws.f37527c.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    ((kws) nxlVarM18137O.f44974b).f37529a = lme.m15719e(3);
                    kwsVar = (kws) nxlVarM18137O.mo18103l();
                } else if (jM15721g < 17 && jM15721g >= 4) {
                    nxl nxlVarM18137O2 = kws.f37527c.m18137O();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    ((kws) nxlVarM18137O2.f44974b).f37529a = lme.m15719e(3);
                    kwsVar = (kws) nxlVarM18137O2.mo18103l();
                } else if (jM15721g <= 17 || jM15720f > 17) {
                    nxl nxlVarM18137O3 = kws.f37527c.m18137O();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    ((kws) nxlVarM18137O3.f44974b).f37529a = lme.m15719e(4);
                    String str6 = String.format("Client and host versions are incompatible. Client version: %s. Client min version: %s. Host version: %s. Host min version: %s", 17L, 4L, Long.valueOf(jM15721g), Long.valueOf(jM15720f));
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    kws kwsVar2 = (kws) nxlVarM18137O3.f44974b;
                    str6.getClass();
                    kwsVar2.f37530b = str6;
                    kwsVar = (kws) nxlVarM18137O3.mo18103l();
                } else {
                    nxl nxlVarM18137O4 = kws.f37527c.m18137O();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    ((kws) nxlVarM18137O4.f44974b).f37529a = lme.m15719e(3);
                    kwsVar = (kws) nxlVarM18137O4.mo18103l();
                }
                switch (kwsVar.f37529a) {
                    case 0:
                        c = 2;
                        if (c != 0) {
                            break;
                        }
                        throw new kwm(String.format(hiCTUJiAxf.bonaIVsjUABvbLl, str5, kwsVar.f37530b));
                    case 1:
                        c = 3;
                        if (c != 0) {
                            break;
                        }
                        throw new kwm(String.format(hiCTUJiAxf.bonaIVsjUABvbLl, str5, kwsVar.f37530b));
                    case 2:
                        if (c != 0) {
                            break;
                        }
                        throw new kwm(String.format(hiCTUJiAxf.bonaIVsjUABvbLl, str5, kwsVar.f37530b));
                    default:
                        c = 0;
                        if (c != 0) {
                            break;
                        }
                        throw new kwm(String.format(hiCTUJiAxf.bonaIVsjUABvbLl, str5, kwsVar.f37530b));
                }
            } while (c == 3);
            throw new kwm(String.format(hiCTUJiAxf.bonaIVsjUABvbLl, str5, kwsVar.f37530b));
        } catch (PackageManager.NameNotFoundException e5) {
            throw new kwn(String.format(gBCSQzBeB.BkvbRkSQO, str2), e5);
        }
    }
}
