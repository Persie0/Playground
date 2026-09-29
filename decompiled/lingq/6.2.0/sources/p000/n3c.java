package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n3c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f52301a = new C0282a(-439427800, false, new xd1(2));

    /* JADX INFO: renamed from: b */
    public static final C0282a f52302b = new C0282a(-66449272, false, new xd1(3));

    /* JADX INFO: renamed from: c */
    public static final C0282a f52303c = new C0282a(-2113950760, false, new wd1(15));

    /* JADX INFO: renamed from: d */
    public static final C0282a f52304d = new C0282a(-749289491, false, new wd1(16));

    /* JADX INFO: renamed from: a */
    public static final void m17203a(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(serialDescriptor.mo3698f((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(serialDescriptor.mo3694a(), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static final void m17204b(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.mo3698f(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(serialDescriptor.mo3694a(), arrayList);
    }
}
