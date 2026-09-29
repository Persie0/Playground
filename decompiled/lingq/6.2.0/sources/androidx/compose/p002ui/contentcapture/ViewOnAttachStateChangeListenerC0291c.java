package androidx.compose.p002ui.contentcapture;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.semantics.C0427g;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.channels.C3211a;
import p000.AbstractC3393o1;
import p000.C3024g3;
import p000.C3419on;
import p000.c72;
import p000.d84;
import p000.do7;
import p000.e28;
import p000.e84;
import p000.fa4;
import p000.fb2;
import p000.gm5;
import p000.hg5;
import p000.jh9;
import p000.kv8;
import p000.n66;
import p000.qv8;
import p000.qw9;
import p000.rk1;
import p000.rv8;
import p000.rw9;
import p000.s8d;
import p000.t56;
import p000.u91;
import p000.ub5;
import p000.uh8;
import p000.ui3;
import p000.vi3;
import p000.vx9;
import p000.xfa;
import p000.xwc;
import p000.zi3;
import p000.zx9;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0291c implements c72, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: H */
    public boolean f3828H;

    /* JADX INFO: renamed from: I */
    public final RunnableC0289a f3829I;

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f3830a;

    /* JADX INFO: renamed from: b */
    public final ui3 f3831b;

    /* JADX INFO: renamed from: c */
    public rk1 f3832c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f3833d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final long f3834e = 100;

    /* JADX INFO: renamed from: f */
    public AndroidContentCaptureManager$TranslateStatus f3835f = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g */
    public boolean f3836g = true;

    /* JADX INFO: renamed from: h */
    public final C3211a f3837h = do7.m10525a(1, 6, null);

    /* JADX INFO: renamed from: i */
    public t56 f3838i;

    /* JADX INFO: renamed from: j */
    public long f3839j;

    /* JADX INFO: renamed from: k */
    public final t56 f3840k;

    /* JADX INFO: renamed from: l */
    public qv8 f3841l;

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.a] */
    public ViewOnAttachStateChangeListenerC0291c(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, ui3 ui3Var) {
        this.f3830a = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f3831b = ui3Var;
        new Handler(Looper.getMainLooper());
        t56 t56Var = e84.f36837a;
        t56Var.getClass();
        this.f3838i = t56Var;
        this.f3840k = new t56();
        this.f3841l = new qv8(viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner().m21750a(), t56Var);
        this.f3829I = new Runnable() { // from class: androidx.compose.ui.contentcapture.a
            /* JADX WARN: Code duplicated, block: B:18:0x0071  */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this.f3826a;
                boolean zM1329h = viewOnAttachStateChangeListenerC0291c.m1329h();
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = viewOnAttachStateChangeListenerC0291c.f3830a;
                if (zM1329h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0391c2.m1754x(true);
                        t56 t56Var2 = viewOnAttachStateChangeListenerC0291c.f3840k;
                        int[] iArr = t56Var2.f35144b;
                        long[] jArr = t56Var2.f35143a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (!viewOnAttachStateChangeListenerC0291c.m1328g().m10151a(i5)) {
                                                viewOnAttachStateChangeListenerC0291c.f3833d.add(new C0292d(i5, viewOnAttachStateChangeListenerC0291c.f3839j, ContentCaptureEventType.VIEW_DISAPPEAR, null));
                                                viewOnAttachStateChangeListenerC0291c.f3837h.mo4677k(xfa.f68157a);
                                            }
                                        }
                                        j >>= 8;
                                        i4++;
                                        i2 = i2;
                                    }
                                    int i6 = i2;
                                    if (i3 != 8) {
                                        break;
                                    } else {
                                        i = i6;
                                    }
                                } else {
                                    i = i2;
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i2 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            viewOnAttachStateChangeListenerC0291c.m1334m(viewTreeObserverOnGlobalLayoutListenerC0391c2.getSemanticsOwner().m21750a(), viewOnAttachStateChangeListenerC0291c.f3841l);
                            Trace.endSection();
                            viewOnAttachStateChangeListenerC0291c.m1325d(viewOnAttachStateChangeListenerC0291c.m1328g());
                            viewOnAttachStateChangeListenerC0291c.m1338s();
                            viewOnAttachStateChangeListenerC0291c.f3828H = false;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r2
      0x0046: PHI (r2v3 ej0) = (r2v1 ej0), (r2v2 ej0), (r2v5 ej0) binds: [B:16:0x0039, B:30:0x0082, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[PHI: r2 r8
      0x0051: PHI (r2v2 ej0) = (r2v3 ej0), (r2v4 ej0) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v3 java.lang.Object) = (r8v10 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004e, B:15:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m1324a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.p002ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.p002ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.f3821d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3821d = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3819b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f3821d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            ej0 r2 = r0.f3818a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            r7 = 0
            return r7
        L33:
            ej0 r2 = r0.f3818a
            kotlin.AbstractC3193b.m15359b(r8)
            goto L51
        L39:
            kotlin.AbstractC3193b.m15359b(r8)
            kotlinx.coroutines.channels.a r8 = r7.f3837h
            r8.getClass()
            ej0 r2 = new ej0
            r2.<init>(r8)
        L46:
            r0.f3818a = r2
            r0.f3821d = r4
            java.lang.Object r8 = r2.m11164b(r0)
            if (r8 != r1) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r2.m11165c()
            boolean r8 = r7.m1329h()
            if (r8 == 0) goto L65
            r7.m1330i()
        L65:
            androidx.compose.ui.platform.c r8 = r7.f3830a
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f3828H
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.f3828H = r4
            androidx.compose.ui.contentcapture.a r5 = r7.f3829I
            r8.post(r5)
        L78:
            r0.f3818a = r2
            r0.f3821d = r3
            long r5 = r7.f3834e
            java.lang.Object r8 = kotlinx.coroutines.AbstractC3208a.m15437d(r5, r0)
            if (r8 != r1) goto L46
        L84:
            return r1
        L85:
            xfa r7 = p000.xfa.f68157a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.contentcapture.ViewOnAttachStateChangeListenerC0291c.m1324a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final void m1325d(d84 d84Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        Object[] objArr;
        qv8 qv8Var;
        int i3;
        long[] jArr3;
        long[] jArr4;
        long j3;
        d84 d84Var2 = d84Var;
        int[] iArr3 = d84Var2.f35144b;
        long[] jArr5 = d84Var2.f35143a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr5[i4];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c = c2;
                        qv8 qv8Var2 = (qv8) this.f3840k.m10152b(i8);
                        rv8 rv8Var = (rv8) d84Var2.m10152b(i8);
                        C0423c c0423c = rv8Var != null ? rv8Var.f59881a : null;
                        if (c0423c == null) {
                            throw AbstractC3393o1.m17745t("no value for specified key");
                        }
                        j2 = j5;
                        int i9 = c0423c.f4976f;
                        kv8 kv8Var = c0423c.f4974d;
                        n66 n66Var = kv8Var.f48471a;
                        if (qv8Var2 == null) {
                            Object[] objArr2 = n66Var.f52400b;
                            long[] jArr6 = n66Var.f52399a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i10 = i5;
                                int i11 = 0;
                                while (true) {
                                    long j6 = jArr6[i11];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                C0427g c0427g = (C0427g) objArr2[(i11 << 3) + i13];
                                                C0427g c0427g2 = AbstractC0424d.f4979C;
                                                if (fa4.m11650l(c0427g, c0427g2)) {
                                                    List list = (List) AbstractC0422b.m1838a(kv8Var, c0427g2);
                                                    String strValueOf = String.valueOf(list != null ? (C3419on) u91.m22591I0(list) : null);
                                                    rk1 rk1Var = this.f3832c;
                                                    if (rk1Var != null) {
                                                        AutofillId autofillIdM20676a = rk1Var.m20676a(i9);
                                                        if (autofillIdM20676a == null) {
                                                            throw AbstractC3393o1.m17745t("Invalid content capture ID");
                                                        }
                                                        s8d.m21160f(rk1Var.f59422a, autofillIdM20676a, strValueOf);
                                                    }
                                                }
                                                j6 = j3 >> i10;
                                                i13++;
                                                i7 = i7;
                                                jArr6 = jArr6;
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i10;
                                            i13++;
                                            i7 = i7;
                                            jArr6 = jArr6;
                                        }
                                        jArr4 = jArr6;
                                        i = i7;
                                        if (i12 != i10) {
                                            break;
                                        }
                                    } else {
                                        jArr4 = jArr6;
                                        i = i7;
                                    }
                                    if (i11 == length2) {
                                        break;
                                    }
                                    i11++;
                                    j4 = j;
                                    i7 = i;
                                    jArr6 = jArr4;
                                    i10 = 8;
                                }
                            } else {
                                j = j4;
                                i = i7;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j4;
                            i = i7;
                            Object[] objArr3 = n66Var.f52400b;
                            long[] jArr7 = n66Var.f52399a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j7 = jArr7[i14];
                                    Object[] objArr4 = objArr3;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        int i16 = 0;
                                        while (i16 < i15) {
                                            if ((j7 & 255) < 128) {
                                                i3 = i16;
                                                C0427g c0427g3 = (C0427g) objArr4[(i14 << 3) + i16];
                                                jArr3 = jArr5;
                                                C0427g c0427g4 = AbstractC0424d.f4979C;
                                                if (fa4.m11650l(c0427g3, c0427g4)) {
                                                    List list2 = (List) AbstractC0422b.m1838a(qv8Var2.f58253a, c0427g4);
                                                    C3419on c3419on = list2 != null ? (C3419on) u91.m22591I0(list2) : null;
                                                    List list3 = (List) AbstractC0422b.m1838a(kv8Var, c0427g4);
                                                    C3419on c3419on2 = list3 != null ? (C3419on) u91.m22591I0(list3) : null;
                                                    if (!fa4.m11650l(c3419on, c3419on2)) {
                                                        String strValueOf2 = String.valueOf(c3419on2);
                                                        rk1 rk1Var2 = this.f3832c;
                                                        if (rk1Var2 != null) {
                                                            AutofillId autofillIdM20676a2 = rk1Var2.m20676a(i9);
                                                            if (autofillIdM20676a2 == null) {
                                                                throw AbstractC3393o1.m17745t("Invalid content capture ID");
                                                            }
                                                            s8d.m21160f(rk1Var2.f59422a, autofillIdM20676a2, strValueOf2);
                                                        }
                                                    }
                                                }
                                                j7 >>= 8;
                                                i16 = i3 + 1;
                                                jArr5 = jArr3;
                                                qv8Var2 = qv8Var2;
                                                objArr4 = objArr4;
                                            } else {
                                                i3 = i16;
                                                jArr3 = jArr5;
                                            }
                                            j7 >>= 8;
                                            i16 = i3 + 1;
                                            jArr5 = jArr3;
                                            qv8Var2 = qv8Var2;
                                            objArr4 = objArr4;
                                        }
                                        jArr2 = jArr5;
                                        objArr = objArr4;
                                        qv8Var = qv8Var2;
                                        if (i15 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr5;
                                        objArr = objArr4;
                                        qv8Var = qv8Var2;
                                    }
                                    if (i14 == length3) {
                                        break;
                                    }
                                    i14++;
                                    jArr7 = jArr8;
                                    jArr5 = jArr2;
                                    qv8Var2 = qv8Var;
                                    objArr3 = objArr;
                                }
                            }
                            i2 = 8;
                        }
                        jArr2 = jArr5;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i7;
                        i2 = i5;
                    }
                    j4 = j >> i2;
                    i7 = i + 1;
                    i5 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    d84Var2 = d84Var;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            d84Var2 = d84Var;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: e */
    public final void mo1326e(ub5 ub5Var) {
        m1337p(this.f3830a.getSemanticsOwner().m21750a());
        m1330i();
        this.f3832c = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m1327f(C0423c c0423c, zi3 zi3Var) {
        c0423c.getClass();
        List listM1839j = C0423c.m1839j(4, c0423c);
        int size = listM1839j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM1839j.get(i2);
            if (m1328g().m10151a(((C0423c) obj).f4976f)) {
                zi3Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final d84 m1328g() {
        if (this.f3836g) {
            this.f3836g = false;
            this.f3838i = xwc.m24784v(this.f3830a.getSemanticsOwner(), AndroidContentCaptureManager$currentSemanticsNodes$1.f3822b);
            this.f3839j = System.currentTimeMillis();
        }
        return this.f3838i;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1329h() {
        return this.f3832c != null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1330i() {
        rk1 rk1Var = this.f3832c;
        if (rk1Var == null) {
            return;
        }
        ContentCaptureSession contentCaptureSession = rk1Var.f59422a;
        ArrayList arrayList = this.f3833d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0292d c0292d = (C0292d) arrayList.get(i);
            int i2 = AbstractC0290b.f3827a[c0292d.m1341c().ordinal()];
            if (i2 == 1) {
                jh9 jh9VarM1340b = c0292d.m1340b();
                if (jh9VarM1340b != null) {
                    s8d.m21158d(contentCaptureSession, jh9VarM1340b.m14475j());
                }
            } else if (i2 != 2) {
                gm5.m12750e();
                return;
            } else {
                AutofillId autofillIdM20676a = rk1Var.m20676a(c0292d.m1339a());
                if (autofillIdM20676a != null) {
                    s8d.m21159e(contentCaptureSession, autofillIdM20676a);
                }
            }
        }
        s8d.m21161g(contentCaptureSession, rk1Var.f59423b.getAutofillId(), new long[]{Long.MIN_VALUE});
        arrayList.clear();
    }

    /* JADX INFO: renamed from: j */
    public final void m1331j() {
        C3024g3 c3024g3;
        ui3 ui3Var;
        this.f3835f = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        d84 d84VarM1328g = m1328g();
        Object[] objArr = d84VarM1328g.f35145c;
        long[] jArr = d84VarM1328g.f35143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        kv8 kv8Var = ((rv8) objArr[(i << 3) + i3]).f59881a.f4974d;
                        if (AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4981E) != null && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4958n)) != null && (ui3Var = (ui3) c3024g3.f40091b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1332k() {
        C3024g3 c3024g3;
        vi3 vi3Var;
        this.f3835f = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        d84 d84VarM1328g = m1328g();
        Object[] objArr = d84VarM1328g.f35145c;
        long[] jArr = d84VarM1328g.f35143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        kv8 kv8Var = ((rv8) objArr[(i << 3) + i3]).f59881a.f4974d;
                        if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4981E), Boolean.TRUE) && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4957m)) != null && (vi3Var = (vi3) c3024g3.f40091b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1333l() {
        C3024g3 c3024g3;
        vi3 vi3Var;
        this.f3835f = AndroidContentCaptureManager$TranslateStatus.SHOW_TRANSLATED;
        d84 d84VarM1328g = m1328g();
        Object[] objArr = d84VarM1328g.f35145c;
        long[] jArr = d84VarM1328g.f35143a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        kv8 kv8Var = ((rv8) objArr[(i << 3) + i3]).f59881a.f4974d;
                        if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4981E), Boolean.FALSE) && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4957m)) != null && (vi3Var = (vi3) c3024g3.f40091b) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1334m(C0423c c0423c, final qv8 qv8Var) {
        m1327f(c0423c, new zi3() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Number) obj).intValue();
                C0423c c0423c2 = (C0423c) obj2;
                boolean zM22476c = qv8Var.f58254b.m22476c(c0423c2.f4976f);
                xfa xfaVar = xfa.f68157a;
                if (!zM22476c) {
                    ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this;
                    viewOnAttachStateChangeListenerC0291c.m1336o(iIntValue, c0423c2);
                    viewOnAttachStateChangeListenerC0291c.f3837h.mo4677k(xfaVar);
                }
                return xfaVar;
            }
        });
        List listM1839j = C0423c.m1839j(4, c0423c);
        int size = listM1839j.size();
        for (int i = 0; i < size; i++) {
            C0423c c0423c2 = (C0423c) listM1839j.get(i);
            d84 d84VarM1328g = m1328g();
            int i2 = c0423c2.f4976f;
            if (d84VarM1328g.m10151a(i2)) {
                t56 t56Var = this.f3840k;
                if (t56Var.m10151a(i2)) {
                    Object objM10152b = t56Var.m10152b(i2);
                    if (objM10152b == null) {
                        throw AbstractC3393o1.m17745t("node not present in pruned tree before this change");
                    }
                    m1334m(c0423c2, (qv8) objM10152b);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: n */
    public final void mo1335n(ub5 ub5Var) {
        this.f3832c = (rk1) this.f3831b.mo0a();
        m1336o(-1, this.f3830a.getSemanticsOwner().m21750a());
        m1330i();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX INFO: renamed from: o */
    public final void m1336o(int i, C0423c c0423c) {
        C3024g3 c3024g3;
        vi3 vi3Var;
        e28 e28VarM1840a;
        jh9 jh9Var;
        String strM24763e0;
        vi3 vi3Var2;
        if (m1329h()) {
            kv8 kv8Var = c0423c.f4974d;
            Boolean bool = (Boolean) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4981E);
            if (this.f3835f == AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL && fa4.m11650l(bool, Boolean.TRUE)) {
                C3024g3 c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4957m);
                if (c3024g4 != null && (vi3Var2 = (vi3) c3024g4.f40091b) != null) {
                }
            } else if (this.f3835f == AndroidContentCaptureManager$TranslateStatus.SHOW_TRANSLATED && fa4.m11650l(bool, Boolean.FALSE) && (c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4957m)) != null && (vi3Var = (vi3) c3024g3.f40091b) != null) {
            }
            int i2 = c0423c.f4976f;
            rk1 rk1Var = this.f3832c;
            if (rk1Var == null) {
                jh9Var = null;
            } else {
                AutofillId autofillId = this.f3830a.getAutofillId();
                C0423c c0423cM1850l = c0423c.m1850l();
                int i3 = c0423c.f4976f;
                if (c0423cM1850l == null || (autofillId = rk1Var.m20676a(c0423cM1850l.f4976f)) != null) {
                    jh9 jh9VarM14461k = jh9.m14461k(s8d.m21157c(rk1Var.f59422a, autofillId, i3));
                    kv8 kv8Var2 = c0423c.f4974d;
                    if (kv8Var2.f48471a.m17251c(AbstractC0424d.f4988L)) {
                        jh9Var = null;
                    } else {
                        Bundle bundleM14468a = jh9VarM14461k.m14468a();
                        if (bundleM14468a != null) {
                            bundleM14468a.putLong("android.view.contentcapture.EventTimestamp", this.f3839j);
                            bundleM14468a.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        String str = (String) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f4977A);
                        if (str != null) {
                            jh9VarM14461k.m14472g(i3, str);
                        }
                        if (((Boolean) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f5007n)) != null) {
                            jh9VarM14461k.m14469b("android.widget.ViewGroup");
                        }
                        List list = (List) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f4979C);
                        if (list != null) {
                            jh9VarM14461k.m14469b("android.widget.TextView");
                            jh9VarM14461k.m14473h(hg5.m13229a(list, "\n", null, 62));
                        }
                        C3419on c3419on = (C3419on) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f4983G);
                        if (c3419on != null) {
                            jh9VarM14461k.m14469b("android.widget.EditText");
                            jh9VarM14461k.m14473h(c3419on);
                        }
                        List list2 = (List) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f4994a);
                        if (list2 != null) {
                            jh9VarM14461k.m14470d(hg5.m13229a(list2, "\n", null, 62));
                        }
                        uh8 uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var2, AbstractC0424d.f5019z);
                        if (uh8Var != null && (strM24763e0 = xwc.m24763e0(uh8Var.f63934a)) != null) {
                            jh9VarM14461k.m14469b(strM24763e0);
                        }
                        rw9 rw9VarM24732E = xwc.m24732E(kv8Var2);
                        if (rw9VarM24732E != null) {
                            qw9 qw9Var = rw9VarM24732E.f59975a;
                            vx9 vx9Var = qw9Var.f58296b;
                            fb2 fb2Var = qw9Var.f58301g;
                            jh9VarM14461k.m14474i(fb2Var.mo597d0() * fb2Var.mo594a() * zx9.m25848c(vx9Var.f66065a.f42265b));
                        }
                        AbstractC0362l abstractC0362lM1843d = c0423c.m1843d();
                        if (abstractC0362lM1843d == null) {
                            e28VarM1840a = e28.f36619e;
                        } else {
                            AbstractC0362l abstractC0362l = abstractC0362lM1843d.mo1543f1().f34836I ? abstractC0362lM1843d : null;
                            if (abstractC0362l != null) {
                                e28VarM1840a = c0423c.m1840a(abstractC0362l);
                            } else {
                                e28VarM1840a = e28.f36619e;
                            }
                        }
                        float f = e28VarM1840a.f36620a;
                        float f2 = e28VarM1840a.f36621b;
                        jh9VarM14461k.m14471e((int) f, (int) f2, (int) (e28VarM1840a.f36622c - f), (int) (e28VarM1840a.f36623d - f2));
                        jh9Var = jh9VarM14461k;
                    }
                } else {
                    jh9Var = null;
                }
            }
            if (jh9Var != null) {
                this.f3833d.add(new C0292d(i2, this.f3839j, ContentCaptureEventType.VIEW_APPEAR, jh9Var));
            }
            m1327f(c0423c, new zi3() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    this.f3825b.m1336o(((Number) obj).intValue(), (C0423c) obj2);
                    return xfa.f68157a;
                }
            });
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f3830a.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f3829I);
        this.f3832c = null;
    }

    /* JADX INFO: renamed from: p */
    public final void m1337p(C0423c c0423c) {
        if (m1329h()) {
            this.f3833d.add(new C0292d(c0423c.f4976f, this.f3839j, ContentCaptureEventType.VIEW_DISAPPEAR, null));
            List listM1839j = C0423c.m1839j(4, c0423c);
            int size = listM1839j.size();
            for (int i = 0; i < size; i++) {
                m1337p((C0423c) listM1839j.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public final void m1338s() {
        t56 t56Var = this.f3840k;
        t56Var.m21844c();
        d84 d84VarM1328g = m1328g();
        int[] iArr = d84VarM1328g.f35144b;
        Object[] objArr = d84VarM1328g.f35145c;
        long[] jArr = d84VarM1328g.f35143a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            t56Var.m21850i(iArr[i4], new qv8(((rv8) objArr[i4]).f59881a, m1328g()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f3841l = new qv8(this.f3830a.getSemanticsOwner().m21750a(), m1328g());
    }
}
