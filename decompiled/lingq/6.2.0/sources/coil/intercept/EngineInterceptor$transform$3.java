package coil.intercept;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e04;
import p000.ms2;
import p000.sz6;
import p000.un1;
import p000.wt2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "coil.intercept.EngineInterceptor$transform$3", m4291f = "EngineInterceptor.kt", m4292l = {246}, m4293m = "invokeSuspend")
final class EngineInterceptor$transform$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public List f10536a;

    /* JADX INFO: renamed from: b */
    public sz6 f10537b;

    /* JADX INFO: renamed from: c */
    public int f10538c;

    /* JADX INFO: renamed from: d */
    public int f10539d;

    /* JADX INFO: renamed from: e */
    public int f10540e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f10541f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0862a f10542g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ms2 f10543h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ sz6 f10544i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f10545j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ wt2 f10546k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ e04 f10547l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$transform$3(C0862a c0862a, ms2 ms2Var, sz6 sz6Var, List list, wt2 wt2Var, e04 e04Var, Continuation continuation) {
        super(2, continuation);
        this.f10542g = c0862a;
        this.f10543h = ms2Var;
        this.f10544i = sz6Var;
        this.f10545j = list;
        this.f10546k = wt2Var;
        this.f10547l = e04Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.f10542g, this.f10543h, this.f10544i, this.f10545j, this.f10546k, this.f10547l, continuation);
        engineInterceptor$transform$3.f10541f = obj;
        return engineInterceptor$transform$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$transform$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008b -> B:22:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.f10540e
            wt2 r2 = r13.f10546k
            ms2 r3 = r13.f10543h
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 != r4) goto L20
            int r1 = r13.f10539d
            int r5 = r13.f10538c
            sz6 r6 = r13.f10537b
            java.util.List r7 = r13.f10536a
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r13.f10541f
            un1 r8 = (p000.un1) r8
            kotlin.AbstractC3193b.m15359b(r14)
            goto L8e
        L20:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r13)
            r13 = 0
            return r13
        L27:
            kotlin.AbstractC3193b.m15359b(r14)
            java.lang.Object r14 = r13.f10541f
            un1 r14 = (p000.un1) r14
            android.graphics.drawable.Drawable r1 = r3.f51793a
            boolean r5 = r1 instanceof android.graphics.drawable.BitmapDrawable
            sz6 r6 = r13.f10544i
            if (r5 == 0) goto L4e
            r5 = r1
            android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
            android.graphics.Bitmap r5 = r5.getBitmap()
            android.graphics.Bitmap$Config r7 = r5.getConfig()
            if (r7 != 0) goto L45
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
        L45:
            android.graphics.Bitmap$Config[] r8 = p000.AbstractC3057h.f41581a
            boolean r7 = p000.AbstractC3550rv.m20823Q(r8, r7)
            if (r7 == 0) goto L4e
            goto L5a
        L4e:
            android.graphics.Bitmap$Config r5 = r6.f61660b
            w89 r7 = r6.f61662d
            coil.size.Scale r8 = r6.f61663e
            boolean r9 = r6.f61664f
            android.graphics.Bitmap r5 = p000.sbd.m21208a(r1, r5, r7, r8, r9)
        L5a:
            r2.getClass()
            java.util.List r1 = r13.f10545j
            r7 = r1
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r12 = r8
            r8 = r14
            r14 = r5
            r5 = r12
            r12 = r7
            r7 = r1
            r1 = r12
        L6e:
            if (r5 >= r1) goto L95
            java.lang.Object r9 = r7.get(r5)
            l9a r9 = (p000.l9a) r9
            w89 r10 = r6.f61662d
            r13.f10541f = r8
            r11 = r7
            java.util.List r11 = (java.util.List) r11
            r13.f10536a = r11
            r13.f10537b = r6
            r13.f10538c = r5
            r13.f10539d = r1
            r13.f10540e = r4
            android.graphics.Bitmap r14 = r9.mo9995a(r14, r10)
            if (r14 != r0) goto L8e
            return r0
        L8e:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            p000.vz1.m23597A(r8)
            int r5 = r5 + r4
            goto L6e
        L95:
            r2.getClass()
            e04 r13 = r13.f10547l
            android.content.Context r13 = r13.f36502a
            android.content.res.Resources r13 = r13.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r13, r14)
            boolean r13 = r3.f51794b
            coil.decode.DataSource r14 = r3.f51795c
            java.lang.String r1 = r3.f51796d
            ms2 r2 = new ms2
            r2.<init>(r0, r13, r14, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
