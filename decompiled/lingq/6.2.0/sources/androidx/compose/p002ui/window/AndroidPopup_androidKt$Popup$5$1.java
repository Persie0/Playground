package androidx.compose.p002ui.window;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", m4291f = "AndroidPopup.android.kt", m4292l = {496}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f5253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0461i f5255c;

    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 */
    final class C04511 extends Lambda implements vi3 {

        /* JADX INFO: renamed from: b */
        public static final C04511 f5256b = new C04511(1);

        @Override // p000.vi3
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(C0461i c0461i, Continuation continuation) {
        super(2, continuation);
        this.f5255c = c0461i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.f5255c, continuation);
        androidPopup_androidKt$Popup$5$1.f5254b = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPopup_androidKt$Popup$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:16:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f5253a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L12
            java.lang.Object r1 = r9.f5254b
            un1 r1 = (p000.un1) r1
            kotlin.AbstractC3193b.m15359b(r10)
            goto L47
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r2
        L18:
            kotlin.AbstractC3193b.m15359b(r10)
            java.lang.Object r10 = r9.f5254b
            un1 r10 = (p000.un1) r10
            r1 = r10
        L20:
            boolean r10 = p000.vz1.m23603I(r1)
            if (r10 == 0) goto L6c
            r9.f5254b = r1
            r9.f5253a = r3
            kn1 r10 = r9.getContext()
            g9c r4 = p000.g9c.f40429c
            in1 r10 = r10.get(r4)
            if (r10 != 0) goto L68
            kn1 r10 = r9.getContext()
            t16 r10 = p000.b34.m3250q(r10)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r4 = androidx.compose.p002ui.window.AndroidPopup_androidKt$Popup$5$1.C04511.f5256b
            java.lang.Object r10 = r10.mo1250e(r4, r9)
            if (r10 != r0) goto L47
            return r0
        L47:
            androidx.compose.ui.window.i r10 = r9.f5255c
            int[] r4 = r10.f5322a0
            boolean r5 = r10.isAttachedToWindow()
            if (r5 != 0) goto L52
            goto L20
        L52:
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r3]
            android.view.View r8 = r10.f5306H
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L64
            r4 = r4[r3]
            if (r7 == r4) goto L20
        L64:
            r10.m1905o()
            goto L20
        L68:
            p000.ho2.m13383c()
            return r2
        L6c:
            xfa r9 = p000.xfa.f68157a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
