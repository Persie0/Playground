package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lj1 {

    /* JADX INFO: renamed from: a */
    public int f49731a;

    /* JADX INFO: renamed from: b */
    public int f49732b;

    /* JADX INFO: renamed from: c */
    public Object f49733c;

    /* JADX INFO: renamed from: d */
    public Object f49734d;

    /* JADX INFO: renamed from: e */
    public Object f49735e;

    /* JADX INFO: renamed from: c */
    public static String m16245c(q43 q43Var) {
        q43Var.m19644a();
        a53 a53Var = q43Var.f57254c;
        String str = a53Var.f264e;
        if (str != null) {
            return str;
        }
        q43Var.m19644a();
        String str2 = a53Var.f261b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: renamed from: a */
    public int m16246a(long j) {
        int i = this.f49731a + 1;
        long[] jArr = (long[]) this.f49733c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            AbstractC3550rv.m20828V(jArr, jArr2, 0, 0, jArr.length);
            AbstractC3550rv.m20829W(0, 0, 14, (int[]) this.f49734d, iArr);
            this.f49733c = jArr2;
            this.f49734d = iArr;
        }
        int i3 = this.f49731a;
        this.f49731a = i3 + 1;
        int length2 = ((int[]) this.f49735e).length;
        if (this.f49732b >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC3550rv.m20829W(0, 0, 14, (int[]) this.f49735e, iArr2);
            this.f49735e = iArr2;
        }
        int i7 = this.f49732b;
        int[] iArr3 = (int[]) this.f49735e;
        this.f49732b = iArr3[i7];
        long[] jArr3 = (long[]) this.f49733c;
        jArr3[i3] = j;
        ((int[]) this.f49734d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (fa4.m11652n(jArr3[i8], j) <= 0) {
                break;
            }
            m16252h(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m16247b() {
        try {
            if (((String) this.f49734d) == null) {
                m16251g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f49734d;
    }

    /* JADX INFO: renamed from: d */
    public PackageInfo m16248d(String str) {
        try {
            return ((Context) this.f49733c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m16249e() {
        int i;
        synchronized (this) {
            i = this.f49732b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f49733c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f49732b = 2;
                    } else {
                        this.f49732b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    /* JADX INFO: renamed from: f */
    public void m16250f(Context context, XmlResourceParser xmlResourceParser) {
        sj1 sj1Var = new sj1();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                sj1Var.m21414k(context, xmlResourceParser);
                ((SparseArray) this.f49735e).put(identifier, sj1Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m16251g() {
        PackageInfo packageInfoM16248d = m16248d(((Context) this.f49733c).getPackageName());
        if (packageInfoM16248d != null) {
            this.f49734d = Integer.toString(packageInfoM16248d.versionCode);
            this.f49735e = packageInfoM16248d.versionName;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m16252h(int i, int i2) {
        long[] jArr = (long[]) this.f49733c;
        int[] iArr = (int[]) this.f49734d;
        int[] iArr2 = (int[]) this.f49735e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
