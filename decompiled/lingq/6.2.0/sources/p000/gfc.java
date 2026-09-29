package p000;

import com.google.android.gms.internal.vision.zzht;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gfc {
    protected int zza;

    /* JADX INFO: renamed from: a */
    public static void m12569a(Iterable iterable, List list) {
        Charset charset = noc.f53082a;
        iterable.getClass();
        if (iterable instanceof yqc) {
            List listMo5750e = ((yqc) iterable).mo5750e();
            yqc yqcVar = (yqc) list;
            int size = list.size();
            for (Object obj : listMo5750e) {
                if (obj == null) {
                    int size2 = yqcVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    for (int size3 = yqcVar.size() - 1; size3 >= size; size3--) {
                        yqcVar.remove(size3);
                    }
                    C3386nv.m17635v(string);
                    return;
                }
                if (obj instanceof zzht) {
                    yqcVar.mo5747R((zzht) obj);
                } else {
                    yqcVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof hvc) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string2 = sb2.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                C3386nv.m17635v(string2);
                return;
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo5744b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo5745c();
}
