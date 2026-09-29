package dagger.hilt.android.internal.managers;

import androidx.activity.ComponentActivity;
import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import il.InterfaceC6355a;
import mk.C7578c;
import mk.C7581d;
import ml.C7637d;
import p206jl.InterfaceC6517a;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5116c implements InterfaceC8405b<InterfaceC6517a> {

    /* JADX INFO: renamed from: a */
    public final ComponentActivity f33091a;

    /* JADX INFO: renamed from: b */
    public final ComponentActivity f33092b;

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC6517a f33093c;

    /* JADX INFO: renamed from: d */
    public final Object f33094d = new Object();

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.c$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        C7578c mo10895d();
    }

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.c$b */
    public static final class b extends AbstractC1036h0 {

        /* JADX INFO: renamed from: d */
        public final InterfaceC6517a f33095d;

        public b(C7581d c7581d) {
            this.f33095d = c7581d;
        }

        @Override // androidx.view.AbstractC1036h0
        /* JADX INFO: renamed from: j2 */
        public final void mo3725j2() {
            ((C7637d) ((c) C9000b.m17245k(c.class, this.f33095d)).mo10896a()).m15195a();
        }
    }

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC6355a mo10896a();
    }

    public C5116c(ComponentActivity componentActivity) {
        this.f33091a = componentActivity;
        this.f33092b = componentActivity;
    }

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final InterfaceC6517a mo469d() {
        if (this.f33093c == null) {
            synchronized (this.f33094d) {
                if (this.f33093c == null) {
                    this.f33093c = ((b) new C1042k0(this.f33091a, new C5115b(this.f33092b)).m3947a(b.class)).f33095d;
                }
            }
        }
        return this.f33093c;
    }
}
