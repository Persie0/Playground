package androidx.compose.p017ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import p081e0.C5310f1;
import p081e0.C5314h0;
import p081e0.C5334r0;
import p267n0.InterfaceC7680k;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: androidx.compose.ui.platform.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646n0 {

    /* JADX INFO: renamed from: a */
    public static final Class<? extends Object>[] f4329a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public static final boolean m2425a(Object obj) {
        if (obj instanceof InterfaceC7680k) {
            InterfaceC7680k interfaceC7680k = (InterfaceC7680k) obj;
            if (interfaceC7680k.mo11475a() != C5314h0.f33585a && interfaceC7680k.mo11475a() != C5310f1.f33583a) {
                if (interfaceC7680k.mo11475a() != C5334r0.f33610a) {
                    return false;
                }
            }
            T value = interfaceC7680k.getValue();
            if (value == 0) {
                return true;
            }
            return m2425a(value);
        }
        if ((obj instanceof InterfaceC9068a) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = f4329a;
        for (int i10 = 0; i10 < 7; i10++) {
            if (clsArr[i10].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
