package kotlin.reflect.jvm.internal.impl.storage;

import cm.InterfaceC2041a;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7047a extends LockBasedStorageManager.C7042h<Object> {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f39844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7047a(LockBasedStorageManager lockBasedStorageManager, InterfaceC2041a interfaceC2041a, EmptyList emptyList) {
        super(lockBasedStorageManager, interfaceC2041a);
        this.f39844d = emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C7040f
    /* JADX INFO: renamed from: d */
    public final LockBasedStorageManager.C7046l<Object> mo14167d(boolean z10) {
        return new LockBasedStorageManager.C7046l<>(this.f39844d, false);
    }
}
