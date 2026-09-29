package kotlin.random;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Serializable;
import kotlin.Metadata;
import p515yl.C10415b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Random {

    /* JADX INFO: renamed from: a */
    public static final Default f38128a = new Default(0);

    /* JADX INFO: renamed from: b */
    public static final Random f38129b = C10415b.f52219a.mo523b();

    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m13365d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "Serialized", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Default extends Random implements Serializable {

        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, m13365d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "<init>", "()V", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        public static final class Serialized implements Serializable {

            /* JADX INFO: renamed from: a */
            public static final Serialized f38130a = new Serialized();

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f38128a;
            }
        }

        private Default() {
        }

        public /* synthetic */ Default(int i10) {
            this();
        }

        private final Object writeReplace() {
            return Serialized.f38130a;
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: a */
        public final int mo12509a(int i10) {
            return Random.f38129b.mo12509a(i10);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: b */
        public final int mo12510b() {
            return Random.f38129b.mo12510b();
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: c */
        public final int mo12511c(int i10) {
            return Random.f38129b.mo12511c(i10);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: d */
        public final int mo12968d(int i10, int i11) {
            return Random.f38129b.mo12968d(i10, i11);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo12509a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract int mo12510b();

    /* JADX INFO: renamed from: c */
    public abstract int mo12511c(int i10);

    /* JADX INFO: renamed from: d */
    public int mo12968d(int i10, int i11) {
        int iMo12510b;
        int i12;
        int iMo12509a;
        int iMo12510b2;
        if (!(i11 > i10)) {
            Integer numValueOf = Integer.valueOf(i10);
            Integer numValueOf2 = Integer.valueOf(i11);
            C5207g.m11111f(numValueOf, "from");
            C5207g.m11111f(numValueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + numValueOf + ", " + numValueOf2 + ").").toString());
        }
        int i13 = i11 - i10;
        if (i13 <= 0 && i13 != Integer.MIN_VALUE) {
            do {
                iMo12510b2 = mo12510b();
            } while (!(i10 <= iMo12510b2 && iMo12510b2 < i11));
            return iMo12510b2;
        }
        if (((-i13) & i13) == i13) {
            iMo12509a = mo12509a(31 - Integer.numberOfLeadingZeros(i13));
        } else {
            do {
                iMo12510b = mo12510b() >>> 1;
                i12 = iMo12510b % i13;
            } while ((i13 - 1) + (iMo12510b - i12) < 0);
            iMo12509a = i12;
        }
        return i10 + iMo12509a;
    }
}
