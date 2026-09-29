package kotlin;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import p260m8.C7499b;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, m13365d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lsl/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class SynchronizedLazyImpl<T> implements InterfaceC9070c<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC2041a<? extends T> f38018a;

    /* JADX INFO: renamed from: b */
    public volatile Object f38019b;

    /* JADX INFO: renamed from: c */
    public final Object f38020c;

    public SynchronizedLazyImpl(InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "initializer");
        this.f38018a = interfaceC2041a;
        this.f38019b = C7499b.f41425O;
        this.f38020c = this;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        return this.f38019b != C7499b.f41425O;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sl.InterfaceC9070c
    public final T getValue() {
        T tMo807E;
        T t10 = (T) this.f38019b;
        C7499b c7499b = C7499b.f41425O;
        if (t10 != c7499b) {
            return t10;
        }
        synchronized (this.f38020c) {
            tMo807E = (T) this.f38019b;
            if (tMo807E == c7499b) {
                InterfaceC2041a<? extends T> interfaceC2041a = this.f38018a;
                C5207g.m11108c(interfaceC2041a);
                tMo807E = interfaceC2041a.mo807E();
                this.f38019b = tMo807E;
                this.f38018a = null;
            }
        }
        return tMo807E;
    }

    public final String toString() {
        return mo3942b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
