package androidx.compose.p017ui.window;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", m19206f = "AndroidPopup.android.kt", m19207l = {301}, m19208m = "invokeSuspend")
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f4705e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f4706f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PopupLayout f4707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, InterfaceC9968c<? super AndroidPopup_androidKt$Popup$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4707g = popupLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.f4707g, interfaceC9968c);
        androidPopup_androidKt$Popup$5.f4706f = obj;
        return androidPopup_androidKt$Popup$5;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((AndroidPopup_androidKt$Popup$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:16:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r13) {
        /*
            r12 = this;
            r9 = r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f4705e
            r11 = 3
            r11 = 1
            r2 = r11
            if (r1 == 0) goto L22
            if (r1 != r2) goto L16
            r11 = 7
            java.lang.Object r1 = r9.f4706f
            no.z r1 = (no.InterfaceC7882z) r1
            p260m8.C7499b.m14977z0(r13)
            r13 = r9
            goto L43
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r11 = 7
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r0 = r11
            r13.<init>(r0)
            r11 = 4
            throw r13
            r11 = 6
        L22:
            p260m8.C7499b.m14977z0(r13)
            r11 = 3
            java.lang.Object r13 = r9.f4706f
            r11 = 4
            no.z r13 = (no.InterfaceC7882z) r13
            r1 = r13
            r13 = r9
        L2d:
            boolean r3 = p260m8.C7499b.m14923U(r1)
            if (r3 == 0) goto L64
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = new cm.InterfaceC2052l<java.lang.Long, sl.C9072e>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        java.lang.String r2 = "Modded by Timozhai and secure with Smob - Mod obfuscation tool v4.6 by Kirlif'"
                        r0.<init>()
                        
                        // error: 0x0007: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5.1.b androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.window.AndroidPopup_androidKt$Popup$5.C07111.<clinit>():void");
                }

                {
                    /*
                        r5 = this;
                        r1 = r5
                        r4 = 1
                        r0 = r4
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.window.AndroidPopup_androidKt$Popup$5.C07111.<init>():void");
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final /* bridge */ /* synthetic */ sl.C9072e mo528n(java.lang.Long r4) {
                    /*
                        r3 = this;
                        r0 = r3
                        java.lang.Number r4 = (java.lang.Number) r4
                        r4.longValue()
                        sl.e r4 = sl.C9072e.f47360a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.window.AndroidPopup_androidKt$Popup$5.C07111.mo528n(java.lang.Object):java.lang.Object");
                }
            }
            r11 = 7
            r13.f4706f = r1
            r11 = 6
            r13.f4705e = r2
            java.lang.Object r3 = androidx.compose.p017ui.platform.InfiniteAnimationPolicyKt.m2310a(r3, r13)
            if (r3 != r0) goto L42
            return r0
        L42:
            r11 = 1
        L43:
            androidx.compose.ui.window.PopupLayout r3 = r13.f4707g
            r11 = 7
            int[] r4 = r3.f4743T
            r11 = 0
            r5 = r11
            r6 = r4[r5]
            r11 = 5
            r7 = r4[r2]
            android.view.View r8 = r3.f4747l
            r8.getLocationOnScreen(r4)
            r11 = 3
            r5 = r4[r5]
            r11 = 5
            if (r6 != r5) goto L60
            r11 = 4
            r4 = r4[r2]
            r11 = 5
            if (r7 == r4) goto L2d
        L60:
            r3.m2623l()
            goto L2d
        L64:
            r11 = 4
            sl.e r13 = sl.C9072e.f47360a
            r11 = 2
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.window.AndroidPopup_androidKt$Popup$5.mo1338x(java.lang.Object):java.lang.Object");
    }
}
