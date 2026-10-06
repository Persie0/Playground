package p021j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* JADX INFO: renamed from: j$.nio.file.W */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0333W implements Watchable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0334X f32833a;

    private /* synthetic */ C0333W(InterfaceC0334X interfaceC0334X) {
        this.f32833a = interfaceC0334X;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Watchable m12101a(InterfaceC0334X interfaceC0334X) {
        if (interfaceC0334X == null) {
            return null;
        }
        if (interfaceC0334X instanceof C0332V) {
            return ((C0332V) interfaceC0334X).f32832a;
        }
        return interfaceC0334X instanceof Path ? C0407t.m12219a((Path) interfaceC0334X) : new C0333W(interfaceC0334X);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0334X interfaceC0334X = this.f32833a;
        if (obj instanceof C0333W) {
            obj = ((C0333W) obj).f32833a;
        }
        return interfaceC0334X.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32833a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C0327P.m12094a(this.f32833a.mo12030d(C0329S.m12095b(watchService), AbstractC0392h.m12206k(kindArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        InterfaceC0322K[] interfaceC0322KArr;
        InterfaceC0334X interfaceC0334X = this.f32833a;
        InterfaceC0331U interfaceC0331UM12095b = C0329S.m12095b(watchService);
        InterfaceC0319H[] interfaceC0319HArrM12206k = AbstractC0392h.m12206k(kindArr);
        if (modifierArr == null) {
            interfaceC0322KArr = null;
        } else {
            int length = modifierArr.length;
            InterfaceC0322K[] interfaceC0322KArr2 = new InterfaceC0322K[length];
            for (int i = 0; i < length; i++) {
                interfaceC0322KArr2[i] = C0320I.m12080a(modifierArr[i]);
            }
            interfaceC0322KArr = interfaceC0322KArr2;
        }
        return C0327P.m12094a(interfaceC0334X.mo12028b(interfaceC0331UM12095b, interfaceC0319HArrM12206k, interfaceC0322KArr));
    }
}
