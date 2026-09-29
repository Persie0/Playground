package p392t5;

import ae.C0062b;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.InterfaceC2098e;
import com.bumptech.glide.load.engine.C2118d;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p110f6.InterfaceC5471b;
import p272n6.C7709a;
import p356r5.C8735e;
import p356r5.InterfaceC8732b;
import p356r5.InterfaceC8736f;
import p356r5.InterfaceC8737g;
import p356r5.InterfaceC8738h;
import p446w2.InterfaceC9806d;
import p474x5.InterfaceC10090o;

/* JADX INFO: renamed from: t5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9199e<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    public final Class<DataType> f47743a;

    /* JADX INFO: renamed from: b */
    public final List<? extends InterfaceC8736f<DataType, ResourceType>> f47744b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5471b<ResourceType, Transcode> f47745c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9806d<List<Throwable>> f47746d;

    /* JADX INFO: renamed from: e */
    public final String f47747e;

    public C9199e(Class cls, Class cls2, Class cls3, List list, InterfaceC5471b interfaceC5471b, C7709a.c cVar) {
        this.f47743a = cls;
        this.f47744b = list;
        this.f47745c = interfaceC5471b;
        this.f47746d = cVar;
        this.f47747e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m m17535a(int i10, int i11, C8735e c8735e, InterfaceC2098e interfaceC2098e, DecodeJob.C2110c c2110c) throws GlideException {
        InterfaceC9207m interfaceC9207mMo160a;
        InterfaceC8738h interfaceC8738h;
        EncodeStrategy encodeStrategyMo71g;
        boolean z10;
        InterfaceC8732b c9197c;
        InterfaceC9806d<List<Throwable>> interfaceC9806d = this.f47746d;
        List<Throwable> listMo11465b = interfaceC9806d.mo11465b();
        C0062b.m345f0(listMo11465b);
        List<Throwable> list = listMo11465b;
        try {
            InterfaceC9207m<ResourceType> interfaceC9207mM17536b = m17536b(interfaceC2098e, i10, i11, c8735e, list);
            interfaceC9806d.mo11464a(list);
            DecodeJob decodeJob = DecodeJob.this;
            decodeJob.getClass();
            Class<?> cls = interfaceC9207mM17536b.get().getClass();
            DataSource dataSource = DataSource.RESOURCE_DISK_CACHE;
            DataSource dataSource2 = c2110c.f10665a;
            C2118d<R> c2118d = decodeJob.f10649a;
            InterfaceC8737g interfaceC8737g = null;
            if (dataSource2 != dataSource) {
                InterfaceC8738h interfaceC8738hM6313f = c2118d.m6313f((Class<Z>) cls);
                interfaceC8738h = interfaceC8738hM6313f;
                interfaceC9207mMo160a = interfaceC8738hM6313f.mo160a(decodeJob.f10657h, interfaceC9207mM17536b, decodeJob.f10661l, decodeJob.f10630H);
            } else {
                interfaceC9207mMo160a = interfaceC9207mM17536b;
                interfaceC8738h = null;
            }
            if (!interfaceC9207mM17536b.equals(interfaceC9207mMo160a)) {
                interfaceC9207mM17536b.mo157b();
            }
            if (c2118d.f10699c.m6240a().f10541d.m12319a(interfaceC9207mMo160a.mo159d()) != null) {
                Registry registryM6240a = c2118d.f10699c.m6240a();
                registryM6240a.getClass();
                InterfaceC8737g interfaceC8737gM12319a = registryM6240a.f10541d.m12319a(interfaceC9207mMo160a.mo159d());
                if (interfaceC8737gM12319a == null) {
                    throw new Registry.NoResultEncoderAvailableException(interfaceC9207mMo160a.mo159d());
                }
                encodeStrategyMo71g = interfaceC8737gM12319a.mo71g(decodeJob.f10632J);
                interfaceC8737g = interfaceC8737gM12319a;
            } else {
                encodeStrategyMo71g = EncodeStrategy.NONE;
            }
            InterfaceC8732b interfaceC8732b = decodeJob.f10641S;
            ArrayList arrayListM6309b = c2118d.m6309b();
            int size = arrayListM6309b.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z10 = false;
                    break;
                }
                if (((InterfaceC10090o.a) arrayListM6309b.get(i12)).f51179a.equals(interfaceC8732b)) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            Object obj = interfaceC9207mMo160a;
            if (decodeJob.f10631I.mo17540d(!z10, dataSource2, encodeStrategyMo71g)) {
                if (interfaceC8737g == null) {
                    throw new Registry.NoResultEncoderAvailableException(interfaceC9207mMo160a.get().getClass());
                }
                int i13 = DecodeJob.C2108a.f10664c[encodeStrategyMo71g.ordinal()];
                if (i13 == 1) {
                    c9197c = new C9197c(decodeJob.f10641S, decodeJob.f10658i);
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategyMo71g);
                    }
                    c9197c = new C9208n(c2118d.f10699c.f10558a, decodeJob.f10641S, decodeJob.f10658i, decodeJob.f10661l, decodeJob.f10630H, interfaceC8738h, cls, decodeJob.f10632J);
                }
                C9206l<Z> c9206l = (C9206l) C9206l.f47764e.mo11465b();
                C0062b.m345f0(c9206l);
                c9206l.f47768d = false;
                c9206l.f47767c = true;
                c9206l.f47766b = interfaceC9207mMo160a;
                DecodeJob.C2111d<?> c2111d = decodeJob.f10655f;
                c2111d.f10667a = c9197c;
                c2111d.f10668b = interfaceC8737g;
                c2111d.f10669c = c9206l;
                obj = c9206l;
            }
            return this.f47745c.mo65b(obj, c8735e);
        } catch (Throwable th2) {
            interfaceC9806d.mo11464a(list);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC9207m<ResourceType> m17536b(InterfaceC2098e<DataType> interfaceC2098e, int i10, int i11, C8735e c8735e, List<Throwable> list) throws GlideException {
        List<? extends InterfaceC8736f<DataType, ResourceType>> list2 = this.f47744b;
        int size = list2.size();
        InterfaceC9207m<ResourceType> interfaceC9207mMo68a = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC8736f<DataType, ResourceType> interfaceC8736f = list2.get(i12);
            try {
                if (interfaceC8736f.mo69b(interfaceC2098e.mo4883a(), c8735e)) {
                    interfaceC9207mMo68a = interfaceC8736f.mo68a(interfaceC2098e.mo4883a(), i10, i11, c8735e);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC8736f, e10);
                }
                list.add(e10);
            }
            if (interfaceC9207mMo68a != null) {
                break;
            }
        }
        if (interfaceC9207mMo68a != null) {
            return interfaceC9207mMo68a;
        }
        throw new GlideException(new ArrayList(list), this.f47747e);
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f47743a + ", decoders=" + this.f47744b + ", transcoder=" + this.f47745c + '}';
    }
}
