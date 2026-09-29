package p443w;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p017ui.InterfaceC0500b;
import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9775f {

    /* JADX INFO: renamed from: w.f$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49860a;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            try {
                iArr[IntrinsicSize.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntrinsicSize.Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49860a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0500b m18272a(IntrinsicSize intrinsicSize) {
        C5207g.m11111f(intrinsicSize, "intrinsicSize");
        int i10 = a.f49860a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return C9779j.f49865a;
        }
        if (i10 == 2) {
            return C9777h.f49863a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0500b m18273b(InterfaceC0500b interfaceC0500b, IntrinsicSize intrinsicSize) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(intrinsicSize, "intrinsicSize");
        int i10 = a.f49860a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return interfaceC0500b.mo1929K(C9780k.f49866a);
        }
        if (i10 == 2) {
            return interfaceC0500b.mo1929K(C9778i.f49864a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
