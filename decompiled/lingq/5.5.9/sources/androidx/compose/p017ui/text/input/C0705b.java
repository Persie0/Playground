package androidx.compose.p017ui.text.input;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import dm.C5207g;
import p267n0.C7682m;
import p338qd.C8573r0;
import p352r1.C8700a;
import p352r1.InterfaceC8711l;
import p352r1.InterfaceC8712m;
import p352r1.InterfaceC8713n;
import p352r1.InterfaceC8714o;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0705b implements InterfaceC8714o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2056p<InterfaceC8713n<?>, InterfaceC8711l, InterfaceC8712m> f4656a;

    /* JADX INFO: renamed from: b */
    public final C7682m<InterfaceC8713n<?>, c<?>> f4657b = new C7682m<>();

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.b$a */
    public static final class a<T extends InterfaceC8712m> {

        /* JADX INFO: renamed from: a */
        public final T f4658a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2041a<Boolean> f4659b;

        public a(T t10, InterfaceC2041a<Boolean> interfaceC2041a) {
            C5207g.m11111f(t10, "adapter");
            this.f4658a = t10;
            this.f4659b = interfaceC2041a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.b$b */
    public final class b implements InterfaceC8711l {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8713n<?> f4660a = C8700a.f46284a;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.b$c */
    public final class c<T extends InterfaceC8712m> {

        /* JADX INFO: renamed from: a */
        public final T f4661a;

        /* JADX INFO: renamed from: b */
        public final ParcelableSnapshotMutableState f4662b = C8573r0.m16684L0(0);

        public c(T t10) {
            this.f4661a = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final int m2603a() {
            return ((Number) this.f4662b.getValue()).intValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0705b(InterfaceC2056p<? super InterfaceC8713n<?>, ? super InterfaceC8711l, ? extends InterfaceC8712m> interfaceC2056p) {
        this.f4656a = interfaceC2056p;
    }

    /* JADX INFO: renamed from: a */
    public final a m2602a() {
        C8700a c8700a = C8700a.f46284a;
        C7682m<InterfaceC8713n<?>, c<?>> c7682m = this.f4657b;
        final c<?> cVar = c7682m.get(c8700a);
        if (cVar == null) {
            InterfaceC8712m interfaceC8712mMo1337m0 = this.f4656a.mo1337m0(c8700a, new b());
            C5207g.m11109d(interfaceC8712mMo1337m0, "null cannot be cast to non-null type T of androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl.instantiateAdapter");
            c<?> cVar2 = new c<>(interfaceC8712mMo1337m0);
            c7682m.put(c8700a, cVar2);
            cVar = cVar2;
        }
        cVar.f4662b.setValue(Integer.valueOf(cVar.m2603a() + 1));
        return new a(cVar.f4661a, new InterfaceC2041a<Boolean>() { // from class: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Boolean mo807E() {
                C0705b.c<Object> cVar3 = cVar;
                cVar3.f4662b.setValue(Integer.valueOf(cVar3.m2603a() - 1));
                boolean z10 = true;
                if (cVar3.m2603a() >= 0) {
                    if (cVar3.m2603a() == 0) {
                        C0705b.this.getClass();
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + cVar3.m2603a() + ')').toString());
            }
        });
    }
}
