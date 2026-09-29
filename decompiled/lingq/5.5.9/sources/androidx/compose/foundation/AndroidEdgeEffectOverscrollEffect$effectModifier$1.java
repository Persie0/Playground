package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p060d1.InterfaceC5016c;
import p060d1.InterfaceC5035v;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/v;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", m19206f = "AndroidOverscroll.kt", m19207l = {316}, m19208m = "invokeSuspend")
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC5035v, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1692e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1693f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f1694g;

    /* JADX INFO: renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", m19206f = "AndroidOverscroll.kt", m19207l = {317, 321}, m19208m = "invokeSuspend")
    public static final class C03731 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: c */
        public int f1695c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f1696d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f1697e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03731(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC9968c<? super C03731> interfaceC9968c) {
            super(interfaceC9968c);
            this.f1697e = androidEdgeEffectOverscrollEffect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C03731 c03731 = new C03731(this.f1697e, interfaceC9968c);
            c03731.f1696d = obj;
            return c03731;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C03731) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x008f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ac A[LOOP:1: B:24:0x008b->B:35:0x00ac, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[EDGE_INSN: B:50:0x00b3->B:37:0x00b3 BREAK  A[LOOP:1: B:24:0x008b->B:35:0x00ac], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:17:0x0061). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final java.lang.Object mo1338x(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.C03731.mo1338x(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, InterfaceC9968c<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1694g = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.f1694g, interfaceC9968c);
        androidEdgeEffectOverscrollEffect$effectModifier$1.f1693f = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5035v interfaceC5035v, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) mo1336a(interfaceC5035v, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1692e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5035v interfaceC5035v = (InterfaceC5035v) this.f1693f;
            C03731 c03731 = new C03731(this.f1694g, null);
            this.f1692e = 1;
            if (ForEachGestureKt.m1458b(interfaceC5035v, c03731, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
