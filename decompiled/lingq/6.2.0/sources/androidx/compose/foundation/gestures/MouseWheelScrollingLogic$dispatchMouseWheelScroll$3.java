package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.ho8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m4291f = "MouseWheelScrollingLogic.kt", m4292l = {228, 241, 261}, m4293m = "invokeSuspend", m4294v = 1)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$BooleanRef f1988a;

    /* JADX INFO: renamed from: b */
    public Ref$BooleanRef f1989b;

    /* JADX INFO: renamed from: c */
    public int f1990c;

    /* JADX INFO: renamed from: d */
    public int f1991d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1992e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Ref$FloatRef f1993f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef f1994g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Ref$ObjectRef f1995h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f1996i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0106n f1997j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f1998k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0116v f1999l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, float f, C0106n c0106n, float f2, C0116v c0116v, Continuation continuation) {
        super(2, continuation);
        this.f1993f = ref$FloatRef;
        this.f1994g = ref$ObjectRef;
        this.f1995h = ref$ObjectRef2;
        this.f1996i = f;
        this.f1997j = c0106n;
        this.f1998k = f2;
        this.f1999l = c0116v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.f1993f, this.f1994g, this.f1995h, this.f1996i, this.f1997j, this.f1998k, this.f1999l, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.f1992e = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create((ho8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0193 -> B:37:0x0194). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
