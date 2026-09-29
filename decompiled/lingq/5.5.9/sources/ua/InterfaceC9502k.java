package ua;

import com.google.android.exoplayer2.C2416m;
import ga.C5735r;
import java.util.List;
import p151ha.AbstractC5945b;
import p151ha.AbstractC5947d;
import p151ha.InterfaceC5948e;
import p479xa.C10145n;

/* JADX INFO: renamed from: ua.k */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9502k extends InterfaceC9505n {

    /* JADX INFO: renamed from: ua.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5735r f48914a;

        /* JADX INFO: renamed from: b */
        public final int[] f48915b;

        /* JADX INFO: renamed from: c */
        public final int f48916c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            throw null;
        }

        public a(int i10, C5735r c5735r, int[] iArr) {
            if (iArr.length == 0) {
                C10145n.m19096d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f48914a = c5735r;
            this.f48915b = iArr;
            this.f48916c = i10;
        }
    }

    /* JADX INFO: renamed from: ua.k$b */
    public interface b {
    }

    /* JADX INFO: renamed from: b */
    int mo7340b();

    /* JADX INFO: renamed from: c */
    void mo7341c(long j10, long j11, long j12, List<? extends AbstractC5947d> list, InterfaceC5948e[] interfaceC5948eArr);

    /* JADX INFO: renamed from: d */
    boolean mo7342d(int i10, long j10);

    /* JADX INFO: renamed from: e */
    boolean mo7343e(int i10, long j10);

    /* JADX INFO: renamed from: f */
    void mo7344f();

    /* JADX INFO: renamed from: g */
    default void mo7345g(boolean z10) {
    }

    /* JADX INFO: renamed from: i */
    void mo7347i();

    /* JADX INFO: renamed from: k */
    int mo7349k();

    /* JADX INFO: renamed from: l */
    C2416m mo7350l();

    /* JADX INFO: renamed from: m */
    int mo7351m();

    /* JADX INFO: renamed from: n */
    void mo7352n(float f3);

    /* JADX INFO: renamed from: o */
    Object mo7353o();

    /* JADX INFO: renamed from: p */
    default void mo7354p() {
    }

    /* JADX INFO: renamed from: q */
    default boolean mo7355q(long j10, AbstractC5945b abstractC5945b, List<? extends AbstractC5947d> list) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    default void mo7356r() {
    }

    /* JADX INFO: renamed from: s */
    int mo7357s(List list, long j10);
}
