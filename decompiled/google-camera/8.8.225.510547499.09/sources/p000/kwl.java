package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.lens.lenslite.api.DownloadEvent;
import com.google.android.libraries.lens.lenslite.api.DownloadListener;
import com.google.android.libraries.lens.lenslite.api.DownloadParam;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester;
import com.google.android.libraries.lens.lenslite.api.LogPolicyType;
import com.google.android.libraries.lens.lenslite.api.LoggingListener;
import com.google.android.libraries.lens.lenslite.api.ModelInfo;
import com.google.android.libraries.lens.lenslite.api.ModelInfoListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.ClientContextProvider;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLLinkResultListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.EngineApiLoader;
import com.google.android.libraries.lens.smartsapi.SmartsResult$SmartsEngineType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwl {

    /* JADX INFO: renamed from: a */
    public static final Set f37514a = Collections.unmodifiableSet(new HashSet(Arrays.asList(EngineApiLoader.class.getName(), DLEngineApi.class.getName(), SmartsResult$SmartsEngineType.class.getName(), LinkEventListener.class.getName(), LinkChipResult.class.getName(), DLLinkResultListener.class.getName(), LinkChipResult.BitmapProvider.class.getName(), LinkHighResBitmapRequester.class.getName(), LinkHighResBitmapRequester.LinkHighResBitmapCallback.class.getName(), KeyguardDismisser.class.getName(), LogPolicyType.class.getName(), ClientContextProvider.class.getName(), DownloadParam.class.getName(), DownloadListener.class.getName(), DownloadEvent.class.getName(), ModelInfo.class.getName(), ModelInfoListener.class.getName(), ImageProxy.class.getName(), ImageProxy.Plane.class.getName(), LoggingListener.class.getName())));

    /* JADX INFO: renamed from: b */
    public static final Object f37515b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Map f37516c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Context f37517d;

    /* JADX INFO: renamed from: e */
    public final Set f37518e;

    /* JADX INFO: renamed from: f */
    public final String f37519f;

    /* JADX INFO: renamed from: g */
    public Context f37520g;

    public kwl(Context context, Set set, String str) {
        this.f37517d = context;
        this.f37518e = set;
        this.f37519f = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m14944c(Context context, String str) throws kwn {
        try {
            return str + "." + context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            throw new kwn(String.format("Remote package %s can't be found", str), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Context m14945a() {
        Context context = this.f37520g;
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: b */
    public final Class m14946b(String str) throws kwm {
        try {
            return Class.forName(str, true, (ClassLoader) f37516c.get(m14944c(m14945a(), this.f37519f)));
        } catch (ClassNotFoundException e) {
            throw new kwm(String.format("%s class is not found", str), e);
        }
    }
}
