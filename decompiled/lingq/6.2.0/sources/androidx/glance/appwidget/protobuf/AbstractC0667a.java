package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.C3386nv;
import p000.dk7;
import p000.kw4;
import p000.q94;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0667a {
    protected int memoizedHashCode;

    /* JADX INFO: renamed from: a */
    public static void m2277a(Iterable iterable, List list) {
        Charset charset = q94.f57449a;
        if (!(iterable instanceof kw4)) {
            if (iterable instanceof dk7) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    C3386nv.m17635v(str);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List underlyingElements = ((kw4) iterable).getUnderlyingElements();
        kw4 kw4Var = (kw4) list;
        int size3 = list.size();
        for (Object obj2 : underlyingElements) {
            if (obj2 == null) {
                String str2 = "Element at index " + (kw4Var.size() - size3) + " is null.";
                for (int size4 = kw4Var.size() - 1; size4 >= size3; size4--) {
                    kw4Var.remove(size4);
                }
                C3386nv.m17635v(str2);
                return;
            }
            if (obj2 instanceof ByteString) {
                kw4Var.m15708A();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                ByteString.m2261g(bArr, 0, bArr.length);
                kw4Var.m15708A();
            } else {
                kw4Var.add((String) obj2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2278b(ym8 ym8Var);
}
