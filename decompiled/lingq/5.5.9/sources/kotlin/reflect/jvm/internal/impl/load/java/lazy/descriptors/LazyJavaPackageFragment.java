package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ae.C0062b;
import cm.InterfaceC2041a;
import cn.C2064a;
import co.InterfaceC2073e;
import dm.C5207g;
import dm.C5209i;
import gn.InterfaceC5840t;
import in.C6368l;
import in.InterfaceC6367k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import km.InterfaceC6727j;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7646c;
import p260m8.C7499b;
import p266n.C7669f;
import p372rm.InterfaceC8837f0;
import p420um.AbstractC9556a0;
import p421un.C9595b;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragment extends AbstractC9556a0 {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38746H = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: g */
    public final InterfaceC5840t f38747g;

    /* JADX INFO: renamed from: h */
    public final C7669f f38748h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2073e f38749i;

    /* JADX INFO: renamed from: j */
    public final JvmPackageScope f38750j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2073e<List<C7646c>> f38751k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9077e f38752l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(C7669f c7669f, InterfaceC5840t interfaceC5840t) {
        super(c7669f.m15267a(), interfaceC5840t.mo12283e());
        C5207g.m11111f(c7669f, "outerContext");
        C5207g.m11111f(interfaceC5840t, "jPackage");
        this.f38747g = interfaceC5840t;
        C7669f c7669fM13681a = ContextKt.m13681a(c7669f, this, null, 6);
        this.f38748h = c7669fM13681a;
        this.f38749i = c7669fM13681a.m15268b().mo6217b(new InterfaceC2041a<Map<String, ? extends InterfaceC6367k>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Map<String, ? extends InterfaceC6367k> mo807E() {
                LazyJavaPackageFragment lazyJavaPackageFragment = this.f38753b;
                EmptyList emptyListMo13004a = ((C2064a) lazyJavaPackageFragment.f38748h.f42146a).f10506l.mo13004a(lazyJavaPackageFragment.f49131e.m15214b());
                ArrayList arrayList = new ArrayList();
                emptyListMo13004a.getClass();
                return C6753d.m13464Q0(arrayList);
            }
        });
        this.f38750j = new JvmPackageScope(c7669fM13681a, interfaceC5840t, this);
        this.f38751k = c7669fM13681a.m15268b().mo6223h(EmptyList.f38032a, new InterfaceC2041a<List<? extends C7646c>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final List<? extends C7646c> mo807E() {
                return new ArrayList(C9325m.m17681z(this.f38756b.f38747g.mo12281G(), 10));
            }
        });
        this.f38752l = ((C2064a) c7669fM13681a.f42146a).f10516v.f38606c ? InterfaceC9077e.a.f47365a : C7499b.m14968u0(c7669fM13681a, interfaceC5840t);
        c7669fM13681a.m15268b().mo6217b(new InterfaceC2041a<HashMap<C9595b, C9595b>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2$a */
            public /* synthetic */ class C6848a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f38755a;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    f38755a = iArr;
                }
            }

            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final HashMap<C9595b, C9595b> mo807E() {
                HashMap<C9595b, C9595b> map = new HashMap<>();
                LazyJavaPackageFragment lazyJavaPackageFragment = this.f38754b;
                lazyJavaPackageFragment.getClass();
                for (Map.Entry entry : ((Map) C0062b.m366l1(lazyJavaPackageFragment.f38749i, LazyJavaPackageFragment.f38746H[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    InterfaceC6367k interfaceC6367k = (InterfaceC6367k) entry.getValue();
                    C9595b c9595bM18066d = C9595b.m18066d(str);
                    KotlinClassHeader kotlinClassHeaderMo12999a = interfaceC6367k.mo12999a();
                    int i10 = C6848a.f38755a[kotlinClassHeaderMo12999a.f38908a.ordinal()];
                    boolean z10 = true;
                    if (i10 == 1) {
                        if (kotlinClassHeaderMo12999a.f38908a != KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
                            z10 = false;
                        }
                        String str2 = z10 ? kotlinClassHeaderMo12999a.f38913f : null;
                        if (str2 != null) {
                            map.put(c9595bM18066d, C9595b.m18066d(str2));
                        }
                    } else if (i10 == 2) {
                        map.put(c9595bM18066d, c9595bM18066d);
                    }
                }
                return map;
            }
        });
    }

    @Override // p420um.AbstractC9556a0, p420um.AbstractC9582o, p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return new C6368l(this);
    }

    @Override // p372rm.InterfaceC8865w
    /* JADX INFO: renamed from: q */
    public final MemberScope mo13718q() {
        return this.f38750j;
    }

    @Override // p420um.AbstractC9556a0, p420um.AbstractC9581n
    public final String toString() {
        return "Lazy Java package fragment: " + this.f49131e + " of module " + ((C2064a) this.f38748h.f42146a).f10509o;
    }

    @Override // sm.C9074b, sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return this.f38752l;
    }
}
