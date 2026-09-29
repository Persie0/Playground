package p392t5;

import ae.C0062b;
import com.bumptech.glide.load.data.InterfaceC2098e;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p272n6.C7709a;
import p356r5.C8735e;
import p446w2.InterfaceC9806d;

/* JADX INFO: renamed from: t5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9205k<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9806d<List<Throwable>> f47761a;

    /* JADX INFO: renamed from: b */
    public final List<? extends C9199e<Data, ResourceType, Transcode>> f47762b;

    /* JADX INFO: renamed from: c */
    public final String f47763c;

    public C9205k(Class cls, Class cls2, Class cls3, List list, C7709a.c cVar) {
        this.f47761a = cVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f47762b = list;
        this.f47763c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m m17545a(int i10, int i11, C8735e c8735e, InterfaceC2098e interfaceC2098e, DecodeJob.C2110c c2110c) throws GlideException {
        InterfaceC9806d<List<Throwable>> interfaceC9806d = this.f47761a;
        List<Throwable> listMo11465b = interfaceC9806d.mo11465b();
        C0062b.m345f0(listMo11465b);
        List<Throwable> list = listMo11465b;
        try {
            List<? extends C9199e<Data, ResourceType, Transcode>> list2 = this.f47762b;
            int size = list2.size();
            InterfaceC9207m interfaceC9207mM17535a = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    interfaceC9207mM17535a = list2.get(i12).m17535a(i10, i11, c8735e, interfaceC2098e, c2110c);
                } catch (GlideException e10) {
                    list.add(e10);
                }
                if (interfaceC9207mM17535a != null) {
                    break;
                }
            }
            if (interfaceC9207mM17535a == null) {
                throw new GlideException(new ArrayList(list), this.f47763c);
            }
            interfaceC9806d.mo11464a(list);
            return interfaceC9207mM17535a;
        } catch (Throwable th2) {
            interfaceC9806d.mo11464a(list);
            throw th2;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f47762b.toArray()) + '}';
    }
}
