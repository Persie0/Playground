package om;

import fo.C5602h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p385sf.C9000b;
import p420um.C9573j;
import p420um.C9576k0;
import p420um.C9583p;
import p420um.C9593z;
import p543do.C5229f;

/* JADX INFO: renamed from: om.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C8090g {

    /* JADX INFO: renamed from: a */
    public static final C9593z f43908a;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        C5602h c5602h = C5602h.f34418a;
        C9583p c9583p = new C9583p(C5602h.f34419b, C6797e.f38338d);
        ClassKind classKind = ClassKind.INTERFACE;
        C7648e c7648eM15218f = C6797e.f38339e.m15218f();
        LockBasedStorageManager.C7035a c7035a = LockBasedStorageManager.f39828e;
        C9593z c9593z = new C9593z(c9583p, classKind, c7648eM15218f, c7035a);
        Modality modality = Modality.ABSTRACT;
        if (modality == null) {
            C9593z.m18057J0(6);
            throw null;
        }
        c9593z.f49258j = modality;
        C8850m.h hVar = C8850m.f46738e;
        if (hVar == null) {
            C9593z.m18057J0(9);
            throw null;
        }
        c9593z.f49259k = hVar;
        List listM17251q = C9000b.m17251q(C9576k0.m18034Z0(c9593z, Variance.IN_VARIANCE, C7648e.m15232l("T"), 0, c7035a));
        if (c9593z.f49253H != null) {
            throw new IllegalStateException("Type parameters are already set for " + c9593z.mo11874a());
        }
        ArrayList arrayList = new ArrayList(listM17251q);
        c9593z.f49253H = arrayList;
        c9593z.f49260l = new C5229f(c9593z, arrayList, c9593z.f49254I, c9593z.f49255J);
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            C9593z.m18057J0(13);
            throw null;
        }
        Iterator it = setEmptySet.iterator();
        while (it.hasNext()) {
            ((C9573j) ((InterfaceC8828b) it.next())).m13639d1(c9593z.mo5316v());
        }
        f43908a = c9593z;
    }
}
