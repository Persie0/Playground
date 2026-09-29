package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.C0249j;
import androidx.compose.material3.C0251k;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3288l7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49229a;

    public /* synthetic */ C3288l7(int i) {
        this.f49229a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        Class<?> returnType;
        int i = this.f49229a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                return Integer.valueOf(jq7.f46011b.m14247e(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                zf1 zf1Var = AbstractC0218a.f3361a;
                return C0249j.f3538a;
            case 3:
                zf1 zf1Var2 = AbstractC0218a.f3361a;
                return C0251k.f3547a;
            case 4:
                return new pd9(d32.m10035e(1308617531));
            case 5:
                vh9 vh9Var = nb0.f52558a;
                return null;
            case 6:
                vh9 vh9Var2 = ra1.f58959a;
                return Boolean.TRUE;
            case 7:
                return xfaVar;
            case 8:
                vh9 vh9Var3 = of1.f54263a;
                return null;
            case 9:
                throw new IllegalStateException("No default size");
            case 10:
                throw new IllegalStateException("No default context");
            case 11:
                vh9 vh9Var4 = yf1.f69762a;
                return null;
            case 12:
                throw new IllegalStateException("No default glance id");
            case 13:
                return vn2.f65630B;
            case 14:
                return Float.valueOf(1.0f);
            case 15:
                float f = AbstractC0102j.f2266a;
                return Boolean.TRUE;
            case 16:
                return Boolean.TRUE;
            case 17:
                throw new IllegalStateException("No ExtendedColorScheme provided");
            case 18:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 19:
                try {
                    String[] strArr = xg3.f68174b;
                    Method method = (Method) xg3.f68176d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 20:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 21:
                return new dr6();
            case 22:
                return null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                zf1 zf1Var3 = s34.f60229a;
                return z52.f70937a;
            case 24:
                vh9 vh9Var5 = x64.f67818a;
                return null;
            case 25:
                iv3 iv3Var = AbstractC0262s.f3627a;
                return Boolean.TRUE;
            case 26:
                return new xj2(48.0f);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
            case 28:
                return xfaVar;
            default:
                return jg4.f45518b;
        }
    }
}
