package kotlin;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m13365d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Failure", "value", "", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class Result<T> implements Serializable {

    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Failure implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f38014a;

        public Failure(Throwable th2) {
            C5207g.m11111f(th2, "exception");
            this.f38014a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                if (C5207g.m11106a(this.f38014a, ((Failure) obj).f38014a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f38014a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f38014a + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m13371a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f38014a;
        }
        return null;
    }
}
