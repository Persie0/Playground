package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.C7058b;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p348qn.C8651a;
import p348qn.C8653c;
import p348qn.C8654d;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.C5238j0;
import p543do.C5250p0;
import p543do.C5255s;
import p543do.InterfaceC5246n0;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeConstructorKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5246n0 m14098a(final InterfaceC5246n0 interfaceC5246n0, InterfaceC8847k0 interfaceC8847k0) {
        if (interfaceC8847k0 != null && interfaceC5246n0.mo11237d() != Variance.INVARIANT) {
            if (interfaceC8847k0.mo17088n() != interfaceC5246n0.mo11237d()) {
                C8653c c8653c = new C8653c(interfaceC5246n0);
                C5238j0.f33329b.getClass();
                return new C5250p0(new C8651a(interfaceC5246n0, c8653c, false, C5238j0.f33330c));
            }
            if (!interfaceC5246n0.mo11239f()) {
                return new C5250p0(interfaceC5246n0.mo11236c());
            }
            LockBasedStorageManager.C7035a c7035a = LockBasedStorageManager.f39828e;
            C5207g.m11110e(c7035a, "NO_LOCKS");
            return new C5250p0(new C7058b(c7035a, new InterfaceC2041a<AbstractC5257t>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final AbstractC5257t mo807E() {
                    AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
                    C5207g.m11110e(abstractC5257tMo11236c, "this@createCapturedIfNeeded.type");
                    return abstractC5257tMo11236c;
                }
            }));
        }
        return interfaceC5246n0;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC5252q0 m14099b(AbstractC5252q0 abstractC5252q0) {
        if (!(abstractC5252q0 instanceof C5255s)) {
            return new C8654d(abstractC5252q0, true);
        }
        C5255s c5255s = (C5255s) abstractC5252q0;
        InterfaceC5246n0[] interfaceC5246n0Arr = c5255s.f33349c;
        C5207g.m11111f(interfaceC5246n0Arr, "<this>");
        InterfaceC8847k0[] interfaceC8847k0Arr = c5255s.f33348b;
        C5207g.m11111f(interfaceC8847k0Arr, "other");
        int iMin = Math.min(interfaceC5246n0Arr.length, interfaceC8847k0Arr.length);
        ArrayList<Pair> arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(interfaceC5246n0Arr[i10], interfaceC8847k0Arr[i10]));
        }
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(m14098a((InterfaceC5246n0) pair.f38012a, (InterfaceC8847k0) pair.f38013b));
        }
        Object[] array = arrayList2.toArray(new InterfaceC5246n0[0]);
        C5207g.m11109d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C5255s(interfaceC8847k0Arr, (InterfaceC5246n0[]) array, true);
    }
}
