package ml;

import androidx.fragment.app.Fragment;
import androidx.view.C1042k0;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import mk.C7574a1;
import p246ll.InterfaceC7387a;
import p385sf.C9000b;

/* JADX INFO: renamed from: ml.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7634a {

    /* JADX INFO: renamed from: ml.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        c mo15082a();
    }

    /* JADX INFO: renamed from: ml.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        c mo15116a();
    }

    /* JADX INFO: renamed from: ml.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final Set<String> f42038a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7387a f42039b;

        public c(ImmutableSet immutableSet, C7574a1 c7574a1) {
            this.f42038a = immutableSet;
            this.f42039b = c7574a1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C7636c m15194a(Fragment fragment, C1042k0.b bVar) {
        c cVarMo15116a = ((b) C9000b.m17245k(b.class, fragment)).mo15116a();
        cVarMo15116a.getClass();
        bVar.getClass();
        return new C7636c(cVarMo15116a.f42038a, bVar, cVarMo15116a.f42039b);
    }
}
