package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.b64;
import p000.do7;
import p000.dpa;
import p000.fb2;
import p000.fg7;
import p000.fpa;
import p000.iu0;
import p000.kg7;
import p000.omd;
import p000.pg9;
import p000.u91;
import p000.uea;
import p000.vx8;
import p000.w36;
import p000.xfa;
import p000.y8a;
import p000.zi3;
import p000.zt3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0118x extends AbstractC0107o {

    /* JADX INFO: renamed from: f */
    public final C3211a f2374f;

    /* JADX INFO: renamed from: g */
    public pg9 f2375g;

    public C0118x(C0116v c0116v, zi3 zi3Var, fb2 fb2Var) {
        super(c0116v, zi3Var, fb2Var);
        this.f2374f = do7.m10525a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        if (r0.invoke(r3, r4) == r5) goto L24;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m948c(C0118x c0118x, C0116v c0116v, y8a y8aVar, ContinuationImpl continuationImpl) throws Throwable {
        TrackpadScrollingLogic$dispatchTrackpadScroll$1 trackpadScrollingLogic$dispatchTrackpadScroll$1;
        c0118x.getClass();
        b64 b64Var = c0118x.f2300e;
        if (continuationImpl instanceof TrackpadScrollingLogic$dispatchTrackpadScroll$1) {
            trackpadScrollingLogic$dispatchTrackpadScroll$1 = (TrackpadScrollingLogic$dispatchTrackpadScroll$1) continuationImpl;
            int i = trackpadScrollingLogic$dispatchTrackpadScroll$1.f2199c;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackpadScrollingLogic$dispatchTrackpadScroll$1.f2199c = i - Integer.MIN_VALUE;
            } else {
                trackpadScrollingLogic$dispatchTrackpadScroll$1 = new TrackpadScrollingLogic$dispatchTrackpadScroll$1(c0118x, continuationImpl);
            }
        } else {
            trackpadScrollingLogic$dispatchTrackpadScroll$1 = new TrackpadScrollingLogic$dispatchTrackpadScroll$1(c0118x, continuationImpl);
        }
        Object obj = trackpadScrollingLogic$dispatchTrackpadScroll$1.f2197a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = trackpadScrollingLogic$dispatchTrackpadScroll$1.f2199c;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f47718a = y8aVar;
        long j = y8aVar.f69484b;
        long j2 = y8aVar.f69483a;
        ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
        y8a y8aVarM949e = m949e(c0118x.f2374f);
        if (y8aVarM949e != null) {
            long j3 = y8aVarM949e.f69484b;
            long j4 = y8aVarM949e.f69483a;
            ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            ref$ObjectRef.f47718a = ((y8a) ref$ObjectRef.f47718a).m24987a(y8aVarM949e);
        }
        zi3 trackpadScrollingLogic$dispatchTrackpadScroll$3 = new TrackpadScrollingLogic$dispatchTrackpadScroll$3(c0118x, c0116v, ref$ObjectRef, null);
        trackpadScrollingLogic$dispatchTrackpadScroll$1.f2199c = 1;
        if (c0118x.m900b(trackpadScrollingLogic$dispatchTrackpadScroll$3, trackpadScrollingLogic$dispatchTrackpadScroll$1) != obj2) {
        }
        return obj2;
        zi3 zi3Var = c0118x.f2297b;
        dpa dpaVar = new dpa(uea.m22716a(((fpa) b64Var.f8006a).m11989b(Float.MAX_VALUE), ((fpa) b64Var.f8007b).m11989b(Float.MAX_VALUE)));
        trackpadScrollingLogic$dispatchTrackpadScroll$1.f2199c = 2;
    }

    /* JADX INFO: renamed from: e */
    public static y8a m949e(C3211a c3211a) {
        y8a y8aVar = null;
        vx8 vx8VarM18129S = omd.m18129S(new NonTouchScrollingLogicKt$untilNull$1(new w36(c3211a, 1), null));
        while (vx8VarM18129S.hasNext()) {
            y8a y8aVarM24987a = (y8a) vx8VarM18129S.next();
            if (y8aVar != null) {
                y8aVarM24987a = y8aVar.m24987a(y8aVarM24987a);
            }
            y8aVar = y8aVarM24987a;
        }
        return y8aVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m950d(fg7 fg7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        C3211a c3211a;
        C0116v c0116v;
        kg7 kg7Var = (kg7) u91.m22591I0(fg7Var.f39071a);
        if (kg7Var != null) {
            List listM15190b = kg7Var.m15190b();
            int size = listM15190b.size();
            int i = 0;
            z3 = false;
            while (true) {
                c3211a = this.f2374f;
                c0116v = this.f2296a;
                if (i >= size) {
                    break;
                }
                zt3 zt3Var = (zt3) listM15190b.get(i);
                long j = zt3Var.f72143d ^ (-9223372034707292160L);
                if (!(c0116v.m937i(c0116v.m933e(j)) == 0.0f)) {
                    z3 = !(c3211a.mo4677k(new y8a(j, zt3Var.f72140a, false)) instanceof iu0) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = kg7Var.f47246l ^ (-9223372034707292160L);
            boolean z4 = fg7Var.f39076f == 12;
            if (!(c0116v.m937i(c0116v.m933e(j2)) == 0.0f) || z4) {
                if (!(c3211a.mo4677k(new y8a(j2, kg7Var.f47236b, z4)) instanceof iu0) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f2299d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
