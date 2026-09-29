package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f58499a = new C0282a(-1526220445, false, new wd1(6));

    /* JADX INFO: renamed from: a */
    public static Object[] m20244a(int i, int i2, Object[] objArr, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m20245b(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }
}
