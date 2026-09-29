package androidx.view;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import dm.C5207g;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import p270n4.InterfaceC7706c;
import p427v3.C9636c;

/* JADX INFO: renamed from: androidx.lifecycle.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1030e0 extends C1042k0.d implements C1042k0.b {

    /* JADX INFO: renamed from: a */
    public final Application f6638a;

    /* JADX INFO: renamed from: b */
    public final C1042k0.a f6639b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6640c;

    /* JADX INFO: renamed from: d */
    public final Lifecycle f6641d;

    /* JADX INFO: renamed from: e */
    public final C1189a f6642e;

    public C1030e0() {
        this.f6639b = new C1042k0.a(null);
    }

    @SuppressLint({"LambdaLast"})
    public C1030e0(Application application, InterfaceC7706c interfaceC7706c, Bundle bundle) {
        C1042k0.a aVar;
        C5207g.m11111f(interfaceC7706c, "owner");
        this.f6642e = interfaceC7706c.mo797q();
        this.f6641d = interfaceC7706c.mo786G();
        this.f6640c = bundle;
        this.f6638a = application;
        if (application != null) {
            if (C1042k0.a.f6669c == null) {
                C1042k0.a.f6669c = new C1042k0.a(application);
            }
            aVar = C1042k0.a.f6669c;
            C5207g.m11108c(aVar);
        } else {
            aVar = new C1042k0.a(null);
        }
        this.f6639b = aVar;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: a */
    public final AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
        C1044l0 c1044l0 = C1044l0.f6676a;
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        String str = (String) linkedHashMap.get(c1044l0);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(SavedStateHandleSupport.f6589a) == null || linkedHashMap.get(SavedStateHandleSupport.f6590b) == null) {
            if (this.f6641d != null) {
                return m3934d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C1040j0.f6663a);
        boolean zIsAssignableFrom = C1021b.class.isAssignableFrom(cls);
        Constructor constructorM3936a = (!zIsAssignableFrom || application == null) ? C1032f0.m3936a(cls, C1032f0.f6648b) : C1032f0.m3936a(cls, C1032f0.f6647a);
        if (constructorM3936a == null) {
            return this.f6639b.mo3915a(cls, c9636c);
        }
        return (!zIsAssignableFrom || application == null) ? C1032f0.m3937b(cls, constructorM3936a, SavedStateHandleSupport.m3908a(c9636c)) : C1032f0.m3937b(cls, constructorM3936a, application, SavedStateHandleSupport.m3908a(c9636c));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: b */
    public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m3934d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.view.C1042k0.d
    /* JADX INFO: renamed from: c */
    public final void mo3916c(AbstractC1036h0 abstractC1036h0) {
        Lifecycle lifecycle = this.f6641d;
        if (lifecycle != null) {
            C1189a c1189a = this.f6642e;
            C5207g.m11108c(c1189a);
            C1039j.m3943a(abstractC1036h0, c1189a, lifecycle);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC1036h0 m3934d(Class cls, String str) {
        Lifecycle lifecycle = this.f6641d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1021b.class.isAssignableFrom(cls);
        Application application = this.f6638a;
        Constructor constructorM3936a = (!zIsAssignableFrom || application == null) ? C1032f0.m3936a(cls, C1032f0.f6648b) : C1032f0.m3936a(cls, C1032f0.f6647a);
        if (constructorM3936a == null) {
            if (application != null) {
                return this.f6639b.mo3730b(cls);
            }
            if (C1042k0.c.f6671a == null) {
                C1042k0.c.f6671a = new C1042k0.c();
            }
            C1042k0.c cVar = C1042k0.c.f6671a;
            C5207g.m11108c(cVar);
            return cVar.mo3730b(cls);
        }
        C1189a c1189a = this.f6642e;
        C5207g.m11108c(c1189a);
        SavedStateHandleController savedStateHandleControllerM3944b = C1039j.m3944b(c1189a, lifecycle, str, this.f6640c);
        C1024c0 c1024c0 = savedStateHandleControllerM3944b.f6587b;
        AbstractC1036h0 abstractC1036h0M3937b = (!zIsAssignableFrom || application == null) ? C1032f0.m3937b(cls, constructorM3936a, c1024c0) : C1032f0.m3937b(cls, constructorM3936a, application, c1024c0);
        abstractC1036h0M3937b.m3941k2(savedStateHandleControllerM3944b, "androidx.lifecycle.savedstate.vm.tag");
        return abstractC1036h0M3937b;
    }
}
