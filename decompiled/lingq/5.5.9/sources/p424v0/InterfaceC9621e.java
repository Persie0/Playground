package p424v0;

import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.unit.LayoutDirection;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p338qd.C8584v;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.AbstractC9161o;
import p387t0.C9151j;
import p387t0.C9170v;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9174z;
import p470x1.C10020h;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: v0.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9621e extends InterfaceC10015c {
    /* JADX INFO: renamed from: C0 */
    static void m18088C0(InterfaceC9621e interfaceC9621e, AbstractC9161o abstractC9161o, long j10, long j11, long j12, C9624h c9624h, int i10) {
        long j13 = (i10 & 2) != 0 ? C8941c.f46888b : j10;
        interfaceC9621e.mo12679w0(abstractC9161o, j13, (i10 & 4) != 0 ? m18091Z(interfaceC9621e.mo12674d(), j13) : j11, (i10 & 8) != 0 ? C8939a.f46882a : j12, (i10 & 16) != 0 ? 1.0f : 0.0f, (i10 & 32) != 0 ? C9623g.f49295a : c9624h, null, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: F0 */
    static /* synthetic */ void m18089F0(InterfaceC9621e interfaceC9621e, InterfaceC9138c0 interfaceC9138c0, AbstractC9161o abstractC9161o, float f3, C9624h c9624h, int i10) {
        if ((i10 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        AbstractC0140a abstractC0140a = c9624h;
        if ((i10 & 8) != 0) {
            abstractC0140a = C9623g.f49295a;
        }
        interfaceC9621e.mo12677p0(interfaceC9138c0, abstractC9161o, f10, abstractC0140a, null, (i10 & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: U */
    static void m18090U(InterfaceC9621e interfaceC9621e, long j10, long j11, int i10) {
        long j12 = (i10 & 2) != 0 ? C8941c.f46888b : 0L;
        interfaceC9621e.mo12675d0(j10, j12, (i10 & 4) != 0 ? m18091Z(interfaceC9621e.mo12674d(), j12) : j11, (i10 & 8) != 0 ? 1.0f : 0.0f, (i10 & 16) != 0 ? C9623g.f49295a : null, null, (i10 & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: Z */
    private static long m18091Z(long j10, long j11) {
        return C8584v.m16788m(C8944f.m17177d(j10) - C8941c.m17164c(j11), C8944f.m17175b(j10) - C8941c.m17165d(j11));
    }

    /* JADX INFO: renamed from: b0 */
    static void m18092b0(InterfaceC9621e interfaceC9621e, AbstractC9161o abstractC9161o, long j10, long j11, float f3, AbstractC0140a abstractC0140a, int i10) {
        long j12 = (i10 & 2) != 0 ? C8941c.f46888b : j10;
        interfaceC9621e.mo12669L(abstractC9161o, j12, (i10 & 4) != 0 ? m18091Z(interfaceC9621e.mo12674d(), j12) : j11, (i10 & 8) != 0 ? 1.0f : f3, (i10 & 16) != 0 ? C9623g.f49295a : abstractC0140a, null, (i10 & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: f0 */
    static void m18093f0(InterfaceC9621e interfaceC9621e, InterfaceC9174z interfaceC9174z, long j10, long j11, long j12, long j13, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10, int i11, int i12) {
        long j14 = (i12 & 2) != 0 ? C10020h.f50973b : j10;
        long jM17236a = (i12 & 4) != 0 ? C9000b.m17236a(interfaceC9174z.mo17438b(), interfaceC9174z.mo17437a()) : j11;
        interfaceC9621e.mo12673a0(interfaceC9174z, j14, jM17236a, (i12 & 8) != 0 ? C10020h.f50973b : j12, (i12 & 16) != 0 ? jM17236a : j13, (i12 & 32) != 0 ? 1.0f : f3, (i12 & 64) != 0 ? C9623g.f49295a : abstractC0140a, (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : c9170v, (i12 & 256) != 0 ? 3 : i10, (i12 & 512) != 0 ? 1 : i11);
    }

    /* JADX INFO: renamed from: L */
    void mo12669L(AbstractC9161o abstractC9161o, long j10, long j11, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: S */
    void mo12670S(C9151j c9151j, long j10, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: Y */
    void mo12671Y(long j10, long j11, long j12, long j13, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: a0 */
    default void mo12673a0(InterfaceC9174z interfaceC9174z, long j10, long j11, long j12, long j13, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10, int i11) {
        C5207g.m11111f(interfaceC9174z, "image");
        C5207g.m11111f(abstractC0140a, "style");
        m18093f0(this, interfaceC9174z, j10, j11, j12, j13, f3, abstractC0140a, c9170v, i10, 0, 512);
    }

    /* JADX INFO: renamed from: d */
    default long mo12674d() {
        return mo12676l0().mo18081d();
    }

    /* JADX INFO: renamed from: d0 */
    void mo12675d0(long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: l0 */
    C9617a.b mo12676l0();

    /* JADX INFO: renamed from: p0 */
    void mo12677p0(InterfaceC9138c0 interfaceC9138c0, AbstractC9161o abstractC9161o, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: r0 */
    void mo12678r0(long j10, float f3, long j11, float f10, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: w0 */
    void mo12679w0(AbstractC9161o abstractC9161o, long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10);

    /* JADX INFO: renamed from: y0 */
    default long mo12680y0() {
        return C8584v.m16794s(mo12676l0().mo18081d());
    }
}
