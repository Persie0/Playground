package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0257p;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.FileStorage;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2951e4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36668a;

    public /* synthetic */ C2951e4(int i) {
        this.f36668a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        switch (this.f36668a) {
            case 0:
                e16 e16Var = AbstractC3025g4.f40155a;
                return xfa.f68157a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 2:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 3:
                return Boolean.TRUE;
            case 4:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.valueOf(!(((InterfaceC3190kn) obj) instanceof j37));
            case 7:
                zf1 zf1Var = AbstractC0218a.f3361a;
                return xfa.f68157a;
            case 8:
                return (AbstractC3387nw) obj;
            case 9:
                int i = db0.f35346a;
                return xfa.f68157a;
            case 10:
                ((C0358h) obj).m1614b();
                return xfa.f68157a;
            case 11:
                if (((Context) ((sf1) obj).mo1058A(AbstractC0394f.f4761b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return pi0.f56228b;
                }
                ni0.f52748a.getClass();
                return mi0.f51347c;
            case 12:
                AbstractC0426f.m1864h((tv8) obj, 0);
                return xfa.f68157a;
            case 13:
                pba pbaVar = (pba) obj;
                pbaVar.getClass();
                ((g47) pbaVar).m12357a1();
                return Boolean.FALSE;
            case 14:
                if4 if4Var = (if4) obj;
                if4Var.getClass();
                if4Var.f44042c = true;
                if4Var.f44043d = true;
                if4Var.f44040a = true;
                return xfa.f68157a;
            case 15:
                in1 in1Var = (in1) obj;
                if (in1Var instanceof nn1) {
                    return (nn1) in1Var;
                }
                return null;
            case 16:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                r43.m20289a().m20290b(corruptionException);
                return PreferencesFactory.createEmpty();
            case 17:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new o72(iIntValue, ((Float) obj3).floatValue(), new C3539rk(list, 13));
            case 18:
                AbstractC0426f.m1867k((tv8) obj);
                return xfa.f68157a;
            case 19:
                AbstractC0426f.m1867k((tv8) obj);
                return xfa.f68157a;
            case 20:
                float f = AbstractC0102j.f2266a;
                return xfa.f68157a;
            case 21:
                return Boolean.TRUE;
            case 22:
                return FileStorage._init_$lambda$0((File) obj);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                CorruptionException corruptionException2 = (CorruptionException) obj;
                corruptionException2.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", corruptionException2);
                return ho5.f42707k;
            case 24:
                float f2 = AbstractC0257p.f3568a;
                return xfa.f68157a;
            case 25:
                AbstractC0426f.m1864h((tv8) obj, 0);
                return xfa.f68157a;
            case 26:
                ((Throwable) obj).getClass();
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((qr1) obj).getClass();
                return new qe3.C3495a();
            case 28:
                synchronized (nc9.f52602c) {
                    List list2 = nc9.f52608i;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((vi3) list2.get(i2)).invoke(obj);
                    }
                }
                return xfa.f68157a;
            default:
                return xfa.f68157a;
        }
    }
}
