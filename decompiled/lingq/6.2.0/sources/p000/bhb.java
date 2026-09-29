package p000;

import com.google.android.gms.internal.measurement.zzacr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class bhb {
    protected transient int zza;

    /* JADX INFO: renamed from: c */
    public static void m3724c(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof nib) {
            List listZza = ((nib) iterable).zza();
            nib nibVar = (nib) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = nibVar.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = nibVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            C3386nv.m17635v(string);
                            return;
                        }
                        nibVar.remove(size3);
                    }
                } else if (obj instanceof zzacr) {
                    nibVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.m5430l(bArr, 0, bArr.length);
                    nibVar.zzb();
                } else {
                    nibVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof bjb) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof djb) {
                djb djbVar = (djb) list;
                int i = djbVar.f35736c + size4;
                int length = djbVar.f35735b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = g9a.m12427d(length, 3, 2, 1, 10);
                        }
                        djbVar.f35735b = Arrays.copyOf(djbVar.f35735b, length);
                    } else {
                        djbVar.f35735b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    uhb.m22738a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                uhb.m22738a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m3725a() {
        try {
            whb whbVar = (whb) this;
            int iM23968l = whbVar.m23968l();
            byte[] bArr = new byte[iM23968l];
            boolean z = nhb.f52743b;
            hhb hhbVar = new hhb(iM23968l, bArr);
            whbVar.m23961e(hhbVar);
            if (hhbVar.m13276x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (hhbVar.m13276x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            ij6.m13958p(AbstractC3393o1.m17739n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo3726b(fjb fjbVar);
}
