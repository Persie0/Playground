package androidx.compose.p017ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p325po.InterfaceC8428d;
import p325po.InterfaceC8430f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m19206f = "WindowRecomposer.android.kt", m19207l = {115, 121}, m19208m = "invokeSuspend")
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Float>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public InterfaceC8430f f4254e;

    /* JADX INFO: renamed from: f */
    public int f4255f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f4256g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ContentResolver f4257h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Uri f4258i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0683z1 f4259j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC8428d<C9072e> f4260k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Context f4261l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C0683z1 c0683z1, InterfaceC8428d<C9072e> interfaceC8428d, Context context, InterfaceC9968c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4257h = contentResolver;
        this.f4258i = uri;
        this.f4259j = c0683z1;
        this.f4260k = interfaceC8428d;
        this.f4261l = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.f4257h, this.f4258i, this.f4259j, this.f4260k, this.f4261l, interfaceC9968c);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.f4256g = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Float> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:22:0x006a, B:24:0x0073), top: B:41:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a0 -> B:39:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f4255f
            r12 = 5
            r2 = 2
            r9 = 1
            r3 = r9
            if (r1 == 0) goto L36
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1a
            r11 = 5
            po.f r1 = r13.f4254e
            java.lang.Object r4 = r13.f4256g
            kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC7117d) r4
            r11 = 5
            p260m8.C7499b.m14977z0(r14)     // Catch: java.lang.Throwable -> Lba
            goto L54
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r11 = 5
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r0 = r9
            r14.<init>(r0)
            r10 = 7
            throw r14
            r12 = 4
        L26:
            po.f r1 = r13.f4254e
            r10 = 2
            java.lang.Object r4 = r13.f4256g
            kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC7117d) r4
            r12 = 3
            p260m8.C7499b.m14977z0(r14)     // Catch: java.lang.Throwable -> Lba
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r13
            goto L6a
        L36:
            p260m8.C7499b.m14977z0(r14)
            r10 = 7
            java.lang.Object r14 = r13.f4256g
            r4 = r14
            kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC7117d) r4
            r12 = 5
            android.content.ContentResolver r14 = r13.f4257h
            r10 = 5
            android.net.Uri r1 = r13.f4258i
            r11 = 5
            r5 = 0
            r11 = 2
            androidx.compose.ui.platform.z1 r6 = r13.f4259j
            r14.registerContentObserver(r1, r5, r6)
            r12 = 5
            po.d<sl.e> r14 = r13.f4260k     // Catch: java.lang.Throwable -> Lba
            po.f r1 = r14.iterator()     // Catch: java.lang.Throwable -> Lba
        L54:
            r14 = r13
        L55:
            r14.f4256g = r4     // Catch: java.lang.Throwable -> Lb5
            r14.f4254e = r1     // Catch: java.lang.Throwable -> Lb5
            r14.f4255f = r3     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r9 = r1.mo14348a(r14)     // Catch: java.lang.Throwable -> Lb5
            r5 = r9
            if (r5 != r0) goto L63
            return r0
        L63:
            r11 = 4
            r8 = r0
            r0 = r14
            r14 = r5
            r5 = r4
            r4 = r1
            r1 = r8
        L6a:
            r11 = 6
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Throwable -> La6
            boolean r14 = r14.booleanValue()     // Catch: java.lang.Throwable -> La6
            if (r14 == 0) goto La8
            r10 = 1
            r4.next()     // Catch: java.lang.Throwable -> La6
            android.content.Context r14 = r0.f4261l     // Catch: java.lang.Throwable -> La6
            r12 = 5
            android.content.ContentResolver r14 = r14.getContentResolver()     // Catch: java.lang.Throwable -> La6
            java.lang.String r9 = "animator_duration_scale"
            r6 = r9
            r7 = 1065353216(0x3f800000, float:1.0)
            r12 = 4
            float r14 = android.provider.Settings.Global.getFloat(r14, r6, r7)     // Catch: java.lang.Throwable -> La6
            java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> La6
            r11 = 2
            r6.<init>(r14)     // Catch: java.lang.Throwable -> La6
            r12 = 2
            r0.f4256g = r5     // Catch: java.lang.Throwable -> La6
            r11 = 6
            r0.f4254e = r4     // Catch: java.lang.Throwable -> La6
            r11 = 6
            r0.f4255f = r2     // Catch: java.lang.Throwable -> La6
            r12 = 6
            java.lang.Object r14 = r5.mo1339r(r6, r0)     // Catch: java.lang.Throwable -> La6
            if (r14 != r1) goto La0
            r11 = 3
            return r1
        La0:
            r12 = 7
            r14 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L55
        La6:
            r14 = move-exception
            goto Lbc
        La8:
            android.content.ContentResolver r14 = r0.f4257h
            r11 = 4
            androidx.compose.ui.platform.z1 r0 = r0.f4259j
            r11 = 5
            r14.unregisterContentObserver(r0)
            r11 = 5
            sl.e r14 = sl.C9072e.f47360a
            return r14
        Lb5:
            r0 = move-exception
            r8 = r0
            r0 = r14
            r14 = r8
            goto Lbc
        Lba:
            r14 = move-exception
            r0 = r13
        Lbc:
            android.content.ContentResolver r1 = r0.f4257h
            androidx.compose.ui.platform.z1 r0 = r0.f4259j
            r10 = 5
            r1.unregisterContentObserver(r0)
            r12 = 6
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
