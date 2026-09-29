package ml;

import androidx.view.AbstractC1019a;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import androidx.view.C1042k0;
import java.io.Closeable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import mk.C7574a1;
import mk.C7577b1;
import p246ll.InterfaceC7387a;
import p371rl.InterfaceC8825a;
import p385sf.C9000b;
import p427v3.C9636c;

/* JADX INFO: renamed from: ml.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7636c implements C1042k0.b {

    /* JADX INFO: renamed from: a */
    public final Set<String> f42041a;

    /* JADX INFO: renamed from: b */
    public final C1042k0.b f42042b;

    /* JADX INFO: renamed from: c */
    public final a f42043c;

    /* JADX INFO: renamed from: ml.c$a */
    public class a extends AbstractC1019a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC7387a f42044d;

        public a(InterfaceC7387a interfaceC7387a) {
            this.f42044d = interfaceC7387a;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // androidx.view.AbstractC1019a
        /* JADX INFO: renamed from: d */
        public final <T extends AbstractC1036h0> T mo3917d(String str, Class<T> cls, C1024c0 c1024c0) {
            final C7637d c7637d = new C7637d();
            C7574a1 c7574a1 = (C7574a1) this.f42044d;
            c7574a1.getClass();
            c1024c0.getClass();
            c7574a1.getClass();
            c7574a1.getClass();
            InterfaceC8825a<AbstractC1036h0> interfaceC8825a = ((b) C9000b.m17245k(b.class, new C7577b1(c7574a1.f41756a, c7574a1.f41757b, c1024c0))).mo15086a().get(cls.getName());
            if (interfaceC8825a == null) {
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            T t10 = (T) interfaceC8825a.get();
            Closeable closeable = new Closeable() { // from class: ml.b
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c7637d.m15195a();
                }
            };
            LinkedHashSet linkedHashSet = t10.f6656b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    t10.f6656b.add(closeable);
                }
            }
            return t10;
        }
    }

    /* JADX INFO: renamed from: ml.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Map<String, InterfaceC8825a<AbstractC1036h0>> mo15086a();
    }

    public C7636c(Set<String> set, C1042k0.b bVar, InterfaceC7387a interfaceC7387a) {
        this.f42041a = set;
        this.f42042b = bVar;
        this.f42043c = new a(interfaceC7387a);
    }

    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: a */
    public final AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
        return this.f42041a.contains(cls.getName()) ? this.f42043c.mo3915a(cls, c9636c) : this.f42042b.mo3915a(cls, c9636c);
    }

    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: b */
    public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
        return this.f42041a.contains(cls.getName()) ? (T) this.f42043c.mo3730b(cls) : (T) this.f42042b.mo3730b(cls);
    }
}
