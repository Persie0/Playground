package kotlin;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p260m8.C7499b;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m13365d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lsl/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "b", "Ljava/lang/Object;", "_value", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class SafePublicationLazyImpl<T> implements InterfaceC9070c<T>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f38015c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC2041a<? extends T> f38016a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile Object _value;

    public SafePublicationLazyImpl(InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "initializer");
        this.f38016a = interfaceC2041a;
        this._value = C7499b.f41425O;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        return this._value != C7499b.f41425O;
    }

    @Override // sl.InterfaceC9070c
    public final T getValue() {
        boolean z10;
        T t10 = (T) this._value;
        C7499b c7499b = C7499b.f41425O;
        if (t10 != c7499b) {
            return t10;
        }
        InterfaceC2041a<? extends T> interfaceC2041a = this.f38016a;
        if (interfaceC2041a != null) {
            T tMo807E = interfaceC2041a.mo807E();
            AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> atomicReferenceFieldUpdater = f38015c;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, c7499b, tMo807E)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c7499b) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f38016a = null;
                return tMo807E;
            }
        }
        return (T) this._value;
    }

    public final String toString() {
        return mo3942b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
