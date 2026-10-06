package p021j$.nio.file;

import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: j$.nio.file.V */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0332V implements InterfaceC0334X {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Watchable f32832a;

    private /* synthetic */ C0332V(Watchable watchable) {
        this.f32832a = watchable;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0334X m12100a(Watchable watchable) {
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof C0333W) {
            return ((C0333W) watchable).f32833a;
        }
        return watchable instanceof Path ? C0403s.m12213a((Path) watchable) : new C0332V(watchable);
    }

    @Override // p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0328Q mo12028b(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr, InterfaceC0322K[] interfaceC0322KArr) {
        WatchEvent.Modifier[] modifierArr;
        WatchService watchServiceM12099b = C0330T.m12099b(interfaceC0331U);
        WatchEvent.Kind<?>[] kindArrM12208m = AbstractC0392h.m12208m(interfaceC0319HArr);
        if (interfaceC0322KArr == null) {
            modifierArr = null;
        } else {
            int length = interfaceC0322KArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                modifierArr2[i] = C0321J.m12082a(interfaceC0322KArr[i]);
            }
            modifierArr = modifierArr2;
        }
        return C0326O.m12088b(this.f32832a.register(watchServiceM12099b, kindArrM12208m, modifierArr));
    }

    @Override // p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0328Q mo12030d(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr) {
        return C0326O.m12088b(this.f32832a.register(C0330T.m12099b(interfaceC0331U), AbstractC0392h.m12208m(interfaceC0319HArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0332V) {
            obj = ((C0332V) obj).f32832a;
        }
        return this.f32832a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32832a.hashCode();
    }
}
