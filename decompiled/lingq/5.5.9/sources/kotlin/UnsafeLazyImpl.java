package kotlin;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import p260m8.C7499b;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, m13365d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lsl/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UnsafeLazyImpl<T> implements InterfaceC9070c<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC2041a<? extends T> f38024a;

    /* JADX INFO: renamed from: b */
    public Object f38025b;

    public UnsafeLazyImpl(InterfaceC2041a<? extends T> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "initializer");
        this.f38024a = interfaceC2041a;
        this.f38025b = C7499b.f41425O;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        return this.f38025b != C7499b.f41425O;
    }

    @Override // sl.InterfaceC9070c
    public final T getValue() {
        if (this.f38025b == C7499b.f41425O) {
            InterfaceC2041a<? extends T> interfaceC2041a = this.f38024a;
            C5207g.m11108c(interfaceC2041a);
            this.f38025b = interfaceC2041a.mo807E();
            this.f38024a = null;
        }
        return (T) this.f38025b;
    }

    public final String toString() {
        return mo3942b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
