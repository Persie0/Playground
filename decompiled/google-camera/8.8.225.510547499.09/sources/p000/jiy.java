package p000;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jiy {

    /* JADX INFO: renamed from: a */
    private static Context f34150a;

    /* JADX INFO: renamed from: b */
    private static Boolean f34151b;

    public jiy() {
    }

    public jiy(Activity activity) {
        activity.getWindow().getDecorView().getRootView();
    }

    /* JADX INFO: renamed from: A */
    public static void m13239A(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m13273ah(parcel, parcelable, 0);
            }
        }
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: B */
    public static byte m13240B(Parcel parcel, int i) {
        m13255Q(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: renamed from: C */
    public static int m13241C(int i) {
        return (char) i;
    }

    /* JADX INFO: renamed from: D */
    public static int m13242D(Parcel parcel) {
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: E */
    public static int m13243E(Parcel parcel, int i) {
        m13255Q(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: F */
    public static int m13244F(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: G */
    public static int m13245G(Parcel parcel) {
        int i = parcel.readInt();
        int iM13244F = m13244F(parcel, i);
        int iM13241C = m13241C(i);
        int iDataPosition = parcel.dataPosition();
        if (iM13241C != 20293) {
            throw new jik("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM13244F + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new jik(VzWFSVj.CSoi + iDataPosition + " end=" + i2, parcel);
    }

    /* JADX INFO: renamed from: H */
    public static long m13246H(Parcel parcel, int i) {
        m13255Q(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: I */
    public static Bundle m13247I(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return bundle;
    }

    /* JADX INFO: renamed from: J */
    public static IBinder m13248J(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return strongBinder;
    }

    /* JADX INFO: renamed from: K */
    public static Parcelable m13249K(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM13244F);
        return parcelable;
    }

    /* JADX INFO: renamed from: L */
    public static String m13250L(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return string;
    }

    /* JADX INFO: renamed from: M */
    public static ArrayList m13251M(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iM13244F);
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public static ArrayList m13252N(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: O */
    public static ArrayList m13253O(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM13244F);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: P */
    public static void m13254P(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new jik("Overread allowed size end=" + i, parcel);
    }

    /* JADX INFO: renamed from: Q */
    public static void m13255Q(Parcel parcel, int i, int i2) {
        int iM13244F = m13244F(parcel, i);
        if (iM13244F == i2) {
            return;
        }
        throw new jik("Expected size " + i2 + " got " + iM13244F + " (0x" + Integer.toHexString(iM13244F) + ")", parcel);
    }

    /* JADX INFO: renamed from: R */
    public static void m13256R(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m13244F(parcel, i));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m13257S(Parcel parcel, int i) {
        m13255Q(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: T */
    public static byte[] m13258T(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: U */
    public static int[] m13259U(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: V */
    public static Object[] m13260V(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM13244F);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: W */
    public static String[] m13261W(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM13244F);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: X */
    public static byte[][] m13262X(Parcel parcel, int i) {
        int iM13244F = m13244F(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM13244F == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM13244F);
        return bArr;
    }

    /* JADX INFO: renamed from: Y */
    public static void m13263Y(Parcel parcel, int i) {
        if (i == 4) {
            return;
        }
        throw new jik("Expected size 4 got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    /* JADX INFO: renamed from: Z */
    public static hyd m13264Z() {
        return new hyd(hye.CLOSED, mqu.f41450a);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m13265a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f34150a;
        if (context2 != null && (bool = f34151b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f34151b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f34151b = boolValueOf;
        f34150a = applicationContext;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: aa */
    public static hyd m13266aa() {
        return new hyd(hye.FLAT, mqu.f41450a);
    }

    /* JADX INFO: renamed from: ab */
    public static hyd m13267ab() {
        return new hyd(hye.UNKNOWN, mqu.f41450a);
    }

    /* JADX INFO: renamed from: ac */
    public static boolean m13268ac(hyd hydVar) {
        return hydVar.f29901a.equals(hye.CLOSED);
    }

    /* JADX INFO: renamed from: ad */
    public static void m13269ad(C1190zy c1190zy, View view, int i) {
        c1190zy.m19823h(view.getId(), 3, 0, 3, i);
        c1190zy.m19823h(view.getId(), 6, 0, 6, 0);
        c1190zy.m19823h(view.getId(), 7, 0, 7, 0);
    }

    /* JADX INFO: renamed from: ae */
    public static void m13270ae(Context context, View view, ilk ilkVar) {
        Size sizeM13274ai = m13274ai(context, view, ilkVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (ilk.m11427e(ilkVar)) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.height = sizeM13274ai.getHeight();
            layoutParams.width = sizeM13274ai.getWidth();
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: af */
    public static void m13271af(Context context, View view, ilk ilkVar) {
        int width;
        Size sizeM13274ai = m13274ai(context, view, ilkVar);
        ilk ilkVar2 = ilk.PORTRAIT;
        int height = 0;
        switch (ilkVar.ordinal()) {
            case 1:
                width = sizeM13274ai.getWidth();
                break;
            case 2:
                height = sizeM13274ai.getHeight();
                width = 0;
                break;
            case 3:
                height = sizeM13274ai.getWidth();
                width = sizeM13274ai.getHeight();
                break;
            default:
                width = 0;
                break;
        }
        int i = ilkVar.f31449e;
        view.setTranslationX(height);
        view.setTranslationY(width);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setRotation(ilkVar.f31449e);
    }

    /* JADX INFO: renamed from: ah */
    private static void m13273ah(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: ai */
    private static Size m13274ai(Context context, View view, ilk ilkVar) {
        Size size = ((context.getResources().getDisplayMetrics().heightPixels <= context.getResources().getDisplayMetrics().widthPixels || view.getMeasuredHeight() <= view.getMeasuredWidth()) && (context.getResources().getDisplayMetrics().heightPixels >= context.getResources().getDisplayMetrics().widthPixels || view.getMeasuredHeight() >= view.getMeasuredWidth())) ? new Size(view.getMeasuredHeight(), view.getMeasuredWidth()) : new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
        return (ilkVar.equals(ilk.PORTRAIT) || ilkVar.equals(ilk.REVERSE_PORTRAIT)) ? new Size(size.getWidth(), size.getHeight()) : new Size(size.getHeight(), size.getWidth());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13275b(Context context, int i) {
        if (!m13276c(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            jdn jdnVarM12933a = jdn.m12933a(context);
            if (packageInfo == null) {
                return false;
            }
            if (jdn.m12935c(packageInfo, false)) {
                return true;
            }
            if (!jdn.m12935c(packageInfo, true)) {
                return false;
            }
            if (jdm.m12930b(jdnVarM12933a.f33807b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13276c(Context context, int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) jiz.m13300b(context).f36008a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13277d() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: e */
    public static int m13278e(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    /* JADX INFO: renamed from: f */
    public static void m13279f(Context context) {
        try {
            jib.m13205j(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m13280g(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static int m13281h(Parcel parcel) {
        return m13282i(parcel, 20293);
    }

    /* JADX INFO: renamed from: i */
    public static int m13282i(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: j */
    public static void m13283j(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: k */
    public static void m13284k(Parcel parcel, int i, boolean z) {
        m13286m(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m13285l(Parcel parcel, int i, byte b) {
        m13286m(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* JADX INFO: renamed from: m */
    public static void m13286m(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX INFO: renamed from: n */
    public static void m13287n(Parcel parcel, int i, int i2) {
        m13286m(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* JADX INFO: renamed from: o */
    public static void m13288o(Parcel parcel, int i, long j) {
        m13286m(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* JADX INFO: renamed from: p */
    public static void m13289p(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeBundle(bundle);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: q */
    public static void m13290q(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeByteArray(bArr);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: r */
    public static void m13291r(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: s */
    public static void m13292s(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: t */
    public static void m13293t(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeIntArray(iArr);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: u */
    public static void m13294u(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: v */
    public static void m13295v(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: w */
    public static void m13296w(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeString(str);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: x */
    public static void m13297x(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeStringArray(strArr);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: y */
    public static void m13298y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeStringList(list);
        m13283j(parcel, iM13282i);
    }

    /* JADX INFO: renamed from: z */
    public static void m13299z(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM13282i = m13282i(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m13273ah(parcel, parcelable, i2);
            }
        }
        m13283j(parcel, iM13282i);
    }
}
