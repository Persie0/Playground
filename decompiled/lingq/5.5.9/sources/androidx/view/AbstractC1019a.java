package androidx.view;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import androidx.p544savedstate.C1189a;
import dm.C5207g;
import p427v3.C9636c;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019a extends C1042k0.d implements C1042k0.b {

    /* JADX INFO: renamed from: a */
    public final C1189a f6603a;

    /* JADX INFO: renamed from: b */
    public final Lifecycle f6604b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6605c;

    public AbstractC1019a() {
    }

    public AbstractC1019a(NavBackStackEntry navBackStackEntry) {
        C5207g.m11111f(navBackStackEntry, "owner");
        this.f6603a = navBackStackEntry.f6738i.f42232b;
        this.f6604b = navBackStackEntry.f6737h;
        this.f6605c = null;
    }

    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: a */
    public final AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
        String str = (String) c9636c.f49329a.get(C1044l0.f6676a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        C1189a c1189a = this.f6603a;
        if (c1189a == null) {
            return mo3917d(str, cls, SavedStateHandleSupport.m3908a(c9636c));
        }
        C5207g.m11108c(c1189a);
        Lifecycle lifecycle = this.f6604b;
        C5207g.m11108c(lifecycle);
        SavedStateHandleController savedStateHandleControllerM3944b = C1039j.m3944b(c1189a, lifecycle, str, this.f6605c);
        AbstractC1036h0 abstractC1036h0Mo3917d = mo3917d(str, cls, savedStateHandleControllerM3944b.f6587b);
        abstractC1036h0Mo3917d.m3941k2(savedStateHandleControllerM3944b, "androidx.lifecycle.savedstate.vm.tag");
        return abstractC1036h0Mo3917d;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: b */
    public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        Lifecycle lifecycle = this.f6604b;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        C1189a c1189a = this.f6603a;
        C5207g.m11108c(c1189a);
        C5207g.m11108c(lifecycle);
        SavedStateHandleController savedStateHandleControllerM3944b = C1039j.m3944b(c1189a, lifecycle, canonicalName, this.f6605c);
        T t10 = (T) mo3917d(canonicalName, cls, savedStateHandleControllerM3944b.f6587b);
        t10.m3941k2(savedStateHandleControllerM3944b, "androidx.lifecycle.savedstate.vm.tag");
        return t10;
    }

    @Override // androidx.view.C1042k0.d
    /* JADX INFO: renamed from: c */
    public final void mo3916c(AbstractC1036h0 abstractC1036h0) {
        C1189a c1189a = this.f6603a;
        if (c1189a != null) {
            Lifecycle lifecycle = this.f6604b;
            C5207g.m11108c(lifecycle);
            C1039j.m3943a(abstractC1036h0, c1189a, lifecycle);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract <T extends AbstractC1036h0> T mo3917d(String str, Class<T> cls, C1024c0 c1024c0);
}
