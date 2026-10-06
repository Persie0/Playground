package p000;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import com.google.babelfish.device.avenh.l2l.apps.common.VideoProcessorUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class inr {
    public inr() {
    }

    public inr(byte[] bArr) {
        new fxs(1);
        new kym(1);
    }

    public inr(byte[] bArr, byte[] bArr2) {
    }

    public inr(char[] cArr) {
    }

    /* JADX INFO: renamed from: d */
    public static void m11532d(float[] fArr, ing ingVar) {
        double dCos;
        lku.m15669w(fArr.length == 3);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = (f * f) + (f2 * f2) + (f3 * f3);
        if (f4 > 0.0f) {
            double dSqrt = Math.sqrt(f4);
            double d = 0.5d * dSqrt;
            double dSin = Math.sin(d) / dSqrt;
            double d2 = f;
            Double.isNaN(d2);
            ingVar.f31587a = d2 * dSin;
            double d3 = f2;
            Double.isNaN(d3);
            ingVar.f31588b = d3 * dSin;
            double d4 = f3;
            Double.isNaN(d4);
            ingVar.f31589c = d4 * dSin;
            dCos = Math.cos(d);
        } else {
            double d5 = f;
            Double.isNaN(d5);
            ingVar.f31587a = d5 * 0.5d;
            double d6 = f2;
            Double.isNaN(d6);
            ingVar.f31588b = d6 * 0.5d;
            double d7 = f3;
            Double.isNaN(d7);
            ingVar.f31589c = d7 * 0.5d;
            dCos = 1.0d;
        }
        ingVar.f31590d = dCos;
    }

    /* JADX INFO: renamed from: e */
    public static kba m11533e(Context context, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.getClass();
        lku.m15613H(context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        connectivityManager.registerDefaultNetworkCallback(networkCallback, new Handler(Looper.getMainLooper()));
        return new igy(connectivityManager, networkCallback, 2);
    }

    /* JADX INFO: renamed from: f */
    public static int m11534f(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(13)) {
            return 1;
        }
        return !connectivityManager.isActiveNetworkMetered() ? 3 : 2;
    }

    /* JADX INFO: renamed from: g */
    public static mrm m11535g(PackageManager packageManager, Intent intent, boolean z) {
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 851968);
        if (resolveInfoResolveActivity == null) {
            return mqu.f41450a;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (activityInfo.name == null || !activityInfo.name.endsWith("ResolverActivity")) {
            return mrm.m16829i(resolveInfoResolveActivity.activityInfo.applicationInfo);
        }
        if (z) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 851968);
            mrm mrmVarM16829i = mqu.f41450a;
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                    if (!mrmVarM16829i.mo16813g()) {
                        mrmVarM16829i = mrm.m16829i(resolveInfo.activityInfo.applicationInfo);
                    }
                }
            }
            return mrmVarM16829i;
        }
        return mqu.f41450a;
    }

    /* JADX INFO: renamed from: h */
    public static Range m11536h(List list, final boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Range range = (Range) it.next();
            if (((Integer) range.getUpper()).intValue() <= 30) {
                arrayList.add(range);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: ims
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                boolean z2 = z;
                Range range2 = (Range) obj;
                Range range3 = (Range) obj2;
                if (((Integer) range3.getUpper()).compareTo((Integer) range2.getUpper()) == 0) {
                    return z2 ? ((Integer) range2.getLower()).compareTo((Integer) range3.getLower()) : ((Integer) range3.getLower()).compareTo((Integer) range2.getLower());
                }
                return ((Integer) range3.getUpper()).compareTo((Integer) range2.getUpper());
            }
        });
        if (arrayList.isEmpty()) {
            throw new UnsupportedOperationException("No fps range with upper value at or below 30fps.");
        }
        return (Range) arrayList.get(0);
    }

    /* JADX INFO: renamed from: i */
    public static Object m11537i(Class cls, final mxk mxkVar) {
        if (mxkVar == null || mxkVar.isEmpty()) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: imr
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
                naz nazVarListIterator = mxkVar.listIterator();
                while (nazVarListIterator.hasNext()) {
                    method.invoke(nazVarListIterator.next(), objArr);
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ilw m11538j(Animator animator) {
        animator.getClass();
        return new ily(animator);
    }

    /* JADX INFO: renamed from: k */
    public static ByteBuffer m11539k(ByteBuffer byteBuffer, int i, int i2, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
        VideoProcessorUtils.nativeRotateFrame(byteBuffer, i, i2, (360 - i3) % 360, byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: renamed from: l */
    public static int m11540l(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: m */
    public static int m11541m(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                throw new RuntimeException("Unknown aspect ratio " + i);
        }
    }

    /* JADX INFO: renamed from: n */
    public static kan m11542n(int i) {
        gzk gzkVar = gzk.ON;
        jxp jxpVar = jxp.RES_UNKNOWN;
        switch (i - 1) {
            case 0:
                return kan.f35487b;
            case 1:
                return kan.f35486a;
            default:
                return kan.f35488c;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11544p(kay kayVar) {
        return kayVar == kay.CLOCKWISE_90 || kayVar == kay.CLOCKWISE_270;
    }

    /* JADX INFO: renamed from: q */
    public static ktz m11545q(inp inpVar) {
        return new ktz(inpVar);
    }

    /* JADX INFO: renamed from: r */
    public static ktz m11546r(int i) {
        return new ktz(new inq(i));
    }

    /* JADX INFO: renamed from: a */
    public void mo10341a(byte[] bArr) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo10342b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo10343c(int i) {
        throw null;
    }
}
