package kotlin.reflect.jvm.internal.impl.storage;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7048b extends LockBasedStorageManager.AbstractC7043i<Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2052l f39845e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2052l f39846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7048b(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        super(lockBasedStorageManager, interfaceC2041a);
        this.f39845e = interfaceC2052l;
        this.f39846f = interfaceC2052l2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14175a(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f
    /* JADX INFO: renamed from: d */
    public final LockBasedStorageManager.C7046l<Object> mo14167d(boolean z10) {
        InterfaceC2052l interfaceC2052l = this.f39845e;
        if (interfaceC2052l != null) {
            return new LockBasedStorageManager.C7046l<>(interfaceC2052l.mo528n(Boolean.valueOf(z10)), false);
        }
        LockBasedStorageManager.C7046l<Object> c7046lMo14167d = super.mo14167d(z10);
        if (c7046lMo14167d != null) {
            return c7046lMo14167d;
        }
        m14175a(0);
        throw null;
    }
}
