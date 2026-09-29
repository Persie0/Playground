package kotlin;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m13365d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Lsl/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class InitializedLazyImpl<T> implements InterfaceC9070c<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public final T f38011a;

    public InitializedLazyImpl(T t10) {
        this.f38011a = t10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sl.InterfaceC9070c
    /* JADX INFO: renamed from: b */
    public final boolean mo3942b() {
        throw null;
    }

    @Override // sl.InterfaceC9070c
    public final T getValue() {
        return this.f38011a;
    }

    public final String toString() {
        return String.valueOf(this.f38011a);
    }
}
