package p174i9;

import android.util.SparseArray;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import dm.C5212l;
import ga.C5726i;
import java.io.IOException;
import java.util.Arrays;
import p218k9.C6635e;
import p479xa.C10141j;
import p505ya.C10332n;

/* JADX INFO: renamed from: i9.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6208b {

    /* JADX INFO: renamed from: i9.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f36098a;

        /* JADX INFO: renamed from: b */
        public final AbstractC2382c0 f36099b;

        /* JADX INFO: renamed from: c */
        public final int f36100c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC2492i.b f36101d;

        /* JADX INFO: renamed from: e */
        public final long f36102e;

        /* JADX INFO: renamed from: f */
        public final AbstractC2382c0 f36103f;

        /* JADX INFO: renamed from: g */
        public final int f36104g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC2492i.b f36105h;

        /* JADX INFO: renamed from: i */
        public final long f36106i;

        /* JADX INFO: renamed from: j */
        public final long f36107j;

        public a(long j10, AbstractC2382c0 abstractC2382c0, int i10, InterfaceC2492i.b bVar, long j11, AbstractC2382c0 abstractC2382c1, int i11, InterfaceC2492i.b bVar2, long j12, long j13) {
            this.f36098a = j10;
            this.f36099b = abstractC2382c0;
            this.f36100c = i10;
            this.f36101d = bVar;
            this.f36102e = j11;
            this.f36103f = abstractC2382c1;
            this.f36104g = i11;
            this.f36105h = bVar2;
            this.f36106i = j12;
            this.f36107j = j13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f36098a == aVar.f36098a && this.f36100c == aVar.f36100c && this.f36102e == aVar.f36102e && this.f36104g == aVar.f36104g && this.f36106i == aVar.f36106i && this.f36107j == aVar.f36107j && C5212l.m11140M(this.f36099b, aVar.f36099b) && C5212l.m11140M(this.f36101d, aVar.f36101d) && C5212l.m11140M(this.f36103f, aVar.f36103f) && C5212l.m11140M(this.f36105h, aVar.f36105h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f36098a), this.f36099b, Integer.valueOf(this.f36100c), this.f36101d, Long.valueOf(this.f36102e), this.f36103f, Integer.valueOf(this.f36104g), this.f36105h, Long.valueOf(this.f36106i), Long.valueOf(this.f36107j)});
        }
    }

    /* JADX INFO: renamed from: i9.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final C10141j f36108a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<a> f36109b;

        public b(C10141j c10141j, SparseArray<a> sparseArray) {
            this.f36108a = c10141j;
            SparseArray<a> sparseArray2 = new SparseArray<>(c10141j.m19072b());
            for (int i10 = 0; i10 < c10141j.m19072b(); i10++) {
                int iM19071a = c10141j.m19071a(i10);
                a aVar = sparseArray.get(iM19071a);
                aVar.getClass();
                sparseArray2.append(iM19071a, aVar);
            }
            this.f36109b = sparseArray2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12813a(int i10) {
            return this.f36108a.f51380a.get(i10);
        }
    }

    /* JADX INFO: renamed from: A */
    default void mo12766A(a aVar, C2416m c2416m) {
    }

    /* JADX INFO: renamed from: B */
    default void mo12767B(a aVar, int i10) {
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    default void mo12768C(a aVar, String str) {
    }

    /* JADX INFO: renamed from: D */
    default void mo12769D(a aVar) {
    }

    /* JADX INFO: renamed from: E */
    default void mo12770E(a aVar, String str) {
    }

    /* JADX INFO: renamed from: F */
    default void mo12771F(a aVar) {
    }

    /* JADX INFO: renamed from: G */
    default void mo12772G(a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: H */
    default void mo12773H(a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: I */
    default void mo12774I(a aVar, int i10, long j10, long j11) {
    }

    /* JADX INFO: renamed from: J */
    default void mo12775J(a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: K */
    default void mo12776K() {
    }

    /* JADX INFO: renamed from: L */
    default void mo12777L(a aVar, int i10, int i11) {
    }

    /* JADX INFO: renamed from: M */
    default void mo12778M(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: N */
    default void mo12779N(int i10, a aVar) {
    }

    /* JADX INFO: renamed from: O */
    default void mo12780O(a aVar) {
    }

    /* JADX INFO: renamed from: P */
    default void mo12781P(a aVar) {
    }

    /* JADX INFO: renamed from: Q */
    default void mo12782Q(a aVar, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: R */
    default void mo12783R(a aVar) {
    }

    /* JADX INFO: renamed from: S */
    default void mo12784S(a aVar, C2384d0 c2384d0) {
    }

    /* JADX INFO: renamed from: T */
    default void mo12785T(a aVar) {
    }

    /* JADX INFO: renamed from: U */
    default void mo12786U(a aVar, int i10, long j10) {
    }

    /* JADX INFO: renamed from: a */
    default void mo12787a(a aVar, Exception exc) {
    }

    /* JADX INFO: renamed from: b */
    default void mo12788b(a aVar, C2505u c2505u) {
    }

    /* JADX INFO: renamed from: c */
    default void mo12789c(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: d */
    default void mo12790d(a aVar, C10332n c10332n) {
    }

    /* JADX INFO: renamed from: e */
    default void mo12791e() {
    }

    /* JADX INFO: renamed from: f */
    default void mo12792f(a aVar, PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: g */
    default void mo12793g(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: h */
    default void mo12794h() {
    }

    /* JADX INFO: renamed from: i */
    default void mo12795i(a aVar, C6635e c6635e) {
    }

    /* JADX INFO: renamed from: j */
    default void mo12796j(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: k */
    default void mo12797k(int i10, InterfaceC2532v.d dVar, InterfaceC2532v.d dVar2, a aVar) {
    }

    /* JADX INFO: renamed from: l */
    default void mo12798l(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: m */
    default void mo12799m(int i10, a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: n */
    default void mo12800n(a aVar, C5726i c5726i) {
    }

    /* JADX INFO: renamed from: o */
    default void mo12801o(a aVar, C5726i c5726i, IOException iOException) {
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    default void mo12802p(a aVar, String str) {
    }

    /* JADX INFO: renamed from: q */
    default void mo12803q(a aVar, C2367a c2367a) {
    }

    /* JADX INFO: renamed from: r */
    default void mo12804r(a aVar, int i10) {
    }

    /* JADX INFO: renamed from: s */
    default void mo12805s(a aVar, C2416m c2416m) {
    }

    /* JADX INFO: renamed from: t */
    default void mo12806t(a aVar, String str) {
    }

    /* JADX INFO: renamed from: u */
    default void mo12807u(InterfaceC2532v interfaceC2532v, b bVar) {
    }

    /* JADX INFO: renamed from: v */
    default void mo12808v(a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: w */
    default void mo12809w(a aVar, float f3) {
    }

    /* JADX INFO: renamed from: x */
    default void mo12810x(a aVar) {
    }

    /* JADX INFO: renamed from: y */
    default void mo12811y(a aVar, Metadata metadata) {
    }

    /* JADX INFO: renamed from: z */
    default void mo12812z(a aVar, Object obj) {
    }
}
